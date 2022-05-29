CREATE TABLE TB_USER (
	user_id varchar2(30) PRIMARY KEY,
	password varchar2(50) NOT NULL,
	name varchar2(30)
);

CREATE SEQUENCE seq_user;

CREATE TABLE tb_board (
	id NUMBER primary KEY,
	user_id varchar2(30) REFERENCES tb_user(user_id),
	title varchar2(1000),
	content varchar2(4000),
	hit NUMBER DEFAULT 0,
	input_time DATE DEFAULT sysdate,
	last_modified_time DATE DEFAULT sysdate
);

CREATE SEQUENCE seq_board;