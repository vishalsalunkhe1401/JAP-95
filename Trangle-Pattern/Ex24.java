// abcde
// bcde
// cde
// de
// e

public class Ex24{
	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++){
			for(int j=i;j<=5;j++){
				System.out.print((char)(96+j));
			}
			System.out.println();
		}
	}
}