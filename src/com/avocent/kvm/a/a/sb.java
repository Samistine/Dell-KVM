// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.kvm.a.a;

import com.avocent.kvm.b.d.a;

public class sb extends b {

    protected String i;
    protected int j;
    private static final String[] z = {"Power On", "Power Cycle", "Power Off", "Reboot", "Unsupported power state: ", "SetPowerState"};

    public sb() {
        super(1060);
    }

    @Override
    public void a(final byte[] array, final byte[] array2) {
        final int b = com.avocent.kvm.b.d.a.b(array2, 0);
        this.i = com.avocent.kvm.b.d.a.a(array2, 2, b);
        this.j = (array2[2 + b] & 0xFF);
    }

    public void a(final String i) {
        this.i = i;
        this.e = 8 + this.i.length() + 3;
    }

    public void a(final Object o) {
        final int h = b.h;
        if (o == sb.z[0]) {
            this.j = 1;
            if (h == 0) {
                break;
            }
        }
        if (o == sb.z[2]) {
            this.j = 2;
            if (h == 0) {
                break;
            }
        }
        if (o == sb.z[1]) {
            this.j = 3;
            if (h == 0) {
                break;
            }
        }
        if (o == sb.z[3]) {
            this.j = 4;
            if (h == 0) {
                break;
            }
        }
        throw new RuntimeException(sb.z[4] + o);
    }

    @Override
    public byte[] b() {
        final byte[] array = new byte[2 + this.i.length() + 1];
        com.avocent.kvm.b.d.a.c(this.j, array, com.avocent.kvm.b.d.a.a(this.i, array, com.avocent.kvm.b.d.a.a(this.i.length(), array, 0), this.i.length()));
        return array;
    }

    @Override
    public String e() {
        return sb.z[5];
    }

}
