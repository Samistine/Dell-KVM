// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.lenovo.kvm;

import java.io.IOException;
import java.awt.event.ActionEvent;
import com.avocent.kvm.b.e.a;
import javax.swing.AbstractAction;

public class AbstractAction_j extends AbstractAction {

    a a;
    private static final String[] z = {"ERROR: Exception while sending power setting request: ","ERROR_UNABLE_TO_APPLY_POWER_SETTING","Power Off","MAIN_MENU_POWER_OFF"};

    public AbstractAction_j(a a) {
        super(a.b(AbstractAction_j.z[3]));
        this.a = a;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        try {
            if (this.a.a().a(1, AbstractAction_j.z[2], null) == 0) {
                return;
            }
        } catch (IOException ex) {
            this.a.b().a(AbstractAction_j.z[0] + ex.getMessage());
        }
        this.a.a(this.a.b(AbstractAction_j.z[1]));
    }

}
