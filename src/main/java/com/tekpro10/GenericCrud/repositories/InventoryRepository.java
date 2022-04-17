package com.tekpro10.GenericCrud.repositories;

import com.tekpro10.GenericCrud.entities.InventoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InventoryRepository extends JpaRepository<InventoryEntity,Integer> {
}
