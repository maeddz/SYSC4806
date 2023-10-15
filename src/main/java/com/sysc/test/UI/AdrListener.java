package com.sysc.test.UI;

import com.sysc.test.AddressBookController;
import com.sysc.test.BuddyInfo;
import org.springframework.beans.factory.ObjectFactory;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdrListener  implements ActionListener {
    JTextArea outputText;
    AddressBookController controller;
    JTextField nameField;
    JTextField numberField;
    ObjectFactory buddyFactory;

    public void setOutputText(JTextArea a){
        outputText = a;
    }
    public void setController(AddressBookController c){
        controller = c;
    }
    public void setNameField(JTextField n){
        nameField = n;
    }
    public void setNumberField(JTextField a){
        numberField = a;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        BuddyInfo buddy = (BuddyInfo) this.buddyFactory.getObject();
        buddy.setNumber(numberField.getText());
        buddy.setName(nameField.getText());
        controller.newBuddy(buddy);
        outputText.append("Contact: " + buddy.getName() + " number: " + buddy.getNumber() + " added");
    }

    public void setBuddyFactory(ObjectFactory<BuddyInfo> b) {
        buddyFactory = b;
    }
}
