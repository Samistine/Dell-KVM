// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.kvm.a.a;

import com.avocent.kvm.b.d.a;

public class qb extends b {

    protected String i;
    private static final String z = "SelectedServerUpdate";

    public qb() {
        super(33841);
    }

    @Override
    public void a(final byte[] array, final byte[] array2) {
        this.i = com.avocent.kvm.b.d.a.a(array2, 2, com.avocent.kvm.b.d.a.b(array2, 0));
    }

    @Override
    public byte[] b() {
        final byte[] array = new byte[2 + this.i.length()];
        com.avocent.kvm.b.d.a.a(this.i, array, com.avocent.kvm.b.d.a.a(this.i.length(), array, 0), this.i.length());
        return array;
    }

    @Override
    public String e() {
        return qb.z;
    }

    public String h() {
        return this.i;
    }

}
