package blog.example.grails.app

import grails.transaction.Transactional

class NotificationService {

    def mailService

    def commentNotification(Post post) {
        def authorsMail = post.authors*.email.join(',')
        def authorsComments = post.comments*.email.join(',')
        mailService.sendMail {
            to authorsMail
            cc authorsComments
            subject "Nuevo comentario"
            body "Se ha añadido un nuevo comentario"
        }
    }
}
