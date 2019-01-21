package com.multipolar.bootcamp.spring.appecommerce.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@ToString(exclude = "daftarProduk")
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


    @JsonIgnore
    @OneToMany(mappedBy = "toko")
    private List<Produk> daftarProduk = new ArrayList<>();

}
