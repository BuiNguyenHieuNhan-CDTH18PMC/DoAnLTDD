-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Máy chủ: 127.0.0.1:3306
-- Thời gian đã tạo: Th12 23, 2020 lúc 06:07 PM
-- Phiên bản máy phục vụ: 8.0.21
-- Phiên bản PHP: 7.3.21

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Cơ sở dữ liệu: `dnlaravel`
--

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `migrations`
--

DROP TABLE IF EXISTS `migrations`;
CREATE TABLE IF NOT EXISTS `migrations` (
  `id` int UNSIGNED NOT NULL AUTO_INCREMENT,
  `migration` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `batch` int NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `migrations`
--

INSERT INTO `migrations` (`id`, `migration`, `batch`) VALUES
(1, '2014_10_12_000000_create_users_table', 1),
(2, '2014_10_12_100000_create_password_resets_table', 1),
(3, '2020_12_16_185411_create_tbl_admin_table', 1),
(4, '2020_12_17_074651_tbl_phim', 2),
(5, '2020_12_17_080924_tbl_the_loai', 3),
(6, '2020_12_17_085519_tbl_thuoc', 3),
(7, '2020_12_17_090417_tbl_thuoc', 4),
(8, '2020_12_17_172813_tbl_user_management', 5),
(9, '2020_12_17_173455_tbl_user_manager', 6),
(10, '2020_12_19_095530_tbl_phim', 7),
(11, '2020_12_19_140522_tbl_thuoc', 8),
(12, '2020_12_20_084728_tbl__nhan_vien', 9);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `password_resets`
--

DROP TABLE IF EXISTS `password_resets`;
CREATE TABLE IF NOT EXISTS `password_resets` (
  `email` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `token` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `created_at` timestamp NULL DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `tbltheloai`
--

DROP TABLE IF EXISTS `tbltheloai`;
CREATE TABLE IF NOT EXISTS `tbltheloai` (
  `id_the_loai` int UNSIGNED NOT NULL AUTO_INCREMENT,
  `ten_the_loai` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id_the_loai`)
) ENGINE=MyISAM AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `tbltheloai`
--

INSERT INTO `tbltheloai` (`id_the_loai`, `ten_the_loai`, `created_at`, `updated_at`) VALUES
(1, 'Hành động', NULL, NULL),
(9, 'Tình cảm', NULL, NULL),
(3, 'Hài hước', NULL, NULL),
(4, 'Gia đình', NULL, NULL),
(5, 'Tâm lý', NULL, NULL),
(6, 'Khoa học', NULL, NULL),
(7, 'Viễn tưởng', NULL, NULL),
(8, 'Xã hội', NULL, NULL);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `tbl_binhluan`
--

DROP TABLE IF EXISTS `tbl_binhluan`;
CREATE TABLE IF NOT EXISTS `tbl_binhluan` (
  `noi_dung_binhluan` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `danh_gia_phim` int DEFAULT NULL,
  `phim_id` int DEFAULT NULL,
  `user_id` int DEFAULT NULL,
  KEY `fk_phim_id` (`phim_id`),
  KEY `fk_user_id` (`user_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `tbl_binhluan`
--

INSERT INTO `tbl_binhluan` (`noi_dung_binhluan`, `danh_gia_phim`, `phim_id`, `user_id`) VALUES
('Phim hay', 6, 2, 1);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `tbl_ghe_ngoi`
--

DROP TABLE IF EXISTS `tbl_ghe_ngoi`;
CREATE TABLE IF NOT EXISTS `tbl_ghe_ngoi` (
  `id` int NOT NULL,
  `vi_Tri_day` int DEFAULT NULL,
  `vi_tri_cot` int DEFAULT NULL,
  `trang_thai` int DEFAULT NULL,
  `loai_ghe_id` int DEFAULT NULL,
  `phong_chieu_id` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `loai_ghe_id` (`loai_ghe_id`),
  KEY `phong_chieu_id` (`phong_chieu_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `tbl_gia_ve`
--

DROP TABLE IF EXISTS `tbl_gia_ve`;
CREATE TABLE IF NOT EXISTS `tbl_gia_ve` (
  `id` int NOT NULL,
  `don_gia` int DEFAULT NULL,
  `ten_ve` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `tbl_loai_ghe`
--

DROP TABLE IF EXISTS `tbl_loai_ghe`;
CREATE TABLE IF NOT EXISTS `tbl_loai_ghe` (
  `id` int NOT NULL,
  `ten_loai` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `tbl_nhanvien`
--

DROP TABLE IF EXISTS `tbl_nhanvien`;
CREATE TABLE IF NOT EXISTS `tbl_nhanvien` (
  `staff_id` int UNSIGNED NOT NULL AUTO_INCREMENT,
  `staff_image` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `staff_ho_ten` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `staff_gioi_tinh` varchar(6) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `staff_ngay_sinh` date DEFAULT NULL,
  `staff_sdt` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `staff_dia_chi` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `staff_tai_khoan` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `staff_mat_khau` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `staff_cmnd` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`staff_id`)
) ENGINE=MyISAM AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `tbl_nhanvien`
--

INSERT INTO `tbl_nhanvien` (`staff_id`, `staff_image`, `staff_ho_ten`, `staff_gioi_tinh`, `staff_ngay_sinh`, `staff_sdt`, `staff_dia_chi`, `staff_tai_khoan`, `staff_mat_khau`, `staff_cmnd`, `created_at`, `updated_at`) VALUES
(2, 'chi_muoi_ba71.jpg', 'Bùi Minh Tài', 'Nữ', '2000-12-05', '1234567890', '123 abc', 'nhanvientai', '202cb962ac59075b964b07152d234b70', '15468234', NULL, NULL),
(5, '', NULL, 'Nam', NULL, NULL, NULL, 'admin', '21232f297a57a5a743894a0e4a801fc3', NULL, NULL, NULL);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `tbl_phim`
--

DROP TABLE IF EXISTS `tbl_phim`;
CREATE TABLE IF NOT EXISTS `tbl_phim` (
  `id` int UNSIGNED NOT NULL AUTO_INCREMENT,
  `phim_ten` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `phim_ngay_cong_chieu` date NOT NULL,
  `phim_noi_dung` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `the_loai_id` int NOT NULL,
  `phim_dao_dien` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `phim_dien_vien` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `phim_quoc_gia` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `phim_image` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `phim_thoi_luong_id` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_id_the_loai` (`the_loai_id`)
) ENGINE=MyISAM AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `tbl_phim`
--

INSERT INTO `tbl_phim` (`id`, `phim_ten`, `phim_ngay_cong_chieu`, `phim_noi_dung`, `the_loai_id`, `phim_dao_dien`, `phim_dien_vien`, `phim_quoc_gia`, `phim_image`, `phim_thoi_luong_id`, `created_at`, `updated_at`) VALUES
(2, 'Hoạt hình', '2020-12-19', 'thiếu nhi', 4, 'a', 'a', 'Việt Nam', 'giadinhcroods99.jpg', '1 tiếng 30 phút', NULL, NULL);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `tbl_phong_chieu`
--

DROP TABLE IF EXISTS `tbl_phong_chieu`;
CREATE TABLE IF NOT EXISTS `tbl_phong_chieu` (
  `id` int NOT NULL,
  `so_luong_day` int DEFAULT NULL,
  `so_luong_cot` int DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `tbl_suat_chieu`
--

DROP TABLE IF EXISTS `tbl_suat_chieu`;
CREATE TABLE IF NOT EXISTS `tbl_suat_chieu` (
  `id` int NOT NULL,
  `gio_bat_dau` time DEFAULT NULL,
  `gio_ket_thuc` time DEFAULT NULL,
  `ngay_chieu` date DEFAULT NULL,
  `phim_id` int DEFAULT NULL,
  `phong_chieu_id` int DEFAULT NULL,
  `trang_thai` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `phong_chieu_id` (`phong_chieu_id`),
  KEY `phim_id` (`phim_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `tbl_user_manager`
--

DROP TABLE IF EXISTS `tbl_user_manager`;
CREATE TABLE IF NOT EXISTS `tbl_user_manager` (
  `id` int UNSIGNED NOT NULL AUTO_INCREMENT,
  `ho_ten` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `gioi_tinh` varchar(10) COLLATE utf8mb4_unicode_ci NOT NULL,
  `ngay_sinh` date DEFAULT NULL,
  `sdt` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `dia_chi` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `tai_khoan` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `mat_khau` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `tbl_user_manager`
--

INSERT INTO `tbl_user_manager` (`id`, `ho_ten`, `gioi_tinh`, `ngay_sinh`, `sdt`, `dia_chi`, `tai_khoan`, `mat_khau`, `created_at`, `updated_at`) VALUES
(1, 'Bùi Nguyên Hiếu Nhân', 'Nam', '2000-05-26', '0779983031', NULL, 'hieunhan', '43ef63b23b5ddbd8dc0b2805da15aca0', NULL, NULL),
(4, '', '', NULL, '', NULL, 'admin', 'admin', NULL, NULL),
(5, 'HieuNhan', 'Nam', '2000-05-26', '1234567890', NULL, 'nhan', '1234', NULL, NULL);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `tbl_ve`
--

DROP TABLE IF EXISTS `tbl_ve`;
CREATE TABLE IF NOT EXISTS `tbl_ve` (
  `id` int NOT NULL AUTO_INCREMENT,
  `ngay_ban` date DEFAULT NULL,
  `tong_tien` int DEFAULT NULL,
  `phu_thu` int DEFAULT NULL,
  `suat_chieu_id` int DEFAULT NULL,
  `gia_ve_id` int DEFAULT NULL,
  `ghe_ngoi_id` int DEFAULT NULL,
  `id_khach_hang` int DEFAULT NULL,
  `nhan_vien_id` int DEFAULT NULL,
  `phong_chieu_id` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `gia_ve_id` (`gia_ve_id`),
  KEY `suat_chieu_id` (`suat_chieu_id`),
  KEY `ghe_ngoi_id` (`ghe_ngoi_id`),
  KEY `id_khach_hang` (`id_khach_hang`),
  KEY `nhan_vien_id` (`nhan_vien_id`),
  KEY `phong_chieu_id` (`phong_chieu_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `users`
--

DROP TABLE IF EXISTS `users`;
CREATE TABLE IF NOT EXISTS `users` (
  `id` bigint UNSIGNED NOT NULL AUTO_INCREMENT,
  `name` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `email` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `email_verified_at` timestamp NULL DEFAULT NULL,
  `password` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `remember_token` varchar(100) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
