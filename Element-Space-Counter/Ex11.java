//     K
//    GL
//   DHM
//  BEIN
// ACFJO

public class Ex11{
	public static void main(String[] args) {
		
		int n=5;
		int count=11;

		for(int i=n;i>=1;i--){
			int c=count;
			for(int sp=1;sp<i;sp++){
				System.out.print(" ");
			}
			for(int j=i;j<=n;j++){
				System.out.print((char)(c+64));
				c+=j+1;
			}
			System.out.println();
			count-=i-1;
		}
	}
}    