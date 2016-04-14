// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.kvm.nativekeyboard;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

class h implements FocusListener {

    final g a;
    private static final String[] z = {" Focus lost.", " Focus Gained."};

    h(final g a) {
        this.a = a;
    }

    @Override
    public void focusLost(final FocusEvent focusEvent) {
        System.out.println(h.z[0]);
        if (this.a.a(focusEvent.getComponent())) {
            final Component component = focusEvent.getComponent();
            try {
                NativeKVM.a(component, false);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        this.a.c.a(false);
    }

    @Override
    public void focusGained(final FocusEvent focusEvent) {
        System.out.println(h.z[1]);
        if (this.a.a(focusEvent.getComponent())) {
            final Component component = focusEvent.getComponent();
            try {
                NativeKVM.a(component, true);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        this.a.c.a(true);
    }

}
