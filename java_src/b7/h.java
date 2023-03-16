package b7;

import com.google.protobuf.a0;
import com.google.protobuf.a1;
import com.google.protobuf.l0;
import com.google.protobuf.m0;
import com.google.protobuf.t0;
import com.google.protobuf.u1;
import com.google.protobuf.y;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public final class h extends y<h, b> implements t0 {
    public static final int CLIENT_START_TIME_US_FIELD_NUMBER = 7;
    public static final int CUSTOM_ATTRIBUTES_FIELD_NUMBER = 12;
    private static final h DEFAULT_INSTANCE;
    public static final int HTTP_METHOD_FIELD_NUMBER = 2;
    public static final int HTTP_RESPONSE_CODE_FIELD_NUMBER = 5;
    public static final int NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER = 11;
    private static volatile a1<h> PARSER = null;
    public static final int PERF_SESSIONS_FIELD_NUMBER = 13;
    public static final int REQUEST_PAYLOAD_BYTES_FIELD_NUMBER = 3;
    public static final int RESPONSE_CONTENT_TYPE_FIELD_NUMBER = 6;
    public static final int RESPONSE_PAYLOAD_BYTES_FIELD_NUMBER = 4;
    public static final int TIME_TO_REQUEST_COMPLETED_US_FIELD_NUMBER = 8;
    public static final int TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER = 10;
    public static final int TIME_TO_RESPONSE_INITIATED_US_FIELD_NUMBER = 9;
    public static final int URL_FIELD_NUMBER = 1;
    private int bitField0_;
    private long clientStartTimeUs_;
    private int httpMethod_;
    private int httpResponseCode_;
    private int networkClientErrorReason_;
    private long requestPayloadBytes_;
    private long responsePayloadBytes_;
    private long timeToRequestCompletedUs_;
    private long timeToResponseCompletedUs_;
    private long timeToResponseInitiatedUs_;
    private m0<String, String> customAttributes_ = m0.g();
    private String url_ = "";
    private String responseContentType_ = "";
    private a0.i<k> perfSessions_ = y.E();

    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f2911a;

        static {
            int[] iArr = new int[y.f.values().length];
            f2911a = iArr;
            try {
                iArr[y.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2911a[y.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2911a[y.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2911a[y.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2911a[y.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2911a[y.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f2911a[y.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends y.a<h, b> implements t0 {
        private b() {
            super(h.DEFAULT_INSTANCE);
        }

        /* synthetic */ b(a aVar) {
            this();
        }

        public b L(Iterable<? extends k> iterable) {
            F();
            ((h) this.f6215o).g0(iterable);
            return this;
        }

        public b M() {
            F();
            ((h) this.f6215o).n0().clear();
            return this;
        }

        public b N() {
            F();
            ((h) this.f6215o).h0();
            return this;
        }

        public long O() {
            return ((h) this.f6215o).u0();
        }

        public String P() {
            return ((h) this.f6215o).v0();
        }

        public boolean Q() {
            return ((h) this.f6215o).w0();
        }

        public boolean R() {
            return ((h) this.f6215o).y0();
        }

        public boolean S() {
            return ((h) this.f6215o).C0();
        }

        public b T(Map<String, String> map) {
            F();
            ((h) this.f6215o).n0().putAll(map);
            return this;
        }

        public b U(long j10) {
            F();
            ((h) this.f6215o).G0(j10);
            return this;
        }

        public b V(d dVar) {
            F();
            ((h) this.f6215o).H0(dVar);
            return this;
        }

        public b W(int i10) {
            F();
            ((h) this.f6215o).I0(i10);
            return this;
        }

        public b X(e eVar) {
            F();
            ((h) this.f6215o).J0(eVar);
            return this;
        }

        public b Y(long j10) {
            F();
            ((h) this.f6215o).K0(j10);
            return this;
        }

        public b Z(String str) {
            F();
            ((h) this.f6215o).L0(str);
            return this;
        }

        public b a0(long j10) {
            F();
            ((h) this.f6215o).M0(j10);
            return this;
        }

        public b b0(long j10) {
            F();
            ((h) this.f6215o).N0(j10);
            return this;
        }

        public b c0(long j10) {
            F();
            ((h) this.f6215o).O0(j10);
            return this;
        }

        public b d0(long j10) {
            F();
            ((h) this.f6215o).P0(j10);
            return this;
        }

        public b e0(String str) {
            F();
            ((h) this.f6215o).Q0(str);
            return this;
        }
    }

    /* loaded from: classes.dex */
    private static final class c {

        /* renamed from: a  reason: collision with root package name */
        static final l0<String, String> f2912a;

        static {
            u1.b bVar = u1.b.f6127x;
            f2912a = l0.d(bVar, "", bVar, "");
        }
    }

    /* loaded from: classes.dex */
    public enum d implements a0.c {
        HTTP_METHOD_UNKNOWN(0),
        GET(1),
        PUT(2),
        POST(3),
        DELETE(4),
        HEAD(5),
        PATCH(6),
        OPTIONS(7),
        TRACE(8),
        CONNECT(9);
        

        /* renamed from: y  reason: collision with root package name */
        private static final a0.d<d> f2923y = new a();

        /* renamed from: n  reason: collision with root package name */
        private final int f2925n;

        /* loaded from: classes.dex */
        class a implements a0.d<d> {
            a() {
            }

            @Override // com.google.protobuf.a0.d
            /* renamed from: b */
            public d a(int i10) {
                return d.e(i10);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes.dex */
        public static final class b implements a0.e {

            /* renamed from: a  reason: collision with root package name */
            static final a0.e f2926a = new b();

            private b() {
            }

            @Override // com.google.protobuf.a0.e
            public boolean a(int i10) {
                return d.e(i10) != null;
            }
        }

        d(int i10) {
            this.f2925n = i10;
        }

        public static d e(int i10) {
            switch (i10) {
                case 0:
                    return HTTP_METHOD_UNKNOWN;
                case 1:
                    return GET;
                case 2:
                    return PUT;
                case 3:
                    return POST;
                case 4:
                    return DELETE;
                case 5:
                    return HEAD;
                case 6:
                    return PATCH;
                case 7:
                    return OPTIONS;
                case 8:
                    return TRACE;
                case 9:
                    return CONNECT;
                default:
                    return null;
            }
        }

        public static a0.e g() {
            return b.f2926a;
        }

        @Override // com.google.protobuf.a0.c
        public final int d() {
            return this.f2925n;
        }
    }

    /* loaded from: classes.dex */
    public enum e implements a0.c {
        NETWORK_CLIENT_ERROR_REASON_UNKNOWN(0),
        GENERIC_CLIENT_ERROR(1);
        

        /* renamed from: q  reason: collision with root package name */
        private static final a0.d<e> f2929q = new a();

        /* renamed from: n  reason: collision with root package name */
        private final int f2931n;

        /* loaded from: classes.dex */
        class a implements a0.d<e> {
            a() {
            }

            @Override // com.google.protobuf.a0.d
            /* renamed from: b */
            public e a(int i10) {
                return e.e(i10);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes.dex */
        public static final class b implements a0.e {

            /* renamed from: a  reason: collision with root package name */
            static final a0.e f2932a = new b();

            private b() {
            }

            @Override // com.google.protobuf.a0.e
            public boolean a(int i10) {
                return e.e(i10) != null;
            }
        }

        e(int i10) {
            this.f2931n = i10;
        }

        public static e e(int i10) {
            if (i10 != 0) {
                if (i10 != 1) {
                    return null;
                }
                return GENERIC_CLIENT_ERROR;
            }
            return NETWORK_CLIENT_ERROR_REASON_UNKNOWN;
        }

        public static a0.e g() {
            return b.f2932a;
        }

        @Override // com.google.protobuf.a0.c
        public final int d() {
            return this.f2931n;
        }
    }

    static {
        h hVar = new h();
        DEFAULT_INSTANCE = hVar;
        y.P(h.class, hVar);
    }

    private h() {
    }

    private m0<String, String> E0() {
        if (!this.customAttributes_.m()) {
            this.customAttributes_ = this.customAttributes_.q();
        }
        return this.customAttributes_;
    }

    public static b F0() {
        return DEFAULT_INSTANCE.z();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G0(long j10) {
        this.bitField0_ |= 128;
        this.clientStartTimeUs_ = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H0(d dVar) {
        this.httpMethod_ = dVar.d();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void I0(int i10) {
        this.bitField0_ |= 32;
        this.httpResponseCode_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J0(e eVar) {
        this.networkClientErrorReason_ = eVar.d();
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void K0(long j10) {
        this.bitField0_ |= 4;
        this.requestPayloadBytes_ = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L0(String str) {
        str.getClass();
        this.bitField0_ |= 64;
        this.responseContentType_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void M0(long j10) {
        this.bitField0_ |= 8;
        this.responsePayloadBytes_ = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N0(long j10) {
        this.bitField0_ |= 256;
        this.timeToRequestCompletedUs_ = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void O0(long j10) {
        this.bitField0_ |= 1024;
        this.timeToResponseCompletedUs_ = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void P0(long j10) {
        this.bitField0_ |= 512;
        this.timeToResponseInitiatedUs_ = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Q0(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.url_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g0(Iterable<? extends k> iterable) {
        i0();
        com.google.protobuf.a.b(iterable, this.perfSessions_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h0() {
        this.bitField0_ &= -65;
        this.responseContentType_ = k0().q0();
    }

    private void i0() {
        a0.i<k> iVar = this.perfSessions_;
        if (iVar.B()) {
            return;
        }
        this.perfSessions_ = y.L(iVar);
    }

    public static h k0() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, String> n0() {
        return E0();
    }

    public boolean A0() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean B0() {
        return (this.bitField0_ & 256) != 0;
    }

    @Override // com.google.protobuf.y
    protected final Object C(y.f fVar, Object obj, Object obj2) {
        switch (a.f2911a[fVar.ordinal()]) {
            case 1:
                return new h();
            case 2:
                return new b(null);
            case 3:
                return y.N(DEFAULT_INSTANCE, "\u0001\r\u0000\u0001\u0001\r\r\u0001\u0001\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005င\u0005\u0006ဈ\u0006\u0007ဂ\u0007\bဂ\b\tဂ\t\nဂ\n\u000bဌ\u0004\f2\r\u001b", new Object[]{"bitField0_", "url_", "httpMethod_", d.g(), "requestPayloadBytes_", "responsePayloadBytes_", "httpResponseCode_", "responseContentType_", "clientStartTimeUs_", "timeToRequestCompletedUs_", "timeToResponseInitiatedUs_", "timeToResponseCompletedUs_", "networkClientErrorReason_", e.g(), "customAttributes_", c.f2912a, "perfSessions_", k.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                a1<h> a1Var = PARSER;
                if (a1Var == null) {
                    synchronized (h.class) {
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

    public boolean C0() {
        return (this.bitField0_ & 1024) != 0;
    }

    public boolean D0() {
        return (this.bitField0_ & 512) != 0;
    }

    public long j0() {
        return this.clientStartTimeUs_;
    }

    public d l0() {
        d e10 = d.e(this.httpMethod_);
        return e10 == null ? d.HTTP_METHOD_UNKNOWN : e10;
    }

    public int m0() {
        return this.httpResponseCode_;
    }

    public List<k> o0() {
        return this.perfSessions_;
    }

    public long p0() {
        return this.requestPayloadBytes_;
    }

    public String q0() {
        return this.responseContentType_;
    }

    public long r0() {
        return this.responsePayloadBytes_;
    }

    public long s0() {
        return this.timeToRequestCompletedUs_;
    }

    public long t0() {
        return this.timeToResponseCompletedUs_;
    }

    public long u0() {
        return this.timeToResponseInitiatedUs_;
    }

    public String v0() {
        return this.url_;
    }

    public boolean w0() {
        return (this.bitField0_ & 128) != 0;
    }

    public boolean x0() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean y0() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean z0() {
        return (this.bitField0_ & 4) != 0;
    }
}
