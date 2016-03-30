// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.a.a.e;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

class l implements WindowListener {

    final c a;

    l(final c a) {
        this.a = a;
    }

    @Override
    public void windowActivated(final WindowEvent windowEvent) {
    }

    @Override
    public void windowClosed(final WindowEvent windowEvent) {
        if (this.a.r != null) {
            this.a.r.b();
        }
    }

    @Override
    public void windowClosing(final WindowEvent windowEvent) {
        if (this.a.r != null) {
            this.a.r.b();
        }
    }

    @Override
    public void windowDeactivated(final WindowEvent windowEvent) {
    }

    @Override
    public void windowDeiconified(final WindowEvent windowEvent) {
    }

    @Override
    public void windowIconified(final WindowEvent windowEvent) {
    }

    @Override
    public void windowOpened(final WindowEvent windowEvent) {
    }
}
