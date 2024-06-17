package PYQ2019;

public class SalesList {
    String region;
    String salesRepresentative;
    int salesAmount;

    public SalesList() {
        region = null;
        salesRepresentative = null;
        salesAmount = 0;
    }

    public SalesList(String region, String salesRepresentative, int salesAmount) {
        this.region = region;
        this.salesRepresentative = salesRepresentative;
        this.salesAmount = salesAmount;
    }

    @Override
    public String toString() {
        return String.format("%-10s %d %s", region, salesAmount, salesRepresentative);
    }
}
