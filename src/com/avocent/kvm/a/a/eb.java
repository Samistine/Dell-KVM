package com.avocent.kvm.a.a;

public class eb extends y
{
    int j;
    private static final String[] z;
    
    public eb() {
        super(33026);
    }
    
    public void a(final byte[] array, final byte[] array2) {
        this.j = (byte)(array2[0] & 0xFF);
    }
    
    public int h() {
        return this.j;
    }
    
    public byte[] a() {
        throw new RuntimeException(eb.z[0]);
    }
    
    public byte[] b() {
        throw new RuntimeException(eb.z[0]);
    }
    
    public String e() {
        return eb.z[1];
    }
    
    static {
        final String[] z2 = new String[2];
        final int n = 0;
        final char[] charArray = "\u001f~XmF<a@(B4\u007fX(K".toCharArray();
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
                            c2 = 'Q';
                            break;
                        }
                        case 1: {
                            c2 = '\u0011';
                            break;
                        }
                        case 2: {
                            c2 = ',';
                            break;
                        }
                        case 3: {
                            c2 = 'M';
                            break;
                        }
                        default: {
                            c2 = '/';
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
        final char[] charArray2 = "\u001c~Y>J\u0010rO(C\u0003t_=@?bI".toCharArray();
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
                            c4 = 'Q';
                            break;
                        }
                        case 1: {
                            c4 = '\u0011';
                            break;
                        }
                        case 2: {
                            c4 = ',';
                            break;
                        }
                        case 3: {
                            c4 = 'M';
                            break;
                        }
                        default: {
                            c4 = '/';
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
