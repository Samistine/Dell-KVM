// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.a.a;

import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;

class f extends WindowAdapter {

    final i a;

    f(final i a) {
        this.a = a;
    }

    @Override
    public void windowClosing(final WindowEvent windowEvent) {
        try {
            this.a.t();
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            System.exit(0);
        }
    }
}
