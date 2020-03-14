<%@page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>En voyage</title>
        <link rel="stylesheet" type="text/css" href="css/reset.css" media="screen, print">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <link rel="stylesheet" type="text/css" href="css/style.css">
    </head>

    <body class="row">
        <div class="col-sm-12">
            <jsp:include page="header.jsp"/>

	        <jsp:include page="navbar.jsp"/>

            <jsp:include page="slideshow.jsp"/>

            <article class="row">
                <h2 id="quote">With "En Voyage" you will find out whether the world is still there!</h2>
            </article>

            <article class="row nl text-body">
                <p class="col-sm-8 col-sm-offset-2">
	                <c:out value="${map['home paragraph']}"/>
                </p>
            </article>
        </div>
    </body>
</html>
