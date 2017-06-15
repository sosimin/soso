<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>회원가입 결과</title>
<script>
function init(){
	var btn = document.getElementById('btnlist');
	btn.onclick = function(){
		location.href = 'list.jsp';
	}
}
</script>
</head>
<body>
<h2>회원가입 결과</h2>
${msg }<br/><br/>
<input type='button' id='btnlist' value='>>목록으로'>
<script>init()</script>
</body>
</html>