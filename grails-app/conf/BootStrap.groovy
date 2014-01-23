import blog.example.grails.app.Post

class BootStrap {

    def init = { servletContext ->

        environments{
            development{
                createPost()
            }
        }
    }


    private createPost(){
        new Post(
                title:'Post de prueba',
                body:"""
Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas id porttitor purus.
Praesent vel consequat arcu, et pulvinar lorem. Integer fringilla metus vel auctor elementum.
Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos.
In rhoncus urna vitae tincidunt feugiat. Nulla lobortis lectus quis lacinia aliquet.
Aliquam non convallis quam. Suspendisse leo sapien, gravida at erat in, auctor porttitor lectus.
Nulla facilisi. Nullam imperdiet varius sem pellentesque vestibulum.

Nullam vulputate risus et mauris tempor, at lobortis augue lobortis.
Maecenas urna lectus, luctus ut lacus eget, posuere laoreet urna.
Integer interdum porttitor lacus quis scelerisque. Nulla facilisi.
Suspendisse nec sem ac purus hendrerit laoreet.
Vestibulum scelerisque dignissim lacus, sed posuere lectus aliquet facilisis.
Praesent varius dictum lorem nec ultricies. Nullam accumsan ante ac rutrum malesuada.
Donec posuere sapien ut hendrerit volutpat. Nulla lobortis amet.
                    """,
                published: true
        ).save(failOnError: true)
    }

    def destroy = {
    }
}
