package com.springbootaccadamy.batch8.pos1.entity;

import com.vladmihalcea.hibernate.type.json.JsonType;
import net.bytebuddy.dynamic.loading.InjectionClassLoader;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;

import javax.naming.Name;
import javax.persistence.*;
import java.util.ArrayList;
@Entity
@Table
@TypeDefs({
        @TypeDef(name = "json",typeClass = JsonType.class)})
public class Customer {

        @Id
        @Column(name = "customer_id" ,length = 45)
        @GeneratedValue(strategy = GenerationType.AUTO)
        private int customerId;
        @Column(name = "customer_name" , nullable = false,length =255 )
        private String customerName;

        @Column(name = "customer_address" ,length = 100)
        private String customerAdderss;
        @Type(type = "json")
        @Column(name = "contact_number" , columnDefinition = "json")
        private ArrayList customerContactNo;
        @Column(name = "Nic" )
        private String Nic;
        @Column(name = "active_State", columnDefinition = "TINYINT default 1")
        private boolean aciveState;
        @Column(name = "Customer_Salary" ,length = 200)
        private double cousomerSalary;
public Customer(){

}

        public Customer(int customerId, String customerName, String customerAdderss, ArrayList customerContactNo, String nic, boolean aciveState, double cousomerSalary) {
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
