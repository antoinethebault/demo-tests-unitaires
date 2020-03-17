package dev.utils.maison;

/**
 * @author antoinethebault
 *Chambre heritant de la classe Piece avec une superficie et un numero d'etage
 */
public class Chambre extends Piece {

	/**Constructor
	 * @param superficie
	 * @param etage
	 */
	public Chambre(double superficie, int etage) {
		super(superficie, etage);
	}

	@Override
	public String getType() {
		return "Chambre";
	}

}
