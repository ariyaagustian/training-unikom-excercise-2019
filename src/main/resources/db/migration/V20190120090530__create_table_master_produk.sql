CREATE TABLE `master_produk` (
  `id` varchar(50) NOT NULL PRIMARY KEY,
  `nama_produk` varchar(255) NOT NULL,
  `harga_produk` double NOT NULL,
   `created_by` varchar (50),
   created_date timestamp default now(),
   id_toko varchar (50) not NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;




