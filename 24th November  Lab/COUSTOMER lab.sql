use soheldb;
create table CUSTOMER(Cust_id varchar(5), Fname varchar(15), Lname varchar(15), Area char(2),
Phone numeric(10),DOB date ,Payment numeric(6,2));
insert into CUSTOMER value
('A01','Ivan','Ross','SA',6125467,'1986-01-15',800.50);
insert into CUSTOMER value
('A02','Vandana','Ray','MU',5560379,'1987-12-20',1000.75);
insert into CUSTOMER value
('A03','Pramada','Juguste','DA',4560389,'1967-07-25',500.0);
insert into CUSTOMER value
('A04','Basu','Navindi','BA', 6125401,'1956-02-28',860.00);
insert into CUSTOMER value
('A05','Ravi','Shridhar','NA',null,'1989-02-15',500.00);
insert into CUSTOMER value
('A06','Rukmini','Aiyer','GH',5125274,'1987-07-23',1500.00);
select DOB from soheldb.customer;
update soheldb.customer set Phone =223056 where Cust_id='A02' or Cust_id='A04';
update soheldb.customer set DOB='1990-05-14' where Cust_id='A03' or Cust_id='A05';
select *from soheldb.customer;
delete from soheldb.customer where Cust_id='A03' or Cust_id='A05';
truncate table soheldb.customer; 
insert into CUSTOMER value
('01','Nadim','Hasan','GB',6543227,'2002-01-09',900.08);
insert into CUSTOMER value
('02','Asman','Zzaman','GB',6543657,'2001-01-18',940.08);
insert into CUSTOMER value
('03','Sonal','Sen','BB',652207,'2003-05-19',990.08);
insert into CUSTOMER value
('04','Vikram','Roy','GB',6500227,'1990-01-09',1900.08);
insert into CUSTOMER value
('05','Vedha ','Deshpanda ','GB',6003227,'1987-01-09',2210.08);
select Fname,Lname from soheldb.customer where  Payment >=900.0;
delete from soheldb.customer where Payment>=1000;