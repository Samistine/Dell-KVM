package com.avocent.a.a;

import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;

class f extends WindowAdapter
{
    final i a;
    
    f(final i a) {
        this.a = a;
        super();
    }
    
    public void windowClosing(final WindowEvent windowEvent) {
        try {
            this.a.t();
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        finally {
            System.exit(0);
        }
    }
}
