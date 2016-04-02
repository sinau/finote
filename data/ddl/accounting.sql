-- phpMyAdmin SQL Dump
-- version 4.2.11
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: 12 Mar 2016 pada 04.17
-- Versi Server: 5.6.21
-- PHP Version: 5.6.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `accounting`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `invoice`
--

CREATE TABLE IF NOT EXISTS `invoice` (
  `no_faktur` varchar(32) DEFAULT NULL,
  `tgl_faktur` date DEFAULT NULL,
  `last_user` varchar(36) DEFAULT NULL,
  `dari_kepada` varchar(34) DEFAULT NULL,
  `last_update` varchar(35) DEFAULT NULL, --- ini seharusnya date
  `keterangan` varchar(52) DEFAULT NULL --- keterangannya sepertinya kurang panjang
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Struktur dari tabel `invoice_item`
--

CREATE TABLE IF NOT EXISTS `invoice_item` (
  `id_account` int(11) DEFAULT NULL, --- kalau bisa kasih gunakan varchar
  `id_invoice` int(10) DEFAULT NULL, --- kalau bisa kasih gunakan varchar
  `nama_perkiraan` varchar(25) DEFAULT NULL,
  `cc` varchar(22) DEFAULT NULL,
  `uraian` varchar(50) DEFAULT NULL,
  `debit` int(40) DEFAULT NULL, --- untuk tipe data uang, akan didiskusikan pas meeting nanti.
  `kredit` int(42) DEFAULT NULL --- untuk tipe data uang, akan didiskusikan pas meeting nanti.
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Struktur dari tabel `nomor_account`
--

CREATE TABLE IF NOT EXISTS `nomor_account` (
  `id` int(11) DEFAULT NULL, --- kalau bisa kasih gunakan varchar
  `nama` varchar(30) DEFAULT NULL,
  `cc` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
