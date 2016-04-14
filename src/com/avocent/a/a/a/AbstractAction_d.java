// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.a.a.a;

import java.awt.event.ActionEvent;
import com.avocent.a.a.i;
import javax.swing.AbstractAction;

//Originally named d
public class AbstractAction_d extends AbstractAction {

    i a;
    private static final String z = "MainMenu_File_Exit";

    public AbstractAction_d(i a) {
        super(com.avocent.a.d.b(AbstractAction_d.z));

        a.d();
        this.a = a;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        try {
            this.a.t();
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            System.exit(0);
        }
    }
}
