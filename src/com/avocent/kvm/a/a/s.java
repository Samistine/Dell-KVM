// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.kvm.a.a;

import com.avocent.kvm.b.d.a;

public class s extends h {

    protected int j;
    protected String k;
    protected String l;
    private static final String z = "We are here.";

    public s(final int j, final String k) {
        super(800);
        this.j = 0;
        this.j = j;
        this.k = k;
        this.e = 12 + this.k.length();
    }

    @Override
    public void a(final byte[] array, final byte[] array2) {
    }

    @Override
    public String e() {
        return this.l + "(" + this.k + ")";
    }

    @Override
    public byte[] b() {
        final byte[] array = new byte[4 + this.k.length()];
        com.avocent.kvm.b.d.a.a(this.j, array, 0);
        com.avocent.kvm.b.d.a.a(this.k.length(), array, 2);
        com.avocent.kvm.b.d.a.a(this.k, array, 4, this.k.length());
        System.out.println(s.z);
        return array;
    }

}
