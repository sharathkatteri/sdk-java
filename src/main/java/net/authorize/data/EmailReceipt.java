package net.authorize.data;

import java.io.Serializable;

/**
 * Merchants can opt to send a payment gateway generated email receipt to
 * customers who provide an email address with their transaction.
 *
 * The email receipt includes a summary and results of the transaction.
 * @deprecated Starting Release <X.X> August 2018 the Authorize.Net API has been reorganized to simplify & ease integration and to be more merchant focused. AIM, ARB, CIM, Reporting and SIM have all been deprecated in favor of AuthorizeNet::API.
 */
@Deprecated
public class EmailReceipt implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	public static final int MAX_EMAIL_LENGTH = 255;

	private String email;
	private boolean emailCustomer = false;
	private String headerEmailReceipt;
	private String footerEmailReceipt;
	private String merchantEmail;

	private EmailReceipt() { }

    public static EmailReceipt createEmailReceipt() {

		return new EmailReceipt();
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the emailCustomer
	 */
	public boolean isEmailCustomer() {
		return emailCustomer;
	}

	/**
	 * @param emailCustomer the emailCustomer to set
	 */
	public void setEmailCustomer(boolean emailCustomer) {
		this.emailCustomer = emailCustomer;
	}

	/**
	 * @return the headerEmailReceipt
	 */
	public String getHeaderEmailReceipt() {
		return headerEmailReceipt;
	}

	/**
	 * @param headerEmailReceipt the headerEmailReceipt to set
	 */
	public void setHeaderEmailReceipt(String headerEmailReceipt) {
		this.headerEmailReceipt = headerEmailReceipt;
	}

	/**
	 * @return the footerEmailReceipt
	 */
	public String getFooterEmailReceipt() {
		return footerEmailReceipt;
	}

	/**
	 * @param footerEmailReceipt the footerEmailReceipt to set
	 */
	public void setFooterEmailReceipt(String footerEmailReceipt) {
		this.footerEmailReceipt = footerEmailReceipt;
	}

	/**
	 * @return the merchantEmail
	 */
	public String getMerchantEmail() {
		return merchantEmail;
	}

	/**
	 *
	 * @param merchantEmail
	 */
	public void setMerchantEmail(String merchantEmail) {
		this.merchantEmail = merchantEmail;
	}
}
