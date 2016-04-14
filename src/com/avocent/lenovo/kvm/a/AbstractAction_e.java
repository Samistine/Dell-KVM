// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.lenovo.kvm.a;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

//Originally named e
public class AbstractAction_e extends AbstractAction {

    protected a a;
    private static final String z = "IMDialogSend";

    public AbstractAction_e(a a) {
        super(a.a().b(AbstractAction_e.z));
        this.a = a;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        this.a.c();
    }
}
