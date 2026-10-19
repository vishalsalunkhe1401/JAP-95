// 12345
//  2345
//   345
//    45
//     5 

    public class Ex20{

    	public static void main(String[] args) {
    		
    		for(int i=1;i<=5;i++){

    			for(int sp=i;sp>1;sp--){
    				System.out.print(" ");
    			}
    			for(int j=i;j<=5;j++){
    				System.out.print(j);
    			}
    			System.out.println();

    		}
    	}

    }