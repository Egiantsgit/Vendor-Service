package com.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.domain.Vendor;

public interface VendorRepository extends JpaRepository<Vendor,Integer>{

	@Query("SELECT p FROM Vendor p WHERE p.vendor_id = :vendor_id")
    public Vendor find(@Param("vendor_id") int vendorId);
	
	
	@Query("SELECT DISTINCT p.vendorCompanyName FROM Vendor p")
	public List<String> getCompanies();
	
	
	@Query("SELECT p FROM Vendor p where p.vendorCompanyName= :vendorCompanyName")
	public List<Vendor> getVendorbyCompany(@Param("vendorCompanyName") String vendorCompany);
}

