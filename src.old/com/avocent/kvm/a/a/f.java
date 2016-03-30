// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.kvm.a.a;

import java.io.IOException;

public class f extends b {

    private static final String z;

    public f() {
        super(516);
        this.e = 16;
    }

    @Override
    public byte[] b() {
        return new byte[8];
    }

    @Override
    public void a(final byte[] array, final byte[] array2) throws IOException {
    }

    @Override
    public String e() {
        return f.z;
    }

    static {
        final char[] charArray = "\"`2-`\bw/oC,Ak\u001dj\u0018p.<{".toCharArray();
        int length;
        int n2;
        final int n = n2 = (length = charArray.length);
        int n3 = 0;
        while (true) {
            Label_0093:
            {
                if (n > 1) {
                    break Label_0093;
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
                            c2 = '\u0005';
                            break;
                        }
                        case 2: {
                            c2 = 'K';
                            break;
                        }
                        case 3: {
                            c2 = 'O';
                            break;
                        }
                        default: {
                            c2 = '\u000f';
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
