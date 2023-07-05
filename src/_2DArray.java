import java.util.Scanner;

public class _2DArray {
    public static void main(String[] args) {

        Scanner sca= new Scanner(System.in);
        int [][] arr = new int[3][3];
        for (int i=0;i< arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                arr[i][j]=sca.nextInt();
            }
        }
        for(int []i:arr){
            for(int j:i){
                System.out.println(j+" ");
            }
        }

    }
}
