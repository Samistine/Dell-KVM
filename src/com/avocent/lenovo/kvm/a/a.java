// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.lenovo.kvm.a;

public class a extends com.avocent.a.e {

    protected JDialog_f j;
    protected AbstractAction_b k;
    protected AbstractAction_e l;
    protected AbstractAction_c m;
    protected com.avocent.kvm.b.e.a n;
    public static int o;
    private static final String[] z = {"HOST","USERNAME","IM: ","IMDialog"};

    public a(com.avocent.kvm.b.e.a a) {
        super(/*z[3],*/ (com.avocent.a.e) a);
        int n = o;
        this.n = a;
        this.k = new AbstractAction_b(this);
        this.l = new AbstractAction_e(this);
        this.m = new AbstractAction_c(this);
        if (com.avocent.kvm.b.d.a.c != 0) {
            o = ++n;
        }
    }

    public com.avocent.kvm.b.e.a a() {
        return this.n;
    }

    public void a(boolean visible) {
        if (visible && this.j == null) {
            this.j = new JDialog_f(this, this.n.c());
            final String a = this.n.a(com.avocent.lenovo.kvm.a.a.z[0], "");
            final String a2 = this.n.a(com.avocent.lenovo.kvm.a.a.z[1], "");
            this.j.setTitle(com.avocent.lenovo.kvm.a.a.z[2] + a);
            this.j.a(a2);
        }
        this.j.setVisible(visible);
    }

    public void c() {
    }

    public void f() {
    }
}
