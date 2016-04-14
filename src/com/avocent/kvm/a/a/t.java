// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.kvm.a.a;

import com.avocent.kvm.b.d.a;

public class t extends h {

    byte[] j;
    int k;
    int l;
    private static final String z = "Set Display Area";

    public t() {
        super(770);
        this.j = new byte[4];
        this.e = 16;
    }

    public t(final int k, final int l) {
        super(770);
        this.j = new byte[4];
        this.k = k;
        this.l = l;
        this.e = 16;
    }

    @Override
    public void a(final byte[] array, final byte[] array2) {
        this.k = com.avocent.kvm.b.d.a.b(array2, 0);
        this.l = com.avocent.kvm.b.d.a.b(array2, 2);
    }

    @Override
    public byte[] b() {
        final byte[] array = new byte[8];
        com.avocent.kvm.b.d.a.a(this.k, array, 0);
        com.avocent.kvm.b.d.a.a(this.l, array, 2);
        return array;
    }

    @Override
    public String e() {
        return t.z;
    }

}
