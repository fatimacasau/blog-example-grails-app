modules = {
    application {
        dependsOn "jquery"
        resource url:'js/application.js'
    }

    posts {
        resource url:'css/post/index.css'
    }

    comments {
        resource url:'css/comment/list.css'
    }
}