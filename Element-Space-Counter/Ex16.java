// KLMNO
//  GHIJ
//   DEF
//    BC
//     A

    public class Ex16{
    	public static void main(String[] args) {
    		
    		int n=5;
    		int count=11;

    		for(int i=n;i>=1;i--){
    			int c=count;
    			for(int sp=i;sp<n;sp++){
    				System.out.print(" ");
    			}
    			for(int j=1;j<=i;j++){
    				System.out.print((char)(c+64));
    				c++;
    			}
    			System.out.println();
    			count-=i-1;
    		}
    	}
    }