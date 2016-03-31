// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.kvm.b.b;

import java.io.IOException;
import java.io.OutputStream;
import java.io.InputStream;

//Originally named c
public class Stream_c extends InputStream {

    InputStream steamIN;//Originally named a
    OutputStream streamOUT;//Originally named b
    int c;
    int d;
    int e;
    boolean f;
    byte[] g;

    public Stream_c(InputStream a) {
        final boolean b = com.avocent.kvm.b.b.DataInputStream_a.b;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = false;
        this.g = new byte[1];
        this.steamIN = a;
        if (b) {
            int c = com.avocent.kvm.b.d.a.c;
            com.avocent.kvm.b.d.a.c = ++c;
        }
    }

    @Override
    public int available() throws IOException {
        return this.steamIN.available();
    }

    @Override
    public void close() throws IOException {
        this.steamIN.close();
    }

    @Override
    public void mark(final int e) {
        this.steamIN.mark(e);
        this.c = 0;
        this.d = 0;
        this.f = true;
        this.e = e;
    }

    @Override
    public boolean markSupported() {
        return this.steamIN.markSupported();
    }

    @Override
    public int read() throws IOException {
        final int read = this.steamIN.read();
        if (this.streamOUT != null && read != -1) {
            this.g[0] = (byte) (read & 0xFF);
            this.a(this.g, 0, 1);
        }
        return read;
    }

    @Override
    public int read(byte[] array) throws IOException {
        final int read = this.steamIN.read(array);
        if (this.streamOUT != null && read != 0) {
            this.a(array, 0, read);
        }
        return read;
    }

    @Override
    public int read(byte[] array, int n, int n2) throws IOException {
        final int read = this.steamIN.read(array, n, n2);
        if (this.streamOUT != null && read != 0) {
            this.a(array, n, read);
        }
        return read;
    }

    void a(byte[] array, int n, int n2) throws IOException {
        final boolean b = com.avocent.kvm.b.b.DataInputStream_a.b;
        Label_0153:
        {
            if (this.c > 0) {
                if (n2 > this.c) {
                    this.streamOUT.write(array, this.c, n2 - this.c);
                    this.e = 0;
                    this.f = false;
                    if (!b) {
                        break Label_0153;
                    }
                }
                this.c -= n2;
                if (this.c > 0) {
                    break Label_0153;
                }
                this.f = false;
                this.c = 0;
                if (!b) {
                    break Label_0153;
                }
            }
            if (this.f) {
                this.d += n2;
                if (this.d > this.e) {
                    this.f = false;
                    this.e = 0;
                    this.d = 0;
                }
                this.streamOUT.write(array, n, n2);
                if (!b) {
                    break Label_0153;
                }
            }
            this.streamOUT.write(array, n, n2);
        }
        this.streamOUT.flush();
        if (com.avocent.kvm.b.d.a.c != 0) {
            com.avocent.kvm.b.b.DataInputStream_a.b = !b;
        }
    }

    @Override
    public void reset() throws IOException {
        this.steamIN.reset();
        this.c = this.d;
        this.d = 0;
        this.f = false;
    }

    @Override
    public long skip(long n) throws IOException {
        return this.steamIN.skip(n);
    }

    public void setOutputStream(OutputStream b) {
        this.streamOUT = b;
    }
}
