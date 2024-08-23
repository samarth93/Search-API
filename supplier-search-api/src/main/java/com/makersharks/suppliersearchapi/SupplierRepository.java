package com.makersharks.suppliersearchapi;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SupplierRepository extends JpaRepository<Supplier, Long> {
    Page<Supplier> findByLocationAndNatureOfBusinessAndManufacturingProcessesContains(
        String location,
        NatureOfBusiness natureOfBusiness,
        ManufacturingProcess manufacturingProcess,
        Pageable pageable
    );
}
