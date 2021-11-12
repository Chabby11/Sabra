import java.util.Scanner;
class Qn5{
    public static void main(String[]args){
        System.out.println("how many egg do you have");
        Scanner input = new Scanner(System.in);
        int No_of_eggs = input.nextInt();
        int Gross = No_of_eggs / 144;
        int Dozen = (No_of_eggs % 144)/ 12;
        int Remainder = No_of_eggs % 12;
        System.out.println("you have; " +Gross+ "Gross,"+Dozen+" Dozen(s) and " +Remainder+ "eggs");
    }
}