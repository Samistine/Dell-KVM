// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.kvm.nativekeyboard;

import com.avocent.kvm.b.a.d;

class j implements d {

    final c a;

    j(final c a) {
        this.a = a;
    }

    @Override
    public boolean a(final int n) {
        if (this.a.g && n == this.a.p) {
            this.a.a(false);
            return true;
        }
        return false;
    }

    @Override
    public boolean b(final int n) {
        return this.a.g && n == this.a.p;
    }
}
