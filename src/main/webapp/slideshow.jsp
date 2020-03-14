<%@page isELIgnored="false"%>
<article class="main row" id="content">
	<div id="slideShow">
		<div class="col-sm-1 col-sm-offset-2"><button class="display-left btn" id="left-button" onclick="plusDivs(-1)">&#10094;</button></div>

		<div class="col-sm-6">
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
			<img class="mySlides img-rounded img-responsive" src="https://about.borlyt-salnus.lu/EnVoyage/src/main/webapp/img/IMG_4676.jpg" style="width:80%">
			<img class="mySlides img-rounded img-responsive" src="https://about.borlyt-salnus.lu/EnVoyage/src/main/webapp/img/IMG_4681.jpg" style="width:80%">
			<img class="mySlides img-rounded img-responsive" src="https://about.borlyt-salnus.lu/EnVoyage/src/main/webapp/img/IMG_6416.jpg" style="width:80%">
			<img class="mySlides img-rounded img-responsive" src="https://about.borlyt-salnus.lu/EnVoyage/src/main/webapp/img/IMG_6417.jpg" style="width:80%">
			<img class="mySlides img-rounded img-responsive" src="https://about.borlyt-salnus.lu/EnVoyage/src/main/webapp/img/IMG_6418.jpg" style="width:80%">
			<img class="mySlides img-rounded img-responsive" src="https://about.borlyt-salnus.lu/EnVoyage/src/main/webapp/img/Image 24-06-2019 at 20.32.jpg" style="width:80%">
		</div>


		<div class="col-sm-1"><button class="display-right btn" id="right-button" onclick="plusDivs(1)">&#10095;</button></div>


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
