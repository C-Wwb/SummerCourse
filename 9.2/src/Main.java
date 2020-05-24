public class Main
{
    public static void main(String[] args)
    {
        Stock stock = new Stock();
        stock.setSymbol("3547785");
        stock.setName("wwb");
        stock.setPreviousClosingPrice(1.97);
        stock.setCurrentPrice(2.02);
        System.out.println("Shares of " + stock.getName() + " " + stock.getSymbol()
                + ", as they are known, rose " + String.format("%.2f", stock.getChangePercent())
                + " points from " + stock.getPreviousClosingPrice()
                + " to " + stock.getCurrentPrice());
    }
}
class Stock
{
    String symbol;//股票代码
    String name;//股票名字
    double previousClosingPrice;//前一日股票值
    double currentPrice;//当前股票值
    Stock()
    {

    }
    double getChangePercent()//返回变化
    {
        return this.currentPrice - this.previousClosingPrice;
    }
    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPreviousClosingPrice() {
        return previousClosingPrice;
    }

    public void setPreviousClosingPrice(double previousClosingPrice) {
        this.previousClosingPrice = previousClosingPrice;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }
}
