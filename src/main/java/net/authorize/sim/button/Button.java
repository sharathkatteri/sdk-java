package net.authorize.sim.button;


/**
 * @deprecated Starting Release <X.X> August 2018 the Authorize.Net API has been reorganized to simplify & ease integration and to be more merchant focused. AIM, ARB, CIM, Reporting and SIM have all been deprecated in favor of AuthorizeNet::API.
 */
@Deprecated
public abstract class Button {

	protected ButtonType buttonType;

	/**
	 * @return the buttonType
	 */
	public ButtonType getButtonType() {
		return buttonType;
	}

}
