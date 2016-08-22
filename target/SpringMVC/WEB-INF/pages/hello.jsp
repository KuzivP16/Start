<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page import="start.HelloController" %>
<%@ page contentType="text/html; UTF-8" pageEncoding="UTF-8" language="java" %>

<html>
<head>

	<style>#mymap {
        border: 10px solid #7CFC00;
        position: absolute;
		top: 150px;
		left: 50px;
		width: 60%;
		height: 60%; }</style>
	<script src = "https://maps.google.com/maps/api/js?sensor=false"></script>
	<script>

		function init() {
			var mapDiv = document.getElementById("mymap");
			var mapOptions = {
				center: new google.maps.LatLng(29638956/600000 , 19989630/600000),
				zoom: 15,
				mapTypeId: google.maps.MapTypeId.ROADMAP
			};
			var map = new google.maps.Map(mapDiv, mapOptions);
			var destinacions = [];
			<% HelloController p = new HelloController() ;
			int[] mas1 = p.o_x();
			int[] mas2 = p.o_y();
			%>
			<%for (int i=0;i<99900;i++ ){
			if(mas1[i]!=0 && mas2[i]!=0){%>
			destinacions.push(new google.maps.LatLng(<%=(float)mas1[i]/600000.0%>,<%=(float)mas2[i]/600000.0%>));
			<%}}%>
			destinacions.push(new google.maps.LatLng(29638992/600000 , 19989684/600000));
			var polylineOptions = {path: destinacions,
				strokeColor:"#ff0000",strokeWeight:1};
			var polyline = new google.maps.Polyline(polylineOptions);
			polyline.setMap(map);
            pp = polyline.disabled();
			pp=44;
			var destinacions1 = new google.maps.MVCArray();
			destinacions1.push(new google.maps.LatLng(30265006/600000 , 18220052/600000));
			destinacions1.push(new google.maps.LatLng(30265508/600000 , 18220972/600000));
			destinacions1.push(new google.maps.LatLng(30265911/600000 , 18220062/600000));
			var polygonOptions = {path: destinacions1,
				strokeColor:"#ff8888"};
			var polygon = new google.maps.Polygon( polygonOptions);
			polygon.setMap(map);
		}
		window.onload = init;
	</script>
</head>
<body>

<style>
	body {
		background: #333;
		color: #fc0;
	}
</style>
<h1> ${user} ID   <%=p.idGPS()%></h1>
<h2>Період <%=(String)p.st()%></h2>
<div id="mymap"></div>
<div id="info"></div>
<div
		xmlns:jsp="http://java.sun.com/JSP/Page"
		xmlns:spring="http://www.springframework.org/tags"
		xmlns:c="http://java.sun.com/jsp/jstl/core"
		version="2.0"
>

</body>

</html>