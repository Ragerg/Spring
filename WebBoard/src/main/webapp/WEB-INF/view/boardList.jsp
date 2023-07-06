<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>   
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>공지게시판</title>
</head>
<body>
	<section class="section" id="board">
    <div class="container">
        <h1 class="my-3 text-primary">공지게시판</h1>
        <table>
        <thead class="table-dark">
            <tr>
                <th scope="col" style="width: 15%;" >글번호</th>
                <th scope="col" class="title" style="width: 55%;overflow: hidden">Title</th>
                <th scope="col" style="width: 15%;">Writer</th>
                <th scope="col" class="date" style="width: 15%;">Date</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="board" items="${boardList}">
			  <tr onclick="location.href='board?b_no=${ board.b_no }'">
			    <td>${board.b_no}</td>
			    <td>${board.title}</td>
			    <td>${board.user_id}</td>
			    <td><fmt:formatDate value="${ board.reg_date }" pattern="yyyy-MM-dd" type="date"/></td>
			  </tr>
			</c:forEach>

        </tbody>
        </table>
    </div>
    <a href="insertBoardPage">
    <input type="button" value="글쓰기" class="btn btn-primary mt-3">
    </a>
    </section>
</body>
</html>