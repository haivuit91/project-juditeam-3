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
  `tenBG` varchar(600) COLLATE utf8_unicode_ci NOT NULL,
  `noidung` varchar(4000) COLLATE utf8_unicode_ci DEFAULT NULL,
  `nam` int(11) DEFAULT NULL,
  `maGVHS` int(11) NOT NULL,
  `tlThamkhao` varchar(250) COLLATE utf8_unicode_ci DEFAULT NULL,
  `trangthai` tinyint(1) NOT NULL,
  PRIMARY KEY (`maBG`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_baigiang`
--

LOCK TABLES `tbl_baigiang` WRITE;
/*!40000 ALTER TABLE `tbl_baigiang` DISABLE KEYS */;
INSERT INTO `tbl_baigiang` VALUES (1,'Những nguyên lý cơ bản của chủ nghĩa Mác – Lênin','Chương mở đầu Nhập môn những nguyên lý cơ bản của chủ nghĩa Mác - \r\nLênin nhằm giải quyết ba vấn đề thông lệ của một môn học trước khi đi vào các \r\nnội dung cụ thể, đó là: Học cái gì? (đối tượng của môn học); học để làm gì? (mục \r\nđích của môn học); và, cần phải học thế nào để đạt được mục đích đó? (những yêu \r\ncầu về mặt phương pháp của môn học). \r\n',2009,1,NULL,1),(2,' Toán cao cấp 1 (Giải tích)','Những kiến thức cơ bản về Giải tích toán học, thực sự cần thiết cho việc tiếp cận với các mô hình phân tích quá trình ra quyết định trong kinh tế và quản lý: Hàm số và giới hạn; Phép toán vi phân đối với hàm số một biến số; Hàm nhiều biến và hàm ẩn ; Các bài toán cực trị ; Phép tính tích phân ; Phương trình vi phân.',2010,2,NULL,1),(3,'Nguyên lý kế toán','Lịch sử kế toán: \r\nSự hình thành và phát triển của khoa học kế toán gắn liền với sự hình thành và phát triển của \r\nđời sống kinh tế, xã hội loài người từ thấp lên cao mà khởi điểm là nền sản xuất hàng hóa. Trong \r\ngiai đoạn này công việc sản xuất không chỉ nhằm tự túc trong một gia đình hay bộ tộc mà xã hội đã \r\ncó sự trao đổi sản phẩm giữa những người sản xuất với nhau từ đó yêu cầu theo dõi, tính toán hiệu \r\nquả của những hoạt động này đã được đặt ra nhằm mục đích khai thác một cách tốt nhất năng lực \r\nsản xuất hiện có. Tức là phải thực hiện công tác kế toán để cung cấp các thông tin cần thiết',2007,3,NULL,1),(4,'Kiểm toán căn bản','Chuyển toán là quá trình các chuyên gia độc lập và thẩm quyền thu nhập và đánh giá các bằng chứng về các thông tin có thể định lượng được của đơn vị cụ thể, nhằm mục đích xác nhận và bào cáo về mức độ phù hợp giữa các thông tin này với các chuẩn mực đã được thiết lập',2012,4,NULL,1),(5,'Triết học Mác - Lênin','Triết học Mác - Lênin là một trong ba bộ phận cấu thành của Chủ nghĩa Mác – Lênin; đầu tiên là Triết học Mác, do Mác và Enghen sáng lập ra, được Lênin và các nhà mácxít khác phát triển thêm. Triết học Mác ra đời vào những năm 40 thế kỉ 19 và được phát triển gắn chặt với những thành tựu khoa học và thực tiễn trong phong trào cách mạng công nhân. Sự ra đời của Triết học Mác là một cuộc cách mạng thực sự trong lịch sử tư tưởng loài người, trong lịch sử triết học. Nhưng cuộc cách mạng ấy bao hàm tính kế thừa, tiếp thu tất cả những nhân tố tiên tiến và tiến bộ mà lịch sử tư tưởng loài người đã để lại.',2008,5,NULL,1),(6,'Kinh tế chính trị Mác - Lênin','Kinh tế chính trị Mác - Lênin là một trong các môn khoa học góp phần đào tạo nên những con người không chỉ có năng lực chuyên môn nghiệp vụ mà còn có phẩm chất chính trị đạo đức đáp ứng được đòi hỏi của sự nghiệp công nghiệp hóa, hiện đại hóa đất nước theo định hướng xã hội chủ nghĩa',2010,6,NULL,1),(7,'Tiếng Anh (A1)','Giáo trình tiếng anh 1 gồm 10 bài được biên xoạn theo chương trình khung của Học viện Công nghệ Bưu chính Viễn thông - dành cho sinh viên bắt đầu làm quen với môn tiếng anh',2006,7,NULL,1),(8,'Tiếng anh chuyên ngành QTKD','English for business management là cuốn sách hướng dẫn dạy và học tiếng anh chuyên ngành Quản trị kinh doanh chính thức của Hoc viện Công nghệ Bưu chính Viễn thông biên soạn',2006,8,NULL,1),(9,'Đại cương về quản trị kinh doanh ngân hàng','Vào thế kỷ III, các thợ kim hoàn bắt đầu nhận các khoản tiển gửi, tài sản quý\r\ncủa khách hàng và thu một khoản phí nhất định. Sang thế kỷ X các thợ kim hoàn nhận thấy không chỉ có thể hưởng các\r\nkhoản phí mà họ còn có thể hưởng lợi ích từ việc sử dụng tiền của người này cho người khác vay. Lúc này hoạt động của\r\nmột ngân hàng thực thụ ra đời bao gồm trao đổi ngoại tệ, chiết khấu thương phiếu, nhận tiền gửi, cho vay thương mại, bảo\r\nquản vật có giá, tài trợ cho hoạt động của Chính Phủ (chiến tranh), cung cấp các dịch vụ ủy thác.',2012,9,NULL,1),(10,'Quản trị thương hiệu','Một thương hiệu còn bao gồm những trải nghiệm và cảm xúc mà khách hàng có đƣợc khi sử dụng sản phẩm, dịch vụ hay thậm chí bao gồm cả danh tiếng (về sản phẩm hay dịch vụ đó) mà thương hiệu đó có được thông qua những bài báo, những lời truyền miệng',2009,10,NULL,1),(11,'Tổng quan về tài chính doanh nghiệp','Doanh nghiệp là một tổ chức kinh tế thực hiện các hoạt động sản xuất , cung ứng hàng hóa cho người tiêu dùng qua thị trường nhằm mục đích sinh lời',2007,11,NULL,1),(12,'Nhập môn tài chính tiền tệ','Từ rất sớm trong lịch sử loài người đã xuất hiện nhu cầu phải có một hình thức tiền tệ làm trung gian trao đổi. Tuy nhiên quá trình phát triển các hình thái của tiền tệ cho thấy khó có thể đưa ra một định nghĩa về tiền tệ được các nhà kinh tế học thống nhất và chấp nhận. Trong tác phẩm góp phần phê phán khoa kinh tế chính trị, K. Marx viết “ Một khi người ta hiểu rằng nguồn gốc của tiền tệ ở ngay trong hàng hoá, thì người ta đã khắc phục được các khó khăn chính trong sự phân tích tiền tệ”. Nhưng Marx cũng chỉ ra rằng người chỉ nghiên cứu tiền tệ và các hình thái tiền tệ trực tiếp sinh ra từ trao đổi hàng hoá chứ không nghiên cứu các hình thái tiền tệ thuộc về một giai đoạn cao hơn của quá trình sản xuất như tiền tín dụng chẳng hạn. ',2012,12,NULL,1),(13,'Lý thuyết và chính sách thương mại quốc tế ','Thương mại quốc tế là sự trao đổi hàng hóa của các nước thông qua mua bán',2010,13,NULL,1),(14,'Tài nguyên du lịch ','Theo tổ chức Du lịch quốc tế (1994) - hiểu theo phía cầu : Du lịch là một tập hợp các hoạt động và dịch vụ đa dạng, liên quan đến việc di chuyển tạm thời của con người ra khỏi nơi cư trú thường xuyên của họ nhằm mục đích tiêu khiển, nghỉ ngơi, văn hoá… và nhìn chung là vì những lý do không phải để kiếm sống. \r\n',2009,14,NULL,1),(18,'Quản trị mạng','Quản trị mạng n',2009,6,'Chaper3.ppt',1);
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
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_dcct`
--

LOCK TABLES `tbl_dcct` WRITE;
/*!40000 ALTER TABLE `tbl_dcct` DISABLE KEYS */;
INSERT INTO `tbl_dcct` VALUES (1,'Những nguyên lý cơ bản của chủ nghĩa Mác – Lênin',4,'1','Điều kiện 1','hoàn thành','Chương mở đầu Nhập môn những nguyên lý cơ bản của chủ nghĩa Mác - Lênin nhằm giải quyết ba vấn đề thông lệ của một môn học trước khi đi vào các nội dung cụ thể, đó là: Học cái gì? (đối tượng của môn học); học để làm gì? (mục đích của môn học); và, cần phải học thế nào để đạt được mục đích đó? (những yêu cầu về mặt phương pháp của môn học).','Tiêu chuẩn đc 1',2014,1,1),(2,'Toán cao cấp 1 (Giải tích)',5,'3 tháng','Điều kiện 2','hoàn thành','Những kiến thức cơ bản về Giải tích toán học, thực sự cần thiết cho việc tiếp cận với các mô hình phân tích quá trình ra quyết định trong kinh tế và quản lý: Hàm số và giới hạn; Phép toán vi phân đối với hàm số một biến số; Hàm nhiều biến và hàm ẩn ; Các bài toán cực trị ; Phép tính tích phân ; Phương trình vi phân.','Tiêu chuẩn đc 1',2014,2,1),(3,'Nguyên lý kế toán',4,'2 tháng','Điều kiện 1','hoàn thành','Lịch sử kế toán: Sự hình thành và phát triển của khoa học kế toán gắn liền với sự hình thành và phát triển của đời sống kinh tế, xã hội loài người từ thấp lên cao mà khởi điểm là nền sản xuất hàng hóa.','Tiêu chuẩn đc 1',2014,3,1),(4,'Kiểm toán căn bản',4,'3 tháng','Điều kiện 1','hoàn thành','Chuyển toán là quá trình các chuyên gia độc lập và thẩm quyền thu nhập và đánh giá các bằng chứng về các thông tin có thể định lượng được của đơn vị cụ thể, nhằm mục đích xác nhận và bào cáo về mức độ phù hợp giữa các thông tin này với các chuẩn mực đã được thiết lập','Tiêu chuẩn đc 1',2014,4,1),(5,'Triết học Mác - Lênin',5,'3 tháng','Điều kiện 1','hoàn thành','Triết học Mác - Lênin là một trong ba bộ phận cấu thành của Chủ nghĩa Mác – Lênin; đầu tiên là Triết học Mác, do Mác và Enghen sáng lập ra','Tiêu chuẩn đc 1',2014,5,1),(6,'Kinh tế chính trị Mác - Lênin',5,'3 tháng','Điều kiện 1','hoàn thành','Kinh tế chính trị Mác - Lênin là một trong các môn khoa học góp phần đào tạo nên những con người không chỉ có năng lực chuyên môn nghiệp vụ mà còn có phẩm chất chính trị đạo đức đáp ứng được đòi hỏi của sự nghiệp công nghiệp hóa, hiện đại hóa đất nước theo định hướng xã hội chủ nghĩa','Tiêu chuẩn đc 12',2014,6,1),(7,'Tiếng Anh (A1)',4,'3 tháng','Điều kiện 1','hoàn thành','Nice to meet you ','Tiêu chuẩn đc 12',2014,7,1),(8,'Tiếng anh chuyên ngành QTKD',3,'2 tháng','Điều kiện 2','hoàn thành','Bạn bắt đầu học bài đầu tiên của phần tiếng Anh chuyên ngành Quản trị kinh doanh. Bài được bố cục theo trình tự như sau: mục đích, bài đọc 1, phần thực hành ngôn ngữ, bài đọc 2, bài luyện nghe, tóm tắt nội dung bài học, bảng từ vựng, phần bài tập và đáp án cho tất cả các bài tập.','Tiêu chuẩn đc 12',2014,8,1),(9,'Đại cương về quản trị kinh doanh ngân hàng',5,'2 tháng','Điều kiện 1','hoàn thành','Vào thế kỷ III, các thợ kim hoàn bắt đầu nhận các khoản tiển gửi, tài sản quý của khách hàng và thu một khoản phí nhất định.','Tiêu chuẩn đc 12',2014,9,1),(10,'Quản trị thương hiệu',4,'2 tháng','Điều kiện 2','hoàn thành','Một thương hiệu còn bao gồm những trải nghiệm và cảm xúc mà khách hàng có đƣợc khi sử dụng sản phẩm, dịch vụ hay thậm chí bao gồm cả danh tiếng (về sản phẩm hay dịch vụ đó) mà thương hiệu đó có được thông qua những bài báo, những lời truyền miệng','Tiêu chuẩn đc 1',2014,10,1),(11,'Tổng quan về tài chính doanh nghiệp',4,'3 tháng','Điều kiện 1','hoàn thành','Doanh nghiệp là một tổ chức kinh tế thực hiện các hoạt động sản xuất , cung ứng hàng hóa cho người tiêu dùng qua thị trường nhằm mục đích sinh lời','Tiêu chuẩn đc 123',2014,11,1),(12,'Nhập môn tài chính tiền tệ',4,'2 tháng','Điều kiện 2','hoàn thành','Từ rất sớm trong lịch sử loài người đã xuất hiện nhu cầu phải có một hình thức tiền tệ làm trung gian trao đổi. Tuy nhiên quá trình phát triển các hình thái của tiền tệ cho thấy khó có thể đưa ra một định nghĩa về tiền tệ được các nhà kinh tế học thống nhất và chấp nhận. ','Tiêu chuẩn đc 12',2014,12,1),(13,'Lý thuyết và chính sách thương mại quốc tế',5,'2 tháng','Điều kiện 1','hoàn thành','Thương mại quốc tế là sự trao đổi hàng hóa của các nước thông qua mua bán','Tiêu chuẩn đc 12',2014,13,1),(14,'Tài nguyên du lịch',4,'2 tháng','Điều kiện 1','hoàn thành','Theo tổ chức Du lịch quốc tế (1994) - hiểu theo phía cầu : Du lịch là một tập hợp các hoạt động và dịch vụ đa dạng, liên quan đến việc di chuyển tạm thời của con người ra khỏi nơi cư trú thường xuyên của họ nhằm mục đích tiêu khiển, nghỉ ngơi, văn hoá','Tiêu chuẩn đc 12',2014,14,1);
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
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_giangvien_hocsinh`
--

LOCK TABLES `tbl_giangvien_hocsinh` WRITE;
/*!40000 ALTER TABLE `tbl_giangvien_hocsinh` DISABLE KEYS */;
INSERT INTO `tbl_giangvien_hocsinh` VALUES (1,'Mai Duy Phước','Đà Nẵng','0909171305','1988-08-04 00:00:00','Khoa Cơ bản',1,1),(3,'Nguyễn Văn Liêm','Đà Nẵng','0905888046','1988-12-18 00:00:00','Khoa Kế toán - Kiểm toán',1,1),(4,'Nguyễn Thị Bích Yên','Đà Nẵng','0982024042','1989-10-20 00:00:00','Khoa Kế toán - Kiểm toán',1,1),(5,'Nguyễn Thị Tâm','Đà Nẵng','0935055089','1986-12-22 00:00:00','Khoa Lý luận chính trị',1,1),(6,'Hồ Thị Hiền','Đà Nẵng','0942762777','1987-03-04 00:00:00','Khoa Lý luận chính trị',1,1),(7,'Nguyễn Hữu Hiếu','Đà Nẵng','01228948949','1982-06-12 00:00:00','Khoa Ngoại ngữ',1,1),(8,'Nguyễn Hoàng Long','Đà Nẵng','0905762167','1981-06-05 00:00:00','Khoa Ngoại ngữ',1,1),(9,'Lê Thị Mỹ Dung','Đà Nẵng','0905049849','1989-02-05 00:00:00','Khoa Quản trị kinh doanh',1,1),(10,'Nguyễn Thị Thùy Dương','Đà Nẵng','0969812777','1988-01-06 00:00:00','Khoa Quản trị kinh doanh',1,1),(11,'Lý Vân Phi','Đà Nẵng','0982091606','1987-07-12 00:00:00','Khoa Tài chính - Ngân hàng',1,1),(12,'Nguyễn Thu Hà','Đà Nẵng','0903256824','1986-08-01 00:00:00','Khoa Tài chính - Ngân hàng',1,1),(13,'Đinh Văn Hoài','Đà Nẵng','0982.771181','1985-12-12 00:00:00','Khoa Thương mại và Du lịch',1,1),(14,'Trần Thị Kim Chi','Đà Nẵng','0986143848','1983-09-06 00:00:00','Khoa Thương mại và Du lịch',1,1);
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
  `noidung` varchar(4000) COLLATE utf8_unicode_ci DEFAULT NULL,
  `nam` int(11) DEFAULT NULL,
  `maGVHS` int(11) NOT NULL,
  `maTL` int(11) NOT NULL,
  `tlThamkhao` varchar(250) COLLATE utf8_unicode_ci DEFAULT NULL,
  `trangthai` tinyint(1) NOT NULL,
  PRIMARY KEY (`maSlide`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_slide`
--

LOCK TABLES `tbl_slide` WRITE;
/*!40000 ALTER TABLE `tbl_slide` DISABLE KEYS */;
INSERT INTO `tbl_slide` VALUES (1,'Những nguyên lý cơ bản của chủ nghĩa Mác – Lênin','Chương mở đầu Nhập môn những nguyên lý cơ bản của chủ nghĩa Mác - Lênin nhằm giải quyết ba vấn đề thông lệ của một môn học trước khi đi vào các nội dung cụ thể, đó là: Học cái gì? (đối tượng của môn học); học để làm gì? (mục đích của môn học); và, cần phải học thế nào để đạt được mục đích đó?',2014,1,1,NULL,1),(2,'Toán cao cấp 1 (Giải tích)','Trang bị cho sinh viên những kiến thức cơ bản về Giải tích toán học, thực sự cần thiết cho việc tiếp cận với các mô hình phân tích quá trình ra quyết định trong kinh tế và quản lý: Hàm số và giới hạn; Phép toán vi phân đối với hàm số một biến số; Hàm nhiều biến và hàm ẩn ; Các bài toán cực trị ; Phép tính tích phân ; Phương trình vi phân.',2014,2,2,NULL,1),(3,'Nguyên lý kế toán','Lịch sử kế toán: \r\nSự hình thành và phát triển của khoa học kế toán gắn liền với sự hình thành và phát triển của \r\nđời sống kinh tế, xã hội loài người từ thấp lên cao mà khởi điểm là nền sản xuất hàng hóa. Trong \r\ngiai đoạn này công việc sản xuất không chỉ nhằm tự túc trong một gia đình hay bộ tộc mà xã hội đã \r\ncó sự trao đổi sản phẩm giữa những người sản xuất với nhau từ đó yêu cầu theo dõi, tính toán hiệu \r\nquả của những hoạt động này đã được đặt ra nhằm mục đích khai thác một cách tốt nhất năng lực ',2014,3,3,NULL,1),(4,'Kiểm toán căn bản','Chuyển toán là quá trình các chuyên gia độc lập và thẩm quyền thu nhập và đánh giá các bằng chứng về các thông tin có thể định lượng được của đơn vị cụ thể, nhằm mục đích xác nhận và bào cáo về mức độ phù hợp giữa các thông tin này với các chuẩn mực đã được thiết lập.',2014,4,4,NULL,1),(5,'Triết học Mác - Lênin','Triết học Mác - Lênin là một trong ba bộ phận cấu thành của Chủ nghĩa Mác – Lênin; đầu tiên là Triết học Mác, do Mác và Enghen sáng lập ra, được Lênin và các nhà mácxít khác phát triển thêm. ',2014,5,5,NULL,1),(6,'Kinh tế chính trị Mác - Lênin','inh tế chính trị Mác - Lênin là một trong các môn khoa học góp phần đào tạo nên những con người không chỉ có năng lực chuyên môn nghiệp vụ mà còn có phẩm chất chính trị đạo đức đáp ứng được đòi hỏi của sự nghiệp công nghiệp hóa, hiện đại hóa đất nước theo định hướng xã hội chủ nghĩa',2014,6,6,NULL,1),(7,'Tiếng Anh (A1)','I. Nice to meet you\r\nII. I\'m not English\r\nIII. His name, her name',2014,7,7,NULL,1),(8,'Tiếng anh chuyên ngành QTKD','Bạn bắt đầu học bài đầu tiên của phần tiếng Anh chuyên ngành Quản trị kinh doanh. Bài \r\nđược bố cục theo trình tự như sau: mục đích, bài đọc 1, phần thực hành ngôn ngữ, bài đọc 2, bài \r\nluyện nghe, tóm tắt nội dung bài học, bảng từ vựng, phần bài tập và đáp án cho tất cả các bài tập. \r\n',2014,8,8,NULL,1),(9,'Đại cương về quản trị kinh doanh ngân hàng','Vào thế kỷ III, các thợ kim hoàn bắt đầu nhận các khoản tiển gửi, tài sản quý của khách hàng và thu một khoản phí nhất định. Sang thế kỷ X các thợ kim hoàn nhận thấy không chỉ có thể hưởng các khoản phí mà họ còn có thể hưởng lợi ích từ việc sử dụng tiền của người này cho người khác vay. Lúc này hoạt động của một ngân hàng thực thụ ra đời bao gồm trao đổi ngoại tệ, chiết khấu thương phiếu, nhận tiền gửi, cho vay thương mại, bảo quản vật có giá, tài trợ cho hoạt động của Chính Phủ (chiến tranh), cung cấp các dịch vụ ủy thác.',2014,9,9,NULL,1),(10,'Quản trị thương hiệu','Một thương hiệu còn bao gồm những trải nghiệm và cảm xúc mà khách hàng có đƣợc khi sử dụng sản phẩm, dịch vụ hay thậm chí bao gồm cả danh tiếng (về sản phẩm hay dịch vụ đó) mà thương hiệu đó có được thông qua những bài báo, những lời truyền miệng',2014,10,10,NULL,1),(11,'Tổng quan về tài chính doanh nghiệp','Doanh nghiệp là một tổ chức kinh tế thực hiện các hoạt động sản xuất , cung ứng hàng hóa cho người tiêu dùng qua thị trường nhằm mục đích sinh lời',2014,11,11,NULL,1),(12,'Nhập môn tài chính tiền tệ','Từ rất sớm trong lịch sử loài người đã xuất hiện nhu cầu phải có một hình thức tiền tệ làm trung gian trao đổi. Tuy nhiên quá trình phát triển các hình thái của tiền tệ cho thấy khó có thể đưa ra một định nghĩa về tiền tệ được các nhà kinh tế học thống nhất và chấp nhận. Trong tác phẩm góp phần phê phán khoa kinh tế chính t',2014,12,12,NULL,1),(13,'Lý thuyết và chính sách thương mại quốc tế','Xuất khẩu là một nội dung chính của hoạt động ngoại thương và nó đóng vai trò vô cùng quan trọng trong việc thúc đẩy tăng trưởng kinh tế của các quốc gia trong đó có Việt Nam.Có phải bạn muốn tìm: Chính  vì thế, Nhà nước đã và đang có những biện pháp thúc đẩy các ngành kinh tế hướng về xuất khẩu nhằm tận dụng hết những ích lợi của nó. Một trong số đó là chính sách xây dựng những mặt hàng chủ lực cho xuất khẩu.',2014,13,13,NULL,1),(14,'Tài nguyên du lịch','Theo tổ chức Du lịch quốc tế (1994) - hiểu theo phía cầu : Du lịch là một tập hợp các hoạt động và dịch vụ đa dạng, liên quan đến việc di chuyển tạm thời của con người ra khỏi nơi cư trú thường xuyên của họ nhằm mục đích tiêu khiển, nghỉ ngơi, văn hoá… và nhìn chung là vì những lý do không phải để kiếm sống.',2014,14,14,NULL,1),(16,'Nhận dạng khuân mặt','Nhận dạng khuân mặt',2009,1,10,'HiddenMarkovModel.ppt',1);
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
  `tenTL` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `noidung` varchar(4000) COLLATE utf8_unicode_ci DEFAULT NULL,
  `loaiTL` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `nguonTL` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `nam` int(11) DEFAULT NULL,
  `tlThamkhao` varchar(250) COLLATE utf8_unicode_ci DEFAULT NULL,
  `trangthai` tinyint(1) NOT NULL,
  PRIMARY KEY (`maTL`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_tulieu`
--

LOCK TABLES `tbl_tulieu` WRITE;
/*!40000 ALTER TABLE `tbl_tulieu` DISABLE KEYS */;
INSERT INTO `tbl_tulieu` VALUES (1,'Những nguyên lý cơ bản của chủ nghĩa Mác – Lênin','Chương mở đầu: Nhập môn những nguyên lý cơ bản của chủ nghĩa Mác – Lênin.\r\nPhần thứ nhất: Thế giới quan và phương pháp luận triết học của chủ nghĩa Mác – Lênin\r\nChương 1: Chủ nghĩa duy vật biện chứng\r\nChương 2: Phép biện chứng duy vật\r\nChương 3: Chủ nghĩa duy vật lịch sử','Triết học','triethoc.net',2008,NULL,1),(2,'Bài giảng Toán cao cấp 1','I. Các kiến thức cơ bản\r\nII. Đại số tuyến tính\r\nIII. Phép tính vi phân hàm một biến thực\r\nIV. Phép tính tích phân hàm một biến\r\nV. Phép tính vi phân hàm nhiều biến\r\nVI. Tích phân bội\r\nVII. Tích phân đường - Tích phân mặt','Toán học','baigiangtoanhoc.com',2010,NULL,1),(3,'Bài giảng về nguyên lý kế toán','I. Khái niệm hạch toán kế toán\r\nII.Khái niệm kế toán \r\nIII. Vị trí của hạch toán kế toán trong hệ thông quản lý','Kế Toán','tailieuhoctap.vn',2013,NULL,1),(4,'Bài giảng kiểm toán căn bản','I. Bản chất của kiểm toán\r\nII. Quá trình phát triển của kiểm toán\r\nIII. Phân lọa kiểm toán','kiểm toán','doc.edu.vn/',2012,NULL,1),(5,'Giáo trình triết học Mác - Lênin','Chương 1: Triết học và vai trò của nó trong đời sống xã hội .\r\nChương 2: Khái lược lịch sử triết học trước mác .\r\nChương 3: Sự ra đời và phát triển của triết học .Mác - Lênin .\r\nChương 4: Vật chất và ý thức .\r\nChương 5: Hai nguyên lý cơ bản của phép biện chứng duy vật .','Triết học','triethoc.net',2012,NULL,1),(6,'Kinh tế chính trị và những điều cơ bản','1. Người sáng lập\r\n2.Phương pháp luận\r\n3.Những đặc điểm cơ bản','Triết học','tailieu.vn',2010,NULL,1),(7,'Tiếng Anh (A1)',' Buổi 1: Giới thiệu chung về khóa học, xây dựng kế hoạch tự học, \r\nhướng dẫn học kiến thức ngôn ngữ\r\n Buổi 2: Hướng dẫn học kỹ năng (Nghe-Nói-Đọc-Viết) và làm\r\nquen với dạng thức đề thi hết môn','Tiếng Anh A1','ulis.vnu.edu.vn',2013,NULL,1),(8,'Tiếng anh chuyên ngành QTKD','I. INTRODUCTION\r\nII.UNIT OBJECTIVES\r\nIII. CONTENTS','Tiếng anh chuyên ngành','tailieuhoctap.vn',2009,NULL,1),(9,'Đại cương về quản trị kinh doanh ngân hàng','1.Tổng quan về quản trị kinh doanh NH\r\n2.Quản trị huy động vốn\r\n3.Quản trị vốn tự có\r\n4.Quản trị Thanh khoản','Quản trị kinh doanh ngân hàng','tailieu.vn',2014,NULL,1),(10,'Quản trị thương hiệu','I. Tổng quan về thương hiệu\r\nII. Chiến lược quản trị thương hiệu\r\nIII. Bảo vệ thương hiệu','Quản trị kinh doanh ngân hàng','www.slideshare.net/',2014,NULL,1),(11,'Tổng quan về tài chính doanh nghiệp','I. Vai trò của Tài chính doanh nghiệp\r\nII Nội dung và  các nhân tố  ảnh hưởng tới Tài chính doanh nghiệp  ','Tài chính doanh nghiệp','tailieu.vn',2014,NULL,1),(12,'Nhập môn tài chính tiền tệ','Chương I:  Nhập môn Tài chính tiền tệ\r\nChương II: Lý luận tài chính\r\nChương III: Tiền tệ\r\nChương IV:Tài chính công','Tài chính doanh nghiệp','fpf.ueh.edu.vn',2013,NULL,1),(13,'Lý thuyết và chính sách thương mại quốc tế','I. Khái quát về thương mại quốc tế\r\nII, Các lý thuyết thương mại cổ điển\r\nIII, Các lý thuyết hiện đại','Thương mại và Du lịch','123doc.vn',2014,NULL,1),(14,'Tài nguyên du lịch','I. Tài nguyên du lịch\r\nII. Tài nguyên du lịch tự nhiên','Thương mại và Du lịch','www.wattpad.com',2013,NULL,1),(15,'Xử lý ảnh','Xử lý ảnh b','Slide','Internet',2009,'Bao-cao-XLA.doc',1);
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

-- Dump completed on 2014-06-23 20:28:43
