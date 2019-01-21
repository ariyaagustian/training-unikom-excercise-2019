alter table master_produk
  add constraint fk_produk_toko foreign key (id_toko)
    references master_toko (id) on update cascade on delete restrict;