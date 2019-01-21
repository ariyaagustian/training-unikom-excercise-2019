CREATE TABLE `transaksi_penjualan` (
  `id` varchar(50) NOT NULL PRIMARY KEY,
  `tanggal_pembelian` date NOT NULL,
  `id_pelanggan` varchar(50) NOT NULL,
  `id_user` varchar(50) NOT NULL,
  created_by varchar (50),
  created_date timestamp default now()
) ENGINE=InnoDB DEFAULT CHARSET=utf8;



CREATE TABLE `detail_transaksi_penjualan` (
  `id` int(11) NOT NULL PRIMARY KEY AUTO_INCREMENT,
  `id_transaksi` varchar(50) NOT NULL,
  `id_produk` varchar(50) NOT NULL,
  `total` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;