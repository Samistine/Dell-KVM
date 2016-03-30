package com.avocent.a.a.e;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

class f implements ItemListener
{
    final r a;
    
    f(final r a) {
        this.a = a;
        super();
    }
    
    public void itemStateChanged(final ItemEvent itemEvent) {
        this.a.d = true;
        this.a.b.n();
    }
}
