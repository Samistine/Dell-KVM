package com.avocent.a.a.e;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class g implements ActionListener
{
    final r a;
    
    g(final r a) {
        this.a = a;
        super();
    }
    
    public void actionPerformed(final ActionEvent actionEvent) {
        r.a(this.a, actionEvent);
    }
}
