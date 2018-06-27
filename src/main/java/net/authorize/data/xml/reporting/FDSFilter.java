package net.authorize.data.xml.reporting;

/**
 * Fraud Detection Suite filter enumeration.
 * @deprecated Starting Release <X.X> August 2018 the Authorize.Net API has been reorganized to simplify & ease integration and to be more merchant focused. AIM, ARB, CIM, Reporting and SIM have all been deprecated in favor of AuthorizeNet::API.
 */
@Deprecated
public class FDSFilter {

	private String name;
	private FDSFilterActionType action;

	private FDSFilter() { }

	public static FDSFilter createFDSFilter() {
		return new FDSFilter();
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the action
	 */
	public FDSFilterActionType getAction() {
		return action;
	}
	/**
	 * @param action the action to set
	 */
	public void setAction(FDSFilterActionType action) {
		this.action = action;
	}


}
