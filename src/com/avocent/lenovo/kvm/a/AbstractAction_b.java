// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.lenovo.kvm.a;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

//Originally named b
public class AbstractAction_b extends AbstractAction {

    protected a a;
    private static final String z = "IMDialogClear";

    public AbstractAction_b(a a) {
        super(a.a().b(AbstractAction_b.z));
        this.a = a;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        this.a.f();
    }
}
