package androidx.core.provider;

import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Handler;
/* loaded from: classes.dex */
public class g {

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private final int f1493a;

        /* renamed from: b  reason: collision with root package name */
        private final b[] f1494b;

        @Deprecated
        public a(int i10, b[] bVarArr) {
            this.f1493a = i10;
            this.f1494b = bVarArr;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public static a a(int i10, b[] bVarArr) {
            return new a(i10, bVarArr);
        }

        public b[] b() {
            return this.f1494b;
        }

        public int c() {
            return this.f1493a;
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private final Uri f1495a;

        /* renamed from: b  reason: collision with root package name */
        private final int f1496b;

        /* renamed from: c  reason: collision with root package name */
        private final int f1497c;

        /* renamed from: d  reason: collision with root package name */
        private final boolean f1498d;

        /* renamed from: e  reason: collision with root package name */
        private final int f1499e;

        @Deprecated
        public b(Uri uri, int i10, int i11, boolean z10, int i12) {
            this.f1495a = (Uri) androidx.core.util.e.b(uri);
            this.f1496b = i10;
            this.f1497c = i11;
            this.f1498d = z10;
            this.f1499e = i12;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public static b a(Uri uri, int i10, int i11, boolean z10, int i12) {
            return new b(uri, i10, i11, z10, i12);
        }

        public int b() {
            return this.f1499e;
        }

        public int c() {
            return this.f1496b;
        }

        public Uri d() {
            return this.f1495a;
        }

        public int e() {
            return this.f1497c;
        }

        public boolean f() {
            return this.f1498d;
        }
    }

    /* loaded from: classes.dex */
    public static class c {
        public void a(int i10) {
            throw null;
        }

        public void b(Typeface typeface) {
            throw null;
        }
    }

    public static Typeface a(Context context, e eVar, int i10, boolean z10, int i11, Handler handler, c cVar) {
        androidx.core.provider.a aVar = new androidx.core.provider.a(cVar, handler);
        return z10 ? f.e(context, eVar, aVar, i10, i11) : f.d(context, eVar, i10, null, aVar);
    }
}
