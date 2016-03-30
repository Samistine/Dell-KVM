package com.avocent.a;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

class l extends AbstractAction
{
    final f a;
    
    l(final f a, final String s) {
        this.a = a;
        super(s);
    }
    
    public void actionPerformed(final ActionEvent actionEvent) {
        this.a.h();
    }
}
