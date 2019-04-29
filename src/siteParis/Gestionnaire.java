package siteParis;


import java.util.Collection;

public class Gestionnaire {

	/**
	 * @uml.property  name="siteDeParisMetier"
	 * @uml.associationEnd  multiplicity="(0 -1)" inverse="gestionnaire:SiteDeParisMetier"
	 */
	private Collection siteDeParisMetier = new java.util.ArrayList();

	/**
	 * Getter of the property <tt>siteDeParisMetier</tt>
	 * @return  Returns the siteDeParisMetier.
	 * @uml.property  name="siteDeParisMetier"
	 */
	public Collection getSiteDeParisMetier() {
		return siteDeParisMetier;
	}

	/**
	 * Setter of the property <tt>siteDeParisMetier</tt>
	 * @param siteDeParisMetier  The siteDeParisMetier to set.
	 * @uml.property  name="siteDeParisMetier"
	 */
	public void setSiteDeParisMetier(Collection siteDeParisMetier) {
		this.siteDeParisMetier = siteDeParisMetier;
	}

	/**
	 * @uml.property  name="password"
	 */
	private String password;

	/**
	 * Getter of the property <tt>password</tt>
	 * @return  Returns the password.
	 * @uml.property  name="password"
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * Setter of the property <tt>password</tt>
	 * @param password  The password to set.
	 * @uml.property  name="password"
	 */
	public void setPassword(String password) {
		this.password = password;
	}

}
