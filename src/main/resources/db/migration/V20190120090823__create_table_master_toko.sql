CREATE TABLE `master_toko` (
  `id` varchar(50) NOT NULL PRIMARY KEY,
  `nama_toko` varchar(255) NOT NULL,
  `alamat` varchar(255) DEFAULT NULL,
  `telepon` varchar(255) NOT NULL UNIQUE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


INSERT INTO master_toko (id, nama_toko, alamat, telepon) VALUES
('001', 'palugada 1', 'babakan tarogong', '082192919238'),
('002', 'palugada 2', 'babakan tarogong', '082192919237'),
('003', 'palugada 3', 'babakan tarogong', '082192919236'),
('004', 'palugada 4', 'babakan tarogong', '082192919235'),
('005', 'palugada 5', 'babakan tarogong', '082192919234');