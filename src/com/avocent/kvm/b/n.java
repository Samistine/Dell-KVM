// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.kvm.b;

class n implements Runnable {

    final ob a;

    n(final ob a) {
        this.a = a;
    }

    @Override
    public void run() {
        this.a.repaint();
    }
}
