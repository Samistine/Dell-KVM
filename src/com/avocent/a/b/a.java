// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.a.b;

import java.awt.Component;
import com.avocent.a.j;
import java.awt.event.WindowListener;
import javax.swing.JDialog;
import javax.swing.Action;
import com.avocent.kvm.b.nb;
import com.avocent.a.k;
import com.avocent.kvm.b.u;
import com.avocent.a.e;
import java.awt.event.WindowEvent;

public class a extends e {

    protected u j;
    protected k k;
    protected nb l;
    protected Action m;
    public static int n;
    private static final String z = "StatsDialogController";

    public a(final com.avocent.kvm.b.e.a a) {
        super(/*z,*/ (e) a);
        this.m = new d(this);
        this.j = a.a();
    }

    public com.avocent.kvm.b.e.a a() {
        return (com.avocent.kvm.b.e.a) this.f;
    }

    public void c() {
        int n = a.n;
        if (this.component_b == null) {
            this.component_b = new com.avocent.a.b.e(this, false);
            ((JDialog) this.component_b).addWindowListener(new WindowListener_b(this));
        }
        if (this.k != null) {
            this.k.b();
        }
        this.k = new k(this.j, (j) this.component_b);
        this.l = this.k.a();
        ((com.avocent.a.b.e) this.component_b).a(this.l);
        this.k.start();
        this.component_b.setVisible(true);
        if (n != 0) {
            int c = com.avocent.kvm.b.d.a.c;
            com.avocent.kvm.b.d.a.c = ++c;
        }
    }

    static Component a(final a a) {
        return a.component_b;
    }

    //Originally named b
    static class WindowListener_b implements WindowListener {

        final a a;

        WindowListener_b(a a) {
            this.a = a;
        }

        @Override
        public void windowActivated(WindowEvent windowEvent) {
        }

        @Override
        public void windowClosed(WindowEvent windowEvent) {
            if (this.a.k != null) {
                this.a.k.b();
            }
        }

        @Override
        public void windowClosing(WindowEvent windowEvent) {
            if (this.a.k != null) {
                this.a.k.b();
            }
        }

        @Override
        public void windowDeactivated(WindowEvent windowEvent) {
        }

        @Override
        public void windowDeiconified(WindowEvent windowEvent) {
        }

        @Override
        public void windowIconified(WindowEvent windowEvent) {
        }

        @Override
        public void windowOpened(WindowEvent windowEvent) {
        }
    }
}
