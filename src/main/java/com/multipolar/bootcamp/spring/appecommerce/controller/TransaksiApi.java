package com.multipolar.bootcamp.spring.appecommerce.controller;

import com.multipolar.bootcamp.spring.appecommerce.entity.Transaksi;
import com.multipolar.bootcamp.spring.appecommerce.service.TransaksiService;
import org.omg.IOP.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Optional;

@RestController
@RequestMapping("/api/transaksi")
public class TransaksiApi {

    @Autowired
    private TransaksiService service;

    @GetMapping("/list")
    public Iterable<Transaksi> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Transaksi> findById(@PathVariable("id") String id) {
        Optional<Transaksi> transaksiOptional = service.findById(id);
        if (transaksiOptional.isPresent())
            return ResponseEntity.ok(transaksiOptional.get());
        else
            return ResponseEntity.noContent().build();
    }

    @PostMapping("/")
    public ResponseEntity<Transaksi> penjualan(Principal principal,
                                               @RequestBody Transaksi transaksi) {
        transaksi.setCreated_by(principal.getName());
        transaksi.setTanggal_pembelian(Timestamp.valueOf(LocalDateTime.now()));
        transaksi = service.penjualan(transaksi);
        return ResponseEntity.ok(transaksi);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Transaksi> transaksiById(@PathVariable("id") String id) {
        Optional<Transaksi> transaksiOptional = service.findById(id);
        if (!transaksiOptional.isPresent())
            return ResponseEntity.noContent().build();
        else {
            service.penjualan(transaksiOptional.get());
            return ResponseEntity.ok().build();
        }
    }
}
