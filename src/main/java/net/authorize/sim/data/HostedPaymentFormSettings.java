package net.authorize.sim.data;

/**
 * When using the hosted payment form, settings can be configured to match the look of
 * the merchant's website.  The purpose of this class is just that - to
 * store the hosted payment form settings.
 * 
 * @deprecated since version 1.9.8
 * @deprecated We have reorganized and simplified the Authorize.Net API to ease integration and to focus on merchants' needs.
 * @deprecated We have deprecated AIM, ARB, CIM, and Reporting as separate options, in favor of AuthorizeNet::API (package: net.authorize.api.*).
 * @deprecated We have also deprecated SIM as a separate option, in favor of Accept Hosted. See https://developer.authorize.net/api/reference/features/accept_hosted.html for details on Accept Hosted.
 * @deprecated For details on AIM, see https://github.com/AuthorizeNet/sample-code-java/tree/master/src/main/java/net/authorize/sample/PaymentTransactions.
 * @deprecated For details on the deprecation and replacement of legacy Authorize.Net methods, visit https://developer.authorize.net/api/upgrade_guide/.
 *
 */
@Deprecated
public class HostedPaymentFormSettings {
	private String header;
	private String footer;
	private String backgroundColor;
	private String linkColor;
	private String textColor;
	private String merchantLogoUrl;
	private String backgroundUrl;

	private HostedPaymentFormSettings() { }

	public static HostedPaymentFormSettings createHostedPaymentFormSettings() {
		return new HostedPaymentFormSettings();
	}

	/**
	 * @return the header
	 */
	public String getHeader() {
		return header;
	}

	/**
	 * @param header the header to set
	 */
	public void setHeader(String header) {
		this.header = header;
	}

	/**
	 * @return the footer
	 */
	public String getFooter() {
		return footer;
	}

	/**
	 * @param footer the footer to set
	 */
	public void setFooter(String footer) {
		this.footer = footer;
	}

	/**
	 * @return the backgroundColor
	 */
	public String getBackgroundColor() {
		return backgroundColor;
	}

	/**
	 * @param backgroundColor the backgroundColor to set
	 */
	public void setBackgroundColor(String backgroundColor) {
		this.backgroundColor = backgroundColor;
	}

	/**
	 * @return the linkColor
	 */
	public String getLinkColor() {
		return linkColor;
	}

	/**
	 * @param linkColor the linkColor to set
	 */
	public void setLinkColor(String linkColor) {
		this.linkColor = linkColor;
	}

	/**
	 * @return the textColor
	 */
	public String getTextColor() {
		return textColor;
	}

	/**
	 * @param textColor the textColor to set
	 */
	public void setTextColor(String textColor) {
		this.textColor = textColor;
	}

	/**
	 * @return the merchantLogoUrl
	 */
	public String getMerchantLogoUrl() {
		return merchantLogoUrl;
	}

	/**
	 * @param merchantLogoUrl the merchantLogoUrl to set
	 */
	public void setMerchantLogoUrl(String merchantLogoUrl) {
		this.merchantLogoUrl = merchantLogoUrl;
	}

	/**
	 * @return the backgroundUrl
	 */
	public String getBackgroundUrl() {
		return backgroundUrl;
	}

	/**
	 * @param backgroundUrl the backgroundUrl to set
	 */
	public void setBackgroundUrl(String backgroundUrl) {
		this.backgroundUrl = backgroundUrl;
	}


}
