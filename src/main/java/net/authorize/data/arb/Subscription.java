package net.authorize.data.arb;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlRootElement;

import net.authorize.arb.Transaction;
import net.authorize.data.Order;
import net.authorize.data.xml.Customer;
import net.authorize.data.xml.Payment;

@XmlRootElement
/**
 * Subscription container.
 * 
 * @deprecated since version 1.9.8
 * @deprecated We have reorganized and simplified the Authorize.Net API to ease integration and to focus on merchants' needs.
 * @deprecated We have deprecated AIM, ARB, CIM, and Reporting as separate options, in favor of AuthorizeNet::API (package: net.authorize.api.*).
 * @deprecated We have also deprecated SIM as a separate option, in favor of Accept Hosted. See https://developer.authorize.net/api/reference/features/accept_hosted.html for details on Accept Hosted.
 * @deprecated For details on AIM, see https://github.com/AuthorizeNet/sample-code-java/tree/master/src/main/java/net/authorize/sample/PaymentTransactions.
 * @deprecated For details on the deprecation and replacement of legacy Authorize.Net methods, visit https://developer.authorize.net/api/upgrade_guide/.
 *
 */
@Deprecated
public class Subscription implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String subscription_id = null;

	private String name = null;
	private PaymentSchedule schedule = null;
	private BigDecimal amount = Transaction.ZERO_AMOUNT;
	private BigDecimal trial_amount = Transaction.ZERO_AMOUNT;
	private Payment payment = null;
	private Customer customer;
	private Profile profile;
	private String refId = null;
	private Order order = null;

	/**
     *
     */
	protected Subscription() {

	}

	/**
	 * Create a subscription.
	 *
	 * @return Subscription
	 */
	public static Subscription createSubscription() {
		return new Subscription();
	}

	/**
	 * Get the subscription id.
	 *
	 * @return String
	 */
	public String getSubscriptionId() {
		return subscription_id;
	}

	/**
	 * Set the subscription id.
	 *
	 * @param subscription_id
	 */
	public void setSubscriptionId(String subscription_id) {
		this.subscription_id = subscription_id;
	}

	/**
	 * Get the customer container.
	 *
	 * @return Customer
	 */
	public Customer getCustomer() {
		return this.customer;
	}

	/**
	 * Set the customer container.
	 *
	 * @param customer
	 */
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	/**
	 * Get the profile container.
	 *
	 * @return Profile
	 */
	public Profile getProfile() {
		return profile;
	}

	/**
	 * Set the profile container.
	 *
	 * @param profile
	 */
	public void setProfile(Profile profile) {
		this.profile = profile;
	}

	/**
	 * Get the subscription amount.
	 *
	 * @return BigDecimal
	 */
	public BigDecimal getAmount() {
		return amount;
	}

	/**
	 * Set the subscription amount.
	 *
	 * @param amount
	 */
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	/**
	 * Get the name of the subscription.
	 *
	 * @return String
	 */
	public String getName() {
		return name;
	}

	/**
	 * Set the name of the subscription.
	 *
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Get the payment container.
	 *
	 * @return Payment
	 */
	public Payment getPayment() {
		return payment;
	}

	/**
	 * Set the payment container for the subscription.
	 *
	 * @param payment
	 */
	public void setPayment(Payment payment) {
		this.payment = payment;
	}

	/**
	 * Get the payment schedule of the subscription.
	 *
	 * @return PaymentSchedule
	 */
	public PaymentSchedule getSchedule() {
		return schedule;
	}

	/**
	 * Set the payment schedule of the subscription.
	 *
	 * @param schedule
	 */
	public void setSchedule(PaymentSchedule schedule) {
		this.schedule = schedule;
	}

	/**
	 * Get the trial amount of the subscription.
	 *
	 * @return BigDecimal
	 */
	public BigDecimal getTrialAmount() {
		return trial_amount;
	}

	/**
	 * Set the trial amount of the subscription.
	 *
	 * @param trial_amount
	 */
	public void setTrialAmount(BigDecimal trial_amount) {
		this.trial_amount = trial_amount;
	}

	/**
	 * @return the refId
	 */
	public String getRefId() {
		return refId;
	}

	/**
	 * @param refId
	 *            the refId to set
	 */
	public void setRefId(String refId) {
		this.refId = refId;
	}

	/**
	 * @return the order
	 */
	public Order getOrder() {
		return order;
	}

	/**
	 * @param order the order to set
	 */
	public void setOrder(Order order) {
		this.order = order;
	}


}