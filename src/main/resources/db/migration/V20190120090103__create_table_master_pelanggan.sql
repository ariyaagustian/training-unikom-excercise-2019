CREATE TABLE `master_pelanggan` (
  `id_pelanggan` varchar(50) NOT NULL PRIMARY KEY,
  `email` varchar(255) NOT NULL UNIQUE,
  `password` varchar(255) NOT NULL,
  `nama_pelanggan` varchar(255) NOT NULL,
  `alamat` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO master_pelanggan (id_pelanggan, email, password, nama_pelanggan, alamat) VALUES
('001', 'ariyaagustian1@gmail.com', 'admin', 'ariya agustian', 'babakan tarogong'),
('002', 'ariyaagustian2@gmail.com', 'admin', 'ariya agustian', 'babakan tarogong'),
('003', 'ariyaagustian3@gmail.com', 'admin', 'ariya agustian', 'babakan tarogong'),
('004', 'ariyaagustian4@gmail.com', 'admin', 'ariya agustian', 'babakan tarogong'),
('005', 'ariyaagustian5@gmail.com', 'admin', 'ariya agustian', 'babakan tarogong');