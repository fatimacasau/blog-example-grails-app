<%--
  Created by IntelliJ IDEA.
  User: fcasau
  Date: 1/22/14
  Time: 6:11 PM
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
  <title><g:message code="post.index.title"/></title>
  <meta name="layout" content="main">
  <r:require modules="posts,comments"/>
</head>
<body>
<div id="page-body" role="main">

    <g:if test="${lastPost}">
        <g:render template="detail" model="[post:lastPost]"/>
        <div id="listComments">
            <g:render template="/comment/list" model="[comments:lastPost.comments]"/>
        </div>
        <g:render template="/comment/form" model="[post:lastPost]"/>

    </g:if>
</div>
</body>
</html>