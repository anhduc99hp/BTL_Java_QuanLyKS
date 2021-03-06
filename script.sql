USE [master]
GO
/****** Object:  Database [QuanLyKhachSan]    Script Date: 9/7/2020 8:49:41 AM ******/
CREATE DATABASE [QuanLyKhachSan]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'QuanLyKhachSan', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL12.SQLEXPRESS\MSSQL\DATA\QuanLyKhachSan.mdf' , SIZE = 3264KB , MAXSIZE = UNLIMITED, FILEGROWTH = 1024KB )
 LOG ON 
( NAME = N'QuanLyKhachSan_log', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL12.SQLEXPRESS\MSSQL\DATA\QuanLyKhachSan_log.ldf' , SIZE = 832KB , MAXSIZE = 2048GB , FILEGROWTH = 10%)
GO
ALTER DATABASE [QuanLyKhachSan] SET COMPATIBILITY_LEVEL = 110
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [QuanLyKhachSan].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [QuanLyKhachSan] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [QuanLyKhachSan] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [QuanLyKhachSan] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [QuanLyKhachSan] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [QuanLyKhachSan] SET ARITHABORT OFF 
GO
ALTER DATABASE [QuanLyKhachSan] SET AUTO_CLOSE OFF 
GO
ALTER DATABASE [QuanLyKhachSan] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [QuanLyKhachSan] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [QuanLyKhachSan] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [QuanLyKhachSan] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [QuanLyKhachSan] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [QuanLyKhachSan] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [QuanLyKhachSan] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [QuanLyKhachSan] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [QuanLyKhachSan] SET  DISABLE_BROKER 
GO
ALTER DATABASE [QuanLyKhachSan] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [QuanLyKhachSan] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [QuanLyKhachSan] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [QuanLyKhachSan] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [QuanLyKhachSan] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [QuanLyKhachSan] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [QuanLyKhachSan] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [QuanLyKhachSan] SET RECOVERY SIMPLE 
GO
ALTER DATABASE [QuanLyKhachSan] SET  MULTI_USER 
GO
ALTER DATABASE [QuanLyKhachSan] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [QuanLyKhachSan] SET DB_CHAINING OFF 
GO
ALTER DATABASE [QuanLyKhachSan] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [QuanLyKhachSan] SET TARGET_RECOVERY_TIME = 0 SECONDS 
GO
ALTER DATABASE [QuanLyKhachSan] SET DELAYED_DURABILITY = DISABLED 
GO
USE [QuanLyKhachSan]
GO
/****** Object:  Table [dbo].[ChiTietDichVu]    Script Date: 9/7/2020 8:49:41 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[ChiTietDichVu](
	[MaCTDV] [int] IDENTITY(1,1) NOT NULL,
	[MaDatPhong] [int] NOT NULL,
	[MaDichVu] [nvarchar](50) NOT NULL,
	[DonGia] [money] NOT NULL,
	[SoLuong] [float] NOT NULL,
	[ThanhTien] [money] NULL,
 CONSTRAINT [PK_ChiTietDichVu] PRIMARY KEY CLUSTERED 
(
	[MaCTDV] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[ChiTietLuong]    Script Date: 9/7/2020 8:49:41 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[ChiTietLuong](
	[MaChiTietLuong] [nvarchar](50) NOT NULL,
	[MaNhanVien] [nvarchar](50) NULL,
	[SoNgayNghi] [int] NULL,
	[SoNgayLam] [int] NULL,
	[NgayNhanLuong] [date] NULL,
	[TongNhan] [money] NULL,
 CONSTRAINT [PK_NhanLuong] PRIMARY KEY CLUSTERED 
(
	[MaChiTietLuong] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[DatPhong]    Script Date: 9/7/2020 8:49:41 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[DatPhong](
	[MaDatPhong] [int] IDENTITY(1,1) NOT NULL,
	[MaKhachHang] [nvarchar](50) NOT NULL,
	[MaPhong] [nvarchar](50) NOT NULL,
	[LoaiHinhThue] [bit] NULL,
	[NgayThue] [datetime] NULL CONSTRAINT [DF_DatPhong_NgayThue]  DEFAULT (getdate()),
	[NgayRaDuKien] [datetime] NULL,
	[SoNguoi] [int] NULL CONSTRAINT [DF_DatPhong_SoNguoi]  DEFAULT ((1)),
	[TenUser] [nvarchar](50) NOT NULL,
	[TinhTrang] [nvarchar](50) NULL CONSTRAINT [DF_DatPhong_TinhTrang]  DEFAULT (N'Chưa thanh toán'),
	[TienDatCoc] [money] NULL CONSTRAINT [DF_DatPhong_TienDatCoc]  DEFAULT ((0)),
 CONSTRAINT [PK_DatPhong] PRIMARY KEY CLUSTERED 
(
	[MaDatPhong] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[DichVu]    Script Date: 9/7/2020 8:49:41 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[DichVu](
	[MaDichVu] [nvarchar](50) NOT NULL,
	[TenDichVu] [nvarchar](50) NOT NULL,
	[DonVi] [nvarchar](50) NOT NULL,
	[DonGia] [money] NOT NULL,
	[GhiChu] [nvarchar](255) NULL,
 CONSTRAINT [PK_DichVu] PRIMARY KEY CLUSTERED 
(
	[MaDichVu] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[HoaDon]    Script Date: 9/7/2020 8:49:41 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[HoaDon](
	[MaHoaDon] [int] IDENTITY(1,1) NOT NULL,
	[MaDatPhong] [int] NOT NULL,
	[TenUser] [nvarchar](50) NOT NULL,
	[TenKhachHang] [nvarchar](50) NOT NULL,
	[MaPhong] [nvarchar](50) NOT NULL,
	[SoNgayThue] [float] NULL,
	[SoGioThue] [float] NULL,
	[TienPhong] [money] NULL,
	[PhuThuCheckin] [money] NULL,
	[PhuThuCheckout] [money] NULL,
	[TienDichVu] [money] NULL,
	[ThanhTien] [money] NOT NULL,
	[NgayThanhToan] [date] NULL,
	[GhiChu] [nvarchar](max) NULL,
 CONSTRAINT [PK_HoaDon] PRIMARY KEY CLUSTERED 
(
	[MaHoaDon] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO
/****** Object:  Table [dbo].[Khac]    Script Date: 9/7/2020 8:49:41 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Khac](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[GiaTriSo] [float] NULL,
	[GiaTriTG] [time](7) NULL,
	[MoTa] [nvarchar](max) NULL
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO
/****** Object:  Table [dbo].[KhachHang]    Script Date: 9/7/2020 8:49:41 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[KhachHang](
	[MaKhachHang] [nvarchar](50) NOT NULL,
	[MaLoaiKH] [nvarchar](50) NOT NULL,
	[TenKhachHang] [nvarchar](50) NOT NULL,
	[Tuoi] [int] NULL,
	[GioiTinh] [bit] NULL CONSTRAINT [DF_KhachHang_GioiTinh]  DEFAULT ('true'),
	[SoDienThoai] [char](10) NULL CONSTRAINT [DF_KhachHang_SoDienThoai]  DEFAULT (N'0123456789'),
	[SoCMND] [char](12) NULL CONSTRAINT [DF_KhachHang_SoCMND]  DEFAULT (N'123456789111'),
 CONSTRAINT [PK_KhachHang] PRIMARY KEY CLUSTERED 
(
	[MaKhachHang] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[LoaiKhachHang]    Script Date: 9/7/2020 8:49:41 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[LoaiKhachHang](
	[MaLoaiKH] [nvarchar](50) NOT NULL,
	[TenLoaiKH] [nvarchar](50) NOT NULL,
	[TienGiam] [int] NULL,
	[MoTa] [nvarchar](max) NULL,
 CONSTRAINT [PK_LoaiKhachHang] PRIMARY KEY CLUSTERED 
(
	[MaLoaiKH] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO
/****** Object:  Table [dbo].[LoaiPhong]    Script Date: 9/7/2020 8:49:41 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[LoaiPhong](
	[MaLoaiPhong] [nvarchar](50) NOT NULL,
	[TenLoaiPhong] [nvarchar](50) NOT NULL,
	[GiuongDon] [int] NULL,
	[GiuongDoi] [int] NULL,
	[GiaTheoGio] [money] NULL,
	[GiaTheoNgay] [money] NULL,
 CONSTRAINT [PK_LoaiPhong] PRIMARY KEY CLUSTERED 
(
	[MaLoaiPhong] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[Luong]    Script Date: 9/7/2020 8:49:41 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Luong](
	[MaLuong] [nvarchar](50) NOT NULL,
	[LuongTheoGio] [money] NOT NULL,
	[SoGioLam] [int] NOT NULL,
	[GhiChu] [nvarchar](max) NULL CONSTRAINT [DF_Luong_NgayBatDauLam]  DEFAULT (getdate()),
 CONSTRAINT [PK_Luong] PRIMARY KEY CLUSTERED 
(
	[MaLuong] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO
/****** Object:  Table [dbo].[NhanVien]    Script Date: 9/7/2020 8:49:41 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[NhanVien](
	[MaNhanVien] [nvarchar](50) NOT NULL,
	[TenNhanVien] [nvarchar](50) NOT NULL,
	[GioiTinh] [bit] NULL CONSTRAINT [DF_NhanVien_GioiTinh]  DEFAULT ('true'),
	[NgaySinh] [date] NULL,
	[SoDienThoai] [char](10) NULL,
	[MaLuong] [nvarchar](50) NULL,
	[DiaChi] [nvarchar](max) NULL,
	[Hinh] [nvarchar](max) NULL,
	[NgayBatDauLam] [date] NULL CONSTRAINT [DF_NhanVien_NgayBatDauLam]  DEFAULT (getdate()),
	[GhiChu] [nvarchar](255) NULL,
 CONSTRAINT [PK_NhanVien] PRIMARY KEY CLUSTERED 
(
	[MaNhanVien] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Phong]    Script Date: 9/7/2020 8:49:41 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Phong](
	[MaPhong] [nvarchar](50) NOT NULL,
	[MaLoaiPhong] [nvarchar](50) NOT NULL,
	[DienTich] [int] NULL,
	[MaTang] [int] NULL CONSTRAINT [DF_Phong_MaTang]  DEFAULT ((1)),
	[GiuongDon] [int] NULL CONSTRAINT [DF_Phong_GiuongDon]  DEFAULT ((0)),
	[GiuongDoi] [int] NULL CONSTRAINT [DF_Phong_GiuongDoi]  DEFAULT ((0)),
	[Hinh] [nvarchar](max) NULL,
	[TinhTrang] [nvarchar](50) NULL CONSTRAINT [DF_Phong_TinhTrang]  DEFAULT (N'trống'),
	[GhiChu] [nvarchar](255) NULL,
 CONSTRAINT [PK_Phong] PRIMARY KEY CLUSTERED 
(
	[MaPhong] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO
/****** Object:  Table [dbo].[Quyen]    Script Date: 9/7/2020 8:49:41 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Quyen](
	[MaQuyen] [nvarchar](50) NOT NULL,
	[TenQuyen] [nvarchar](50) NOT NULL,
	[MoTa] [nvarchar](255) NULL,
 CONSTRAINT [PK_Quyen] PRIMARY KEY CLUSTERED 
(
	[MaQuyen] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[User]    Script Date: 9/7/2020 8:49:41 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[User](
	[TenUser] [nvarchar](50) NOT NULL,
	[MatKhau] [nvarchar](50) NULL,
	[NgayLap] [date] NOT NULL CONSTRAINT [DF_User_NgayLap]  DEFAULT (getdate()),
	[MaQuyen] [nvarchar](50) NOT NULL,
	[GhiChu] [nvarchar](255) NULL,
	[MaNhanVien] [nvarchar](50) NOT NULL,
 CONSTRAINT [PK_User] PRIMARY KEY CLUSTERED 
(
	[TenUser] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET IDENTITY_INSERT [dbo].[DatPhong] ON 

INSERT [dbo].[DatPhong] ([MaDatPhong], [MaKhachHang], [MaPhong], [LoaiHinhThue], [NgayThue], [NgayRaDuKien], [SoNguoi], [TenUser], [TinhTrang], [TienDatCoc]) VALUES (1, N'KH', N'1', 1, CAST(N'2020-09-06 10:14:26.000' AS DateTime), CAST(N'2020-09-06 10:14:26.000' AS DateTime), 1, N'admin', N'Chưa thanh toán', 0.0000)
SET IDENTITY_INSERT [dbo].[DatPhong] OFF
INSERT [dbo].[DichVu] ([MaDichVu], [TenDichVu], [DonVi], [DonGia], [GhiChu]) VALUES (N'dv00123', N'nước dừa đê', N'cái', 10000.0000, N'')
INSERT [dbo].[DichVu] ([MaDichVu], [TenDichVu], [DonVi], [DonGia], [GhiChu]) VALUES (N'dv01', N'nước ngọt', N'lon', 10000.0000, N'nước ngọt cực mạnh')
INSERT [dbo].[DichVu] ([MaDichVu], [TenDichVu], [DonVi], [DonGia], [GhiChu]) VALUES (N'dv010', N'giặt đồ', N'kg', 50000.0000, N'giặt đồ is the best')
INSERT [dbo].[DichVu] ([MaDichVu], [TenDichVu], [DonVi], [DonGia], [GhiChu]) VALUES (N'dv02', N'bia', N'lon', 16000.0000, N'')
INSERT [dbo].[DichVu] ([MaDichVu], [TenDichVu], [DonVi], [DonGia], [GhiChu]) VALUES (N'dv03', N'khăn ướt', N'cái', 1000.0000, N'')
INSERT [dbo].[DichVu] ([MaDichVu], [TenDichVu], [DonVi], [DonGia], [GhiChu]) VALUES (N'dv04', N'mỳ tôm hảo hảo', N'lon', 3000.0000, N'mỳ tôm y như quảng cáo')
INSERT [dbo].[DichVu] ([MaDichVu], [TenDichVu], [DonVi], [DonGia], [GhiChu]) VALUES (N'dv05', N'my 3 mien', N'cái', 3000.0000, N'')
INSERT [dbo].[DichVu] ([MaDichVu], [TenDichVu], [DonVi], [DonGia], [GhiChu]) VALUES (N'DV06', N'Mỳ Xào', N'phần', 100000.0000, N'')
INSERT [dbo].[DichVu] ([MaDichVu], [TenDichVu], [DonVi], [DonGia], [GhiChu]) VALUES (N'DV07', N'Cơm Chiên', N'phần', 50000.0000, N'')
SET IDENTITY_INSERT [dbo].[Khac] ON 

INSERT [dbo].[Khac] ([ID], [GiaTriSo], [GiaTriTG], [MoTa]) VALUES (3, 5, CAST(N'12:00:00' AS Time), N'qua mốc checkin1 ')
INSERT [dbo].[Khac] ([ID], [GiaTriSo], [GiaTriTG], [MoTa]) VALUES (4, 1, CAST(N'12:00:00' AS Time), N'quá mốc checkin2')
INSERT [dbo].[Khac] ([ID], [GiaTriSo], [GiaTriTG], [MoTa]) VALUES (5, 2, CAST(N'14:00:00' AS Time), N'mốc checkout2')
INSERT [dbo].[Khac] ([ID], [GiaTriSo], [GiaTriTG], [MoTa]) VALUES (6, 5, CAST(N'14:00:00' AS Time), N'mốc checkout1')
INSERT [dbo].[Khac] ([ID], [GiaTriSo], [GiaTriTG], [MoTa]) VALUES (7, 30, NULL, N'phụ thu checkin1')
INSERT [dbo].[Khac] ([ID], [GiaTriSo], [GiaTriTG], [MoTa]) VALUES (8, 50, NULL, N'phụ thu checkin2')
INSERT [dbo].[Khac] ([ID], [GiaTriSo], [GiaTriTG], [MoTa]) VALUES (9, 20, NULL, N'phụ thu checkout1')
INSERT [dbo].[Khac] ([ID], [GiaTriSo], [GiaTriTG], [MoTa]) VALUES (10, 30, NULL, N'phụ thu checkout1')
SET IDENTITY_INSERT [dbo].[Khac] OFF
INSERT [dbo].[KhachHang] ([MaKhachHang], [MaLoaiKH], [TenKhachHang], [Tuoi], [GioiTinh], [SoDienThoai], [SoCMND]) VALUES (N'KH', N'1', N'Anh Đức', 22, 1, N'0987654321', N'1234567890  ')
INSERT [dbo].[LoaiKhachHang] ([MaLoaiKH], [TenLoaiKH], [TienGiam], [MoTa]) VALUES (N'1', N'Khách Quen', 20, N'')
INSERT [dbo].[LoaiPhong] ([MaLoaiPhong], [TenLoaiPhong], [GiuongDon], [GiuongDoi], [GiaTheoGio], [GiaTheoNgay]) VALUES (N'1', N'Standard', NULL, NULL, 50000.0000, 1000000.0000)
INSERT [dbo].[LoaiPhong] ([MaLoaiPhong], [TenLoaiPhong], [GiuongDon], [GiuongDoi], [GiaTheoGio], [GiaTheoNgay]) VALUES (N'2', N'Superior', NULL, NULL, 100000.0000, 2000000.0000)
INSERT [dbo].[Luong] ([MaLuong], [LuongTheoGio], [SoGioLam], [GhiChu]) VALUES (N'lương quản lý', 100000.0000, 4, N'')
INSERT [dbo].[NhanVien] ([MaNhanVien], [TenNhanVien], [GioiTinh], [NgaySinh], [SoDienThoai], [MaLuong], [DiaChi], [Hinh], [NgayBatDauLam], [GhiChu]) VALUES (N'1', N'Anh Đức', 1, CAST(N'1999-02-22' AS Date), N'1122334455', N'lương quản lý', N'Hải Phòng', N'118699043_306429483988927_3842679412438114146_n.jpg', CAST(N'2020-01-07' AS Date), N'')
INSERT [dbo].[NhanVien] ([MaNhanVien], [TenNhanVien], [GioiTinh], [NgaySinh], [SoDienThoai], [MaLuong], [DiaChi], [Hinh], [NgayBatDauLam], [GhiChu]) VALUES (N'2', N'Nguyễn Đức Duy', 1, CAST(N'1999-06-08' AS Date), N'0987656754', N'lương quản lý', N'', N'87058684_581331285785571_9197526422611034112_n.jpg', CAST(N'2020-09-04' AS Date), N'')
INSERT [dbo].[Phong] ([MaPhong], [MaLoaiPhong], [DienTich], [MaTang], [GiuongDon], [GiuongDoi], [Hinh], [TinhTrang], [GhiChu]) VALUES (N'1', N'1', 20, 1, 1, 0, N'null', N'sudung', N'')
INSERT [dbo].[Phong] ([MaPhong], [MaLoaiPhong], [DienTich], [MaTang], [GiuongDon], [GiuongDoi], [Hinh], [TinhTrang], [GhiChu]) VALUES (N'2', N'1', 20, 1, 1, 0, N'null', N'trong', N'')
INSERT [dbo].[Phong] ([MaPhong], [MaLoaiPhong], [DienTich], [MaTang], [GiuongDon], [GiuongDoi], [Hinh], [TinhTrang], [GhiChu]) VALUES (N'3', N'1', 20, 1, 1, 0, N'null', N'trong', N'')
INSERT [dbo].[Phong] ([MaPhong], [MaLoaiPhong], [DienTich], [MaTang], [GiuongDon], [GiuongDoi], [Hinh], [TinhTrang], [GhiChu]) VALUES (N'4', N'2', 30, 1, 0, 2, N'null', N'trong', N'')
INSERT [dbo].[Phong] ([MaPhong], [MaLoaiPhong], [DienTich], [MaTang], [GiuongDon], [GiuongDoi], [Hinh], [TinhTrang], [GhiChu]) VALUES (N'5', N'2', 30, 1, 0, 2, N'null', N'trong', N'')
INSERT [dbo].[Quyen] ([MaQuyen], [TenQuyen], [MoTa]) VALUES (N'NhanVien', N'Nhân viên', NULL)
INSERT [dbo].[Quyen] ([MaQuyen], [TenQuyen], [MoTa]) VALUES (N'QuanLy', N'Quản lý', NULL)
INSERT [dbo].[User] ([TenUser], [MatKhau], [NgayLap], [MaQuyen], [GhiChu], [MaNhanVien]) VALUES (N'admin', N'admin', CAST(N'2019-11-07' AS Date), N'QuanLy', NULL, N'1')
INSERT [dbo].[User] ([TenUser], [MatKhau], [NgayLap], [MaQuyen], [GhiChu], [MaNhanVien]) VALUES (N'duypink', N'admin', CAST(N'2020-09-06' AS Date), N'NhanVien', NULL, N'2')
ALTER TABLE [dbo].[ChiTietDichVu] ADD  CONSTRAINT [DF_ChiTietDichVu_SoLuong]  DEFAULT ((1)) FOR [SoLuong]
GO
ALTER TABLE [dbo].[ChiTietDichVu]  WITH CHECK ADD  CONSTRAINT [FK_ChiTietDichVu_DatPhong] FOREIGN KEY([MaDatPhong])
REFERENCES [dbo].[DatPhong] ([MaDatPhong])
GO
ALTER TABLE [dbo].[ChiTietDichVu] CHECK CONSTRAINT [FK_ChiTietDichVu_DatPhong]
GO
ALTER TABLE [dbo].[ChiTietDichVu]  WITH CHECK ADD  CONSTRAINT [FK_ChiTietDichVu_DichVu] FOREIGN KEY([MaDichVu])
REFERENCES [dbo].[DichVu] ([MaDichVu])
GO
ALTER TABLE [dbo].[ChiTietDichVu] CHECK CONSTRAINT [FK_ChiTietDichVu_DichVu]
GO
ALTER TABLE [dbo].[ChiTietLuong]  WITH CHECK ADD  CONSTRAINT [FK_ChiTietLuong_NhanVien] FOREIGN KEY([MaNhanVien])
REFERENCES [dbo].[NhanVien] ([MaNhanVien])
GO
ALTER TABLE [dbo].[ChiTietLuong] CHECK CONSTRAINT [FK_ChiTietLuong_NhanVien]
GO
ALTER TABLE [dbo].[DatPhong]  WITH CHECK ADD  CONSTRAINT [FK_DatPhong_KhachHang] FOREIGN KEY([MaKhachHang])
REFERENCES [dbo].[KhachHang] ([MaKhachHang])
GO
ALTER TABLE [dbo].[DatPhong] CHECK CONSTRAINT [FK_DatPhong_KhachHang]
GO
ALTER TABLE [dbo].[DatPhong]  WITH CHECK ADD  CONSTRAINT [FK_DatPhong_Phong] FOREIGN KEY([MaPhong])
REFERENCES [dbo].[Phong] ([MaPhong])
GO
ALTER TABLE [dbo].[DatPhong] CHECK CONSTRAINT [FK_DatPhong_Phong]
GO
ALTER TABLE [dbo].[DatPhong]  WITH CHECK ADD  CONSTRAINT [FK_DatPhong_User] FOREIGN KEY([TenUser])
REFERENCES [dbo].[User] ([TenUser])
GO
ALTER TABLE [dbo].[DatPhong] CHECK CONSTRAINT [FK_DatPhong_User]
GO
ALTER TABLE [dbo].[HoaDon]  WITH CHECK ADD  CONSTRAINT [FK_HoaDon_DatPhong] FOREIGN KEY([MaDatPhong])
REFERENCES [dbo].[DatPhong] ([MaDatPhong])
GO
ALTER TABLE [dbo].[HoaDon] CHECK CONSTRAINT [FK_HoaDon_DatPhong]
GO
ALTER TABLE [dbo].[KhachHang]  WITH CHECK ADD  CONSTRAINT [FK_KhachHang_LoaiKhachHang] FOREIGN KEY([MaLoaiKH])
REFERENCES [dbo].[LoaiKhachHang] ([MaLoaiKH])
GO
ALTER TABLE [dbo].[KhachHang] CHECK CONSTRAINT [FK_KhachHang_LoaiKhachHang]
GO
ALTER TABLE [dbo].[NhanVien]  WITH CHECK ADD  CONSTRAINT [FK_NhanVien_Luong] FOREIGN KEY([MaLuong])
REFERENCES [dbo].[Luong] ([MaLuong])
GO
ALTER TABLE [dbo].[NhanVien] CHECK CONSTRAINT [FK_NhanVien_Luong]
GO
ALTER TABLE [dbo].[Phong]  WITH CHECK ADD  CONSTRAINT [FK_Phong_LoaiPhong] FOREIGN KEY([MaLoaiPhong])
REFERENCES [dbo].[LoaiPhong] ([MaLoaiPhong])
GO
ALTER TABLE [dbo].[Phong] CHECK CONSTRAINT [FK_Phong_LoaiPhong]
GO
ALTER TABLE [dbo].[User]  WITH CHECK ADD  CONSTRAINT [FK_User_NhanVien] FOREIGN KEY([MaNhanVien])
REFERENCES [dbo].[NhanVien] ([MaNhanVien])
GO
ALTER TABLE [dbo].[User] CHECK CONSTRAINT [FK_User_NhanVien]
GO
ALTER TABLE [dbo].[User]  WITH CHECK ADD  CONSTRAINT [FK_User_Quyen] FOREIGN KEY([MaQuyen])
REFERENCES [dbo].[Quyen] ([MaQuyen])
GO
ALTER TABLE [dbo].[User] CHECK CONSTRAINT [FK_User_Quyen]
GO
USE [master]
GO
ALTER DATABASE [QuanLyKhachSan] SET  READ_WRITE 
GO
