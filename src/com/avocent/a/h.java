package com.avocent.a;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

class h implements PropertyChangeListener
{
    final e a;
    
    h(final e a) {
        this.a = a;
        super();
    }
    
    public void propertyChange(final PropertyChangeEvent propertyChangeEvent) {
        this.a.a(propertyChangeEvent);
    }
}
