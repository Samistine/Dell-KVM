// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.kvm.nativekeyboard;

import java.awt.event.ComponentEvent;
import java.awt.event.ComponentAdapter;

public class a extends ComponentAdapter {

    final c a;

    public a(final c a) {
        this.a = a;
    }

    @Override
    public void componentMoved(final ComponentEvent componentEvent) {
        this.a.c = true;
        c.a(this.a);
    }

    @Override
    public void componentResized(final ComponentEvent componentEvent) {
        this.a.c = true;
        c.a(this.a);
    }
}
