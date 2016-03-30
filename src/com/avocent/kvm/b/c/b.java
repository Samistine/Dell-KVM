// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.kvm.b.c;

public class b {

    protected int a;
    protected int b;
    protected int c;

    public b(final int a, final int n, final int n2) {
        this.a = a;
        this.c = ((n2 == 0) ? 1 : n2);
        this.b = ((n == 65535) ? 0 : n);
    }

    @Override
    public int hashCode() {
        if (this.a > 0) {
            return new String("" + this.a + "-" + this.c).hashCode();
        }
        return new Integer(this.b).hashCode();
    }

    @Override
    public boolean equals(final Object o) {
        if (!(o instanceof b)) {
            return false;
        }
        final b b = (b) o;
        if (this.a > 0) {
            return this.a == b.a && this.c == b.c;
        }
        return this.b == b.b;
    }

    @Override
    public String toString() {
        if (this.a > 0) {
            return "" + this.a + "-" + this.c;
        }
        return "" + this.b + "(" + (char) this.b + ")";
    }
}
