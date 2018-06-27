package net.authorize.util;

import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

import net.authorize.ResponseField;
import net.authorize.aim.Transaction;

/**
 * Parses a response string from Authorize.net into a Map of values.
 * @deprecated Starting Release <X.X> August 2018 the Authorize.Net API has been reorganized to simplify & ease integration and to be more merchant focused. AIM, ARB, CIM, Reporting and SIM have all been deprecated in favor of AuthorizeNet::API.
 */
@Deprecated
public class ResponseParser {

	/**
	 * Take a string and parses it into a Map keyed on ResponseFields.
	 *
	 * @param responseString
	 * @return dictionary of response values.
	 */
	public static Map<ResponseField, String> parseResponseString(String responseString) {
		return parseResponseString(responseString, Transaction.TRANSACTION_FIELD_DELIMITER);
	}

	/**
	 * Take a string and parses it into a Map keyed on ResponseFields.
	 *
	 * @param responseString
	 * @param delimiter
	 * @return dictionary of response values.
	 */
	public static Map<ResponseField, String> parseResponseString(String responseString, String delimiter) {

		Map<ResponseField, String> responseMap = new HashMap<ResponseField, String>();

		StringTokenizer st = new StringTokenizer(responseString, delimiter, true);

		int order = 0;
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			ResponseField responseField = ResponseField.get(++order);
			if(responseField != null) {
				if(delimiter.equals(token)) {
					responseMap.put(responseField, "");
				} else {
					responseMap.put(responseField, token.replaceAll(delimiter, ""));
					if (st.hasMoreTokens()) {
						st.nextToken(); // skip delimiter
					}
				}
			}
		}

		return responseMap;
	}

}
