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
  `dari_kepada` varchar(36) DEFAULT NULL,
  `last_update` date DEFAULT NULL,
  `keterangan` varchar(256) DEFAULT NULL
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

create table ACCOUNT_CLASS(
	code varchar(3) not null primary key,
    name varchar(32) not null
);

create table ACCOUNT_SUBCLASS(
	code varchar(3) not null primary key,
    parent_code varchar(3) not null,
    name varchar(32) not null,
    foreign key(parent_code) references ACCOUNT_CLASS(code)
);

CREATE TABLE ACCOUNT_CODE(
	code varchar(5) not null primary key,
    parent_code varchar(3) not null,
    name varchar(64) not null,
    foreign key(parent_code) references ACCOUNT_SUBCLASS(code)
);