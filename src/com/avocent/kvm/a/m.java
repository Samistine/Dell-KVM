// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.kvm.a;

import java.io.DataOutputStream;
import com.avocent.kvm.b.i;
import java.io.IOException;
import java.io.OutputStream;
import com.avocent.kvm.b.f.b;
import java.io.File;
import com.avocent.kvm.b.u;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import com.avocent.kvm.b.k;

public class m extends k {

    protected boolean x;
    protected int y;
    protected int z;
    protected boolean A;
    protected int B;
    protected int C;
    protected PrintWriter D;
    protected FileOutputStream E;
    private static final String[] F = {".hex", " Failed to close frame dump files: ", "frame_", " 0x0", ".bin", " Writing frame dump to: ", ".txt", " Exception while writing frame hex dump: ", " Finished writing frame_", " 0x", "_pixel.bin", "Cannot perform frame hex dump.  Unable to parse integer value from the parameter ", "dumpFrame"};

    public m(final u u) {
        super(u);
        this.x = false;
        this.y = 0;
        this.z = 0;
        final String property = System.getProperty(/*m.*/F[12]);
        try {
            if (property == null) {
                this.C = -1;
                if (com.avocent.kvm.a.l.Ab == 0) {
                    /*break;*/
                    return;//Sam
                }
            }
            this.C = Integer.parseInt(property.trim());
        } catch (NumberFormatException ex) {
            u.i().a(/*m.*/F[11] + property);
        }
    }

    @Override
    public void n() {
        final int ab = com.avocent.kvm.a.l.Ab;
        if (this.q != null && this.A) {
            this.b.c().a();
            if (this.B != 0) {
                this.o();
            }
        }
        super.n();
        final int d = this.q.d();
        Label_0189:
        {
            switch (d) {
                case 130:
                case 34306: {
                    this.e = ((l) this.b).m();
                    if (ab != 0) {
                        break Label_0189;
                    }
                    break;
                }
                case 129:
                case 34305: {
                    this.e = ((l) this.b).o();
                    if (ab != 0) {
                        break Label_0189;
                    }
                    break;
                }
                case 131:
                case 34307: {
                    this.e = ((l) this.b).n();
                    if (ab != 0) {
                        break Label_0189;
                    }
                    break;
                }
                case 134:
                case 34310: {
                    this.e = ((l) this.b).p();
                    break;
                }
            }
        }
        this.e.a(d, this.q.b(), this.q.g());
        Label_0806:
        {
            if (this.C >= 0 && this.k == this.C) {
                try {
                    if (this.D == null) {
                        final File file = new File(/*m.*/F[2] + this.C + /*m.*/ F[0]);
                        final File file2 = new File(/*m.*/F[2] + this.C + /*m.*/ F[4]);
                        com.avocent.kvm.b.f.b.a().a(/*m.*/F[5] + file.getPath());
                        this.D = new PrintWriter(new FileOutputStream(file));
                        this.E = new FileOutputStream(file2);
                    }
                    final byte[] b = this.q.b();
                    final int g = this.q.g();
                    int i = 0;
                    while (i < g) {
                        final String hexString = Integer.toHexString(b[i] & 0xFF);
                        this.D.print(((hexString.length() == 1) ? /*m.*/ F[3] : /*m.*/ F[9]) + hexString);
                        if ((i + 1) % 16 == 0) {
                            this.D.println("");
                        }
                        ++i;
                        if (ab != 0) {
                            break;
                        }
                    }
                    this.E.write(b, 0, g);
                    break Label_0806;
                } catch (IOException ex) {
                    com.avocent.kvm.b.f.b.a().a(/*m.*/F[7] + ex.getMessage());
                    if (ab == 0) {
                        break Label_0806;
                    }
                }
            }
            if (this.D != null) {
                try {
                    com.avocent.kvm.b.f.b.a().a(/*m.*/F[8] + this.C + /*m.*/ F[6]);
                    this.D.close();
                    this.E.close();
                    this.D = null;
                    this.E = null;
                    if (this.b.c() instanceof i) {
                        final DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(/*m.*/F[2] + this.C + /*m.*/ F[10]));
                        final i j = (i) this.b.c();
                        final int[] array = (int[]) j.e();
                        int k = 0;
                        while (k < j.n()) {
                            dataOutputStream.writeInt(array[k]);
                            ++k;
                            if (ab != 0) {
                                break;
                            }
                        }
                        dataOutputStream.close();
                    }
                } catch (IOException ex2) {
                    com.avocent.kvm.b.f.b.a().a(/*m.*/F[1] + ex2.getMessage() + ".");
                }
            }
        }
        this.l();
    }

    protected void o() {
    }
}
