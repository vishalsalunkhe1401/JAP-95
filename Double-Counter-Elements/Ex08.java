//                 EO
//             IJ  DN
//         LF  HI  CM
//     NC  KE  GH  BL
// OA  MB  JD  FG  AK

public class Ex08{
    public static void main(String[] args) {
        int n=5;
        int count1=5;
        int count2=15;

        for(int i=n;i>=1;i--){
            int c1=count1;
            int c2=count2;
            for(int sp=i;sp>1;sp--){
                System.out.print("\t");
            }
            for(int j=i;j<=n;j++){
                System.out.print((char)(c1+64));
                System.out.print((char)(c2+64)+"\t");

                c1-=j+1;
                c2+=j;
            }
            System.out.println();
            count1+=i-1;
            count2-=i;
        }
    }
}