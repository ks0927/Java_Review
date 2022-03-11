package java_chapter.chapter8.witharraylist;

public class GoldCustomer extends Customer{

    double saleRatio;
    public GoldCustomer(int customerID, String customerName){
        this.customerName=customerName;
        this.customerID=customerID;
        customerGrade ="Gold";
        bonusRatio =0.02;
        saleRatio =0.1;

    }
    @Override
    public int calcPrice(int price){
        bonusPoint += price * bonusRatio;
        return price - (int) (price*saleRatio);

    }


}
