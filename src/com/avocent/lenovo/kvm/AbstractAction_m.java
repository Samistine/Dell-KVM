// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.lenovo.kvm;

import com.avocent.kvm.nativekeyboard.c;
import java.awt.event.ActionEvent;
import com.avocent.a.a.i;
import javax.swing.AbstractAction;

//Originally named m
public class AbstractAction_m extends AbstractAction {

    i a;
    protected boolean b;
    private static final String z = "MenuItem_SingleCursor";

    public AbstractAction_m(final i a) {
        super(a.b(AbstractAction_m.z));
        this.b = false;
        this.a = a;
    }

    @Override
    public void actionPerformed(final ActionEvent actionEvent) {
        ((c) this.a.l()).a(!this.b);
        ((c) this.a.m()).a(!this.b);
        this.enabled = !this.enabled;
    }

}
