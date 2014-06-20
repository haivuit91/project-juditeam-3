CREATE DATABASE  IF NOT EXISTS `db_thuongmai` /*!40100 DEFAULT CHARACTER SET utf8 COLLATE utf8_unicode_ci */;
USE `db_thuongmai`;
-- MySQL dump 10.13  Distrib 5.6.17, for Win32 (x86)
--
-- Host: 127.0.0.1    Database: db_thuongmai
-- ------------------------------------------------------
-- Server version	5.6.19

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `tbl_baigiang`
--

DROP TABLE IF EXISTS `tbl_baigiang`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tbl_baigiang` (
  `maBG` int(11) NOT NULL AUTO_INCREMENT,
  `tenBG` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `noidung` varchar(4000) COLLATE utf8_unicode_ci NOT NULL,
  `nam` int(11) NOT NULL,
  `maGVHS` int(11) NOT NULL,
  `trangthai` tinyint(1) NOT NULL,
  PRIMARY KEY (`maBG`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_baigiang`
--

LOCK TABLES `tbl_baigiang` WRITE;
/*!40000 ALTER TABLE `tbl_baigiang` DISABLE KEYS */;
INSERT INTO `tbl_baigiang` VALUES (1,'Servlet and JSP','Training Servlet and JSP Basic...',2014,1,1),(2,'Tổng quan CSS','CSS  Basic',2014,2,1),(3,'Thiết kế HTML',' HTML Basic',2014,3,1),(4,'Lập trình .Net','.Net',2009,0,1),(5,'Quản Trị Mạng','QTM',2012,5,1),(6,'Quản trị mạng1','aaaaaaaaaaa',2010,1,1),(7,'Quản trị mạng1','AAAAAAAAAA',2010,1,1);
/*!40000 ALTER TABLE `tbl_baigiang` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_dcct`
--

DROP TABLE IF EXISTS `tbl_dcct`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tbl_dcct` (
  `maDC` int(11) NOT NULL AUTO_INCREMENT,
  `tenDC` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `dvhoctrinh` int(11) NOT NULL,
  `thoigian` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `dieukien` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `muctieu` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `noidung` varchar(4000) COLLATE utf8_unicode_ci NOT NULL,
  `tieuchuan` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `nam` int(11) NOT NULL,
  `maGVHS` int(11) NOT NULL,
  `trangthai` tinyint(1) NOT NULL,
  PRIMARY KEY (`maDC`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_dcct`
--

LOCK TABLES `tbl_dcct` WRITE;
/*!40000 ALTER TABLE `tbl_dcct` DISABLE KEYS */;
INSERT INTO `tbl_dcct` VALUES (1,'Đề cương 1',3,'3 tháng','Điều kiện 1','hoàn thành','Nội dung đề cương 1','Tiêu chuẩn đc 1',2013,2,1),(2,'Đề cương 3',40,'4 tháng','Điều kiện 1','hoàn thành','Nội dung đề cương 3','Tiêu chuẩn đc 5',2013,4,1),(3,'Đề cương 2',3,'3 tháng','Điều kiện 2','hoàn thành','Nội dung đề cương 2','Tiêu chuẩn đc 4',2013,2,1),(4,'Đề cương 4',30,'5 tháng','Điều kiện 3','hoàn thành','Nội dung đề cương 4','Tiêu chuẩn đc 6',2014,4,1),(5,'Đề cương 5',4,'5 tháng','Điều kiện 4','hoàn thành','Nội dung đề cương 5','Tiêu chuẩn đc 7',2014,2,1),(6,'A',2,'2','A','A','DSAAAAAAAA\r\nAAAAAAAAAAAAAAAA\r\nAAAAAAAAAAAAAAA\r\nAAAAAAAAAAAAAAAA\r\nAAAAAAAAAAAAAAA\r\nAAAAAAAAAAAAAA\r\nAAAAAAAAAAAAAAAA','S',2010,4,1),(7,'',1,'1','A','A','1212','A',2010,6,1);
/*!40000 ALTER TABLE `tbl_dcct` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_giangvien_hocsinh`
--

DROP TABLE IF EXISTS `tbl_giangvien_hocsinh`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tbl_giangvien_hocsinh` (
  `maGVHS` int(11) NOT NULL AUTO_INCREMENT,
  `tenGVHS` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `diachi` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `dienthoai` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `ngaysinh` datetime NOT NULL,
  `donvi` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `trinhdo` int(11) NOT NULL,
  `trangthai` tinyint(1) NOT NULL,
  PRIMARY KEY (`maGVHS`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_giangvien_hocsinh`
--

LOCK TABLES `tbl_giangvien_hocsinh` WRITE;
/*!40000 ALTER TABLE `tbl_giangvien_hocsinh` DISABLE KEYS */;
INSERT INTO `tbl_giangvien_hocsinh` VALUES (1,'Phạm Đình Công','Thanh Hóa','0982207386','1991-11-24 00:00:00','JUDI',1,1),(2,'Nguyễn Ngọc Duy','Quảng Nam','0905888222','0014-07-07 00:00:00','JUDI',1,1),(3,'Nguyễn Phương Nguyên','Quang trị','01659050720','1992-04-06 00:00:00','JuDi',1,1),(4,'Nguyễn Văn Thanh','Quảng Trị','01222334567','1992-05-07 00:00:00','Judi',1,1),(5,'Lê Văn Tân','Thanh Hóa','0165929293','0009-11-15 00:00:00','Judi',1,1),(6,'Lê Văn Tân','Thanh Hóa','0165929293','0018-06-04 00:00:00','Judi',0,1);
/*!40000 ALTER TABLE `tbl_giangvien_hocsinh` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_slide`
--

DROP TABLE IF EXISTS `tbl_slide`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tbl_slide` (
  `maSlide` int(11) NOT NULL AUTO_INCREMENT,
  `tenSlide` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `noidung` varchar(4000) COLLATE utf8_unicode_ci NOT NULL,
  `nam` int(11) NOT NULL,
  `maGVHS` int(11) NOT NULL,
  `maTL` int(11) DEFAULT NULL,
  `trangthai` tinyint(1) NOT NULL,
  PRIMARY KEY (`maSlide`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_slide`
--

LOCK TABLES `tbl_slide` WRITE;
/*!40000 ALTER TABLE `tbl_slide` DISABLE KEYS */;
INSERT INTO `tbl_slide` VALUES (1,'Bắt đầu làm việc với Java','Giới thiệu về OOP và ngôn ngữ lập trình Java',2014,1,1,1),(2,'Tổng quan về CSS','Giới thiệu về CSS',2010,2,2,1),(3,'Thiết kế HTML','Giới thiệu HTML',2012,3,3,1),(4,'Lập trình .Net','Lập trình .Net cơ bản',2013,4,4,1),(5,'Quản Trị Mạng','Giới Thiệu về Quản Trị Mạng',2010,5,5,1);
/*!40000 ALTER TABLE `tbl_slide` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_taikhoan`
--

DROP TABLE IF EXISTS `tbl_taikhoan`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tbl_taikhoan` (
  `maTK` int(11) NOT NULL AUTO_INCREMENT,
  `tenTK` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `matkhau` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `hoten` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `email` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `dienthoai` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `quyen` int(11) NOT NULL,
  `trangthai` tinyint(1) NOT NULL,
  PRIMARY KEY (`maTK`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_taikhoan`
--

LOCK TABLES `tbl_taikhoan` WRITE;
/*!40000 ALTER TABLE `tbl_taikhoan` DISABLE KEYS */;
INSERT INTO `tbl_taikhoan` VALUES (1,'haivv','haivv','Vũ Văn Hải','haivv.itedu@gmail.com','0123456789',1,1),(2,'admin','admin','Phạm Đình Công','congpd.itedu@gmail.com','0982207386',1,1);
/*!40000 ALTER TABLE `tbl_taikhoan` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_tulieu`
--

DROP TABLE IF EXISTS `tbl_tulieu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tbl_tulieu` (
  `maTL` int(11) NOT NULL AUTO_INCREMENT,
  `tenTL` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `noidung` varchar(4000) COLLATE utf8_unicode_ci NOT NULL,
  `loaiTL` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `nguonTL` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `nam` int(11) NOT NULL,
  `trangthai` tinyint(1) NOT NULL,
  PRIMARY KEY (`maTL`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_tulieu`
--

LOCK TABLES `tbl_tulieu` WRITE;
/*!40000 ALTER TABLE `tbl_tulieu` DISABLE KEYS */;
INSERT INTO `tbl_tulieu` VALUES (1,'Lập trình Java','Giới thiệu về Java SE','JSE','ĐH Thương Mại',2008,1),(2,'Tổng quan về CSS','Làm việc với CSS','CSS','Đại Học Công Nghệ',2014,1),(3,'Thiết kế HTML','Làm việc với HTML','HTML','Đại Học Công Nghệ',2014,1),(4,'Lập trình .Net','Giới thiệu về .Net','.Net','Đại Học Công Nghệ',2014,1),(5,'Quản Trị Mạng','Giới Thiệu về Quản Trị Mạng','a','fd',2010,1),(8,'Tư liệu 1','aaaaaaaaaaaaaaaaaaa','a','fd',2010,1),(9,'Tư liệu 1','FFFFFFFF\r\nFFFFFFFF\r\nSSSSSSSS\r\nA\r\nA\r\nA\r\nS\r\n213\r\n23\r\n2133333333333333333\r\n213333333333333333321\r\n\r\n','a','fd',2010,1);
/*!40000 ALTER TABLE `tbl_tulieu` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2014-06-20 13:03:01
