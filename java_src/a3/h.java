package a3;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import s1.m1;
import w1.m;
/* loaded from: classes.dex */
public class h extends i {

    /* renamed from: n  reason: collision with root package name */
    public static final h f130n = new h("", Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), null, Collections.emptyList(), false, Collections.emptyMap(), Collections.emptyList());

    /* renamed from: d  reason: collision with root package name */
    public final List<Uri> f131d;

    /* renamed from: e  reason: collision with root package name */
    public final List<b> f132e;

    /* renamed from: f  reason: collision with root package name */
    public final List<a> f133f;

    /* renamed from: g  reason: collision with root package name */
    public final List<a> f134g;

    /* renamed from: h  reason: collision with root package name */
    public final List<a> f135h;

    /* renamed from: i  reason: collision with root package name */
    public final List<a> f136i;

    /* renamed from: j  reason: collision with root package name */
    public final m1 f137j;

    /* renamed from: k  reason: collision with root package name */
    public final List<m1> f138k;

    /* renamed from: l  reason: collision with root package name */
    public final Map<String, String> f139l;

    /* renamed from: m  reason: collision with root package name */
    public final List<m> f140m;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final Uri f141a;

        /* renamed from: b  reason: collision with root package name */
        public final m1 f142b;

        /* renamed from: c  reason: collision with root package name */
        public final String f143c;

        /* renamed from: d  reason: collision with root package name */
        public final String f144d;

        public a(Uri uri, m1 m1Var, String str, String str2) {
            this.f141a = uri;
            this.f142b = m1Var;
            this.f143c = str;
            this.f144d = str2;
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final Uri f145a;

        /* renamed from: b  reason: collision with root package name */
        public final m1 f146b;

        /* renamed from: c  reason: collision with root package name */
        public final String f147c;

        /* renamed from: d  reason: collision with root package name */
        public final String f148d;

        /* renamed from: e  reason: collision with root package name */
        public final String f149e;

        /* renamed from: f  reason: collision with root package name */
        public final String f150f;

        public b(Uri uri, m1 m1Var, String str, String str2, String str3, String str4) {
            this.f145a = uri;
            this.f146b = m1Var;
            this.f147c = str;
            this.f148d = str2;
            this.f149e = str3;
            this.f150f = str4;
        }

        public static b b(Uri uri) {
            return new b(uri, new m1.b().S("0").K("application/x-mpegURL").E(), null, null, null, null);
        }

        public b a(m1 m1Var) {
            return new b(this.f145a, m1Var, this.f147c, this.f148d, this.f149e, this.f150f);
        }
    }

    public h(String str, List<String> list, List<b> list2, List<a> list3, List<a> list4, List<a> list5, List<a> list6, m1 m1Var, List<m1> list7, boolean z10, Map<String, String> map, List<m> list8) {
        super(str, list, z10);
        this.f131d = Collections.unmodifiableList(f(list2, list3, list4, list5, list6));
        this.f132e = Collections.unmodifiableList(list2);
        this.f133f = Collections.unmodifiableList(list3);
        this.f134g = Collections.unmodifiableList(list4);
        this.f135h = Collections.unmodifiableList(list5);
        this.f136i = Collections.unmodifiableList(list6);
        this.f137j = m1Var;
        this.f138k = list7 != null ? Collections.unmodifiableList(list7) : null;
        this.f139l = Collections.unmodifiableMap(map);
        this.f140m = Collections.unmodifiableList(list8);
    }

    private static void b(List<a> list, List<Uri> list2) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            Uri uri = list.get(i10).f141a;
            if (uri != null && !list2.contains(uri)) {
                list2.add(uri);
            }
        }
    }

    private static <T> List<T> d(List<T> list, int i10, List<t2.c> list2) {
        ArrayList arrayList = new ArrayList(list2.size());
        for (int i11 = 0; i11 < list.size(); i11++) {
            T t10 = list.get(i11);
            int i12 = 0;
            while (true) {
                if (i12 < list2.size()) {
                    t2.c cVar = list2.get(i12);
                    if (cVar.f14710o == i10 && cVar.f14711p == i11) {
                        arrayList.add(t10);
                        break;
                    }
                    i12++;
                }
            }
        }
        return arrayList;
    }

    public static h e(String str) {
        return new h("", Collections.emptyList(), Collections.singletonList(b.b(Uri.parse(str))), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), null, null, false, Collections.emptyMap(), Collections.emptyList());
    }

    private static List<Uri> f(List<b> list, List<a> list2, List<a> list3, List<a> list4, List<a> list5) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            Uri uri = list.get(i10).f145a;
            if (!arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
        b(list2, arrayList);
        b(list3, arrayList);
        b(list4, arrayList);
        b(list5, arrayList);
        return arrayList;
    }

    @Override // t2.a
    /* renamed from: c */
    public h a(List<t2.c> list) {
        return new h(this.f151a, this.f152b, d(this.f132e, 0, list), Collections.emptyList(), d(this.f134g, 1, list), d(this.f135h, 2, list), Collections.emptyList(), this.f137j, this.f138k, this.f153c, this.f139l, this.f140m);
    }
}
