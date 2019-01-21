package com.multipolar.bootcamp.spring.appecommerce.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.Date;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "master_produk")
public class Produk {

    @Id
    @GenericGenerator(name = "uuid_gen", strategy = "uuid2")
    @GeneratedValue(generator = "uuid_gen")
    @Column(name = "id", nullable = false, unique = true, length = 50)
    private String id;

    @Column(name = "nama_produk", nullable = false, length = 255)
    private String nama_produk;

    @Column(name = "harga_produk", nullable = false)
    private Double harga_produk;

    @Column(name = "created_by")
    private String created_by;

    @Column(name = "created_date")
    @Type(type = "timestamp")
    private Date created_date;


}
