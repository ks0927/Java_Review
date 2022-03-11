package java_chapter.chapter8.inheritance;

public class VIPCustomer extends Customer{
    private int agentID;
    private double saleRatio;

    public VIPCustomer(int customerID, String customerName, int agentID) {
        //super(); 상위클래스를 가르키는 참조자,default 생성자 호출 default가 없으면..? 에러남
        // 그러면 super(int customerID, String customerName) 하면 괜찮긴함
        customerGrade = "VIP";
        bonusRatio = 0.05;
        saleRatio = 0.1;
        this.agentID = agentID;
    }
    @Override //에너테이션 .컴파일러에게 재정의 알려주는 역할
    public int calcPrice(int price) {
        return (int) (price -price*this.saleRatio);
    }


    public int getAgentID() {
        return agentID;
    }

}
