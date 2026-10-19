//     K   11
//    GL    7
//   DHM    4
//  BEIN
// ACFJO

public class Ex08{
    public static void main(String[] args) {
        int n=5;
        int count=11;

        for(int i=n;i>=1;i--){
            int c=count;
            for(int sp=i;sp>1;sp--){
                System.out.print(" ");
            }
                for(int j=i;j<=n;j++){
                    System.out.print((char)(c+64));
                    c+=j+1;
                }
                System.out.println();
                count-=i-1;
            }
        }

    }
	
    