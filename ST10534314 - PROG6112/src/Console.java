public abstract class Console implements Iconsoles {
    private  String ConsoleType;
    private  String Store;
    private  int TotalSales;

    public Console(String ConsoleType, String Store, int TotalSales) {
        this.ConsoleType = ConsoleType;
        this.Store = Store;
        this.TotalSales = TotalSales;
    }
     @Override
    public String getConsoleType() {
        return ConsoleType;

     }

     @Override
     public String getStore() {
        return Store;
     }

     @Override
     public int getTotalSales() {
        return TotalSales;
     }

     public abstract void displayReport();
}
