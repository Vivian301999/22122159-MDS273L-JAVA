import java.util.*;


public class Lab3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        
        int[] arr = new int[size];


        
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i+1) + ": ");
            arr[i] = sc.nextInt();
        }
        
        System.out.println("The array you entered is: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        while (true) {
            System.out.println("Choose an option:");
            System.out.println("1. Find the mean");
            System.out.println("2. Find the median");
            System.out.println("3. Find the mode");
            System.out.println("4. Exit");
            int option = sc.nextInt();
            switch (option) {
                case 1:
                    double mean = getMean(arr);
                    System.out.println("Mean of the array is " + mean);
                    break;
                case 2:
                    double median = getMedian(arr);
                    System.out.println("Median of the array is " + median);
                    break;
                case 3:
                    int mode = getMode(arr);
                    System.out.println("Mode of the array is " + mode);
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Your Choice is invalid. Please select option again.");
            }
        }
    }

    public static double getMean(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        double mean = (double) sum / arr.length;
        return mean;
    }

    public static double getMedian(int[] arr) {
        Arrays.sort(arr);
        int mid = arr.length / 2;
        if (arr.length % 2 == 0) {
            double median = (double) (arr[mid - 1] + arr[mid]) / 2;
            return median;
        } else {
            double median = arr[mid];
            return median;
        }
    }

    public static int getMode(int[] arr) {
        Arrays.sort(arr);
        int mode = arr[0];
        int maxCount = 0;
        int currentCount = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                currentCount++;
            } else {
                if (currentCount > maxCount) {
                    maxCount = currentCount;
                    mode = arr[i - 1];
                }
                currentCount = 1;
            }
        }
        if (currentCount > maxCount) {
            maxCount = currentCount;
            mode = arr[arr.length - 1];
        }
        return mode;


    }

}