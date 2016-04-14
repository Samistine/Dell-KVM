// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.a.a.e;

import java.beans.PropertyChangeEvent;
import com.avocent.kvm.b.a.b;

class o extends b {

    s b;
    private static final String z = "KVM propertyChange for ";

    public o(final s b) {
        this.b = b;
    }

    @Override
    public void propertyChange(final PropertyChangeEvent propertyChangeEvent) {
        System.out.println(o.z + propertyChangeEvent.getPropertyName());
        if (this.b != null) {
            this.b.propertyChange(propertyChangeEvent);
        }
    }

    }
