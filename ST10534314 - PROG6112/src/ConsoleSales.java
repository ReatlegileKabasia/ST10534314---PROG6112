public class ConsoleSales extends Console {

    // Constructor matching superclass requirements
    public ConsoleSales(String consoleType, String store, int totalSales) {
        super(consoleType, store, totalSales);
    }

    // Overridden method to print the report formatted as specified
    @Override
    public void displayReport() {
        System.out.println("Console sales report ");

        System.out.println("console type: " + getConsoleType());
        System.out.println("store: " + getStore());
        System.out.println("total sales: " + getTotalSales());
    }

    {
        displayReport();
    }
}