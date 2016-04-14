// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.lenovo.kvm;

import java.io.IOException;
import java.awt.event.ActionEvent;
import com.avocent.kvm.b.e.a;
import javax.swing.AbstractAction;

//Originally named k
public class AbstractAction_k extends AbstractAction {

    a a;
    private static final String[] z = {"ERROR_UNABLE_TO_APPLY_POWER_SETTING","ERROR: Exception while sending power setting request: ","Power On","MAIN_MENU_POWER_ON"};

    public AbstractAction_k(a a) {
        super(a.b(AbstractAction_k.z[3]));
        this.a = a;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        try {
            if (this.a.a().a(1, AbstractAction_k.z[2], null) == 0) {
                return;
            }
        } catch (IOException ex) {
            this.a.b().a(AbstractAction_k.z[1] + ex.getMessage());
        }
        this.a.a(this.a.b(AbstractAction_k.z[0]));
    }

}
