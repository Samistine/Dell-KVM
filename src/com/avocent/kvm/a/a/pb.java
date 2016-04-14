// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.kvm.a.a;

import com.avocent.kvm.b.d.a;

public class pb extends ob {

    protected int j;
    protected int k;
    private static final String[] z = {"Video Channel Auth", "\n\n Client random: ", ", ", "\n\n  Sending appliance random: "};

    public pb() {
        super(1);
        this.e = 16;
    }

    public void c(final int j) {
        this.j = j;
    }

    public void d(final int k) {
        this.k = k;
    }

    @Override
    public void a(final byte[] array, final byte[] array2) {
        this.j = com.avocent.kvm.b.d.a.a(array2, 0);
        this.k = com.avocent.kvm.b.d.a.a(array2, 4);
    }

    @Override
    public byte[] a() {
        return super.a();
    }

    @Override
    public byte[] b() {
        final byte[] array = new byte[8];
        com.avocent.kvm.b.d.a.b(this.k, array, com.avocent.kvm.b.d.a.b(this.j, array, 0));
        System.out.println(pb.z[3] + array[4] + pb.z[2] + array[5] + pb.z[2] + array[6] + pb.z[2] + array[7]);
        System.out.println(pb.z[1] + this.j);
        return array;
    }

    @Override
    public String e() {
        return pb.z[0];
    }

}
