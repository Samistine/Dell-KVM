package com.avocent.kvm.a.a;

public abstract class ob extends b
{
    protected int i;
    
    public ob(final int n) {
        super(n);
        this.i = 1;
    }
    
    public byte[] a() {
        final byte[] array = { 0, 0, 0, 0, 1, (byte)(this.d & 0xFF), 0, 0 };
        final int g = this.g();
        array[6] = (byte)(g >>> 8 & 0xFF);
        array[7] = (byte)(g & 0xFF);
        return array;
    }
}
