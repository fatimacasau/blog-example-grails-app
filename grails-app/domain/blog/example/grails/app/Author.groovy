package blog.example.grails.app

class Author {

    String name
    String surname
    String username
    String email

    static hasMany = [post:Post]
    static belongsTo = [Post]

    static constraints = {
        username blank:false, unique:true
        email blank:false, email: true
    }

    String toString(){
        username
    }
}
