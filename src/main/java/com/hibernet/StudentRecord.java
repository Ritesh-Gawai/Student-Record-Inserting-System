package com.hibernet;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class StudentRecord {
    public int getMobile_no() {
        return mobile_no;
    }

    public void setMobile_no(int mobile_no) {
        this.mobile_no = mobile_no;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoll() {
        return roll;
    }

    @Override
    public String toString() {
        return "StudentRecord{" +
                "roll=" + roll +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", mobile_no=" + mobile_no +
                '}';
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    @Id
   private int roll;


   private String name;
   private String address;
   private int mobile_no;
}
