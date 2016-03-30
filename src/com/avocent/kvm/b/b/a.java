package com.avocent.kvm.b.b;

import java.io.InputStream;
import java.net.Socket;
import java.io.DataInputStream;

public class a extends DataInputStream
{
    Socket a;
    public static boolean b;
    
    public a(final InputStream inputStream, final Socket a) {
        super(inputStream);
        this.a = a;
    }
}
