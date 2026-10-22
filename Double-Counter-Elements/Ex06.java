// AO  FM  JJ  MF  OA
//     BN  GK  KG  NB
//         CL  HH  LC
//             DI  ID
//                 EE


public class Ex06{
    public static void main(String[] args) {
        int n=5;
        int count1=1;
        int count2=15;

        for(int i=1;i<=n;i++){
            int c1=count1;
            int c2=count2;
            for(int sp=i;sp>1;sp--){
                System.out.print("\t");
            }
            for(int j=n,j1=i;j1<=n||j>=i;j--,j1++){
                System.out.print((char)(c1+64));
                System.out.print((char)(c2+64)+"\t");


                c1+=j;
                c2-=j1+1;
            }
            System.out.println();
            count1++;
            count2-=i;
        }
    }
}             