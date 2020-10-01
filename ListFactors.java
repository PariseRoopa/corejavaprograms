package demoprograms;

public class ListFactors {
	public static void main(String args[]){
		int number = 6;
		for(int i = 1; i <= number; ++i) {
			if (number % i == 0) {
				System.out.print(i + " ");
				}
			}
		}
	}