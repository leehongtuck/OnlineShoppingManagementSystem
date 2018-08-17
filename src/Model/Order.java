package Model;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Order {
    public String orderId;
    public Customer customer;
    ArrayList<OrderItem> orderItems;
    private static String FILENAME = "order.txt";

    public Order(Customer customer, ArrayList<OrderItem> o) {
        this.orderId = Utility.generateId(FILENAME, "O");
        this.customer = customer;
        orderItems = o;
    }

    public Order(String orderId, Customer customer, ArrayList<OrderItem> o) {
        this.orderId = orderId;
        this.customer = customer;
        orderItems = o;
    }

    public void saveOrder() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILENAME,true))) {
            String items = "";
            for (int i = 0; i < orderItems.size(); i++) {
                //add a comma if the records are not ending, no comma if is the last one
                if(i != orderItems.size()-1){
                    items += "(" + orderItems.get(i).getProduct().getProductId() + ","
                            + orderItems.get(i).getQuantity() + "),";
                }else {
                    items += "(" + orderItems.get(i).getProduct().getProductId() + ","
                            + orderItems.get(i).getQuantity() + ")";
                }
            }
            String toWrite = orderId + "||" + customer.getCustomerId() +
                    "||" + items + System.lineSeparator();
            bw.write(toWrite);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getOrderId() {
        return orderId;
    }

}
