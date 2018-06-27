package net.authorize.arb;


/**
 * @deprecated Starting Release <X.X> August 2018 the Authorize.Net API has been reorganized to simplify & ease integration and to be more merchant focused. AIM, ARB, CIM, Reporting and SIM have all been deprecated in favor of AuthorizeNet::API.
 */
@Deprecated
public enum TransactionType {

	CREATE_SUBSCRIPTION("ARBCreateSubscriptionRequest"),
	UPDATE_SUBSCRIPTION("ARBUpdateSubscriptionRequest"),
	CANCEL_SUBSCRIPTION("ARBCancelSubscriptionRequest"),
	GET_SUBSCRIPTION_STATUS("ARBGetSubscriptionStatusRequest");

	final private String value;

	private TransactionType(String value) {
		this.value = value;
	}

	/**
	 * @return the value
	 */
	public String getValue() {
		return value;
	}

}
