// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.kvm.b.d;

class h extends Thread {

    protected boolean a;
    final e b;
    private static final String[] z;

    h(final e b) {
        this.b = b;
        super(h.z[0]);
        this.a = false;
    }

    public void a() {
        this.a = true;
        synchronized (this.b.c) {
            this.b.c.notifyAll();
        }
    }

    @Override
    public void run() {
        final boolean f = g.f;
        while (!this.a) {
            try {
                while (this.b.c.size() > 0) {
                    final d d = this.b.c.elementAt(0);
                    this.b.c.remove(0);
                    this.b.b(d);
                    d.a(false);
                    if (this.b.d != -1) {
                        Thread.sleep(1000 / this.b.d);
                    }
                    if (f) {
                        break;
                    }
                }
                synchronized (this.b.c) {
                    while (!this.a && this.b.c.size() == 0) {
                        this.b.c.wait(1000L);
                        if (f) {
                            break;
                        }
                    }
                }
                continue;
            } catch (Throwable t) {
                System.out.println(h.z[2] + t.toString());
                this.b.a(t);
                if (!f) {
                    continue;
                }
            }
            break;
        }
        if (this.b.a != null && this.b.a.i() != null) {
            this.b.a.i().a(h.z[1]);
        }
    }

    static {
        final String[] z2 = new String[3];
        final int n = 0;
        final char[] charArray = "B\u0015\u00014c/(\u00116sj\t\u0000gKn\u0014\u0015 c}".toCharArray();
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
                            c2 = '\u000f';
                            break;
                        }
                        case 1: {
                            c2 = 'z';
                            break;
                        }
                        case 2: {
                            c2 = 't';
                            break;
                        }
                        case 3: {
                            c2 = 'G';
                            break;
                        }
                        default: {
                            c2 = '\u0006';
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
        final char[] charArray2 = "/Z9(s|\u001fT7gl\u0011\u00113&{\u0012\u0006\"gkZ\u00073i\u007f\n\u001d)a!".toCharArray();
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
                            c4 = '\u000f';
                            break;
                        }
                        case 1: {
                            c4 = 'z';
                            break;
                        }
                        case 2: {
                            c4 = 't';
                            break;
                        }
                        case 3: {
                            c4 = 'G';
                            break;
                        }
                        default: {
                            c4 = '\u0006';
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
        final char[] charArray3 = "\\\u001f\u001a#Rg\b\u0011&b5Z\u0012&oc\u001fT.h/\u0012\u00115c5Z".toCharArray();
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
                            c6 = '\u000f';
                            break;
                        }
                        case 1: {
                            c6 = 'z';
                            break;
                        }
                        case 2: {
                            c6 = 't';
                            break;
                        }
                        case 3: {
                            c6 = 'G';
                            break;
                        }
                        default: {
                            c6 = '\u0006';
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
