import java.util.*;
class calc{
    public static void main(String[]args){
        System.out.print("ENTER OPERAND A\t:");
        Scanner sc= new Scanner(System.in);
        double a =sc.nextInt();
        System.out.print("\nENTER YOUR OPERATOR\t:");
                char operator= sc.next().charAt(0);


                if(operator!='+' && operator!='-'&& operator!='*' && operator!='/' && operator!='%'){
                    System.out.print("PLEASE ENTER A VALID OPEARATOR");
                }

        System.out.print("\nENTER OPERAND B\t:");
        double b= sc.nextInt();

         double result =0;
         
         switch (operator) {
            case '+':
                result= a+b;
                break;
         case '-':
         result=a-b;
        
         break;
         case '*':
         result= a*b;
         break;
         case '/':
         result= a/b;
         break;
         case '%':
         result= a%b;
            default:
            System.out.println("PLEASE ENTER VALID  OPERAND/OPERATOR");
                break;
         }
        System.out.println("THE FINAL ANSWER IS: " +result);
    }
}