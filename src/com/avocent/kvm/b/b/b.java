package com.avocent.kvm.b.b;

import java.io.IOException;
import java.io.OutputStream;
import java.io.DataOutputStream;

public class b extends DataOutputStream
{
    public b(final OutputStream outputStream) {
        super(outputStream);
    }
    
    public void write(final byte[] array) throws IOException {
        super.write(array);
    }
    
    public void write(final byte[] array, final int n, final int n2) throws IOException {
        super.write(array, n, n2);
    }
}
