package net.authorize.data.xml;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @deprecated Starting Release <X.X> August 2018 the Authorize.Net API has been reorganized to simplify & ease integration and to be more merchant focused. AIM, ARB, CIM, Reporting and SIM have all been deprecated in favor of AuthorizeNet::API.
 */
@Deprecated
@XmlRootElement
public class Customer implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Address billTo;
	private Address shipTo;
	private DriversLicense license;

	private CustomerType customerType;
	private String id;
	private String email;
	private String phoneNumber;
	private String faxNumber;
    private boolean driversLicenseSpecified;

    private String taxId;

	protected Customer(){

	}

	public static Customer createCustomer() {
		return new Customer();
	}

	public Address getBillTo() {
		return billTo;
	}

	public void setBillTo(Address bill_to) {
		this.billTo = bill_to;
	}

	public boolean isDriversLicenseSpecified() {
		return driversLicenseSpecified;
	}

	public void setDriversLicenseSpecified(boolean driversLicenseSpecified) {
		this.driversLicenseSpecified = driversLicenseSpecified;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFaxNumber() {
		return faxNumber;
	}

	public void setFaxNumber(String faxNumber) {
		this.faxNumber = faxNumber;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public DriversLicense getLicense() {
		return license;
	}

	public void setLicense(DriversLicense license) {
		this.license = license;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Address getShipTo() {
		return shipTo;
	}

	public void setShipTo(Address ship_to) {
		this.shipTo = ship_to;
	}

	public String getTaxId() {
		return taxId;
	}

	public void setTaxId(String taxId) {
		this.taxId = taxId;
	}

	public CustomerType getCustomerType() {
		return customerType;
	}

	public void setCustomerType(CustomerType type) {
		this.customerType = type;
	}
}
