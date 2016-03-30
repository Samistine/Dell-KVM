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
    private static final String[] z;

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

    static {
        final String[] z2 = new String[2];
        final int n = 0;
        final char[] charArray = "Ot\u001ck7-@Jv*\"Q[5>o\u0003@|iQj`".toCharArray();
        int length;
        int n3;
        final int n2 = n3 = (length = charArray.length);
        int n4 = 0;
        while (true) {
            Label_0097:
            {
                if (n2 > 1) {
                    break Label_0097;
                }
                length = (n3 = n4);
                do {
                    final char c = charArray[n3];
                    char c2 = '\0';
                    switch (n4 % 5) {
                        case 0: {
                            c2 = '\u0002';
                            break;
                        }
                        case 1: {
                            c2 = '9';
                            break;
                        }
                        case 2: {
                            c2 = '3';
                            break;
                        }
                        case 3: {
                            c2 = '\u000f';
                            break;
                        }
                        default: {
                            c2 = 'S';
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
        final char[] charArray2 = "8\u0019".toCharArray();
        int length2;
        int n7;
        final int n6 = n7 = (length2 = charArray2.length);
        int n8 = 0;
        while (true) {
            Label_0213:
            {
                if (n6 > 1) {
                    break Label_0213;
                }
                length2 = (n7 = n8);
                do {
                    final char c3 = charArray2[n7];
                    char c4 = '\0';
                    switch (n8 % 5) {
                        case 0: {
                            c4 = '\u0002';
                            break;
                        }
                        case 1: {
                            c4 = '9';
                            break;
                        }
                        case 2: {
                            c4 = '3';
                            break;
                        }
                        case 3: {
                            c4 = '\u000f';
                            break;
                        }
                        default: {
                            c4 = 'S';
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
