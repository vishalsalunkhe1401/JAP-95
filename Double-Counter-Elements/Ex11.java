// EE  DI  CL  BN  AO
// ID  HH  GK  FM
// LC  KG  JJ
// NB  MF
// OA

public class Ex11{
	public static void main(String[] args) {
		int n=5;
		int count1=5;
		int count2=5;

		for(int i=1;i<=n;i++){
			int c1=count1;
			int c2=count2;

			for(int j=n;j>=i;j--){
				System.out.print((char)(c1+64));
				System.out.print((char)(c2+64)+"\t");
				c1--;
				c2+=j-1;
			}
			System.out.println();
			count1+=n-i;
			count2--;

		}
	}
}