package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Person;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.widget.RemoteViews;
import androidx.core.app.o;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
/* loaded from: classes.dex */
public class k {

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        final Bundle f1188a;

        /* renamed from: b  reason: collision with root package name */
        private IconCompat f1189b;

        /* renamed from: c  reason: collision with root package name */
        private final p[] f1190c;

        /* renamed from: d  reason: collision with root package name */
        private final p[] f1191d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f1192e;

        /* renamed from: f  reason: collision with root package name */
        boolean f1193f;

        /* renamed from: g  reason: collision with root package name */
        private final int f1194g;

        /* renamed from: h  reason: collision with root package name */
        private final boolean f1195h;
        @Deprecated

        /* renamed from: i  reason: collision with root package name */
        public int f1196i;

        /* renamed from: j  reason: collision with root package name */
        public CharSequence f1197j;

        /* renamed from: k  reason: collision with root package name */
        public PendingIntent f1198k;

        /* renamed from: l  reason: collision with root package name */
        private boolean f1199l;

        /* renamed from: androidx.core.app.k$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0018a {

            /* renamed from: a  reason: collision with root package name */
            private final IconCompat f1200a;

            /* renamed from: b  reason: collision with root package name */
            private final CharSequence f1201b;

            /* renamed from: c  reason: collision with root package name */
            private final PendingIntent f1202c;

            /* renamed from: d  reason: collision with root package name */
            private boolean f1203d;

            /* renamed from: e  reason: collision with root package name */
            private final Bundle f1204e;

            /* renamed from: f  reason: collision with root package name */
            private ArrayList<p> f1205f;

            /* renamed from: g  reason: collision with root package name */
            private int f1206g;

            /* renamed from: h  reason: collision with root package name */
            private boolean f1207h;

            /* renamed from: i  reason: collision with root package name */
            private boolean f1208i;

            /* renamed from: j  reason: collision with root package name */
            private boolean f1209j;

            public C0018a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
                this(iconCompat, charSequence, pendingIntent, new Bundle(), null, true, 0, true, false, false);
            }

            private C0018a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, p[] pVarArr, boolean z10, int i10, boolean z11, boolean z12, boolean z13) {
                this.f1203d = true;
                this.f1207h = true;
                this.f1200a = iconCompat;
                this.f1201b = e.k(charSequence);
                this.f1202c = pendingIntent;
                this.f1204e = bundle;
                this.f1205f = pVarArr == null ? null : new ArrayList<>(Arrays.asList(pVarArr));
                this.f1203d = z10;
                this.f1206g = i10;
                this.f1207h = z11;
                this.f1208i = z12;
                this.f1209j = z13;
            }

            private void c() {
                if (this.f1208i) {
                    Objects.requireNonNull(this.f1202c, "Contextual Actions must contain a valid PendingIntent");
                }
            }

            public C0018a a(p pVar) {
                if (this.f1205f == null) {
                    this.f1205f = new ArrayList<>();
                }
                if (pVar != null) {
                    this.f1205f.add(pVar);
                }
                return this;
            }

            public a b() {
                c();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList<p> arrayList3 = this.f1205f;
                if (arrayList3 != null) {
                    Iterator<p> it = arrayList3.iterator();
                    while (it.hasNext()) {
                        p next = it.next();
                        if (next.l()) {
                            arrayList.add(next);
                        } else {
                            arrayList2.add(next);
                        }
                    }
                }
                p[] pVarArr = arrayList.isEmpty() ? null : (p[]) arrayList.toArray(new p[arrayList.size()]);
                return new a(this.f1200a, this.f1201b, this.f1202c, this.f1204e, arrayList2.isEmpty() ? null : (p[]) arrayList2.toArray(new p[arrayList2.size()]), pVarArr, this.f1203d, this.f1206g, this.f1207h, this.f1208i, this.f1209j);
            }

            public C0018a d(boolean z10) {
                this.f1203d = z10;
                return this;
            }

            public C0018a e(boolean z10) {
                this.f1208i = z10;
                return this;
            }

            public C0018a f(boolean z10) {
                this.f1207h = z10;
                return this;
            }
        }

        public a(int i10, CharSequence charSequence, PendingIntent pendingIntent) {
            this(i10 != 0 ? IconCompat.l(null, "", i10) : null, charSequence, pendingIntent);
        }

        public a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
            this(iconCompat, charSequence, pendingIntent, new Bundle(), null, null, true, 0, true, false, false);
        }

        a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, p[] pVarArr, p[] pVarArr2, boolean z10, int i10, boolean z11, boolean z12, boolean z13) {
            this.f1193f = true;
            this.f1189b = iconCompat;
            if (iconCompat != null && iconCompat.q() == 2) {
                this.f1196i = iconCompat.n();
            }
            this.f1197j = e.k(charSequence);
            this.f1198k = pendingIntent;
            this.f1188a = bundle == null ? new Bundle() : bundle;
            this.f1190c = pVarArr;
            this.f1191d = pVarArr2;
            this.f1192e = z10;
            this.f1194g = i10;
            this.f1193f = z11;
            this.f1195h = z12;
            this.f1199l = z13;
        }

        public PendingIntent a() {
            return this.f1198k;
        }

        public boolean b() {
            return this.f1192e;
        }

        public p[] c() {
            return this.f1191d;
        }

        public Bundle d() {
            return this.f1188a;
        }

        @Deprecated
        public int e() {
            return this.f1196i;
        }

        public IconCompat f() {
            int i10;
            if (this.f1189b == null && (i10 = this.f1196i) != 0) {
                this.f1189b = IconCompat.l(null, "", i10);
            }
            return this.f1189b;
        }

        public p[] g() {
            return this.f1190c;
        }

        public int h() {
            return this.f1194g;
        }

        public boolean i() {
            return this.f1193f;
        }

        public CharSequence j() {
            return this.f1197j;
        }

        public boolean k() {
            return this.f1199l;
        }

        public boolean l() {
            return this.f1195h;
        }
    }

    /* loaded from: classes.dex */
    public static class b extends i {

        /* renamed from: e  reason: collision with root package name */
        private IconCompat f1210e;

        /* renamed from: f  reason: collision with root package name */
        private IconCompat f1211f;

        /* renamed from: g  reason: collision with root package name */
        private boolean f1212g;

        /* renamed from: h  reason: collision with root package name */
        private CharSequence f1213h;

        /* renamed from: i  reason: collision with root package name */
        private boolean f1214i;

        /* loaded from: classes.dex */
        private static class a {
            static void a(Notification.BigPictureStyle bigPictureStyle, Bitmap bitmap) {
                bigPictureStyle.bigLargeIcon(bitmap);
            }

            static void b(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
                bigPictureStyle.setSummaryText(charSequence);
            }
        }

        /* renamed from: androidx.core.app.k$b$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        private static class C0019b {
            static void a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigLargeIcon(icon);
            }
        }

        /* loaded from: classes.dex */
        private static class c {
            static void a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigPicture(icon);
            }

            static void b(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
                bigPictureStyle.setContentDescription(charSequence);
            }

            static void c(Notification.BigPictureStyle bigPictureStyle, boolean z10) {
                bigPictureStyle.showBigPictureWhenCollapsed(z10);
            }
        }

        public static IconCompat A(Bundle bundle) {
            if (bundle == null) {
                return null;
            }
            Parcelable parcelable = bundle.getParcelable("android.picture");
            return parcelable != null ? x(parcelable) : x(bundle.getParcelable("android.pictureIcon"));
        }

        private static IconCompat x(Parcelable parcelable) {
            if (parcelable != null) {
                if (Build.VERSION.SDK_INT < 23 || !(parcelable instanceof Icon)) {
                    if (parcelable instanceof Bitmap) {
                        return IconCompat.g((Bitmap) parcelable);
                    }
                    return null;
                }
                return IconCompat.c((Icon) parcelable);
            }
            return null;
        }

        public b B(CharSequence charSequence) {
            this.f1255b = e.k(charSequence);
            return this;
        }

        public b C(CharSequence charSequence) {
            this.f1256c = e.k(charSequence);
            this.f1257d = true;
            return this;
        }

        @Override // androidx.core.app.k.i
        public void b(j jVar) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 16) {
                Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle(jVar.a()).setBigContentTitle(this.f1255b);
                IconCompat iconCompat = this.f1210e;
                if (iconCompat != null) {
                    if (i10 >= 31) {
                        c.a(bigContentTitle, this.f1210e.z(jVar instanceof l ? ((l) jVar).f() : null));
                    } else if (iconCompat.q() == 1) {
                        bigContentTitle = bigContentTitle.bigPicture(this.f1210e.m());
                    }
                }
                if (this.f1212g) {
                    IconCompat iconCompat2 = this.f1211f;
                    if (iconCompat2 != null) {
                        if (i10 >= 23) {
                            C0019b.a(bigContentTitle, this.f1211f.z(jVar instanceof l ? ((l) jVar).f() : null));
                        } else if (iconCompat2.q() == 1) {
                            a.a(bigContentTitle, this.f1211f.m());
                        }
                    }
                    a.a(bigContentTitle, null);
                }
                if (this.f1257d) {
                    a.b(bigContentTitle, this.f1256c);
                }
                if (i10 >= 31) {
                    c.c(bigContentTitle, this.f1214i);
                    c.b(bigContentTitle, this.f1213h);
                }
            }
        }

        @Override // androidx.core.app.k.i
        protected String q() {
            return "androidx.core.app.NotificationCompat$BigPictureStyle";
        }

        @Override // androidx.core.app.k.i
        protected void v(Bundle bundle) {
            super.v(bundle);
            if (bundle.containsKey("android.largeIcon.big")) {
                this.f1211f = x(bundle.getParcelable("android.largeIcon.big"));
                this.f1212g = true;
            }
            this.f1210e = A(bundle);
            this.f1214i = bundle.getBoolean("android.showBigPictureWhenCollapsed");
        }

        public b y(Bitmap bitmap) {
            this.f1211f = bitmap == null ? null : IconCompat.g(bitmap);
            this.f1212g = true;
            return this;
        }

        public b z(Bitmap bitmap) {
            this.f1210e = bitmap == null ? null : IconCompat.g(bitmap);
            return this;
        }
    }

    /* loaded from: classes.dex */
    public static class c extends i {

        /* renamed from: e  reason: collision with root package name */
        private CharSequence f1215e;

        @Override // androidx.core.app.k.i
        public void a(Bundle bundle) {
            super.a(bundle);
            if (Build.VERSION.SDK_INT < 21) {
                bundle.putCharSequence("android.bigText", this.f1215e);
            }
        }

        @Override // androidx.core.app.k.i
        public void b(j jVar) {
            if (Build.VERSION.SDK_INT >= 16) {
                Notification.BigTextStyle bigText = new Notification.BigTextStyle(jVar.a()).setBigContentTitle(this.f1255b).bigText(this.f1215e);
                if (this.f1257d) {
                    bigText.setSummaryText(this.f1256c);
                }
            }
        }

        @Override // androidx.core.app.k.i
        protected String q() {
            return "androidx.core.app.NotificationCompat$BigTextStyle";
        }

        @Override // androidx.core.app.k.i
        protected void v(Bundle bundle) {
            super.v(bundle);
            this.f1215e = bundle.getCharSequence("android.bigText");
        }

        public c x(CharSequence charSequence) {
            this.f1215e = e.k(charSequence);
            return this;
        }

        public c y(CharSequence charSequence) {
            this.f1255b = e.k(charSequence);
            return this;
        }

        public c z(CharSequence charSequence) {
            this.f1256c = e.k(charSequence);
            this.f1257d = true;
            return this;
        }
    }

    /* loaded from: classes.dex */
    public static final class d {
        public static Notification.BubbleMetadata a(d dVar) {
            return null;
        }
    }

    /* loaded from: classes.dex */
    public static class e {
        boolean A;
        boolean B;
        boolean C;
        String D;
        Bundle E;
        int F;
        int G;
        Notification H;
        RemoteViews I;
        RemoteViews J;
        RemoteViews K;
        String L;
        int M;
        String N;
        long O;
        int P;
        int Q;
        boolean R;
        d S;
        Notification T;
        boolean U;
        Icon V;
        @Deprecated
        public ArrayList<String> W;

        /* renamed from: a  reason: collision with root package name */
        public Context f1216a;

        /* renamed from: b  reason: collision with root package name */
        public ArrayList<a> f1217b;

        /* renamed from: c  reason: collision with root package name */
        public ArrayList<o> f1218c;

        /* renamed from: d  reason: collision with root package name */
        ArrayList<a> f1219d;

        /* renamed from: e  reason: collision with root package name */
        CharSequence f1220e;

        /* renamed from: f  reason: collision with root package name */
        CharSequence f1221f;

        /* renamed from: g  reason: collision with root package name */
        PendingIntent f1222g;

        /* renamed from: h  reason: collision with root package name */
        PendingIntent f1223h;

        /* renamed from: i  reason: collision with root package name */
        RemoteViews f1224i;

        /* renamed from: j  reason: collision with root package name */
        Bitmap f1225j;

        /* renamed from: k  reason: collision with root package name */
        CharSequence f1226k;

        /* renamed from: l  reason: collision with root package name */
        int f1227l;

        /* renamed from: m  reason: collision with root package name */
        int f1228m;

        /* renamed from: n  reason: collision with root package name */
        boolean f1229n;

        /* renamed from: o  reason: collision with root package name */
        boolean f1230o;

        /* renamed from: p  reason: collision with root package name */
        boolean f1231p;

        /* renamed from: q  reason: collision with root package name */
        i f1232q;

        /* renamed from: r  reason: collision with root package name */
        CharSequence f1233r;

        /* renamed from: s  reason: collision with root package name */
        CharSequence f1234s;

        /* renamed from: t  reason: collision with root package name */
        CharSequence[] f1235t;

        /* renamed from: u  reason: collision with root package name */
        int f1236u;

        /* renamed from: v  reason: collision with root package name */
        int f1237v;

        /* renamed from: w  reason: collision with root package name */
        boolean f1238w;

        /* renamed from: x  reason: collision with root package name */
        String f1239x;

        /* renamed from: y  reason: collision with root package name */
        boolean f1240y;

        /* renamed from: z  reason: collision with root package name */
        String f1241z;

        @Deprecated
        public e(Context context) {
            this(context, null);
        }

        public e(Context context, String str) {
            this.f1217b = new ArrayList<>();
            this.f1218c = new ArrayList<>();
            this.f1219d = new ArrayList<>();
            this.f1229n = true;
            this.A = false;
            this.F = 0;
            this.G = 0;
            this.M = 0;
            this.P = 0;
            this.Q = 0;
            Notification notification = new Notification();
            this.T = notification;
            this.f1216a = context;
            this.L = str;
            notification.when = System.currentTimeMillis();
            this.T.audioStreamType = -1;
            this.f1228m = 0;
            this.W = new ArrayList<>();
            this.R = true;
        }

        protected static CharSequence k(CharSequence charSequence) {
            return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
        }

        private Bitmap l(Bitmap bitmap) {
            if (bitmap == null || Build.VERSION.SDK_INT >= 27) {
                return bitmap;
            }
            Resources resources = this.f1216a.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(n.c.compat_notification_large_icon_max_width);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(n.c.compat_notification_large_icon_max_height);
            if (bitmap.getWidth() > dimensionPixelSize || bitmap.getHeight() > dimensionPixelSize2) {
                double min = Math.min(dimensionPixelSize / Math.max(1, bitmap.getWidth()), dimensionPixelSize2 / Math.max(1, bitmap.getHeight()));
                return Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(bitmap.getWidth() * min), (int) Math.ceil(bitmap.getHeight() * min), true);
            }
            return bitmap;
        }

        private void w(int i10, boolean z10) {
            Notification notification;
            int i11;
            if (z10) {
                notification = this.T;
                i11 = i10 | notification.flags;
            } else {
                notification = this.T;
                i11 = (~i10) & notification.flags;
            }
            notification.flags = i11;
        }

        public e A(boolean z10) {
            this.f1240y = z10;
            return this;
        }

        public e B(Bitmap bitmap) {
            this.f1225j = l(bitmap);
            return this;
        }

        public e C(int i10, int i11, int i12) {
            Notification notification = this.T;
            notification.ledARGB = i10;
            notification.ledOnMS = i11;
            notification.ledOffMS = i12;
            notification.flags = ((i11 == 0 || i12 == 0) ? 0 : 1) | (notification.flags & (-2));
            return this;
        }

        public e D(boolean z10) {
            this.A = z10;
            return this;
        }

        public e E(int i10) {
            this.f1227l = i10;
            return this;
        }

        public e F(boolean z10) {
            w(2, z10);
            return this;
        }

        public e G(boolean z10) {
            w(8, z10);
            return this;
        }

        public e H(int i10) {
            this.f1228m = i10;
            return this;
        }

        public e I(int i10, int i11, boolean z10) {
            this.f1236u = i10;
            this.f1237v = i11;
            this.f1238w = z10;
            return this;
        }

        public e J(String str) {
            this.N = str;
            return this;
        }

        public e K(boolean z10) {
            this.f1229n = z10;
            return this;
        }

        public e L(int i10) {
            this.T.icon = i10;
            return this;
        }

        public e M(Uri uri) {
            Notification notification = this.T;
            notification.sound = uri;
            notification.audioStreamType = -1;
            if (Build.VERSION.SDK_INT >= 21) {
                notification.audioAttributes = new AudioAttributes.Builder().setContentType(4).setUsage(5).build();
            }
            return this;
        }

        public e N(i iVar) {
            if (this.f1232q != iVar) {
                this.f1232q = iVar;
                if (iVar != null) {
                    iVar.w(this);
                }
            }
            return this;
        }

        public e O(CharSequence charSequence) {
            this.f1233r = k(charSequence);
            return this;
        }

        public e P(CharSequence charSequence) {
            this.T.tickerText = k(charSequence);
            return this;
        }

        public e Q(long j10) {
            this.O = j10;
            return this;
        }

        public e R(boolean z10) {
            this.f1230o = z10;
            return this;
        }

        public e S(long[] jArr) {
            this.T.vibrate = jArr;
            return this;
        }

        public e T(int i10) {
            this.G = i10;
            return this;
        }

        public e U(long j10) {
            this.T.when = j10;
            return this;
        }

        public e a(int i10, CharSequence charSequence, PendingIntent pendingIntent) {
            this.f1217b.add(new a(i10, charSequence, pendingIntent));
            return this;
        }

        public e b(a aVar) {
            if (aVar != null) {
                this.f1217b.add(aVar);
            }
            return this;
        }

        public Notification c() {
            return new l(this).c();
        }

        public RemoteViews d() {
            return this.J;
        }

        public int e() {
            return this.F;
        }

        public RemoteViews f() {
            return this.I;
        }

        public Bundle g() {
            if (this.E == null) {
                this.E = new Bundle();
            }
            return this.E;
        }

        public RemoteViews h() {
            return this.K;
        }

        public int i() {
            return this.f1228m;
        }

        public long j() {
            if (this.f1229n) {
                return this.T.when;
            }
            return 0L;
        }

        public e m(boolean z10) {
            w(16, z10);
            return this;
        }

        public e n(String str) {
            this.D = str;
            return this;
        }

        public e o(String str) {
            this.L = str;
            return this;
        }

        public e p(int i10) {
            this.F = i10;
            return this;
        }

        public e q(boolean z10) {
            this.B = z10;
            this.C = true;
            return this;
        }

        public e r(PendingIntent pendingIntent) {
            this.f1222g = pendingIntent;
            return this;
        }

        public e s(CharSequence charSequence) {
            this.f1221f = k(charSequence);
            return this;
        }

        public e t(CharSequence charSequence) {
            this.f1220e = k(charSequence);
            return this;
        }

        public e u(int i10) {
            Notification notification = this.T;
            notification.defaults = i10;
            if ((i10 & 4) != 0) {
                notification.flags |= 1;
            }
            return this;
        }

        public e v(PendingIntent pendingIntent) {
            this.T.deleteIntent = pendingIntent;
            return this;
        }

        public e x(PendingIntent pendingIntent, boolean z10) {
            this.f1223h = pendingIntent;
            w(128, z10);
            return this;
        }

        public e y(String str) {
            this.f1239x = str;
            return this;
        }

        public e z(int i10) {
            this.P = i10;
            return this;
        }
    }

    /* loaded from: classes.dex */
    public static class f extends i {
        private RemoteViews x(RemoteViews remoteViews, boolean z10) {
            int min;
            boolean z11 = true;
            RemoteViews c10 = c(true, n.g.notification_template_custom_big, false);
            c10.removeAllViews(n.e.actions);
            List<a> z12 = z(this.f1254a.f1217b);
            if (!z10 || z12 == null || (min = Math.min(z12.size(), 3)) <= 0) {
                z11 = false;
            } else {
                for (int i10 = 0; i10 < min; i10++) {
                    c10.addView(n.e.actions, y(z12.get(i10)));
                }
            }
            int i11 = z11 ? 0 : 8;
            c10.setViewVisibility(n.e.actions, i11);
            c10.setViewVisibility(n.e.action_divider, i11);
            d(c10, remoteViews);
            return c10;
        }

        private RemoteViews y(a aVar) {
            boolean z10 = aVar.f1198k == null;
            RemoteViews remoteViews = new RemoteViews(this.f1254a.f1216a.getPackageName(), z10 ? n.g.notification_action_tombstone : n.g.notification_action);
            IconCompat f10 = aVar.f();
            if (f10 != null) {
                remoteViews.setImageViewBitmap(n.e.action_image, m(f10, this.f1254a.f1216a.getResources().getColor(n.b.notification_action_color_filter)));
            }
            remoteViews.setTextViewText(n.e.action_text, aVar.f1197j);
            if (!z10) {
                remoteViews.setOnClickPendingIntent(n.e.action_container, aVar.f1198k);
            }
            if (Build.VERSION.SDK_INT >= 15) {
                remoteViews.setContentDescription(n.e.action_container, aVar.f1197j);
            }
            return remoteViews;
        }

        private static List<a> z(List<a> list) {
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (a aVar : list) {
                if (!aVar.l()) {
                    arrayList.add(aVar);
                }
            }
            return arrayList;
        }

        @Override // androidx.core.app.k.i
        public void b(j jVar) {
            if (Build.VERSION.SDK_INT >= 24) {
                jVar.a().setStyle(new Notification.DecoratedCustomViewStyle());
            }
        }

        @Override // androidx.core.app.k.i
        protected String q() {
            return "androidx.core.app.NotificationCompat$DecoratedCustomViewStyle";
        }

        @Override // androidx.core.app.k.i
        public RemoteViews s(j jVar) {
            if (Build.VERSION.SDK_INT >= 24) {
                return null;
            }
            RemoteViews d10 = this.f1254a.d();
            if (d10 == null) {
                d10 = this.f1254a.f();
            }
            if (d10 == null) {
                return null;
            }
            return x(d10, true);
        }

        @Override // androidx.core.app.k.i
        public RemoteViews t(j jVar) {
            if (Build.VERSION.SDK_INT < 24 && this.f1254a.f() != null) {
                return x(this.f1254a.f(), false);
            }
            return null;
        }

        @Override // androidx.core.app.k.i
        public RemoteViews u(j jVar) {
            if (Build.VERSION.SDK_INT >= 24) {
                return null;
            }
            RemoteViews h10 = this.f1254a.h();
            RemoteViews f10 = h10 != null ? h10 : this.f1254a.f();
            if (h10 == null) {
                return null;
            }
            return x(f10, true);
        }
    }

    /* loaded from: classes.dex */
    public static class g extends i {

        /* renamed from: e  reason: collision with root package name */
        private ArrayList<CharSequence> f1242e = new ArrayList<>();

        @Override // androidx.core.app.k.i
        public void b(j jVar) {
            if (Build.VERSION.SDK_INT >= 16) {
                Notification.InboxStyle bigContentTitle = new Notification.InboxStyle(jVar.a()).setBigContentTitle(this.f1255b);
                if (this.f1257d) {
                    bigContentTitle.setSummaryText(this.f1256c);
                }
                Iterator<CharSequence> it = this.f1242e.iterator();
                while (it.hasNext()) {
                    bigContentTitle.addLine(it.next());
                }
            }
        }

        @Override // androidx.core.app.k.i
        protected String q() {
            return "androidx.core.app.NotificationCompat$InboxStyle";
        }

        @Override // androidx.core.app.k.i
        protected void v(Bundle bundle) {
            super.v(bundle);
            this.f1242e.clear();
            if (bundle.containsKey("android.textLines")) {
                Collections.addAll(this.f1242e, bundle.getCharSequenceArray("android.textLines"));
            }
        }

        public g x(CharSequence charSequence) {
            if (charSequence != null) {
                this.f1242e.add(e.k(charSequence));
            }
            return this;
        }

        public g y(CharSequence charSequence) {
            this.f1255b = e.k(charSequence);
            return this;
        }

        public g z(CharSequence charSequence) {
            this.f1256c = e.k(charSequence);
            this.f1257d = true;
            return this;
        }
    }

    /* loaded from: classes.dex */
    public static class h extends i {

        /* renamed from: e  reason: collision with root package name */
        private final List<a> f1243e = new ArrayList();

        /* renamed from: f  reason: collision with root package name */
        private final List<a> f1244f = new ArrayList();

        /* renamed from: g  reason: collision with root package name */
        private o f1245g;

        /* renamed from: h  reason: collision with root package name */
        private CharSequence f1246h;

        /* renamed from: i  reason: collision with root package name */
        private Boolean f1247i;

        /* loaded from: classes.dex */
        public static final class a {

            /* renamed from: a  reason: collision with root package name */
            private final CharSequence f1248a;

            /* renamed from: b  reason: collision with root package name */
            private final long f1249b;

            /* renamed from: c  reason: collision with root package name */
            private final o f1250c;

            /* renamed from: d  reason: collision with root package name */
            private Bundle f1251d = new Bundle();

            /* renamed from: e  reason: collision with root package name */
            private String f1252e;

            /* renamed from: f  reason: collision with root package name */
            private Uri f1253f;

            public a(CharSequence charSequence, long j10, o oVar) {
                this.f1248a = charSequence;
                this.f1249b = j10;
                this.f1250c = oVar;
            }

            static Bundle[] a(List<a> list) {
                Bundle[] bundleArr = new Bundle[list.size()];
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    bundleArr[i10] = list.get(i10).l();
                }
                return bundleArr;
            }

            static a e(Bundle bundle) {
                try {
                    if (bundle.containsKey("text") && bundle.containsKey("time")) {
                        a aVar = new a(bundle.getCharSequence("text"), bundle.getLong("time"), bundle.containsKey("person") ? o.b(bundle.getBundle("person")) : (!bundle.containsKey("sender_person") || Build.VERSION.SDK_INT < 28) ? bundle.containsKey("sender") ? new o.b().f(bundle.getCharSequence("sender")).a() : null : o.a((Person) bundle.getParcelable("sender_person")));
                        if (bundle.containsKey("type") && bundle.containsKey("uri")) {
                            aVar.j(bundle.getString("type"), (Uri) bundle.getParcelable("uri"));
                        }
                        if (bundle.containsKey("extras")) {
                            aVar.d().putAll(bundle.getBundle("extras"));
                        }
                        return aVar;
                    }
                } catch (ClassCastException unused) {
                }
                return null;
            }

            static List<a> f(Parcelable[] parcelableArr) {
                a e10;
                ArrayList arrayList = new ArrayList(parcelableArr.length);
                for (int i10 = 0; i10 < parcelableArr.length; i10++) {
                    if ((parcelableArr[i10] instanceof Bundle) && (e10 = e((Bundle) parcelableArr[i10])) != null) {
                        arrayList.add(e10);
                    }
                }
                return arrayList;
            }

            private Bundle l() {
                Bundle bundle = new Bundle();
                CharSequence charSequence = this.f1248a;
                if (charSequence != null) {
                    bundle.putCharSequence("text", charSequence);
                }
                bundle.putLong("time", this.f1249b);
                o oVar = this.f1250c;
                if (oVar != null) {
                    bundle.putCharSequence("sender", oVar.e());
                    if (Build.VERSION.SDK_INT >= 28) {
                        bundle.putParcelable("sender_person", this.f1250c.j());
                    } else {
                        bundle.putBundle("person", this.f1250c.k());
                    }
                }
                String str = this.f1252e;
                if (str != null) {
                    bundle.putString("type", str);
                }
                Uri uri = this.f1253f;
                if (uri != null) {
                    bundle.putParcelable("uri", uri);
                }
                Bundle bundle2 = this.f1251d;
                if (bundle2 != null) {
                    bundle.putBundle("extras", bundle2);
                }
                return bundle;
            }

            public String b() {
                return this.f1252e;
            }

            public Uri c() {
                return this.f1253f;
            }

            public Bundle d() {
                return this.f1251d;
            }

            public o g() {
                return this.f1250c;
            }

            public CharSequence h() {
                return this.f1248a;
            }

            public long i() {
                return this.f1249b;
            }

            public a j(String str, Uri uri) {
                this.f1252e = str;
                this.f1253f = uri;
                return this;
            }

            Notification.MessagingStyle.Message k() {
                Notification.MessagingStyle.Message message;
                o g10 = g();
                if (Build.VERSION.SDK_INT >= 28) {
                    message = new Notification.MessagingStyle.Message(h(), i(), g10 != null ? g10.j() : null);
                } else {
                    message = new Notification.MessagingStyle.Message(h(), i(), g10 != null ? g10.e() : null);
                }
                if (b() != null) {
                    message.setData(b(), c());
                }
                return message;
            }
        }

        h() {
        }

        public h(o oVar) {
            if (TextUtils.isEmpty(oVar.e())) {
                throw new IllegalArgumentException("User's name must not be empty.");
            }
            this.f1245g = oVar;
        }

        private boolean D() {
            for (int size = this.f1243e.size() - 1; size >= 0; size--) {
                a aVar = this.f1243e.get(size);
                if (aVar.g() != null && aVar.g().e() == null) {
                    return true;
                }
            }
            return false;
        }

        private TextAppearanceSpan F(int i10) {
            return new TextAppearanceSpan(null, 0, 0, ColorStateList.valueOf(i10), null);
        }

        private CharSequence G(a aVar) {
            androidx.core.text.a c10 = androidx.core.text.a.c();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            boolean z10 = Build.VERSION.SDK_INT >= 21;
            int i10 = z10 ? -16777216 : -1;
            String e10 = aVar.g() == null ? "" : aVar.g().e();
            if (TextUtils.isEmpty(e10)) {
                e10 = this.f1245g.e();
                if (z10 && this.f1254a.e() != 0) {
                    i10 = this.f1254a.e();
                }
            }
            CharSequence h10 = c10.h(e10);
            spannableStringBuilder.append(h10);
            spannableStringBuilder.setSpan(F(i10), spannableStringBuilder.length() - h10.length(), spannableStringBuilder.length(), 33);
            spannableStringBuilder.append((CharSequence) "  ").append(c10.h(aVar.h() != null ? aVar.h() : ""));
            return spannableStringBuilder;
        }

        public static h y(Notification notification) {
            i p10 = i.p(notification);
            if (p10 instanceof h) {
                return (h) p10;
            }
            return null;
        }

        private a z() {
            List<a> list;
            for (int size = this.f1243e.size() - 1; size >= 0; size--) {
                a aVar = this.f1243e.get(size);
                if (aVar.g() != null && !TextUtils.isEmpty(aVar.g().e())) {
                    return aVar;
                }
            }
            if (this.f1243e.isEmpty()) {
                return null;
            }
            return this.f1243e.get(list.size() - 1);
        }

        public CharSequence A() {
            return this.f1246h;
        }

        public List<a> B() {
            return this.f1243e;
        }

        public o C() {
            return this.f1245g;
        }

        public boolean E() {
            e eVar = this.f1254a;
            if (eVar != null && eVar.f1216a.getApplicationInfo().targetSdkVersion < 28 && this.f1247i == null) {
                return this.f1246h != null;
            }
            Boolean bool = this.f1247i;
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        }

        public h H(CharSequence charSequence) {
            this.f1246h = charSequence;
            return this;
        }

        public h I(boolean z10) {
            this.f1247i = Boolean.valueOf(z10);
            return this;
        }

        @Override // androidx.core.app.k.i
        public void a(Bundle bundle) {
            super.a(bundle);
            bundle.putCharSequence("android.selfDisplayName", this.f1245g.e());
            bundle.putBundle("android.messagingStyleUser", this.f1245g.k());
            bundle.putCharSequence("android.hiddenConversationTitle", this.f1246h);
            if (this.f1246h != null && this.f1247i.booleanValue()) {
                bundle.putCharSequence("android.conversationTitle", this.f1246h);
            }
            if (!this.f1243e.isEmpty()) {
                bundle.putParcelableArray("android.messages", a.a(this.f1243e));
            }
            if (!this.f1244f.isEmpty()) {
                bundle.putParcelableArray("android.messages.historic", a.a(this.f1244f));
            }
            Boolean bool = this.f1247i;
            if (bool != null) {
                bundle.putBoolean("android.isGroupConversation", bool.booleanValue());
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:38:0x00c3  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x00db  */
        /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
        @Override // androidx.core.app.k.i
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void b(androidx.core.app.j r8) {
            /*
                Method dump skipped, instructions count: 306
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.k.h.b(androidx.core.app.j):void");
        }

        @Override // androidx.core.app.k.i
        protected String q() {
            return "androidx.core.app.NotificationCompat$MessagingStyle";
        }

        @Override // androidx.core.app.k.i
        protected void v(Bundle bundle) {
            super.v(bundle);
            this.f1243e.clear();
            this.f1245g = bundle.containsKey("android.messagingStyleUser") ? o.b(bundle.getBundle("android.messagingStyleUser")) : new o.b().f(bundle.getString("android.selfDisplayName")).a();
            CharSequence charSequence = bundle.getCharSequence("android.conversationTitle");
            this.f1246h = charSequence;
            if (charSequence == null) {
                this.f1246h = bundle.getCharSequence("android.hiddenConversationTitle");
            }
            Parcelable[] parcelableArray = bundle.getParcelableArray("android.messages");
            if (parcelableArray != null) {
                this.f1243e.addAll(a.f(parcelableArray));
            }
            Parcelable[] parcelableArray2 = bundle.getParcelableArray("android.messages.historic");
            if (parcelableArray2 != null) {
                this.f1244f.addAll(a.f(parcelableArray2));
            }
            if (bundle.containsKey("android.isGroupConversation")) {
                this.f1247i = Boolean.valueOf(bundle.getBoolean("android.isGroupConversation"));
            }
        }

        public h x(a aVar) {
            if (aVar != null) {
                this.f1243e.add(aVar);
                if (this.f1243e.size() > 25) {
                    this.f1243e.remove(0);
                }
            }
            return this;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class i {

        /* renamed from: a  reason: collision with root package name */
        protected e f1254a;

        /* renamed from: b  reason: collision with root package name */
        CharSequence f1255b;

        /* renamed from: c  reason: collision with root package name */
        CharSequence f1256c;

        /* renamed from: d  reason: collision with root package name */
        boolean f1257d = false;

        private int e() {
            Resources resources = this.f1254a.f1216a.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(n.c.notification_top_pad);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(n.c.notification_top_pad_large_text);
            float f10 = (f(resources.getConfiguration().fontScale, 1.0f, 1.3f) - 1.0f) / 0.29999995f;
            return Math.round(((1.0f - f10) * dimensionPixelSize) + (f10 * dimensionPixelSize2));
        }

        private static float f(float f10, float f11, float f12) {
            return f10 < f11 ? f11 : f10 > f12 ? f12 : f10;
        }

        static i g(String str) {
            if (str != null) {
                char c10 = 65535;
                switch (str.hashCode()) {
                    case -716705180:
                        if (str.equals("androidx.core.app.NotificationCompat$DecoratedCustomViewStyle")) {
                            c10 = 0;
                            break;
                        }
                        break;
                    case -171946061:
                        if (str.equals("androidx.core.app.NotificationCompat$BigPictureStyle")) {
                            c10 = 1;
                            break;
                        }
                        break;
                    case 912942987:
                        if (str.equals("androidx.core.app.NotificationCompat$InboxStyle")) {
                            c10 = 2;
                            break;
                        }
                        break;
                    case 919595044:
                        if (str.equals("androidx.core.app.NotificationCompat$BigTextStyle")) {
                            c10 = 3;
                            break;
                        }
                        break;
                    case 2090799565:
                        if (str.equals("androidx.core.app.NotificationCompat$MessagingStyle")) {
                            c10 = 4;
                            break;
                        }
                        break;
                }
                switch (c10) {
                    case 0:
                        return new f();
                    case 1:
                        return new b();
                    case 2:
                        return new g();
                    case 3:
                        return new c();
                    case 4:
                        return new h();
                    default:
                        return null;
                }
            }
            return null;
        }

        private static i h(String str) {
            int i10;
            if (str != null && (i10 = Build.VERSION.SDK_INT) >= 16) {
                if (str.equals(Notification.BigPictureStyle.class.getName())) {
                    return new b();
                }
                if (str.equals(Notification.BigTextStyle.class.getName())) {
                    return new c();
                }
                if (str.equals(Notification.InboxStyle.class.getName())) {
                    return new g();
                }
                if (i10 >= 24) {
                    if (str.equals(Notification.MessagingStyle.class.getName())) {
                        return new h();
                    }
                    if (str.equals(Notification.DecoratedCustomViewStyle.class.getName())) {
                        return new f();
                    }
                }
            }
            return null;
        }

        static i i(Bundle bundle) {
            i g10 = g(bundle.getString("androidx.core.app.extra.COMPAT_TEMPLATE"));
            return g10 != null ? g10 : (bundle.containsKey("android.selfDisplayName") || bundle.containsKey("android.messagingStyleUser")) ? new h() : (bundle.containsKey("android.picture") || bundle.containsKey("android.pictureIcon")) ? new b() : bundle.containsKey("android.bigText") ? new c() : bundle.containsKey("android.textLines") ? new g() : h(bundle.getString("android.template"));
        }

        static i j(Bundle bundle) {
            i i10 = i(bundle);
            if (i10 == null) {
                return null;
            }
            try {
                i10.v(bundle);
                return i10;
            } catch (ClassCastException unused) {
                return null;
            }
        }

        private Bitmap l(int i10, int i11, int i12) {
            return n(IconCompat.k(this.f1254a.f1216a, i10), i11, i12);
        }

        private Bitmap n(IconCompat iconCompat, int i10, int i11) {
            Drawable t10 = iconCompat.t(this.f1254a.f1216a);
            int intrinsicWidth = i11 == 0 ? t10.getIntrinsicWidth() : i11;
            if (i11 == 0) {
                i11 = t10.getIntrinsicHeight();
            }
            Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, i11, Bitmap.Config.ARGB_8888);
            t10.setBounds(0, 0, intrinsicWidth, i11);
            if (i10 != 0) {
                t10.mutate().setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
            }
            t10.draw(new Canvas(createBitmap));
            return createBitmap;
        }

        private Bitmap o(int i10, int i11, int i12, int i13) {
            int i14 = n.d.notification_icon_background;
            if (i13 == 0) {
                i13 = 0;
            }
            Bitmap l10 = l(i14, i13, i11);
            Canvas canvas = new Canvas(l10);
            Drawable mutate = this.f1254a.f1216a.getResources().getDrawable(i10).mutate();
            mutate.setFilterBitmap(true);
            int i15 = (i11 - i12) / 2;
            int i16 = i12 + i15;
            mutate.setBounds(i15, i15, i16, i16);
            mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_ATOP));
            mutate.draw(canvas);
            return l10;
        }

        public static i p(Notification notification) {
            Bundle a10 = k.a(notification);
            if (a10 == null) {
                return null;
            }
            return j(a10);
        }

        private void r(RemoteViews remoteViews) {
            remoteViews.setViewVisibility(n.e.f11448k0, 8);
            remoteViews.setViewVisibility(n.e.text2, 8);
            remoteViews.setViewVisibility(n.e.text, 8);
        }

        public void a(Bundle bundle) {
            if (this.f1257d) {
                bundle.putCharSequence("android.summaryText", this.f1256c);
            }
            CharSequence charSequence = this.f1255b;
            if (charSequence != null) {
                bundle.putCharSequence("android.title.big", charSequence);
            }
            String q10 = q();
            if (q10 != null) {
                bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", q10);
            }
        }

        public abstract void b(j jVar);

        /* JADX WARN: Removed duplicated region for block: B:65:0x016c  */
        /* JADX WARN: Removed duplicated region for block: B:66:0x0176  */
        /* JADX WARN: Removed duplicated region for block: B:69:0x017e A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:71:0x0182  */
        /* JADX WARN: Removed duplicated region for block: B:75:0x01a4  */
        /* JADX WARN: Removed duplicated region for block: B:84:0x01ea  */
        /* JADX WARN: Removed duplicated region for block: B:87:0x01ef  */
        /* JADX WARN: Removed duplicated region for block: B:88:0x01f1  */
        /* JADX WARN: Removed duplicated region for block: B:92:0x01fa  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public android.widget.RemoteViews c(boolean r17, int r18, boolean r19) {
            /*
                Method dump skipped, instructions count: 511
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.k.i.c(boolean, int, boolean):android.widget.RemoteViews");
        }

        public void d(RemoteViews remoteViews, RemoteViews remoteViews2) {
            r(remoteViews);
            int i10 = n.e.notification_main_column;
            remoteViews.removeAllViews(i10);
            remoteViews.addView(i10, remoteViews2.clone());
            remoteViews.setViewVisibility(i10, 0);
            if (Build.VERSION.SDK_INT >= 21) {
                remoteViews.setViewPadding(n.e.notification_main_column_container, 0, e(), 0, 0);
            }
        }

        public Bitmap k(int i10, int i11) {
            return l(i10, i11, 0);
        }

        Bitmap m(IconCompat iconCompat, int i10) {
            return n(iconCompat, i10, 0);
        }

        protected String q() {
            return null;
        }

        public RemoteViews s(j jVar) {
            return null;
        }

        public RemoteViews t(j jVar) {
            return null;
        }

        public RemoteViews u(j jVar) {
            return null;
        }

        protected void v(Bundle bundle) {
            if (bundle.containsKey("android.summaryText")) {
                this.f1256c = bundle.getCharSequence("android.summaryText");
                this.f1257d = true;
            }
            this.f1255b = bundle.getCharSequence("android.title.big");
        }

        public void w(e eVar) {
            if (this.f1254a != eVar) {
                this.f1254a = eVar;
                if (eVar != null) {
                    eVar.N(this);
                }
            }
        }
    }

    public static Bundle a(Notification notification) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 19) {
            return notification.extras;
        }
        if (i10 >= 16) {
            return m.c(notification);
        }
        return null;
    }
}
