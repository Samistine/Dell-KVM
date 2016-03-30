package com.avocent.a.a.e;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class m implements ActionListener
{
    final s a;
    
    m(final s a) {
        this.a = a;
        super();
    }
    
    public void actionPerformed(final ActionEvent actionEvent) {
        s.a(this.a, actionEvent);
    }
}
