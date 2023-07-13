import java.util.Scanner;

public class Str {
    public static void main(String[] args) {
        Scanner sca=new Scanner(System.in);
        System.out.println("Enter the String:");
        String string=sca.next();
        int cont=0;
        int maxLen=0;
        for(int i=0;i<string.length();i++)
        {
            if(string.charAt(i)=='a' ||string.charAt(i)=='e' ||string.charAt(i)=='i' ||string.charAt(i)=='o' ||string.charAt(i)=='u')
            {
                cont++;
                maxLen=Math.max(cont,maxLen);
            }else{
                cont=0;
            }

        }
        System.out.println(maxLen);
    }
}
