// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.a.a.a;

import java.io.IOException;
import java.awt.event.ActionEvent;
import com.avocent.a.d;
import com.avocent.a.a.i;
import javax.swing.AbstractAction;

//Originally named j
public class AbstractAction_j extends AbstractAction {

    i a;
    private static final String z = "MainMenu_View_Refresh";

    public AbstractAction_j(i a) {
        super(d.b(AbstractAction_j.z));

        a.d();
        this.a = a;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        try {
            this.a.a().a();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
