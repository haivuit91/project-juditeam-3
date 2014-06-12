CREATE DATABASE  IF NOT EXISTS `db_thuongmai` /*!40100 DEFAULT CHARACTER SET utf8 COLLATE utf8_unicode_ci */;
USE `db_thuongmai`;
-- MySQL dump 10.13  Distrib 5.6.17, for Win32 (x86)
--
-- Host: localhost    Database: db_thuongmai
-- ------------------------------------------------------
-- Server version	5.6.19-log

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
  `tenBG` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `noidung` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `nam` int(11) NOT NULL,
  `maGVHS` int(11) NOT NULL,
  `trangthai` tinyint(1) NOT NULL,
  PRIMARY KEY (`maBG`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_baigiang`
--

LOCK TABLES `tbl_baigiang` WRITE;
/*!40000 ALTER TABLE `tbl_baigiang` DISABLE KEYS */;
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
  `tenDC` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `dvhoctrinh` int(11) NOT NULL,
  `thoigian` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `dieukien` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `muctieu` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `noidung` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `tieuchuan` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `nam` int(11) NOT NULL,
  `maGVHS` int(11) NOT NULL,
  `trangthai` tinyint(1) NOT NULL,
  PRIMARY KEY (`maDC`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_dcct`
--

LOCK TABLES `tbl_dcct` WRITE;
/*!40000 ALTER TABLE `tbl_dcct` DISABLE KEYS */;
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
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_giangvien_hocsinh`
--

LOCK TABLES `tbl_giangvien_hocsinh` WRITE;
/*!40000 ALTER TABLE `tbl_giangvien_hocsinh` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbl_giangvien_hocsinh` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_side`
--

DROP TABLE IF EXISTS `tbl_side`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tbl_side` (
  `maSlide` int(11) NOT NULL AUTO_INCREMENT,
  `tenSlide` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `noidung` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `nam` int(11) NOT NULL,
  `maGVHS` int(11) NOT NULL,
  `maTL` int(11) DEFAULT NULL,
  `trangthai` tinyint(1) NOT NULL,
  PRIMARY KEY (`maSlide`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_side`
--

LOCK TABLES `tbl_side` WRITE;
/*!40000 ALTER TABLE `tbl_side` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbl_side` ENABLE KEYS */;
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
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_taikhoan`
--

LOCK TABLES `tbl_taikhoan` WRITE;
/*!40000 ALTER TABLE `tbl_taikhoan` DISABLE KEYS */;
INSERT INTO `tbl_taikhoan` VALUES (1,'haivv','haivv','Vũ Văn Hải','haivv.itedu@gmail.com','0123456789',1,1);
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
  `tenTL` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `noidung` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `loaiTL` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `nguonTL` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `nam` int(11) NOT NULL,
  `trangthai` tinyint(1) NOT NULL,
  PRIMARY KEY (`maTL`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_tulieu`
--

LOCK TABLES `tbl_tulieu` WRITE;
/*!40000 ALTER TABLE `tbl_tulieu` DISABLE KEYS */;
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

-- Dump completed on 2014-06-12 21:11:50
