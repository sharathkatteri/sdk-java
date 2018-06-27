package net.authorize.data.creditcard;

import java.io.Serializable;

/**
 * Supported payment card types.
 * @deprecated Starting Release <X.X> August 2018 the Authorize.Net API has been reorganized to simplify & ease integration and to be more merchant focused. AIM, ARB, CIM, Reporting and SIM have all been deprecated in favor of AuthorizeNet::API.
 */
@Deprecated
public enum CardType implements Serializable {
	VISA("Visa"),
	MASTER_CARD("MasterCard"),
	AMERICAN_EXPRESS("AmericanExpress"),
	DISCOVER("Discover"),
	DINERS_CLUB("DinersClub"),
	JCB("JCB"),
	ECHECK("eCheck"),	// added for the reporting API
	UNKNOWN("");

	private final String value;

	private CardType(String value) {
		this.value = value;
	}

	public static CardType findByValue(String value) {
		if(value != null) {
			for(CardType cardType : values()) {
				if(cardType.value.equals(value)) {
					return cardType;
				}
			}
		}

		return CardType.UNKNOWN;
	}

	/**
	 * @return the value
	 */
	public String getValue() {
		return value;
	}

}
