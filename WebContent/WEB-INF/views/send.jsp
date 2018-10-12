<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Spring MVC</title>
</head>
<body>
	<button type="button" onclick="send();">AJAX(POST)</button>
	<script>
	/*
		AJAX get은 주소뒤에 ?키=값&키=값 이렇게 해서 보내고, parameter로만 뽑힌다.
		
		AJAX post는 JSON문자를 보내서 requestBody뽑아서 처리하는 방식과
		
		?키=값&키=값 형태의 문자열을 보내면서, header 설정해주고 parameter로 처리
		
		
	*/
		var send = function(){
			var xhr = new XMLHttpRequest();
			xhr.open("post","${pageContext.servletContext.contextPath}/study/13ajax.do");
			var param = {
				"talker" : "tjdgns0814",
				"mode" : 1,
				"ment" : "ajax의 POST요청은 send시 문자열 데이터를 설정해서 전송"
			};
		
			xhr.send(JSON.stringify(param));
		}	
		
/* 	var send2 = function() {
			var xhr = new XMLHttpRequest();
			xhr.open("post", "${pageContext.servletContext.contextPath}/study/13ajax.do", true);
			var param = "talker=saan";
			param += "&mode=1";
			param += "&ment=ajax의 Post요청은 send시 문자열을 데이터를 설정해서 전송";
			xhr.setRequestHeader("content-type","application/x-www-form-urlencoded");
			xhr.send(JSON.stringify(param));
		} */
	
	
	</script>
	

</body>
</html>