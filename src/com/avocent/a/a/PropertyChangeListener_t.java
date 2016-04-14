// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.a.a;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

//Originally named t
public class PropertyChangeListener_t implements PropertyChangeListener {

    protected i a;
    private static final String[] z = {"PASSTHROUGH", "FULLSCREEN", " Property Change:", ", new value: "};

    public PropertyChangeListener_t(final i a) {
        this.a = a;
    }

    @Override
    public void propertyChange(final PropertyChangeEvent propertyChangeEvent) {
        final String propertyName = propertyChangeEvent.getPropertyName();
        if (propertyName.equalsIgnoreCase(PropertyChangeListener_t.z[1])) {
            System.out.println(PropertyChangeListener_t.z[2] + propertyName + PropertyChangeListener_t.z[3] + propertyChangeEvent.getNewValue());
            this.a.a(Boolean.valueOf(propertyChangeEvent.getNewValue().toString().trim()));
            if (!i.G) {
                return;
            }
        }
        if (propertyName.equalsIgnoreCase(PropertyChangeListener_t.z[0])) {
            this.a.a().g().a(this.a.o(), (boolean) propertyChangeEvent.getNewValue());
        }
    }
}
