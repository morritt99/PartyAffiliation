import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class PartyAffiliation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Party affiliation menu\n1-Democrat D \n2-Republican R \n3-Independent I\nYour choice :");

        String choice = scanner.nextLine();

        if (choice.equals("D")) {

            System.out.println("You get a Democratic Donkey.");
        } else if (choice.equals("R")) {

            System.out.println("You get a Republican Elephant.");
        } else if (choice.equals("I")) {

            System.out.println("You get a Independent Person.");
        }else {

            System.out.println("You get other.");

        }

    }
    }