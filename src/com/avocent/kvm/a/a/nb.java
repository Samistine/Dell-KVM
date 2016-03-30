package com.avocent.kvm.a.a;

import com.avocent.kvm.b.d.a;

public class nb extends y
{
    protected int j;
    protected int k;
    protected int l;
    protected int m;
    protected int n;
    protected int o;
    protected int p;
    protected int q;
    protected int r;
    protected int s;
    private static final String z;
    
    public nb() {
        super(33282);
        this.e = 32;
    }
    
    public void a(final byte[] array, final byte[] array2) {
        this.j = a.b(array2, 0);
        this.k = a.b(array2, 2);
        this.l = a.b(array2, 4);
        this.m = a.b(array2, 6);
        this.n = a.b(array2, 8);
        this.o = a.b(array2, 10);
        this.p = a.b(array2, 12);
        this.q = a.b(array2, 14);
        this.r = a.b(array2, 16);
        this.s = a.b(array2, 18);
    }
    
    public byte[] b() {
        final byte[] array = new byte[24];
        a.a(this.j, array, 0);
        a.a(this.k, array, 2);
        a.a(this.l, array, 0);
        a.a(this.m, array, 6);
        a.a(this.n, array, 8);
        a.a(this.o, array, 10);
        a.a(this.p, array, 12);
        a.a(this.q, array, 14);
        a.a(this.r, array, 16);
        a.a(this.s, array, 18);
        return array;
    }
    
    public String e() {
        return nb.z;
    }
    
    public int h() {
        return this.j;
    }
    
    public int i() {
        return this.k;
    }
    
    public int j() {
        return this.l;
    }
    
    public int k() {
        return this.m;
    }
    
    public int l() {
        return this.o;
    }
    
    public int m() {
        return this.s;
    }
    
    static {
        final char[] charArray = "\u0019nP\u0017O\u001cb@\u0007P\u000bf@\u0013".toCharArray();
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
                            c2 = 'O';
                            break;
                        }
                        case 1: {
                            c2 = '\u0007';
                            break;
                        }
                        case 2: {
                            c2 = '4';
                            break;
                        }
                        case 3: {
                            c2 = 'r';
                            break;
                        }
                        default: {
                            c2 = ' ';
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
