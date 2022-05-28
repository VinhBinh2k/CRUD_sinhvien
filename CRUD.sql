create database stdmanager
use stdmanager

create table student(
	studenID int identity,
	name nvarchar(50),
	gender char(20),
	dob date
);

alter table student add constraint pk_studenID primary key(studenID);

insert into student (name, gender, dob) values(N'nguyễn vĩnh bình', 'nam', '20000518')
insert into student (name, gender, dob) values(N'Đoàn hoài nam', 'nam', '20000112')
insert into student (name, gender, dob) values(N'nguyễn trung huy', 'nu', '20000901')
insert into student (name, gender, dob) values(N'nguyễn tuấn hưng', 'nam', '20010130')
insert into student (name, gender, dob) values(N'đặng thế minh long', 'nu', '19990311')

select * from student
delete student  where  studenID = ?

delete dbo.student where gender= 'nữ' 
update dbo.student 
set name = ?, gender=?, dob=? where studenID = 14

