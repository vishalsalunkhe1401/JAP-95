//     A
//    BF
//   CGJ
//  DHKM
// EILNO

public class Ex05{
	public static void main(String[] args) {
		int n=5;
		int count=1;

		for(int i=1;i<=n;i++){
			int c=count;
			for(int sp=i;sp<n;sp++){
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++){
				System.out.print((char)(c+64));
				c+=n-j;
			}
			System.out.println();
			count++;
		}
	}
}    