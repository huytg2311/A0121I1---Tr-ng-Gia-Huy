-- MySQL dump 10.13  Distrib 8.0.21, for Win64 (x86_64)
--
-- Host: localhost    Database: libary
-- ------------------------------------------------------
-- Server version	8.0.21

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `hocsinh`
--

DROP TABLE IF EXISTS `hocsinh`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `hocsinh` (
  `maSV` varchar(50) NOT NULL,
  `tenSV` varchar(50) NOT NULL,
  `ngaySinh` date DEFAULT NULL,
  `diaChi` varchar(50) NOT NULL,
  `sdt` int NOT NULL,
  `email` varchar(50) NOT NULL,
  `image` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`maSV`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hocsinh`
--

LOCK TABLES `hocsinh` WRITE;
/*!40000 ALTER TABLE `hocsinh` DISABLE KEYS */;
INSERT INTO `hocsinh` VALUES ('AB120','Siu Nhan Vang','2000-03-08','22-Quang Trung',15025238,'gaoyl@yahoo',''),('DE120','Siu Nhan Do','2001-04-01','12-Can Giuoc',19537387,'gaored@yahoo',''),('DS120','Siu Nhan Den','2002-06-02','64-Hai Ba Trung',67385733,'gaoblack@yahoo',''),('FE723','Siu Nhan Hong','2001-05-17','58-Le Thai To',638478122,'gaopink@yahoo',''),('LS520','Siu Nhan Trang','2007-06-07','62-Ba Dinh',26346434,'gaowhite@yahoo','');
/*!40000 ALTER TABLE `hocsinh` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `loaisach`
--

DROP TABLE IF EXISTS `loaisach`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `loaisach` (
  `maLoai` varchar(50) NOT NULL,
  `tenLoai` varchar(50) NOT NULL,
  PRIMARY KEY (`maLoai`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `loaisach`
--

LOCK TABLES `loaisach` WRITE;
/*!40000 ALTER TABLE `loaisach` DISABLE KEYS */;
INSERT INTO `loaisach` VALUES ('DBI221','Database Increate'),('JPD113','Japan Language'),('PIA197','Piano Musical'),('PRE192','Project Engerneer'),('SC230','Skill Comunicate');
/*!40000 ALTER TABLE `loaisach` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `phieumuon`
--

DROP TABLE IF EXISTS `phieumuon`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `phieumuon` (
  `maPhieu` int NOT NULL,
  `maSV` varchar(50) NOT NULL,
  `ngayMuon` date DEFAULT NULL,
  `ngayTra` date DEFAULT NULL,
  `status` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`maPhieu`),
  KEY `maSV` (`maSV`),
  CONSTRAINT `phieumuon_ibfk_1` FOREIGN KEY (`maSV`) REFERENCES `hocsinh` (`maSV`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `phieumuon`
--

LOCK TABLES `phieumuon` WRITE;
/*!40000 ALTER TABLE `phieumuon` DISABLE KEYS */;
INSERT INTO `phieumuon` VALUES (1,'DE120','2021-06-09','2021-07-09','Done'),(2,'DS120','2019-04-25','2019-05-25','Not'),(3,'LS520','2019-02-18','2019-03-18','Not'),(4,'FE723','2020-06-19','2020-07-19','Done'),(5,'AB120','2021-01-05','2021-03-31','Done');
/*!40000 ALTER TABLE `phieumuon` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sach`
--

DROP TABLE IF EXISTS `sach`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `sach` (
  `maSach` int NOT NULL,
  `tenSach` varchar(50) NOT NULL,
  `nxb` varchar(50) NOT NULL,
  `tacGia` varchar(50) NOT NULL,
  `namXB` date DEFAULT NULL,
  `soLanXB` int NOT NULL,
  `giaSach` double NOT NULL,
  `image` varchar(50) DEFAULT NULL,
  `maLoai` varchar(50) NOT NULL,
  PRIMARY KEY (`maSach`),
  KEY `maLoai` (`maLoai`),
  CONSTRAINT `sach_ibfk_1` FOREIGN KEY (`maLoai`) REFERENCES `loaisach` (`maLoai`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sach`
--

LOCK TABLES `sach` WRITE;
/*!40000 ALTER TABLE `sach` DISABLE KEYS */;
INSERT INTO `sach` VALUES (100,'Listen Japan','Ikkai','Yokioto','1990-07-19',4,2,'','JPD113'),(101,'Basic Piano','Princez','Richart Cl','2000-12-02',1,1.5,'','PIA197'),(102,'Speaking Japan','Ikkai','Youkioto','1990-08-12',2,2,'','JPD113'),(103,'JavaLab Practice','UK Engeer','Robbert','2001-02-05',2,3.4,'','PRE192');
/*!40000 ALTER TABLE `sach` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sach_phieu`
--

DROP TABLE IF EXISTS `sach_phieu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `sach_phieu` (
  `maPhieu` int NOT NULL,
  `maSach` int NOT NULL,
  KEY `maPhieu` (`maPhieu`),
  KEY `maSach` (`maSach`),
  CONSTRAINT `sach_phieu_ibfk_1` FOREIGN KEY (`maPhieu`) REFERENCES `phieumuon` (`maPhieu`),
  CONSTRAINT `sach_phieu_ibfk_2` FOREIGN KEY (`maSach`) REFERENCES `sach` (`maSach`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sach_phieu`
--

LOCK TABLES `sach_phieu` WRITE;
/*!40000 ALTER TABLE `sach_phieu` DISABLE KEYS */;
INSERT INTO `sach_phieu` VALUES (1,102),(2,100),(3,102),(4,101),(5,103);
/*!40000 ALTER TABLE `sach_phieu` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-07-09 21:29:48
