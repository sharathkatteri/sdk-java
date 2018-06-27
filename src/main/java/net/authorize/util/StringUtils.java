package net.authorize.util;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * @deprecated Starting Release <X.X> August 2018 the Authorize.Net API has been reorganized to simplify & ease integration and to be more merchant focused. AIM, ARB, CIM, Reporting and SIM have all been deprecated in favor of AuthorizeNet::API.
 */
@Deprecated
public class StringUtils {

	private static Log logger = LogFactory.getLog(StringUtils.class);

	/**
	 * Sanitize strings for output
	 */
	public static String sanitizeString(String string) {

		java.lang.StringBuilder retval = new java.lang.StringBuilder();
		java.text.StringCharacterIterator iterator = new java.text.StringCharacterIterator(
				string);
		char character = iterator.current();

		while (character != java.text.CharacterIterator.DONE) {
			if (character == '<') {
				retval.append("&lt;");
			} else if (character == '>') {
				retval.append("&gt;");
			} else if (character == '&') {
				retval.append("&amp;");
			} else if (character == '\"') {
				retval.append("&quot;");
			} else if (character == '\t') {
				addCharEntity(9, retval);
			} else if (character == '!') {
				addCharEntity(33, retval);
			} else if (character == '#') {
				addCharEntity(35, retval);
			} else if (character == '$') {
				addCharEntity(36, retval);
			} else if (character == '%') {
				addCharEntity(37, retval);
			} else if (character == '\'') {
				addCharEntity(39, retval);
			} else if (character == '(') {
				addCharEntity(40, retval);
			} else if (character == ')') {
				addCharEntity(41, retval);
			} else if (character == '*') {
				addCharEntity(42, retval);
			} else if (character == '+') {
				addCharEntity(43, retval);
			} else if (character == ',') {
				addCharEntity(44, retval);
			} else if (character == '-') {
				addCharEntity(45, retval);
			} else if (character == '.') {
				addCharEntity(46, retval);
			} else if (character == '/') {
				addCharEntity(47, retval);
			} else if (character == ':') {
				addCharEntity(58, retval);
			} else if (character == ';') {
				addCharEntity(59, retval);
			} else if (character == '=') {
				addCharEntity(61, retval);
			} else if (character == '?') {
				addCharEntity(63, retval);
			} else if (character == '@') {
				addCharEntity(64, retval);
			} else if (character == '[') {
				addCharEntity(91, retval);
			} else if (character == '\\') {
				addCharEntity(92, retval);
			} else if (character == ']') {
				addCharEntity(93, retval);
			} else if (character == '^') {
				addCharEntity(94, retval);
			} else if (character == '_') {
				addCharEntity(95, retval);
			} else if (character == '`') {
				addCharEntity(96, retval);
			} else if (character == '{') {
				addCharEntity(123, retval);
			} else if (character == '|') {
				addCharEntity(124, retval);
			} else if (character == '}') {
				addCharEntity(125, retval);
			} else if (character == '~') {
				addCharEntity(126, retval);
			} else {
				retval.append(character);
			}
			character = iterator.next();
		}
		return retval.toString();
	}

	/**
	 * Convert integer to char entity
	 */
	public static void addCharEntity(int i, StringBuilder sb) {

		String padding = "";
		if (i <= 9) {
			padding = "00";
		} else if (i <= 99) {
			padding = "0";
		}
		String number = padding + i;
		sb.append("&#").append(number).append(";");
	}

	/**
	 * Return true if the string is null or "".
	 *
	 * @param str
	 * @return true if the string is "empty"
	 */
	public static boolean isEmpty(String str) {
		return (str == null || str.equals(""));
	}

	/**
	 * Return true if the string is not null and not == "".
	 *
	 * @param str
	 * @return true if the string is NOT "empty"
	 */
	public static boolean isNotEmpty(String str) {
		return (str != null && !str.equals(""));
	}
	
	public static double parseDouble(String doubleStringValue) {
		double amount = 0.0;
		
		if ( null != doubleStringValue && 0 < doubleStringValue.trim().length())
		try {
			amount = Double.parseDouble(doubleStringValue.trim());
		} catch (NumberFormatException nfe) {
			LogHelper.warn(logger, "Error parsing to double value: '%s'", doubleStringValue);
		}
		
		return amount;
	}
	
	public static int parseInt(String intStringValue) {
		int amount = 0;
		
		if ( null != intStringValue && 0 < intStringValue.trim().length())
		try {
			amount = Integer.parseInt(intStringValue.trim());
		} catch (NumberFormatException nfe) {
			LogHelper.warn(logger, "Error parsing to int value: '%s'", intStringValue);
		}
		
		return amount;
	}

	public static boolean parseBool(String boolStringValue) {
		boolean result = false;
		
		if ( null != boolStringValue && 0 < boolStringValue.trim().length())
		try {
			result = Boolean.parseBoolean(boolStringValue.trim());
		} catch (Exception e) {
			LogHelper.warn(logger, "Error parsing to boolean value: '%s'", boolStringValue);
		}
		
		return result;
	}
}
