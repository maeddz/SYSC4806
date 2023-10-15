package com.sysc.test.UI;


import javax.swing.*;
import java.awt.*;
import java.util.Iterator;
import java.util.List;

public class AdrPanel extends JPanel {
    private List panelComponents;

    public void setPanelComponents(List panelComponents) {
        this.panelComponents = panelComponents;
    }

    public void init(){
        for (Iterator iter = panelComponents.iterator();
             iter.hasNext();){
            Component component = (Component) iter.next();
            add(component);
        }
    }
}
