// ABDGK
//  CEHL
//   FIM
//    JN
//     O

    public class Ex24{
    	public static void main(String[] args) {
    		
    		int n=5;
    		int count=1;

    		for(int i=1;i<=n;i++){
    			int c=count;
    			for(int sp=i;sp>1;sp--){
    				System.out.print(" ");

    			}
    			for(int j=i;j<=n;j++){
    				System.out.print((char)(c+64));
    				c+=j;
    			}
    			System.out.println();
    			count+=i+1;
    		}
    	}
    }