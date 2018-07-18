
-- phpMyAdmin SQL Dump
-- version 4.0.10deb1
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Jul 18, 2018 at 09:47 AM
-- Server version: 5.5.59-0ubuntu0.14.04.1
-- PHP Version: 5.5.9-1ubuntu4.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `employee`
--

-- --------------------------------------------------------

--
-- Table structure for table `acc_info`
--

CREATE TABLE IF NOT EXISTS `acc_info` (
  `Acc_no` int(11) NOT NULL,
  `Bank_Name` varchar(20) DEFAULT NULL,
  `Branch` varchar(20) DEFAULT NULL,
  `Emp_id` int(11) DEFAULT NULL,
  `Acc_Type` varchar(20) DEFAULT NULL,
  `Balance` int(11) DEFAULT NULL,
  PRIMARY KEY (`Acc_no`),
  KEY `fk` (`Emp_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `acc_info`
--

INSERT INTO `acc_info` (`Acc_no`, `Bank_Name`, `Branch`, `Emp_id`, `Acc_Type`, `Balance`) VALUES
(12365, 'IDBI', 'Shivaji_Nagar', 1008, 'Saving', 500000),
(12546, 'BOM', 'Sinhgad_Road', 1007, 'Saving', 8000),
(12547, 'BOM', 'Swargate', 1002, 'Saving', 5500000),
(14587, 'SBI', 'Koegaon_Park', 1006, 'Current', 5000),
(17500, 'IDBI', 'Koregaon_Park', 1003, 'Current', 600),
(36540, 'HDFC', 'Sinhga_Road', 1005, 'saving', 500),
(47895, 'HDFC', 'Deccan', 1010, 'Saving', 14500),
(78965, 'ICICI', 'Koregaon_Park', 1009, 'Current', 5000),
(82005, 'SBI', 'Koregaon_Park', 1001, 'Saving', 500000),
(82006, 'IDBI', 'FC_Road', 1014, 'Current', 12500),
(125478, 'HDFC', 'Koregaon_Park', 1011, 'Saving', 500000),
(125479, 'ICICI', 'Sinhga_Road', 1004, 'saving', 5000);

-- --------------------------------------------------------

--
-- Table structure for table `emp_info`
--

CREATE TABLE IF NOT EXISTS `emp_info` (
  `Emp_id` int(11) NOT NULL AUTO_INCREMENT,
  `Name` varchar(20) DEFAULT NULL,
  `Designation` varchar(20) DEFAULT NULL,
  `Salary` int(11) DEFAULT NULL,
  `DOJ` date DEFAULT NULL,
  `City` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`Emp_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=1016 ;

--
-- Dumping data for table `emp_info`
--

INSERT INTO `emp_info` (`Emp_id`, `Name`, `Designation`, `Salary`, `DOJ`, `City`) VALUES
(1001, 'Rahul', 'Manager', 80000, '1985-02-25', 'Pune'),
(1002, 'Pooja', 'Supervisor', 60000, '2001-02-28', 'Nasik'),
(1003, 'Sneha', 'Clerk', 20000, '2000-04-01', 'Delhi'),
(1004, 'Pratik', 'Security', 10000, '1998-05-21', 'Ahemdabad'),
(1005, 'Raj', 'Administrater', 20200, '2002-03-09', 'Nagpur'),
(1006, 'Kiran', 'Asst_Manager', 15320, '2012-04-08', 'Mumbai'),
(1007, 'Neha', 'Supervisor', 41254, '1995-06-12', 'Pune'),
(1008, 'Ramesh', 'Clerk', 20200, '1985-09-17', 'Nashik'),
(1009, 'Priyanka', 'Security', 10000, '2012-10-12', 'Delhi'),
(1010, 'Shilpa', 'Supervisor', 25000, '1985-11-02', 'Ahmendabad'),
(1011, 'Shruti', 'Security', 30000, '2010-12-22', 'Nagpur'),
(1012, 'Ganesh', 'Clerk', 20200, '2009-01-01', 'Mumbai'),
(1013, 'Sneha', 'Clerk', 45600, '2015-04-02', 'Nagpur'),
(1014, 'Priti', 'Supervisor', 47000, '2012-05-19', 'Nagpur'),
(1015, 'Amit', 'Supervisor', 20200, '2009-03-17', 'Pune');

--
-- Constraints for dumped tables
--

--
-- Constraints for table `acc_info`
--
ALTER TABLE `acc_info`
  ADD CONSTRAINT `fk` FOREIGN KEY (`Emp_id`) REFERENCES `emp_info` (`Emp_id`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
