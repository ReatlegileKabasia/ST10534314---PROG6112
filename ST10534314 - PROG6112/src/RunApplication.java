import java.util.Scanner;

public class RunApplication {

//main method  to run program

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Select Console Type");

        System.out.println("1) PS5");

        System.out.println("2) XBOX");

        System.out.println("3) SWITCH");


        int choice = scanner.nextInt();

        scanner.nextLine();


        String consoleType = "";

//switch case statement to make choices

        switch (choice) {
            case 1:
                consoleType = "PS5";
                break;



            case 2:
                consoleType = "XBOX";
                break;


            case 3:
                consoleType = "SWITCH";
                break;

            default:
                consoleType = "Unknown";
                break;

        }



//prompt user to enter store name

        System.out.print("Enter the store: ");

        String store = scanner.nextLine();


        System.out.print("Enter the total sales of " + consoleType + " consoles for " + store + ": ");


        int totalSales = scanner.nextInt();

        ConsoleSales salesReport = new ConsoleSales(consoleType, store, totalSales);


        salesReport.displayReport();

        scanner.close();

    }
}