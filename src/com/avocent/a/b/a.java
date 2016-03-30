package com.avocent.a.b;

import java.awt.Component;
import com.avocent.a.j;
import java.awt.event.WindowListener;
import javax.swing.JDialog;
import com.avocent.kvm.b.e.a;
import javax.swing.Action;
import com.avocent.kvm.b.nb;
import com.avocent.a.k;
import com.avocent.kvm.b.u;
import com.avocent.a.e;

public class a extends e
{
    protected u j;
    protected k k;
    protected nb l;
    protected Action m;
    public static int n;
    private static final String z;
    
    public a(final a a) {
        super(a.z, (e)a);
        this.m = new d(this);
        this.j = a.a();
    }
    
    public a a() {
        return (a)this.f;
    }
    
    public void c() {
        final int n = a.n;
        if (this.b == null) {
            this.b = new e(this, false);
            ((JDialog)this.b).addWindowListener(new b(this));
        }
        if (this.k != null) {
            this.k.b();
        }
        this.k = new k(this.j, (j)this.b);
        this.l = this.k.a();
        ((e)this.b).a(this.l);
        this.k.start();
        this.b.setVisible(true);
        if (n != 0) {
            int c = com.avocent.kvm.b.d.a.c;
            com.avocent.kvm.b.d.a.c = ++c;
        }
    }
    
    static Component a(final a a) {
        return a.b;
    }
    
    static {
        final char[] charArray = "5~\u0017 -\"c\u001781\u0001I\u0019:*\u0014e\u001a8;\u0014".toCharArray();
        int length;
        int n2;
        final int n = n2 = (length = charArray.length);
        int n3 = 0;
        while (true) {
            Label_0094: {
                if (n > 1) {
                    break Label_0094;
                }
                length = (n2 = n3);
                do {
                    final char c = charArray[n2];
                    char c2 = '\0';
                    switch (n3 % 5) {
                        case 0: {
                            c2 = 'f';
                            break;
                        }
                        case 1: {
                            c2 = '\n';
                            break;
                        }
                        case 2: {
                            c2 = 'v';
                            break;
                        }
                        case 3: {
                            c2 = 'T';
                            break;
                        }
                        default: {
                            c2 = '^';
                            break;
                        }
                    }
                    charArray[length] = (char)(c ^ c2);
                    ++n3;
                } while (n == 0);
            }
            if (n <= n3) {
                z = new String(charArray).intern();
                return;
            }
            continue;
        }
    }
}
