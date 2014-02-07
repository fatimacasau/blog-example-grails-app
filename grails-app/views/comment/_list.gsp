<g:if test="${flash.message}">
    <div class="${flash.message.type}">
        <g:each in="${flash.message.messages}" var="msg">
            <p>${msg}</p>
        </g:each>
    </div>
</g:if>
<g:each in="${comments}" var="comment">
    <div class="comment">
        <span>Comment at <g:formatDate format="dd/MM/yyyy" date="${comment.dateCreated}"/></span>
        <span>${comment.body}</span>
    </div>
</g:each>