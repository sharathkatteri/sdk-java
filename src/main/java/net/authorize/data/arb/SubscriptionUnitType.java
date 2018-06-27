package net.authorize.data.arb;


/**
 * @deprecated Starting Release <X.X> August 2018 the Authorize.Net API has been reorganized to simplify & ease integration and to be more merchant focused. AIM, ARB, CIM, Reporting and SIM have all been deprecated in favor of AuthorizeNet::API.
 */
@Deprecated
public enum SubscriptionUnitType {
    DAYS("days"),
    MONTHS("months");

    private final String value;

    SubscriptionUnitType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SubscriptionUnitType fromValue(String v) {
        for (SubscriptionUnitType c: SubscriptionUnitType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
