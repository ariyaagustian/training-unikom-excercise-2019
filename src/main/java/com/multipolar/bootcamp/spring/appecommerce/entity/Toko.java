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
@Table(name = "master_toko")
public class Toko {

    @Id
    @GenericGenerator(name = "uuid_gen", strategy = "uuid2")
    @GeneratedValue(generator = "uuid_gen")
    @Column(name = "id", nullable = false, unique = true, length = 50)
    private String id;

    @Column(name = "nama_toko", nullable = false, length = 255)
    private String nama_toko;

    @Column(name = "alamat", nullable = false, length = 255)
    private String alamat;

    @Column(name = "telepon", nullable = false, unique = true, length = 255)
    private String telepon;

}
