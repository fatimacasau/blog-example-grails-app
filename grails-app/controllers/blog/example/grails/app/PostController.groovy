package blog.example.grails.app

class PostController {

    def index() {
        //def lastPost = Post.last('lastUpdated')
        Post lastPost = Post.lastPostPublished().get()
        [lastPost:lastPost]
    }

    def show(){
        def post = Post.get(params.id)
        [post:post]
    }

    def end(){

    }
}
