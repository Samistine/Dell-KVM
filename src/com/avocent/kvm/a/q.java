package com.avocent.kvm.a;

import com.avocent.kvm.b.d.g;
import java.util.Date;
import java.text.SimpleDateFormat;
import com.avocent.kvm.b.d.c;
import com.avocent.kvm.a.a.n;

class q extends Thread
{
    boolean a;
    final l b;
    private static final String[] z;
    
    q(final l b) {
        this.b = b;
        super();
        this.a = false;
        this.setName(q.z[2]);
        this.setDaemon(true);
    }
    
    public void run() {
        while (!this.a) {
            try {
                final g x = this.b.x();
                if (x != null) {
                    final n n = new n();
                    final l b = this.b;
                    ++b.qb;
                    n.c(this.b.qb);
                    x.a(n);
                    final SimpleDateFormat simpleDateFormat = new SimpleDateFormat(q.z[0]);
                    final Date date = new Date();
                    System.out.println(q.z[1] + this.b.qb + ")");
                    System.out.println(simpleDateFormat.format(date).toString());
                }
                Thread.currentThread();
                Thread.sleep(5000L);
                continue;
            }
            catch (Throwable t) {
                this.b.a(t);
                return;
            }
            break;
        }
    }
    
    static {
        final String[] z2 = new String[3];
        final int n = 0;
        final char[] charArray = "Grd[xsF2F3\u001eCU\u0018:S1nQ".toCharArray();
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
                            c2 = '>';
                            break;
                        }
                        case 1: {
                            c2 = '\u000b';
                            break;
                        }
                        case 2: {
                            c2 = '\u001d';
                            break;
                        }
                        case 3: {
                            c2 = '\"';
                            break;
                        }
                        default: {
                            c2 = 'W';
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
        final char[] charArray2 = "ln~G>Hny\u0002\u001f{JOv\u0015{JI\u0002:[xnC0[%=\n\u0005_eyM:p~p@2L1".toCharArray();
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
                            c4 = '>';
                            break;
                        }
                        case 1: {
                            c4 = '\u000b';
                            break;
                        }
                        case 2: {
                            c4 = '\u001d';
                            break;
                        }
                        case 3: {
                            c4 = '\"';
                            break;
                        }
                        default: {
                            c4 = 'W';
                            break;
                        }
                    }
                    charArray2[length2] = (char)(c3 ^ c4);
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
        final char[] charArray3 = "u]P\u0002\u001c[nm\u0002\u0016RbkG".toCharArray();
        int length3;
        int n11;
        final int n10 = n11 = (length3 = charArray3.length);
        int n12 = 0;
        while (true) {
            Label_0330: {
                if (n10 > 1) {
                    break Label_0330;
                }
                length3 = (n11 = n12);
                do {
                    final char c5 = charArray3[n11];
                    char c6 = '\0';
                    switch (n12 % 5) {
                        case 0: {
                            c6 = '>';
                            break;
                        }
                        case 1: {
                            c6 = '\u000b';
                            break;
                        }
                        case 2: {
                            c6 = '\u001d';
                            break;
                        }
                        case 3: {
                            c6 = '\"';
                            break;
                        }
                        default: {
                            c6 = 'W';
                            break;
                        }
                    }
                    charArray3[length3] = (char)(c5 ^ c6);
                    ++n12;
                } while (n10 == 0);
            }
            if (n10 <= n12) {
                z2[n9] = new String(charArray3).intern();
                z = z2;
                return;
            }
            continue;
        }
    }
}
