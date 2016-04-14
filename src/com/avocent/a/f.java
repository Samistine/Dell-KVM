// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.a;

import com.avocent.a.d;
import com.avocent.a.e;
import com.avocent.a.l;
import com.avocent.a.m;
import com.avocent.a.n;
import com.avocent.a.o;
import com.avocent.a.p;
import com.avocent.kvm.b.d.a;
import java.awt.Component;
import java.awt.Dialog;
import javax.swing.Action;

public class f extends e {

    protected Action j;
    protected Action k;
    protected Action l;
    protected Action m;
    protected Action n;

    public f(final String s, final e e) {
        super(/*s,*/e);
        int i = com.avocent.a.e.i;
        this.j = new l(this, com.avocent.a.d.b(z[3]));
        this.k = new m(this, com.avocent.a.d.b(z[1]));
        this.l = new n(this, com.avocent.a.d.b(z[2]));
        this.m = new o(this, com.avocent.a.d.b(z[0]));
        this.n = new p(this, com.avocent.a.d.b(z[4]));
        if (i != 0) {
            int c = com.avocent.kvm.b.d.a.c;
            com.avocent.kvm.b.d.a.c = ++c;
        }
    }

    public Action a() {
        return this.j;
    }

    public Action c() {
        return this.l;
    }

    public Action f() {
        return this.m;
    }

    public void g() {
        ((Dialog) this.component_b).pack();
        this.component_b.setVisible(true);
    }

    public void h() {
        this.i();
        this.k();
    }

    public void i() {
    }

    public void j() {
        this.getComponent_b().setVisible(false);
    }

    public void k() {
        this.getComponent_b().setVisible(false);
    }

    public void l() {
    }

    static {
        z = new String[]{"IDFF_APPLY", "IDFF_CLOSE", "IDFF_CANCEL", "IDFF_OK", "IDFF_HELP"};
    }
}
