package b7;

import com.google.protobuf.a0;
/* loaded from: classes.dex */
public enum d implements a0.c {
    APPLICATION_PROCESS_STATE_UNKNOWN(0),
    FOREGROUND(1),
    BACKGROUND(2),
    FOREGROUND_BACKGROUND(3);
    

    /* renamed from: s  reason: collision with root package name */
    private static final a0.d<d> f2904s = new a0.d<d>() { // from class: b7.d.a
        @Override // com.google.protobuf.a0.d
        /* renamed from: b */
        public d a(int i10) {
            return d.e(i10);
        }
    };

    /* renamed from: n  reason: collision with root package name */
    private final int f2906n;

    /* loaded from: classes.dex */
    private static final class b implements a0.e {

        /* renamed from: a  reason: collision with root package name */
        static final a0.e f2907a = new b();

        private b() {
        }

        @Override // com.google.protobuf.a0.e
        public boolean a(int i10) {
            return d.e(i10) != null;
        }
    }

    d(int i10) {
        this.f2906n = i10;
    }

    public static d e(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        return null;
                    }
                    return FOREGROUND_BACKGROUND;
                }
                return BACKGROUND;
            }
            return FOREGROUND;
        }
        return APPLICATION_PROCESS_STATE_UNKNOWN;
    }

    public static a0.e g() {
        return b.f2907a;
    }

    @Override // com.google.protobuf.a0.c
    public final int d() {
        return this.f2906n;
    }
}
