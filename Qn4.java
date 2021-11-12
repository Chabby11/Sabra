import java.util.Scanner;
class Qn4{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("please enter number of gallon");
        int gallon = input.nextInt();
        System.out.println("please enter number of miles");
        int miles = input.nextInt();
        int distance =(gallon * miles);
        float cost = (250/gallon);
        System.out.println("the car can travel with the gas in miles : " +distance);
        System.out.println("the cost of travel with miles per car :" +cost);        
    }
}