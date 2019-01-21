package com.multipolar.bootcamp.spring.appecommerce.service;

import com.multipolar.bootcamp.spring.appecommerce.entity.DetailTransaksi;
import com.multipolar.bootcamp.spring.appecommerce.entity.Transaksi;
import com.multipolar.bootcamp.spring.appecommerce.repository.DetailTransaksiRepository;
import com.multipolar.bootcamp.spring.appecommerce.repository.TransaksiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
@Transactional(readOnly = true)
public class TransaksiService {

    @Autowired
    private TransaksiRepository transaksiRepository;
    @Autowired
    private DetailTransaksiRepository detailTransaksiRepository;

    public Iterable<Transaksi> findAll() {
        return transaksiRepository.findAll();
    }

    public Optional<Transaksi> findById(String id) {
        return this.transaksiRepository.findById(id);
    }

    @Transactional
    public Transaksi penjualan (Transaksi transaksi) {
        List<DetailTransaksi> newDetail = transaksi.getDetails();
        transaksi = transaksiRepository.save(transaksi);
        for (DetailTransaksi details : newDetail) {
            details.setTransaksi(transaksi);
            detailTransaksiRepository.save(details);
        }
        Optional<Transaksi> transaksiOptional = transaksiRepository.findById(transaksi.getId());
        return transaksiOptional.get();
    }

}