package com.springbootaccadamy.batch8.pos1.DTO;

import com.springbootaccadamy.batch8.pos1.entity.Customer;
import org.hibernate.annotations.Type;

import javax.persistence.Column;
import javax.persistence.Id;
import java.util.ArrayList;

public class CustomerDTO {

    private int customerId;
    private String customerName;
    private String customerAdderss;
    private ArrayList customerContactNo;

    private String Nic;
    private boolean aciveState;
    private double cousomerSalary;

    public CustomerDTO(){

    }


    public CustomerDTO(int customerId, String customerName, String customerAdderss, ArrayList customerContactNo, String nic, boolean aciveState, double cousomerSalary) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerAdderss = customerAdderss;
        this.customerContactNo = customerContactNo;
        Nic = nic;
        this.aciveState = aciveState;
        this.cousomerSalary = cousomerSalary;
    }

    public double getCousomerSalary() {
        return cousomerSalary;
    }

    public void setCousomerSalary(double cousomerSalary) {
        this.cousomerSalary = cousomerSalary;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerAdderss() {
        return customerAdderss;
    }

    public void setCustomerAdderss(String customerAdderss) {
        this.customerAdderss = customerAdderss;
    }

    public ArrayList getCustomerContactNo() {
        return customerContactNo;
    }

    public void setCustomerContactNo(ArrayList customerContactNo) {
        this.customerContactNo = customerContactNo;
    }

    public String getNic() {
        return Nic;
    }

    public void setNic(String nic) {
        Nic = nic;
    }

    public boolean isAciveState() {
        return aciveState;
    }

    public void setAciveState(boolean aciveState) {
        this.aciveState = aciveState;
    }
}
