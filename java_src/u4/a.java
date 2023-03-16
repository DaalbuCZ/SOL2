package u4;

import android.app.PendingIntent;
import java.util.Map;
/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private final String f15396a;

    /* renamed from: b  reason: collision with root package name */
    private final int f15397b;

    /* renamed from: c  reason: collision with root package name */
    private final int f15398c;

    /* renamed from: d  reason: collision with root package name */
    private final int f15399d;

    /* renamed from: e  reason: collision with root package name */
    private final Integer f15400e;

    /* renamed from: f  reason: collision with root package name */
    private final int f15401f;

    /* renamed from: g  reason: collision with root package name */
    private final long f15402g;

    /* renamed from: h  reason: collision with root package name */
    private final long f15403h;

    /* renamed from: i  reason: collision with root package name */
    private final long f15404i;

    /* renamed from: j  reason: collision with root package name */
    private final long f15405j;

    /* renamed from: k  reason: collision with root package name */
    private final PendingIntent f15406k;

    /* renamed from: l  reason: collision with root package name */
    private final PendingIntent f15407l;

    /* renamed from: m  reason: collision with root package name */
    private final PendingIntent f15408m;

    /* renamed from: n  reason: collision with root package name */
    private final PendingIntent f15409n;

    /* renamed from: o  reason: collision with root package name */
    private final Map f15410o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f15411p = false;

    private a(String str, int i10, int i11, int i12, Integer num, int i13, long j10, long j11, long j12, long j13, PendingIntent pendingIntent, PendingIntent pendingIntent2, PendingIntent pendingIntent3, PendingIntent pendingIntent4, Map map) {
        this.f15396a = str;
        this.f15397b = i10;
        this.f15398c = i11;
        this.f15399d = i12;
        this.f15400e = num;
        this.f15401f = i13;
        this.f15402g = j10;
        this.f15403h = j11;
        this.f15404i = j12;
        this.f15405j = j13;
        this.f15406k = pendingIntent;
        this.f15407l = pendingIntent2;
        this.f15408m = pendingIntent3;
        this.f15409n = pendingIntent4;
        this.f15410o = map;
    }

    public static a j(String str, int i10, int i11, int i12, Integer num, int i13, long j10, long j11, long j12, long j13, PendingIntent pendingIntent, PendingIntent pendingIntent2, PendingIntent pendingIntent3, PendingIntent pendingIntent4, Map map) {
        return new a(str, i10, i11, i12, num, i13, j10, j11, j12, j13, pendingIntent, pendingIntent2, pendingIntent3, pendingIntent4, map);
    }

    private final boolean m(d dVar) {
        return dVar.a() && this.f15404i <= this.f15405j;
    }

    public int a() {
        return this.f15397b;
    }

    public Integer b() {
        return this.f15400e;
    }

    public int c() {
        return this.f15399d;
    }

    public boolean d(int i10) {
        return i(d.c(i10)) != null;
    }

    public boolean e(d dVar) {
        return i(dVar) != null;
    }

    public String f() {
        return this.f15396a;
    }

    public int g() {
        return this.f15398c;
    }

    public int h() {
        return this.f15401f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final PendingIntent i(d dVar) {
        if (dVar.b() == 0) {
            PendingIntent pendingIntent = this.f15407l;
            if (pendingIntent != null) {
                return pendingIntent;
            }
            if (m(dVar)) {
                return this.f15409n;
            }
            return null;
        }
        if (dVar.b() == 1) {
            PendingIntent pendingIntent2 = this.f15406k;
            if (pendingIntent2 != null) {
                return pendingIntent2;
            }
            if (m(dVar)) {
                return this.f15408m;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void k() {
        this.f15411p = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean l() {
        return this.f15411p;
    }
}
