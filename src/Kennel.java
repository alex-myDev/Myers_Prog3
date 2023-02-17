import java.util.Scanner;

/*---------------------------------------------------------------------
    Title: Encapsulating Dogs
    Author: Alex Myers
    Date: 13 Feb 2023
    Course & Section: CSC 112-303
    Description: Allow user input to decide whether to see a dog's breed,
    name, age, age in human years, or all stats. Also allow the user to
    modify the dog's breed, name, and age. Utilizes a looping menu with a case
    select structure.
---------------------------------------------------------------------*/

public class Kennel
{

    /*---------------------------------------------------------------------
        Title: main
        Author: Alex Myers
        Description: Run the steps necessary to allow user choice and visual output.
    ---------------------------------------------------------------------*/
    public static void main(String[] args)
    {

        //Initialize Variables
        String garbage;
        int menuSelectionValue;
        String breed;
        String name;
        int age;

        //Instantiate an object of Scanner class
        Scanner input = new Scanner(System.in);

        //Instantiate an object of Dog class with hardcoded values for dogBreed, dogName, and dogAge
        Dog myDog = new Dog("Poodle", "Sir Maxwell", 13);

        do
        {
            //Output choices for user
            System.out.println("\nDog information menu:");
            System.out.println("\t1. Show the Dog's Breed");
            System.out.println("\t2. Show the Dog's Name");
            System.out.println("\t3. Show DOG'S Age");
            System.out.println("\t4. Update the Dog's Breed");
            System.out.println("\t5. Update the Dog's Name");
            System.out.println("\t6. Update the Dog's Age");
            System.out.println("\t7. Show all information about the Dog");
            System.out.println("\t8. Show the Dog's Age in Human Years");
            System.out.println("\t9. Exit\n");

            //Prompt input from user
            System.out.print("Enter a menu option number to continue: ");
            menuSelectionValue = input.nextInt();
            garbage = input.nextLine();

            //Logic for menu options
            switch(menuSelectionValue)
            {
                case 1:
                    System.out.println("Breed: " + myDog.getBreed());
                    break;
                case 2:
                    System.out.println("Name: " + myDog.getName());
                    break;
                case 3:
                    System.out.println("Age: " + myDog.getAge());
                    break;
                case 4:
                    System.out.print("Enter a new breed for the dog: ");
                    breed = input.nextLine();
                    myDog.setBreed(breed);
                    break;
                case 5:
                    System.out.print("Enter a new name for the dog: ");
                    name = input.nextLine();
                    myDog.setName(name);
                    break;
               case 6:
                   System.out.print("Enter a new age for the dog: ");
                   age = input.nextInt();
                   myDog.setAge(age);
                   break;
               case 7:
                   System.out.println(myDog);
                   break;
                case 8:
                    System.out.println("Person years age: " + myDog.personYears());
                    break;
                case 9:
                    System.out.println("Exiting the program. . .");
                    break;
                default:
                    System.out.println("Invalid input. Please enter a different number.");
            } //End case select
        } while(menuSelectionValue != 9); //end do, exits once user inputs 9
    } //End main
} //End class
