<div>
    <g:each in="${comments}" var="comment">
        <span>Comment at <g:formatDate format="dd/MM/yyyy" date="${comment.dateCreated}"/></span>
        <span>${comment.body}</span>
    </g:each>
</div>