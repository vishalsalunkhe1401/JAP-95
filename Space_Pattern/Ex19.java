// 54321
//  5432
//   543
//    54
//     5

    public class Ex19{
    	public static void main(String[] args) {
             for(int i=1;i<=5;i++){
             	for(int sp=i;sp>1;sp--){
             		System.out.print(" ");
             	}
             
    		for(int j=5;j>=i;j--){
    			System.out.print(j);
    		}
    		System.out.println();
    	}
    }
}