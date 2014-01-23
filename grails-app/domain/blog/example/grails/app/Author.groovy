package blog.example.grails.app

class Author {

    String name
    String surname
    String username
    String email

    static hastMany = [post:Post]
    static belongsTo = [Post]

    static constraints = {
        username blank:false, unique:true
        email blank:false, email: true
    }
}
