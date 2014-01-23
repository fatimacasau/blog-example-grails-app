<%@ page import="blog.example.grails.app.Post" %>



<div class="fieldcontain ${hasErrors(bean: postInstance, field: 'title', 'error')} required">
	<label for="title">
		<g:message code="post.title.label" default="Title" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="title" maxlength="150" required="" value="${postInstance?.title}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: postInstance, field: 'body', 'error')} required">
	<label for="body">
		<g:message code="post.body.label" default="Body" />
		<span class="required-indicator">*</span>
	</label>
	<g:textArea name="body" cols="40" rows="5" maxlength="3000" required="" value="${postInstance?.body}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: postInstance, field: 'published', 'error')} ">
	<label for="published">
		<g:message code="post.published.label" default="Published" />
		
	</label>
	<g:checkBox name="published" value="${postInstance?.published}" />
</div>

