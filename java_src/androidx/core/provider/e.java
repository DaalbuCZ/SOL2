package androidx.core.provider;

import android.util.Base64;
import java.util.List;
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    private final String f1471a;

    /* renamed from: b  reason: collision with root package name */
    private final String f1472b;

    /* renamed from: c  reason: collision with root package name */
    private final String f1473c;

    /* renamed from: d  reason: collision with root package name */
    private final List<List<byte[]>> f1474d;

    /* renamed from: e  reason: collision with root package name */
    private final int f1475e = 0;

    /* renamed from: f  reason: collision with root package name */
    private final String f1476f;

    public e(String str, String str2, String str3, List<List<byte[]>> list) {
        this.f1471a = (String) androidx.core.util.e.b(str);
        this.f1472b = (String) androidx.core.util.e.b(str2);
        this.f1473c = (String) androidx.core.util.e.b(str3);
        this.f1474d = (List) androidx.core.util.e.b(list);
        this.f1476f = a(str, str2, str3);
    }

    private String a(String str, String str2, String str3) {
        return str + "-" + str2 + "-" + str3;
    }

    public List<List<byte[]>> b() {
        return this.f1474d;
    }

    public int c() {
        return this.f1475e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String d() {
        return this.f1476f;
    }

    public String e() {
        return this.f1471a;
    }

    public String f() {
        return this.f1472b;
    }

    public String g() {
        return this.f1473c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.f1471a + ", mProviderPackage: " + this.f1472b + ", mQuery: " + this.f1473c + ", mCertificates:");
        for (int i10 = 0; i10 < this.f1474d.size(); i10++) {
            sb.append(" [");
            List<byte[]> list = this.f1474d.get(i10);
            for (int i11 = 0; i11 < list.size(); i11++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString(list.get(i11), 0));
                sb.append("\"");
            }
            sb.append(" ]");
        }
        sb.append("}");
        sb.append("mCertificatesArray: " + this.f1475e);
        return sb.toString();
    }
}
