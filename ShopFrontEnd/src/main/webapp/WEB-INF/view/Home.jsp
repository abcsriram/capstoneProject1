<%@include file="header.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sortez exclusive shopping</title>
</head>
<body>
<div class="top">
<div id="myCarousel" class="carousel slide" data-ride="carousel">
    <!-- Indicators -->
    <ol class="carousel-indicators">
      <li data-target="#myCarousel" style="color:black" data-slide-to="0" class="active"></li>
      <li data-target="#myCarousel" data-slide-to="1"></li>
      <li data-target="#myCarousel" data-slide-to="2"></li>
      <li data-target="#myCarousel" data-slide-to="3"></li>
    </ol>

    <!-- Wrapper for slides -->
    <div class="carousel-inner">
	
      <div class="item active">
        <img src="resources/images/img9.jpg" alt="img to come" style="width:100%;">
      </div>
		
	  <div class="item">
        <img src="resources/images/img15.jpg" alt="img to come" style="width:100%;">
      </div>
      
      <div class="item">
        <img src="resources/images/img3.jpg" alt="img to come" style="width:100%;">
      </div>
      
      <div class="item">
        <img src="resources/images/img2.jpg" alt="img to come" style="width:100%;">
      </div>
      </div>
    

    <!-- Left and right controls -->
    <a class="left carousel-control" href="#myCarousel" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right"></span>
      <span class="sr-only">Next</span>
    </a>
  </div>
</div>
</body>
</html>
<%@include file="Footer.jsp"%>