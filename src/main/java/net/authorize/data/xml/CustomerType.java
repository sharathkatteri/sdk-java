package net.authorize.data.xml;

/**
 * @deprecated Starting Release <X.X> August 2018 the Authorize.Net API has been reorganized to simplify & ease integration and to be more merchant focused. AIM, ARB, CIM, Reporting and SIM have all been deprecated in favor of AuthorizeNet::API.
 */
@Deprecated
public enum CustomerType {
	INDIVIDUAL,
	BUSINESS;

	/**
	 * Lookup a CustomerType by it's name.
	 *
	 * @param name
	 *
	 * @return Returns a CustomerType if the name match is found.
	 */
	public static CustomerType findByName(String name) {
		for(CustomerType customerType : values()) {
			if(customerType.name().equalsIgnoreCase(name)) {
				return customerType;
			}
		}

		return null;
	}
}
