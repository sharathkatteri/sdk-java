package net.authorize.data.xml;

import java.io.Serializable;
import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @deprecated Starting Release <X.X> August 2018 the Authorize.Net API has been reorganized to simplify & ease integration and to be more merchant focused. AIM, ARB, CIM, Reporting and SIM have all been deprecated in favor of AuthorizeNet::API.
 */
@Deprecated
@XmlRootElement
public class DriversLicense  implements Serializable {

	private static final long serialVersionUID = 1L;

    private String number;
    private String state;
    private Date birth_date;
    public static String LICENSE_DATE_FORMAT = "yyyy-MM-dd";

    public DriversLicense(){
	}


	public Date getBirthDate() {
		return birth_date;
	}

	public void setBirthDate(String date){
		this.birth_date = net.authorize.util.DateUtil.getDateFromFormattedDate(date, LICENSE_DATE_FORMAT);
	}
	public void setBirthDate(Date birth_date) {
		this.birth_date = birth_date;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
}
