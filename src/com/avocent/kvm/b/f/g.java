package com.avocent.kvm.b.f;

import javax.net.ssl.HandshakeCompletedEvent;
import javax.net.ssl.HandshakeCompletedListener;

public class g implements HandshakeCompletedListener
{
    boolean a;
    
    public g() {
        super();
        this.a = false;
    }
    
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
