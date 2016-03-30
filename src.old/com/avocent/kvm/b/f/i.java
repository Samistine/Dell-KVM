// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.kvm.b.f;

import java.util.Map;
import java.util.LinkedHashMap;

class i extends LinkedHashMap {

    i(final int n, final float n2, final boolean b) {
        super(n, n2, b);
    }

    @Override
    protected boolean removeEldestEntry(final Map.Entry entry) {
        return this.size() >= h.a();
    }
}
