package task1.defException;

public class MainTest {
    public static void main(String args) {
        CampusCard card = new CampusCard("2012020063");
        try {
            System.out.println("充值500元");
            card.deposit(500);
            System.out.println("消费100元");
            card.consume(100);
            System.out.printf("消费500元");
            card.consume(500);
        }catch (BalanceNotEnoughException e) {
            System.out.println("余额不足，还需" + e.getGap() + "元");
        } finally {
            System.out.println("账户：" + card.getId());
            System.out.println("余额：" + card.getBalance());
        }
    }
}
