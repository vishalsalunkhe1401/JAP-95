// 11 12  13  14  15
// 7  8   9   10
// 4  5   6
// 2  3
// 1 

public class Ex16{
	public static void main(String[] args) {
		int n=5;
		int count = 11;

		for(int i=1;i<=n;i++){
			int c=count;
         for(int j=i;j<=n;j++){
         	System.out.print(c+"\t");
         	c++;
         }
         System.out.println();
         count-=n-i;
		}
	}
}