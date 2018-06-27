package net.authorize.data.xml.reporting;

/**
 * ReportingTransactionType enumeration.
 * @deprecated Starting Release <X.X> August 2018 the Authorize.Net API has been reorganized to simplify & ease integration and to be more merchant focused. AIM, ARB, CIM, Reporting and SIM have all been deprecated in favor of AuthorizeNet::API.
 */
@Deprecated
public enum ReportingTransactionType {

	AUTH_CAPTURE("authCaptureTransaction"),
	AUTH_ONLY("authOnlyTransaction"),
	CAPTURE_ONLY("captureOnlyTransaction"),
	REFUND("refundTransaction");

    private final String value;

    private ReportingTransactionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ReportingTransactionType fromValue(String v) {
        for (ReportingTransactionType c: ReportingTransactionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }

        return null;
    }

}

