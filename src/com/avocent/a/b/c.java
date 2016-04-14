// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.a.b;

import java.awt.event.ActionEvent;
import com.avocent.a.a.i;
import javax.swing.AbstractAction;

public class c extends AbstractAction {

    i a;
    protected a b;
    private static final String z = "MenuItem_StatsDialog";

    public c(final i a) {
        super(a.b(c.z));
        this.a = a;
    }

    @Override
    public void actionPerformed(final ActionEvent actionEvent) {
        if (this.b == null) {
            this.b = new a(this.a);
        }
        this.b.c();
    }
}
