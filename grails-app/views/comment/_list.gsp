    <g:each in="${comments}" var="comment">
        <div>
            <span>Comment at <g:formatDate format="dd/MM/yyyy" date="${comment.dateCreated}"/></span>
            <span>${comment.body}</span>
        </div>
    </g:each>