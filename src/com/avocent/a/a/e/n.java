package com.avocent.a.a.e;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class n implements ActionListener
{
    final s a;
    
    n(final s a) {
        this.a = a;
        super();
    }
    
    public void actionPerformed(final ActionEvent actionEvent) {
        s.b(this.a, actionEvent);
    }
}
