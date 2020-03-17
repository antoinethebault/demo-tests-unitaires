package dev.utils;

import static org.junit.Assert.*;

import org.junit.Test;
import dev.utils.StringUtils;

public class StringUtilsTest {

	@Test
	public void testLevenshteinDistance() {
		int resultat;
		try {
			resultat = StringUtils.levenshteinDistance("chat","chats");
			assertEquals(1,resultat);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void testLevenshteinDistance2() {
		int resultat;
		try {
			resultat = StringUtils.levenshteinDistance("machins","machine");
			assertEquals(1,resultat);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testLevenshteinDistance3() {
		int resultat;
		try {
			resultat = StringUtils.levenshteinDistance("aviron","avion");
			assertEquals(1,resultat);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void testLevenshteinDistance4() {
		int resultat;
		try {
			resultat = StringUtils.levenshteinDistance("distance","instance");
			assertEquals(2,resultat);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void testLevenshteinDistance5() {
		int resultat;
		try {
			resultat = StringUtils.levenshteinDistance("Chien","Chine");
			assertEquals(2,resultat);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void testLevenshteinDistanceNULL() {
		try {
			StringUtils.levenshteinDistance(null,null);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
