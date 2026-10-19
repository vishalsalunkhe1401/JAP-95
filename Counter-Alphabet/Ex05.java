// A     1
// BF    26
// CGJ   3710
// DHKM  481113
// EILNO 59121415

public class Ex05{
	public static void main(String[] args) {
		int n=5;
		int count=1;

        for(int i=n;i>=1;i--){
             int c=count;
        
		for(int j=n;j>=i;j--){
			System.out.print((char)(64+c));
			c+=j-1;
		}
		System.out.println();
		count++;
		}
	}
}