package com.avocent.kvm.b;

import java.awt.event.KeyListener;
import com.avocent.kvm.b.f.e;
import com.avocent.kvm.b.a.a;
import java.awt.event.FocusListener;
import com.avocent.kvm.b.c.c;
import java.awt.Component;

public class x implements r
{
    protected boolean a;
    protected boolean b;
    protected u c;
    protected z d;
    protected Component e;
    protected c f;
    protected ab g;
    protected FocusListener h;
    protected int i;
    
    public x() {
        super();
        this.a = true;
        this.b = false;
        this.i = 0;
        this.d = new z(this);
        this.g = new ab(this);
        this.h = new y(this);
    }
    
    public void a(final boolean a) {
        this.a = a;
    }
    
    public void a(final hb hb, final boolean b) {
        this.b = b;
    }
    
    public void a(final u c) {
        if (this.c != null) {
            this.c.b(this.g);
        }
        (this.c = c).a(this.g);
    }
    
    public void a(final hb hb, final e e) {
        if (hb != null) {
            (this.e = hb.c()).addKeyListener(this.d);
            this.e.addFocusListener(this.h);
            this.f = new c(this.e);
        }
    }
    
    public void a() {
        this.e.removeKeyListener(this.d);
        this.e.removeFocusListener(this.h);
    }
    
    public void a(final u u, final hb hb) {
        this.a(u);
        this.a(hb, u.i());
    }
}
