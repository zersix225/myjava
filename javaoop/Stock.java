package javaoop;
class Stock {
    // Write your code here
    String symbol;
    String name;
    double previousClosingPrice;
    double currentPrice;
   
    
    // Constructor - DO NOT CHANGE HERE
    Stock(String newSymbol, String newName){
        symbol = newSymbol;
        name = newName;
    }
    
    // Write your code here
    //get name
    public String name(){
        return name;
    }

    //get symbol
    public String symbol(){
        return symbol;
    }

    //setPrevious
    public void setPreviousClosingPrice(double price){
        previousClosingPrice = price;
    }

    //setCurrent
    public void setCurrentPrice(double price){
        currentPrice = price;
    }

    public double getChangePercent(){
        return ((currentPrice - previousClosingPrice) / previousClosingPrice) * 100;
    }

}
