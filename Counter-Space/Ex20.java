// 15   10   6   3   1
//      14   9   5   2
//           13  8   4
//               12  7
//                   11

     public class Ex20{
     public static void main(String[] args) {
     	int count=15;
     	int n=5;

     	for(int i=1;i<=n;i++){
     		int c=count;
     		for(int sp=i;sp>1;sp--){
     			System.out.print("\t");
     		}
     		for(int j=n;j>=i;j--){
     			System.out.print(c+"\t");
     			c-=j;
     		}
     		System.out.println();
     		count--;
     	}
     }
     }             