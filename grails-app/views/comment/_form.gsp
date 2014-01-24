<g:formRemote name="newComment" url="[controller:'comment',action:'save']" update="listComments">
    <g:hiddenField name="post.id" value="${post.id}"/>
    <label for="email">Email</label>
    <g:textField name="email" required=""/>
    <label for="body">Body</label>
    <g:textArea name="body" maxlength="1000" required=""/>
    <g:submitButton name="saveComment" value="save"/>
</g:formRemote>