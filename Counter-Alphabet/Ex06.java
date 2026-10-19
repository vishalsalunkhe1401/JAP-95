// E     5
// DI    49
// CHL   3812
// BGKN  4913
// AFJMO

public class Ex06{
	public static void main(String[] args) {
		
		int n=5;
		int count=5;
        
        for(int i=n;i>=1;i--){
        	int c=count;
        
		for(int j=n;j>=i;j--){
			System.out.print((char)(64+c));
			c+=j;
		}
		System.out.println();
		count--;	
	}
}
}