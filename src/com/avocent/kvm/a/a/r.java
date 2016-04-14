// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.kvm.a.a;

public class r extends o {

    protected int l;
    private static final String z = "VideoStopped";

    public r(final int n) {
        super(n, r.z, (byte) 0);
    }

    @Override
    public void a(final byte[] array, final byte[] array2) {
        this.l = (array2[0] & 0xFF);
    }

    public int h() {
        return this.l;
    }

}
length = (n2 = n3);
                do {
                    final char c = charArray[n2];
                    char c2 = '\0';
                    switch (n3 % 5) {
                        case 0: {
                            c2 = '&';
                            break;
                        }
                        case 1: {
                            c2 = ';';
                            break;
                        }
                        case 2: {
                            c2 = '\"';
                            break;
                        }
                        case 3: {
                            c2 = 'Q';
                            break;
                        }
                        default: {
                            c2 = 'K';
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
