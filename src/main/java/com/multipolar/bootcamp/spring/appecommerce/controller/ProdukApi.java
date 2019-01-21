package com.multipolar.bootcamp.spring.appecommerce.controller;


import com.multipolar.bootcamp.spring.appecommerce.entity.Produk;
import com.multipolar.bootcamp.spring.appecommerce.entity.Toko;
import com.multipolar.bootcamp.spring.appecommerce.repository.ProdukRepository;
import com.multipolar.bootcamp.spring.appecommerce.repository.TokoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Optional;

@RestController
@RequestMapping("api/produk")
public class ProdukApi {

    @Autowired
    private ProdukRepository produkRepository;


    @GetMapping("/list")
    public Iterable<Produk> findAll() {
        return produkRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Produk> findById(@PathVariable("id") String id) {
        Optional<Produk> produkOptional = produkRepository.findById(id);
        if (produkOptional.isPresent())
            return ResponseEntity.ok(produkOptional.get());
        else
            return ResponseEntity.noContent().build();
    }






    @RequestMapping(path = "/", method = RequestMethod.POST)
    public ResponseEntity<Produk> save(Principal principal, @RequestBody Produk produk) {
        produk.setCreated_by(principal.getName());
        produk.setCreated_date(Timestamp.valueOf(LocalDateTime.now()));
        produk = produkRepository.save(produk);
        return ResponseEntity.ok(produk);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteById(@PathVariable("id") String id) {
        Optional<Produk> produkOptional = produkRepository.findById(id);
        if (produkOptional.isPresent()) {
            produkRepository.deleteById(id);
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.noContent().build();
        }
    }




}
