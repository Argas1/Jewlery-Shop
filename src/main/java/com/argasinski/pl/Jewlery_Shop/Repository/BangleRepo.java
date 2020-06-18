package com.argasinski.pl.Jewlery_Shop.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BangleRepo extends JpaRepository<com.argasinki.pl.Jewlery_Shop.Entity.Bangle,Long> {
    com.argasinki.pl.Jewlery_Shop.Entity.Bangle findByName(String name);
}
