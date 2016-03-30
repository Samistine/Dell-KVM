// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.kvm.b.f;

import javax.net.ssl.HandshakeCompletedEvent;
import javax.net.ssl.HandshakeCompletedListener;

public class g implements HandshakeCompletedListener {

    boolean a;

    public g() {
        this.a = false;
    }

    @Override
    public void handshakeCompleted(final HandshakeCompletedEvent handshakeCompletedEvent) {
        this.a(true);
    }

    synchronized void a(final boolean a) {
        this.a = a;
    }

    public synchronized boolean a() {
        return this.a;
    }
}
