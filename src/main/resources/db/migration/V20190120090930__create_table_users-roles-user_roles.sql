CREATE TABLE `users` (
  `id` varchar(50) NOT NULL PRIMARY KEY,
  `username` varchar(100) NOT NULL,
  `password` varchar(255) NOT NULL,
  `is_enabled` tinyint(4) NOT NULL DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `roles` (
  `id` int(11) NOT NULL PRIMARY KEY AUTO_INCREMENT,
  `role_name` varchar(255) NOT NULL UNIQUE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `user_roles` (
  `id` varchar(50) NOT NULL PRIMARY KEY,
  `user_id` varchar(50) NOT NULL,
  `role_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


insert into roles(id, role_name) values
(1, 'ROLE_ADMIN'), (2, 'ROLE_USER'),(3, 'ROLE_OPERATOR');

insert into users(id, username, password, is_enabled) values
('001', 'admin', '$2a$11$rs1QsXV4iA0F3/rc4lPf5u2nSDhPbxmAnY4BvRgSoVIMDdjlNAZVe', true),
('002', 'user', '$2a$11$lWwWP0YWUVovprOPZcCFduGneka99pYcdwQEScosyQLCJiUcP.JJ2', true),
('003', 'disabledUser', '$2a$11$GeTM5PZ9zmHJHD3KN7BdjuJg03QDZ6SV0z2Jv/adYYNVEcq2YJunW', false);

insert into user_roles(id, user_id, role_id) values
(uuid(), '001', 1),
(uuid(), '001', 2),
(uuid(), '001', 3),
(uuid(), '002', 2),
(uuid(), '002', 3),
(uuid(), '003', 1);

