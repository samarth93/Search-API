package com.makersharks.suppliersearchapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class SupplierService {

    @Autowired
    private SupplierRepository supplierRepository;

    public Supplier createSupplier(Supplier supplier) {
        return supplierRepository.save(supplier);
    }

    public Supplier getSupplierById(Long id) {
        return supplierRepository.findById(id).orElse(null);
    }

    public Page<Supplier> getSuppliers(String location, NatureOfBusiness natureOfBusiness, ManufacturingProcess manufacturingProcess, int page, int size) {
        Pageable pageable = PageRequest.of(page, size);
        return supplierRepository.findByLocationAndNatureOfBusinessAndManufacturingProcessesContains(location, natureOfBusiness, manufacturingProcess, pageable);
    }

    public Supplier updateSupplier(Long id, Supplier supplier) {
        if (supplierRepository.existsById(id)) {
            supplier.setSupplierId(id);
            return supplierRepository.save(supplier);
        }
        return null;
    }

    public void deleteSupplier(Long id) {
        supplierRepository.deleteById(id);
    }
}
