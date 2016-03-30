// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.lenovo.kvm.b;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class c implements ActionListener {

    final e a;
    final e b;

    c(final e b, final e a) {
        this.b = b;
        this.a = a;
    }

    @Override
    public void actionPerformed(final ActionEvent actionEvent) {
        if (this.a.isVisible()) {
            this.b.setVisible(false);
        }
    }
}
