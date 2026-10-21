// 11   12   13   14   15
//      7    8    9    10
//           4    5    6
//                2    3
//                     1

                    public class Ex16{
                    	public static void main(String[] args) {
                    		int n=5;
                    		int count=11;

                    		for(int i=n;i>=1;i--){
                    			int c=count;
                    			for(int sp=i;sp<n;sp++){
                    				System.out.print("\t");
                    			}
                    			for(int j=i;j>=1;j--){
                    				System.out.print(c+"\t");
                    				c++;
                    			}
                    			System.out.println();
                    			count-=i-1;
                    		}
                    	}
                    }
