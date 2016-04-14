// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.kvm.nativekeyboard;

import java.beans.PropertyChangeEvent;
import com.avocent.kvm.b.a.b;

class b extends com.avocent.kvm.b.a.b {

    final c b;
    private static final String[] z = {" Invalid single cursor termination key: ", "singleCursorTerminationKey"};

    b(final c b) {
        this.b = b;
    }

    @Override
    public void propertyChange(final PropertyChangeEvent propertyChangeEvent) {
        if (propertyChangeEvent.getPropertyName().equalsIgnoreCase(com.avocent.kvm.nativekeyboard.b.z[1])) {
            final Object newValue = propertyChangeEvent.getNewValue();
            if (newValue instanceof Integer) {
                this.b.p = (int) newValue;
                if (NativeKVM.b == 0) {
                    break;
                }
            }
            this.b.f.b().a(com.avocent.kvm.nativekeyboard.b.z[0] + newValue);
        }
    }
}
