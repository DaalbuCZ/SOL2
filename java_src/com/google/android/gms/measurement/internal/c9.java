package com.google.android.gms.measurement.internal;

import a4.b;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.je;
import com.google.android.gms.internal.measurement.na;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPOutputStream;
/* loaded from: classes.dex */
public final class c9 extends q8 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public c9(a9 a9Var) {
        super(a9Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static na C(na naVar, byte[] bArr) {
        com.google.android.gms.internal.measurement.u8 a10 = com.google.android.gms.internal.measurement.u8.a();
        return a10 != null ? naVar.B(bArr, a10) : naVar.f(bArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static List H(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i10 = 0; i10 < length; i10++) {
            long j10 = 0;
            for (int i11 = 0; i11 < 64; i11++) {
                int i12 = (i10 * 64) + i11;
                if (i12 >= bitSet.length()) {
                    break;
                }
                if (bitSet.get(i12)) {
                    j10 |= 1 << i11;
                }
            }
            arrayList.add(Long.valueOf(j10));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean L(List list, int i10) {
        if (i10 < list.size() * 64) {
            return ((1 << (i10 % 64)) & ((Long) list.get(i10 / 64)).longValue()) != 0;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean N(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final void P(com.google.android.gms.internal.measurement.r4 r4Var, String str, Object obj) {
        List N = r4Var.N();
        int i10 = 0;
        while (true) {
            if (i10 >= N.size()) {
                i10 = -1;
                break;
            } else if (str.equals(((com.google.android.gms.internal.measurement.w4) N.get(i10)).K())) {
                break;
            } else {
                i10++;
            }
        }
        com.google.android.gms.internal.measurement.v4 I = com.google.android.gms.internal.measurement.w4.I();
        I.H(str);
        if (obj instanceof Long) {
            I.G(((Long) obj).longValue());
        }
        if (i10 >= 0) {
            r4Var.H(i10, I);
        } else {
            r4Var.C(I);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final boolean m(v vVar, n9 n9Var) {
        z3.o.i(vVar);
        z3.o.i(n9Var);
        return (TextUtils.isEmpty(n9Var.f4818o) && TextUtils.isEmpty(n9Var.D)) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final com.google.android.gms.internal.measurement.w4 n(com.google.android.gms.internal.measurement.s4 s4Var, String str) {
        for (com.google.android.gms.internal.measurement.w4 w4Var : s4Var.M()) {
            if (w4Var.K().equals(str)) {
                return w4Var;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Object o(com.google.android.gms.internal.measurement.s4 s4Var, String str) {
        com.google.android.gms.internal.measurement.w4 n10 = n(s4Var, str);
        if (n10 != null) {
            if (n10.b0()) {
                return n10.L();
            }
            if (n10.Z()) {
                return Long.valueOf(n10.H());
            }
            if (n10.X()) {
                return Double.valueOf(n10.E());
            }
            if (n10.G() > 0) {
                List<com.google.android.gms.internal.measurement.w4> M = n10.M();
                ArrayList arrayList = new ArrayList();
                for (com.google.android.gms.internal.measurement.w4 w4Var : M) {
                    if (w4Var != null) {
                        Bundle bundle = new Bundle();
                        for (com.google.android.gms.internal.measurement.w4 w4Var2 : w4Var.M()) {
                            if (w4Var2.b0()) {
                                bundle.putString(w4Var2.K(), w4Var2.L());
                            } else if (w4Var2.Z()) {
                                bundle.putLong(w4Var2.K(), w4Var2.H());
                            } else if (w4Var2.X()) {
                                bundle.putDouble(w4Var2.K(), w4Var2.E());
                            }
                        }
                        if (!bundle.isEmpty()) {
                            arrayList.add(bundle);
                        }
                    }
                }
                return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
            }
            return null;
        }
        return null;
    }

    private final void p(StringBuilder sb, int i10, List list) {
        if (list == null) {
            return;
        }
        int i11 = i10 + 1;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            com.google.android.gms.internal.measurement.w4 w4Var = (com.google.android.gms.internal.measurement.w4) it.next();
            if (w4Var != null) {
                r(sb, i11);
                sb.append("param {\n");
                u(sb, i11, "name", w4Var.a0() ? this.f4438a.D().e(w4Var.K()) : null);
                u(sb, i11, "string_value", w4Var.b0() ? w4Var.L() : null);
                u(sb, i11, "int_value", w4Var.Z() ? Long.valueOf(w4Var.H()) : null);
                u(sb, i11, "double_value", w4Var.X() ? Double.valueOf(w4Var.E()) : null);
                if (w4Var.G() > 0) {
                    p(sb, i11, w4Var.M());
                }
                r(sb, i11);
                sb.append("}\n");
            }
        }
    }

    private final void q(StringBuilder sb, int i10, com.google.android.gms.internal.measurement.k3 k3Var) {
        String str;
        if (k3Var == null) {
            return;
        }
        r(sb, i10);
        sb.append("filter {\n");
        if (k3Var.L()) {
            u(sb, i10, "complement", Boolean.valueOf(k3Var.K()));
        }
        if (k3Var.N()) {
            u(sb, i10, "param_name", this.f4438a.D().e(k3Var.I()));
        }
        if (k3Var.O()) {
            int i11 = i10 + 1;
            com.google.android.gms.internal.measurement.w3 H = k3Var.H();
            if (H != null) {
                r(sb, i11);
                sb.append("string_filter {\n");
                if (H.M()) {
                    switch (H.N()) {
                        case 1:
                            str = "UNKNOWN_MATCH_TYPE";
                            break;
                        case 2:
                            str = "REGEXP";
                            break;
                        case 3:
                            str = "BEGINS_WITH";
                            break;
                        case 4:
                            str = "ENDS_WITH";
                            break;
                        case 5:
                            str = "PARTIAL";
                            break;
                        case 6:
                            str = "EXACT";
                            break;
                        default:
                            str = "IN_LIST";
                            break;
                    }
                    u(sb, i11, "match_type", str);
                }
                if (H.L()) {
                    u(sb, i11, "expression", H.H());
                }
                if (H.K()) {
                    u(sb, i11, "case_sensitive", Boolean.valueOf(H.J()));
                }
                if (H.E() > 0) {
                    r(sb, i11 + 1);
                    sb.append("expression_list {\n");
                    for (String str2 : H.I()) {
                        r(sb, i11 + 2);
                        sb.append(str2);
                        sb.append("\n");
                    }
                    sb.append("}\n");
                }
                r(sb, i11);
                sb.append("}\n");
            }
        }
        if (k3Var.M()) {
            v(sb, i10 + 1, "number_filter", k3Var.G());
        }
        r(sb, i10);
        sb.append("}\n");
    }

    private static final void r(StringBuilder sb, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            sb.append("  ");
        }
    }

    private static final String s(boolean z10, boolean z11, boolean z12) {
        StringBuilder sb = new StringBuilder();
        if (z10) {
            sb.append("Dynamic ");
        }
        if (z11) {
            sb.append("Sequence ");
        }
        if (z12) {
            sb.append("Session-Scoped ");
        }
        return sb.toString();
    }

    private static final void t(StringBuilder sb, int i10, String str, com.google.android.gms.internal.measurement.i5 i5Var) {
        if (i5Var == null) {
            return;
        }
        r(sb, 3);
        sb.append(str);
        sb.append(" {\n");
        if (i5Var.F() != 0) {
            r(sb, 4);
            sb.append("results: ");
            int i11 = 0;
            for (Long l10 : i5Var.O()) {
                int i12 = i11 + 1;
                if (i11 != 0) {
                    sb.append(", ");
                }
                sb.append(l10);
                i11 = i12;
            }
            sb.append('\n');
        }
        if (i5Var.H() != 0) {
            r(sb, 4);
            sb.append("status: ");
            int i13 = 0;
            for (Long l11 : i5Var.Q()) {
                int i14 = i13 + 1;
                if (i13 != 0) {
                    sb.append(", ");
                }
                sb.append(l11);
                i13 = i14;
            }
            sb.append('\n');
        }
        if (i5Var.E() != 0) {
            r(sb, 4);
            sb.append("dynamic_filter_timestamps: {");
            int i15 = 0;
            for (com.google.android.gms.internal.measurement.q4 q4Var : i5Var.N()) {
                int i16 = i15 + 1;
                if (i15 != 0) {
                    sb.append(", ");
                }
                sb.append(q4Var.L() ? Integer.valueOf(q4Var.E()) : null);
                sb.append(":");
                sb.append(q4Var.K() ? Long.valueOf(q4Var.F()) : null);
                i15 = i16;
            }
            sb.append("}\n");
        }
        if (i5Var.G() != 0) {
            r(sb, 4);
            sb.append("sequence_filter_timestamps: {");
            int i17 = 0;
            for (com.google.android.gms.internal.measurement.k5 k5Var : i5Var.P()) {
                int i18 = i17 + 1;
                if (i17 != 0) {
                    sb.append(", ");
                }
                sb.append(k5Var.M() ? Integer.valueOf(k5Var.F()) : null);
                sb.append(": [");
                int i19 = 0;
                for (Long l12 : k5Var.J()) {
                    long longValue = l12.longValue();
                    int i20 = i19 + 1;
                    if (i19 != 0) {
                        sb.append(", ");
                    }
                    sb.append(longValue);
                    i19 = i20;
                }
                sb.append("]");
                i17 = i18;
            }
            sb.append("}\n");
        }
        r(sb, 3);
        sb.append("}\n");
    }

    private static final void u(StringBuilder sb, int i10, String str, Object obj) {
        if (obj == null) {
            return;
        }
        r(sb, i10 + 1);
        sb.append(str);
        sb.append(": ");
        sb.append(obj);
        sb.append('\n');
    }

    private static final void v(StringBuilder sb, int i10, String str, com.google.android.gms.internal.measurement.p3 p3Var) {
        if (p3Var == null) {
            return;
        }
        r(sb, i10);
        sb.append(str);
        sb.append(" {\n");
        if (p3Var.K()) {
            int P = p3Var.P();
            u(sb, i10, "comparison_type", P != 1 ? P != 2 ? P != 3 ? P != 4 ? "BETWEEN" : "EQUAL" : "GREATER_THAN" : "LESS_THAN" : "UNKNOWN_COMPARISON_TYPE");
        }
        if (p3Var.M()) {
            u(sb, i10, "match_as_float", Boolean.valueOf(p3Var.J()));
        }
        if (p3Var.L()) {
            u(sb, i10, "comparison_value", p3Var.G());
        }
        if (p3Var.O()) {
            u(sb, i10, "min_comparison_value", p3Var.I());
        }
        if (p3Var.N()) {
            u(sb, i10, "max_comparison_value", p3Var.H());
        }
        r(sb, i10);
        sb.append("}\n");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int w(com.google.android.gms.internal.measurement.c5 c5Var, String str) {
        for (int i10 = 0; i10 < c5Var.t0(); i10++) {
            if (str.equals(c5Var.n0(i10).J())) {
                return i10;
            }
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final v A(com.google.android.gms.internal.measurement.b bVar) {
        Object obj;
        Bundle y10 = y(bVar.e(), true);
        String obj2 = (!y10.containsKey("_o") || (obj = y10.get("_o")) == null) ? "app" : obj.toString();
        String b10 = p4.q.b(bVar.d());
        if (b10 == null) {
            b10 = bVar.d();
        }
        return new v(b10, new t(y10), obj2, bVar.a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.gms.internal.measurement.s4 B(q qVar) {
        com.google.android.gms.internal.measurement.r4 I = com.google.android.gms.internal.measurement.s4.I();
        I.J(qVar.f4904e);
        s sVar = new s(qVar.f4905f);
        while (sVar.hasNext()) {
            String next = sVar.next();
            com.google.android.gms.internal.measurement.v4 I2 = com.google.android.gms.internal.measurement.w4.I();
            I2.H(next);
            Object D = qVar.f4905f.D(next);
            z3.o.i(D);
            J(I2, D);
            I.C(I2);
        }
        return (com.google.android.gms.internal.measurement.s4) I.q();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String D(com.google.android.gms.internal.measurement.b5 b5Var) {
        if (b5Var == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nbatch {\n");
        for (com.google.android.gms.internal.measurement.d5 d5Var : b5Var.H()) {
            if (d5Var != null) {
                r(sb, 1);
                sb.append("bundle {\n");
                if (d5Var.r1()) {
                    u(sb, 1, "protocol_version", Integer.valueOf(d5Var.A1()));
                }
                je.c();
                if (this.f4438a.z().B(null, u2.f5064n0) && this.f4438a.z().B(d5Var.T1(), u2.f5068p0) && d5Var.u1()) {
                    u(sb, 1, "session_stitching_token", d5Var.O());
                }
                u(sb, 1, "platform", d5Var.M());
                if (d5Var.n1()) {
                    u(sb, 1, "gmp_version", Long.valueOf(d5Var.I1()));
                }
                if (d5Var.y1()) {
                    u(sb, 1, "uploading_gmp_version", Long.valueOf(d5Var.N1()));
                }
                if (d5Var.l1()) {
                    u(sb, 1, "dynamite_version", Long.valueOf(d5Var.G1()));
                }
                if (d5Var.i1()) {
                    u(sb, 1, "config_version", Long.valueOf(d5Var.E1()));
                }
                u(sb, 1, "gmp_app_id", d5Var.J());
                u(sb, 1, "admob_app_id", d5Var.S1());
                u(sb, 1, "app_id", d5Var.T1());
                u(sb, 1, "app_version", d5Var.E());
                if (d5Var.D0()) {
                    u(sb, 1, "app_version_major", Integer.valueOf(d5Var.e0()));
                }
                u(sb, 1, "firebase_instance_id", d5Var.I());
                if (d5Var.k1()) {
                    u(sb, 1, "dev_cert_hash", Long.valueOf(d5Var.F1()));
                }
                u(sb, 1, "app_store", d5Var.V1());
                if (d5Var.x1()) {
                    u(sb, 1, "upload_timestamp_millis", Long.valueOf(d5Var.M1()));
                }
                if (d5Var.v1()) {
                    u(sb, 1, "start_timestamp_millis", Long.valueOf(d5Var.L1()));
                }
                if (d5Var.m1()) {
                    u(sb, 1, "end_timestamp_millis", Long.valueOf(d5Var.H1()));
                }
                if (d5Var.q1()) {
                    u(sb, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(d5Var.K1()));
                }
                if (d5Var.p1()) {
                    u(sb, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(d5Var.J1()));
                }
                u(sb, 1, "app_instance_id", d5Var.U1());
                u(sb, 1, "resettable_device_id", d5Var.N());
                u(sb, 1, "ds_id", d5Var.H());
                if (d5Var.o1()) {
                    u(sb, 1, "limited_ad_tracking", Boolean.valueOf(d5Var.B0()));
                }
                u(sb, 1, "os_version", d5Var.L());
                u(sb, 1, "device_model", d5Var.G());
                u(sb, 1, "user_default_language", d5Var.P());
                if (d5Var.w1()) {
                    u(sb, 1, "time_zone_offset_minutes", Integer.valueOf(d5Var.C1()));
                }
                if (d5Var.E0()) {
                    u(sb, 1, "bundle_sequential_index", Integer.valueOf(d5Var.f1()));
                }
                if (d5Var.t1()) {
                    u(sb, 1, "service_upload", Boolean.valueOf(d5Var.C0()));
                }
                u(sb, 1, "health_monitor", d5Var.K());
                if (d5Var.s1()) {
                    u(sb, 1, "retry_counter", Integer.valueOf(d5Var.B1()));
                }
                if (d5Var.j1()) {
                    u(sb, 1, "consent_signals", d5Var.F());
                }
                List<com.google.android.gms.internal.measurement.m5> S = d5Var.S();
                if (S != null) {
                    for (com.google.android.gms.internal.measurement.m5 m5Var : S) {
                        if (m5Var != null) {
                            r(sb, 2);
                            sb.append("user_property {\n");
                            u(sb, 2, "set_timestamp_millis", m5Var.V() ? Long.valueOf(m5Var.G()) : null);
                            u(sb, 2, "name", this.f4438a.D().f(m5Var.J()));
                            u(sb, 2, "string_value", m5Var.K());
                            u(sb, 2, "int_value", m5Var.U() ? Long.valueOf(m5Var.F()) : null);
                            u(sb, 2, "double_value", m5Var.T() ? Double.valueOf(m5Var.E()) : null);
                            r(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                List<com.google.android.gms.internal.measurement.o4> Q = d5Var.Q();
                if (Q != null) {
                    for (com.google.android.gms.internal.measurement.o4 o4Var : Q) {
                        if (o4Var != null) {
                            r(sb, 2);
                            sb.append("audience_membership {\n");
                            if (o4Var.O()) {
                                u(sb, 2, "audience_id", Integer.valueOf(o4Var.E()));
                            }
                            if (o4Var.P()) {
                                u(sb, 2, "new_audience", Boolean.valueOf(o4Var.N()));
                            }
                            t(sb, 2, "current_data", o4Var.H());
                            if (o4Var.Q()) {
                                t(sb, 2, "previous_data", o4Var.I());
                            }
                            r(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                List<com.google.android.gms.internal.measurement.s4> R = d5Var.R();
                if (R != null) {
                    for (com.google.android.gms.internal.measurement.s4 s4Var : R) {
                        if (s4Var != null) {
                            r(sb, 2);
                            sb.append("event {\n");
                            u(sb, 2, "name", this.f4438a.D().d(s4Var.L()));
                            if (s4Var.X()) {
                                u(sb, 2, "timestamp_millis", Long.valueOf(s4Var.H()));
                            }
                            if (s4Var.W()) {
                                u(sb, 2, "previous_timestamp_millis", Long.valueOf(s4Var.G()));
                            }
                            if (s4Var.V()) {
                                u(sb, 2, "count", Integer.valueOf(s4Var.E()));
                            }
                            if (s4Var.F() != 0) {
                                p(sb, 2, s4Var.M());
                            }
                            r(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                r(sb, 1);
                sb.append("}\n");
            }
        }
        sb.append("}\n");
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String E(com.google.android.gms.internal.measurement.i3 i3Var) {
        if (i3Var == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nevent_filter {\n");
        if (i3Var.S()) {
            u(sb, 0, "filter_id", Integer.valueOf(i3Var.F()));
        }
        u(sb, 0, "event_name", this.f4438a.D().d(i3Var.K()));
        String s10 = s(i3Var.O(), i3Var.P(), i3Var.Q());
        if (!s10.isEmpty()) {
            u(sb, 0, "filter_type", s10);
        }
        if (i3Var.R()) {
            v(sb, 1, "event_count_filter", i3Var.J());
        }
        if (i3Var.E() > 0) {
            sb.append("  filters {\n");
            for (com.google.android.gms.internal.measurement.k3 k3Var : i3Var.L()) {
                q(sb, 2, k3Var);
            }
        }
        r(sb, 1);
        sb.append("}\n}\n");
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String F(com.google.android.gms.internal.measurement.r3 r3Var) {
        if (r3Var == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nproperty_filter {\n");
        if (r3Var.N()) {
            u(sb, 0, "filter_id", Integer.valueOf(r3Var.E()));
        }
        u(sb, 0, "property_name", this.f4438a.D().f(r3Var.I()));
        String s10 = s(r3Var.K(), r3Var.L(), r3Var.M());
        if (!s10.isEmpty()) {
            u(sb, 0, "filter_type", s10);
        }
        q(sb, 1, r3Var.F());
        sb.append("}\n");
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final List G(List list, List list2) {
        int i10;
        ArrayList arrayList = new ArrayList(list);
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            if (num.intValue() < 0) {
                this.f4438a.d().w().b("Ignoring negative bit index to be cleared", num);
            } else {
                int intValue = num.intValue() / 64;
                if (intValue >= arrayList.size()) {
                    this.f4438a.d().w().c("Ignoring bit index greater than bitSet size", num, Integer.valueOf(arrayList.size()));
                } else {
                    arrayList.set(intValue, Long.valueOf(((Long) arrayList.get(intValue)).longValue() & (~(1 << (num.intValue() % 64)))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i11 = size2;
            i10 = size;
            size = i11;
            if (size < 0 || ((Long) arrayList.get(size)).longValue() != 0) {
                break;
            }
            size2 = size - 1;
        }
        return arrayList.subList(0, i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0032, code lost:
        r5 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0038, code lost:
        if (r4 == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003a, code lost:
        r3 = (android.os.Parcelable[]) r3;
        r4 = r3.length;
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003e, code lost:
        if (r7 >= r4) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0040, code lost:
        r8 = r3[r7];
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0044, code lost:
        if ((r8 instanceof android.os.Bundle) == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0046, code lost:
        r5.add(I((android.os.Bundle) r8, false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004f, code lost:
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0054, code lost:
        if ((r3 instanceof java.util.ArrayList) == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0056, code lost:
        r3 = (java.util.ArrayList) r3;
        r4 = r3.size();
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005d, code lost:
        if (r7 >= r4) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005f, code lost:
        r8 = r3.get(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0065, code lost:
        if ((r8 instanceof android.os.Bundle) == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0067, code lost:
        r5.add(I((android.os.Bundle) r8, false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0070, code lost:
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0075, code lost:
        if ((r3 instanceof android.os.Bundle) == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0077, code lost:
        r5.add(I((android.os.Bundle) r3, false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0080, code lost:
        r0.put(r2, r5);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map I(android.os.Bundle r11, boolean r12) {
        /*
            r10 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Set r1 = r11.keySet()
            java.util.Iterator r1 = r1.iterator()
        Ld:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L84
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r11.get(r2)
            boolean r4 = r3 instanceof android.os.Parcelable[]
            if (r4 != 0) goto L30
            boolean r5 = r3 instanceof java.util.ArrayList
            if (r5 != 0) goto L30
            boolean r5 = r3 instanceof android.os.Bundle
            if (r5 == 0) goto L2a
            goto L30
        L2a:
            if (r3 == 0) goto Ld
            r0.put(r2, r3)
            goto Ld
        L30:
            if (r12 == 0) goto Ld
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r6 = 0
            if (r4 == 0) goto L52
            android.os.Parcelable[] r3 = (android.os.Parcelable[]) r3
            int r4 = r3.length
            r7 = r6
        L3e:
            if (r7 >= r4) goto L80
            r8 = r3[r7]
            boolean r9 = r8 instanceof android.os.Bundle
            if (r9 == 0) goto L4f
            android.os.Bundle r8 = (android.os.Bundle) r8
            java.util.Map r8 = r10.I(r8, r6)
            r5.add(r8)
        L4f:
            int r7 = r7 + 1
            goto L3e
        L52:
            boolean r4 = r3 instanceof java.util.ArrayList
            if (r4 == 0) goto L73
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            int r4 = r3.size()
            r7 = r6
        L5d:
            if (r7 >= r4) goto L80
            java.lang.Object r8 = r3.get(r7)
            boolean r9 = r8 instanceof android.os.Bundle
            if (r9 == 0) goto L70
            android.os.Bundle r8 = (android.os.Bundle) r8
            java.util.Map r8 = r10.I(r8, r6)
            r5.add(r8)
        L70:
            int r7 = r7 + 1
            goto L5d
        L73:
            boolean r4 = r3 instanceof android.os.Bundle
            if (r4 == 0) goto L80
            android.os.Bundle r3 = (android.os.Bundle) r3
            java.util.Map r3 = r10.I(r3, r6)
            r5.add(r3)
        L80:
            r0.put(r2, r5)
            goto Ld
        L84:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.c9.I(android.os.Bundle, boolean):java.util.Map");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void J(com.google.android.gms.internal.measurement.v4 v4Var, Object obj) {
        Bundle[] bundleArr;
        z3.o.i(obj);
        v4Var.E();
        v4Var.C();
        v4Var.A();
        v4Var.D();
        if (obj instanceof String) {
            v4Var.I((String) obj);
        } else if (obj instanceof Long) {
            v4Var.G(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            v4Var.F(((Double) obj).doubleValue());
        } else if (!(obj instanceof Bundle[])) {
            this.f4438a.d().r().b("Ignoring invalid (type) event param value", obj);
        } else {
            ArrayList arrayList = new ArrayList();
            for (Bundle bundle : (Bundle[]) obj) {
                if (bundle != null) {
                    com.google.android.gms.internal.measurement.v4 I = com.google.android.gms.internal.measurement.w4.I();
                    for (String str : bundle.keySet()) {
                        com.google.android.gms.internal.measurement.v4 I2 = com.google.android.gms.internal.measurement.w4.I();
                        I2.H(str);
                        Object obj2 = bundle.get(str);
                        if (obj2 instanceof Long) {
                            I2.G(((Long) obj2).longValue());
                        } else if (obj2 instanceof String) {
                            I2.I((String) obj2);
                        } else if (obj2 instanceof Double) {
                            I2.F(((Double) obj2).doubleValue());
                        }
                        I.z(I2);
                    }
                    if (I.w() > 0) {
                        arrayList.add((com.google.android.gms.internal.measurement.w4) I.q());
                    }
                }
            }
            v4Var.x(arrayList);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void K(com.google.android.gms.internal.measurement.l5 l5Var, Object obj) {
        z3.o.i(obj);
        l5Var.z();
        l5Var.x();
        l5Var.w();
        if (obj instanceof String) {
            l5Var.F((String) obj);
        } else if (obj instanceof Long) {
            l5Var.C(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            l5Var.A(((Double) obj).doubleValue());
        } else {
            this.f4438a.d().r().b("Ignoring invalid (type) user attribute value", obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean M(long j10, long j11) {
        return j10 == 0 || j11 <= 0 || Math.abs(this.f4438a.e().a() - j10) > j11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final byte[] O(byte[] bArr) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e10) {
            this.f4438a.d().r().b("Failed to gzip content", e10);
            throw e10;
        }
    }

    @Override // com.google.android.gms.measurement.internal.q8
    protected final boolean l() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long x(byte[] bArr) {
        z3.o.i(bArr);
        this.f4438a.N().h();
        MessageDigest t10 = i9.t();
        if (t10 == null) {
            this.f4438a.d().r().a("Failed to get MD5");
            return 0L;
        }
        return i9.q0(t10.digest(bArr));
    }

    final Bundle y(Map map, boolean z10) {
        String str;
        Bundle bundle = new Bundle();
        for (String str2 : map.keySet()) {
            Object obj = map.get(str2);
            if (obj == null) {
                str = null;
            } else if (obj instanceof Long) {
                bundle.putLong(str2, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str2, ((Double) obj).doubleValue());
            } else if (!(obj instanceof ArrayList)) {
                str = obj.toString();
            } else if (z10) {
                ArrayList arrayList = (ArrayList) obj;
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    arrayList2.add(y((Map) arrayList.get(i10), false));
                }
                bundle.putParcelableArray(str2, (Parcelable[]) arrayList2.toArray(new Parcelable[0]));
            }
            bundle.putString(str2, str);
        }
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Parcelable z(byte[] bArr, Parcelable.Creator creator) {
        if (bArr == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            obtain.unmarshall(bArr, 0, bArr.length);
            obtain.setDataPosition(0);
            return (Parcelable) creator.createFromParcel(obtain);
        } catch (b.a unused) {
            this.f4438a.d().r().a("Failed to load parcelable from buffer");
            return null;
        } finally {
            obtain.recycle();
        }
    }
}
