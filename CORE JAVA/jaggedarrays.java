import java.util.Scanner;
public class jaggedarrays {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("ENTER N= ");
        int n=input.nextInt();
        input.nextLine();
        int arr[][]=new int[n][];
        for(int i=0;i<n;i++){
            System.out.println("NUMBER: ");
            int x=input.nextInt();
            input.nextLine();
            arr[i]=new int[x];
            for(int j=0;j<x;j++){
                arr[i][j]=(int)(Math.random()*100);
            }
        }
        for(int x[]:arr){
            for(int y:x){
                System.out.print(y+" ");
            }
            System.out.println();
        }
        input.close();
    }
}
