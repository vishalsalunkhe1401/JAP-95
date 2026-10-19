// ABCDE
//  ABCD
//   ABC
//    AB
//     A

    public class Ex23{
    	public static void main(String[] args) {
    		 for(int i=5;i>=1;i--){
    		 	for(int sp=i;sp<5;sp++){
    		 		System.out.print(" ");
    		 	}
    		 
    		for(int j=1;j<=i;j++){
    			System.out.print((char)(64+j));
    		}
    		System.out.println();
    	}

    	}
    }