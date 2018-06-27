package net.authorize.data.arb;

import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;


/**
 * @deprecated Starting Release <X.X> August 2018 the Authorize.Net API has been reorganized to simplify & ease integration and to be more merchant focused. AIM, ARB, CIM, Reporting and SIM have all been deprecated in favor of AuthorizeNet::API.
 */
@Deprecated
@XmlRootElement
public class Profile implements Serializable {
	private static final long serialVersionUID = 1L;

	protected String customerProfileId;
    protected String customerPaymentProfileId;
    protected String customerAddressId;

    private Profile() { }

    /**
     * Create a new CustomerProfile object
     *
     * @return Profile
     */
    public static Profile createProfile() {
    	return new Profile();
    }

	/**
     * Get the customer profile id.
     *
	 * @return the id
	 */
	public String getCustomerProfileId() {
		return customerProfileId;
	}

	/**
	 * Set the customer profile id.
	 *
	 * @param id the id to set
	 */
	public void setCustomerProfileId(String id) {
		this.customerProfileId = id;
	}

	/**
	 * Get the customer payment profile id.
	 *
	 * @return the id
	 */
	public String getCustomerPaymentProfileId() {
		return customerPaymentProfileId;
	}

	/**
	 * Set the customer payment profile id.
	 *
	 * @param id the id to set
	 */
	public void setCustomerPaymentProfileId(String id) {
		this.customerPaymentProfileId = id;
	}

	/**
	 * Get the customer payment profile id.
	 *
	 * @return the id
	 */
	public String getCustomerAddressId() {
		return customerAddressId;
	}

	/**
	 * Set the customer payment profile id.
	 *
	 * @param id the id to set
	 */
	public void setCustomerAddressId(String id) {
		this.customerAddressId = id;
	}
}