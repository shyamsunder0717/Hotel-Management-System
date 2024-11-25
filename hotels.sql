-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Aug 21, 2024 at 04:38 PM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `hotels`
--

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

CREATE TABLE `customer` (
  `name` varchar(40) NOT NULL,
  `mobile` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `gender` varchar(45) DEFAULT NULL,
  `address` varchar(350) DEFAULT NULL,
  `id` varchar(20) DEFAULT NULL,
  `nationality` varchar(45) DEFAULT NULL,
  `joindate` date DEFAULT NULL,
  `roomnumber` int(11) NOT NULL,
  `bed` varchar(45) DEFAULT NULL,
  `roomtype` varchar(45) DEFAULT NULL,
  `price` double DEFAULT NULL,
  `status` varchar(45) DEFAULT NULL,
  `amount` double DEFAULT NULL,
  `outdate` date DEFAULT NULL,
  `billid` int(11) NOT NULL,
  `day` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `customer`
--

INSERT INTO `customer` (`name`, `mobile`, `email`, `gender`, `address`, `id`, `nationality`, `joindate`, `roomnumber`, `bed`, `roomtype`, `price`, `status`, `amount`, `outdate`, `billid`, `day`) VALUES
('2', 'jnk', NULL, 'Male', NULL, 'kj', 'kj', '2024-07-21', 2, 'Single', 'AC', 1200, 'check-out', 1200, '2024-07-21', 133, 1),
('hhgjh', 'jnkjl', NULL, 'Male', NULL, 'kjlk', 'kmlk', '2024-07-21', 2, 'Single', 'AC', 1200, 'check-out', 1200, '2024-07-21', 134, 1),
('jhkj', 'jknkj', NULL, 'Male', NULL, 'oikoi', 'kjio', '2024-07-21', 3, 'Single', 'AC', 1230, 'check-out', 1230, '2024-07-21', 135, 1),
('22', '222', NULL, 'Male', NULL, '222', '222', '2024-07-21', 2, 'Single', 'AC', 1200, 'check-out', 1200, '2024-07-21', 136, 1),
('333', '333', NULL, 'Male', NULL, '333', '333', '2024-07-21', 3, 'Single', 'AC', 1230, 'check-out', 1230, '2024-07-21', 137, 1),
('Shyam', '1234567890', NULL, 'Male', NULL, '09876543213', 'IN', '2024-07-21', 2, 'Single', 'AC', 1200, 'check-out', 1200, '2024-07-21', 138, 1),
('234567', '123456', NULL, 'Male', NULL, '123456', '123456', '2024-07-21', 2, 'Single', 'AC', 1200, 'NULL', NULL, NULL, 139, NULL),
('234567', '213456', NULL, 'Male', NULL, '098765', '786543', '2024-07-21', 3, 'Single', 'AC', 1230, 'check-out', 1230, '2024-07-21', 140, 1);

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `name` varchar(40) DEFAULT NULL,
  `email` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  `sq` varchar(60) NOT NULL,
  `ans` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`name`, `email`, `password`, `sq`, `ans`) VALUES
('Shyam', 'shyam@gmail.com', '1234', 'name', 'sunder'),
('Sunder', 'Sunder@gmail.com', '1234', 'Your Favourite Movie', 'sufna');

-- --------------------------------------------------------

--
-- Table structure for table `room`
--

CREATE TABLE `room` (
  `roomnumber` int(11) NOT NULL,
  `roomtype` varchar(45) NOT NULL,
  `bed` varchar(45) NOT NULL,
  `price` double NOT NULL,
  `status` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `room`
--

INSERT INTO `room` (`roomnumber`, `roomtype`, `bed`, `price`, `status`) VALUES
(1, 'AC', 'Single', 4151, 'NOT-BOOKED'),
(2, 'AC', 'Single', 1200, 'BOOKED'),
(3, 'AC', 'Single', 1230, 'NOT-BOOKED'),
(4, 'AC', 'Double', 6000, 'NOT-BOOKED'),
(5, 'AC', 'Double', 7500, 'NOT-BOOKED');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `customer`
--
ALTER TABLE `customer`
  ADD UNIQUE KEY `billid` (`billid`);

--
-- Indexes for table `login`
--
ALTER TABLE `login`
  ADD PRIMARY KEY (`email`),
  ADD UNIQUE KEY `email` (`email`);

--
-- Indexes for table `room`
--
ALTER TABLE `room`
  ADD PRIMARY KEY (`roomnumber`),
  ADD UNIQUE KEY `roomnumber` (`roomnumber`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `customer`
--
ALTER TABLE `customer`
  MODIFY `billid` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=141;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
