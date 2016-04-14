// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.a.a.a;

import java.awt.Component;
import com.avocent.a.g;
import java.awt.event.ActionEvent;
import com.avocent.a.d;
import com.avocent.a.a.b.JDialog_b;
import com.avocent.a.a.i;
import javax.swing.AbstractAction;

//Originally named f
public class AbstractAction_f extends AbstractAction {

    i a;
    protected JDialog_b b;
    private static final String z = "MainMenu_Help_About";

    public AbstractAction_f(i a) {
        super(d.b(AbstractAction_f.z));

        a.d();
        this.a = a;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (this.b == null) {
            this.b = new JDialog_b(this.a, true);
        }
        this.b.setLocationRelativeTo(this.a.c());
        this.b.setVisible(true);
    }
}
