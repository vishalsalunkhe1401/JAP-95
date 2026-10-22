//                 OA
//             JC  NB
//         FF  IE  MD
//     CJ  EI  HH  LG
// AO  BN  DM  GL  KK

public class Ex09{
    public static void main(String[] args) {
        int n=5;
        int count1=15;
        int count2=1;

        for(int i=n,i1=1;i1<=n||i>=1;i1++,i--){
            int c1=count1;
            int c2=count2;

            for(int sp=i;sp>1;sp--){
                System.out.print("\t");
            }
            for(int j=i;j<=n;j++){
                System.out.print((char)(c1+64));
                 System.out.print((char)(c2+64)+"\t");
                c1+=j;
                c2--;
            }
            System.out.println();
            count1-=i;
            count2+=i1+1;
        }
    }
}