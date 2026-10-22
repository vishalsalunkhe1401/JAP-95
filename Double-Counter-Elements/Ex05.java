
//                 Ao
//             Fm  Bn
//         Jj  Gk  Cl
//     Mf  Kg  Hh  Di
// Oa  Nb  Lc  Id  Ee

public class Ex05{
	public static void main(String[] args) {
		int n=5;
		int count1=1;
		int count2=15;

		for(int i=n,i1=1;i1<=n||i>=1;i1++,i--){
			int c1=count1;
			int c2=count2;
			for(int sp=i;sp>1;sp--){
				System.out.print("\t");
			}
			for(int j=i;j<=n;j++){
				System.out.print((char)(c1+64));
				System.out.print((char)(c2+96)+"\t");
				c1-=j;
				c2++;
			}
			System.out.println();
			count1+=i;
			count2-=i1+1;
		}
	}
}
