-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 19 Mar 2024 pada 05.49
-- Versi server: 10.4.27-MariaDB
-- Versi PHP: 8.2.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_mahasiswa`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `mahasiswa`
--

CREATE TABLE `mahasiswa` (
  `id` int(11) NOT NULL,
  `nim` varchar(255) NOT NULL,
  `nama` varchar(255) NOT NULL,
  `jenis_kelamin` varchar(255) NOT NULL,
  `status` varchar(50) NOT NULL,
  `namaUniv` varchar(255) NOT NULL,
  `jenjang` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `mahasiswa`
--

INSERT INTO `mahasiswa` (`id`, `nim`, `nama`, `jenis_kelamin`, `status`, `namaUniv`, `jenjang`) VALUES
(1, '2203999', 'Amelia Zalfa Julianti', 'Perempuan', 'Peserta didik baru', 'UPI', 'S1'),
(2, '2202292', 'Muhammad Iqbal Fadhilah', 'Laki-laki', 'Peserta didik baru', 'UPI', 'S1'),
(3, '2202346', 'Muhammad Rifky Afandi', 'Laki-laki', 'Peserta didik baru', 'ITB', 'S1'),
(4, '2210239', 'Muhammad Hanif Abdillah', 'Laki-laki', 'Peserta didik baru', 'UNPAD', 'S1'),
(5, '2202046', 'Nurainun', 'Perempuan', 'Peserta didik baru', 'UPI', 'S1'),
(6, '2205101', 'Kelvin Julian Putra', 'Laki-laki', 'Peserta didik baru', 'UI', 'S1'),
(7, '2200163', 'Rifanny Lysara Annastasya', 'Perempuan', 'Peserta didik baru', 'UPI', 'S1'),
(8, '2202869', 'Revana Faliha Salma', 'Perempuan', 'Peserta didik baru', 'UPI', 'S1'),
(9, '2209489', 'Rakha Dhifiargo Hariadi', 'Laki-laki', 'Peserta didik baru', 'UPI', 'S1'),
(10, '2203142', 'Roshan Syalwan Nurilham', 'Laki-laki', 'Peserta didik baru', 'UPI', 'S1'),
(11, '2200311', 'Raden Rahman Ismail', 'Laki-laki', 'Peserta didik baru', 'UPI', 'S1'),
(12, '2200978', 'Ratu Syahirah Khairunnisa', 'Perempuan', 'Peserta didik baru', 'UPI', 'S1'),
(13, '2204509', 'Muhammad Fahreza Fauzan', 'Laki-laki', 'Peserta didik baru', 'UPI', 'S1'),
(14, '2205027', 'Muhammad Rizki Revandi', 'Laki-laki', 'Peserta didik baru', 'UPI', 'S1'),
(15, '2203484', 'Arya Aydin Margono', 'Laki-laki', 'Peserta didik baru', 'UPI', 'S1'),
(16, '2200481', 'Marvel Ravindra Dioputra', 'Laki-laki', 'Peserta didik baru', 'UPI', 'S1'),
(17, '2209889', 'Muhammad Fadlul Hafiizh', 'Laki-laki', 'Peserta didik baru', 'UPI', 'S1'),
(18, '2206697', 'Rifa Sania', 'Perempuan', 'Peserta didik baru', 'UPI', 'S1'),
(19, '2207260', 'Imam Chalish Rafidhul Haque', 'Laki-laki', 'Peserta didik baru', 'UPI', 'S1');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `mahasiswa`
--
ALTER TABLE `mahasiswa`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `mahasiswa`
--
ALTER TABLE `mahasiswa`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=27;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
