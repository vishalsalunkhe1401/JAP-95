//     O
//    MN
//   JKL
//  FGHI
// ABCDE

public class Ex04{
	public static void main(String[] args) {
		
		int n=5;
		int count=15;

		for(int i=1;i<=n;i++){
		int c=count;
		for(int sp=i;sp<n;sp++){
			System.out.print(" ");
		}
		for(int j=1;j<=i;j++){
			System.out.print((char)(c+64));
			c++;
		}
		System.out.println();
		count-=i+1;
		}
	}
}    