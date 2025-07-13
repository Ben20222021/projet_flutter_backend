package com.pharmacie.localisation.service;

import com.pharmacie.localisation.model.Pharmacy;
import com.pharmacie.localisation.repository.PharmacyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PharmacyService {

    @Autowired
    private PharmacyRepository pharmacyRepository;

    public List<Pharmacy> getAllPharmacies() {
        return pharmacyRepository.findAll();
    }

    public Pharmacy savePharmacy(Pharmacy pharmacy) {
        return pharmacyRepository.save(pharmacy);
    }

    public Pharmacy getPharmacyById(Long id) {
        Optional<Pharmacy> optional = pharmacyRepository.findById(id);
        return optional.orElse(null);
    }

    public Pharmacy deletePharmacy(Long id) {
        Pharmacy pharmacy = getPharmacyById(id);
        if (pharmacy == null) {
            return null; // 
        }
        pharmacyRepository.deleteById(id);
        return pharmacy; 
    }
}
