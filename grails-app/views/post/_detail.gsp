<div class=post-detail>
    <div>
        <strong>${post.title}</strong>
    </div>
    <div>
        <p>${post.body}</p>
    </div>
    <div>
        <i>Published at <g:formatDate format="dd/MM/yyyy" date="${post.lastUpdated}"/> by ${post.authors.join(",")} </i>
    </div>
</div>
