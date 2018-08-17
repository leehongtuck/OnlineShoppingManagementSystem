package Model;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Customer extends User {
    private String customerId, name, nric, address, phone;
    private static final String FILENAME = "customer.txt";

    public Customer(String userId, String username, String customerId){
        super(userId, username);
        this.customerId = customerId;
        String row, txtId, customerName, customerNric, customerAddress, customerPhone;
        try (BufferedReader br = new BufferedReader(new FileReader(FILENAME))) {
            while ((row = br.readLine()) != null) {
                String[] str = row.split("//|//|");
                txtId = str[0];
                customerName = str[1];
                customerNric = str[2];
                customerAddress = str[3];
                customerPhone = str[4];

                if (txtId.equals(customerId)) {
                    name = customerName;
                    nric = customerNric;
                    address = customerAddress;
                    phone = customerPhone;
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }

    public String getNric() {
        return nric;
    }

    public String getPhone() {
        return phone;
    }
}

