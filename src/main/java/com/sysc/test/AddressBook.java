package com.sysc.test;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class AddressBook{
    @Id
    @GeneratedValue
    private long Id;

    @OneToMany(cascade=CascadeType.ALL)
    private List<BuddyInfo> buddyList;

    public AddressBook() {
        this.buddyList =  new ArrayList<BuddyInfo>();
    }

    @Transient
    public void addBuddy(BuddyInfo buddy) {
        this.buddyList.add(buddy);
    }
    @Transient
    public void removeBuddy(BuddyInfo buddy) {
        this.buddyList.remove(buddy);
    }

    public List<BuddyInfo> getBuddyList() {
        return buddyList;
    }

    public void setBuddyList(List<BuddyInfo> buddyList) {
        this.buddyList = buddyList;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }
}