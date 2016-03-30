// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.kvm.b;

import com.avocent.kvm.b.d.c;

public class gb implements c {

    protected int a;
    protected byte[] b;
    protected int c;
    protected byte[] d;
    protected int e;
    protected int f;
    protected byte[] g;
    protected int h;
    protected int i;
    protected boolean j;
    protected boolean k;
    protected boolean l;
    private static final String z;

    public gb(final int a) {
        this.g = new byte[8196];
        this.l = false;
        this.a = a;
    }

    public void a(final int a) {
        this.a = a;
    }

    @Override
    public int d() {
        return this.a;
    }

    @Override
    public void a(final byte[] array, final byte[] array2) {
        this.a(array, array.length);
        this.a(array2, 0, array2.length);
    }

    @Override
    public void a(final byte[] array, final byte[] array2, final int n) {
        this.a(array, array.length);
        this.a(array2, 0, n);
    }

    public void a(final byte[] array, int c) {
        if (c == 0) {
            c = 64;
        }
        if (this.b == null || this.b.length < c) {
            this.b = new byte[c];
        }
        System.arraycopy(array, 0, this.b, 0, c);
        this.c = c;
    }

    public void a(final byte[] array, final int n, final int e) {
        if (this.d == null || this.d.length < e) {
            this.d = new byte[e];
        }
        System.arraycopy(array, n, this.d, 0, e);
        this.e = e;
    }

    public int g() {
        return this.e;
    }

    @Override
    public byte[] b() {
        return this.d;
    }

    @Override
    public byte[] a() {
        return this.b;
    }

    public void b(final boolean j) {
        this.j = j;
    }

    public void c(final boolean k) {
        this.k = k;
    }

    public int h() {
        return this.i;
    }

    public int i() {
        return this.h;
    }

    public boolean j() {
        return this.j;
    }

    public boolean k() {
        return this.k;
    }

    @Override
    public String e() {
        return gb.z;
    }

    public int b(final byte[] array, final int n) {
        return (array[n] & 0xFF) << 8 | (array[n + 1] & 0xFF);
    }

    @Override
    public void a(final boolean b) {
        this.l = true;
    }

    @Override
    public boolean c() {
        return this.l;
    }

    @Override
    public int f() {
        return this.c + this.f;
    }

    static {
        final char[] charArray = "m6\r|~k>\nrtO".toCharArray();
        int length;
        int n2;
        final int n = n2 = (length = charArray.length);
        int n3 = 0;
        while (true) {
            Label_0094:
            {
                if (n > 1) {
                    break Label_0094;
                }
                length = (n2 = n3);
                do {
                    final char c = charArray[n2];
                    char c2 = '\0';
                    switch (n3 % 5) {
                        case 0: {
                            c2 = ';';
                            break;
                        }
                        case 1: {
                            c2 = '_';
                            break;
                        }
                        case 2: {
                            c2 = 'i';
                            break;
                        }
                        case 3: {
                            c2 = '\u0019';
                            break;
                        }
                        default: {
                            c2 = '\u0011';
                            break;
                        }
                    }
                    charArray[length] = (char) (c ^ c2);
                    ++n3;
                } while (n == 0);
            }
            if (n <= n3) {
                z = new String(charArray).intern();
                break;
            }
            continue;
        }
    }
}
