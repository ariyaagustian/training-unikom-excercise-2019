CREATE TABLE `master_produk` (
  `id` varchar(50) NOT NULL PRIMARY KEY,
  `nama_produk` varchar(255) NOT NULL,
  `harga_produk` double NOT NULL,
   `created_by` varchar (50),
   created_date timestamp default now(),
   id_toko varchar (50)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


INSERT INTO master_produk (id, nama_produk, harga_produk) VALUES
('001', 'buku gambar 1', 10000),
('002', 'buku gambar 2', 20000),
('003', 'buku gambar 3', 30000),
('004', 'buku gambar 4', 40000),
('005', 'buku gambar 5', 50000);



