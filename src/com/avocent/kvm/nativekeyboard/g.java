// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.kvm.nativekeyboard;

import com.avocent.kvm.b.f.e;
import java.awt.Component;
import com.avocent.kvm.b.hb;
import java.awt.event.FocusListener;
import com.avocent.kvm.b.u;
import java.util.HashMap;
import com.avocent.kvm.b.r;

public class g implements r {

    protected boolean a;
    protected HashMap<Component, Boolean> b;
    protected u c;
    protected NativeKeyEventListener d;
    protected FocusListener e;
    private static final String[] z = {" setPassthroughEnabled(", "====NativeKeyboard, register OK", "avctKVMIO", "jawt"};

    public g() {
        this.a = true;
        this.b = new HashMap();
        this.d = new i(this);
        this.e = new h(this);
        this.b();
    }

    public void b() throws UnsatisfiedLinkError {
        System.loadLibrary(g.z[3]);
        System.loadLibrary(g.z[2]);
    }

    public boolean a(final Object o) {
        final Boolean value = this.b.get(o);
        return value != null && value;
    }

    @Override
    public void a(final boolean a) {
        this.a = a;
    }

    @Override
    public void a(final hb hb, final boolean b) {
        try {
            System.out.println(g.z[0] + b + ")");
            this.b.put(hb.c(), b);
            final Component c = hb.c();
            if (c.isVisible() && c.isDisplayable()) {
                NativeKVM.a(c, b);
            }
        } catch (Exception ex) {
            throw new RuntimeException(ex.getMessage(), ex);
        }
    }

    @Override
    public void a(final u c) {
        this.c = c;
    }

    @Override
    public void a(final hb hb, final e e) {
        if (hb != null) {
            try {
                NativeKVM.a(hb.c(), this.d, hb.getName(), e);
                hb.c().setFocusable(true);
                hb.c().addFocusListener(this.e);
                System.out.println(g.z[1]);
            } catch (Exception ex) {
                throw new RuntimeException(ex.getMessage(), ex);
            }
        }
    }

    @Override
    public void a(final u u, final hb hb) {
        this.a(u);
        this.a(hb, u.i());
    }

    @Override
    public void a() {
    }

}
