-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 13, 2020 at 12:36 PM
-- Server version: 10.4.6-MariaDB
-- PHP Version: 7.3.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `uangkas`
--

-- --------------------------------------------------------

--
-- Table structure for table `uangkeluar`
--

CREATE TABLE `uangkeluar` (
  `kode_keluar` int(11) NOT NULL,
  `terpakai` int(11) NOT NULL,
  `keperluan` varchar(205) NOT NULL,
  `tanggal_keluar` varchar(13) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `uangkeluar`
--

INSERT INTO `uangkeluar` (`kode_keluar`, `terpakai`, `keperluan`, `tanggal_keluar`) VALUES
(1, 11000, 'membeli sapu', '12 nov 2020'),
(2, 2000, 'foto kopi', '12 nov 2020'),
(3, 5000, 'membeli spidol', '13 nov 2020');

-- --------------------------------------------------------

--
-- Table structure for table `uangmasuk`
--

CREATE TABLE `uangmasuk` (
  `kode` int(11) NOT NULL,
  `pembayar` varchar(25) NOT NULL,
  `uang_masuk` int(11) NOT NULL,
  `tanggal_bayar` varchar(12) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `uangmasuk`
--

INSERT INTO `uangmasuk` (`kode`, `pembayar`, `uang_masuk`, `tanggal_bayar`) VALUES
(1, 'vino g bastian', 5000, '11 nov 2020'),
(2, 'adipati dolken', 5000, '11 nov 2020'),
(3, 'uus biasa aja', 5000, '12 nov 2020'),
(4, 'andika', 10000, '12 nov 2020'),
(5, 'cak lontong', 2000, '11 nov 2020'),
(6, 'lontong kari', 5000, '11 nov 2020'),
(7, 'andika kangen saja', 4000, '11 nov 2020'),
(8, 'ernes', 4000, '11 nov 2020'),
(9, 'babe cabita', 3000, '11 nov 2020'),
(10, 'deny sumargo', 11000, '11 nov 2020'),
(11, 'wika salim', 6000, '11 nov 2020'),
(12, 'tora sudiro', 10000, '12 nov 2020'),
(13, 'surya insomnia', 5000, '13 nov 2020'),
(14, 'dita fakhrana', 50000, '13 nov 2020');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `uangkeluar`
--
ALTER TABLE `uangkeluar`
  ADD PRIMARY KEY (`kode_keluar`);

--
-- Indexes for table `uangmasuk`
--
ALTER TABLE `uangmasuk`
  ADD PRIMARY KEY (`kode`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `uangkeluar`
--
ALTER TABLE `uangkeluar`
  MODIFY `kode_keluar` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `uangmasuk`
--
ALTER TABLE `uangmasuk`
  MODIFY `kode` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
