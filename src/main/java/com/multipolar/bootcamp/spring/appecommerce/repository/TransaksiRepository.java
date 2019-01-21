package com.multipolar.bootcamp.spring.appecommerce.repository;

import com.multipolar.bootcamp.spring.appecommerce.entity.Transaksi;
import org.springframework.data.repository.CrudRepository;

public interface TransaksiRepository extends CrudRepository<Transaksi, String > {
}
