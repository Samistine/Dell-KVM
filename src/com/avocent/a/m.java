package com.avocent.a;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

class m extends AbstractAction
{
    final f a;
    
    m(final f a, final String s) {
        this.a = a;
        super(s);
    }
    
    public void actionPerformed(final ActionEvent actionEvent) {
        this.a.k();
    }
}
