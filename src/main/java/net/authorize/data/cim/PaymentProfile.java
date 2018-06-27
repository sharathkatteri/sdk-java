package net.authorize.data.cim;

import java.io.Serializable;
import java.util.ArrayList;

import net.authorize.data.xml.Address;
import net.authorize.data.xml.CustomerType;
import net.authorize.data.xml.Payment;

import javax.xml.bind.annotation.XmlRootElement;


/**
 * @deprecated Starting Release <X.X> August 2018 the Authorize.Net API has been reorganized to simplify & ease integration and to be more merchant focused. AIM, ARB, CIM, Reporting and SIM have all been deprecated in favor of AuthorizeNet::API.
 */
@Deprecated
@XmlRootElement
public class PaymentProfile implements Serializable {
	private static final long serialVersionUID = 1L;

    protected CustomerType customerType;
    protected Address billTo;
    protected ArrayList<Payment> paymentList = new ArrayList<Payment>();
    protected String customerPaymentProfileId;

    private PaymentProfile() {}

    public static PaymentProfile createPaymentProfile() {
    	return new PaymentProfile();
    }

    /**
     * Gets the value of the customerType property.
     *
     * @return
     *     possible object is
     *     {@link CustomerType }
     *
     */
    public CustomerType getCustomerType() {
        return customerType;
    }

    /**
     * Sets the value of the customerType property.
     *
     * @param value
     *     allowed object is
     *     {@link CustomerType }
     *
     */
    public void setCustomerType(CustomerType value) {
        this.customerType = value;
    }

    /**
     * Gets the value of the billTo property.
     *
     * @return
     *     possible object is
     *     {@link Address }
     *
     */
    public Address getBillTo() {
        return billTo;
    }

    /**
     * Sets the value of the billTo property.
     *
     * @param value
     *     allowed object is
     *     {@link Address }
     *
     */
    public void setBillTo(Address value) {
        this.billTo = value;
    }

	/**
	 * @return the paymentList
	 */
	public ArrayList<Payment> getPaymentList() {
		return paymentList;
	}

	/**
	 * Add a Payment container to the payment list.
	 * @param payment
	 */
	public void addPayment(Payment payment) {
		if(this.paymentList == null) {
			this.paymentList = new ArrayList<Payment>();
		}

		this.paymentList.add(payment);
	}

	/**
	 * @param paymentList the payments to set
	 */
	public void setPaymentList(ArrayList<Payment> paymentList) {
		this.paymentList = paymentList;
	}

	/**
	 * @return the customerPaymentProfileId
	 */
	public String getCustomerPaymentProfileId() {
		return customerPaymentProfileId;
	}

	/**
	 * @param customerPaymentProfileId the customerPaymentProfileId to set
	 */
	public void setCustomerPaymentProfileId(String customerPaymentProfileId) {
		this.customerPaymentProfileId = customerPaymentProfileId;
	}


}
