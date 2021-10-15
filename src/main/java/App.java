//Pierwszy commit
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        String hotelName = "Overlook";
        int systemVersion = 1;
        boolean isDeveloperVersion = true;
        System.out.print("Witam w systemie rezerwacji dla hotelu");
        System.out.println(hotelName);
        System.out.println("Aktualna wersja systemu: ");
        System.out.println(systemVersion);
        System.out.println("Wersja developerska: ");
        System.out.println(isDeveloperVersion);
        System.out.println("\n=========================\n");
        Scanner input = new Scanner(System.in);
        System.out.println("1. Add new guest.");
        System.out.println("2. Add new room.");
        System.out.println("3. Search guest.");
        System.out.println("Choose option: ");
        int option = 0;
        try {
            option = input.nextInt();
        } catch (Exception e) {
            System.out.println("You have to insert a correct number");
            e.printStackTrace();
        }
        if (option == 1) {
            String firstName;
            String lastName;
            int age;
            System.out.println("Insert first name:");
            firstName = input.next();
            System.out.println("Insert last name:");
            lastName = input.next();
            System.out.println("Insert age:");
            try {
                age = input.nextInt();
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("You have to insert a number");
                age = 0;
            }
            Guest createdGuest = new Guest(firstName, lastName, age);
            String info = String.format("Dodano gościa: %s %s (%d)", createdGuest.firstName, createdGuest.lastName, createdGuest.age);
            System.out.println(info);
        } else if (option == 2) {
            int number;
            int beds;
            try {
                System.out.println("Insert number of Room");
                number = input.nextInt();
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("You have to insert a number");
                number =0;
            }
            try {
                System.out.println("Insert number of beds");
                beds = input.nextInt();
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("You have to insert a number");
                beds = 0;
            }
            Room createdRoom = new Room(number, beds);
            String info = String.format("Added room: %d beds: %d", createdRoom.number, createdRoom.beds);
            System.out.println(info);

        } else if (option == 3) {
            System.out.println("Wybrano opcję 3.");
        } else {
            System.out.println("Wybrano niepoprawną akcję.");
        }
    }
}