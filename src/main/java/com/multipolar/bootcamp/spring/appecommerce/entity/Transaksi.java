package com.multipolar.bootcamp.spring.appecommerce.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "transaksi_penjualan")
public class Transaksi {

    @Id
    @GenericGenerator(name = "uuid_gen", strategy = "uuid2")
    @GeneratedValue(generator = "uuid_gen")
    @Column(name = "id", nullable = false, unique = true)
    private String id;

    @ManyToOne
    @JoinColumn(name = "id_pelanggan", nullable = false)
    private Pelanggan id_pelanggan;

    @Column(name = "created_by")
    private String created_by;

    @Type(type = "timestamp")
    @Column(name = "tanggal_pembelian")
    private Date tanggal_pembelian;

    @OneToMany(mappedBy = "transaksi")
    public List<DetailTransaksi> details = new ArrayList<>();



}

