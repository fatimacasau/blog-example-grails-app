package blog.example.grails.app

class Post {

    String title
    String body
    Date dateCreated // autotimestamp
    Date dateUpdated // autotimestamp
    /**
     * If you have nullable:false constraints on either dateCreated or lastUpdated,
     * your domain instances will fail validation - probably not what you want.
     * Omit constraints from these properties unless you disable automatic timestamping.
     */

    Boolean published

    static constraints = {
        // By default, all attributes
    }
}
