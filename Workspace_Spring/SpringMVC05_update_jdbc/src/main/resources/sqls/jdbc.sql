DROP SEQUENCE JDBCSEQ; 

DROP TABLE JDBCBOARD; 

CREATE SEQUENCE JDBCSEQ; 

CREATE TABLE JDBCBOARD(
	SEQ NUMBER PRIMARY KEY, 
	WRITER VARCHAR2(500) NOT NULL, 
	TITLE VARCHAR2(1000) NOT NULL, 
	CONTENT VARCHAR2(4000) NOT NULL, 
	REGDATE DATE NOT NULL

);

INSERT INTO JDBCBOARD
VALUES(JDBCSEQ.NEXTVAL, '관리자','TEST 글 입니다.','TEST 내용입니다', SYSDATE);

SELECT * 
FROM JDBCBOARD
ORDER BY SEQ DESC;