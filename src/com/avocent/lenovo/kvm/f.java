// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.lenovo.kvm;

import com.avocent.a.a.m;
import com.avocent.kvm.b.bb;
import java.awt.Component;
import com.avocent.a.a.b.JFrameD;
import javax.swing.JMenuBar;
import com.avocent.a.a.b.e;
import javax.swing.JFrame;
import com.avocent.kvm.b.e.a;
import com.avocent.a.a.e.q;
import com.avocent.a.a.e.k;
import com.avocent.a.a.i;
import com.avocent.kvm.b.x;
import com.avocent.kvm.nativekeyboard.g;
import com.avocent.kvm.b.r;
import com.avocent.kvm.b.f.b;
import com.avocent.kvm.b.qb;
import com.avocent.kvm.b.pb;
import com.avocent.kvm.b.ob;
import com.avocent.kvm.b.hb;
import com.avocent.a.a.s;

public class f implements s {

    private static final String[] z = {"playurl"," Video panel type: ","accel","doublebuff","videoPanelType"," Failed to load native keyboard library."};

    @Override
    public hb a(final String s) {
        final boolean cb = c.cb;
        final String property = System.getProperty(f.z[4]);
        ob ob = null;
        Label_0097:
        {
            if (property == null) {
                ob = new ob(s);
                if (!cb) {
                    break Label_0097;
                }
            }
            if (property.equalsIgnoreCase(f.z[2])) {
                ob = new pb(s);
                if (!cb) {
                    break Label_0097;
                }
            }
            if (property != null && property.equalsIgnoreCase(f.z[3])) {
                ob = new qb(s);
                if (!cb) {
                    break Label_0097;
                }
            }
            ob = new ob(s);
        }
        b.a().a(f.z[1] + ob.getClass().getName());
        return ob;
    }

    @Override
    public r a(final Object o) {
        try {
            return new g();
        } catch (UnsatisfiedLinkError unsatisfiedLinkError) {
            System.out.println(f.z[5]);
            return new x();
        }
    }

    @Override
    public com.avocent.a.f a(final i i) {
        final com.avocent.a.a.e.c c = new com.avocent.a.a.e.c(i);
        c.a((k) new com.avocent.a.a.e.s(i));
        c.a((k) new q(i, false));
        c.a((k) new com.avocent.a.a.e.r(i));
        return c;
    }

    @Override
    public JFrame b(final i i) {
        final e e = new e(i);
        e.setJMenuBar(new n(i, i.q(), false));
        return e;
    }

    @Override
    public JFrame c(final i i) {
        final JFrameD d = new JFrameD(i);
        d.setJMenuBar(new n(i, i.q(), true));
        return d;
    }

    @Override
    public bb a(final i i, final Component component) {
        if (i.b(f.z[0], null) != null) {
            return new bb();
        }
        return new com.avocent.kvm.nativekeyboard.c(i, component);
    }

    @Override
    public m a() {
        return new com.avocent.lenovo.kvm.d(this);
    }
}
