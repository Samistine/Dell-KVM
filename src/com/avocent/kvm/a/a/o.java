package com.avocent.kvm.a.a;

public class o extends h
{
    protected byte j;
    protected String k;
    
    public o(final int n, final String k, final byte j) {
        super(n);
        this.e = 16;
        this.j = j;
        this.k = k;
    }
    
    public void a(final byte[] array, final byte[] array2) {
        this.j = (byte)(array2[0] & 0xFF);
    }
    
    public String e() {
        return this.k + "(" + this.j + ")";
    }
    
    public String toString() {
        return this.e();
    }
    
    public byte[] b() {
        final byte[] array = new byte[8];
        array[0] = this.j;
        return array;
    }
}
