
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] arguments) {


        System.out.println("Welcome to my shop, traveller");
        System.out.println("please type your age:");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        System.out.println("Your age is " + age + " years old");

        ArrayList<dk.easv.Drink> drinks = new ArrayList<>();
        drinks.add(new dk.easv.Drink("Beer", 25.0,4.7));
        drinks.add(new dk.easv.Drink("Orange Juice", 66,0));
        drinks.add(new dk.easv.Drink("Vodka", 143,41));


        System.out.println("#####***** Ye Olde Liquor Shop *****#####");
        for (int i = 0; i < drinks.size(); i++) {
            dk.easv.Drink current = drinks.get(i);
            if (age<16 && current.getAlcPercentage()==0){
                System.out.println(current);

            }
            if (age<18 && current.getAlcPercentage()>0 && current.getAlcPercentage()<16.5){
                System.out.println(current);
            }
            if (age>=18){
                System.out.println(current);
            }

        }
        /*
        if (age>15 && alc>16.5)
            System.out.println(beer);
        System.out.println(orangeJuice);*/
    }
}