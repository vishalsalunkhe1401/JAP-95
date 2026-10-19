// 5  4  3  2  1
// 9  8  7  6
// 12 11 10 
// 14 13 
// 15

public class Ex15{
	public static void main(String[] args) {
		
	int n=5;
	int count=5;
	for(int i=1;i<=n;i++){
		int c=count;
		for(int j=i;j<=n;j++){
			System.out.print(c+"\t");
			c--;
		}
		System.out.println();
		count+=n-i;

	}
	}
	
}