// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.lenovo.kvm.a;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

//Originally named c
public class AbstractAction_c extends AbstractAction {

    protected a a;
    private static final String z = "IMDialogClose";

    public AbstractAction_c(a a) {
        super(a.a().b(AbstractAction_c.z));
        this.a = a;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        this.a.a(false);
    }
}
