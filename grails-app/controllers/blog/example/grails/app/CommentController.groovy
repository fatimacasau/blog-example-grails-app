package blog.example.grails.app

import grails.validation.Validateable

class CommentController {

    def notificationService

    def list(){
        def post = Post.get(params.postId)
        [comments:Comment.findByPost(post)]
    }

    def save(CommentCommand cmd){
        def post = cmd?.post?.id ? Post.get(cmd.post.id) : null
        if(cmd.hasErrors()){
            flash.message = [type:'errors', messages:cmd.errors.allErrors*.defaultMessage]
        }else{
            if (post){
                post.addToComments(new Comment(cmd.properties['body','email'])).save(flush:true)
                flash.message = [type:'message', messages: [message(code:'post.add.comment.success')]]
                notificationService.commentNotification(post)
            }
        }
        render template: 'list', model:[comments:post?.comments?:[]]
    }
}

//@Validateable
class CommentCommand{
    String body
    String email
    Post post

    static constraints = {
        body maxSize: 1000, blank:false
        email email:true, blank:false
    }
}
