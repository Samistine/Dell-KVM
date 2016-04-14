// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.lenovo.kvm;

import java.awt.event.ActionEvent;
import com.avocent.kvm.b.e.a;
import javax.swing.AbstractAction;

//Originally named h
public class AbstractAction_h extends AbstractAction {

    a a;
    private static final String z = "MAIN_MENU_FILE_EXIT";

    public AbstractAction_h(a a) {
        super(a.b(AbstractAction_h.z));
        this.a = a;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        System.exit(0);
    }

}
