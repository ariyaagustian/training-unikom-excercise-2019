package com.multipolar.bootcamp.spring.appecommerce.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "master_pelanggan")
public class Pelanggan {

    @Id
    @GenericGenerator(name = "uuid_gen", strategy = "uuid2")
    @GeneratedValue(generator = "uuid_gen")
    @Column(name = "id_pelanggan", nullable = false, unique = true)
    private String id_pelanggan;

    @Column(name = "email", nullable = false, length = 255)
    private String email;

    @Column(name = "password", nullable = false, length = 255)
    private String password;

    @Column(name = "nama_pelanggan", nullable = false, length = 255)
    private String nama_pelanggan;

    @Column(name = "alamat", length = 255)
    private String alamat;

}
