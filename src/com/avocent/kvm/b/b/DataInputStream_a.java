// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.kvm.b.b;

import java.io.InputStream;
import java.net.Socket;
import java.io.DataInputStream;

//Originally named a
public class DataInputStream_a extends DataInputStream {

    public static boolean b;
    Socket a;

    public DataInputStream_a(InputStream inputStream, Socket a) {
        super(inputStream);
        this.a = a;
    }
}
