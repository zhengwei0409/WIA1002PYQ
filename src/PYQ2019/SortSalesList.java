package PYQ2019;



public class SortSalesList {

    public static void sortRegion(SalesList[] list) {
        for(int i = 0; i < list.length - 1; i++) {
            int min = i;
            for(int j = i + 1; j < list.length; j++) {
                if(list[min].region.compareTo(list[j].region) < 0) {
                    min = j;
                }
            }

            SalesList temp = list[i];
            list[i] = list[min];
            list[min] = temp;
        }
    }

    public static void sortSalesAmount(SalesList[] list) {
        for(int i = 1; i < list.length; i++) {
            SalesList temp = list[i];
            int j = i - 1;
            
            while (j >= 0 && list[j].salesAmount > temp.salesAmount) {
                list[j + 1] = list[j];
                j--;
            }
            list[j+1] = temp;
        }
    }

    public static void sortSalesRepresentative(SalesList[] list) {
        for(int i = 0; i < list.length - 1; i++) {
            for(int j = 0; j < list.length - i - 1; j++) {
                if(list[j].salesRepresentative.compareTo(list[j+1].salesRepresentative) > 0) {
                    SalesList temp = list[j+1];
                    list[j+1] = list[j];
                    list[j] = temp;
                }
            }
        }
    }

    
}
