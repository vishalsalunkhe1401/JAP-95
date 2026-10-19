// E
// ED
// EDC
// EDCB
// EDCBA

public class Ex12{
	public static void main(String[] args) {
		int n=5;
		for(int i=n;i>=1;i--){
			for(int j=5;j>=i;j--){
				System.out.print((char)(64+j));

			}
			System.out.println();

		}
	}
	
}