drop table iorder;
drop table member;
drop table product;

CREATE TABLE  MEMBER (
                                IDX NUMBER(6) CONSTRAINT MEMBER_IDX_PK PRIMARY KEY,
                                ID VARCHAR2(20) CONSTRAINT MEMBER_ID_NN NOT NULL,
                                PW VARCHAR2(20)CONSTRAINT MEMBER_PW_NN NOT NULL,
                                NAME  VARCHAR2(20)CONSTRAINT MEMBER_NAME_NN NOT NULL ,
                                PHONENUM  VARCHAR2(20)CONSTRAINT MEMBER_NUM_NN NOT NULL,
                                EMAIL VARCHAR2(50)CONSTRAINT MEMBER_EMAIL_NN NOT NULL
                              ) ;
          
CREATE TABLE  PRODUCT (
                                ICODE NUMBER(6) CONSTRAINT PRODUCT_ICODE_PK PRIMARY KEY,
                                 
                                INAME  VARCHAR2(50)CONSTRAINT PRODUCT_NAME_NN NOT NULL ,
                                IPRICE  INTEGER  ,
                                COUNT INTEGER
                               
                              ) ;          
          
          
          
                              
                              
CREATE TABLE IORDER (           oidx NUMBER(6) CONSTRAINT ORDER_OCODE_PK PRIMARY KEY,
                                ORDERCODE integer ,
                                ICODE NUMBER(6) CONSTRAINT ORDER_ICODE_FK REFERENCES PRODUCT(ICODE) NOT NULL,
                                IDX NUMBER(6) CONSTRAINT ORDER_IDX_FK REFERENCES MEMBER(IDX) NOT NULL ,
                                ORDERDATE  DATE DEFAULT SYSDATE,
                                count Integer,
                                oprice Integer
                               
                              ) ;
--시퀀스 삭제
drop sequence member_idx_seq ;
drop sequence iorder_oidx_seq ;


--시퀀스 생성
create sequence member_idx_seq ;
create sequence iorder_oidx_seq ;
                              


--product dml --- icode, iname, iprice, count
insert into product values (1,'바닐라 아이스크림', '2000',100);
insert into product values (2,'초코 아이스크림', '2500',100);
insert into product values (3,'딸기 아이스크림', '2500',100);
insert into product values (4,'바나나 아이스크림', '2700',100);
insert into product values (5,'커피 아이스크림', '2700',100);
insert into product values (6,'민트 아이스크림', '2800',100);
insert into product values (7,'요거트 아이스크림', '3000',100);


commit;