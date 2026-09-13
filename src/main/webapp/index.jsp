<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Meme Generator</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css">
</head>
<body>
<div class="container">
    <h1>😂 Meme Generator</h1>
    <p>Create a simple meme using Tomcat + Java Servlet + Maven.</p>

    <form action="${pageContext.request.contextPath}/generate" method="get">
        <label for="top">Top Text</label>
        <input id="top" name="top" type="text" placeholder="When Jenkins build passes..." required>

        <label for="bottom">Bottom Text</label>
        <input id="bottom" name="bottom" type="text" placeholder="Deploy to Tomcat!" required>

        <button type="submit">Generate Meme</button>
    </form>

    <div class="info">
        <strong>DevOps flow:</strong> GitHub → Jenkins → Maven → WAR → Tomcat
    </div>
</div>
</body>
</html>
