<%@page isELIgnored="false"%>
<article class="main row" id="content">
	<div id="slideShow row">
		<div class="col-sm-1 col-sm-offset-2" style="margin-top: 125px;"><button class="display-left btn" id="left-button" onclick="plusDivs(-1)">&#10094;</button></div>

		<div class="col-sm-6" style="justify-content: center">
			<img class="mySlides img-rounded img-responsive" src="https://about.borlyt-salnus.lu/EnVoyage/src/main/webapp/img/IMG_4460.jpg" style="width:80%">
			<img class="mySlides img-rounded img-responsive" src="https://about.borlyt-salnus.lu/EnVoyage/src/main/webapp/img/IMG_4461.jpg" style="width:80%">
			<img class="mySlides img-rounded img-responsive" src="https://about.borlyt-salnus.lu/EnVoyage/src/main/webapp/img/IMG_4466.jpg" style="width:80%">
			<img class="mySlides img-rounded img-responsive" src="https://about.borlyt-salnus.lu/EnVoyage/src/main/webapp/img/IMG_4494.jpg" style="width:80%">
			<img class="mySlides img-rounded img-responsive" src="https://about.borlyt-salnus.lu/EnVoyage/src/main/webapp/img/IMG_4498.jpg" style="width:80%">
			<img class="mySlides img-rounded img-responsive" src="https://about.borlyt-salnus.lu/EnVoyage/src/main/webapp/img/IMG_4521.jpg" style="width:80%">
			<img class="mySlides img-rounded img-responsive" src="https://about.borlyt-salnus.lu/EnVoyage/src/main/webapp/img/IMG_4525.jpg" style="width:80%">
			<img class="mySlides img-rounded img-responsive" src="https://about.borlyt-salnus.lu/EnVoyage/src/main/webapp/img/IMG_4527.jpg" style="width:80%">
			<img class="mySlides img-rounded img-responsive" src="https://about.borlyt-salnus.lu/EnVoyage/src/main/webapp/img/IMG_4529.jpg" style="width:80%">
			<img class="mySlides img-rounded img-responsive" src="https://about.borlyt-salnus.lu/EnVoyage/src/main/webapp/img/IMG_4536.jpg" style="width:80%">
			<img class="mySlides img-rounded img-responsive" src="https://about.borlyt-salnus.lu/EnVoyage/src/main/webapp/img/Image 24-06-2019 at 20.32.jpg" style="width:80%">
		</div>


		<div class="col-sm-1"  style="margin-top: 125px; margin-left: 100px;"><button class="display-right btn" id="right-button" onclick="plusDivs(1)">&#10095;</button></div>


	</div>

	<script>
		var slideIndex = 1;
		showDivs(slideIndex);

		function plusDivs(n) {
			showDivs(slideIndex += n);
		}

		function showDivs(n) {
			var i;
			var x = document.getElementsByClassName("mySlides");
			if (n > x.length) {slideIndex = 1}
			if (n < 1) {slideIndex = x.length}
			for (i = 0; i < x.length; i++) {
				x[i].style.display = "none";
			}
			x[slideIndex-1].style.display = "block";
		}
	</script>
</article>
