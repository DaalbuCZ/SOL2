package androidx.core.content.res;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.Base64;
import android.util.TypedValue;
import android.util.Xml;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
/* loaded from: classes.dex */
public class e {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a {
        static int a(TypedArray typedArray, int i10) {
            return typedArray.getType(i10);
        }
    }

    /* loaded from: classes.dex */
    public interface b {
    }

    /* loaded from: classes.dex */
    public static final class c implements b {

        /* renamed from: a  reason: collision with root package name */
        private final d[] f1353a;

        public c(d[] dVarArr) {
            this.f1353a = dVarArr;
        }

        public d[] a() {
            return this.f1353a;
        }
    }

    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        private final String f1354a;

        /* renamed from: b  reason: collision with root package name */
        private final int f1355b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f1356c;

        /* renamed from: d  reason: collision with root package name */
        private final String f1357d;

        /* renamed from: e  reason: collision with root package name */
        private final int f1358e;

        /* renamed from: f  reason: collision with root package name */
        private final int f1359f;

        public d(String str, int i10, boolean z10, String str2, int i11, int i12) {
            this.f1354a = str;
            this.f1355b = i10;
            this.f1356c = z10;
            this.f1357d = str2;
            this.f1358e = i11;
            this.f1359f = i12;
        }

        public String a() {
            return this.f1354a;
        }

        public int b() {
            return this.f1359f;
        }

        public int c() {
            return this.f1358e;
        }

        public String d() {
            return this.f1357d;
        }

        public int e() {
            return this.f1355b;
        }

        public boolean f() {
            return this.f1356c;
        }
    }

    /* renamed from: androidx.core.content.res.e$e  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0023e implements b {

        /* renamed from: a  reason: collision with root package name */
        private final androidx.core.provider.e f1360a;

        /* renamed from: b  reason: collision with root package name */
        private final int f1361b;

        /* renamed from: c  reason: collision with root package name */
        private final int f1362c;

        /* renamed from: d  reason: collision with root package name */
        private final String f1363d;

        public C0023e(androidx.core.provider.e eVar, int i10, int i11, String str) {
            this.f1360a = eVar;
            this.f1362c = i10;
            this.f1361b = i11;
            this.f1363d = str;
        }

        public int a() {
            return this.f1362c;
        }

        public androidx.core.provider.e b() {
            return this.f1360a;
        }

        public String c() {
            return this.f1363d;
        }

        public int d() {
            return this.f1361b;
        }
    }

    private static int a(TypedArray typedArray, int i10) {
        if (Build.VERSION.SDK_INT >= 21) {
            return a.a(typedArray, i10);
        }
        TypedValue typedValue = new TypedValue();
        typedArray.getValue(i10, typedValue);
        return typedValue.type;
    }

    public static b b(XmlPullParser xmlPullParser, Resources resources) {
        int next;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return d(xmlPullParser, resources);
        }
        throw new XmlPullParserException("No start tag found");
    }

    public static List<List<byte[]>> c(Resources resources, int i10) {
        if (i10 == 0) {
            return Collections.emptyList();
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i10);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (a(obtainTypedArray, 0) == 1) {
                for (int i11 = 0; i11 < obtainTypedArray.length(); i11++) {
                    int resourceId = obtainTypedArray.getResourceId(i11, 0);
                    if (resourceId != 0) {
                        arrayList.add(h(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(h(resources.getStringArray(i10)));
            }
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    private static b d(XmlPullParser xmlPullParser, Resources resources) {
        xmlPullParser.require(2, null, "font-family");
        if (xmlPullParser.getName().equals("font-family")) {
            return e(xmlPullParser, resources);
        }
        g(xmlPullParser);
        return null;
    }

    private static b e(XmlPullParser xmlPullParser, Resources resources) {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), n.i.f11456h);
        String string = obtainAttributes.getString(n.i.f11457i);
        String string2 = obtainAttributes.getString(n.i.f11461m);
        String string3 = obtainAttributes.getString(n.i.f11462n);
        int resourceId = obtainAttributes.getResourceId(n.i.f11458j, 0);
        int integer = obtainAttributes.getInteger(n.i.f11459k, 1);
        int integer2 = obtainAttributes.getInteger(n.i.f11460l, 500);
        String string4 = obtainAttributes.getString(n.i.f11463o);
        obtainAttributes.recycle();
        if (string != null && string2 != null && string3 != null) {
            while (xmlPullParser.next() != 3) {
                g(xmlPullParser);
            }
            return new C0023e(new androidx.core.provider.e(string, string2, string3, c(resources, resourceId)), integer, integer2, string4);
        }
        ArrayList arrayList = new ArrayList();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (xmlPullParser.getName().equals("font")) {
                    arrayList.add(f(xmlPullParser, resources));
                } else {
                    g(xmlPullParser);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new c((d[]) arrayList.toArray(new d[0]));
    }

    private static d f(XmlPullParser xmlPullParser, Resources resources) {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), n.i.f11464p);
        int i10 = n.i.f11473y;
        if (!obtainAttributes.hasValue(i10)) {
            i10 = n.i.f11466r;
        }
        int i11 = obtainAttributes.getInt(i10, 400);
        int i12 = n.i.f11471w;
        if (!obtainAttributes.hasValue(i12)) {
            i12 = n.i.f11467s;
        }
        boolean z10 = 1 == obtainAttributes.getInt(i12, 0);
        int i13 = n.i.f11474z;
        if (!obtainAttributes.hasValue(i13)) {
            i13 = n.i.f11468t;
        }
        int i14 = n.i.f11472x;
        if (!obtainAttributes.hasValue(i14)) {
            i14 = n.i.f11469u;
        }
        String string = obtainAttributes.getString(i14);
        int i15 = obtainAttributes.getInt(i13, 0);
        int i16 = n.i.f11470v;
        if (!obtainAttributes.hasValue(i16)) {
            i16 = n.i.f11465q;
        }
        int resourceId = obtainAttributes.getResourceId(i16, 0);
        String string2 = obtainAttributes.getString(i16);
        obtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            g(xmlPullParser);
        }
        return new d(string2, i11, z10, string, i15, resourceId);
    }

    private static void g(XmlPullParser xmlPullParser) {
        int i10 = 1;
        while (i10 > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i10++;
            } else if (next == 3) {
                i10--;
            }
        }
    }

    private static List<byte[]> h(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            arrayList.add(Base64.decode(str, 0));
        }
        return arrayList;
    }
}
