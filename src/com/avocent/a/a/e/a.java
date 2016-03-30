package com.avocent.a.a.e;

import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;

class a extends MouseAdapter
{
    final s a;
    
    a(final s a) {
        this.a = a;
        super();
    }
    
    public void mouseReleased(final MouseEvent mouseEvent) {
        s.a(this.a, mouseEvent);
    }
}
