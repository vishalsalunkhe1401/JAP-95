// E      5
// ID     94
// LHC    1283
// NKGB   141172
// OMJFA  1513

public class Ex10{
	public static void main(String[] args) {
		
		int n=5;
		int count=5;

		for(int i=n;i>=1;i--){
			int c=count;
			for(int j=i;j<=n;j++){
				System.out.print((char)(c+64));
				c-=j+1;
			}
			System.out.println();
			count+=i-1;
		}
	}
}