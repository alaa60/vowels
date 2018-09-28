import java.util.Scanner;
public class First {

	public static void main(String[] args) {
		System.out.print("Enter the text: ");
		Scanner read = new Scanner(System.in);
		String word = read.next();
		int lower, upper, cnt = 0,i;
		for(i=0; i<word.length(); i++) {
			lower = 97;
			upper = 65;
			while(lower<= 117) {
				if(word.charAt(i)==(char) lower || word.charAt(i)==(char) upper) {cnt++; break;}
				if( lower>=105 ) {lower+=6; upper+=6;}
				else {lower+=4; upper+=4;}
			}
		}

		System.out.println("Number of vowels: "+cnt);
		System.out.println("Percentage: "+((cnt*100)/word.length())+'%');
	}

}
