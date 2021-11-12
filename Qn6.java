import java.util.*;
class Qn6{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("enter performance level : ");
        double performance = input.nextDouble();
        System.out.println("enter base salary : ");
        double base = input.nextDouble();
        double bonus = 0.03 * base;
        double salary = bonus + base;
        if(performance >=90){
            System.out.println("salary is "+salary);
        }
        else{
            System.out.println("salary is "+base);
        }
    }
}