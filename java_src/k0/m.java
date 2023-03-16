package k0;

import android.annotation.SuppressLint;
/* loaded from: classes.dex */
public interface m {
    @SuppressLint({"SyntheticAccessor"})

    /* renamed from: a  reason: collision with root package name */
    public static final b.c f10508a = new b.c();
    @SuppressLint({"SyntheticAccessor"})

    /* renamed from: b  reason: collision with root package name */
    public static final b.C0148b f10509b = new b.C0148b();

    /* loaded from: classes.dex */
    public static abstract class b {

        /* loaded from: classes.dex */
        public static final class a extends b {

            /* renamed from: a  reason: collision with root package name */
            private final Throwable f10510a;

            public a(Throwable th) {
                this.f10510a = th;
            }

            public Throwable a() {
                return this.f10510a;
            }

            public String toString() {
                return String.format("FAILURE (%s)", this.f10510a.getMessage());
            }
        }

        /* renamed from: k0.m$b$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0148b extends b {
            private C0148b() {
            }

            public String toString() {
                return "IN_PROGRESS";
            }
        }

        /* loaded from: classes.dex */
        public static final class c extends b {
            private c() {
            }

            public String toString() {
                return "SUCCESS";
            }
        }

        b() {
        }
    }
}
