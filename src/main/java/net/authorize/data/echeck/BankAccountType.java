package net.authorize.data.echeck;

import java.io.Serializable;

/**
 * Supported bank account types.
 * @deprecated Starting Release <X.X> August 2018 the Authorize.Net API has been reorganized to simplify & ease integration and to be more merchant focused. AIM, ARB, CIM, Reporting and SIM have all been deprecated in favor of AuthorizeNet::API.
 */
@Deprecated
public enum BankAccountType implements Serializable {
	CHECKING("checking", "CHECKING"),
	BUSINESSCHECKING("businessChecking","BUSINESSCHECKING"),
	SAVINGS("savings","SAVINGS"),
	UNKNOWN("unknown","UNKNOWN");

	private final String value;
	private final String value2;

	private BankAccountType(String value, String value2) {
		this.value = value;
		this.value2 = value2;
	}

	public static BankAccountType findByValue(String value) {
		for(BankAccountType bankAccountType : values()) {
			if(bankAccountType.value.equals(value)|| 
					bankAccountType.value2.equals(value)) {
				return bankAccountType;
			}
		}

		return BankAccountType.UNKNOWN;
	}

	/**
	 * @return the value
	 */
	public String getValue() {
		return value;
	}
	


}
