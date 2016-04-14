// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.kvm.a.a;

import com.avocent.kvm.b.d.a;

public class nb extends y {

    protected int j;
    protected int k;
    protected int l;
    protected int m;
    protected int n;
    protected int o;
    protected int p;
    protected int q;
    protected int r;
    protected int s;
    private static final String z = "VideoSetupData";

    public nb() {
        super(33282);
        this.e = 32;
    }

    @Override
    public void a(final byte[] array, final byte[] array2) {
        this.j = com.avocent.kvm.b.d.a.b(array2, 0);
        this.k = com.avocent.kvm.b.d.a.b(array2, 2);
        this.l = com.avocent.kvm.b.d.a.b(array2, 4);
        this.m = com.avocent.kvm.b.d.a.b(array2, 6);
        this.n = com.avocent.kvm.b.d.a.b(array2, 8);
        this.o = com.avocent.kvm.b.d.a.b(array2, 10);
        this.p = com.avocent.kvm.b.d.a.b(array2, 12);
        this.q = com.avocent.kvm.b.d.a.b(array2, 14);
        this.r = com.avocent.kvm.b.d.a.b(array2, 16);
        this.s = com.avocent.kvm.b.d.a.b(array2, 18);
    }

    @Override
    public byte[] b() {
        final byte[] array = new byte[24];
        com.avocent.kvm.b.d.a.a(this.j, array, 0);
        com.avocent.kvm.b.d.a.a(this.k, array, 2);
        com.avocent.kvm.b.d.a.a(this.l, array, 0);
        com.avocent.kvm.b.d.a.a(this.m, array, 6);
        com.avocent.kvm.b.d.a.a(this.n, array, 8);
        com.avocent.kvm.b.d.a.a(this.o, array, 10);
        com.avocent.kvm.b.d.a.a(this.p, array, 12);
        com.avocent.kvm.b.d.a.a(this.q, array, 14);
        com.avocent.kvm.b.d.a.a(this.r, array, 16);
        com.avocent.kvm.b.d.a.a(this.s, array, 18);
        return array;
    }

    @Override
    public String e() {
        return nb.z;
    }

    public int h() {
        return this.j;
    }

    public int i() {
        return this.k;
    }

    public int j() {
        return this.l;
    }

    public int k() {
        return this.m;
    }

    public int l() {
        return this.o;
    }

    public int m() {
        return this.s;
    }

}
