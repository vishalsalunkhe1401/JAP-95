// Ao
// Bn   Cm
// Dl   Ek   Fj
// Gi   Hh   Ig   Jf
// Ke   Ld   Mc   Nb   Oa

public class Ex01{
	public static void main(String[] args) {
		int n=5;
		int count1=1;
		int count2=15;

		for(int i=1;i<=n;i++){

		  for(int j=1;j<=i;j++){
		  	System.out.print((char)(count1+64));
		  	System.out.print((char)(count2+96)+"\t");
		  	count1++;
		  	count2--;
		  }
		  System.out.println();

		}
	}
}