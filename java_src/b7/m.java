package b7;

import com.google.protobuf.a0;
import com.google.protobuf.a1;
import com.google.protobuf.l0;
import com.google.protobuf.m0;
import com.google.protobuf.t0;
import com.google.protobuf.u1;
import com.google.protobuf.y;
import java.util.Collections;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public final class m extends y<m, b> implements t0 {
    public static final int CLIENT_START_TIME_US_FIELD_NUMBER = 4;
    public static final int COUNTERS_FIELD_NUMBER = 6;
    public static final int CUSTOM_ATTRIBUTES_FIELD_NUMBER = 8;
    private static final m DEFAULT_INSTANCE;
    public static final int DURATION_US_FIELD_NUMBER = 5;
    public static final int IS_AUTO_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile a1<m> PARSER = null;
    public static final int PERF_SESSIONS_FIELD_NUMBER = 9;
    public static final int SUBTRACES_FIELD_NUMBER = 7;
    private int bitField0_;
    private long clientStartTimeUs_;
    private long durationUs_;
    private boolean isAuto_;
    private m0<String, Long> counters_ = m0.g();
    private m0<String, String> customAttributes_ = m0.g();
    private String name_ = "";
    private a0.i<m> subtraces_ = y.E();
    private a0.i<k> perfSessions_ = y.E();

    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f2941a;

        static {
            int[] iArr = new int[y.f.values().length];
            f2941a = iArr;
            try {
                iArr[y.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2941a[y.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2941a[y.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2941a[y.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2941a[y.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2941a[y.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f2941a[y.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends y.a<m, b> implements t0 {
        private b() {
            super(m.DEFAULT_INSTANCE);
        }

        /* synthetic */ b(a aVar) {
            this();
        }

        public b L(Iterable<? extends k> iterable) {
            F();
            ((m) this.f6215o).b0(iterable);
            return this;
        }

        public b M(Iterable<? extends m> iterable) {
            F();
            ((m) this.f6215o).c0(iterable);
            return this;
        }

        public b N(k kVar) {
            F();
            ((m) this.f6215o).d0(kVar);
            return this;
        }

        public b O(m mVar) {
            F();
            ((m) this.f6215o).e0(mVar);
            return this;
        }

        public b P(Map<String, Long> map) {
            F();
            ((m) this.f6215o).n0().putAll(map);
            return this;
        }

        public b Q(Map<String, String> map) {
            F();
            ((m) this.f6215o).o0().putAll(map);
            return this;
        }

        public b R(String str, long j10) {
            str.getClass();
            F();
            ((m) this.f6215o).n0().put(str, Long.valueOf(j10));
            return this;
        }

        public b S(String str, String str2) {
            str.getClass();
            str2.getClass();
            F();
            ((m) this.f6215o).o0().put(str, str2);
            return this;
        }

        public b T(long j10) {
            F();
            ((m) this.f6215o).y0(j10);
            return this;
        }

        public b U(long j10) {
            F();
            ((m) this.f6215o).z0(j10);
            return this;
        }

        public b V(String str) {
            F();
            ((m) this.f6215o).A0(str);
            return this;
        }
    }

    /* loaded from: classes.dex */
    private static final class c {

        /* renamed from: a  reason: collision with root package name */
        static final l0<String, Long> f2942a = l0.d(u1.b.f6127x, "", u1.b.f6121r, 0L);
    }

    /* loaded from: classes.dex */
    private static final class d {

        /* renamed from: a  reason: collision with root package name */
        static final l0<String, String> f2943a;

        static {
            u1.b bVar = u1.b.f6127x;
            f2943a = l0.d(bVar, "", bVar, "");
        }
    }

    static {
        m mVar = new m();
        DEFAULT_INSTANCE = mVar;
        y.P(m.class, mVar);
    }

    private m() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b0(Iterable<? extends k> iterable) {
        g0();
        com.google.protobuf.a.b(iterable, this.perfSessions_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c0(Iterable<? extends m> iterable) {
        h0();
        com.google.protobuf.a.b(iterable, this.subtraces_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d0(k kVar) {
        kVar.getClass();
        g0();
        this.perfSessions_.add(kVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e0(m mVar) {
        mVar.getClass();
        h0();
        this.subtraces_.add(mVar);
    }

    private void g0() {
        a0.i<k> iVar = this.perfSessions_;
        if (iVar.B()) {
            return;
        }
        this.perfSessions_ = y.L(iVar);
    }

    private void h0() {
        a0.i<m> iVar = this.subtraces_;
        if (iVar.B()) {
            return;
        }
        this.subtraces_ = y.L(iVar);
    }

    public static m l0() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, Long> n0() {
        return v0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, String> o0() {
        return w0();
    }

    private m0<String, Long> t0() {
        return this.counters_;
    }

    private m0<String, String> u0() {
        return this.customAttributes_;
    }

    private m0<String, Long> v0() {
        if (!this.counters_.m()) {
            this.counters_ = this.counters_.q();
        }
        return this.counters_;
    }

    private m0<String, String> w0() {
        if (!this.customAttributes_.m()) {
            this.customAttributes_ = this.customAttributes_.q();
        }
        return this.customAttributes_;
    }

    public static b x0() {
        return DEFAULT_INSTANCE.z();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y0(long j10) {
        this.bitField0_ |= 4;
        this.clientStartTimeUs_ = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z0(long j10) {
        this.bitField0_ |= 8;
        this.durationUs_ = j10;
    }

    @Override // com.google.protobuf.y
    protected final Object C(y.f fVar, Object obj, Object obj2) {
        switch (a.f2941a[fVar.ordinal()]) {
            case 1:
                return new m();
            case 2:
                return new b(null);
            case 3:
                return y.N(DEFAULT_INSTANCE, "\u0001\b\u0000\u0001\u0001\t\b\u0002\u0002\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0004ဂ\u0002\u0005ဂ\u0003\u00062\u0007\u001b\b2\t\u001b", new Object[]{"bitField0_", "name_", "isAuto_", "clientStartTimeUs_", "durationUs_", "counters_", c.f2942a, "subtraces_", m.class, "customAttributes_", d.f2943a, "perfSessions_", k.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                a1<m> a1Var = PARSER;
                if (a1Var == null) {
                    synchronized (m.class) {
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

    public boolean f0(String str) {
        str.getClass();
        return u0().containsKey(str);
    }

    public int i0() {
        return t0().size();
    }

    public Map<String, Long> j0() {
        return Collections.unmodifiableMap(t0());
    }

    public Map<String, String> k0() {
        return Collections.unmodifiableMap(u0());
    }

    public long m0() {
        return this.durationUs_;
    }

    public String p0() {
        return this.name_;
    }

    public List<k> q0() {
        return this.perfSessions_;
    }

    public List<m> r0() {
        return this.subtraces_;
    }

    public boolean s0() {
        return (this.bitField0_ & 4) != 0;
    }
}
