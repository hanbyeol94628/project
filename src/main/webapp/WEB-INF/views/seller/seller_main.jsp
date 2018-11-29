<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>판매자 메인 화면</title>
</head>
<body>
	
	
	<h3> 판매자 메인 화면	</h3>
	<h4>${seller.sellerCompany} 님</h4>
		
	<ul>
		<li><a href="product/add">상품 등록하기</a></li>
		<li><a href="product/list">상품 목록</a></li>
	</ul>
	
	<ul>
		<li><a href="manager/order">주문 확인</a></li>
		<li><a href="manager/qna">상품 문의</a></li>
	</ul>
	
	
</body>
</html>