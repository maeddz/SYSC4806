package com.sysc.test;

public class AddressBookController {
    AddressBook addressBook;

    public void setAddressBook(AddressBook a){
        addressBook = a;
    }
    public void newBuddy(BuddyInfo b){
        addressBook.addBuddy(b);
    }
}
