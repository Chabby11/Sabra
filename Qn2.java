import java.util.*;
class Qn2{
    public static void main(String[]args){
        System.out.println("word game");
        System.out.println("Fill out the story");
        System.out.println("enter your name: ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.println("how old are you");
        int age = input.nextInt();
        System.out.println("what is city were you born");
        input.nextLine();
        String city = input.nextLine();
        System.out.println("which collage did you finish");
        String collage = input.nextLine();
        System.out.println("what is your proffession");
        String proffession = input.nextLine();
        System.out.println("what is your favorite animal");
        String animal = input.nextLine();
        System.out.println("what is your petname name");
        String petname = input.nextLine();
        System.out.println("there once was a person " + name + " who lived in city " + city + " at the age of " + age + " went to collage " + collage + " graduated and went to work as " + proffession + " adopted animal " + animal + " named " + petname + " they both lived happily ever after ");

    }
}   