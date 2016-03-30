// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.a;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

class o extends AbstractAction {

    final f a;

    o(final f a, final String s) {
        super(s);

        this.a = a;
    }

    @Override
    public void actionPerformed(final ActionEvent actionEvent) {
        this.a.i();
    }
}
