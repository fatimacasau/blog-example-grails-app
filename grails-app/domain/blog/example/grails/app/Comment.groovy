package blog.example.grails.app

class Comment {

    String body
    Date dateCreated
    String email
    static belongsTo = [post:Post]

    static constraints = {
        dateCreated nullable: true
        body blank: false
        email blank: false, email: true
        body maxSize: 1000
    }
}
