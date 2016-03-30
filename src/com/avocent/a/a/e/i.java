// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.a.a.e;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class i implements ActionListener {

    final r a;

    i(final r a) {
        this.a = a;
    }

    @Override
    public void actionPerformed(final ActionEvent actionEvent) {
        r.c(this.a, actionEvent);
    }
}
