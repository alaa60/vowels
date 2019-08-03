package exelib;

import java.util.Scanner;

public class VowelsCounter {

	public static void main(String[] args) {
		
		System.out.print("Enter the text: ");
		String word = (new Scanner(System.in)).next();
		
		int lower, cnt = 0,i;
		
		for( i=0; i< word.length(); i++ ) {
			lower = 97;
			while(lower <= 117) {
				
				if(word.charAt(i)==(char) lower || word.charAt(i)==(char) (lower-32)) {
					cnt++; break;
				}
				
				if( lower>=105 ) lower+=6;
				else lower+=4;
			}
			
		}

		System.out.println("Number of vowels: "+cnt);
		System.out.println("Percentage: "+((cnt*100)/word.length())+'%');
	}


}
