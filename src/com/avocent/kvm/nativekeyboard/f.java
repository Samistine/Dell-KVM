package com.avocent.kvm.nativekeyboard;

class f implements Runnable
{
    final int a;
    final int b;
    final e c;
    
    f(final e c, final int a, final int b) {
        this.c = c;
        this.a = a;
        this.b = b;
        super();
    }
    
    public void run() {
        NativeKVM.setCursorLocation(this.c.d, this.a, this.b);
    }
}
