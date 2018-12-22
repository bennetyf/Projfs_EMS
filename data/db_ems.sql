/*
MySQL WorkBench for Linux
MySQL - 8.0.13-community : Database - projfs_ems

This script is used to create the default database for the Employee Management System

*********************************************************************
*/


/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

CREATE DATABASE /*!32312 IF NOT EXISTS*/`projfs_ems` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `projfs_ems`;

/*Table structure for table `tb_prize_punish`
This table is used to manage the prizes and punishments
*/

DROP TABLE IF EXISTS `tb_prize_punish`;

CREATE TABLE `tb_prize_punish` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `pp_title` varchar(64) DEFAULT NULL,
  `pp_type` varchar(1) DEFAULT NULL,
  `pp_content` text,
  `pp_money` DOUBLE(16,2) DEFAULT 0.00,
  `pp_time` DATE DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

/*Data for the table `tb_prize_punish` */

INSERT INTO `tb_prize_punish`(`id`,`pp_title`,`pp_type`,`pp_content`,`pp_money`,`pp_time`)
VALUES
       (1,'Champion of the Grand Final','1','The FF Football Club',100000,'2018-11-01'),
       (3,'Runner-up of the Marathon','1','James Bond',25600,'2018-12-01'),
       (4,'Coming Late','0','Arriving 2 hours late',234.5,'2018-10-04');


/*Table structure for table `tb_department` */
DROP TABLE IF EXISTS `tb_department`;

CREATE TABLE `tb_department` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `dt_name` varchar(10) DEFAULT NULL,
  `dt_createTime` DATE DEFAULT NULL,
  `dt_responsibility` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

/*Data for the table `tb_department` */

insert  into `tb_department`(`dt_name`,`dt_createTime`,`dt_responsibility`)
values
       ('Java WEB','2011-11-21','JSP WebPages'),
       ('ASP.NET','2011-10-02','ASP.NET WebPages'),
       ('C#','2012-09-15','C# Application Programs'),
       ('C++','2009-05-31','C++ Game Programming'),
       ('DevOps','2017-03-20','Development Operations'),
       ('React','2016-07-13','FrontEnd React WebPages'),
       ('PHP','2013-11-01','PHP BackEnd Programming'),
       ('Technical Supports','2007-04-01','Providing Basic Supports'),
       ('Human Resource','2007-04-01','Employment Management'),
       ('Marketing','2007-04-01','Promoting Products');

/*Table structure for table `tb_employee` */

DROP TABLE IF EXISTS `tb_employee`;

CREATE TABLE `tb_employee` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `em_serialNumber` varchar(30) DEFAULT NULL,
  `em_firstName` varchar(16) DEFAULT NULL,
  `em_lastName` varchar(16) DEFAULT NULL,
  `em_sex` varchar(1) DEFAULT NULL,
  `em_age` int(11) DEFAULT NULL,
  `em_IDCard` varchar(30) DEFAULT NULL,
  `em_born` varchar(50) DEFAULT NULL,
  `em_nation` varchar(10) DEFAULT NULL,
  `em_marriage` varchar(10) DEFAULT NULL,
  `em_visage` varchar(10) DEFAULT NULL,
  `em_ancestralHome` varchar(30) DEFAULT NULL,
  `em_tel` varchar(50) DEFAULT NULL,
  `em_address` varchar(50) DEFAULT NULL,
  `em_afterSchool` varchar(50) DEFAULT NULL,
  `em_speciality` varchar(50) DEFAULT NULL,
  `em_culture` varchar(10) DEFAULT NULL,
  `em_startTime` DATE DEFAULT NULL,
  `em_departmentId` int(11) DEFAULT NULL,
  `em_typeWork` varchar(10) DEFAULT NULL,
  `em_creatTime` DATE DEFAULT NULL,
  `em_createName` varchar(30) DEFAULT NULL,
  `em_bz` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;

/*Data for the table `tb_employee` */

insert  into `tb_employee`(`em_serialNumber`,`em_firstName`,`em_lastName`,`em_sex`,`em_age`,`em_IDCard`,`em_born`,`em_nation`,`em_marriage`,`em_visage`,`em_ancestralHome`,`em_tel`,`em_address`,`em_afterSchool`,`em_speciality`,`em_culture`,`em_startTime`,`em_departmentId`,`em_typeWork`,`em_creatTime`,`em_createName`,`em_bz`)
values
       ('001','Jane','Walsh','F',26,'22010198********','1985-04-20','Australia','Unmarried','N/A','Sydney','043607*****','145 Doncaster Avenue','UTS','Computer Science and Engineering','Master','2007-04-10',9,'Programmer','2007-04-13','Marry','A Genius'),
       ('002','Ben','Yoo','M',30,'12405967********','1980-02-22','Australia','Married','N/A','Sydney','043607*****','55 O\'Connell Street','USYD','Computer Science and Engineering','Bachelor','2013-02-02',9,'Programmer','2007-11-30','Bond','Team Leader'),
       ('003','Ashley','Tiam','F',28,'50650365********','1983-10-12','Australia','Unmarried','N/A','Melbourne','041245*****','12 Princess Street','UMelb','Electronic Engineering','Master','2015-03-23',9,'Programmer','2015-03-30','Marry','Happy Girl'),
       ('004','Linda','Lee','F',24,'65823879********','1993-08-15','U.K.','Unmarried','N/A','Sydney','045689*****','63 Beckett Street','UCL','Computer Science and Engineering','Master','2014-08-02',5,'Support','2014-08-05','Marry','Works Hard'),
       ('005','Carol','Hannibal','M',27,'98230159********','1988-05-27','Australia','Married','N/A','Brisbane','0425369*****','123 Franklin Road','UMelb','Mechanical Engineering','Bachelor','2016-10-05',4,'HR','2016-10-06','Bond','Great Team Spirit'),
       ('006','Jackson','Smith','M',26,'456321087********','1989-06-04','America','Unmarried','N/A','Canberra','0425768*****','78 Elizabeth Street','UNSW','Computer Science and Engineering','Master','2014-11-02',9,'Software Engineer','2014-11-30','Marry','Learns Fast'),
       ('007','Taylor','Ho','M',29,'12345678********','1987-08-08','Australia','Married','N/A','Melbourne','0439567*****','38 Swanston Street','RMIT','Architecture','Master','2017-03-14',4,'Assistant','2017-04-02','Marry','Handsome Guy'),
       ('008','Marry','Bennett','F',23,'78562301********','1994-07-15','Australia','Unmarried','N/A','Sydney','045566*****','42 Cook Road','UTS','Business','Bachelor','2014-09-24',5,'HR','2014-09-27','Bond','Works Smart'),
       ('016','James','Bond','M',28,'56723694********','1988-01-20','Australia','Married','N/A','Sydney','0432798*****','10 Lisa Avenue','UTS','Computer Science and Engineering','Master','2012-05-23',9,'Programmer','2012-05-30','tsoft','Positive Work Attitude'),
       ('017','Lily','Benson','F',25,'24011106********','1991-02-22','Australia','Unmarried','N/A','Sydney','045698*****','15 Rosolvette Street','UNSW','Computer Science and Engineering','Master','2015-06-26',9,'Programmer','2012-05-10','Bond','N/A');

/*Table structure for table `tb_invitejob` */

DROP TABLE IF EXISTS `tb_invitejob`;

CREATE TABLE `tb_invitejob` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `firstname` varchar(20) DEFAULT NULL,
  `lastname` varchar(20) DEFAULT NULL,
  `sex` varchar(10) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `born` varchar(50) DEFAULT NULL,
  `job` varchar(50) DEFAULT NULL,
  `specialty` varchar(50) DEFAULT NULL,
  `experience` varchar(10) DEFAULT NULL,
  `teachSchool` varchar(30) DEFAULT NULL,
  `afterSchool` varchar(50) DEFAULT NULL,
  `tel` varchar(50) DEFAULT NULL,
  `address` varchar(50) DEFAULT NULL,
  `createtime` DATE DEFAULT NULL,
  `content` text,
  `isstock` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=68 DEFAULT CHARSET=utf8;

/*Data for the table `tb_invitejob` */

insert  into `tb_invitejob` (`id`,`firstname`,`lastname`,`sex`,`age`,`born`,`job`,`specialty`,`experience`,`teachSchool`,`afterSchool`,`tel`,`address`,`createtime`,`content`,`isstock`)
values                                                                                                                                   (33,'Lisa','Waston1','F',27,'1981-01-01','Java Programmer','Computer Applications','N/A','Bachelor','Victoria University','131******73','888 Bondi Street','2018-11-29','Fresh Grad, No Work Experience',0),
  (34,'Lisa','Waston2','F',27,'1981-01-01','Java Programmer','Computer Applications','N/A','Bachelor','Victoria University','131******73','888 Bondi Street','2018-11-29','Fresh Grad, No Work Experience',0),
  (35,'Lisa','Waston3','F',27,'1981-01-01','Java Programmer','Computer Applications','N/A','Bachelor','Victoria University','131******73','888 Bondi Street','2018-11-29','Fresh Grad, No Work Experience',0),
  (36,'Lisa','Waston4','F',27,'1981-01-01','Java Programmer','Computer Applications','N/A','Bachelor','Victoria University','131******73','888 Bondi Street','2018-11-29','Fresh Grad, No Work Experience',0),
  (37,'Lisa','Waston5','F',27,'1981-01-01','Java Programmer','Computer Applications','N/A','Bachelor','Victoria University','131******73','888 Bondi Street','2018-11-29','Fresh Grad, No Work Experience',0),
  (38,'Lisa','Waston6','F',27,'1981-01-01','Java Programmer','Computer Applications','N/A','Bachelor','Victoria University','131******73','888 Bondi Street','2018-11-29','Fresh Grad, No Work Experience',0),
  (39,'Lisa','Waston7','F',27,'1981-01-01','Java Programmer','Computer Applications','N/A','Bachelor','Victoria University','131******73','888 Bondi Street','2018-11-29','Fresh Grad, No Work Experience',0),
  (40,'Lisa','Waston8','F',27,'1981-01-01','Java Programmer','Computer Applications','N/A','Bachelor','Victoria University','131******73','888 Bondi Street','2018-11-29','Fresh Grad, No Work Experience',0),
  (41,'Lisa','Waston9','F',27,'1981-01-01','Java Programmer','Computer Applications','N/A','Bachelor','Victoria University','131******73','888 Bondi Street','2018-11-29','Fresh Grad, No Work Experience',0),
  (42,'Lisa','Waston10','M',27,'1981-01-01','Java Programmer','Computer Applications','N/A','Bachelor','Victoria University','131******73','888 Bondi Street','2018-11-29','Fresh Grad, No Work Experience',0),
  (43,'Lisa','Waston11','F',27,'1981-01-01','Java Programmer','Computer Applications','N/A','Bachelor','Victoria University','131******73','888 Bondi Street','2018-11-29','Fresh Grad, No Work Experience',0),
  (44,'Lisa','Waston12','F',27,'1981-01-01','Java Programmer','Computer Applications','N/A','Bachelor','Victoria University','131******73','888 Bondi Street','2018-11-29','Fresh Grad, No Work Experience',0),
  (45,'Lisa','Waston13','M',27,'1981-01-01','Java Programmer','Computer Applications','N/A','Bachelor','Victoria University','131******73','888 Bondi Street','2018-11-29','Fresh Grad, No Work Experience',0),
  (46,'Lisa','Waston14','F',27,'1981-01-01','Java Programmer','Computer Applications','N/A','Bachelor','Victoria University','131******73','888 Bondi Street','2018-11-29','Fresh Grad, No Work Experience',0),
  (47,'Lisa','Waston15','M',27,'1981-01-01','Java Programmer','Computer Applications','N/A','Bachelor','Victoria University','131******73','888 Bondi Street','2018-11-29','Fresh Grad, No Work Experience',0),
  (48,'Lisa','Waston16','M',27,'1981-01-01','Java Programmer','Computer Applications','N/A','Bachelor','Victoria University','131******73','888 Bondi Street','2018-11-29','Fresh Grad, No Work Experience',0),
  (49,'Lisa','Waston17','M',27,'1981-01-01','Java Programmer','Computer Applications','N/A','Bachelor','Victoria University','131******73','888 Bondi Street','2018-11-29','Fresh Grad, No Work Experience',0),
  (50,'Lisa','Waston18','F',27,'1981-01-01','Java Programmer','Computer Applications','N/A','Bachelor','Victoria University','131******73','888 Bondi Street','2018-11-29','Fresh Grad, No Work Experience',0),
  (51,'Lisa','Waston19','F',27,'1981-01-01','Java Programmer','Computer Applications','N/A','Bachelor','Victoria University','131******73','888 Bondi Street','2018-11-29','Fresh Grad, No Work Experience',0),
  (52,'Lisa','Waston20','F',27,'1981-01-01','Java Programmer','Computer Applications','N/A','Bachelor','Victoria University','131******73','888 Bondi Street','2018-11-29','Fresh Grad, No Work Experience',0),
  (53,'Lisa','Waston21','F',27,'1981-01-01','Java Programmer','Computer Applications','N/A','Bachelor','Victoria University','131******73','888 Bondi Street','2018-11-29','Fresh Grad, No Work Experience',0),
  (54,'Lisa','Waston22','F',27,'1981-01-01','Java Programmer','Computer Applications','N/A','Bachelor','Victoria University','131******73','888 Bondi Street','2018-11-29','Fresh Grad, No Work Experience',0),
  (55,'Lisa','Waston23','M',27,'1981-01-01','Java Programmer','Computer Applications','N/A','Bachelor','Victoria University','131******73','888 Bondi Street','2018-11-29','Fresh Grad, No Work Experience',0),
  (56,'Lisa','Waston24','M',27,'1981-01-01','Java Programmer','Computer Applications','N/A','Bachelor','Victoria University','131******73','888 Bondi Street','2018-11-29','Fresh Grad, No Work Experience',0),
  (57,'Lisa','Waston25','M',27,'1981-01-01','Java Programmer','Computer Applications','N/A','Bachelor','Victoria University','131******73','888 Bondi Street','2018-11-29','Fresh Grad, No Work Experience',0),
  (58,'Lisa','Waston26','F',27,'1981-01-01','Java Programmer','Computer Applications','N/A','Bachelor','Victoria University','131******73','888 Bondi Street','2018-11-29','Fresh Grad, No Work Experience',0),
  (59,'Lisa','Waston27','F',27,'1981-01-01','Java Programmer','Computer Applications','N/A','Bachelor','Victoria University','131******73','888 Bondi Street','2018-11-29','Fresh Grad, No Work Experience',0),
  (60,'Lisa','Waston28','M',27,'1981-01-01','Java Programmer','Computer Applications','N/A','Bachelor','Victoria University','131******73','888 Bondi Street','2018-11-29','Fresh Grad, No Work Experience',0),
  (61,'Lisa','Waston29','F',27,'1981-01-01','Java Programmer','Computer Applications','N/A','Bachelor','Victoria University','131******73','888 Bondi Street','2018-11-29','Fresh Grad, No Work Experience',0),
  (62,'Lisa','Waston30','M',27,'1981-01-01','Java Programmer','Computer Applications','N/A','Bachelor','Victoria University','131******73','888 Bondi Street','2018-11-29','Fresh Grad, No Work Experience',0),
  (63,'Lisa','Waston31','F',27,'1981-01-01','Java Programmer','Computer Applications','N/A','Bachelor','Victoria University','131******73','888 Bondi Street','2018-11-29','Fresh Grad, No Work Experience',0),
  (64,'Lisa','Waston32','M',27,'1981-01-01','Java Programmer','Computer Applications','N/A','Bachelor','Victoria University','131******73','888 Bondi Street','2018-11-29','Fresh Grad, No Work Experience',0),
  (65,'Lisa','Waston33','F',27,'1981-01-01','Java Programmer','Computer Applications','N/A','Bachelor','Victoria University','131******73','888 Bondi Street','2018-11-29','Fresh Grad, No Work Experience',0),
  (66,'Lisa','Waston34','F',27,'1981-01-01','Java Programmer','Computer Applications','N/A','Bachelor','Victoria University','131******73','888 Bondi Street','2018-11-29','Fresh Grad, No Work Experience',0),
  (67,'Lisa','Waston35','M',27,'1981-01-01','Java Programmer','Computer Applications','N/A','Bachelor','Victoria University','131******73','888 Bondi Street','2018-11-29','Fresh Grad, No Work Experience',0);

/*Table structure for table `tb_manager` */

DROP TABLE IF EXISTS `tb_manager`;

CREATE TABLE `tb_manager` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `account` varchar(20) DEFAULT NULL,
  `password` varchar(30) DEFAULT NULL,
  `managerLevel` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

/*Data for the table `tb_manager` */

insert  into `tb_manager`(`account`,`password`,`managerLevel`)
values
       ('tsoft','1234567890','1'),
       ('king','abcdefgh','0'),
       ('queen','11111111','0');

/*Table structure for table `tb_pay` */

DROP TABLE IF EXISTS `tb_pay`;

CREATE TABLE `tb_pay` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `pay_emNumber` varchar(30) DEFAULT NULL,
  `pay_emName` varchar(10) DEFAULT NULL,
  `pay_month` DATE DEFAULT NULL,
  `pay_baseMoney` int(11) DEFAULT NULL,
  `pay_overtime` int(11) DEFAULT NULL,
  `pay_age` int(11) DEFAULT NULL,
  `pay_check` float DEFAULT NULL,
  `pay_absent` float DEFAULT NULL,
  `pay_safety` float DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

/*Data for the table `tb_pay` */

insert  into `tb_pay`(`id`,`pay_emNumber`,`pay_emName`,`pay_month`,`pay_baseMoney`,`pay_overtime`,`pay_age`,`pay_check`,`pay_absent`,`pay_safety`)
values
       (1,'012','Jackson Smith','2017-12-01',12000,1,1,100,0,128),
       (2,'007','Marry Jane','2014-08-01',15000,1,1,100,0,128),
       (3,'017','James Bond','2015-11-01',24000,0,0,100,0,128);

/*Table structure for table `tb_train` */

DROP TABLE IF EXISTS `tb_train`;

CREATE TABLE `tb_train` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `tn_man` varchar(10) DEFAULT NULL,
  `tn_title` varchar(50) DEFAULT NULL,
  `tn_content` varchar(50) DEFAULT NULL,
  `tn_time` DATE DEFAULT NULL,
  `tn_address` varchar(30) DEFAULT NULL,
  `tn_join` varchar(50) DEFAULT NULL,
  `tn_bz` text,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

/*Data for the table `tb_train` */

insert  into `tb_train`(`tn_man`,`tn_title`,`tn_content`,`tn_time`,`tn_address`,`tn_join`,`tn_bz`)
values
       ('Manager','Regulation','Learn Everything in The Regulation',
        '2018-01-11','Room205','All Employees','All Employees Should Learn the Updated Regulation');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
