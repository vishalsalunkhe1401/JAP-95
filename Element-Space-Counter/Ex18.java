// EILNO
//  DHKM
//   CGJ
//    BF
//     A

    public class Ex18{
    	public static void main(String[] args) {
    		int n=5;
    		int count=5;

    		for(int i=1;i<=n;i++){
    			int c=count;
    			for(int sp=i;sp>1;sp--){
    				System.out.print(" ");
    			}
    			for(int j=n;j>=i;j--){
    				System.out.print((char)(c+64));
    				c+=j-1;
    			}
    			System.out.println();
    			count--;
    		}
    	}
    }