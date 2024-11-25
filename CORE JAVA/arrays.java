import java.util.Scanner;
public class arrays {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int arr[][]=new int[3][2];
        // arr[0][0]=1;
        // arr[0][1]=2;
        // arr[1][0]=3;
        // arr[1][1]=4;
        // arr[2][0]=5;
        // arr[2][1]=6;
        // for(int i=0;i<3;i++){
        //     for(int j=0;j<2;j++){
        //         System.out.println("ENTER ELEMENT a"+(i+1)+""+(j+1));
        //         arr[i][j]=input.nextInt();
        //         input.nextLine();
        //     }
        // }
        for(int i=0;i<3;i++){
            for(int j=0;j<2;j++){
                arr[i][j]=(int)((Math.random())*10);
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<2;j++){
                System.out.printf(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
