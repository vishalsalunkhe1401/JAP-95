public class Ex07{
	public static void main(String[] args) {
		int n=5;
		int count=11;

		for(int i=n;i>=1;i--){
           int c=count;
           for(int sp=i;sp>1;sp--){
           	System.out.print("\t");
           }for(int j=n;j>=i;j--){
           	System.out.print(c+"\t");
           	c-=j;
           }
           System.out.println();
           count++;
		}
	}
}