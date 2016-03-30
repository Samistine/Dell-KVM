// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.lenovo.kvm.b;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class b implements ActionListener {

    final e a;

    b(final e a) {
        this.a = a;
    }

    @Override
    public void actionPerformed(final ActionEvent actionEvent) {
        e.a(this.a, actionEvent);
    }
}
