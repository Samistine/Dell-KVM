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
    protected Component b;
    protected PropertyChangeSupport c;
    protected HashMap d;
    protected HashMap e;
    protected e f;
    protected com.avocent.kvm.b.f.e g;
    protected d h;
    public static int i;
    static String[] z;

    public e(/*final String a,*/ final e f) {
        this.c = new PropertyChangeSupport(this);
        this.d = new HashMap();
        this.e = new HashMap();
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

    protected void a(final PropertyChangeEvent propertyChangeEvent) {
        if (this.e.get(propertyChangeEvent.getPropertyName()) == null) {
            this.c.firePropertyChange(propertyChangeEvent);
        }
    }

    public void a(final PropertyChangeListener propertyChangeListener) {
        this.c.addPropertyChangeListener(propertyChangeListener);
    }

    protected void a(final Component b) {
        this.b = b;
    }

    public Component e() {
        return this.b;
    }

    public void a(final String s, final Object o) {
        if (this.f != null) {
            this.f.a(s, o);
            if (com.avocent.a.e.i == 0) {
                return;
            }
        }
        this.c.firePropertyChange(s, this.d.put(s, o), o);
    }

    public Object c(final String s) {
        Object o = this.d(s);
        if (o == null) {
            o = this.d.get(s);
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

    public Object d(final String s) {
        return this.e.get(s);
    }

    public String e(final String s) {
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

    static {
        final String[] z2 = new String[2];
        final int n = 0;
        final char[] charArray = ".O".toCharArray();
        int length;
        int n3;
        final int n2 = n3 = (length = charArray.length);
        int n4 = 0;
        while (true) {
            Label_0098:
            {
                if (n2 > 1) {
                    break Label_0098;
                }
                length = (n3 = n4);
                do {
                    final char c = charArray[n3];
                    char c2 = '\0';
                    switch (n4 % 5) {
                        case 0: {
                            c2 = '\u0010';
                            break;
                        }
                        case 1: {
                            c2 = 'q';
                            break;
                        }
                        case 2: {
                            c2 = '{';
                            break;
                        }
                        case 3: {
                            c2 = 'r';
                            break;
                        }
                        default: {
                            c2 = 'a';
                            break;
                        }
                    }
                    charArray[length] = (char) (c ^ c2);
                    ++n4;
                } while (n2 == 0);
            }
            if (n2 > n4) {
                continue;
            }
            break;
        }
        z2[n] = new String(charArray).intern();
        final int n5 = 1;
        final char[] charArray2 = ",M".toCharArray();
        int length2;
        int n7;
        final int n6 = n7 = (length2 = charArray2.length);
        int n8 = 0;
        while (true) {
            Label_0214:
            {
                if (n6 > 1) {
                    break Label_0214;
                }
                length2 = (n7 = n8);
                do {
                    final char c3 = charArray2[n7];
                    char c4 = '\0';
                    switch (n8 % 5) {
                        case 0: {
                            c4 = '\u0010';
                            break;
                        }
                        case 1: {
                            c4 = 'q';
                            break;
                        }
                        case 2: {
                            c4 = '{';
                            break;
                        }
                        case 3: {
                            c4 = 'r';
                            break;
                        }
                        default: {
                            c4 = 'a';
                            break;
                        }
                    }
                    charArray2[length2] = (char) (c3 ^ c4);
                    ++n8;
                } while (n6 == 0);
            }
            if (n6 <= n8) {
                z2[n5] = new String(charArray2).intern();
                z = z2;
                break;
            }
            continue;
        }
    }
}
