package androidx.core.graphics.drawable;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.content.res.h;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;
/* loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: k  reason: collision with root package name */
    static final PorterDuff.Mode f1405k = PorterDuff.Mode.SRC_IN;

    /* renamed from: a  reason: collision with root package name */
    public int f1406a;

    /* renamed from: b  reason: collision with root package name */
    Object f1407b;

    /* renamed from: c  reason: collision with root package name */
    public byte[] f1408c;

    /* renamed from: d  reason: collision with root package name */
    public Parcelable f1409d;

    /* renamed from: e  reason: collision with root package name */
    public int f1410e;

    /* renamed from: f  reason: collision with root package name */
    public int f1411f;

    /* renamed from: g  reason: collision with root package name */
    public ColorStateList f1412g;

    /* renamed from: h  reason: collision with root package name */
    PorterDuff.Mode f1413h;

    /* renamed from: i  reason: collision with root package name */
    public String f1414i;

    /* renamed from: j  reason: collision with root package name */
    public String f1415j;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a {
        static IconCompat a(Object obj) {
            androidx.core.util.e.b(obj);
            int d10 = d(obj);
            if (d10 != 2) {
                if (d10 != 4) {
                    if (d10 != 6) {
                        IconCompat iconCompat = new IconCompat(-1);
                        iconCompat.f1407b = obj;
                        return iconCompat;
                    }
                    return IconCompat.e(e(obj));
                }
                return IconCompat.h(e(obj));
            }
            return IconCompat.l(null, c(obj), b(obj));
        }

        static int b(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.a(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getResId", new Class[0]).invoke(obj, new Object[0])).intValue();
            } catch (IllegalAccessException e10) {
                Log.e("IconCompat", "Unable to get icon resource", e10);
                return 0;
            } catch (NoSuchMethodException e11) {
                Log.e("IconCompat", "Unable to get icon resource", e11);
                return 0;
            } catch (InvocationTargetException e12) {
                Log.e("IconCompat", "Unable to get icon resource", e12);
                return 0;
            }
        }

        static String c(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.b(obj);
            }
            try {
                return (String) obj.getClass().getMethod("getResPackage", new Class[0]).invoke(obj, new Object[0]);
            } catch (IllegalAccessException e10) {
                Log.e("IconCompat", "Unable to get icon package", e10);
                return null;
            } catch (NoSuchMethodException e11) {
                Log.e("IconCompat", "Unable to get icon package", e11);
                return null;
            } catch (InvocationTargetException e12) {
                Log.e("IconCompat", "Unable to get icon package", e12);
                return null;
            }
        }

        static int d(Object obj) {
            StringBuilder sb;
            if (Build.VERSION.SDK_INT >= 28) {
                return c.c(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getType", new Class[0]).invoke(obj, new Object[0])).intValue();
            } catch (IllegalAccessException e10) {
                e = e10;
                sb = new StringBuilder();
                sb.append("Unable to get icon type ");
                sb.append(obj);
                Log.e("IconCompat", sb.toString(), e);
                return -1;
            } catch (NoSuchMethodException e11) {
                e = e11;
                sb = new StringBuilder();
                sb.append("Unable to get icon type ");
                sb.append(obj);
                Log.e("IconCompat", sb.toString(), e);
                return -1;
            } catch (InvocationTargetException e12) {
                e = e12;
                sb = new StringBuilder();
                sb.append("Unable to get icon type ");
                sb.append(obj);
                Log.e("IconCompat", sb.toString(), e);
                return -1;
            }
        }

        static Uri e(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.d(obj);
            }
            try {
                return (Uri) obj.getClass().getMethod("getUri", new Class[0]).invoke(obj, new Object[0]);
            } catch (IllegalAccessException e10) {
                Log.e("IconCompat", "Unable to get icon uri", e10);
                return null;
            } catch (NoSuchMethodException e11) {
                Log.e("IconCompat", "Unable to get icon uri", e11);
                return null;
            } catch (InvocationTargetException e12) {
                Log.e("IconCompat", "Unable to get icon uri", e12);
                return null;
            }
        }

        static Drawable f(Icon icon, Context context) {
            return icon.loadDrawable(context);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x002c, code lost:
            if (r0 >= 26) goto L23;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        static android.graphics.drawable.Icon g(androidx.core.graphics.drawable.IconCompat r4, android.content.Context r5) {
            /*
                int r0 = r4.f1406a
                r1 = 0
                r2 = 26
                switch(r0) {
                    case -1: goto Lb5;
                    case 0: goto L8;
                    case 1: goto L9c;
                    case 2: goto L91;
                    case 3: goto L84;
                    case 4: goto L7b;
                    case 5: goto L65;
                    case 6: goto L10;
                    default: goto L8;
                }
            L8:
                java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
                java.lang.String r5 = "Unknown type"
                r4.<init>(r5)
                throw r4
            L10:
                int r0 = android.os.Build.VERSION.SDK_INT
                r3 = 30
                if (r0 < r3) goto L20
                android.net.Uri r5 = r4.r()
                android.graphics.drawable.Icon r5 = androidx.core.graphics.drawable.IconCompat.d.a(r5)
                goto La4
            L20:
                if (r5 == 0) goto L4a
                java.io.InputStream r5 = r4.s(r5)
                if (r5 == 0) goto L2f
                android.graphics.Bitmap r5 = android.graphics.BitmapFactory.decodeStream(r5)
                if (r0 < r2) goto L76
                goto L6d
            L2f:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Cannot load adaptive icon from uri: "
                r0.append(r1)
                android.net.Uri r4 = r4.r()
                r0.append(r4)
                java.lang.String r4 = r0.toString()
                r5.<init>(r4)
                throw r5
            L4a:
                java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Context is required to resolve the file uri of the icon: "
                r0.append(r1)
                android.net.Uri r4 = r4.r()
                r0.append(r4)
                java.lang.String r4 = r0.toString()
                r5.<init>(r4)
                throw r5
            L65:
                int r5 = android.os.Build.VERSION.SDK_INT
                if (r5 < r2) goto L72
                java.lang.Object r5 = r4.f1407b
                android.graphics.Bitmap r5 = (android.graphics.Bitmap) r5
            L6d:
                android.graphics.drawable.Icon r5 = androidx.core.graphics.drawable.IconCompat.b.b(r5)
                goto La4
            L72:
                java.lang.Object r5 = r4.f1407b
                android.graphics.Bitmap r5 = (android.graphics.Bitmap) r5
            L76:
                android.graphics.Bitmap r5 = androidx.core.graphics.drawable.IconCompat.d(r5, r1)
                goto La0
            L7b:
                java.lang.Object r5 = r4.f1407b
                java.lang.String r5 = (java.lang.String) r5
                android.graphics.drawable.Icon r5 = android.graphics.drawable.Icon.createWithContentUri(r5)
                goto La4
            L84:
                java.lang.Object r5 = r4.f1407b
                byte[] r5 = (byte[]) r5
                int r0 = r4.f1410e
                int r1 = r4.f1411f
                android.graphics.drawable.Icon r5 = android.graphics.drawable.Icon.createWithData(r5, r0, r1)
                goto La4
            L91:
                java.lang.String r5 = r4.o()
                int r0 = r4.f1410e
                android.graphics.drawable.Icon r5 = android.graphics.drawable.Icon.createWithResource(r5, r0)
                goto La4
            L9c:
                java.lang.Object r5 = r4.f1407b
                android.graphics.Bitmap r5 = (android.graphics.Bitmap) r5
            La0:
                android.graphics.drawable.Icon r5 = android.graphics.drawable.Icon.createWithBitmap(r5)
            La4:
                android.content.res.ColorStateList r0 = r4.f1412g
                if (r0 == 0) goto Lab
                r5.setTintList(r0)
            Lab:
                android.graphics.PorterDuff$Mode r4 = r4.f1413h
                android.graphics.PorterDuff$Mode r0 = androidx.core.graphics.drawable.IconCompat.f1405k
                if (r4 == r0) goto Lb4
                r5.setTintMode(r4)
            Lb4:
                return r5
            Lb5:
                java.lang.Object r4 = r4.f1407b
                android.graphics.drawable.Icon r4 = (android.graphics.drawable.Icon) r4
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.drawable.IconCompat.a.g(androidx.core.graphics.drawable.IconCompat, android.content.Context):android.graphics.drawable.Icon");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class b {
        static Drawable a(Drawable drawable, Drawable drawable2) {
            return new AdaptiveIconDrawable(drawable, drawable2);
        }

        static Icon b(Bitmap bitmap) {
            return Icon.createWithAdaptiveBitmap(bitmap);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class c {
        static int a(Object obj) {
            return ((Icon) obj).getResId();
        }

        static String b(Object obj) {
            return ((Icon) obj).getResPackage();
        }

        static int c(Object obj) {
            return ((Icon) obj).getType();
        }

        static Uri d(Object obj) {
            return ((Icon) obj).getUri();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class d {
        static Icon a(Uri uri) {
            return Icon.createWithAdaptiveBitmapContentUri(uri);
        }
    }

    public IconCompat() {
        this.f1406a = -1;
        this.f1408c = null;
        this.f1409d = null;
        this.f1410e = 0;
        this.f1411f = 0;
        this.f1412g = null;
        this.f1413h = f1405k;
        this.f1414i = null;
    }

    IconCompat(int i10) {
        this.f1406a = -1;
        this.f1408c = null;
        this.f1409d = null;
        this.f1410e = 0;
        this.f1411f = 0;
        this.f1412g = null;
        this.f1413h = f1405k;
        this.f1414i = null;
        this.f1406a = i10;
    }

    private static String A(int i10) {
        switch (i10) {
            case 1:
                return "BITMAP";
            case 2:
                return "RESOURCE";
            case 3:
                return "DATA";
            case 4:
                return "URI";
            case 5:
                return "BITMAP_MASKABLE";
            case 6:
                return "URI_MASKABLE";
            default:
                return "UNKNOWN";
        }
    }

    public static IconCompat b(Bundle bundle) {
        Object parcelable;
        int i10 = bundle.getInt("type");
        IconCompat iconCompat = new IconCompat(i10);
        iconCompat.f1410e = bundle.getInt("int1");
        iconCompat.f1411f = bundle.getInt("int2");
        iconCompat.f1415j = bundle.getString("string1");
        if (bundle.containsKey("tint_list")) {
            iconCompat.f1412g = (ColorStateList) bundle.getParcelable("tint_list");
        }
        if (bundle.containsKey("tint_mode")) {
            iconCompat.f1413h = PorterDuff.Mode.valueOf(bundle.getString("tint_mode"));
        }
        switch (i10) {
            case -1:
            case 1:
            case 5:
                parcelable = bundle.getParcelable("obj");
                iconCompat.f1407b = parcelable;
                break;
            case 0:
            default:
                Log.w("IconCompat", "Unknown type " + i10);
                return null;
            case 2:
            case 4:
            case 6:
                parcelable = bundle.getString("obj");
                iconCompat.f1407b = parcelable;
                break;
            case 3:
                iconCompat.f1407b = bundle.getByteArray("obj");
                break;
        }
        return iconCompat;
    }

    public static IconCompat c(Icon icon) {
        return a.a(icon);
    }

    static Bitmap d(Bitmap bitmap, boolean z10) {
        int min = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
        Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(3);
        float f10 = min;
        float f11 = 0.5f * f10;
        float f12 = 0.9166667f * f11;
        if (z10) {
            float f13 = 0.010416667f * f10;
            paint.setColor(0);
            paint.setShadowLayer(f13, 0.0f, f10 * 0.020833334f, 1023410176);
            canvas.drawCircle(f11, f11, f12, paint);
            paint.setShadowLayer(f13, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f11, f11, f12, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((-(bitmap.getWidth() - min)) / 2.0f, (-(bitmap.getHeight() - min)) / 2.0f);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f11, f11, f12, paint);
        canvas.setBitmap(null);
        return createBitmap;
    }

    public static IconCompat e(Uri uri) {
        androidx.core.util.d.c(uri);
        return f(uri.toString());
    }

    public static IconCompat f(String str) {
        androidx.core.util.d.c(str);
        IconCompat iconCompat = new IconCompat(6);
        iconCompat.f1407b = str;
        return iconCompat;
    }

    public static IconCompat g(Bitmap bitmap) {
        androidx.core.util.d.c(bitmap);
        IconCompat iconCompat = new IconCompat(1);
        iconCompat.f1407b = bitmap;
        return iconCompat;
    }

    public static IconCompat h(Uri uri) {
        androidx.core.util.d.c(uri);
        return i(uri.toString());
    }

    public static IconCompat i(String str) {
        androidx.core.util.d.c(str);
        IconCompat iconCompat = new IconCompat(4);
        iconCompat.f1407b = str;
        return iconCompat;
    }

    public static IconCompat j(byte[] bArr, int i10, int i11) {
        androidx.core.util.d.c(bArr);
        IconCompat iconCompat = new IconCompat(3);
        iconCompat.f1407b = bArr;
        iconCompat.f1410e = i10;
        iconCompat.f1411f = i11;
        return iconCompat;
    }

    public static IconCompat k(Context context, int i10) {
        androidx.core.util.d.c(context);
        return l(context.getResources(), context.getPackageName(), i10);
    }

    public static IconCompat l(Resources resources, String str, int i10) {
        androidx.core.util.d.c(str);
        if (i10 != 0) {
            IconCompat iconCompat = new IconCompat(2);
            iconCompat.f1410e = i10;
            if (resources != null) {
                try {
                    iconCompat.f1407b = resources.getResourceName(i10);
                } catch (Resources.NotFoundException unused) {
                    throw new IllegalArgumentException("Icon resource cannot be found");
                }
            } else {
                iconCompat.f1407b = str;
            }
            iconCompat.f1415j = str;
            return iconCompat;
        }
        throw new IllegalArgumentException("Drawable resource ID must not be 0");
    }

    static Resources p(Context context, String str) {
        if ("android".equals(str)) {
            return Resources.getSystem();
        }
        PackageManager packageManager = context.getPackageManager();
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 8192);
            if (applicationInfo != null) {
                return packageManager.getResourcesForApplication(applicationInfo);
            }
            return null;
        } catch (PackageManager.NameNotFoundException e10) {
            Log.e("IconCompat", String.format("Unable to find pkg=%s for icon", str), e10);
            return null;
        }
    }

    private Drawable u(Context context) {
        switch (this.f1406a) {
            case 1:
                return new BitmapDrawable(context.getResources(), (Bitmap) this.f1407b);
            case 2:
                String o10 = o();
                if (TextUtils.isEmpty(o10)) {
                    o10 = context.getPackageName();
                }
                try {
                    return h.d(p(context, o10), this.f1410e, context.getTheme());
                } catch (RuntimeException e10) {
                    Log.e("IconCompat", String.format("Unable to load resource 0x%08x from pkg=%s", Integer.valueOf(this.f1410e), this.f1407b), e10);
                    break;
                }
            case 3:
                return new BitmapDrawable(context.getResources(), BitmapFactory.decodeByteArray((byte[]) this.f1407b, this.f1410e, this.f1411f));
            case 4:
                InputStream s10 = s(context);
                if (s10 != null) {
                    return new BitmapDrawable(context.getResources(), BitmapFactory.decodeStream(s10));
                }
                break;
            case 5:
                return new BitmapDrawable(context.getResources(), d((Bitmap) this.f1407b, false));
            case 6:
                InputStream s11 = s(context);
                if (s11 != null) {
                    return Build.VERSION.SDK_INT >= 26 ? b.a(null, new BitmapDrawable(context.getResources(), BitmapFactory.decodeStream(s11))) : new BitmapDrawable(context.getResources(), d(BitmapFactory.decodeStream(s11), false));
                }
                break;
        }
        return null;
    }

    public void a(Context context) {
        Object obj;
        if (this.f1406a != 2 || (obj = this.f1407b) == null) {
            return;
        }
        String str = (String) obj;
        if (str.contains(":")) {
            String str2 = str.split(":", -1)[1];
            String str3 = str2.split("/", -1)[0];
            String str4 = str2.split("/", -1)[1];
            String str5 = str.split(":", -1)[0];
            if ("0_resource_name_obfuscated".equals(str4)) {
                Log.i("IconCompat", "Found obfuscated resource, not trying to update resource id for it");
                return;
            }
            String o10 = o();
            int identifier = p(context, o10).getIdentifier(str4, str3, str5);
            if (this.f1410e != identifier) {
                Log.i("IconCompat", "Id has changed for " + o10 + " " + str);
                this.f1410e = identifier;
            }
        }
    }

    public Bitmap m() {
        int i10 = this.f1406a;
        if (i10 == -1 && Build.VERSION.SDK_INT >= 23) {
            Object obj = this.f1407b;
            if (obj instanceof Bitmap) {
                return (Bitmap) obj;
            }
            return null;
        } else if (i10 == 1) {
            return (Bitmap) this.f1407b;
        } else {
            if (i10 == 5) {
                return d((Bitmap) this.f1407b, true);
            }
            throw new IllegalStateException("called getBitmap() on " + this);
        }
    }

    public int n() {
        int i10 = this.f1406a;
        if (i10 != -1 || Build.VERSION.SDK_INT < 23) {
            if (i10 == 2) {
                return this.f1410e;
            }
            throw new IllegalStateException("called getResId() on " + this);
        }
        return a.b(this.f1407b);
    }

    public String o() {
        int i10 = this.f1406a;
        if (i10 != -1 || Build.VERSION.SDK_INT < 23) {
            if (i10 == 2) {
                String str = this.f1415j;
                return (str == null || TextUtils.isEmpty(str)) ? ((String) this.f1407b).split(":", -1)[0] : this.f1415j;
            }
            throw new IllegalStateException("called getResPackage() on " + this);
        }
        return a.c(this.f1407b);
    }

    public int q() {
        int i10 = this.f1406a;
        return (i10 != -1 || Build.VERSION.SDK_INT < 23) ? i10 : a.d(this.f1407b);
    }

    public Uri r() {
        int i10 = this.f1406a;
        if (i10 != -1 || Build.VERSION.SDK_INT < 23) {
            if (i10 == 4 || i10 == 6) {
                return Uri.parse((String) this.f1407b);
            }
            throw new IllegalStateException("called getUri() on " + this);
        }
        return a.e(this.f1407b);
    }

    public InputStream s(Context context) {
        StringBuilder sb;
        String str;
        Uri r10 = r();
        String scheme = r10.getScheme();
        if ("content".equals(scheme) || "file".equals(scheme)) {
            try {
                return context.getContentResolver().openInputStream(r10);
            } catch (Exception e10) {
                e = e10;
                sb = new StringBuilder();
                str = "Unable to load image from URI: ";
            }
        } else {
            try {
                return new FileInputStream(new File((String) this.f1407b));
            } catch (FileNotFoundException e11) {
                e = e11;
                sb = new StringBuilder();
                str = "Unable to load image from path: ";
            }
        }
        sb.append(str);
        sb.append(r10);
        Log.w("IconCompat", sb.toString(), e);
        return null;
    }

    public Drawable t(Context context) {
        a(context);
        if (Build.VERSION.SDK_INT >= 23) {
            return a.f(z(context), context);
        }
        Drawable u10 = u(context);
        if (u10 != null && (this.f1412g != null || this.f1413h != f1405k)) {
            u10.mutate();
            androidx.core.graphics.drawable.a.n(u10, this.f1412g);
            androidx.core.graphics.drawable.a.o(u10, this.f1413h);
        }
        return u10;
    }

    public String toString() {
        int height;
        if (this.f1406a == -1) {
            return String.valueOf(this.f1407b);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        sb.append(A(this.f1406a));
        switch (this.f1406a) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.f1407b).getWidth());
                sb.append("x");
                height = ((Bitmap) this.f1407b).getHeight();
                sb.append(height);
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.f1415j);
                sb.append(" id=");
                sb.append(String.format("0x%08x", Integer.valueOf(n())));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f1410e);
                if (this.f1411f != 0) {
                    sb.append(" off=");
                    height = this.f1411f;
                    sb.append(height);
                    break;
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.f1407b);
                break;
        }
        if (this.f1412g != null) {
            sb.append(" tint=");
            sb.append(this.f1412g);
        }
        if (this.f1413h != f1405k) {
            sb.append(" mode=");
            sb.append(this.f1413h);
        }
        sb.append(")");
        return sb.toString();
    }

    public void v() {
        Parcelable parcelable;
        this.f1413h = PorterDuff.Mode.valueOf(this.f1414i);
        switch (this.f1406a) {
            case -1:
                parcelable = this.f1409d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                break;
            case 0:
            default:
                return;
            case 1:
            case 5:
                parcelable = this.f1409d;
                if (parcelable == null) {
                    byte[] bArr = this.f1408c;
                    this.f1407b = bArr;
                    this.f1406a = 3;
                    this.f1410e = 0;
                    this.f1411f = bArr.length;
                    return;
                }
                break;
            case 2:
            case 4:
            case 6:
                String str = new String(this.f1408c, Charset.forName("UTF-16"));
                this.f1407b = str;
                if (this.f1406a == 2 && this.f1415j == null) {
                    this.f1415j = str.split(":", -1)[0];
                    return;
                }
                return;
            case 3:
                this.f1407b = this.f1408c;
                return;
        }
        this.f1407b = parcelable;
    }

    public void w(boolean z10) {
        this.f1414i = this.f1413h.name();
        switch (this.f1406a) {
            case -1:
                if (z10) {
                    throw new IllegalArgumentException("Can't serialize Icon created with IconCompat#createFromIcon");
                }
                break;
            case 0:
            default:
                return;
            case 1:
            case 5:
                if (z10) {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    ((Bitmap) this.f1407b).compress(Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
                    this.f1408c = byteArrayOutputStream.toByteArray();
                    return;
                }
                break;
            case 2:
                this.f1408c = ((String) this.f1407b).getBytes(Charset.forName("UTF-16"));
                return;
            case 3:
                this.f1408c = (byte[]) this.f1407b;
                return;
            case 4:
            case 6:
                this.f1408c = this.f1407b.toString().getBytes(Charset.forName("UTF-16"));
                return;
        }
        this.f1409d = (Parcelable) this.f1407b;
    }

    public Bundle x() {
        Parcelable parcelable;
        Bundle bundle = new Bundle();
        switch (this.f1406a) {
            case -1:
                parcelable = (Parcelable) this.f1407b;
                bundle.putParcelable("obj", parcelable);
                break;
            case 0:
            default:
                throw new IllegalArgumentException("Invalid icon");
            case 1:
            case 5:
                parcelable = (Bitmap) this.f1407b;
                bundle.putParcelable("obj", parcelable);
                break;
            case 2:
            case 4:
            case 6:
                bundle.putString("obj", (String) this.f1407b);
                break;
            case 3:
                bundle.putByteArray("obj", (byte[]) this.f1407b);
                break;
        }
        bundle.putInt("type", this.f1406a);
        bundle.putInt("int1", this.f1410e);
        bundle.putInt("int2", this.f1411f);
        bundle.putString("string1", this.f1415j);
        ColorStateList colorStateList = this.f1412g;
        if (colorStateList != null) {
            bundle.putParcelable("tint_list", colorStateList);
        }
        PorterDuff.Mode mode = this.f1413h;
        if (mode != f1405k) {
            bundle.putString("tint_mode", mode.name());
        }
        return bundle;
    }

    @Deprecated
    public Icon y() {
        return z(null);
    }

    public Icon z(Context context) {
        if (Build.VERSION.SDK_INT >= 23) {
            return a.g(this, context);
        }
        throw new UnsupportedOperationException("This method is only supported on API level 23+");
    }
}
