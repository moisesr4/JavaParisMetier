package siteParis;

import java.util.Collection;
import java.util.Date;
import java.util.LinkedList;

public class Competition {

	//ATRIBUTES

	/** 
	 * @uml.property name="siteDeParisMetier"
	 * @uml.associationEnd multiplicity="(1 1)" inverse="competition:SiteDeParisMetier"
	 */

	private SiteDeParisMetier siteDeParisMetier = new SiteDeParisMetier();

	/**
	 * @uml.property  name="pari"
	 * @uml.associationEnd  multiplicity="(1 1)" inverse="competition:Pari"
	 */
	private Pari pari = new Pari();

	/**
	 * @uml.property  name="competiteur"
	 * @uml.associationEnd  multiplicity="(2 -1)" inverse="competition:Competiteur"
	 */
	private  LinkedList<Competiteur>  list_competiteurs;


	/**
	 * @uml.property  name="competitionNumber"
	 */
	private String competitionNumber;

	/**
	 * @uml.property  name="competitionName"
	 */
	private String competitionName;

	/**
	 * @uml.property  name="debutDate"
	 */
	private DateFrancaise debutDate;

	//METHODS
	/**
	 * Constructeur Competition
	 */
	public Competition(){
	}

	public Competition(String competitionName, DateFrancaise debutDate, LinkedList<Competiteur> list_competiteurs){
		this.competitionName=competitionName;
		this.debutDate=debutDate;
		this.list_competiteurs=list_competiteurs;
	}

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
	public Pari getPari() {
		return pari;
	}

	/**
	 * Setter of the property <tt>pari</tt>
	 * @param pari  The pari to set.
	 * @uml.property  name="pari"
	 */
	public void setPari(Pari pari) {
		this.pari = pari;
	}

	/**
	 * Getter of the property <tt>competiteur</tt>
	 * @return  Returns the competiteur.
	 * @uml.property  name="competiteur"
	 */
	public LinkedList<Competiteur> getList_competiteurs() {
		return list_competiteurs;
	}

	/**
	 * Setter of the property <tt>competiteur</tt>
	 * @param list_competiteur  The competiteur to set.
	 * @uml.property  name="competiteur"
	 */
	public void setList_competiteurs(LinkedList<Competiteur>  list_competiteurs) {
		this.list_competiteurs = list_competiteurs;
	}


	/**
	 * Getter of the property <tt>competitionNumber</tt>
	 * @return  Returns the competitionNumber.
	 * @uml.property  name="competitionNumber"
	 */
	public String getCompetitionNumber() {
		return competitionNumber;
	}

	/**
	 * Setter of the property <tt>competitionNumber</tt>
	 * @param competitionNumber  The competitionNumber to set.
	 * @uml.property  name="competitionNumber"
	 */
	public void setCompetitionNumber(String competitionNumber) {
		this.competitionNumber = competitionNumber;
	}


	/**
	 * Getter of the property <tt>competitionName</tt>
	 * @return  Returns the competitionName.
	 * @uml.property  name="competitionName"
	 */
	public String getCompetitionName() {
		return competitionName;
	}

	/**
	 * Setter of the property <tt>competitionName</tt>
	 * @param competitionName  The competitionName to set.
	 * @uml.property  name="competitionName"
	 */
	public void setCompetitionName(String competitionName) {
		this.competitionName = competitionName;
	}

	/**
	 * Getter of the property <tt>debutDate</tt>
	 * @return  Returns the debutDate.
	 * @uml.property  name="debutDate"
	 */
	public DateFrancaise getDebutDate() {
		return debutDate;
	}

	/**
	 * Setter of the property <tt>debutDate</tt>
	 * @param debutDate  The debutDate to set.
	 * @uml.property  name="debutDate"
	 */
	public void setDebutDate(DateFrancaise debutDate) {
		this.debutDate = debutDate;
	}


}
