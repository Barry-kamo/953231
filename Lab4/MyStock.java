public class MyStock {
    public static void main(String[] args){
        Stock stock1=new Stock("ORCL","Oracle Corporation");
        stock1.setpriceday(34.5);
        stock1.setpricetime(34.35);
        System.out.println("the stock symbol is "+stock1.getsymbol());
        System.out.println("the name is : "+stock1.getname());
        System.out.println("the previous closing price is: "+stock1.getpriceday());
        System.out.println("the current price is : "+stock1.getprivetime());
        stock1.getChangePercent(stock1.getpriceday(),stock1.getprivetime());
    }
}
