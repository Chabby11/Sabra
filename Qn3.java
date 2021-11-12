import java.util.Scanner;
class Qn3{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("enter number of participant");
        int part = input.nextInt();
        int rev = 2500 * part;
        System. out.println("the revenue of the company will generate for the tour is" +rev);
    }
}
