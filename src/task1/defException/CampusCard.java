package task1.defException;

public class CampusCard { // 校园卡
    private double balance; // 余额
    private String id; // 校园卡号
    public CampusCard(String id) {
        this.id = id;
        this.balance = 0;
    }
    public double getBalance() {
        return balance;
    }
    public String getId() {
        return id;
    }
    public boolean deposit(double money) {  //往卡里充钱
        this.balance += money;
        return true;
    }
    public void consume(double money) throws BalanceNotEnoughException { // 消费
        if(this.balance >= money) {
            this.balance -= money;
        }
        else {  //余额不足时抛出异常
            throw new BalanceNotEnoughException(money - balance);
        }
    }

}
