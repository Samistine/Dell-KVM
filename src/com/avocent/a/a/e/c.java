// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.a.a.e;

import com.avocent.a.j;
import java.awt.event.WindowListener;
import java.awt.Frame;
import com.avocent.a.g;
import javax.swing.JDialog;
import java.awt.Component;
import com.avocent.a.e;
import com.avocent.kvm.b.nb;
import com.avocent.a.k;
import com.avocent.kvm.b.u;
import com.avocent.a.a.i;
import java.util.ArrayList;
import com.avocent.a.f;

public class c extends f {

    protected ArrayList o;
    protected i p;
    protected u q;
    protected k r;
    protected nb s;
    public static int t;
    private static final String z = "TabbedOptionsDialog";

    public c(final i p) {
        super(z, p);//Sam
        this.o = new ArrayList();
        this.p = p;
        this.setComponent_b(this.m());
    }

    public JDialog m() {
        final p p = new p(this, ((g) this.f).c(), true);
        p.addWindowListener(new l(this));
        return p;
    }

    public void a(final com.avocent.a.a.e.k k) {
        this.o.add(k);
        ((p) this.component_b).a(k);
        k.a(this);
    }

    public void n() {
        final int t = c.t;
        boolean enabled = false;
        int i = 0;
        while (i < this.o.size()) {
            if (((com.avocent.a.a.e.k) this.o.get(i)).f()) {
                enabled = true;
                if (t == 0) {
                    break;
                }
            }
            ++i;
            if (t != 0) {
                break;
            }
        }
        this.m.setEnabled(enabled);
    }

    public void a(final boolean enabled) {
        this.m.setEnabled(enabled);
    }

    @Override
    public void g() {
        this.q = this.p.a();
        if (this.q != null) {
            if (this.r != null) {
                this.r.b();
            }
            this.r = new k(this.q, (j) this.component_b);
            this.s = this.r.a();
            this.r.start();
        }
        if (!this.component_b.isVisible()) {
            final p p = (p) this.component_b;
            p.pack();
            p.setLocationRelativeTo(((g) this.f).c());
            this.p();
            this.n();
            this.component_b.setVisible(true);
            if (c.t == 0) {
                break;
            }
        }
        if (!this.component_b.isShowing()) {
            ((JDialog) this.component_b).toFront();
        }
    }

    public nb o() {
        return this.s;
    }

    public void p() {
        final int t = c.t;
        int i = 0;
        while (i < this.o.size()) {
            ((com.avocent.a.a.e.k) this.o.get(i)).c();
            ++i;
            if (t != 0) {
                break;
            }
        }
    }

    @Override
    public void i() {
        final int t = c.t;
        int i = 0;
        while (i < this.o.size()) {
            ((com.avocent.a.a.e.k) this.o.get(i)).a();
            ++i;
            if (t != 0) {
                break;
            }
        }
    }

    @Override
    public void j() {
        final int t = c.t;
        int i = 0;
        while (i < this.o.size()) {
            ((com.avocent.a.a.e.k) this.o.get(i)).b();
            ++i;
            if (t != 0) {
                break;
            }
        }
        super.j();
    }
}
