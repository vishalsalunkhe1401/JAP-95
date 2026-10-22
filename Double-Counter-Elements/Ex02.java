// AK
// FL  BG
// JM  GH  CD
// MN  KI  HE  DB
// OO NJ   LF  IC  EA

public class Ex02{
	public static void main(String[] args) {
int n=5;
int count1=1;
int count2=(n*(n+1)/2)-n+1;  //11
  
  for(int i=n;i>=1;i--){
  	int c1=count1;
  	int c2=count2;
  	for(int j=i,j1=n;j<=n || j1>=i; j1--,j++){

  		System.out.print((char)(c1+64));
  		System.out.print((char)(c2+64)+"\t");
  		c1-=j;
  		c2-=j1;
  	}
  	System.out.println();
  	count1+=i;
  	count2++;
  }

	}
	
}

