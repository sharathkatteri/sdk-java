package net.authorize;

/**
 * The method of payment for the transaction.
 * CC (credit card) or ECHECK (electronic check).
 * @deprecated Starting Release <X.X> August 2018 the Authorize.Net API has been reorganized to simplify & ease integration and to be more merchant focused. AIM, ARB, CIM, Reporting and SIM have all been deprecated in favor of AuthorizeNet::API.
 */
@Deprecated
public enum PaymentMethod {
	CREDIT_CARD("CC"),
	E_CHECK("ECHECK"),
	UNKNOWN("UNKNOWN");

	private final String method;

	private PaymentMethod(String method) {
		this.method = method;
	}

	/**
	 * @return the method
	 */
	public String getMethod() {
		return method;
	}


}
