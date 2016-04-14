// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.kvm.a.a;

class gb extends y {

    private static final String[] z = {"Not implemented", "NoOpResponse"};

    gb() {
        super(65535);
    }

    @Override
    public void a(final byte[] array, final byte[] array2) {
    }

    @Override
    public byte[] a() {
        throw new RuntimeException(gb.z[0]);
    }

    @Override
    public byte[] b() {
        throw new RuntimeException(gb.z[0]);
    }

    @Override
    public String e() {
        return gb.z[1];
    }

    @Override
    public int f() {
        return 0;
    }

}
default: {
                            c2 = '&';
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
        final char[] charArray2 = "\u0017yTHt<ekWH*s".toCharArray();
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
                            c4 = 'Y';
                            break;
                        }
                        case 1: {
                            c4 = '\u0016';
                            break;
                        }
                        case 2: {
                            c4 = '\u001b';
                            break;
                        }
                        case 3: {
                            c4 = '8';
                            break;
                        }
                        default: {
                            c4 = '&';
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
