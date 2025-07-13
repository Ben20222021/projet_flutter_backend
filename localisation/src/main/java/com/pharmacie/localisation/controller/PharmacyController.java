package com.pharmacie.localisation.controller;

import com.pharmacie.localisation.model.Pharmacy;
import com.pharmacie.localisation.service.PharmacyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pharmacies")
public class PharmacyController {

    @Autowired
    private PharmacyService pharmacyService;

     @GetMapping("/get")
    public List<Pharmacy> getAllPharmacies() {
        return pharmacyService.getAllPharmacies();
    }

     @PostMapping("/post")
    public void addPharmacy(@RequestParam double longitude, @RequestParam double latitude,@RequestParam String name) {
        pharmacyService.savePharmacy(new Pharmacy(name, "", latitude, longitude));
    }

     @GetMapping("/get{id}")
    public Pharmacy getPharmacyById(@PathVariable Long id) {
        return pharmacyService.getPharmacyById(id);
    }

     @DeleteMapping("/del")
    public void deletePharmacy(@RequestParam Long id) {
         pharmacyService.deletePharmacy(id);
    }
}
