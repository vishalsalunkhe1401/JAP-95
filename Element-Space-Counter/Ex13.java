// ABCDE
//  FGHI
//   JKL
//    MN
//     O

    public class Ex13{
    	public static void main(String[] args) {
    		int n=5;
    		int count=1;

    		for(int i=1;i<=n;i++){
    			for(int sp=1;sp<i;sp++){
    				System.out.print(" ");
    			}
    			for(int j=n;j>=i;j--){
    				System.out.print((char)(count+64));
    				count++;
    			}
    			System.out.println();
    		}
    	}
    }