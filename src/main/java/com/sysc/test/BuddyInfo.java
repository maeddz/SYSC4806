package com.sysc.test;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;


@Entity(name="com.sysc.test.BuddyInfo")
public class BuddyInfo  {

    @Id
    @GeneratedValue
    private Long Id;
    private String name, number;

    public BuddyInfo(String name, String number){
        this.name = name;
        this.number = number;
    }

    public BuddyInfo(){}

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

}
