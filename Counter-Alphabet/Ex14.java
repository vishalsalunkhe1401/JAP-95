// ONMLK
// JIHG
// FED
// CB
// A

public class Ex14{
	public static void main(String[] args) {
		int n=5;
		int count=15;
		for(int i=n;i>=1;i--){
			for(int j=i;j>=1;j--){
				System.out.print((char)(64+count));
				count--;
			}
			System.out.println();

		}
	}
}