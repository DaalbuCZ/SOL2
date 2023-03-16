package com.google.firebase.remoteconfig.internal;
/* loaded from: classes.dex */
public class p implements d7.k {

    /* renamed from: a  reason: collision with root package name */
    private final String f5902a;

    /* renamed from: b  reason: collision with root package name */
    private final int f5903b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public p(String str, int i10) {
        this.f5902a = str;
        this.f5903b = i10;
    }

    private String f() {
        return b().trim();
    }

    private void g() {
        if (this.f5902a == null) {
            throw new IllegalArgumentException("Value is null, and cannot be converted to the desired type.");
        }
    }

    @Override // d7.k
    public double a() {
        if (this.f5903b == 0) {
            return 0.0d;
        }
        String f10 = f();
        try {
            return Double.valueOf(f10).doubleValue();
        } catch (NumberFormatException e10) {
            throw new IllegalArgumentException(String.format("[Value: %s] cannot be converted to a %s.", f10, "double"), e10);
        }
    }

    @Override // d7.k
    public String b() {
        if (this.f5903b == 0) {
            return "";
        }
        g();
        return this.f5902a;
    }

    @Override // d7.k
    public long c() {
        if (this.f5903b == 0) {
            return 0L;
        }
        String f10 = f();
        try {
            return Long.valueOf(f10).longValue();
        } catch (NumberFormatException e10) {
            throw new IllegalArgumentException(String.format("[Value: %s] cannot be converted to a %s.", f10, "long"), e10);
        }
    }

    @Override // d7.k
    public boolean d() {
        if (this.f5903b == 0) {
            return false;
        }
        String f10 = f();
        if (l.f5880f.matcher(f10).matches()) {
            return true;
        }
        if (l.f5881g.matcher(f10).matches()) {
            return false;
        }
        throw new IllegalArgumentException(String.format("[Value: %s] cannot be converted to a %s.", f10, "boolean"));
    }

    @Override // d7.k
    public int e() {
        return this.f5903b;
    }
}
