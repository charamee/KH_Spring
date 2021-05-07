DROP SEQUENCE MYNOSEQ; 
DROP TABLE MYBOARD;

CREATE SEQUENCE MYNOSEQ; 

CREATE TABLE MYBOARD(
	MYNO NUMBER PRIMARY KEY, 
	MYNAME VARCHAR2(500) NOT NULL, 
	MYTITLE VARCHAR2(1000) NOT NULL, 
	MYCONTENT VARCHAR2(4000) NOT NULL, 
	MYDATE DATE NOT NULL

);

SELECT * FROM MYBOARD;

