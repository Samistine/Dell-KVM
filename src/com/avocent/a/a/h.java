// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.a.a;

import java.awt.event.WindowListener;
import javax.swing.JDialog;
import java.awt.Component;
import java.awt.Frame;
import com.avocent.a.a.b.c;
import com.avocent.a.d;
import com.avocent.a.e;
import com.avocent.a.f;

public class h extends f {

    protected i o;
    public WindowAdpater_g p;
    private static final String[] z = {" Startup canceled.", "ProgressDialogController"};

    public h(final i o) {
        super(z[1], o); //Sam
        this.p = new WindowAdpater_g(this);
        this.o = o;
    }

    @Override
    public d d() {
        return this.o.d();
    }

    @Override
    public void g() {
        if (this.component_b == null) {
            this.setComponent_b((Component) new c(this, this.o.c()));
            ((JDialog) this.component_b).addWindowListener(this.p);
        }
        if (!this.component_b.isVisible()) {
            ((JDialog) this.component_b).setLocationRelativeTo(this.o.c());
            this.component_b.setVisible(true);
        }
        ((JDialog) this.component_b).toFront();
    }

    public void m() {
        this.component_b.setVisible(false);
        this.component_b = null;
    }

    @Override
    public void j() {
        this.o.b().a(z[0]);//Sam
        System.exit(0);
    }
}
