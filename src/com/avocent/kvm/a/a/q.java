// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.kvm.a.a;

public class q extends o {

    private static final String[] z = {"SetVideoTransmitLimit", "Invalid video transmit limit: "};

    public q() {
        this(0);
    }

    public q(final int n) {
        super(1026, q.z[0], (byte) (n & 0xFF));
        switch (n) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4: {
                if (b.h != 0) {
                    break;
                }
                break;
            }
        }
        throw new RuntimeException(q.z[1] + n);
    }

    public void a(final Object o) {
        final int h = b.h;
        if (o.equals(0)) {
            this.j = 0;
            if (h == 0) {
                break;
            }
        }
        if (o.equals(1)) {
            this.j = 1;
            if (h == 0) {
                break;
            }
        }
        if (o.equals(2)) {
            this.j = 2;
            if (h == 0) {
                break;
            }
        }
        if (o.equals(3)) {
            this.j = 3;
            if (h == 0) {
                break;
            }
        }
        if (o.equals(4)) {
            this.j = 4;
            if (h == 0) {
                break;
            }
        }
        this.j = 0;
    }

}
