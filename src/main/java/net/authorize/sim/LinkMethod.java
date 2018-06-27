package net.authorize.sim;

/**
 * The type of link back to the merchant's website.
 *
 * LINK creates a regular hyperlink.
 * GET creates a button and returns transaction information in the receipt link URL.
 * POST creates a button and returns transaction information as an HTML Form POST.
 * @deprecated Starting Release <X.X> August 2018 the Authorize.Net API has been reorganized to simplify & ease integration and to be more merchant focused. AIM, ARB, CIM, Reporting and SIM have all been deprecated in favor of AuthorizeNet::API.
 */
@Deprecated
public enum LinkMethod {
	LINK,
	POST,
	GET
}
