package siteParis;


import java.util.Collection;

public class Joueur {

   //ATTRIBUTES
	private String nom;
	private String prenom;
	private String pseudo;
	private String password;
   
   private long jeton = 0;
   
   //CONSTRUCTOR
   public Joueur(){
   }
   
   public Joueur(String nom, String prenom, String pseudo){
		this.nom=nom;
		this.prenom=prenom;
		this.pseudo=pseudo;
	}
   
   /** 
	* @uml.property name="siteDeParisMetier"
	* @uml.associationEnd multiplicity="(1 1)" inverse="joueur:SiteDeParisMetier"
	*/
	private SiteDeParisMetier siteDeParisMetier = new SiteDeParisMetier();
   
   /**
	* @uml.property  name="pari"
	* @uml.associationEnd  multiplicity="(0 -1)" inverse="joueur:Pari"
	*/
	private Collection pari;
   
   //METHODS

	/** 
	 * Getter of the property <tt>siteDeParisMetier</tt>
	 * @return  Returns the siteDeParisMetier.
	 * @uml.property  name="siteDeParisMetier"
	 */
	public SiteDeParisMetier getSiteDeParisMetier() {
		return siteDeParisMetier;
	}

	/** 
	 * Setter of the property <tt>siteDeParisMetier</tt>
	 * @param siteDeParisMetier  The siteDeParisMetier to set.
	 * @uml.property  name="siteDeParisMetier"
	 */
	public void setSiteDeParisMetier(SiteDeParisMetier siteDeParisMetier) {
		this.siteDeParisMetier = siteDeParisMetier;
	}

	/**
	 * Getter of the property <tt>pari</tt>
	 * @return  Returns the pari.
	 * @uml.property  name="pari"
	 */
	public Collection getPari() {
		return pari;
	}

	/**
	 * Setter of the property <tt>pari</tt>
	 * @param pari  The pari to set.
	 * @uml.property  name="pari"
	 */
	public void setPari(Collection pari) {
		this.pari = pari;
	}


	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getPseudo() {
		return pseudo;
	}

	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
   
   public long getJeton(){
      return jeton;
   }
   public void setJeton(long jeton){
      this.jeton = this.jeton + jeton;
   }
   
   

}
