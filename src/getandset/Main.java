package getandset;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Computer userChoose = new Computer();
        System.out.println("type in the name of your computer: ");
        String nameInput = scan.nextLine();
        userChoose.setName(nameInput);
        System.out.println("type in the year of the purchase.");
        int yearInput = scan.nextInt();
        userChoose.setYear(yearInput);
        System.out.println("And how much did it cost?");
        double costInput = scan.nextDouble();
        userChoose.setCost(costInput);
        System.out.println("your computer's name is "+userChoose.name+", made in "+userChoose.year+ ". And it cost "+ userChoose.cost);
        scan.close();
    }
}
//    public static class DreamComputer extends Computer{
//        getandset.DreamComputer userChoose = new getandset.DreamComputer();
//
//    }
//
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        System.out.println("build your dream computer by typing in specs, first the name of the computer");
//        String nameInput = scan.nextLine();
//        Thread userChoose;
//        userChoose.setName(nameInput);
//
//        System.out.println("Your dream computer's name is "+ );
//    }

