// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.kvm.nativekeyboard;

class l extends Thread {

    final e a;
    private static final String[] z;

    l(final e a) {
        this.a = a;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(2000L);
        } catch (InterruptedException ex) {
        }
        this.setName(l.z[1]);
        NativeKVM.registerWindowById(this.a.d, this.a.b);
        System.out.println(l.z[0]);
    }

    static {
        final String[] z2 = new String[2];
        final int n = 0;
        final char[] charArray = "\u0015yL\u000e\u001a\u0017\u00180isp\u0004\u000fJ^P$*MIK6\bAH\u0016s\u0015P[M'6VU\\6\u0015WSQ4F\u000e\u0010\u0015y".toCharArray();
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
                            c2 = '?';
                            break;
                        }
                        case 1: {
                            c2 = 'S';
                            break;
                        }
                        case 2: {
                            c2 = 'f';
                            break;
                        }
                        case 3: {
                            c2 = '$';
                            break;
                        }
                        default: {
                            c2 = ':';
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
        final char[] charArray2 = "t\u0005+mu".toCharArray();
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
                            c4 = '?';
                            break;
                        }
                        case 1: {
                            c4 = 'S';
                            break;
                        }
                        case 2: {
                            c4 = 'f';
                            break;
                        }
                        case 3: {
                            c4 = '$';
                            break;
                        }
                        default: {
                            c4 = ':';
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
