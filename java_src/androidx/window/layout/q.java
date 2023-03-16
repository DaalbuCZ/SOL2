package androidx.window.layout;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import androidx.window.extensions.layout.WindowLayoutComponent;
/* loaded from: classes.dex */
public interface q {

    /* renamed from: a  reason: collision with root package name */
    public static final a f2491a = a.f2492a;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: b  reason: collision with root package name */
        private static final boolean f2493b = false;

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f2492a = new a();

        /* renamed from: c  reason: collision with root package name */
        private static final String f2494c = k9.s.b(q.class).a();

        /* renamed from: d  reason: collision with root package name */
        private static r f2495d = f.f2439a;

        private a() {
        }

        public final q a(Context context) {
            k9.k.e(context, "context");
            return f2495d.a(new s(y.f2509a, b(context)));
        }

        public final p b(Context context) {
            k9.k.e(context, "context");
            h hVar = null;
            try {
                WindowLayoutComponent m10 = l.f2465a.m();
                if (m10 != null) {
                    hVar = new h(m10);
                }
            } catch (Throwable unused) {
                if (f2493b) {
                    Log.d(f2494c, "Failed to load WindowExtensions");
                }
            }
            return hVar == null ? n.f2479c.a(context) : hVar;
        }
    }

    u9.b<v> a(Activity activity);
}
