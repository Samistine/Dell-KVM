// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.a;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import com.avocent.kvm.b.f.b;
import java.util.HashMap;
import java.beans.PropertyChangeSupport;
import java.awt.Component;

public class e {

    /*protected String a;*/
    protected Component component_b;//Originally named b
    protected PropertyChangeSupport c;//Originally named c
    protected HashMap hashmap_d;//Originally named d
    protected HashMap hashmap_e;//Originally named e
    protected e f;//Originally named f
    protected com.avocent.kvm.b.f.e g;//Originally named g
    protected d h;//Originally named h
    public static int i;//Originally named i
    static String[] z = {">>", "<<"};

    public e(/*final String a,*/final e f) {
        this.c = new PropertyChangeSupport(this);
        this.hashmap_d = new HashMap();
        this.hashmap_e = new HashMap();
        this.g = com.avocent.kvm.b.f.b.a();
        /*this.a = a;*/
        this.f = f;
        if (f != null) {
            f.a(new h(this));
        }
    }

    public d d() {
        if (this.h != null) {
            return this.h;
        }
        if (this.f != null) {
            return this.f.d();
        }
        return null;
    }

    public String b(final String s) {
        return (this.d() != null) ? com.avocent.a.d.b(s) : (com.avocent.a.e.z[1] + s + com.avocent.a.e.z[0]);
    }

    protected void a(PropertyChangeEvent propertyChangeEvent) {
        if (this.hashmap_e.get(propertyChangeEvent.getPropertyName()) == null) {
            this.c.firePropertyChange(propertyChangeEvent);
        }
    }

    public void a(PropertyChangeListener propertyChangeListener) {
        this.c.addPropertyChangeListener(propertyChangeListener);
    }

    protected void setComponent_b(Component b) {
        this.component_b = b;
    }

    public Component getComponent_b() {
        return this.component_b;
    }

    public void a(final String s, final Object o) {
        if (this.f != null) {
            this.f.a(s, o);
            if (com.avocent.a.e.i == 0) {
                return;
            }
        }
        this.c.firePropertyChange(s, this.hashmap_d.put(s, o), o);
    }

    public Object c(final String s) {
        Object o = this.d(s);
        if (o == null) {
            o = this.hashmap_d.get(s);
        }
        if (o != null) {
            return o;
        }
        if (this.f != null) {
            return this.f.c(s);
        }
        return null;
    }

    public Object b(final String s, final Object o) {
        final Object c = this.c(s);
        Object o2 = o;
        if (c == null) {
            if (o == null) {
                return o2;
            }
            this.a(s, o);
            if (com.avocent.a.e.i == 0) {
                return o2;
            }
        }
        o2 = c;
        return o2;
    }

    public Object d(String s) {
        return this.hashmap_e.get(s);
    }

    public String e(String s) {
        final Object c = this.c(s);
        return (c != null) ? c.toString() : null;
    }

    public String a(final String s, final String s2) {
        final Object c = this.c(s);
        return (c != null) ? c.toString() : s2;
    }

    public Integer a(final String s, final Integer n) {
        final int i = com.avocent.a.e.i;
        final Object c = this.c(s);
        Integer n2 = n;
        if (c == null) {
            if (n == null) {
                return n2;
            }
            this.a(s, (Object) n);
            if (i == 0) {
                return n2;
            }
        }
        if (c instanceof Integer) {
            n2 = (Integer) c;
            if (i == 0) {
                return n2;
            }
        }
        n2 = new Integer(c.toString().trim());
        return n2;
    }

    public Boolean a(final String s, final Boolean b) {
        final int i = com.avocent.a.e.i;
        final Object c = this.c(s);
        Boolean b2 = b;
        if (c == null) {
            this.a(s, (Object) b);
            if (i == 0) {
                return b2;
            }
        }
        if (c instanceof Boolean) {
            b2 = (Boolean) c;
            if (i == 0) {
                return b2;
            }
        }
        final String trim = c.toString().trim();
        if (trim.compareTo("0") == 0) {
            b2 = Boolean.FALSE;
            if (i == 0) {
                return b2;
            }
        }
        if (trim.compareTo("1") == 0) {
            b2 = Boolean.TRUE;
            if (i == 0) {
                return b2;
            }
        }
        b2 = new Boolean(trim);
        return b2;
    }

    public com.avocent.kvm.b.f.e b() {
        return this.g;
    }

    public void a(final com.avocent.kvm.b.f.e g) {
        this.g = g;
    }

}
