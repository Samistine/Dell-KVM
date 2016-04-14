// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.a.c;

import java.net.Socket;
import java.io.IOException;
import java.io.DataOutputStream;
import java.io.DataInputStream;
import java.net.ServerSocket;

class f extends Thread {

    final d a;
    private static final String[] z = {"CheckForDup", "AVCT - DupAppCheck", " Failed to start dup app server.", "DupNotFound", " Unrecognized command: ", " Found app for key: ", " Did not find App for key: ", "DupFound"};

    f(final d a) {
        this.a = a;
    }

    @Override
    public void run() {
        final int b = d.b;
        try {
            final ServerSocket serverSocket = new ServerSocket(8192);
            while (true) {
                final Socket accept = serverSocket.accept();
                try {
                    final DataInputStream dataInputStream = new DataInputStream(accept.getInputStream());
                    final DataOutputStream dataOutputStream = new DataOutputStream(accept.getOutputStream());
                    dataOutputStream.writeUTF(f.z[1]);
                    final String utf = dataInputStream.readUTF();
                    if (!utf.equalsIgnoreCase(f.z[0])) {
                        throw new IOException(f.z[4] + utf);
                    }
                    final String utf2 = dataInputStream.readUTF();
                    final a a = d.a(utf2);
                    Label_0214:
                    {
                        if (a == null) {
                            System.out.println(f.z[6] + utf2);
                            dataOutputStream.writeUTF(f.z[3]);
                            if (b == 0) {
                                break Label_0214;
                            }
                        }
                        System.out.println(f.z[5] + utf2);
                        a.a();
                        dataOutputStream.writeUTF(f.z[7]);
                    }
                    accept.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        } catch (Exception ex2) {
            System.out.println(f.z[2]);
            ex2.printStackTrace();
        }
    }
}
