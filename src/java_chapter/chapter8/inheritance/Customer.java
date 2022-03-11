package java_chapter.chapter8.inheritance;

public class Customer {
    protected int customerID;
    protected String customerName;
    protected String customerGrade;  //상속관계에서만 public이고 나머지에서는 private로 보이게하는거=protected
    protected int bonusPoint;
    protected double bonusRatio;

    public Customer() {
        //super(); object class에서 상속받음
        this.customerGrade = "SILVER";
        this.bonusRatio = 0.01D;
    }

    public Customer(int customerID, String customerName) {
        this.customerID = customerID;
        this.customerName = customerName;
        this.customerGrade = "SILVER";
        this.bonusRatio = 0.01D;
    }

    public int calcPrice(int price) {
        this.bonusPoint = (int)(this.bonusPoint + price * this.bonusRatio);
        return price;
    }

    public String showCustomerInfo() {
        return String.valueOf(this.customerName) + " " + this.customerGrade + "" + this.bonusPoint + "";
    }

    public int getCustomerID() {
        return this.customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerGrade() {
        return this.customerGrade;
    }

    public void setCustomerGrade(String customerGrade) {
        this.customerGrade = customerGrade;
    }
}
