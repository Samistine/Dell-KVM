// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.kvm.b;

import java.beans.PropertyChangeEvent;
import com.avocent.kvm.b.a.a;

class o implements a {

    final ob a;

    o(final ob a) {
        this.a = a;
    }

    @Override
    public void a(final u u) {
    }

    @Override
    public void a(final u u, final db db) {
    }

    @Override
    public void b(final u u) {
    }

    @Override
    public void a(final u u, final r r, final r r2) {
        if (r != null) {
            r.a();
        }
        r2.a(this.a, u.i());
    }

    @Override
    public void propertyChange(final PropertyChangeEvent propertyChangeEvent) {
    }
}
