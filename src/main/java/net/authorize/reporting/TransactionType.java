package net.authorize.reporting;

/**
 *	Enumeration of Reporting transaction types that are supported by Authorize.Net
 *  @deprecated Starting Release <X.X> August 2018 the Authorize.Net API has been reorganized to simplify & ease integration and to be more merchant focused. AIM, ARB, CIM, Reporting and SIM have all been deprecated in favor of AuthorizeNet::API.
 */
@Deprecated
public enum TransactionType {

	GET_SETTLED_BATCH_LIST("getSettledBatchListRequest"),
	GET_TRANSACTION_LIST("getTransactionListRequest"),
	GET_TRANSACTION_DETAILS("getTransactionDetailsRequest"),
	GET_BATCH_STATISTICS("getBatchStatisticsRequest"),
	GET_UNSETTLED_TRANSACTION_LIST("getUnsettledTransactionListRequest");

	final private String value;

	private TransactionType(String value) {
		this.value = value;
	}

	/**
	 * @return the value
	 */
	public String getValue() {
		return value;
	}

}
