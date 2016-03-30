// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.a.a.b;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class a implements ActionListener {

    final b a;

    a(final b a) {
        this.a = a;
    }

    @Override
    public void actionPerformed(final ActionEvent actionEvent) {
        this.a.setVisible(false);
    }
}
