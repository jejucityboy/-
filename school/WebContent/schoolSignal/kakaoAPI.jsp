<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>**KAKAO Maps**</title>
    
</head>
<body>
<div id="map" style="width:900px;height:600px;"></div>
<p><em>지도를 확대 또는 축소 해주세요!</em></p> 
<p id="result"></p>
    
<script type="text/javascript" src="//dapi.kakao.com/v2/maps/sdk.js?appkey=08ac5f210c21cf38bc0484639366ce74"></script>
<script>
	var mapContainer = document.getElementById('map'), 
	    mapOption = { 
	        center: new kakao.maps.LatLng(35.716925, 127.858706), 
	        level: 13
	    };
	
	var map = new kakao.maps.Map(mapContainer, mapOption); 
	
	
	var zoomControl = new kakao.maps.ZoomControl();
	map.addControl(zoomControl, kakao.maps.ControlPosition.RIGHT);
	
	
	kakao.maps.event.addListener(map, 'zoom_changed', function() {        
	    
    
    var level = map.getLevel();
    
    var message = '현재 지도 레벨은 ' + level + ' 입니다';
    var resultDiv = document.getElementById('result');  
    resultDiv.innerHTML = message;
    
});
</script>
</body>
</html>