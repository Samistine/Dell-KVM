// 
// Decompiled by Procyon v0.5.29
// 
package com.avocent.a.a.c;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

//Originally named a
public class NamedArray {

    protected ArrayList<c> array;
    protected String name;

    public NamedArray(String name) {
        this.array = new ArrayList();
        this.name = name;
    }

    public void add(c c) {
        this.array.add(c);
    }

    public String getName() {
        return this.name;
    }

    public List getList() {
        return Collections.unmodifiableList((List<c>) this.array);
    }
}
