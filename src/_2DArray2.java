public class _2DArray2 {
    public static void main(String[] args) {
        int [][]arr={{10,11,12,13},
                     {20,21,22,23},
                     {30,31,32,33},
                     {40,41,42,42}};

//        for(int col=0;col<arr[0].length;col++)
//        {
//           if(col%2==0)
//           {
//               for(int j=0;j<arr.length;j++)
//               {
//                   System.out.print(arr[col][j]+" ");
//               }
//           }else{
//               for(int j=arr.length-1;j>0;j--)
//               {
//                   System.out.print(arr[col][j]+" ");
//               }
//           }
//        }

        for(int i=0;i<(arr.length%2==0 ? arr.length/2 : arr.length/2 + 1);i++)
        {
            for(int j=i;j<arr.length;j++)
            {
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }

        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
