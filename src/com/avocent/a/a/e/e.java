package com.avocent.a.a.e;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class e implements ActionListener
{
    final q a;
    
    e(final q a) {
        this.a = a;
        super();
    }
    
    public void actionPerformed(final ActionEvent actionEvent) {
        q.b(this.a, actionEvent);
    }
}
