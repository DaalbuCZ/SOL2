package b7;

import b7.a;
import com.google.protobuf.a1;
import com.google.protobuf.l0;
import com.google.protobuf.m0;
import com.google.protobuf.t0;
import com.google.protobuf.u1;
import com.google.protobuf.y;
import java.util.Map;
/* loaded from: classes.dex */
public final class c extends y<c, b> implements t0 {
    public static final int ANDROID_APP_INFO_FIELD_NUMBER = 3;
    public static final int APPLICATION_PROCESS_STATE_FIELD_NUMBER = 5;
    public static final int APP_INSTANCE_ID_FIELD_NUMBER = 2;
    public static final int CUSTOM_ATTRIBUTES_FIELD_NUMBER = 6;
    private static final c DEFAULT_INSTANCE;
    public static final int GOOGLE_APP_ID_FIELD_NUMBER = 1;
    private static volatile a1<c> PARSER;
    private b7.a androidAppInfo_;
    private int applicationProcessState_;
    private int bitField0_;
    private m0<String, String> customAttributes_ = m0.g();
    private String googleAppId_ = "";
    private String appInstanceId_ = "";

    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f2898a;

        static {
            int[] iArr = new int[y.f.values().length];
            f2898a = iArr;
            try {
                iArr[y.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2898a[y.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2898a[y.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2898a[y.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2898a[y.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2898a[y.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f2898a[y.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends y.a<c, b> implements t0 {
        private b() {
            super(c.DEFAULT_INSTANCE);
        }

        /* synthetic */ b(a aVar) {
            this();
        }

        public boolean L() {
            return ((c) this.f6215o).b0();
        }

        public b M(Map<String, String> map) {
            F();
            ((c) this.f6215o).Z().putAll(map);
            return this;
        }

        public b N(a.b bVar) {
            F();
            ((c) this.f6215o).g0(bVar.a());
            return this;
        }

        public b O(String str) {
            F();
            ((c) this.f6215o).h0(str);
            return this;
        }

        public b P(d dVar) {
            F();
            ((c) this.f6215o).i0(dVar);
            return this;
        }

        public b Q(String str) {
            F();
            ((c) this.f6215o).j0(str);
            return this;
        }
    }

    /* renamed from: b7.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    private static final class C0066c {

        /* renamed from: a  reason: collision with root package name */
        static final l0<String, String> f2899a;

        static {
            u1.b bVar = u1.b.f6127x;
            f2899a = l0.d(bVar, "", bVar, "");
        }
    }

    static {
        c cVar = new c();
        DEFAULT_INSTANCE = cVar;
        y.P(c.class, cVar);
    }

    private c() {
    }

    public static c Y() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, String> Z() {
        return e0();
    }

    private m0<String, String> e0() {
        if (!this.customAttributes_.m()) {
            this.customAttributes_ = this.customAttributes_.q();
        }
        return this.customAttributes_;
    }

    public static b f0() {
        return DEFAULT_INSTANCE.z();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g0(b7.a aVar) {
        aVar.getClass();
        this.androidAppInfo_ = aVar;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h0(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.appInstanceId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i0(d dVar) {
        this.applicationProcessState_ = dVar.d();
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j0(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.googleAppId_ = str;
    }

    @Override // com.google.protobuf.y
    protected final Object C(y.f fVar, Object obj, Object obj2) {
        switch (a.f2898a[fVar.ordinal()]) {
            case 1:
                return new c();
            case 2:
                return new b(null);
            case 3:
                return y.N(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0001\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0005ဌ\u0003\u00062", new Object[]{"bitField0_", "googleAppId_", "appInstanceId_", "androidAppInfo_", "applicationProcessState_", d.g(), "customAttributes_", C0066c.f2899a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                a1<c> a1Var = PARSER;
                if (a1Var == null) {
                    synchronized (c.class) {
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

    public b7.a X() {
        b7.a aVar = this.androidAppInfo_;
        return aVar == null ? b7.a.V() : aVar;
    }

    public boolean a0() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean b0() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean c0() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean d0() {
        return (this.bitField0_ & 1) != 0;
    }
}
