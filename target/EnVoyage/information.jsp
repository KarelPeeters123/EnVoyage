<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>En voyage</title>
        <link rel="stylesheet" href="https://about.borlyt-salnus.lu/EnVoyage/src/main/webapp/css/reset.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://about.borlyt-salnus.lu/EnVoyage/src/main/webapp/css/style.css">
    </head>

    <body class="row">
        <div class="col-sm-12">
            <jsp:include page="header.jsp"/>
	        <jsp:include page="navbar.jsp"/>
            <br>
            <br>
            <h2>${map['info title']}</h2>
            <div class="row">
                <article class="col-sm-6" id="contact">
                    <h3>${map['info sub1']}</h3>
                    <p>
                        ${map['info paragraph1']}
                    </p>
                    <br>
                    <br>
                    <br>
                    <br>
                    <h3>${map['info sub2']}</h3>
                    <p>
                        ${map['info paragraph2']}
                    </p>
                </article>
                <br>
                <div class="">
                    <img class="img-rounded img-responsive Fotos-Information" src="https://about.borlyt-salnus.lu/EnVoyage/src/main/webapp/img/IMG_4498.jpg" width="400px" alt="">
                    <img class="img-rounded img-responsive Fotos-Information" src="https://about.borlyt-salnus.lu/EnVoyage/src/main/webapp/img/IMG_4545.jpg" width="400px" alt="">
                </div>
            </div>
        </div>
    </body>
</html>