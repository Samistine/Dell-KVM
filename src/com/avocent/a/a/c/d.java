// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.a.a.c;

import javax.swing.JMenuItem;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

public class d extends AbstractAction {

    protected b a;
    protected NamedArray b;
    private static final String z = "MenuAction invoked from non MenuItem component!  Component was a (";

    public d(final b a, final NamedArray b) {
        super(b.getName());
        this.b = b;
        this.a = a;
    }

    @Override
    public void actionPerformed(final ActionEvent actionEvent) {
        final Object source = actionEvent.getSource();
        if (!(source instanceof JMenuItem)) {
            throw new RuntimeException(d.z + ((JMenuItem) source).getClass().getName() + ")");
        }
        final JMenuItem menuItem = (JMenuItem) source;
        this.a.a(this.b);
    }
}
