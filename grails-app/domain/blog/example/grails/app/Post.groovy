package blog.example.grails.app

class Post {

    String title
    String body
    Date dateCreated // autotimestamp
    Date lastUpdated // autotimestamp
    /**
     * If you have nullable:false constraints on either dateCreated or lastUpdated,
     * your domain instances will fail validation - probably not what you want.
     * Omit constraints from these properties unless you disable automatic timestamping.
     */

    Boolean published

    static hasMany = [authors:Author, comments:Comment]

    static constraints = {
        // By default, all attributes have constraint nullable:false
        dateCreated nullable: true
        lastUpdated nullable: true
        title maxSize: 150, unique:true, blank: false
        body maxSize: 3000, blank: false
        authors minSize: 1
        // validator: { val,obj -> // val: the value of the property. obj: the object to validate }
    }

    static mapping = {
        body type: 'text'
        // table name: 'blog_post'
        // body column: 'blog_body'
    }

    static namedQueries = {
        lastPostPublished {
            eq 'published', true
            order 'lastUpdated'
            maxResults(1)
        }
    }

   /* Events:
    *
    * Do not attempt to flush the session within an event (such as with obj.save(flush:true)).
    * Since events are fired during flushing this will cause a StackOverflowError.
    *
    */

    def beforeValidate(){
        this.published =  this.published ?: false
    }

//    def beforeInsert(){}
//
//    def beforeUpdate(){}
//
//    def beforeDelete(){}
//
//    def afterInsert(){}
//
//    def afterUpdate(){}
//
//    def afterDelete(){}
//
//    def onLoad(){}

}
