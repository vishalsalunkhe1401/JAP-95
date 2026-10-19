// K      11
// LG     127
// MHD    1384
// NIEB   14952
// OJFCA  1510631

public class Ex08{
	
	public static void main(String[] args) {
		int n=5;
		int count=11;
        for(int i=n;i>=1;i--){
        	int c=count;
        
		for(int j=n;j>=i;j--){
			System.out.print((char)(64+c));
			c-=j;
		}
		System.out.println();
		count++;
	}
	}
}