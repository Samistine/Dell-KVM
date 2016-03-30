package com.avocent.kvm.b.b;

import java.io.IOException;
import com.avocent.kvm.b.d.a;
import java.io.OutputStream;
import java.io.InputStream;

public class c extends InputStream
{
    InputStream a;
    OutputStream b;
    int c;
    int d;
    int e;
    boolean f;
    byte[] g;
    
    public c(final InputStream a) {
        final boolean b = a.b;
        super();
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = false;
        this.g = new byte[1];
        this.a = a;
        if (b) {
            int c = a.c;
            a.c = ++c;
        }
    }
    
    public int available() throws IOException {
        return this.a.available();
    }
    
    public void close() throws IOException {
        this.a.close();
    }
    
    public void mark(final int e) {
        this.a.mark(e);
        this.c = 0;
        this.d = 0;
        this.f = true;
        this.e = e;
    }
    
    public boolean markSupported() {
        return this.a.markSupported();
    }
    
    public int read() throws IOException {
        final int read = this.a.read();
        if (this.b != null && read != -1) {
            this.g[0] = (byte)(read & 0xFF);
            this.a(this.g, 0, 1);
        }
        return read;
    }
    
    public int read(final byte[] array) throws IOException {
        final int read = this.a.read(array);
        if (this.b != null && read != 0) {
            this.a(array, 0, read);
        }
        return read;
    }
    
    public int read(final byte[] array, final int n, final int n2) throws IOException {
        final int read = this.a.read(array, n, n2);
        if (this.b != null && read != 0) {
            this.a(array, n, read);
        }
        return read;
    }
    
    void a(final byte[] array, final int n, final int n2) throws IOException {
        final boolean b = a.b;
        Label_0153: {
            if (this.c > 0) {
                if (n2 > this.c) {
                    this.b.write(array, this.c, n2 - this.c);
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
                this.b.write(array, n, n2);
                if (!b) {
                    break Label_0153;
                }
            }
            this.b.write(array, n, n2);
        }
        this.b.flush();
        if (a.c != 0) {
            a.b = !b;
        }
    }
    
    public void reset() throws IOException {
        this.a.reset();
        this.c = this.d;
        this.d = 0;
        this.f = false;
    }
    
    public long skip(final long n) throws IOException {
        return this.a.skip(n);
    }
    
    public void a(final OutputStream b) {
        this.b = b;
    }
}
