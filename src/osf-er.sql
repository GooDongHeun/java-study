
/* Drop Tables */

/DROP TABLE Board CASCADE CONSTRAINTS;




/* Create Tables */

CREATE TABLE USER_INFO
(
	-- 1
	UI_NUM varchar2(10) NOT NULL,
	-- 홍길동
	UI_NAME varchar2(10) NOT NULL,
	-- 20
	UI_AGE varchar2(10) NOT NULL
);



/* Comments */

COMMENT ON COLUMN Board.Num IS '이거슨';
COMMENT ON COLUMN Board.Title IS '저거슨';
COMMENT ON COLUMN Board.Content IS 'ㅇㅇ';



