// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.kvm.b;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

class y implements FocusListener {

    final x a;

    y(final x a) {
        this.a = a;
    }

    @Override
    public void focusLost(final FocusEvent focusEvent) {
        this.a.c.a(false);
    }

    @Override
    public void focusGained(final FocusEvent focusEvent) {
        this.a.c.a(true);
    }
}
