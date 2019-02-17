Hello everone!!

КОД ДЛЯ SQL --->

create table accounts(
id serial primary key,
fullname varchar(70) not null,
login varchar(50) not null unique,
email varchar(50) not null unique,
genders varchar(10) not null,
birthdate date,
passwords varchar(30) not null
)