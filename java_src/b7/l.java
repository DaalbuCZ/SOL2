package b7;

import com.google.protobuf.a0;
/* loaded from: classes.dex */
public enum l implements a0.c {
    SESSION_VERBOSITY_NONE(0),
    GAUGES_AND_SYSTEM_EVENTS(1);
    

    /* renamed from: q  reason: collision with root package name */
    private static final a0.d<l> f2937q = new a0.d<l>() { // from class: b7.l.a
        @Override // com.google.protobuf.a0.d
        /* renamed from: b */
        public l a(int i10) {
            return l.e(i10);
        }
    };

    /* renamed from: n  reason: collision with root package name */
    private final int f2939n;

    /* loaded from: classes.dex */
    private static final class b implements a0.e {

        /* renamed from: a  reason: collision with root package name */
        static final a0.e f2940a = new b();

        private b() {
        }

        @Override // com.google.protobuf.a0.e
        public boolean a(int i10) {
            return l.e(i10) != null;
        }
    }

    l(int i10) {
        this.f2939n = i10;
    }

    public static l e(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                return null;
            }
            return GAUGES_AND_SYSTEM_EVENTS;
        }
        return SESSION_VERBOSITY_NONE;
    }

    public static a0.e g() {
        return b.f2940a;
    }

    @Override // com.google.protobuf.a0.c
    public final int d() {
        return this.f2939n;
    }
}
