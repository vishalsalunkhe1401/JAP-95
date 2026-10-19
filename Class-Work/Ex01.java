//     A
//    BA 
//   CBA
//  DCBA
// EDCBA

public class Ex01{
	public static void main(String[] args) {

         int n=5;
        for(int i=1;i<=n;i++){

        	for(int sp=i;sp<n;sp++){
        		System.out.print(" ");
        }
		for(int j=i;j>=1; j--){
			System.out.print((char)(64+j));
		}System.out.println();

		
	}
}   

}