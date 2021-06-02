create table assignment(
                           assId number primary key,
                           assTitle varchar2(150) not null,
                           assCont varchar2(3000),
                           regDate TIMESTAMP DEFAULT SYSTIMESTAMP,
                           modDate TIMESTAMP
);

CREATE SEQUENCE seq_ass
    INCREMENT BY 1
    START WITH 1
    MINVALUE 0
    MAXVALUE 99
    NOCACHE
CYCLE;

-- 더미데이터
insert into assignment(assId, assTitle, assCont) values(seq_ass.NEXTVAL, 'test1','test1');
insert into assignment(assId, assTitle, assCont) values(seq_ass.NEXTVAL, 'test2','test2');
insert into assignment(assId, assTitle, assCont) values(seq_ass.NEXTVAL, 'test3','test3');
insert into assignment(assId, assTitle, assCont) values(seq_ass.NEXTVAL, 'test4','test4');
insert into assignment(assId, assTitle, assCont) values(seq_ass.NEXTVAL, 'test5','test5');
insert into assignment(assId, assTitle, assCont) values(seq_ass.NEXTVAL, 'test6','test6');
insert into assignment(assId, assTitle, assCont) values(seq_ass.NEXTVAL, 'test7','test7');
insert into assignment(assId, assTitle, assCont) values(seq_ass.NEXTVAL, 'test8','test8');
insert into assignment(assId, assTitle, assCont) values(seq_ass.NEXTVAL, 'test9','test9');
insert into assignment(assId, assTitle, assCont) values(seq_ass.NEXTVAL, 'test10','test10');