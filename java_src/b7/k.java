package b7;

import com.google.protobuf.a0;
import com.google.protobuf.a1;
import com.google.protobuf.b0;
import com.google.protobuf.t0;
import com.google.protobuf.y;
/* loaded from: classes.dex */
public final class k extends y<k, c> implements t0 {
    private static final k DEFAULT_INSTANCE;
    private static volatile a1<k> PARSER = null;
    public static final int SESSION_ID_FIELD_NUMBER = 1;
    public static final int SESSION_VERBOSITY_FIELD_NUMBER = 2;
    private static final b0<Integer, l> sessionVerbosity_converter_ = new a();
    private int bitField0_;
    private String sessionId_ = "";
    private a0.g sessionVerbosity_ = y.D();

    /* loaded from: classes.dex */
    class a implements b0<Integer, l> {
        a() {
        }

        @Override // com.google.protobuf.b0
        /* renamed from: b */
        public l a(Integer num) {
            l e10 = l.e(num.intValue());
            return e10 == null ? l.SESSION_VERBOSITY_NONE : e10;
        }
    }

    /* loaded from: classes.dex */
    static /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f2934a;

        static {
            int[] iArr = new int[y.f.values().length];
            f2934a = iArr;
            try {
                iArr[y.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2934a[y.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2934a[y.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2934a[y.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2934a[y.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2934a[y.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f2934a[y.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends y.a<k, c> implements t0 {
        private c() {
            super(k.DEFAULT_INSTANCE);
        }

        /* synthetic */ c(a aVar) {
            this();
        }

        public c L(l lVar) {
            F();
            ((k) this.f6215o).U(lVar);
            return this;
        }

        public c M(String str) {
            F();
            ((k) this.f6215o).Z(str);
            return this;
        }
    }

    static {
        k kVar = new k();
        DEFAULT_INSTANCE = kVar;
        y.P(k.class, kVar);
    }

    private k() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void U(l lVar) {
        lVar.getClass();
        V();
        this.sessionVerbosity_.r(lVar.d());
    }

    private void V() {
        a0.g gVar = this.sessionVerbosity_;
        if (gVar.B()) {
            return;
        }
        this.sessionVerbosity_ = y.K(gVar);
    }

    public static c Y() {
        return DEFAULT_INSTANCE.z();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Z(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.sessionId_ = str;
    }

    @Override // com.google.protobuf.y
    protected final Object C(y.f fVar, Object obj, Object obj2) {
        switch (b.f2934a[fVar.ordinal()]) {
            case 1:
                return new k();
            case 2:
                return new c(null);
            case 3:
                return y.N(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001e", new Object[]{"bitField0_", "sessionId_", "sessionVerbosity_", l.g()});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                a1<k> a1Var = PARSER;
                if (a1Var == null) {
                    synchronized (k.class) {
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

    public l W(int i10) {
        return sessionVerbosity_converter_.a(Integer.valueOf(this.sessionVerbosity_.u(i10)));
    }

    public int X() {
        return this.sessionVerbosity_.size();
    }
}
