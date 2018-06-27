package net.authorize.data.xml.reporting;

/**
 * Settlement state enumeration.
 * @deprecated Starting Release <X.X> August 2018 the Authorize.Net API has been reorganized to simplify & ease integration and to be more merchant focused. AIM, ARB, CIM, Reporting and SIM have all been deprecated in favor of AuthorizeNet::API.
 */
@Deprecated
public enum SettlementStateType {
	SETTLED_SUCCESSFULLY("settledSuccessfully"),
	ERROR("settlementError"),
	PENDING_SETTLEMENT("pendingSettlement");

    private final String value;

    private SettlementStateType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SettlementStateType fromValue(String v) {
        for (SettlementStateType c: SettlementStateType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }

        return null;
    }

}
