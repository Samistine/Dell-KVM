// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.a.a.a;

import java.awt.event.ActionEvent;
import com.avocent.a.d;
import javax.swing.AbstractAction;

//Originally named i
public class AbstractAction_i extends AbstractAction {

    com.avocent.a.a.i a;
    private static final String z = "MainMenu_Tools_SessionOptions";

    public AbstractAction_i(com.avocent.a.a.i a) {
        super(d.b(AbstractAction_i.z));

        a.d();
        this.a = a;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        this.a.n().g();
    }
}
