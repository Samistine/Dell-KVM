// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.kvm.a;

import java.io.IOException;
import com.avocent.kvm.b.d.c;
import com.avocent.kvm.b.a.d;
import java.util.ArrayList;
import com.avocent.kvm.b.ib;

public class e implements ib {

    protected l a;
    protected ArrayList b;
    private static final String[] z;

    public e(final l a) {
        this.b = new ArrayList();
        this.a = a;
    }

    @Override
    public void a(final int n) throws IOException {
        final int ab = l.Ab;
        boolean b = true;
        int i = 0;
        while (i < this.b.size()) {
            if (((d) this.b.get(i)).a(n)) {
                b = false;
            }
            ++i;
            if (ab != 0) {
                break;
            }
        }
        System.out.println(e.z[0] + b + e.z[1] + (this.a != null) + e.z[2] + this.a.x() != null);
        if (b && this.a != null && this.a.x() != null) {
            this.a.x().a(new com.avocent.kvm.a.a.e(n, true));
        }
    }

    @Override
    public void b(final int n) throws IOException {
        final int ab = l.Ab;
        boolean b = true;
        int i = 0;
        while (i < this.b.size()) {
            if (((d) this.b.get(i)).b(n)) {
                b = false;
            }
            ++i;
            if (ab != 0) {
                break;
            }
        }
        if (b && this.a != null && this.a.x() != null) {
            this.a.x().a(new com.avocent.kvm.a.a.e(n, false));
        }
    }

    @Override
    public void a(final d d) {
        this.b.add(d);
    }

    static {
        final String[] z2 = new String[3];
        final int n = 0;
        final char[] charArray = "\u001c7%@@OnSV\\\u001c".toCharArray();
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
                            c2 = '!';
                            break;
                        }
                        case 1: {
                            c2 = '\n';
                            break;
                        }
                        case 2: {
                            c2 = '\u0018';
                            break;
                        }
                        case 3: {
                            c2 = '3';
                            break;
                        }
                        default: {
                            c2 = '%';
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
        final char[] charArray2 = "LUsEHrok@LNd8\u0012\u0018\u0001dm_I".toCharArray();
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
                            c4 = '!';
                            break;
                        }
                        case 1: {
                            c4 = '\n';
                            break;
                        }
                        case 2: {
                            c4 = '\u0018';
                            break;
                        }
                        case 3: {
                            c4 = '3';
                            break;
                        }
                        default: {
                            c4 = '%';
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
        final char[] charArray3 = "\rgGXSLY}@VHev\u001dBD~JVTTokGh@dyT@S\"1\u0013\u0004\u001c*vFIM*".toCharArray();
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
                            c6 = '!';
                            break;
                        }
                        case 1: {
                            c6 = '\n';
                            break;
                        }
                        case 2: {
                            c6 = '\u0018';
                            break;
                        }
                        case 3: {
                            c6 = '3';
                            break;
                        }
                        default: {
                            c6 = '%';
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
