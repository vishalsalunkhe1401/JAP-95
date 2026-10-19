// 1
// 3   2
// 6   5   4
// 10  9   8   7
// 15  14  13  12  11   



public class Ex03{
	public static void main(String[] args) {

		int n=5;//5
		int count=1;//1

         for(int i=1;i<=n;i++){ //5<=5
         	int c = count; //15
         
		for(int j=i;j>=1;j--){ //0>=1 
			System.out.print(c+"\t"); //15 //14 //13 //12 /11
			c--;//10
		}
		System.out.println();//nextline
		count+=i+1;//1+=1+1=3
		
	}

	 }
}