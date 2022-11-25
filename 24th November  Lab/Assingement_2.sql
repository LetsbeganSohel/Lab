use soheldb;
create table Coustomer (Cust_id varchar(10) primary key, Fname varchar(20), Lname varchar(20), Area varchar(5),
Phone numeric(11));
insert into Coustomer value
('A01','Ivan','Ross','SA',621345);
insert into Coustomer value
('A02','Vandana','Ray','MU',5564379);
insert into Coustomer value
('A03','Pramada','Jauguest','DA',4560389);
insert into Coustomer value
('A04','Basu','Navindi','BA',6125401);
insert into Coustomer value
('A05','Ravi','Shridhar','NA',null);
insert into Coustomer value
('A06','Rukmini','Aiyer','GH',5123467);
alter table Coustomer rename  to Coustomer2;
create table Movie(Mv_no int primary key auto_increment,Title varchar(35) not null, Star varchar(5),
Price int(3));
insert into Movie value
(1,'Bloody','JC', 181);
insert into Movie value
(2,'The Firm','TC', 200);
insert into Movie value
(3,'Pretty Woman','RG', 151);
insert into Movie value
(4,'Home Alone ','MC', 150);
insert into Movie value
(5,'The Fugitive ','MF', 200);
insert into Movie value
(6,'Coma','MD', 100);
insert into Movie value
(7,'Dracular','GO', 150);
insert into Movie value
(8,'Quick Change','BM', 100);
insert into Movie value
(9,'Gone with The Wind','CB', 200);
insert into Movie value
(10,'Carry on Doctor','LP', 100);
select Title from soheldb.movie where Price>100 and Price<200;
select Mv_no from  soheldb.movie where Star!='JC'or Star!='TC'or Star!='MC';
select Title, Price , Price+ Price*0.1 as 'Increse Price' from  soheldb.movie ;
