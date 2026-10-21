   //            15
   //         13 14
   //      10 11 12
   //    6  7  8  9
   // 1  2  3  4  5  

   public class Ex04{
   	public static void main(String[] args) {
   		
   		int n=5;
   		int count=15;

   		for(int i=1;i<=n;i++){
   			int c=count;
   			for(int sp=i;sp<n;sp++){
   				System.out.print("\t");
   			}
   			for(int j=1;j<=i;j++){
   				System.out.print(c+"\t");
   				c++;
   			}
   			System.out.println();
   			count-=i+1;
   		}
   	}
   } 


