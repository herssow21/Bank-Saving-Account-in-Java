-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 14, 2021 at 12:48 AM
-- Server version: 10.1.29-MariaDB
-- PHP Version: 7.1.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `saving_account_db`
--

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `accountNo` varchar(1000) NOT NULL,
  `username` varchar(1000) NOT NULL,
  `atype` varchar(255) NOT NULL,
  `ID` varchar(1000) NOT NULL,
  `Tel_Number` varchar(1000) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`accountNo`, `username`, `atype`, `ID`, `Tel_Number`) VALUES
('8001072788', 'ibraa', 'Admin', '5555', '072788'),
('80010715632563', 'willis', 'Client', '35265315', '0715632563'),
('8001010255555', 'chinku', 'Client', '37025509', '010255555'),
('80010707429407', 'ryan', 'Client', '36765085', '0707429407'),
('80010707429407', 'ryan', 'Client', '36765085', '0707429407'),
('800107225212', 'jose', 'Client', '55555', '07225212'),
('800107550000', 'victor', 'Client', '39555', '07550000'),
('80010725112', 'ibraa', 'Client', '325212', '0725112'),
('8001', 'ibraa', 'Client', '32521', ''),
('800107111', 'ibraa', 'Client', '32521', '07111'),
('8001072525', 'ibraa', 'Client', '35215', '072525'),
('800107252525', 'tiney', 'Admin', '325262', '07252525'),
('80010727888551', 'herssow', 'Admin', '35625254', '0727888551');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
