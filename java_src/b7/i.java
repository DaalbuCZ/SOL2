package b7;

import b7.c;
import com.google.protobuf.a1;
import com.google.protobuf.y;
/* loaded from: classes.dex */
public final class i extends y<i, b> implements j {
    public static final int APPLICATION_INFO_FIELD_NUMBER = 1;
    private static final i DEFAULT_INSTANCE;
    public static final int GAUGE_METRIC_FIELD_NUMBER = 4;
    public static final int NETWORK_REQUEST_METRIC_FIELD_NUMBER = 3;
    private static volatile a1<i> PARSER = null;
    public static final int TRACE_METRIC_FIELD_NUMBER = 2;
    public static final int TRANSPORT_INFO_FIELD_NUMBER = 5;
    private c applicationInfo_;
    private int bitField0_;
    private g gaugeMetric_;
    private h networkRequestMetric_;
    private m traceMetric_;
    private n transportInfo_;

    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f2933a;

        static {
            int[] iArr = new int[y.f.values().length];
            f2933a = iArr;
            try {
                iArr[y.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2933a[y.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2933a[y.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2933a[y.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2933a[y.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2933a[y.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f2933a[y.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends y.a<i, b> implements j {
        private b() {
            super(i.DEFAULT_INSTANCE);
        }

        /* synthetic */ b(a aVar) {
            this();
        }

        public b L(c.b bVar) {
            F();
            ((i) this.f6215o).Z(bVar.a());
            return this;
        }

        public b M(g gVar) {
            F();
            ((i) this.f6215o).a0(gVar);
            return this;
        }

        public b N(h hVar) {
            F();
            ((i) this.f6215o).b0(hVar);
            return this;
        }

        public b O(m mVar) {
            F();
            ((i) this.f6215o).c0(mVar);
            return this;
        }

        @Override // b7.j
        public boolean c() {
            return ((i) this.f6215o).c();
        }

        @Override // b7.j
        public g h() {
            return ((i) this.f6215o).h();
        }

        @Override // b7.j
        public boolean l() {
            return ((i) this.f6215o).l();
        }

        @Override // b7.j
        public m n() {
            return ((i) this.f6215o).n();
        }

        @Override // b7.j
        public boolean s() {
            return ((i) this.f6215o).s();
        }

        @Override // b7.j
        public h t() {
            return ((i) this.f6215o).t();
        }
    }

    static {
        i iVar = new i();
        DEFAULT_INSTANCE = iVar;
        y.P(i.class, iVar);
    }

    private i() {
    }

    public static b Y() {
        return DEFAULT_INSTANCE.z();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Z(c cVar) {
        cVar.getClass();
        this.applicationInfo_ = cVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a0(g gVar) {
        gVar.getClass();
        this.gaugeMetric_ = gVar;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b0(h hVar) {
        hVar.getClass();
        this.networkRequestMetric_ = hVar;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c0(m mVar) {
        mVar.getClass();
        this.traceMetric_ = mVar;
        this.bitField0_ |= 2;
    }

    @Override // com.google.protobuf.y
    protected final Object C(y.f fVar, Object obj, Object obj2) {
        switch (a.f2933a[fVar.ordinal()]) {
            case 1:
                return new i();
            case 2:
                return new b(null);
            case 3:
                return y.N(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004", new Object[]{"bitField0_", "applicationInfo_", "traceMetric_", "networkRequestMetric_", "gaugeMetric_", "transportInfo_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                a1<i> a1Var = PARSER;
                if (a1Var == null) {
                    synchronized (i.class) {
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

    public c W() {
        c cVar = this.applicationInfo_;
        return cVar == null ? c.Y() : cVar;
    }

    public boolean X() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // b7.j
    public boolean c() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // b7.j
    public g h() {
        g gVar = this.gaugeMetric_;
        return gVar == null ? g.c0() : gVar;
    }

    @Override // b7.j
    public boolean l() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // b7.j
    public m n() {
        m mVar = this.traceMetric_;
        return mVar == null ? m.l0() : mVar;
    }

    @Override // b7.j
    public boolean s() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // b7.j
    public h t() {
        h hVar = this.networkRequestMetric_;
        return hVar == null ? h.k0() : hVar;
    }
}
