package Portfolio;

import java.util.Scanner;

public class FriendPortfolio {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //friend's personal information
        
        System.out.print("Enter your friend's name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your friend's age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Enter your friend's profession: ");
        String profession = scanner.nextLine();

        System.out.print("Enter your friend's email: ");
        String email = scanner.nextLine();

        System.out.print("Enter your friend's phone number: ");
        String phone = scanner.nextLine();

        //friend's skills
        
        System.out.print("Enter the number of skills your friend has: ");
        int skillCount = scanner.nextInt();
        scanner.nextLine(); 

        String[] skills = new String[skillCount];
        for (int i = 0; i < skillCount; i++) {
            System.out.print("Enter skill " + (i + 1) + ": ");
            skills[i] = scanner.nextLine();
        }

        //friend's hobbies
        System.out.print("Enter the number of hobbies your friend has: ");
        int hobbyCount = scanner.nextInt();
        scanner.nextLine(); 

        String[] hobbies = new String[hobbyCount];
        for (int i = 0; i < hobbyCount; i++) {
            System.out.print("Enter hobby " + (i + 1) + ": ");
            hobbies[i] = scanner.nextLine();
        }

        // Displaying the collected information
        
        System.out.println("\nFriend's Portfolio");
        System.out.println("------------------");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Profession: " + profession);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);

        System.out.println("\nSkills:");
        for (String skill : skills) {
            System.out.println("- " + skill);
        }

        System.out.println("\nHobbies:");
        for (String hobby : hobbies) {
            System.out.println("- " + hobby);
        }

        
        scanner.close();
    }
}
	
