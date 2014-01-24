package blog.example.grails.app

class BlogUtilTagLib {

    static namespace = "bg"

    def msgs = {attrs ->
        def cssClass = attrs.messages.type
        attrs.messages.messages.each{
            out << "<p class=\"$cssClass\">" << it << "</p>"
        }
    }

}
