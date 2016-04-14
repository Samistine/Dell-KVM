// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.a.c;

import java.io.DataOutputStream;
import java.io.DataInputStream;
import com.avocent.kvm.b.d.a;
import java.io.IOException;
import com.avocent.kvm.b.f.b;
import java.net.Socket;

public class c {

    private static final String[] z = {"localhost", " Existing viewer not found.", "Unrecognized magic string from new client connection: ", "DupFound", "CheckForDup", "AVCT - DupAppCheck"};

    public Socket a() {
        try {
            return new Socket(c.z[0], 8192);
        } catch (IOException ex) {
            b.a().a(c.z[1]);
            return null;
        }
    }

    public void b() throws IOException {
        new d().a();
    }

    public boolean a(final String s, final com.avocent.a.c.b b) throws IOException {
        final int b2 = d.b;
        final Socket a = this.a();
        boolean equalsIgnoreCase = false;
        Label_0155:
        {
            if (a == null) {
                this.b();
                equalsIgnoreCase = false;
                if (b2 == 0) {
                    break Label_0155;
                }
                int c = com.avocent.kvm.b.d.a.c;
                com.avocent.kvm.b.d.a.c = ++c;
            }
            final DataInputStream dataInputStream = new DataInputStream(a.getInputStream());
            final DataOutputStream dataOutputStream = new DataOutputStream(a.getOutputStream());
            final String utf = dataInputStream.readUTF();
            if (!utf.equalsIgnoreCase(c.z[5])) {
                throw new IOException(c.z[2] + utf);
            }
            dataOutputStream.writeUTF(c.z[4]);
            dataOutputStream.writeUTF(s);
            equalsIgnoreCase = dataInputStream.readUTF().equalsIgnoreCase(c.z[3]);
        }
        if (!equalsIgnoreCase) {
            d.a(s, b);
        }
        return equalsIgnoreCase;
    }
}
