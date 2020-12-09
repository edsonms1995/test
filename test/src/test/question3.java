package test;

import java.io.IOException;


public class question3 {
	
	public static void main(String[] args) throws IOException {
		 
		 ConcatERemove("blablablabla", "blablabcde", 8);
		 //ConcatERemove("aba", "aba", 7);
		 //ConcatERemove("ashley", "ashley", 2);
			
	}
	
	//just a method to format the output
	public static void ConcatERemove(String s, String t, int k) {
		if (ConcatERemoveOp(s, t, k)) 
			System.out.println("SIM");
		else 
			System.out.println("NÃO");
	}
		
	
	public static boolean ConcatERemoveOp(String s, String t, int k) {
		
		if (!fieldsMeetPreConditions(s, t, k)) //check s,t and k length's
			return false;
		
		int keepCharacters = 0; //equals characters in first characters
		
		for (int i = 0; i < t.length(); i++) { // s = "atr22", t = "at999" -> keepCharacters = 2;
			if (i >= s.length() || s.charAt(i) != t.charAt(i) || i >= k) 
				break;
			keepCharacters++;
		}
		
		int removeOperations = s.length() - keepCharacters; //how many remove operations I need
		int concatOperations = t.length() - keepCharacters; //how many concat operation I need
		
		
		if (removeOperations + concatOperations > k ) {
			return false; //it means I do not have enough operations to perform the change
		}
		
		String tCopy = t; //creating a copy to validate in the end, that 't' is equal to 's' after exec steps. 
		String valuesFromConcatOperations = ""; //use to store values removed from 'tCopy' string (concat operations)
		for (int i = 0; i < k; i++) {
			if (t.equalsIgnoreCase(s + valuesFromConcatOperations)) {
				return true;
			}
			if (removeOperations > 0) {
				removeOperations--;
				s = removeLastCharacter(s);
			}
			else if (concatOperations > 0) {
				concatOperations--;
				char lastCharT =  tCopy.charAt(tCopy.length() - 1);
				tCopy = removeLastCharacter(tCopy);
				valuesFromConcatOperations = concatCharacter(valuesFromConcatOperations, lastCharT);
			}
		}
		
		if (t.equalsIgnoreCase(s + valuesFromConcatOperations)) {
			return true;
		}
		return false;
	}
	
	public static String removeLastCharacter(String str) {
		return str.substring(0, str.length() - 1);
	}
	
	public static String concatCharacter(String str, char c) {
		return c + str;
	}
	
	public static boolean fieldsMeetPreConditions (String s, String t, int k)  {
		if (s.length() < 1 || s.length() > 100)
			return false;
		if (t.length() < 1 || t.length() > 100)
			return false;
		if (k < 1 || k > 100)
			return false;
		return true;
	}
}
