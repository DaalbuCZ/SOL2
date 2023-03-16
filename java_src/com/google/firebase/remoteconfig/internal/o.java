package com.google.firebase.remoteconfig.internal;
/* loaded from: classes.dex */
public class o implements d7.h {

    /* renamed from: a  reason: collision with root package name */
    private final long f5896a;

    /* renamed from: b  reason: collision with root package name */
    private final int f5897b;

    /* renamed from: c  reason: collision with root package name */
    private final d7.j f5898c;

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private long f5899a;

        /* renamed from: b  reason: collision with root package name */
        private int f5900b;

        /* renamed from: c  reason: collision with root package name */
        private d7.j f5901c;

        private b() {
        }

        public o a() {
            return new o(this.f5899a, this.f5900b, this.f5901c);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public b b(d7.j jVar) {
            this.f5901c = jVar;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public b c(int i10) {
            this.f5900b = i10;
            return this;
        }

        public b d(long j10) {
            this.f5899a = j10;
            return this;
        }
    }

    private o(long j10, int i10, d7.j jVar) {
        this.f5896a = j10;
        this.f5897b = i10;
        this.f5898c = jVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static b b() {
        return new b();
    }

    @Override // d7.h
    public int a() {
        return this.f5897b;
    }
}
