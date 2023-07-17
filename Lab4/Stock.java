public class Stock {
    private String symbol;
    private String name;
    private double priceday;
    private double pricetime;
    public Stock(String sy,String na){
        symbol=sy;
        name=na;
        priceday=0;
        pricetime=0;
    }
    public String getsymbol(){return symbol;}
    public String getname(){return name;}
    public double getpriceday(){return priceday;}
    public double getprivetime(){return pricetime;}
    public void setpriceday(double spd){
        priceday=spd;
    }
    public void setpricetime(double spt){
        pricetime=spt;
    }
    public void getChangePercent(double priceday,double pricetime){
        double ChangePercent=(pricetime-priceday)/priceday;
        System.out.println("the price-change percentage is "+ChangePercent);
    }
}
