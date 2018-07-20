package com.microservice.licenseservice.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "licenses")
public class License {
	@Id
	@Column(name = "license_id", nullable = false)
	private String licenseId;

	@Column(name = "organization_id", nullable = false)
	private String organizationId;

	@Column(name = "product_name", nullable = false)
	private String productName;

	@Column(name = "license_type", nullable = false)
	private String licenseType;

	@Column(name = "comment", nullable = false)
	private String comment;

	public String getlicenseId() {
		return licenseId;
	}

	public void setlicenseId(String id) {
		this.licenseId = id;
	}

	public String getOrganizationId() {
		return organizationId;
	}

	public void setOrganizationId(String organizationId) {
		this.organizationId = organizationId;
	}

	public String getLicenseType() {
		return licenseType;
	}

	public void setLicenseType(String licenseType) {
		this.licenseType = licenseType;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getComment() {
		return this.comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public License withId(String id) {
		this.setlicenseId(id);
		return this;
	}

	public License withOrganizationId(String organizationId) {
		this.setOrganizationId(organizationId);
		return this;
	}

	public License withProductName(String productName) {
		this.setProductName(productName);
		return this;
	}

	public License withLicenseType(String licenseType) {
		this.setLicenseType(licenseType);
		return this;
	}

	public License withComment(String comment) {
		this.setComment(comment);
		return this;
	}
}
