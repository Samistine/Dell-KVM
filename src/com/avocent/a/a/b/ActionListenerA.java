// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.a.a.b;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//Originally named a
class ActionListenerA implements ActionListener {

    private final JDialog_b a;

    public ActionListenerA(JDialog_b a) {
        this.a = a;
    }

    @Override
    public void actionPerformed(final ActionEvent actionEvent) {
        this.a.setVisible(false);
    }
}
