import java.util.Scanner;

class Dec2Hex
{

    public static void main(String args[])
    {          
        char ch[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
         int rem,num;
        //Created Scanner
        Scanner input = new Scanner(System.in);   
        //Promp the user to enter a decimal integer
        System.out.println("Enter a Decimal number: ");
        num=input.nextInt();
        System.out.println("Converting the Decimal Value " + num + " to Hex...");
        //Convert decimal to hex
        String hexadecimal="";
        while(num != 0)
        {
	    rem=num%16;
	    hexadecimal= ch[rem] + hexadecimal;
            num= num/16;
        }
        
        System.out.println("Hexadecimal representation is : " + hexadecimal);

    }
}