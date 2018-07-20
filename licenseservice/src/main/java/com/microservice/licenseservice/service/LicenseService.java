package com.microservice.licenseservice.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservice.licenseservice.config.LicenseConfig;
import com.microservice.licenseservice.models.License;
import com.microservice.licenseservice.respository.LicenseRepository;

@Service
public class LicenseService {
	@Autowired
	private LicenseRepository licenseRepository;

	@Autowired
	LicenseConfig config;

	public License getLicense(String organizationId, String licenseId) {
		License license = licenseRepository.findByOrganizationIdAndLicenseId(organizationId, licenseId);
		return license.withComment(config.getExampleProperty());
	}

	public List<License> getLicensesByOrg(String organizationId) {
		return licenseRepository.findByOrganizationId(organizationId);
	}

	public void saveLicense(License license) {
		license.withId(UUID.randomUUID().toString());
		licenseRepository.save(license);

	}

}
