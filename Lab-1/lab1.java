import java.util.*;

public class lab1 {
    public static void main(String[] args){
        int age;
        Scanner obj= new Scanner(System.in); 
        System.out.println("Enter your name: ");
        String name= obj.nextLine();
        System.out.println("**********Enter your Gender*********");
        System.out.println("1. M, 2. F");
        String gender= obj.nextLine();

        if(gender=="M"){
            System.out.println("Male");
        }
        else if(gender=="F"){
            System.out.println("Female");
        }
        else{
            System.out.println("Invalid Input!!!");
        }

        System.out.println("Enter your age: ");
        age= Integer.parseInt(obj.nextLine());

    
        System.out.println("1. North 2. South 3. East 4. West");
        System.out.println("Which state are you from: ");
        int s= obj.nextInt();
    
        System.out.println("Name: "+name);
        System.out.println("Gender: "+gender);
        System.out.println("Age: "+age);
        System.out.println("State: "+s);
    
    
        switch(s){
            case 1:
                System.out.println("North");
                break;
            case 2:
                System.out.println("South");
                break;
            case 3: 
                System.out.println("East");
                break;
            case 4:
                System.out.println("West");
    }
    }
    

}
