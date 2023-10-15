package com.sysc.test.UI;

import javax.swing.*;
import java.awt.event.ActionListener;


public class AdrButton extends JButton {
    AdrListener listener;
    @Override
    public void addActionListener(ActionListener l) {
        super.addActionListener(l);
    }

    public void init(){
        this.addActionListener(listener);
    }

    public void setListener(AdrListener l){
        listener = l;
    }
}
