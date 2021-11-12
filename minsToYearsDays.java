import java.util.Scanner;
class minsToYearsDays{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("please enter minutes : ");
        int min = input.nextInt();
        int a = 60;
        int b = 60 * 24;
        int c = b * 365;
        int years = min/c;
        int days = (min % c)/ b;
        System.out.printf("%b minutes is approximately %b years and %b days", min,years,days);
    }
}