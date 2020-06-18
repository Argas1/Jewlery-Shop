package com.argasinski.pl.Jewlery_Shop.Controller;

import com.argasinski.pl.Jewlery_Shop.Entity.Bangle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BangleController<BangleService> {
    @Autowired
    private BangleService bangleService;

    @PostMapping("/addBangle")
    public Bangle addBangle(@RequestBody Bangle bangle) {
        return bangleService.saveBangle(bangle);
    }

    @PostMapping("/addBangles")
    public List<Bangle> addBangles(@RequestBody List<Bangle> bangles) {
        return bangleService.saveBangles(bangles);
    }
    @GetMapping("/bangles")
    public List<Bangle> findAllBangles(){
        return bangleService.getBangles();
    }
    @GetMapping("/bangles/{id}")
    public Bangle findBangleById(@PathVariable  Long id){
        return bangleService.getBanglesById(id);
    }
    @GetMapping("/bangles/{name}")
    public Bangle findBangleByName(@PathVariable String name){
        return bangleService.getBanglesByName(name);
    }
    @PutMapping("/update")
    public Bangle updateBangle(@RequestBody Bangle bangle) {
        return bangleService.updateBangle(bangle);
    }
    @DeleteMapping("/delete/{id}")
    public String deleteBangle(@PathVariable Long id){
        return bangleService.deleteById(id);
    }
}
