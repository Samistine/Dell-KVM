// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.a.a.e;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class d implements ActionListener {

    final q a;

    d(final q a) {
        this.a = a;
    }

    @Override
    public void actionPerformed(final ActionEvent actionEvent) {
        q.a(this.a, actionEvent);
    }
}
