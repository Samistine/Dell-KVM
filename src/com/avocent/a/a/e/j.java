// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.a.a.e;

import com.avocent.kvm.b.db;
import com.avocent.kvm.b.u;
import java.beans.PropertyChangeEvent;
import com.avocent.kvm.b.a.a;

class j implements a {

    final r a;
    private static final String[] z = {"mouse_accel","singleCursorTerminationKey","MouseAccelPanel: Bad mouse accel value (",")."};

    j(final r a) {
        this.a = a;
    }

    @Override
    public void propertyChange(final PropertyChangeEvent propertyChangeEvent) {
        final int t = c.t;
        if (!this.a.c) {
            final String propertyName = propertyChangeEvent.getPropertyName();
            if (propertyName.equals(j.z[0])) {
                final Object newValue = propertyChangeEvent.getNewValue();
                try {
                    Label_0081:
                    {
                        if (newValue instanceof Integer) {
                            this.a.a((Integer) newValue);
                            if (t == 0) {
                                break Label_0081;
                            }
                        }
                        if (newValue instanceof String) {
                            this.a.a(Integer.valueOf((String) newValue));
                        }
                    }
                } catch (NumberFormatException ex) {
                    this.a.a.b().a(j.z[2] + newValue + j.z[3]);
                }
                this.a.a(true);
                this.a.b.n();
                if (t == 0) {
                    return;
                }
            }
            if (!propertyName.equalsIgnoreCase(j.z[1]) || this.a.a.a().a(j.z[1], null) != null) {
            }
        }
    }

    @Override
    public void b(final u u) {
    }

    @Override
    public void a(final u u, final com.avocent.kvm.b.r r, final com.avocent.kvm.b.r r2) {
    }

    @Override
    public void a(final u u) {
    }

    @Override
    public void a(final u u, final db db) {
    }

    }
