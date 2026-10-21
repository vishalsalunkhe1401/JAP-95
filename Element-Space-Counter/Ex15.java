// EDCBA
//  IHGF
//   LKJ
//    NM
//     O

    public class Ex15{
    	public static void main(String[] args) {
    		int n=5;
    		int count=5;

    		for(int i=n;i>=1;i--){
    			int c=count;
    			for(int sp=i;sp<n;sp++){
    				System.out.print(" ");
    			}
    			for(int j=i;j>=1;j--){
    				System.out.print((char)(c+64));
    				c--;
    			}
    			System.out.println();
    			count+=i-1;
    		}
    	}
    }