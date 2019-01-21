package com.multipolar.bootcamp.spring.appecommerce.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "detail_transaksi_penjualan")
public class DetailTransaksi {

    @Id
    private Integer id;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "id_transaksi", nullable = false)
    private Transaksi transaksi;

    @ManyToOne
    @JoinColumn(name = "id_produk", nullable = false)
    private Produk produk;


}