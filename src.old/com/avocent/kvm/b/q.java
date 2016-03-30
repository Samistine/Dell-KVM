// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.kvm.b;

class q implements Runnable {

    final qb a;

    q(final qb a) {
        this.a = a;
    }

    @Override
    public void run() {
        synchronized (this.a.C) {
            this.a.repaint();
            this.a.B = false;
        }
    }
}
