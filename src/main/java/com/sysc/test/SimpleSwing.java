package com.sysc.test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleSwing {

    public static void main(String[] args) {
        AddressBookController controller = new AddressBookController();
        AddressBook book = new AddressBook();
        controller.setAddressBook(book);

        JFrame frame = new JFrame("AddressBook");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new BorderLayout());

        JPanel panel = new JPanel();
        JPanel outputPanel = new JPanel();
        JLabel nameLabel = new JLabel("Enter Contact Name");
        JLabel numberLabel = new JLabel("Enter Contact Number");
        JTextField name = new JTextField(10);
        JTextField number = new JTextField(10);
        JButton addBuddy = new JButton("Add Buddy");
        JTextArea outputText = new JTextArea(10, 50);
        outputText.setEditable(false);
        addBuddy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.newBuddy(new BuddyInfo(name.getText(), number.getText()));
                outputText.append("new Contact added");
            }
        });
        panel.add(nameLabel);
        panel.add(name);
        panel.add(numberLabel);
        panel.add(number);
        outputPanel.add(outputText);
        frame.getContentPane().add(BorderLayout.NORTH, panel);
        frame.getContentPane().add(BorderLayout.CENTER, addBuddy);
        frame.getContentPane().add(BorderLayout.SOUTH, outputPanel);
        frame.pack();
        frame.setVisible(true);
    }
}
