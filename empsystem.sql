Create database empsystem;
use empsystem;
create table details(
id int primary key int NOT NULL AUTO_INCREMENT,,
name varchar(50) ,
salary int (50)
);
drop table details;
CREATE TABLE `details` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name`varchar(45) DEFAULT NULL,
  
  `salary` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
  );
  
  CREATE TABLE `info` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name`varchar(45) DEFAULT NULL,
  `job`varchar(45) DEFAULT NULL, 
   `branch`varchar(45) DEFAULT NULL,
  `salary` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
  );
 