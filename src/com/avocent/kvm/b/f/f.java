// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.kvm.b.f;

import java.util.Date;
import java.util.Locale;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.io.PrintStream;

public class f implements e {

    protected static f a;
    protected PrintStream b;
    protected boolean c;
    protected boolean d;
    protected SimpleDateFormat e;
    private static final String[] z = {"MM/dd/yyyy hh:mm:ss:SSS",": "};

    public f() {
        this.c = true;
        this.d = false;
        this.b = null;
        this.d = false;
    }

    public f(final OutputStream outputStream) {
        this.c = true;
        this.d = false;
        if (outputStream == null) {
            this.b = null;
        }
    }

    @Override
    public void a(final boolean c) {
        this.c = c;
    }

    @Override
    public boolean a() {
        return this.d;
    }

    public String b() {
        if (this.e == null) {
            this.e = new SimpleDateFormat(f.z[0], Locale.getDefault());
        }
        return this.e.format(new Date());
    }

    @Override
    public void a(final String s, final String s2) {
        this.a(s + f.z[1] + s2);
    }

    @Override
    public void a(final String s) {
        final String string = this.b() + f.z[1] + s;
        if (this.b != null) {
            this.b.println(string);
        }
        if (this.c) {
            System.out.println(string);
        }
    }

    public static f c() {
        if (f.a == null) {
            f.a = new f(System.out);
        }
        return f.a;
    }

    @Override
    public void b(final boolean d) {
        this.d = d;
    }

    }
