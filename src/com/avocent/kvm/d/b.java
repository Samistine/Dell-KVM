// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.kvm.d;

import com.avocent.kvm.b.d.a;
import com.avocent.kvm.b.gb;

public class b extends gb {

    protected int m;
    protected int n;
    protected int o;
    protected int p;
    protected int q;
    protected int r;
    protected boolean s;
    protected boolean t;
    protected int u;
    protected int v;
    protected int w;
    private static final String[] z = {"ASpeed JPEG Video", "Not implemented"};

    public b(final int n) {
        super(n);
    }

    public int l() {
        return this.m;
    }

    public int m() {
        return this.n;
    }

    public int n() {
        return this.o;
    }

    public int o() {
        return this.p;
    }

    public int p() {
        return this.q;
    }

    public int q() {
        return this.r;
    }

    public int r() {
        return this.u;
    }

    public int s() {
        return this.v;
    }

    public void b(final int w) {
        this.w = w;
    }

    public void t() {
        ++this.w;
    }

    public void b(final byte[] array, final int n, final int f) {
        if (this.g == null || this.g.length <= f) {
            this.g = new byte[f];
        }
        this.f = f;
        System.arraycopy(array, n, this.g, 0, f);
    }

    @Override
    public void a(final byte[] array, final byte[] array2, final int n) {
        int xb = com.avocent.kvm.d.c.Xb;
        this.b(array2, 12, n - 12);
        this.r = (array2[0] & 0xFF);
        final int n2 = (array2[1] & 0xFF) << 16 | (array2[2] & 0xFF) << 8 | (array2[3] & 0xFF);
        this.m = (n2 >> 12 & 0xFFF);
        this.n = (n2 & 0xFFF);
        this.h = this.b(array2, 4);
        this.i = this.b(array2, 6);
        this.b((array2[8] & 0x1) > 0);
        this.c((array2[8] & 0x2) > 0);
        this.s = ((array2[8] & 0x4) > 0);
        this.t = ((array2[8] & 0x8) > 0);
        final int b = this.b(array2, 9);
        this.o = (b >> 10 & 0x3F);
        this.p = (b >> 4 & 0x3F);
        this.q = (b & 0xF);
        this.u = (array2[11] & 0xF);
        this.v = (array2[11] & 0xF0) >> 4;
        if (com.avocent.kvm.b.d.a.c != 0) {
            com.avocent.kvm.d.c.Xb = ++xb;
        }
    }

    public void a(final b b) {
        final int f = this.f + b.v();
        if (this.g == null || this.g.length <= f) {
            final byte[] g = this.g;
            this.g = new byte[f];
            if (g != null) {
                System.arraycopy(g, 0, this.g, 0, this.f);
            }
        }
        System.arraycopy(b.u(), 0, this.g, this.f, b.v());
        this.f = f;
    }

    public byte[] u() {
        return this.g;
    }

    public int v() {
        return this.f;
    }

    @Override
    public byte[] a() {
        throw new RuntimeException(/*b.*/z[1]);
    }

    @Override
    public byte[] b() {
        throw new RuntimeException(/*b.*/z[1]);
    }

    @Override
    public String e() {
        return /*b.*/ z[0];
    }

}
