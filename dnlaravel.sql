-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Máy chủ: 127.0.0.1:3306
-- Thời gian đã tạo: Th1 15, 2021 lúc 09:10 PM
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
  `migration` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `batch` int NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=15 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

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
(12, '2020_12_20_084728_tbl__nhan_vien', 9),
(13, '2020_12_31_062520_tbl_rap', 10),
(14, '2020_12_31_063541_tbl_rap', 11);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `password_resets`
--

DROP TABLE IF EXISTS `password_resets`;
CREATE TABLE IF NOT EXISTS `password_resets` (
  `email` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `token` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `created_at` timestamp NULL DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `tbltheloai`
--

DROP TABLE IF EXISTS `tbltheloai`;
CREATE TABLE IF NOT EXISTS `tbltheloai` (
  `id_the_loai` int UNSIGNED NOT NULL AUTO_INCREMENT,
  `ten_the_loai` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
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
  `noi_dung_binhluan` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
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
('hay', 5, 3, 1),
('Rat hay', 9, 8, 8),
('te', 5, 8, 8),
('hay qua ta', 6, 8, 5);

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
  `ten_ve` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `tbl_loai_ghe`
--

DROP TABLE IF EXISTS `tbl_loai_ghe`;
CREATE TABLE IF NOT EXISTS `tbl_loai_ghe` (
  `id` int NOT NULL,
  `ten_loai` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
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
  `staff_tai_khoan` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `staff_mat_khau` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `staff_cmnd` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`staff_id`)
) ENGINE=MyISAM AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `tbl_nhanvien`
--

INSERT INTO `tbl_nhanvien` (`staff_id`, `staff_image`, `staff_ho_ten`, `staff_gioi_tinh`, `staff_ngay_sinh`, `staff_sdt`, `staff_dia_chi`, `staff_tai_khoan`, `staff_mat_khau`, `staff_cmnd`, `created_at`, `updated_at`) VALUES
(5, '', NULL, 'Nam', NULL, NULL, NULL, 'admin', '21232f297a57a5a743894a0e4a801fc3', NULL, NULL, NULL);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `tbl_phim`
--

DROP TABLE IF EXISTS `tbl_phim`;
CREATE TABLE IF NOT EXISTS `tbl_phim` (
  `id` int UNSIGNED NOT NULL AUTO_INCREMENT,
  `phim_ten` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `phim_ngay_cong_chieu` date DEFAULT NULL,
  `phim_noi_dung` varchar(1000) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `the_loai_id` int DEFAULT NULL,
  `phim_dao_dien` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `phim_dien_vien` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `phim_quoc_gia` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `phim_image` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `phim_thoi_luong_id` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `trang_thai_phim` int DEFAULT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_id_the_loai` (`the_loai_id`)
) ENGINE=MyISAM AUTO_INCREMENT=15 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `tbl_phim`
--

INSERT INTO `tbl_phim` (`id`, `phim_ten`, `phim_ngay_cong_chieu`, `phim_noi_dung`, `the_loai_id`, `phim_dao_dien`, `phim_dien_vien`, `phim_quoc_gia`, `phim_image`, `phim_thoi_luong_id`, `trang_thai_phim`, `created_at`, `updated_at`) VALUES
(12, 'Thợ săn quái vật', '2020-12-30', 'Monster Hunter được chuyển thể từ series game nổi tiếng cùng tên của Capcom. Trong phim, đội trưởng Artemis của nữ diễn viên Milla Jovovich (Resident Evil) và đồng đội đã vô tình bước qua một cánh cửa bí ẩn dẫn tới thế giới khác. Tại đây, họ phải chiến đấu với nhiều loài quái vật khổng lồ trong hành trình trở về thế giới. Đồng hành với họ trong trận chiến là nhân vật “Thợ săn” của nam diễn viên Tony Jaa (Ong Bak). Monster Hunter hứa hẹn sẽ là bom tấn hành động với những màn săn quái vật khổng lồ hoành tráng nhất năm 2020.', 7, 'Paul W.S. Anderson', 'Milla Jovovich, Tony Jaa, T.I., Meagan Good, Diego Boneta, Josh Helman, Ron Perlman', 'Mỹ', 'https://raw.githubusercontent.com/BuiNguyenHieuNhan-CDTH18PMC/DoAnLTDD/master/quanlybanhang/public/Images/movie/thosanquaivat.jpg', '104 phút', 1, NULL, NULL),
(7, 'Gia Đình Crood: Kỷ Nguyên Mới', '2021-01-05', 'Từ một gia đình tiền sử sống trong hang với nỗi lo sợ thường trực về thế giới nguy hiểm bên ngoài, nhà Croods đã tự tin bước khỏi vùng an toàn của mình, tiến tới việc làm chủ nhiều phát minh quan trọng.', 4, 'Joel Crawford', 'Nicolas Cage, Emma Stone, Ryan Reynolds, Peter Dinklage, Leslie Mann', 'Mỹ', 'https://raw.githubusercontent.com/BuiNguyenHieuNhan-CDTH18PMC/DoAnLTDD/master/quanlybanhang/public/Images/movie/giadinhcroods4.jpg', '100 phút', 1, NULL, NULL),
(8, 'CHỊ MƯỜI Ba: 3 NGÀY SINH TỬ', '2021-01-05', 'Chị Mười Ba đưa thuộc hạ cũ của mình là Kẽm Gai, mới ra tù, lên Đà Lạt làm việc cho gara của mình. Tại đây, có vẻ như Kẽm Gai cuối cùng đã tìm được bình yên và hạnh phúc. Tuy nhiên, anh ta nhanh chóng trở thành thủ phạm chính trong vụ giết Đức Điên, em trai của Thắng Khùng khét tiếng Đà Lạt, và tìm thấy mình trên đường chạy trốn. Chỉ với ba ngày, liệu Chị Mười Ba có thể xóa sổ tên Kẽm Gai và cứu anh em An Cư Nghĩa Đoàn của mình khỏi hiểm họa mới? Có bí mật nham hiểm nào khác không?', 1, 'Võ Thanh Hòa', 'Thu Trang, Tiến Luật, Kiều Minh Tuấn, Anh Tú, Châu Bùi, Phát La,…', 'Việt Nam', 'https://raw.githubusercontent.com/BuiNguyenHieuNhan-CDTH18PMC/DoAnLTDD/master/quanlybanhang/public/Images/movie/chi_muoi_ba33.jpg', '95 phút 57 giây', 1, NULL, NULL),
(9, 'CẬU VÀNG', '2021-01-08', 'Gia đình Lão Hạc (Cò, Cậu Vàng) đang sống an lành trên mảnh vườn do ông cha khai hoang để lại thì bất ngờ tai họa ập đến. Nguyên nhân là địa chủ Bá Kiến muốn chiếm đoạt (ép bán lại) mảnh vườn vì trên đó có cái Giếng nước cổ, được thầy bói cho đó là “ Long Mạch “ của làng.Bằng nhiều thủ đoạn, từ gạ bán đến thuê lưu manh phá phách, đầu độc cậu Vàng đến ép khống thuế… gia đình Bá Kiến quyết đẩy Lão Hạc tới con đường cùng.Nhưng với sự giúp đỡ của những người hàng xóm tử tế chân chất như vợ chồng Giáo Thứ, Binh Tư và đặc biệt là “ Cậu Vàng “ …, Lão Hạc đã giữ được mảnh đất cho con.', 5, 'Trần Vũ Thủy', 'Viết Liên, NSƯT Hữu Châu, Băng Di, Will, Thanh Bình,...', 'Việt Nam', 'https://raw.githubusercontent.com/BuiNguyenHieuNhan-CDTH18PMC/DoAnLTDD/master/quanlybanhang/public/Images/movie/CauVang.jpg', '96 phút', 0, NULL, NULL),
(10, 'GÁI GIÀ LẮM CHIÊU V – NHỮNG CUỘC ĐỜI VƯƠNG GIẢ', '2021-02-12', 'Cuộc chiến “Chị - Em máu mủ tình thâm” chỉ vì hai chữ TÌNH- TIỀN của ba chị em gái Lý gia tại Biệt thự Bạch Trà Viên xứ Huế. Chính vì vòng xoáy “tình – tiền, được – mất” đã khiến họ từ chị em trở thành những kẻ đối đầu trong mối quan hệ tình thân. Câu chuyện bắt đầu vào đêm đấu giá phiên Xuân tại Bạch Trà Viên, Phượng bào tam vĩ - cổ vật 30 triệu đô, bảo vật của Lý gia bị mất cắp. Khiến ba chị em bắt đầu nghi kỵ lẫn nhau đồng thời phơi bày nhiều bí mật động trời tưởng chừng đã được che giấu suốt cả một đời.', 5, 'Bảo Nhân – Namcito', 'NSND Lê Khanh – Kaity Nguyễn - NSND Hồng Vân – NSND Hoàng Dũng – Khương Lê – Lê Khánh – Anh Dũng…', 'Việt Nam', 'https://raw.githubusercontent.com/BuiNguyenHieuNhan-CDTH18PMC/DoAnLTDD/master/quanlybanhang/public/Images/movie/Gai_Gia_Lam_Chieu.jpg', 'Null', 0, NULL, NULL),
(14, 'Lật mặt 48h', '2021-02-12', 'Lý Hải trở lại với dòng phim hành động sở trường của mình. Bối cảnh hoành tráng với sự đầu tư nghiêm túc, siêu phẩm hành động Việt Lật Mặt 48h sẽ kể về một hành trình trốn chạy đầy kịch tính, nghẹt thở đến phút cuối cùng.', 1, 'Lý Hải', 'Võ Thành Tâm, Mạc Văn Khoa, Huỳnh Đông.', 'Việt Nam', 'https://raw.githubusercontent.com/BuiNguyenHieuNhan-CDTH18PMC/DoAnLTDD/master/quanlybanhang/public/Images/movie/poster_lat_mat__payoff_15.jpg', NULL, 0, NULL, NULL);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `tbl_phong_chieu`
--

DROP TABLE IF EXISTS `tbl_phong_chieu`;
CREATE TABLE IF NOT EXISTS `tbl_phong_chieu` (
  `id` int NOT NULL,
  `rap_id` int NOT NULL,
  `so_luong_day` int DEFAULT NULL,
  `so_luong_cot` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `rap_id` (`rap_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `tbl_phong_chieu`
--

INSERT INTO `tbl_phong_chieu` (`id`, `rap_id`, `so_luong_day`, `so_luong_cot`) VALUES
(0, 1, 5, 5);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `tbl_rap`
--

DROP TABLE IF EXISTS `tbl_rap`;
CREATE TABLE IF NOT EXISTS `tbl_rap` (
  `id` int UNSIGNED NOT NULL AUTO_INCREMENT,
  `ten_rap` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `dia_chi` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `tbl_rap`
--

INSERT INTO `tbl_rap` (`id`, `ten_rap`, `dia_chi`, `created_at`, `updated_at`) VALUES
(1, 'NNTL', 'TP.HCM', NULL, NULL);

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
  `id_user` int UNSIGNED NOT NULL AUTO_INCREMENT,
  `ho_ten` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `anh_user` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `gioi_tinh` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `ngay_sinh` date DEFAULT NULL,
  `sdt` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `dia_chi` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `tai_khoan` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `mat_khau` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id_user`)
) ENGINE=MyISAM AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `tbl_user_manager`
--

INSERT INTO `tbl_user_manager` (`id_user`, `ho_ten`, `anh_user`, `gioi_tinh`, `ngay_sinh`, `sdt`, `dia_chi`, `tai_khoan`, `mat_khau`, `created_at`, `updated_at`) VALUES
(1, 'Bùi Nguyên Hiếu Nhân', NULL, 'Nam', '2000-05-26', '0779983031', NULL, 'hieunhan', '43ef63b23b5ddbd8dc0b2805da15aca0', NULL, NULL),
(4, '', NULL, '', NULL, '', NULL, 'admin', 'admin', NULL, NULL),
(5, 'HieuNhan', NULL, 'Nam', '2000-05-26', '1234567890', NULL, 'nhan', '1234', NULL, NULL);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `tbl_ve`
--

DROP TABLE IF EXISTS `tbl_ve`;
CREATE TABLE IF NOT EXISTS `tbl_ve` (
  `id` int NOT NULL AUTO_INCREMENT,
  `ngay_ban` date DEFAULT NULL,
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
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `email` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `email_verified_at` timestamp NULL DEFAULT NULL,
  `password` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `remember_token` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
