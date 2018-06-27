package net.authorize.cim;


/**
 * @deprecated Starting Release <X.X> August 2018 the Authorize.Net API has been reorganized to simplify & ease integration and to be more merchant focused. AIM, ARB, CIM, Reporting and SIM have all been deprecated in favor of AuthorizeNet::API.
 */
@Deprecated
public enum ValidationModeType {
	NONE("none"),
	TEST_MODE("testMode"),
	LIVE_MODE("liveMode");

	final private String value;

	private ValidationModeType(String value) {
		this.value = value;
	}

	/**
	 * @return the value
	 */
	public String getValue() {
		return value;
	}

}
