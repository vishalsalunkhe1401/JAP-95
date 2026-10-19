// O     15
// MN    1314
// JKL   101112
// FGHI  6789
// ABCDE 12345

public class Ex04{
	public static void main(String[] args) {
		
		int n=5;
		int count=15;

		for(int i=1;i<=n;i++){
			int c=count;

			for(int j=1;j<=i;j++){
				System.out.print((char)(64+c));
				c++;
			}
			System.out.println();
			count-=i+1;
		}
	}
}