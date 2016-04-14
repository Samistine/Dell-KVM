// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.lenovo.kvm;

import java.io.IOException;
import java.awt.event.ActionEvent;
import com.avocent.kvm.b.e.a;
import javax.swing.AbstractAction;

//Originally named g
public class AbstractAction_g extends AbstractAction {

    a a;
    protected Integer b;
    protected Integer c;
    private static final String[] z = {"MainMenuColorDepth7bit", "MainMenuColorDepth12bit", "Name", "MainMenuGrey6bit", "MainMenuGrey7bit", "MainMenuGrey5bit", "MainMenuColorDepth15bit", "MainMenuColorMode", "MainMenuGrey4bit", "MainMenuColorDepth9bit", "ERROR: Exception while sending color mode setting request: ", "ErrorUnableToApplyColorModeSetting"};

    public AbstractAction_g(a a, Integer b, Integer c) {
        super(a.b(AbstractAction_g.z[7]));
        Object o = null;
        if (b == 1) {
            if (c.equals(4)) {
                o = a.b(AbstractAction_g.z[8]);
            } else if (c.equals(5)) {
                o = a.b(AbstractAction_g.z[5]);
            } else if (c.equals(6)) {
                o = a.b(AbstractAction_g.z[3]);
            } else if (c.equals(7)) {
                o = a.b(AbstractAction_g.z[4]);
            }
        } else if (c.equals(7)) {
            o = a.b(AbstractAction_g.z[0]);
        } else if (c.equals(9)) {
            o = a.b(AbstractAction_g.z[9]);
        } else if (c.equals(12)) {
            o = a.b(AbstractAction_g.z[1]);
        } else if (c.equals(15)) {
            o = a.b(AbstractAction_g.z[6]);
        }
        this.putValue(AbstractAction_g.z[2], o);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        try {
            if (this.a.a().a(3, this.b, this.c) == 0) {
                return;
            }
        } catch (IOException ex) {
            this.a.b().a(AbstractAction_g.z[10] + ex.getMessage());
        }
        this.a.a(this.a.b(AbstractAction_g.z[11]));
    }

}
