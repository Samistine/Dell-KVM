package com.avocent.lenovo.kvm;

import java.io.IOException;
import com.avocent.kvm.a.l;
import com.avocent.lenovo.kvm.b.e;
import com.avocent.kvm.a.k;

public class e implements k
{
    protected c a;
    
    public e(final c a) {
        super();
        this.a = a;
    }
    
    public void a(final int n, final int n2, final String s) {
        final int a = new e(this.a).a(s);
        final l l = (l)this.a.a();
        try {
            l.a(n, a);
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
