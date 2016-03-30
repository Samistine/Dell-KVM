// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.kvm.a.a;

import com.avocent.kvm.b.d.a;

public class kb extends y {

    protected int j;
    protected int k;
    protected int l;
    protected int m;
    protected int n;
    protected int o;
    protected String p;
    protected boolean q;
    protected boolean r;
    protected boolean s;
    private static final String[] z;

    public kb() {
        super(33536);
        this.l = 30;
        this.m = 3;
        this.q = false;
        this.e = 113;
    }

    public kb(final boolean q) {
        super(q ? 33541 : 33536);
        this.l = 30;
        this.m = 3;
        this.q = false;
        this.e = (q ? 113 : 115);
        this.q = q;
    }

    @Override
    public void a(final byte[] array, final byte[] array2) {
        Label_0128:
        {
            if (this.q) {
                this.j = array2[0];
                this.k = (array2[1] & 0xFF);
                this.l = (array2[2] & 0xFF);
                this.o = com.avocent.kvm.b.d.a.a(array2, 4);
                this.n = com.avocent.kvm.b.d.a.b(array2, 8);
                this.p = com.avocent.kvm.b.d.a.a(array2, 11, array2[10]);
                if (b.h == 0) {
                    break Label_0128;
                }
            }
            this.j = (array2[0] & 0xFF);
            this.n = (array2[3] & 0xFF);
            this.o = com.avocent.kvm.b.d.a.a(array2, 4);
            this.p = com.avocent.kvm.b.d.a.a(array2, 9, array2[8] & 0xFF);
        }
        System.out.println(kb.z[1] + Integer.toHexString(this.n));
        this.r = ((this.n & 0x1) > 0);
        this.s = ((this.n & 0x2) > 0);
    }

    @Override
    public byte[] b() {
        final byte[] array = new byte[105];
        array[0] = (byte) (this.j & 0xFF);
        array[3] = (byte) (this.n & 0xFF);
        com.avocent.kvm.b.d.a.b(this.o, array, 4);
        array[8] = (byte) (this.p.length() & 0xFF);
        com.avocent.kvm.b.d.a.a(this.p, array, 9, 96);
        System.out.println(kb.z[0] + this.n);
        return array;
    }

    @Override
    public String e() {
        return kb.z[2];
    }

    public int h() {
        return this.j;
    }

    public int i() {
        return this.o;
    }

    public boolean j() {
        return (this.n & 0x2) > 0;
    }

    public int k() {
        return this.m;
    }

    public boolean l() {
        return this.r;
    }

    static {
        final String[] z2 = new String[3];
        final int n = 0;
        final char[] charArray = "l@TS\u0003VTXO\u001d\\@AN!JV\u0011F*McPX#VRU\tf\u0019~XR,\u0017\u0013BU.MFB\u0001-PG\u0011G&\\_U\u0001u\u0019".toCharArray();
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
                            c2 = '9';
                            break;
                        }
                        case 1: {
                            c2 = '3';
                            break;
                        }
                        case 2: {
                            c2 = '1';
                            break;
                        }
                        case 3: {
                            c2 = '!';
                            break;
                        }
                        default: {
                            c2 = 'O';
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
        final char[] charArray2 = "l@TS\u0003VTXO\u001d\\@AN!JV\u0011R*MwPU.\u0011\u001a\u0011l&JP\u001f\u0001<MRET<\u0019QXUo_ZTM+\u0019\t\u0011".toCharArray();
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
                            c4 = '9';
                            break;
                        }
                        case 1: {
                            c4 = '3';
                            break;
                        }
                        case 2: {
                            c4 = '1';
                            break;
                        }
                        case 3: {
                            c4 = '!';
                            break;
                        }
                        default: {
                            c4 = 'O';
                            break;
                        }
                    }
                    charArray2[length2] = (char) (c3 ^ c4);
                    ++n8;
                } while (n6 == 0);
            }
            if (n6 > n8) {
                continue;
            }
            break;
        }
        z2[n5] = new String(charArray2).intern();
        final int n9 = 2;
        final char[] charArray3 = "l@TSou\\VH!\u0019aTR?V]BD".toCharArray();
        int length3;
        int n11;
        final int n10 = n11 = (length3 = charArray3.length);
        int n12 = 0;
        while (true) {
            Label_0330:
            {
                if (n10 > 1) {
                    break Label_0330;
                }
                length3 = (n11 = n12);
                do {
                    final char c5 = charArray3[n11];
                    char c6 = '\0';
                    switch (n12 % 5) {
                        case 0: {
                            c6 = '9';
                            break;
                        }
                        case 1: {
                            c6 = '3';
                            break;
                        }
                        case 2: {
                            c6 = '1';
                            break;
                        }
                        case 3: {
                            c6 = '!';
                            break;
                        }
                        default: {
                            c6 = 'O';
                            break;
                        }
                    }
                    charArray3[length3] = (char) (c5 ^ c6);
                    ++n12;
                } while (n10 == 0);
            }
            if (n10 <= n12) {
                z2[n9] = new String(charArray3).intern();
                z = z2;
                break;
            }
            continue;
        }
    }
}
