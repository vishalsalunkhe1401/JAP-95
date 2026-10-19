// A     1
// BC    23
// DEF   456
// GHIJ  78910
// KLMNO 1112131415

public class Ex01{
	public static void main(String[] args) {

		int n=5;
		int count=1;
		for(int i=1;i<=n;i++){
			int c=count;
			for(int j=i;j>=1;j--){
				System.out.print((char)(c+64));
				c++;
			}
			System.out.println();
			count+=i;
		}
		
	}
}