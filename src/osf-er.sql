
/* Drop Tables */

/DROP TABLE Board CASCADE CONSTRAINTS;




/* Create Tables */

CREATE TABLE Board
(
	-- 이거슨
	Num number(10,0) NOT NULL,
	-- 저거슨
	Title varchar2(150) NOT NULL,
	-- ㅇㅇ
	Content varchar2(100) NOT NULL
);



/* Comments */

COMMENT ON COLUMN Board.Num IS '이거슨';
COMMENT ON COLUMN Board.Title IS '저거슨';
COMMENT ON COLUMN Board.Content IS 'ㅇㅇ';



