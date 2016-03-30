package com.avocent.a.a.e;

import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;

class b extends MouseAdapter
{
    final s a;
    
    b(final s a) {
        this.a = a;
        super();
    }
    
    public void mouseReleased(final MouseEvent mouseEvent) {
        s.b(this.a, mouseEvent);
    }
}
