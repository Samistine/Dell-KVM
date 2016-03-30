// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.a.a.e;

import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;

class a extends MouseAdapter {

    final s a;

    a(final s a) {
        this.a = a;
    }

    @Override
    public void mouseReleased(final MouseEvent mouseEvent) {
        s.a(this.a, mouseEvent);
    }
}
