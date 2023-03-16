package g5;

import android.text.TextUtils;
import i5.a;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
/* loaded from: classes.dex */
public class b {

    /* renamed from: g  reason: collision with root package name */
    private static final String[] f7541g = {"experimentId", "experimentStartTime", "timeToLiveMillis", "triggerTimeoutMillis", "variantId"};

    /* renamed from: h  reason: collision with root package name */
    static final DateFormat f7542h = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);

    /* renamed from: a  reason: collision with root package name */
    private final String f7543a;

    /* renamed from: b  reason: collision with root package name */
    private final String f7544b;

    /* renamed from: c  reason: collision with root package name */
    private final String f7545c;

    /* renamed from: d  reason: collision with root package name */
    private final Date f7546d;

    /* renamed from: e  reason: collision with root package name */
    private final long f7547e;

    /* renamed from: f  reason: collision with root package name */
    private final long f7548f;

    public b(String str, String str2, String str3, Date date, long j10, long j11) {
        this.f7543a = str;
        this.f7544b = str2;
        this.f7545c = str3;
        this.f7546d = date;
        this.f7547e = j10;
        this.f7548f = j11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static b a(Map<String, String> map) {
        e(map);
        try {
            return new b(map.get("experimentId"), map.get("variantId"), map.containsKey("triggerEvent") ? map.get("triggerEvent") : "", f7542h.parse(map.get("experimentStartTime")), Long.parseLong(map.get("triggerTimeoutMillis")), Long.parseLong(map.get("timeToLiveMillis")));
        } catch (NumberFormatException e10) {
            throw new a("Could not process experiment: one of the durations could not be converted into a long.", e10);
        } catch (ParseException e11) {
            throw new a("Could not process experiment: parsing experiment start time failed.", e11);
        }
    }

    private static void e(Map<String, String> map) {
        String[] strArr;
        ArrayList arrayList = new ArrayList();
        for (String str : f7541g) {
            if (!map.containsKey(str)) {
                arrayList.add(str);
            }
        }
        if (!arrayList.isEmpty()) {
            throw new a(String.format("The following keys are missing from the experiment info map: %s", arrayList));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String b() {
        return this.f7543a;
    }

    long c() {
        return this.f7546d.getTime();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a.c d(String str) {
        a.c cVar = new a.c();
        cVar.f8328a = str;
        cVar.f8340m = c();
        cVar.f8329b = this.f7543a;
        cVar.f8330c = this.f7544b;
        cVar.f8331d = TextUtils.isEmpty(this.f7545c) ? null : this.f7545c;
        cVar.f8332e = this.f7547e;
        cVar.f8337j = this.f7548f;
        return cVar;
    }
}
