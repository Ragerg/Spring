<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>   
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<section class="section" id = "getBoard">
    <div class="container">
    <div class="input-form col-md-12 mx-auto">
         <form class="validation-form">
            <h3 class="my-3 text-primary">${ board.title }</h3>
            <input type="hidden" name="b_no" value="${ board.b_no }" readonly>
            <input type="hidden" name="title" value="${ board.title }" readonly>
            <div class="row">
                <div class="col-md-6">
                    <input type="text" class="form-control form-control-plaintext " name="user_id" required="" value="${ board.user_id }" readonly>
                </div>
                <div class="col-md-6">
                    <input type="text" class="form-control form-control-plaintext " name="reg_date" required="" value="${ board.reg_date }" readonly>
                </div>

                <div class="col-md-12">
                <br>
                    <textArea class="form-control form-control-plaintext " id="content" name="content" rows="10" readonly>${ board.content }</textArea>
                </div>
            </div>
        </form>
                <a class="btn btn-secondary mt-3" href="boardList"><button>목록으로</button></a>                   
    </div>
    </div>
</section>
   
   

</body>
</html>