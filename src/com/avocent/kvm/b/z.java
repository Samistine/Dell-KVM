// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.kvm.b;

import java.io.IOException;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

class z implements KeyListener {

    final x a;

    z(final x a) {
        this.a = a;
    }

    @Override
    public void keyPressed(final KeyEvent keyEvent) {
        try {
            int n = 0;
            Label_0064:
            {
                if (this.a.i == 0) {
                    n = this.a.f.a(keyEvent.getKeyCode(), keyEvent.getKeyChar(), keyEvent.getKeyLocation());
                    if (!g.t) {
                        break Label_0064;
                    }
                }
                n = this.a.f.b(keyEvent.getKeyCode(), keyEvent.getKeyChar(), keyEvent.getKeyLocation());
            }
            this.a.c.d().a(n);
        } catch (IOException ex) {
        }
    }

    @Override
    public void keyReleased(final KeyEvent keyEvent) {
        try {
            int n = 0;
            Label_0064:
            {
                if (this.a.i == 0) {
                    n = this.a.f.a(keyEvent.getKeyCode(), keyEvent.getKeyChar(), keyEvent.getKeyLocation());
                    if (!g.t) {
                        break Label_0064;
                    }
                }
                n = this.a.f.b(keyEvent.getKeyCode(), keyEvent.getKeyChar(), keyEvent.getKeyLocation());
            }
            this.a.c.d().b(n);
        } catch (IOException ex) {
        }
    }

    @Override
    public void keyTyped(final KeyEvent keyEvent) {
    }
}
