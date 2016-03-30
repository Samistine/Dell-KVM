package com.avocent.a;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

class n extends AbstractAction
{
    final f a;
    
    n(final f a, final String s) {
        this.a = a;
        super(s);
    }
    
    public void actionPerformed(final ActionEvent actionEvent) {
        this.a.j();
    }
}
