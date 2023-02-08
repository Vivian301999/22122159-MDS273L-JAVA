import java.util.ArrayList;
import java.util.Scanner;

public class Lab2 {
  static ArrayList<String> names = new ArrayList<>();

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int option;

    do {
      System.out.println("Menu:");
      System.out.println("1. Enter a name");
      System.out.println("2. Search for a name");
      System.out.println("3. Remove a name");
      System.out.println("4. Show all names");
      System.out.println("5. Exit");
      System.out.print("Enter an option: ");

      option = scan.nextInt();

      switch (option) {
        case 1:
          enterName();
          break;
        case 2:
          searchName();
          break;
        case 3:
          removeName();
          break;
        case 4:
          showAllNames();
          break;
        case 5:
          break;
        default:
          System.out.println("Invalid option. Try again.");
      }
    } while (option != 5);

    scan.close();
  }

  static void enterName() {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter a name: ");
    String name = scan.nextLine();
    names.add(name);
    System.out.println("Name added.");
  }

  static void searchName() {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter a name to search for: ");
    String name = scan.nextLine();
    if (names.contains(name)) {
      System.out.println("Name found.");
    } else {
      System.out.println("Name not found.");
    }
  }

  static void removeName() {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter a name to remove: ");
    String name = scan.nextLine();
    if (names.remove(name)) {
      System.out.println("Name removed.");
    } else {
      System.out.println("Name not found.");
    }
  }

  static void showAllNames() {
    System.out.println("All names:");
    for (String name:names) {
      System.out.println(names);
}
}
}