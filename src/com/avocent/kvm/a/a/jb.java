package com.avocent.kvm.a.a;

public class jb extends y
{
    private static final String[] z;
    
    public jb(final int n) {
        super(n);
    }
    
    public void a(final byte[] array, final byte[] array2) {
    }
    
    public byte[] a() {
        throw new RuntimeException(jb.z[1]);
    }
    
    public byte[] b() {
        throw new RuntimeException(jb.z[1]);
    }
    
    public String e() {
        return jb.z[0];
    }
    
    static {
        final String[] z2 = new String[2];
        final int n = 0;
        final char[] charArray = "\u0011\u001fqo\n,\u001b".toCharArray();
        int length;
        int n3;
        final int n2 = n3 = (length = charArray.length);
        int n4 = 0;
        while (true) {
            Label_0097: {
                if (n2 > 1) {
                    break Label_0097;
                }
                length = (n3 = n4);
                do {
                    final char c = charArray[n3];
                    char c2 = '\0';
                    switch (n4 % 5) {
                        case 0: {
                            c2 = 'B';
                            break;
                        }
                        case 1: {
                            c2 = '|';
                            break;
                        }
                        case 2: {
                            c2 = '\u0010';
                            break;
                        }
                        case 3: {
                            c2 = '\u0003';
                            break;
                        }
                        default: {
                            c2 = 'c';
                            break;
                        }
                    }
                    charArray[length] = (char)(c ^ c2);
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
        final char[] charArray2 = "\f\u0013d#\n/\f|f\u000e'\u0012df\u0007".toCharArray();
        int length2;
        int n7;
        final int n6 = n7 = (length2 = charArray2.length);
        int n8 = 0;
        while (true) {
            Label_0213: {
                if (n6 > 1) {
                    break Label_0213;
                }
                length2 = (n7 = n8);
                do {
                    final char c3 = charArray2[n7];
                    char c4 = '\0';
                    switch (n8 % 5) {
                        case 0: {
                            c4 = 'B';
                            break;
                        }
                        case 1: {
                            c4 = '|';
                            break;
                        }
                        case 2: {
                            c4 = '\u0010';
                            break;
                        }
                        case 3: {
                            c4 = '\u0003';
                            break;
                        }
                        default: {
                            c4 = 'c';
                            break;
                        }
                    }
                    charArray2[length2] = (char)(c3 ^ c4);
                    ++n8;
                } while (n6 == 0);
            }
            if (n6 <= n8) {
                z2[n5] = new String(charArray2).intern();
                z = z2;
                return;
            }
            continue;
        }
    }
}
