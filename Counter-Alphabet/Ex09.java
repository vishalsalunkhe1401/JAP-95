// A        1
// FB       62 
// JGC      1073
// MKHD     121184
// ONLIE

public class Ex09{
	public static void main(String[] args) {
		  int n=5;
		  int count=1;

		  for(int i=n;i>=1;i--){
		  	int c=count;
		  	for(int j=i;j<=n;j++){
		  		System.out.print((char)(64+c));
		  		c-=j;
		  	}
		  	System.out.println();
		  	count+=i;

		  }

	}
}