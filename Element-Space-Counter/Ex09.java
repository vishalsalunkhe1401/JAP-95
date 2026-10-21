//     A
//    FB
//   JGC
//  MKHD
// ONLIE

public class Ex09{
	public static void main(String[] args) {
		int n=5;
		int count=1;

        for(int i=n;i>=1;i--){
        	int c=count;
        	for(int sp=i;sp>1;sp--){
        		System.out.print(" ");
        	}
        
		for(int j=i;j<=n;j++){
			System.out.print((char)(c+64));
			c-=j;
		}
		System.out.println();
		count+=i;
	}
 }
}    