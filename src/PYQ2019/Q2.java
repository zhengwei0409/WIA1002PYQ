package PYQ2019;

public class Q2 {
    public static void main(String[] args) {
        SalesList[] list = {new SalesList("Aisa", "Ahmad", 450), new SalesList("Europe", "Hemish", 518), new SalesList("Europe", "Banny", 650), new SalesList("Greenland", "Ain", 200), new SalesList("Asia", "Ali", 390), new SalesList("Greenland", "Ben", 670), new SalesList("Asia", "Lee", 790)};
        System.out.println("Original Data: "); 
        for(SalesList i : list) {
            System.out.println(i);
        }

        SortSalesList.sortRegion(list);
        System.out.println("\nSorting Result on Region using SelectionSort: "); 
        for(SalesList i : list) {
            System.out.println(i);
        }

        SortSalesList.sortSalesAmount(list);
        System.out.println("\nSorting Result on Sales using InsertionSort: ");
        for(SalesList i : list) {
            System.out.println(i);
        }

        SortSalesList.sortSalesRepresentative(list);
        System.out.println("\nSorting Result on Sales using BubbleSort: ");
        for(SalesList i : list) {
            System.out.println(i);
        }
    }
}
