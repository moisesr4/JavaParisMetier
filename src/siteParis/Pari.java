package siteParis;

import java.util.Collection;

public class Pari {

	/**
	 * @uml.property  name="joueur"
	 * @uml.associationEnd  multiplicity="(1 -1)" inverse="pari:Joueur"
	 */
	private Collection joueur;

	/**
	 * Getter of the property <tt>joueur</tt>
	 * @return  Returns the joueur.
	 * @uml.property  name="joueur"
	 */
	public Collection getJoueur() {
		return joueur;
	}

	/**
	 * Setter of the property <tt>joueur</tt>
	 * @param joueur  The joueur to set.
	 * @uml.property  name="joueur"
	 */
	public void setJoueur(Collection joueur) {
		this.joueur = joueur;
	}

	/**
	 * @uml.property  name="competition"
	 * @uml.associationEnd  multiplicity="(0 -1)" inverse="pari:Competition"
	 */
	private Collection competition;

	/**
	 * Getter of the property <tt>competition</tt>
	 * @return  Returns the competition.
	 * @uml.property  name="competition"
	 */
	public Collection getCompetition() {
		return competition;
	}

	/**
	 * Setter of the property <tt>competition</tt>
	 * @param competition  The competition to set.
	 * @uml.property  name="competition"
	 */
	public void setCompetition(Collection competition) {
		this.competition = competition;
	}

	/**
	 * @uml.property  name="competiteur"
	 * @uml.associationEnd  multiplicity="(1 1)" inverse="pari:Competiteur"
	 */
	private Competiteur competiteur = new Competiteur();

	/**
	 * Getter of the property <tt>competiteur</tt>
	 * @return  Returns the competiteur.
	 * @uml.property  name="competiteur"
	 */
	public Competiteur getCompetiteur() {
		return competiteur;
	}

	/**
	 * Setter of the property <tt>competiteur</tt>
	 * @param competiteur  The competiteur to set.
	 * @uml.property  name="competiteur"
	 */
	public void setCompetiteur(Competiteur competiteur) {
		this.competiteur = competiteur;
	}

	/**
	 * @uml.property  name="winner"
	 */
	private String winner;

	/**
	 * Getter of the property <tt>winner</tt>
	 * @return  Returns the winner.
	 * @uml.property  name="winner"
	 */
	public String getWinner() {
		return winner;
	}

	/**
	 * Setter of the property <tt>winner</tt>
	 * @param winner  The winner to set.
	 * @uml.property  name="winner"
	 */
	public void setWinner(String winner) {
		this.winner = winner;
	}

}
