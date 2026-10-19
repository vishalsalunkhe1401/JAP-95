// O    15
// JN   1014
// FIM  6913
// CEHL
// ABDGK

public class Ex12{
	public static void main(String[] args) {
		int n=5;
		int count=15;

		for(int i=n;i>=1;i--){
			int c=count;
			for(int j=i;j<=n;j++){
				System.out.print((char)(c+64));
				c+=j;
			}
			System.out.println();
			 count-=i;
		}
	}
}