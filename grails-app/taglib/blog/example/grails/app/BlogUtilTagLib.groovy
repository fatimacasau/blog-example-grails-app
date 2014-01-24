package blog.example.grails.app

class BlogUtilTagLib {

    static defaultEncodeAs = 'html'
    static namespace = "bg"

    def msgs = {attrs ->
        def cssClass = (attrs.messages.type=='ok') ? 'message' : 'error'
        attrs.messages.messages.each{
            out << "<p class=\"$cssClass\">" << it << "</p>"
        }
    }

}
