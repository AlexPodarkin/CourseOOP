package seminars;

import java.util.Arrays;



public class practical
{
    public static void main(String[] args) 
    {
       cikli(); 


        
    }  // END Main 

    static void cikli()
    {
        int a = 45;
        switch (a) 
        {
            case 1:
                System.out.println("1");
            case 2:
                System.out.println("2");        
            default:
                System.out.println("no");
        }

        int[] arr = {5,4,3,2,1,0};
        System.out.println(Arrays.toString(arr));

            for (int j = 0; j < arr.length-1; j++)
            {
                if (arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    j = -1;
                }
            }

        System.out.println(Arrays.toString(arr));

        String slovo = "qweasddsaewq";
        int count = 0;
        for (int i = 0, j = slovo.length() ; i < slovo.length()/2 ; i++, j--) 
        {
            if(slovo.charAt(i) == slovo.charAt(j-1))
            {
                count++;         
            }
        }
        if (count == slovo.length()/2)
        {
            System.out.println("Palindrome !");
        }
        else System.out.println("NO Palindrome !");

        
        for (int i = 0; i < 7; i++) 
        {
            for (int j = 0; j < 7; j++) 
            {
                if (i == 0 || i == 6 || j == 0 || j == 6) System.out.print("0 ");
                else System.out.print("* ");
            }
            System.out.println();
        }

        

    }
    

}