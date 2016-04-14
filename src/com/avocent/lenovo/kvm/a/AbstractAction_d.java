// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.lenovo.kvm.a;

import java.awt.event.ActionEvent;
import com.avocent.lenovo.kvm.c;
import javax.swing.AbstractAction;

//Originally named d
public class AbstractAction_d extends AbstractAction {

    c a;
    private static final String z = "MAIN_MENU_IM";

    public AbstractAction_d(c a) {
        super(a.b(AbstractAction_d.z));
        this.a = a;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        this.a.u().a(true);
    }
}
