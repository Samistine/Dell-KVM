// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.a.a;

import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;

//Originally named f
class WindowsAdpater_f extends WindowAdapter {

    final i a;

    WindowsAdpater_f(i a) {
        this.a = a;
    }

    @Override
    public void windowClosing(WindowEvent windowEvent) {
        try {
            this.a.t();
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            System.exit(0);
        }
    }
}
