package dev.utils.maison;

import static org.junit.Assert.*;

import org.junit.Test;

public class MaisonTest {

	@Test
	public void testAjouterPiece() {
		Maison maison = new Maison();
		maison.ajouterPiece(new Cuisine(15.0, 0));
		maison.ajouterPiece(new Salon(25.0, 0));
		maison.ajouterPiece(new SalleDeBain(10.0, 0));
		maison.ajouterPiece(new WC(4.0, 0));
		maison.ajouterPiece(new Chambre(20.0, 1));
		maison.ajouterPiece(new Chambre(20.0, 1));
		maison.ajouterPiece(new SalleDeBain(10.0, 1));
		maison.ajouterPiece(new WC(4.0, 1));
		maison.ajouterPiece(null);
		maison.ajouterPiece(new Chambre(-20.0, 1));
		maison.ajouterPiece(new Chambre(20.0, -1));
	}

	@Test
	public void testGetSuperficieTotale() {
		Maison maison = new Maison();
		maison.ajouterPiece(new Cuisine(15.0, 0));
		maison.ajouterPiece(new Salon(25.0, 0));
		maison.ajouterPiece(new SalleDeBain(10.0, 0));
		maison.ajouterPiece(new WC(4.0, 0));
		maison.ajouterPiece(new Chambre(20.0, 1));
		maison.ajouterPiece(new Chambre(20.0, 1));
		maison.ajouterPiece(new SalleDeBain(10.0, 1));
		maison.ajouterPiece(new WC(4.0, 1));
		double resultat = maison.getSuperficieTotale();
		assertEquals(108.0, resultat, 0.00001);
	}

	@Test
	public void testGetSuperficieEtage() {
		Maison maison = new Maison();
		maison.ajouterPiece(new Cuisine(15.0, 0));
		maison.ajouterPiece(new Salon(25.0, 0));
		maison.ajouterPiece(new SalleDeBain(10.0, 0));
		maison.ajouterPiece(new WC(4.0, 0));
		maison.ajouterPiece(new Chambre(20.0, 1));
		maison.ajouterPiece(new Chambre(20.0, 1));
		maison.ajouterPiece(new SalleDeBain(10.0, 1));
		maison.ajouterPiece(new WC(4.0, 1));
		double resultat = maison.getSuperficieEtage(1);
		assertEquals(54.0, resultat, 0.00001);
	}

	@Test
	public void testGetSuperficieType() {
		Maison maison = new Maison();
		maison.ajouterPiece(new Cuisine(15.0, 0));
		maison.ajouterPiece(new Salon(25.0, 0));
		maison.ajouterPiece(new SalleDeBain(10.0, 0));
		maison.ajouterPiece(new WC(4.0, 0));
		maison.ajouterPiece(new Chambre(20.0, 1));
		maison.ajouterPiece(new Chambre(20.0, 1));
		maison.ajouterPiece(new SalleDeBain(10.0, 1));
		maison.ajouterPiece(new WC(4.0, 1));
		double resultat = maison.getSuperficieType("Chambre");
		assertEquals(40.0, resultat, 0.00001);
	}

	@Test
	public void testGetNombreType() {
		Maison maison = new Maison();
		maison.ajouterPiece(new Cuisine(15.0, 0));
		maison.ajouterPiece(new Salon(25.0, 0));
		maison.ajouterPiece(new SalleDeBain(10.0, 0));
		maison.ajouterPiece(new WC(4.0, 0));
		maison.ajouterPiece(new Chambre(20.0, 1));
		maison.ajouterPiece(new Chambre(20.0, 1));
		maison.ajouterPiece(new SalleDeBain(10.0, 1));
		maison.ajouterPiece(new WC(4.0, 1));
		int resultat = maison.getNombreType("Chambre");
		assertEquals(2.0, resultat, 0.00001);
	}

}
