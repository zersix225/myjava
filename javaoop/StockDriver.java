package javaoop;
import java.util.*;
public class StockDriver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String symbol = sc.nextLine();
        String name = sc.nextLine();
        Stock s = new Stock(symbol, name);
        double previousPrice = sc.nextDouble();
        double currentPrice = sc.nextDouble();
        s.setPreviousClosingPrice(previousPrice);
        s.setCurrentPrice(currentPrice);
        System.out.println("Stock name: " + s.name);
        System.out.println("Stock symbol: " + s.symbol);
        System.out.printf("Price-change percentage: %.2f%%", s.getChangePercent());
        sc.close();
    }
}