// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.kvm.a.a;

public class ib extends y {

    private static final String[] z;

    public ib(final int n) {
        super(n);
    }

    @Override
    public void a(final byte[] array, final byte[] array2) {
    }

    @Override
    public byte[] a() {
        throw new RuntimeException(ib.z[1]);
    }

    @Override
    public byte[] b() {
        throw new RuntimeException(ib.z[1]);
    }

    @Override
    public String e() {
        return ib.z[0];
    }

    static {
        final String[] z2 = new String[2];
        final int n = 0;
        final char[] charArray = "_I\u001d\u000b,{I\n".toCharArray();
        int length;
        int n3;
        final int n2 = n3 = (length = charArray.length);
        int n4 = 0;
        while (true) {
            Label_0098:
            {
                if (n2 > 1) {
                    break Label_0098;
                }
                length = (n3 = n4);
                do {
                    final char c = charArray[n3];
                    char c2 = '\0';
                    switch (n4 % 5) {
                        case 0: {
                            c2 = '\r';
                            break;
                        }
                        case 1: {
                            c2 = ',';
                            break;
                        }
                        case 2: {
                            c2 = 'n';
                            break;
                        }
                        case 3: {
                            c2 = 'n';
                            break;
                        }
                        default: {
                            c2 = '^';
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
        final char[] charArray2 = "CC\u001aN7`\\\u0002\u000b3hB\u001a\u000b:".toCharArray();
        int length2;
        int n7;
        final int n6 = n7 = (length2 = charArray2.length);
        int n8 = 0;
        while (true) {
            Label_0214:
            {
                if (n6 > 1) {
                    break Label_0214;
                }
                length2 = (n7 = n8);
                do {
                    final char c3 = charArray2[n7];
                    char c4 = '\0';
                    switch (n8 % 5) {
                        case 0: {
                            c4 = '\r';
                            break;
                        }
                        case 1: {
                            c4 = ',';
                            break;
                        }
                        case 2: {
                            c4 = 'n';
                            break;
                        }
                        case 3: {
                            c4 = 'n';
                            break;
                        }
                        default: {
                            c4 = '^';
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
