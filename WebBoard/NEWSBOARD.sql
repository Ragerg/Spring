CREATE SEQUENCE b_seq
  START WITH 1
  INCREMENT BY 1
  NOCACHE
  NOCYCLE;

CREATE TABLE NEWS_BOARD (
  B_NO NUMBER DEFAULT b_seq.NEXTVAL PRIMARY KEY,
  TITLE VARCHAR2(200) NOT NULL,
  USER_ID VARCHAR2(20) NOT NULL,
  CONTENT CLOB NOT NULL,
  REG_DATE DATE DEFAULT SYSDATE,
  HIT NUMBER,
  IMAGE CLOB
);

INSERT INTO NEWS_BOARD (B_NO, TITLE, USER_ID, CONTENT, HIT, IMAGE)
VALUES (1, '���� ����', 'user1', '���� ����', 0, 'https://example.com/image1.jpg');

INSERT INTO NEWS_BOARD (B_NO, TITLE, USER_ID, CONTENT, HIT, IMAGE)
VALUES (2, '�� �ٸ� ����', 'user2', '�� �ٸ� ����', 0, 'https://example.com/image2.jpg');

SELECT * FROM NEWS_BOARD;

delete from news_board where b_no=3 or b_no=4 or b_no=5 or b_no=7;

COMMIT;