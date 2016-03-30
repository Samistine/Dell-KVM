package com.avocent.kvm.b;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

class y implements FocusListener
{
    final x a;
    
    y(final x a) {
        this.a = a;
        super();
    }
    
    public void focusLost(final FocusEvent focusEvent) {
        this.a.c.a(false);
    }
    
    public void focusGained(final FocusEvent focusEvent) {
        this.a.c.a(true);
    }
}
