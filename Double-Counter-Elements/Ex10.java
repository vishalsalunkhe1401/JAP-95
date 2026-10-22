// Ea  Db  Cd  Bg  Ak
// Ic  He  Gh  Fl
// Lf  Ki  Jm
// Nj  Mn
// Oo


public class Ex10{
	public static void main(String[] args) {
		int n=5;
		int count1=5;
		int count2=1;

		for(int i=n,i1=1;i1<=n||i>=1;i1++,i--){
			int c1=count1;
			int c2=count2;

			for(int j=i,j1=i1;j1<=n||j>=1;j1++,j--){
				System.out.print((char)(c1+64));
				System.out.print((char)(c2+96)+"\t");
				c1--;
				c2+=j1;
			}
			System.out.println();
			count1+=i-1;
			count2+=i1+1;
		}
	}
}