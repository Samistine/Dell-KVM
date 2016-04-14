// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.lenovo.kvm;

import java.io.IOException;
import java.awt.event.ActionEvent;
import com.avocent.kvm.b.e.a;
import javax.swing.AbstractAction;

//Originally named l
public class AbstractAction_l extends AbstractAction {

    a a;
    private static final String[] z = {"ERROR_UNABLE_TO_APPLY_POWER_SETTING","Reboot","ERROR: Exception while sending power setting request: ","MAIN_MENU_POWER_REBOOT"};

    public AbstractAction_l(final a a) {
        super(a.b(AbstractAction_l.z[3]));
        this.a = a;
    }

    @Override
    public void actionPerformed(final ActionEvent actionEvent) {
        try {
            if (this.a.a().a(1, AbstractAction_l.z[1], null) == 0) {
                return;
            }
        } catch (IOException ex) {
            this.a.b().a(AbstractAction_l.z[2] + ex.getMessage());
        }
        this.a.a(this.a.b(AbstractAction_l.z[0]));
    }

}
