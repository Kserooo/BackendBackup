package com.ksero.backendkseroapi.ksero.domain.persistence;

import com.ksero.backendkseroapi.ksero.domain.model.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WholesalerOrderRepository extends JpaRepository<Product,Long> {
}
