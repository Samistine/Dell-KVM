package com.avocent.a.a.e;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

class l implements WindowListener
{
    final c a;
    
    l(final c a) {
        this.a = a;
        super();
    }
    
    public void windowActivated(final WindowEvent windowEvent) {
    }
    
    public void windowClosed(final WindowEvent windowEvent) {
        if (this.a.r != null) {
            this.a.r.b();
        }
    }
    
    public void windowClosing(final WindowEvent windowEvent) {
        if (this.a.r != null) {
            this.a.r.b();
        }
    }
    
    public void windowDeactivated(final WindowEvent windowEvent) {
    }
    
    public void windowDeiconified(final WindowEvent windowEvent) {
    }
    
    public void windowIconified(final WindowEvent windowEvent) {
    }
    
    public void windowOpened(final WindowEvent windowEvent) {
    }
}
