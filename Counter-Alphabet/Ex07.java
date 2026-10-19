// O      15
// NJ     1410
// MIF    1396
// LHEC   12853
// KGDBA

public class Ex07{
	public static void main(String[] args) {

		int n=5;
		int count=15;
      for(int i=n;i>=1;i--){
      	int c=count;
      
        for(int j=n;j>=i;j--){
        	System.out.print((char)(64+c));
        	c-=j-1;
        }
        System.out.println();
        count--;

    }
		
	}
}