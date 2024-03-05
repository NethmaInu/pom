package com.springbootaccadamy.batch8.pos1.DTO.request;



public class CustomerUpdateDTO {
    private int customerId;
    private String customerName;
    private String customerAdderss;

    public int getCustomerId() {
        return customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerAdderss() {
        return customerAdderss;
    }

    public double getCousomerSalary() {
        return cousomerSalary;
    }

    private double cousomerSalary;
    public CustomerUpdateDTO(){

    }

    public CustomerUpdateDTO(int customerId, String customerName, String customerAdderss, double cousomerSalary) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerAdderss = customerAdderss;
        this.cousomerSalary = cousomerSalary;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerAdderss(String customerAdderss) {
        this.customerAdderss = customerAdderss;
    }

    public void setCousomerSalary(double cousomerSalary) {
        this.cousomerSalary = cousomerSalary;
    }

    @Override
    public String toString() {
        return "CustomerUpdateDTO{" +
                "customerId=" + customerId +
                ", customerName='" + customerName + '\'' +
                ", customerAdderss='" + customerAdderss + '\'' +
                ", cousomerSalary=" + cousomerSalary +
                '}';
    }
}
