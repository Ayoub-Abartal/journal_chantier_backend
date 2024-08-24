package com.abartal.Journal_chantier.repositories;

import com.abartal.Journal_chantier.entities.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryRepository extends JpaRepository<Inventory,Long> {
}
