//     K
//    LG
//   MHD
//  NIEB
// OJFCA

public class Ex08{
	public static void main(String[] args) {
		int n=5;
		int count=11;

         for(int i=n;i>=1;i--){
         	int c=count;
         	for(int sp=1;sp<i;sp++){
         		System.out.print(" ");
         	
         }
		for(int j=n;j>=i;j--){
			System.out.print((char)(c+64));
			c-=j;
		}
		System.out.println();
		count++;

	}
	}
}    