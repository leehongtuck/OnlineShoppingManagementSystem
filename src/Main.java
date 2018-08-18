import Model.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //Test Login
        /*
        Login l = new Login("Test", "acd");
        l.verify(); */

        //Test purchase
        /*
        Customer c = new Customer("C001", "test", "C001");
        Product p = new FragileProduct("P001", "Rice cooker", 5.0);
        OrderItem o = new OrderItem(p, 3);
        OrderItem o2 = new OrderItem(p, 5);
        ArrayList<OrderItem> orderItems = new ArrayList<>();
        orderItems.add(o);
        orderItems.add(o2);
        Order order = new Order( c, orderItems);
        order.saveOrder();
        System.out.println(order.getOrderId()); */

        //Test add user
        Customer c = new Customer("tuus", "Neo Tock",
                "980818", "Puchong", "012345");
        UserProfileManager u = new UserProfileManager();
        char[] pw = {'a', 'b', 'c', 'd'};
        u.addUser(c, pw);
    }

}