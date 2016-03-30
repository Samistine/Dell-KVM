// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.kvm.nativekeyboard;

import java.awt.Component;

class k implements Runnable {

    protected long a;
    protected Component b;

    k(final Component b) {
        this.a = -1L;
        this.b = b;
    }

    @Override
    public void run() {
        if (!this.b.isDisplayable()) {
            this.b.addNotify();
        }
        this.b.setVisible(true);
        this.a = NativeKVM.getWindowId(this.b);
    }

    public long a() {
        return this.a;
    }
}
