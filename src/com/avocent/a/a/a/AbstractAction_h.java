// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.a.a.a;

import java.awt.event.ActionEvent;
import com.avocent.a.d;
import com.avocent.a.a.i;
import javax.swing.AbstractAction;

//Originally named h
public class AbstractAction_h extends AbstractAction {

    i a;
    private static final String z = "MainMenu_View_NormalWindow";

    public AbstractAction_h(i a) {
        super(d.b(AbstractAction_h.z));

        a.d();
        this.a = a;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        this.a.a(false);
    }
}
