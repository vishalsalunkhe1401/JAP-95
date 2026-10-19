// O          15
// NM         1413
// LKJ        121110
// IHGF       9876
// EDCBA      54321

public class Ex02{
	public static void main(String[] args) {
		int n=5;
		int count=15;

		for(int i=1;i<=n;i++){
			int c=count;
			for(int j=i;j>=1;j--){
				System.out.print((char)(64+c));
				c--;
			}
			System.out.println();
			count-=i;
		}
	}
	
}