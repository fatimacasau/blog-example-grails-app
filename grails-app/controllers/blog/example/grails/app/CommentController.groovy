package blog.example.grails.app

import grails.validation.Validateable

class CommentController {

    def list(){
        def post = Post.get(params.postId)
        [comments:Comment.findByPost(post)]
    }

    def save(CommentCommand cmd){
        if(cmd.hasErrors()){
            flash.error = cmd.errors
            if(cmd.post?.id)
                redirect controller: 'post', action:'show', params:[id:cmd?.post?.id]
            else redirect controller: 'post', action: 'lastPost'
        }else{
            def post = Post.get(cmd.post.id)
            post.addToComments(new Comment(cmd.properties['body','email'])).save()
            render template: 'list', model:[comments:post.comments]
        }
    }
}

@Validateable
class CommentCommand{
    String body
    String email
    Post post

    static constrains = {
        body maxSize: 1000, blank:false
        email email:true, blank:false
    }
}
