package b7;

import com.google.protobuf.a0;
import com.google.protobuf.a1;
import com.google.protobuf.t0;
import com.google.protobuf.y;
/* loaded from: classes.dex */
public final class n extends y<n, b> implements t0 {
    private static final n DEFAULT_INSTANCE;
    public static final int DISPATCH_DESTINATION_FIELD_NUMBER = 1;
    private static volatile a1<n> PARSER;
    private int bitField0_;
    private int dispatchDestination_;

    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f2944a;

        static {
            int[] iArr = new int[y.f.values().length];
            f2944a = iArr;
            try {
                iArr[y.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2944a[y.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2944a[y.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2944a[y.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2944a[y.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2944a[y.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f2944a[y.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends y.a<n, b> implements t0 {
        private b() {
            super(n.DEFAULT_INSTANCE);
        }

        /* synthetic */ b(a aVar) {
            this();
        }
    }

    /* loaded from: classes.dex */
    public enum c implements a0.c {
        SOURCE_UNKNOWN(0),
        FL_LEGACY_V1(1);
        

        /* renamed from: q  reason: collision with root package name */
        private static final a0.d<c> f2947q = new a();

        /* renamed from: n  reason: collision with root package name */
        private final int f2949n;

        /* loaded from: classes.dex */
        class a implements a0.d<c> {
            a() {
            }

            @Override // com.google.protobuf.a0.d
            /* renamed from: b */
            public c a(int i10) {
                return c.e(i10);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes.dex */
        public static final class b implements a0.e {

            /* renamed from: a  reason: collision with root package name */
            static final a0.e f2950a = new b();

            private b() {
            }

            @Override // com.google.protobuf.a0.e
            public boolean a(int i10) {
                return c.e(i10) != null;
            }
        }

        c(int i10) {
            this.f2949n = i10;
        }

        public static c e(int i10) {
            if (i10 != 0) {
                if (i10 != 1) {
                    return null;
                }
                return FL_LEGACY_V1;
            }
            return SOURCE_UNKNOWN;
        }

        public static a0.e g() {
            return b.f2950a;
        }

        @Override // com.google.protobuf.a0.c
        public final int d() {
            return this.f2949n;
        }
    }

    static {
        n nVar = new n();
        DEFAULT_INSTANCE = nVar;
        y.P(n.class, nVar);
    }

    private n() {
    }

    @Override // com.google.protobuf.y
    protected final Object C(y.f fVar, Object obj, Object obj2) {
        switch (a.f2944a[fVar.ordinal()]) {
            case 1:
                return new n();
            case 2:
                return new b(null);
            case 3:
                return y.N(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"bitField0_", "dispatchDestination_", c.g()});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                a1<n> a1Var = PARSER;
                if (a1Var == null) {
                    synchronized (n.class) {
                        a1Var = PARSER;
                        if (a1Var == null) {
                            a1Var = new y.b<>(DEFAULT_INSTANCE);
                            PARSER = a1Var;
                        }
                    }
                }
                return a1Var;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
