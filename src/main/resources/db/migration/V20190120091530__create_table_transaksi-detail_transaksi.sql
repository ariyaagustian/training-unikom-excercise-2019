CREATE TABLE `transaksi_penjualan` (
  `id` varchar(50) NOT NULL PRIMARY KEY,
  `id_pelanggan` varchar(50) NOT NULL,
  created_by varchar (50),
  tanggal_pembelian timestamp default now()
) ENGINE=InnoDB DEFAULT CHARSET=utf8;



CREATE TABLE `detail_transaksi_penjualan` (
  `id` varchar (50) NOT NULL PRIMARY KEY,
  `id_transaksi` varchar(50) NOT NULL,
  `id_produk` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;