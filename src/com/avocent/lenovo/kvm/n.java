// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.lenovo.kvm;

import com.avocent.a.a.c.NamedArray;
import java.util.Iterator;
import javax.swing.Action;
import javax.swing.JMenuItem;
import com.avocent.a.a.c.d;
import javax.swing.JMenu;
import com.avocent.a.a.c.b;
import com.avocent.a.a.i;
import com.avocent.a.a.d.a;

public class n extends a {

    private static final String[] z = {"CTRL_ALTF_MACRO_GROUP", "MACRO_MENU_CTRLALTF", "MACRO_MENU_ALTF", "ALTF_MACRO_GROUP", "MAIN_MENU_POWER"};

    public n(final i i, final b b, final boolean b2) {
        super(i, b, b2);
    }

    @Override
    protected void b() {
        final boolean cb = com.avocent.lenovo.kvm.c.cb;
        super.b();
        final JMenu menu = new JMenu(this.a.b(z[2]));
        final JMenu menu2 = new JMenu(this.a.b(z[1]));
        final Iterator<NamedArray> a = this.q.a(z[3]);
        while (a != null && a.hasNext()) {
            menu.add(new JMenuItem(new d(this.q, a.next())));
            if (cb) {
                break;
            }
        }
        this.d().add(menu);
        final Iterator a2 = this.q.a(n.z[0]);
        while (a2 != null && a2.hasNext()) {
            menu2.add(new JMenuItem(new d(this.q, a2.next())));
            if (cb) {
                break;
            }
        }
        this.d().add(menu2);
        if (com.avocent.kvm.b.d.a.c != 0) {
            com.avocent.lenovo.kvm.c.cb = !cb;
        }
    }

    @Override
    protected void a() {
        super.a();
        final c c = (c) this.a;
        final JMenu menu = new JMenu(this.a.b(n.z[4]));
    }
}
