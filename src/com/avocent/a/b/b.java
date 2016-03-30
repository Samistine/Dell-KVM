package com.avocent.a.b;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

class b implements WindowListener
{
    final a a;
    
    b(final a a) {
        this.a = a;
        super();
    }
    
    public void windowActivated(final WindowEvent windowEvent) {
    }
    
    public void windowClosed(final WindowEvent windowEvent) {
        if (this.a.k != null) {
            this.a.k.b();
        }
    }
    
    public void windowClosing(final WindowEvent windowEvent) {
        if (this.a.k != null) {
            this.a.k.b();
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
