<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>   
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>수정하기</title>
</head>
<body>
	<section class="section">
        <div class="container">
          <h1 class="my-3 text-primary">문의하기</h1>
          <form action="updateBoard" method="post">
            <div class="form-group">
              <div class="mb-3">
              <input type="hidden" name="b_no" value="${ board.b_no }" readonly>
                <label for="title">제목</label>
                <input type="text" class="form-control " id="title" name="title" required=""
                	value="${ board.title }">
<!--                 <div class="invalid-feedback"> -->
<!--                   제목을 입력해주세요. -->
<!--                 </div> -->
              </div>
              <div class="form-group">
                <label for="content">내용</label>
                <textArea class="form-control" id="content" name="content" rows="10" >${ board.content }</textArea>
              </div>
            </div>
            <input type="submit" value="수정하기" class="btn btn-primary mt-3">
             <a href="boardList">
            <input type="button" value="목록으로" class="btn btn-secondary mt-3" />
            </a>
        </form>
        </div>
      </section>
</body>
</html>