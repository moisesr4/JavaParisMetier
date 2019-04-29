package siteParis;

//This is a line to test bitbucket
//This is a line to test bitbucket 2 (Hector)

import java.util.LinkedList;

public class Competiteur {
	//ATRIBUTES
//	/**
//	 * @uml.property  name="competition"
//	 * @uml.associationEnd  multiplicity="(1 1)" inverse="competiteur:Competition"
//	 */
//
//	private Competition competition = new Competition();
//
//	/**
//	 * @uml.property  name="pari"
//	 * @uml.associationEnd  multiplicity="(1 1)" inverse="competiteur:Pari"
//	 */
//	private Pari pari = new Pari();
//
//	/**
//	 * @uml.property  name="nom"
//	 */
//	private String nom;
//
//	/**
//	 * @uml.property  name="prenom"
//	 */
	private String prenom;

	//METHODS
	/**
	 * Constructeur Competition
	 */
	public Competiteur(){
	}

	public Competiteur(String prenom){
		//this.nom=nom;
		this.prenom=prenom;
	}
//	/**
//	 * Getter of the property <tt>competition</tt>
//	 * @return  Returns the competition.
//	 * @uml.property  name="competition"
//	 */
//	public Competition getCompetition() {
//		return competition;
//	}
//
//	/**
//	 * Setter of the property <tt>competition</tt>
//	 * @param competition  The competition to set.
//	 * @uml.property  name="competition"
//	 */
//	public void setCompetition(Competition competition) {
//		this.competition = competition;
//	}
//
//
//	/**
//	 * Getter of the property <tt>pari</tt>
//	 * @return  Returns the pari.
//	 * @uml.property  name="pari"
//	 */
//	public Pari getPari() {
//		return pari;
//	}
//
//	/**
//	 * Setter of the property <tt>pari</tt>
//	 * @param pari  The pari to set.
//	 * @uml.property  name="pari"
//	 */
//	public void setPari(Pari pari) {
//		this.pari = pari;
//	}
//
//
//	/**
//	 * Getter of the property <tt>nom</tt>
//	 * @return  Returns the nom.
//	 * @uml.property  name="nom"
//	 */
//	public String getNom() {
//		return nom;
//	}
//
//	/**
//	 * Setter of the property <tt>nom</tt>
//	 * @param nom  The nom to set.
//	 * @uml.property  name="nom"
//	 */
//	public void setNom(String nom) {
//		this.nom = nom;
//	}

	/**
	 * Getter of the property <tt>prenom</tt>
	 * @return  Returns the prenom.
	 * @uml.property  name="prenom"
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 * Setter of the property <tt>prenom</tt>
	 * @param prenom  The prenom to set.
	 * @uml.property  name="prenom"
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

}
