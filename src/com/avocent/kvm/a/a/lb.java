package com.avocent.kvm.a.a;

public class lb extends y
{
    private static final String[] z;
    
    public lb(final int n) {
        super(n);
    }
    
    public void a(final byte[] array, final byte[] array2) {
    }
    
    public byte[] a() {
        throw new RuntimeException(lb.z[1]);
    }
    
    public byte[] b() {
        throw new RuntimeException(lb.z[1]);
    }
    
    public String e() {
        return lb.z[0];
    }
    
    static {
        final String[] z2 = new String[2];
        final int n = 0;
        final char[] charArray = "7\u001bBEu2\u001aNA<\u000e\rCP0B8FE4\u000f\rSR'\u0011".toCharArray();
        int length;
        int n3;
        final int n2 = n3 = (length = charArray.length);
        int n4 = 0;
        while (true) {
            Label_0098: {
                if (n2 > 1) {
                    break Label_0098;
                }
                length = (n3 = n4);
                do {
                    final char c = charArray[n3];
                    char c2 = '\0';
                    switch (n4 % 5) {
                        case 0: {
                            c2 = 'b';
                            break;
                        }
                        case 1: {
                            c2 = 'h';
                            break;
                        }
                        case 2: {
                            c2 = '\'';
                            break;
                        }
                        case 3: {
                            c2 = '7';
                            break;
                        }
                        default: {
                            c2 = 'U';
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
        final char[] charArray2 = ",\u0007S\u0017<\u000f\u0018KR8\u0007\u0006SR1".toCharArray();
        int length2;
        int n7;
        final int n6 = n7 = (length2 = charArray2.length);
        int n8 = 0;
        while (true) {
            Label_0214: {
                if (n6 > 1) {
                    break Label_0214;
                }
                length2 = (n7 = n8);
                do {
                    final char c3 = charArray2[n7];
                    char c4 = '\0';
                    switch (n8 % 5) {
                        case 0: {
                            c4 = 'b';
                            break;
                        }
                        case 1: {
                            c4 = 'h';
                            break;
                        }
                        case 2: {
                            c4 = '\'';
                            break;
                        }
                        case 3: {
                            c4 = '7';
                            break;
                        }
                        default: {
                            c4 = 'U';
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
