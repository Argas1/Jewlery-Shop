package com.argasinski.pl.Jewlery_Shop.Service;

import com.argasinski.pl.Jewlery_Shop.Entity.Bangle;
import com.argasinski.pl.Jewlery_Shop.Repository.BangleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BangleService {
    @Autowired
    private BangleRepo bangleRepo;
    public Bangle saveBangle(Bangle bangle){
        S save =bangleRepo.save(bangle);
        return save;
    }
    public List<Bangle> saveBangles(List<Bangle> bangles){
        return bangleRepo.saveAll(bangles);
    }
    public List<Bangle> getBangles(){
        return bangleRepo.findAll();
    }
    public Bangle getBanglesById(Long id) {
        return bangleRepo.findById(id).orElse(null);
    }
    public Bangle getBanglesByName(String name) {
        return bangleRepo.findByName(name);
    }
    public String deleteById(Long id){
        bangleRepo.deleteById(id);
        return "Bangle remove !"+ id;
    }
    public Bangle updateBangle(Bangle bangle){
        Bangle existingBangle=bangleRepo.findById(bangle.getId()).orElse(null);
        existingBangle.setName(bangle.getName());
        existingBangle.setDescription(bangle.getDescription());
        existingBangle.setColor(bangle.getColor());
        return bangleRepo.save(existingBangle);
    }
}
