// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.kvm.nativekeyboard;

import java.io.IOException;

class i implements NativeKeyEventListener {

    final g a;
    private static final String[] z = {"===NativeKeyListenerImpl.keyPressed, usbKey=", "===NativeKeyListenerImpl.keyPressed, m_enabled="};

    i(final g a) {
        this.a = a;
    }

    @Override
    public void keyPressed(final int n, final int n2) throws IOException {
        System.out.println(i.z[1] + this.a.a);
        if (this.a.a) {
            final int a = d.a(n);
            System.out.println(i.z[0] + a);
            this.a.c.d().a(a);
        }
    }

    @Override
    public void keyReleased(final int n, final int n2) throws IOException {
        if (this.a.a) {
            this.a.c.d().b(d.a(n));
        }
    }
}
