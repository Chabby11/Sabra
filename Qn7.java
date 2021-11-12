import java.util.Scanner;
class Qn7{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("please enter first number : ");
        int f_number = input.nextInt();
        System.out.println("please enter second number : ");
        int s_number =input.nextInt();
        int hcf,lcm,a,b,c;
        a = f_number;
        b = s_number;
        while(b != 0){
            c = b;
            b = a%b;
            a = c;
        }
        hcf = a;
        lcm = (f_number * s_number)/hcf;
        System.out.println("the hcf of input numbers is : "+hcf);
        System.out.println("the lcm of input numbers is :"+lcm);
     
    }
}