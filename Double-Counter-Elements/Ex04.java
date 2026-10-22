// Ee   Di   Cl  Bn   Ao
// Id   Hh   Gk  Fm
// Lc   Kg   Jj
// Nb   Mf
// Oa

public class Ex04{
	public static void main(String[] args) {
		int n=5;
		int count1=5;
		int count2=5;

		for(int i=n,i1=1;i1<=n||i>=1;i--,i1++){
			int c1=count1;
			int c2=count2;
			for(int j=1,j1=n;j1>=i1||j<=i;j1--,j++){
				System.out.print((char)(c1+64));
				System.out.print((char)(c2+96)+"\t");
				c1--;
				c2+=j1-1;
			}
			System.out.println();
			count1+=i-1;
			count2--;

		}

	}
}