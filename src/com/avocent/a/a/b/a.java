package com.avocent.a.a.b;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class a implements ActionListener
{
    final b a;
    
    a(final b a) {
        this.a = a;
        super();
    }
    
    public void actionPerformed(final ActionEvent actionEvent) {
        this.a.setVisible(false);
    }
}
