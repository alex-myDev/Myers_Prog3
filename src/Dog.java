/*---------------------------------------------------------------------
    Title: Encapsulating Dogs
    Author: Alex Myers
    Date: 13 Feb 2023
    Course & Section: CSC 112-303
    Description: Contains the Accessors and Mutators, protected variables
    for the dog object, and methods to calculate in person years as well as
    display all dog information excluding the human years.
---------------------------------------------------------------------*/

public class Dog
{
    // Initialize Variables
    private String breed;
    private String name;
    private int age;
    private int personYears;

    public Dog(String dogBreed, String dogName, int dogAge)
    {
        breed = dogBreed;
        name = dogName;
        age = dogAge;
    }

    //-------------Mutator Methods-------------//
    public void setBreed(String dogBreed)
    {
        breed = dogBreed;
    }

    public void setName(String dogName)
    {
        name = dogName;
    }

    public void setAge(int dogAge)
    {
        age = dogAge;
    }

    //-------------Accessor Methods-------------//
    public String getBreed()
    {
        return breed;
    }

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    // Calculates age of dog in Person Years
    public int personYears()
    {
        personYears = 7 * age;
        return personYears;
    }

    // Displays all basic information about the dog (excludes human years)
    public String toString()
    {
        String description;

        description = "Breed:\t\t\t" + breed + "\nName:\t\t\t" + name +
                "\nAge:\t\t\t" + age + "\nHuman Years:\t" + personYears();
        return description;
    }

}
