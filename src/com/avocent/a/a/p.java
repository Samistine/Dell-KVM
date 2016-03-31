// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.a.a;

import java.util.prefs.Preferences;
import java.awt.event.WindowListener;

class p implements Runnable {

    private final i a;

    public p(i a) {
        this.a = a;
    }

    @Override
    public void run() {
        this.a.k = this.a.B.b(this.a);
        this.a.l = this.a.B.c(this.a);
        this.a.k.pack();
        this.a.k.addWindowListener(this.a.y);
        this.a.l.addWindowListener(this.a.y);
        this.a.q = Preferences.userNodeForPackage(this.getClass());
        this.a.o = this.a.B.a(this.a, this.a.o().c());
        this.a.p = this.a.B.a(this.a, this.a.p().c());
        this.a.o.a(this.a.m, true);
        this.a.p.a(this.a.n, true);
        this.a.m.a(true);
        this.a.k.pack();
    }
}
