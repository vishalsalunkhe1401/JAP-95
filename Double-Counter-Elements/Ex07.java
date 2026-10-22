// OO  NJ  LF  IC  EA
// MN  KI  HE  DB
// JM  GH  CD
// FL  BG
// AK

public class Ex07{
	public static void main(String[] args) {
		int n=5;
		int count1=15;
		int count2=15;

		for(int i=1;i<=n;i++){
			int c1=count1;
			int c2=count2;
			for(int j=i,j1=n;j1>=i||j<=n;j++,j1--){
				System.out.print((char)(c1+64));
				System.out.print((char)(c2+64)+"\t");
				c1-=j;
				c2-=j1;
			}
			System.out.println();
			count1-=i+1;
			count2--;

		}
	}
}