public class GamingConsoleSales {

    public static void main(String[] args) {


        String[] cities = {"Cape Town", "Port Elizabeth", "Pretoria"};

        String[] consoles = {"PS5", "XBOX", "SWITCH"};


        int[][] salesData = {
                {1000, 2000, 3000}, // Cape Town
                {2000, 3000, 4000}, // Port Elizabeth
                {1500, 1100, 1200}  // Pretoria
        };


        int[] cityTotalsSales = new int[cities.length];



        System.out.println("gaming console sales report ");



        System.out.printf("%-18s", "");
        for (String console : consoles) {
            System.out.printf("%-12s", console);
        }
        System.out.println();

        // 3. Printing Rows, Columns, and Calculating City Totals
        for (int row = 0; row < cities.length; row++) {
            System.out.printf("%-18s", cities[row]);
            int rowTotal = 0;
            for (int col = 0; col < salesData[row].length; col++) {
                System.out.printf("%-12d", salesData[row][col]);
                rowTotal += salesData[row][col];
            }
            cityTotalsSales[row] = rowTotal;
            System.out.println();
        }


        System.out.println("sales per city");


        // Variables to determine the city with highest sales
        int maxSales = -1;
        String topCity = "";


        for (int i = 0; i < cities.length; i++) {
            System.out.printf("%-18s%d%n", cities[i], cityTotalsSales[i]);

            if (cityTotalsSales[i] > maxSales) {

                maxSales = cityTotalsSales[i];
                topCity = cities[i];
            }
        }


        System.out.println("CITY WITH THE MOST SALES: " + topCity);

    }
}