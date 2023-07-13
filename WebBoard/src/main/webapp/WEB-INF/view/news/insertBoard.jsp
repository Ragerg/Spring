<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>글쓰기</title>
</head>
<body>
	<section class="section">
        <div class="container">
          <h1 class="my-3 text-primary">문의하기</h1>
          <form action="insertBoard" method="post">
            <div class="form-group">
              <div class="mb-3">
                <label for="title">제목</label>
                <input type="text" class="form-control " id="title" name="title" required="">
<!--                 <div class="invalid-feedback"> -->
<!--                   제목을 입력해주세요. -->
<!--                 </div> -->
              </div>
              <div class="form-group">
                <label for="content">내용</label>
                <textArea class="form-control" id="content" name="content" rows="10"></textArea>
              </div>
            </div>
            <input type="submit" value="등록하기" class="btn btn-primary mt-3"><br>
            <a href="boardList">
            <input type="button" value="목록으로" class="btn btn-secondary mt-3" />
            </a>
        </form>
        </div>
      </section>
</body>
</html>