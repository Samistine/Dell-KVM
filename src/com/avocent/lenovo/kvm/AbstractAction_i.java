// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.lenovo.kvm;

import java.io.IOException;
import java.awt.event.ActionEvent;
import com.avocent.kvm.b.e.a;
import javax.swing.AbstractAction;

//Originally named i
public class AbstractAction_i extends AbstractAction {

    a a;
    private static final String[] z = {"MAIN_MENU_POWER_CYCLE", "Power Cycle", "ERROR_UNABLE_TO_APPLY_POWER_SETTING", "ERROR: Exception while sending power setting request: "};

    public AbstractAction_i(a a) {
        super(a.b(AbstractAction_i.z[0]));
        this.a = a;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        try {
            if (this.a.a().a(1, AbstractAction_i.z[1], null) == 0) {
                return;
            }
        } catch (IOException ex) {
            this.a.b().a(AbstractAction_i.z[3] + ex.getMessage());
        }
        this.a.a(this.a.b(AbstractAction_i.z[2]));
    }

}
