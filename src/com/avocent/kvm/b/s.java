// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.kvm.b;

import java.awt.event.KeyEvent;
import java.awt.Component;
import com.avocent.kvm.b.c.c;
import java.awt.event.KeyListener;

public class s implements KeyListener {

    protected ib a;
    protected c b;

    public void a(final ib a) {
        this.a = a;
        this.b = new c(null);
    }

    @Override
    public void keyPressed(final KeyEvent keyEvent) {
        try {
            if (this.a != null) {
                this.a.a(this.b.a(keyEvent.getKeyCode(), keyEvent.getKeyChar(), keyEvent.getKeyLocation()));
            }
        } catch (Exception ex) {
            this.a = null;
        }
    }

    @Override
    public void keyReleased(final KeyEvent keyEvent) {
        try {
            if (this.a != null) {
                this.a.b(this.b.a(keyEvent.getKeyCode(), keyEvent.getKeyChar(), keyEvent.getKeyLocation()));
            }
        } catch (Exception ex) {
            this.a = null;
        }
    }

    @Override
    public void keyTyped(final KeyEvent keyEvent) {
    }
}
