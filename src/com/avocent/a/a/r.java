// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.a.a;

import com.avocent.a.d;
import java.beans.PropertyChangeEvent;
import com.avocent.kvm.b.db;
import com.avocent.kvm.b.u;
import com.avocent.kvm.b.a.a;

public class r implements a {

    protected i a;
    protected h b;
    protected boolean c;
    private static final String[] z = {"CONNECTION_LOGIN_FAILED", "ConnectionDialog_NoChannelsAvailable", "RUNNING", "ALL_CHANNELS_IN_USE", "VIDEO_PANEL_SIZE_CHANGED", "KVM Listener: video panel size change detected.", " KVM session is running."};

    r(final i a) {
        this.c = false;
        this.a = a;
    }

    public r() {
        this.c = false;
    }

    @Override
    public void a(final u u) {
        this.a.b().a(r.z[6]);
        this.a.g();
    }

    @Override
    public void a(final u u, final db db) {
    }

    @Override
    public void a(final u u, final com.avocent.kvm.b.r r, final com.avocent.kvm.b.r r2) {
    }

    @Override
    public void b(final u u) {
        if (!this.c) {
            this.c = true;
            this.a.a(u);
        }
    }

    public void a(final h b) {
        this.b = b;
    }

    @Override
    public void propertyChange(final PropertyChangeEvent propertyChangeEvent) {
        final boolean g = i.G;
        final String propertyName = propertyChangeEvent.getPropertyName();
        final String string = propertyChangeEvent.getNewValue().toString();
        if (string.equalsIgnoreCase(r.z[0])) {
            this.a.s();
            if (!g) {
                return;
            }
        }
        if (string.equalsIgnoreCase(r.z[3])) {
            final i a = this.a;
            this.a.d();
            a.f(d.b(r.z[1]));
            System.exit(0);
            if (!g) {
                return;
            }
        }
        if (string.equalsIgnoreCase(r.z[2])) {
            if (this.b == null) {
                return;
            }
            this.b.m();
            if (!g) {
                return;
            }
        }
        if (propertyName.equalsIgnoreCase(r.z[4])) {
            this.a.b().a(r.z[5]);
            this.a.r().pack();
        }
    }
}
