// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.a.a;

import java.beans.PropertyChangeEvent;
import com.avocent.kvm.a.c;

public class l implements c {

    protected i h;
    private static final String[] z = {"VideoStopped_OutOfRange", "video_state", " Missing message for resource key: ", "VideoStopped_Calibrating", "VideoStopped_NoSignal"};

    public l(final i h) {
        this.h = h;
    }

    @Override
    public void propertyChange(final PropertyChangeEvent propertyChangeEvent) {
        if (propertyChangeEvent.getPropertyName().equals(l.z[1])) {
            final Object newValue = propertyChangeEvent.getNewValue();
            String s = null;
            if (newValue.equals(0)) {
                s = l.z[3];
            } else if (newValue.equals(1)) {
                s = l.z[4];
            } else if (newValue.equals(2)) {
                s = l.z[0];
            } else if (newValue.equals(100)) {
                this.h.o().a((String) null);
                this.h.p().a((String) null);
            }
            if (s != null) {
                this.h.d();
                final String b = com.avocent.a.d.b(s);
                if (b != null && b.length() > 0) {
                    this.h.o().a(b);
                    this.h.p().a(b);
                    if (!i.G) {
                        return;
                    }
                }
                this.h.b().a(l.z[2] + s);
            }
        }
    }
}
