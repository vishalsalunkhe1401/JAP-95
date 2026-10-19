//     e
//    ed
//   edc
//  edcb
// edbca 

public class Ex02{
	public static void main(String[] args) {
         int n=5;
     for(int i=n;i>=1;i--){
        for(int sp=i;sp>1;sp--){
            System.out.print(" ");
        }
     
     for(int j=n;j>=i;  j--) {
        System.out.print((char)(96+j));
     }  

 System.out.println();
    }
}
 }

