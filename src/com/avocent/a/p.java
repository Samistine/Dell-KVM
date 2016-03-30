package com.avocent.a;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

class p extends AbstractAction
{
    final f a;
    
    p(final f a, final String s) {
        this.a = a;
        super(s);
    }
    
    public void actionPerformed(final ActionEvent actionEvent) {
        this.a.l();
    }
}
