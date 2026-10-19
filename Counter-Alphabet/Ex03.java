// A       1
// CB      32
// FED     654
// JIHG    10987
// ONMLK   1514131211

public class Ex03{
	public static void main(String[] args) {
		
		int n=5;
		int count=1;
		for(int i=1;i<=n;i++){
			int c=count;
			for(int j=i;j>=1;j--){
				System.out.print((char)(64+c));
				c--;
			}
			System.out.println();
			count+=i+1;
		}
	}
}