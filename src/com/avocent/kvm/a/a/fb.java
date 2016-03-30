package com.avocent.kvm.a.a;

public class fb extends y
{
    int j;
    private static final String[] z;
    
    public fb() {
        super(33025);
    }
    
    public void a(final byte[] array, final byte[] array2) {
        this.j = (byte)(array2[0] & 0xFF);
    }
    
    public int h() {
        return this.j;
    }
    
    public byte[] a() {
        throw new RuntimeException(fb.z[1]);
    }
    
    public byte[] b() {
        throw new RuntimeException(fb.z[1]);
    }
    
    public String e() {
        return fb.z[0];
    }
    
    static {
        final String[] z2 = new String[2];
        final int n = 0;
        final char[] charArray = "SBM|F_NSaLiA]kD{\u007f]|SqCKj".toCharArray();
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
                            c2 = '\u001e';
                            break;
                        }
                        case 1: {
                            c2 = '-';
                            break;
                        }
                        case 2: {
                            c2 = '8';
                            break;
                        }
                        case 3: {
                            c2 = '\u000f';
                            break;
                        }
                        default: {
                            c2 = '#';
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
        final char[] charArray2 = "PBL/Js]TjN{CLjG".toCharArray();
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
                            c4 = '\u001e';
                            break;
                        }
                        case 1: {
                            c4 = '-';
                            break;
                        }
                        case 2: {
                            c4 = '8';
                            break;
                        }
                        case 3: {
                            c4 = '\u000f';
                            break;
                        }
                        default: {
                            c4 = '#';
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
