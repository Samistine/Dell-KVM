// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.kvm.a.a;

import com.avocent.kvm.b.d.a;
import java.io.IOException;

public class bb extends y {

    int j;
    int k;
    private static final String z;

    public bb() {
        super(33280);
        this.e = 16;
    }

    @Override
    public void a(final byte[] array, final byte[] array2) throws IOException {
        this.j = ((array2[0] & 0xFF) << 8 | (array2[1] & 0xFF));
        this.k = ((array2[2] & 0xFF) << 8 | (array2[3] & 0xFF));
    }

    public int h() {
        return this.j;
    }

    public int i() {
        return this.k;
    }

    @Override
    public byte[] b() {
        final byte[] array = new byte[8];
        com.avocent.kvm.b.d.a.a(this.j, array, 0);
        com.avocent.kvm.b.d.a.a(this.k, array, 2);
        return array;
    }

    @Override
    public String e() {
        return bb.z;
    }

    static {
        final char[] charArray = "hiZ-W\u0001UO+LMr^1LO'x=PQhD+F".toCharArray();
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
                            c2 = '!';
                            break;
                        }
                        case 1: {
                            c2 = '\u0007';
                            break;
                        }
                        case 2: {
                            c2 = '*';
                            break;
                        }
                        case 3: {
                            c2 = 'X';
                            break;
                        }
                        default: {
                            c2 = '#';
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
