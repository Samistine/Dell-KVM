package com.avocent.kvm.a.a;

import java.io.IOException;

public class ab extends y
{
    int j;
    int k;
    private static final String[] z;
    
    public ab() {
        super(33281);
    }
    
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
    
    public byte[] a() {
        throw new RuntimeException(ab.z[1]);
    }
    
    public byte[] b() {
        throw new RuntimeException(ab.z[1]);
    }
    
    public String e() {
        return ab.z[0];
    }
    
    static {
        final String[] z2 = new String[2];
        final int n = 0;
        final char[] charArray = "\r\\@h\u0019(L\u0013J\u0010:Z_m\u0001 Z]8',FCw\u001b:P".toCharArray();
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
                            c2 = 'I';
                            break;
                        }
                        case 1: {
                            c2 = '5';
                            break;
                        }
                        case 2: {
                            c2 = '3';
                            break;
                        }
                        case 3: {
                            c2 = '\u0018';
                            break;
                        }
                        default: {
                            c2 = 'u';
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
        final char[] charArray2 = "\u0007ZG8\u001c$E_}\u0018,[G}\u0011".toCharArray();
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
                            c4 = 'I';
                            break;
                        }
                        case 1: {
                            c4 = '5';
                            break;
                        }
                        case 2: {
                            c4 = '3';
                            break;
                        }
                        case 3: {
                            c4 = '\u0018';
                            break;
                        }
                        default: {
                            c4 = 'u';
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
