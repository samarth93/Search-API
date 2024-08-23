package com.makersharks.suppliersearchapi;

public class SupplierRequest {
    private String location;
    private NatureOfBusiness natureOfBusiness;
    private ManufacturingProcess manufacturingProcess;
    private int page = 0;
    private int size = 10;

    
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public NatureOfBusiness getNatureOfBusiness() {
        return natureOfBusiness;
    }

    public void setNatureOfBusiness(NatureOfBusiness natureOfBusiness) {
        this.natureOfBusiness = natureOfBusiness;
    }

    public ManufacturingProcess getManufacturingProcess() {
        return manufacturingProcess;
    }

    public void setManufacturingProcess(ManufacturingProcess manufacturingProcess) {
        this.manufacturingProcess = manufacturingProcess;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
