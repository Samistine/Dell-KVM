// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.kvm.b;

class l implements cb {

    final k a;

    l(final k a) {
        this.a = a;
    }

    @Override
    public void b() {
        final k a = this.a;
        ++a.k;
        if (this.a.t > 0) {
            final k a2 = this.a;
            --a2.t;
        }
    }

    @Override
    public void a() {
    }

    @Override
    public void a(final int n, final int n2, final int n3, final int n4) {
    }

    @Override
    public void a(final int n, final int n2) {
    }
}
