package b7;

import com.google.protobuf.a0;
import com.google.protobuf.a1;
import com.google.protobuf.t0;
import com.google.protobuf.y;
/* loaded from: classes.dex */
public final class g extends y<g, b> implements t0 {
    public static final int ANDROID_MEMORY_READINGS_FIELD_NUMBER = 4;
    public static final int CPU_METRIC_READINGS_FIELD_NUMBER = 2;
    private static final g DEFAULT_INSTANCE;
    public static final int GAUGE_METADATA_FIELD_NUMBER = 3;
    private static volatile a1<g> PARSER = null;
    public static final int SESSION_ID_FIELD_NUMBER = 1;
    private int bitField0_;
    private f gaugeMetadata_;
    private String sessionId_ = "";
    private a0.i<e> cpuMetricReadings_ = y.E();
    private a0.i<b7.b> androidMemoryReadings_ = y.E();

    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f2910a;

        static {
            int[] iArr = new int[y.f.values().length];
            f2910a = iArr;
            try {
                iArr[y.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2910a[y.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2910a[y.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2910a[y.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2910a[y.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2910a[y.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f2910a[y.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends y.a<g, b> implements t0 {
        private b() {
            super(g.DEFAULT_INSTANCE);
        }

        /* synthetic */ b(a aVar) {
            this();
        }

        public b L(b7.b bVar) {
            F();
            ((g) this.f6215o).W(bVar);
            return this;
        }

        public b M(e eVar) {
            F();
            ((g) this.f6215o).X(eVar);
            return this;
        }

        public b N(f fVar) {
            F();
            ((g) this.f6215o).h0(fVar);
            return this;
        }

        public b O(String str) {
            F();
            ((g) this.f6215o).i0(str);
            return this;
        }
    }

    static {
        g gVar = new g();
        DEFAULT_INSTANCE = gVar;
        y.P(g.class, gVar);
    }

    private g() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void W(b7.b bVar) {
        bVar.getClass();
        Y();
        this.androidMemoryReadings_.add(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void X(e eVar) {
        eVar.getClass();
        Z();
        this.cpuMetricReadings_.add(eVar);
    }

    private void Y() {
        a0.i<b7.b> iVar = this.androidMemoryReadings_;
        if (iVar.B()) {
            return;
        }
        this.androidMemoryReadings_ = y.L(iVar);
    }

    private void Z() {
        a0.i<e> iVar = this.cpuMetricReadings_;
        if (iVar.B()) {
            return;
        }
        this.cpuMetricReadings_ = y.L(iVar);
    }

    public static g c0() {
        return DEFAULT_INSTANCE;
    }

    public static b g0() {
        return DEFAULT_INSTANCE.z();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h0(f fVar) {
        fVar.getClass();
        this.gaugeMetadata_ = fVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i0(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.sessionId_ = str;
    }

    @Override // com.google.protobuf.y
    protected final Object C(y.f fVar, Object obj, Object obj2) {
        switch (a.f2910a[fVar.ordinal()]) {
            case 1:
                return new g();
            case 2:
                return new b(null);
            case 3:
                return y.N(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဉ\u0001\u0004\u001b", new Object[]{"bitField0_", "sessionId_", "cpuMetricReadings_", e.class, "gaugeMetadata_", "androidMemoryReadings_", b7.b.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                a1<g> a1Var = PARSER;
                if (a1Var == null) {
                    synchronized (g.class) {
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

    public int a0() {
        return this.androidMemoryReadings_.size();
    }

    public int b0() {
        return this.cpuMetricReadings_.size();
    }

    public f d0() {
        f fVar = this.gaugeMetadata_;
        return fVar == null ? f.V() : fVar;
    }

    public boolean e0() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean f0() {
        return (this.bitField0_ & 1) != 0;
    }
}
