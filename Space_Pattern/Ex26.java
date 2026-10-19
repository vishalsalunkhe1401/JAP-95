// edcba
//  dcba
//   cba
//    ba
//     a

    public class Ex26{

    	public static void main(String[] args) {
    		
    		for(int i=5;i>=1;i--){
    			for(int sp=i;sp<5;sp++){
    				System.out.print(" ");
    			}for(int j=i;j>=1;j--){
    				System.out.print((char)(96+j));
    			}
    			System.out.println();
    		}
    	}

    }