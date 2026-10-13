package Interface;

interface Payment {

    void pay();

    void refund();
}


class UPI implements Payment {

    @Override
    public void pay() {
        System.out.println("Payment made using UPI");
    }

    @Override
    public void refund() {
        System.out.println("Refund processed through UPI");
    }
}


class CreditCard implements Payment {

    @Override
    public void pay() {
        System.out.println("Payment made using Credit Card");
    }

    @Override
    public void refund() {
        System.out.println("Refund processed through Credit Card");
    }
}


public class Main {

    public static void main(String[] args) {

        UPI upi = new UPI();

        upi.pay();
        upi.refund();

        CreditCard card = new CreditCard();

        card.pay();
        card.refund();
    }
}