package net.authorize.data.xml;

import javax.xml.bind.annotation.XmlRootElement;

import net.authorize.data.echeck.ECheck;

/**
 * @deprecated Starting Release <X.X> August 2018 the Authorize.Net API has been reorganized to simplify & ease integration and to be more merchant focused. AIM, ARB, CIM, Reporting and SIM have all been deprecated in favor of AuthorizeNet::API.
 */
@Deprecated
@XmlRootElement
public class BankAccount extends ECheck {

	private static final long serialVersionUID = 1L;

	protected BankAccount() { }

	public static BankAccount createBankAccount() {
		return new BankAccount();
	}

}
