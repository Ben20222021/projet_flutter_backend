package com.pharmacie.localisation.repository;

import com.pharmacie.localisation.model.Pharmacy;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PharmacyRepository extends JpaRepository<Pharmacy, Long> {
}
