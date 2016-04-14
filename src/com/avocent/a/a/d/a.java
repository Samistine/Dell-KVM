// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.a.a.d;

import com.avocent.a.a.j;
import javax.swing.Action;
import com.avocent.a.a.c.d;
import javax.swing.KeyStroke;
import java.awt.Component;
import com.avocent.a.a.c.b;
import javax.swing.JSeparator;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import com.avocent.a.a.i;
import javax.swing.JMenuBar;

public class a extends JMenuBar {

    protected i a;
    protected JMenu b;
    protected JMenu c;
    protected JMenu d;
    protected JMenu e;
    protected JMenu f;
    protected JMenuItem g;
    protected JMenuItem h;
    protected JSeparator i;
    protected JMenuItem j;
    protected JMenuItem k;
    protected JMenuItem l;
    protected JMenuItem m;
    protected JMenuItem n;
    protected JMenuItem o;
    protected JMenuItem p;
    protected b q;
    protected boolean r;
    public static int s;
    private static final String[] z = {"F10", "MainMenu_Help_About", "MainMenu_Tools", "MainMenu_View_Refresh", "MainMenu_Macros", "Item", "MainMenu_View_FullScreen", "MainMenu_File_Exit", "MainMenu_File", "MainMenu_View", "MainMenu_Help", "MainMenu_Tools_SessionOptions", "MainMenu_File_CaptureToFile", "MainMenu_Help_ContentsAndIndex"};

    public a(final i a, final b q, final boolean r) {
        int s = com.avocent.a.a.d.a.s;
        this.b = new JMenu();
        this.c = new JMenu();
        this.d = new JMenu();
        this.e = new JMenu();
        this.f = new JMenu();
        this.g = new JMenuItem();
        this.h = new JMenuItem();
        this.i = new JSeparator();
        this.j = new JMenuItem();
        this.k = new JMenuItem();
        this.l = new JMenuItem();
        this.m = new JMenuItem();
        this.n = new JMenuItem();
        this.o = new JMenuItem();
        this.p = new JMenuItem();
        this.a = a;
        this.q = q;
        this.r = r;
        this.a();
        if (com.avocent.kvm.b.d.a.c != 0) {
            com.avocent.a.a.d.a.s = ++s;
        }
    }

    protected void a() {
        final int s = com.avocent.a.a.d.a.s;
        this.b.setText(this.a.b(com.avocent.a.a.d.a.z[8]));
        this.h.setText(this.a.b(com.avocent.a.a.d.a.z[12]));
        this.b.add(this.h);
        this.b.add(this.i);
        this.j.setText(this.a.b(com.avocent.a.a.d.a.z[7]));
        this.b.add(this.j);
        this.c.setText(this.a.b(com.avocent.a.a.d.a.z[9]));
        this.k.setText(this.a.b(com.avocent.a.a.d.a.z[3]));
        this.c.add(this.k);
        this.l.setText(this.a.b(com.avocent.a.a.d.a.z[6]));
        this.c.add(this.l);
        this.m.setText(com.avocent.a.a.d.a.z[5]);
        this.c.add(this.m);
        this.d.setText(this.a.b(com.avocent.a.a.d.a.z[4]));
        this.e.setText(this.a.b(com.avocent.a.a.d.a.z[2]));
        this.n.setText(this.a.b(com.avocent.a.a.d.a.z[11]));
        this.e.add(this.n);
        this.f.setText(this.a.b(com.avocent.a.a.d.a.z[10]));
        this.p.setText(this.a.b(com.avocent.a.a.d.a.z[13]));
        this.f.add(this.p);
        this.o.setText(this.a.b(com.avocent.a.a.d.a.z[1]));
        this.f.add(this.o);
        this.c();
        this.b();
        this.add(this.b);
        this.add(this.c);
        this.add(this.d);
        this.add(this.e);
        this.add(this.f);
        this.getActionMap().getParent().remove(this.getInputMap(2).get(KeyStroke.getKeyStroke(com.avocent.a.a.d.a.z[0])));
        if (s != 0) {
            int c = com.avocent.kvm.b.d.a.c;
            com.avocent.kvm.b.d.a.c = ++c;
        }
    }

    protected void b() {
        final int s = com.avocent.a.a.d.a.s;
        int i = 0;
        while (i < this.q.d()) {
            this.d.add(new JMenuItem(new d(this.q, this.q.a(i))));
            ++i;
            if (s != 0) {
                break;
            }
        }
    }

    protected void c() {
        final j k = this.a.k();
        this.j.setAction(k.g());
        this.g.setAction(k.b());
        this.h.setAction(k.a());
        this.k.setAction(k.c());
        this.l.setAction(this.r ? k.e() : k.d());
        this.m.setAction(k.f());
        this.n.setAction(k.h());
        this.o.setAction(k.i());
        this.p.setAction(k.j());
    }

    public JMenu d() {
        return this.d;
    }
}
