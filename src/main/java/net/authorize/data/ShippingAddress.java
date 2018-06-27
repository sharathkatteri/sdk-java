package net.authorize.data;

import java.io.Serializable;

/**
 * Product shipping address.
 * @deprecated Starting Release <X.X> August 2018 the Authorize.Net API has been reorganized to simplify & ease integration and to be more merchant focused. AIM, ARB, CIM, Reporting and SIM have all been deprecated in favor of AuthorizeNet::API.
 */
@Deprecated
public class ShippingAddress extends Address implements Serializable {

	private static final long serialVersionUID = 1L;

	private ShippingAddress() {
		super();
	}

	public static ShippingAddress createShippingAddress() {
		return new ShippingAddress();
	}

}
