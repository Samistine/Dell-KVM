// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.kvm.a.a;

import com.avocent.kvm.b.d.a;

public class s extends h {

    protected int j;
    protected String k;
    protected String l;
    private static final String z;

    public s(final int j, final String k) {
        super(800);
        this.j = 0;
        this.j = j;
        this.k = k;
        this.e = 12 + this.k.length();
    }

    @Override
    public void a(final byte[] array, final byte[] array2) {
    }

    @Override
    public String e() {
        return this.l + "(" + this.k + ")";
    }

    @Override
    public byte[] b() {
        final byte[] array = new byte[4 + this.k.length()];
        com.avocent.kvm.b.d.a.a(this.j, array, 0);
        com.avocent.kvm.b.d.a.a(this.k.length(), array, 2);
        com.avocent.kvm.b.d.a.a(this.k, array, 4, this.k.length());
        System.out.println(s.z);
        return array;
    }

    static {
        final char[] charArray = "g\u000fe\u001e4UJ-\u001a4UD".toCharArray();
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
                            c2 = '0';
                            break;
                        }
                        case 1: {
                            c2 = 'j';
                            break;
                        }
                        case 2: {
                            c2 = 'E';
                            break;
                        }
                        case 3: {
                            c2 = '\u007f';
                            break;
                        }
                        default: {
                            c2 = 'F';
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
