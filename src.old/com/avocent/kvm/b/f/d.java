// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.kvm.b.f;

public class d implements e {

    f a;
    protected boolean b;
    private static final String z;

    public d() {
        this.b = false;
        this.a = f.c();
    }

    @Override
    public void a(final boolean b) {
        if (this.a != null) {
            this.a.a(b);
        }
    }

    @Override
    public boolean a() {
        return this.b;
    }

    @Override
    public void a(final String s) {
        if (this.b) {
            this.a.a(s);
        }
    }

    @Override
    public void a(final String s, final String s2) {
        if (this.b) {
            this.a.a(s + d.z + s2);
        }
    }

    @Override
    public void b(final boolean b) {
        this.b = b;
    }

    static {
        final char[] charArray = "SR".toCharArray();
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
                            c2 = 'i';
                            break;
                        }
                        case 1: {
                            c2 = 'r';
                            break;
                        }
                        case 2: {
                            c2 = '\u001e';
                            break;
                        }
                        case 3: {
                            c2 = 'z';
                            break;
                        }
                        default: {
                            c2 = '<';
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
