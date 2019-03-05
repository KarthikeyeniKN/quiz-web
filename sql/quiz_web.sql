create table login_details(NAME VARCHAR2(30 BYTE), 
	PASSWORD VARCHAR2(20)
   ) ;




 create table quiz_topics 
   (	ID NUMBER(10), 
	TOPICS VARCHAR2(30), 
	QUESTIONS  NUMBER(20)
   );
insert into quiz_topics values (1,'c',10);
insert into quiz_topics values(2,'c++',10);



 CREATE TABLE QUESTER_ANSWERS 
   (	ID NUMBER(10), 
	QUESTION VARCHAR2(100), 
	OPTION1 VARCHAR2(30), 
	OPTION2 VARCHAR2(30), 
	OPTION3 VARCHAR2(30), 
	ANSWER VARCHAR2(10)
   );

insert into quester_answers values(1,' All keywords in C are in','LowerCase letters',
'UpperCase letters',' CamelCase letters','a');

insert into quester_answers values(1,' Which of the following is not a valid C variable name?','int number',
'float rate','  int $main','c');





