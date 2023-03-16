package androidx.vectordrawable.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import androidx.core.content.res.k;
import androidx.core.graphics.c;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
/* loaded from: classes.dex */
public class h extends androidx.vectordrawable.graphics.drawable.g {

    /* renamed from: x  reason: collision with root package name */
    static final PorterDuff.Mode f2334x = PorterDuff.Mode.SRC_IN;

    /* renamed from: o  reason: collision with root package name */
    private C0046h f2335o;

    /* renamed from: p  reason: collision with root package name */
    private PorterDuffColorFilter f2336p;

    /* renamed from: q  reason: collision with root package name */
    private ColorFilter f2337q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f2338r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f2339s;

    /* renamed from: t  reason: collision with root package name */
    private Drawable.ConstantState f2340t;

    /* renamed from: u  reason: collision with root package name */
    private final float[] f2341u;

    /* renamed from: v  reason: collision with root package name */
    private final Matrix f2342v;

    /* renamed from: w  reason: collision with root package name */
    private final Rect f2343w;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b extends f {
        b() {
        }

        b(b bVar) {
            super(bVar);
        }

        private void f(TypedArray typedArray, XmlPullParser xmlPullParser) {
            String string = typedArray.getString(0);
            if (string != null) {
                this.f2370b = string;
            }
            String string2 = typedArray.getString(1);
            if (string2 != null) {
                this.f2369a = androidx.core.graphics.c.d(string2);
            }
            this.f2371c = k.g(typedArray, xmlPullParser, "fillType", 2, 0);
        }

        @Override // androidx.vectordrawable.graphics.drawable.h.f
        public boolean c() {
            return true;
        }

        public void e(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            if (k.j(xmlPullParser, "pathData")) {
                TypedArray k10 = k.k(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f2307d);
                f(k10, xmlPullParser);
                k10.recycle();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class c extends f {

        /* renamed from: e  reason: collision with root package name */
        private int[] f2344e;

        /* renamed from: f  reason: collision with root package name */
        androidx.core.content.res.d f2345f;

        /* renamed from: g  reason: collision with root package name */
        float f2346g;

        /* renamed from: h  reason: collision with root package name */
        androidx.core.content.res.d f2347h;

        /* renamed from: i  reason: collision with root package name */
        float f2348i;

        /* renamed from: j  reason: collision with root package name */
        float f2349j;

        /* renamed from: k  reason: collision with root package name */
        float f2350k;

        /* renamed from: l  reason: collision with root package name */
        float f2351l;

        /* renamed from: m  reason: collision with root package name */
        float f2352m;

        /* renamed from: n  reason: collision with root package name */
        Paint.Cap f2353n;

        /* renamed from: o  reason: collision with root package name */
        Paint.Join f2354o;

        /* renamed from: p  reason: collision with root package name */
        float f2355p;

        c() {
            this.f2346g = 0.0f;
            this.f2348i = 1.0f;
            this.f2349j = 1.0f;
            this.f2350k = 0.0f;
            this.f2351l = 1.0f;
            this.f2352m = 0.0f;
            this.f2353n = Paint.Cap.BUTT;
            this.f2354o = Paint.Join.MITER;
            this.f2355p = 4.0f;
        }

        c(c cVar) {
            super(cVar);
            this.f2346g = 0.0f;
            this.f2348i = 1.0f;
            this.f2349j = 1.0f;
            this.f2350k = 0.0f;
            this.f2351l = 1.0f;
            this.f2352m = 0.0f;
            this.f2353n = Paint.Cap.BUTT;
            this.f2354o = Paint.Join.MITER;
            this.f2355p = 4.0f;
            this.f2344e = cVar.f2344e;
            this.f2345f = cVar.f2345f;
            this.f2346g = cVar.f2346g;
            this.f2348i = cVar.f2348i;
            this.f2347h = cVar.f2347h;
            this.f2371c = cVar.f2371c;
            this.f2349j = cVar.f2349j;
            this.f2350k = cVar.f2350k;
            this.f2351l = cVar.f2351l;
            this.f2352m = cVar.f2352m;
            this.f2353n = cVar.f2353n;
            this.f2354o = cVar.f2354o;
            this.f2355p = cVar.f2355p;
        }

        private Paint.Cap e(int i10, Paint.Cap cap) {
            return i10 != 0 ? i10 != 1 ? i10 != 2 ? cap : Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        }

        private Paint.Join f(int i10, Paint.Join join) {
            return i10 != 0 ? i10 != 1 ? i10 != 2 ? join : Paint.Join.BEVEL : Paint.Join.ROUND : Paint.Join.MITER;
        }

        private void h(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
            this.f2344e = null;
            if (k.j(xmlPullParser, "pathData")) {
                String string = typedArray.getString(0);
                if (string != null) {
                    this.f2370b = string;
                }
                String string2 = typedArray.getString(2);
                if (string2 != null) {
                    this.f2369a = androidx.core.graphics.c.d(string2);
                }
                this.f2347h = k.e(typedArray, xmlPullParser, theme, "fillColor", 1, 0);
                this.f2349j = k.f(typedArray, xmlPullParser, "fillAlpha", 12, this.f2349j);
                this.f2353n = e(k.g(typedArray, xmlPullParser, "strokeLineCap", 8, -1), this.f2353n);
                this.f2354o = f(k.g(typedArray, xmlPullParser, "strokeLineJoin", 9, -1), this.f2354o);
                this.f2355p = k.f(typedArray, xmlPullParser, "strokeMiterLimit", 10, this.f2355p);
                this.f2345f = k.e(typedArray, xmlPullParser, theme, "strokeColor", 3, 0);
                this.f2348i = k.f(typedArray, xmlPullParser, "strokeAlpha", 11, this.f2348i);
                this.f2346g = k.f(typedArray, xmlPullParser, "strokeWidth", 4, this.f2346g);
                this.f2351l = k.f(typedArray, xmlPullParser, "trimPathEnd", 6, this.f2351l);
                this.f2352m = k.f(typedArray, xmlPullParser, "trimPathOffset", 7, this.f2352m);
                this.f2350k = k.f(typedArray, xmlPullParser, "trimPathStart", 5, this.f2350k);
                this.f2371c = k.g(typedArray, xmlPullParser, "fillType", 13, this.f2371c);
            }
        }

        @Override // androidx.vectordrawable.graphics.drawable.h.e
        public boolean a() {
            return this.f2347h.i() || this.f2345f.i();
        }

        @Override // androidx.vectordrawable.graphics.drawable.h.e
        public boolean b(int[] iArr) {
            return this.f2345f.j(iArr) | this.f2347h.j(iArr);
        }

        public void g(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray k10 = k.k(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f2306c);
            h(k10, xmlPullParser, theme);
            k10.recycle();
        }

        float getFillAlpha() {
            return this.f2349j;
        }

        int getFillColor() {
            return this.f2347h.e();
        }

        float getStrokeAlpha() {
            return this.f2348i;
        }

        int getStrokeColor() {
            return this.f2345f.e();
        }

        float getStrokeWidth() {
            return this.f2346g;
        }

        float getTrimPathEnd() {
            return this.f2351l;
        }

        float getTrimPathOffset() {
            return this.f2352m;
        }

        float getTrimPathStart() {
            return this.f2350k;
        }

        void setFillAlpha(float f10) {
            this.f2349j = f10;
        }

        void setFillColor(int i10) {
            this.f2347h.k(i10);
        }

        void setStrokeAlpha(float f10) {
            this.f2348i = f10;
        }

        void setStrokeColor(int i10) {
            this.f2345f.k(i10);
        }

        void setStrokeWidth(float f10) {
            this.f2346g = f10;
        }

        void setTrimPathEnd(float f10) {
            this.f2351l = f10;
        }

        void setTrimPathOffset(float f10) {
            this.f2352m = f10;
        }

        void setTrimPathStart(float f10) {
            this.f2350k = f10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class d extends e {

        /* renamed from: a  reason: collision with root package name */
        final Matrix f2356a;

        /* renamed from: b  reason: collision with root package name */
        final ArrayList<e> f2357b;

        /* renamed from: c  reason: collision with root package name */
        float f2358c;

        /* renamed from: d  reason: collision with root package name */
        private float f2359d;

        /* renamed from: e  reason: collision with root package name */
        private float f2360e;

        /* renamed from: f  reason: collision with root package name */
        private float f2361f;

        /* renamed from: g  reason: collision with root package name */
        private float f2362g;

        /* renamed from: h  reason: collision with root package name */
        private float f2363h;

        /* renamed from: i  reason: collision with root package name */
        private float f2364i;

        /* renamed from: j  reason: collision with root package name */
        final Matrix f2365j;

        /* renamed from: k  reason: collision with root package name */
        int f2366k;

        /* renamed from: l  reason: collision with root package name */
        private int[] f2367l;

        /* renamed from: m  reason: collision with root package name */
        private String f2368m;

        public d() {
            super();
            this.f2356a = new Matrix();
            this.f2357b = new ArrayList<>();
            this.f2358c = 0.0f;
            this.f2359d = 0.0f;
            this.f2360e = 0.0f;
            this.f2361f = 1.0f;
            this.f2362g = 1.0f;
            this.f2363h = 0.0f;
            this.f2364i = 0.0f;
            this.f2365j = new Matrix();
            this.f2368m = null;
        }

        public d(d dVar, m.a<String, Object> aVar) {
            super();
            f bVar;
            this.f2356a = new Matrix();
            this.f2357b = new ArrayList<>();
            this.f2358c = 0.0f;
            this.f2359d = 0.0f;
            this.f2360e = 0.0f;
            this.f2361f = 1.0f;
            this.f2362g = 1.0f;
            this.f2363h = 0.0f;
            this.f2364i = 0.0f;
            Matrix matrix = new Matrix();
            this.f2365j = matrix;
            this.f2368m = null;
            this.f2358c = dVar.f2358c;
            this.f2359d = dVar.f2359d;
            this.f2360e = dVar.f2360e;
            this.f2361f = dVar.f2361f;
            this.f2362g = dVar.f2362g;
            this.f2363h = dVar.f2363h;
            this.f2364i = dVar.f2364i;
            this.f2367l = dVar.f2367l;
            String str = dVar.f2368m;
            this.f2368m = str;
            this.f2366k = dVar.f2366k;
            if (str != null) {
                aVar.put(str, this);
            }
            matrix.set(dVar.f2365j);
            ArrayList<e> arrayList = dVar.f2357b;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                e eVar = arrayList.get(i10);
                if (eVar instanceof d) {
                    this.f2357b.add(new d((d) eVar, aVar));
                } else {
                    if (eVar instanceof c) {
                        bVar = new c((c) eVar);
                    } else if (!(eVar instanceof b)) {
                        throw new IllegalStateException("Unknown object in the tree!");
                    } else {
                        bVar = new b((b) eVar);
                    }
                    this.f2357b.add(bVar);
                    String str2 = bVar.f2370b;
                    if (str2 != null) {
                        aVar.put(str2, bVar);
                    }
                }
            }
        }

        private void d() {
            this.f2365j.reset();
            this.f2365j.postTranslate(-this.f2359d, -this.f2360e);
            this.f2365j.postScale(this.f2361f, this.f2362g);
            this.f2365j.postRotate(this.f2358c, 0.0f, 0.0f);
            this.f2365j.postTranslate(this.f2363h + this.f2359d, this.f2364i + this.f2360e);
        }

        private void e(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.f2367l = null;
            this.f2358c = k.f(typedArray, xmlPullParser, "rotation", 5, this.f2358c);
            this.f2359d = typedArray.getFloat(1, this.f2359d);
            this.f2360e = typedArray.getFloat(2, this.f2360e);
            this.f2361f = k.f(typedArray, xmlPullParser, "scaleX", 3, this.f2361f);
            this.f2362g = k.f(typedArray, xmlPullParser, "scaleY", 4, this.f2362g);
            this.f2363h = k.f(typedArray, xmlPullParser, "translateX", 6, this.f2363h);
            this.f2364i = k.f(typedArray, xmlPullParser, "translateY", 7, this.f2364i);
            String string = typedArray.getString(0);
            if (string != null) {
                this.f2368m = string;
            }
            d();
        }

        @Override // androidx.vectordrawable.graphics.drawable.h.e
        public boolean a() {
            for (int i10 = 0; i10 < this.f2357b.size(); i10++) {
                if (this.f2357b.get(i10).a()) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.vectordrawable.graphics.drawable.h.e
        public boolean b(int[] iArr) {
            boolean z10 = false;
            for (int i10 = 0; i10 < this.f2357b.size(); i10++) {
                z10 |= this.f2357b.get(i10).b(iArr);
            }
            return z10;
        }

        public void c(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray k10 = k.k(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f2305b);
            e(k10, xmlPullParser);
            k10.recycle();
        }

        public String getGroupName() {
            return this.f2368m;
        }

        public Matrix getLocalMatrix() {
            return this.f2365j;
        }

        public float getPivotX() {
            return this.f2359d;
        }

        public float getPivotY() {
            return this.f2360e;
        }

        public float getRotation() {
            return this.f2358c;
        }

        public float getScaleX() {
            return this.f2361f;
        }

        public float getScaleY() {
            return this.f2362g;
        }

        public float getTranslateX() {
            return this.f2363h;
        }

        public float getTranslateY() {
            return this.f2364i;
        }

        public void setPivotX(float f10) {
            if (f10 != this.f2359d) {
                this.f2359d = f10;
                d();
            }
        }

        public void setPivotY(float f10) {
            if (f10 != this.f2360e) {
                this.f2360e = f10;
                d();
            }
        }

        public void setRotation(float f10) {
            if (f10 != this.f2358c) {
                this.f2358c = f10;
                d();
            }
        }

        public void setScaleX(float f10) {
            if (f10 != this.f2361f) {
                this.f2361f = f10;
                d();
            }
        }

        public void setScaleY(float f10) {
            if (f10 != this.f2362g) {
                this.f2362g = f10;
                d();
            }
        }

        public void setTranslateX(float f10) {
            if (f10 != this.f2363h) {
                this.f2363h = f10;
                d();
            }
        }

        public void setTranslateY(float f10) {
            if (f10 != this.f2364i) {
                this.f2364i = f10;
                d();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static abstract class e {
        private e() {
        }

        public boolean a() {
            return false;
        }

        public boolean b(int[] iArr) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static abstract class f extends e {

        /* renamed from: a  reason: collision with root package name */
        protected c.b[] f2369a;

        /* renamed from: b  reason: collision with root package name */
        String f2370b;

        /* renamed from: c  reason: collision with root package name */
        int f2371c;

        /* renamed from: d  reason: collision with root package name */
        int f2372d;

        public f() {
            super();
            this.f2369a = null;
            this.f2371c = 0;
        }

        public f(f fVar) {
            super();
            this.f2369a = null;
            this.f2371c = 0;
            this.f2370b = fVar.f2370b;
            this.f2372d = fVar.f2372d;
            this.f2369a = androidx.core.graphics.c.f(fVar.f2369a);
        }

        public boolean c() {
            return false;
        }

        public void d(Path path) {
            path.reset();
            c.b[] bVarArr = this.f2369a;
            if (bVarArr != null) {
                c.b.e(bVarArr, path);
            }
        }

        public c.b[] getPathData() {
            return this.f2369a;
        }

        public String getPathName() {
            return this.f2370b;
        }

        public void setPathData(c.b[] bVarArr) {
            if (androidx.core.graphics.c.b(this.f2369a, bVarArr)) {
                androidx.core.graphics.c.j(this.f2369a, bVarArr);
            } else {
                this.f2369a = androidx.core.graphics.c.f(bVarArr);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class g {

        /* renamed from: q  reason: collision with root package name */
        private static final Matrix f2373q = new Matrix();

        /* renamed from: a  reason: collision with root package name */
        private final Path f2374a;

        /* renamed from: b  reason: collision with root package name */
        private final Path f2375b;

        /* renamed from: c  reason: collision with root package name */
        private final Matrix f2376c;

        /* renamed from: d  reason: collision with root package name */
        Paint f2377d;

        /* renamed from: e  reason: collision with root package name */
        Paint f2378e;

        /* renamed from: f  reason: collision with root package name */
        private PathMeasure f2379f;

        /* renamed from: g  reason: collision with root package name */
        private int f2380g;

        /* renamed from: h  reason: collision with root package name */
        final d f2381h;

        /* renamed from: i  reason: collision with root package name */
        float f2382i;

        /* renamed from: j  reason: collision with root package name */
        float f2383j;

        /* renamed from: k  reason: collision with root package name */
        float f2384k;

        /* renamed from: l  reason: collision with root package name */
        float f2385l;

        /* renamed from: m  reason: collision with root package name */
        int f2386m;

        /* renamed from: n  reason: collision with root package name */
        String f2387n;

        /* renamed from: o  reason: collision with root package name */
        Boolean f2388o;

        /* renamed from: p  reason: collision with root package name */
        final m.a<String, Object> f2389p;

        public g() {
            this.f2376c = new Matrix();
            this.f2382i = 0.0f;
            this.f2383j = 0.0f;
            this.f2384k = 0.0f;
            this.f2385l = 0.0f;
            this.f2386m = 255;
            this.f2387n = null;
            this.f2388o = null;
            this.f2389p = new m.a<>();
            this.f2381h = new d();
            this.f2374a = new Path();
            this.f2375b = new Path();
        }

        public g(g gVar) {
            this.f2376c = new Matrix();
            this.f2382i = 0.0f;
            this.f2383j = 0.0f;
            this.f2384k = 0.0f;
            this.f2385l = 0.0f;
            this.f2386m = 255;
            this.f2387n = null;
            this.f2388o = null;
            m.a<String, Object> aVar = new m.a<>();
            this.f2389p = aVar;
            this.f2381h = new d(gVar.f2381h, aVar);
            this.f2374a = new Path(gVar.f2374a);
            this.f2375b = new Path(gVar.f2375b);
            this.f2382i = gVar.f2382i;
            this.f2383j = gVar.f2383j;
            this.f2384k = gVar.f2384k;
            this.f2385l = gVar.f2385l;
            this.f2380g = gVar.f2380g;
            this.f2386m = gVar.f2386m;
            this.f2387n = gVar.f2387n;
            String str = gVar.f2387n;
            if (str != null) {
                aVar.put(str, this);
            }
            this.f2388o = gVar.f2388o;
        }

        private static float a(float f10, float f11, float f12, float f13) {
            return (f10 * f13) - (f11 * f12);
        }

        private void c(d dVar, Matrix matrix, Canvas canvas, int i10, int i11, ColorFilter colorFilter) {
            dVar.f2356a.set(matrix);
            dVar.f2356a.preConcat(dVar.f2365j);
            canvas.save();
            for (int i12 = 0; i12 < dVar.f2357b.size(); i12++) {
                e eVar = dVar.f2357b.get(i12);
                if (eVar instanceof d) {
                    c((d) eVar, dVar.f2356a, canvas, i10, i11, colorFilter);
                } else if (eVar instanceof f) {
                    d(dVar, (f) eVar, canvas, i10, i11, colorFilter);
                }
            }
            canvas.restore();
        }

        private void d(d dVar, f fVar, Canvas canvas, int i10, int i11, ColorFilter colorFilter) {
            float f10 = i10 / this.f2384k;
            float f11 = i11 / this.f2385l;
            float min = Math.min(f10, f11);
            Matrix matrix = dVar.f2356a;
            this.f2376c.set(matrix);
            this.f2376c.postScale(f10, f11);
            float e10 = e(matrix);
            if (e10 == 0.0f) {
                return;
            }
            fVar.d(this.f2374a);
            Path path = this.f2374a;
            this.f2375b.reset();
            if (fVar.c()) {
                this.f2375b.setFillType(fVar.f2371c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                this.f2375b.addPath(path, this.f2376c);
                canvas.clipPath(this.f2375b);
                return;
            }
            c cVar = (c) fVar;
            float f12 = cVar.f2350k;
            if (f12 != 0.0f || cVar.f2351l != 1.0f) {
                float f13 = cVar.f2352m;
                float f14 = (f12 + f13) % 1.0f;
                float f15 = (cVar.f2351l + f13) % 1.0f;
                if (this.f2379f == null) {
                    this.f2379f = new PathMeasure();
                }
                this.f2379f.setPath(this.f2374a, false);
                float length = this.f2379f.getLength();
                float f16 = f14 * length;
                float f17 = f15 * length;
                path.reset();
                if (f16 > f17) {
                    this.f2379f.getSegment(f16, length, path, true);
                    this.f2379f.getSegment(0.0f, f17, path, true);
                } else {
                    this.f2379f.getSegment(f16, f17, path, true);
                }
                path.rLineTo(0.0f, 0.0f);
            }
            this.f2375b.addPath(path, this.f2376c);
            if (cVar.f2347h.l()) {
                androidx.core.content.res.d dVar2 = cVar.f2347h;
                if (this.f2378e == null) {
                    Paint paint = new Paint(1);
                    this.f2378e = paint;
                    paint.setStyle(Paint.Style.FILL);
                }
                Paint paint2 = this.f2378e;
                if (dVar2.h()) {
                    Shader f18 = dVar2.f();
                    f18.setLocalMatrix(this.f2376c);
                    paint2.setShader(f18);
                    paint2.setAlpha(Math.round(cVar.f2349j * 255.0f));
                } else {
                    paint2.setShader(null);
                    paint2.setAlpha(255);
                    paint2.setColor(h.a(dVar2.e(), cVar.f2349j));
                }
                paint2.setColorFilter(colorFilter);
                this.f2375b.setFillType(cVar.f2371c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                canvas.drawPath(this.f2375b, paint2);
            }
            if (cVar.f2345f.l()) {
                androidx.core.content.res.d dVar3 = cVar.f2345f;
                if (this.f2377d == null) {
                    Paint paint3 = new Paint(1);
                    this.f2377d = paint3;
                    paint3.setStyle(Paint.Style.STROKE);
                }
                Paint paint4 = this.f2377d;
                Paint.Join join = cVar.f2354o;
                if (join != null) {
                    paint4.setStrokeJoin(join);
                }
                Paint.Cap cap = cVar.f2353n;
                if (cap != null) {
                    paint4.setStrokeCap(cap);
                }
                paint4.setStrokeMiter(cVar.f2355p);
                if (dVar3.h()) {
                    Shader f19 = dVar3.f();
                    f19.setLocalMatrix(this.f2376c);
                    paint4.setShader(f19);
                    paint4.setAlpha(Math.round(cVar.f2348i * 255.0f));
                } else {
                    paint4.setShader(null);
                    paint4.setAlpha(255);
                    paint4.setColor(h.a(dVar3.e(), cVar.f2348i));
                }
                paint4.setColorFilter(colorFilter);
                paint4.setStrokeWidth(cVar.f2346g * min * e10);
                canvas.drawPath(this.f2375b, paint4);
            }
        }

        private float e(Matrix matrix) {
            float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
            matrix.mapVectors(fArr);
            float a10 = a(fArr[0], fArr[1], fArr[2], fArr[3]);
            float max = Math.max((float) Math.hypot(fArr[0], fArr[1]), (float) Math.hypot(fArr[2], fArr[3]));
            if (max > 0.0f) {
                return Math.abs(a10) / max;
            }
            return 0.0f;
        }

        public void b(Canvas canvas, int i10, int i11, ColorFilter colorFilter) {
            c(this.f2381h, f2373q, canvas, i10, i11, colorFilter);
        }

        public boolean f() {
            if (this.f2388o == null) {
                this.f2388o = Boolean.valueOf(this.f2381h.a());
            }
            return this.f2388o.booleanValue();
        }

        public boolean g(int[] iArr) {
            return this.f2381h.b(iArr);
        }

        public float getAlpha() {
            return getRootAlpha() / 255.0f;
        }

        public int getRootAlpha() {
            return this.f2386m;
        }

        public void setAlpha(float f10) {
            setRootAlpha((int) (f10 * 255.0f));
        }

        public void setRootAlpha(int i10) {
            this.f2386m = i10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.vectordrawable.graphics.drawable.h$h  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0046h extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        int f2390a;

        /* renamed from: b  reason: collision with root package name */
        g f2391b;

        /* renamed from: c  reason: collision with root package name */
        ColorStateList f2392c;

        /* renamed from: d  reason: collision with root package name */
        PorterDuff.Mode f2393d;

        /* renamed from: e  reason: collision with root package name */
        boolean f2394e;

        /* renamed from: f  reason: collision with root package name */
        Bitmap f2395f;

        /* renamed from: g  reason: collision with root package name */
        ColorStateList f2396g;

        /* renamed from: h  reason: collision with root package name */
        PorterDuff.Mode f2397h;

        /* renamed from: i  reason: collision with root package name */
        int f2398i;

        /* renamed from: j  reason: collision with root package name */
        boolean f2399j;

        /* renamed from: k  reason: collision with root package name */
        boolean f2400k;

        /* renamed from: l  reason: collision with root package name */
        Paint f2401l;

        public C0046h() {
            this.f2392c = null;
            this.f2393d = h.f2334x;
            this.f2391b = new g();
        }

        public C0046h(C0046h c0046h) {
            this.f2392c = null;
            this.f2393d = h.f2334x;
            if (c0046h != null) {
                this.f2390a = c0046h.f2390a;
                g gVar = new g(c0046h.f2391b);
                this.f2391b = gVar;
                if (c0046h.f2391b.f2378e != null) {
                    gVar.f2378e = new Paint(c0046h.f2391b.f2378e);
                }
                if (c0046h.f2391b.f2377d != null) {
                    this.f2391b.f2377d = new Paint(c0046h.f2391b.f2377d);
                }
                this.f2392c = c0046h.f2392c;
                this.f2393d = c0046h.f2393d;
                this.f2394e = c0046h.f2394e;
            }
        }

        public boolean a(int i10, int i11) {
            return i10 == this.f2395f.getWidth() && i11 == this.f2395f.getHeight();
        }

        public boolean b() {
            return !this.f2400k && this.f2396g == this.f2392c && this.f2397h == this.f2393d && this.f2399j == this.f2394e && this.f2398i == this.f2391b.getRootAlpha();
        }

        public void c(int i10, int i11) {
            if (this.f2395f == null || !a(i10, i11)) {
                this.f2395f = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
                this.f2400k = true;
            }
        }

        public void d(Canvas canvas, ColorFilter colorFilter, Rect rect) {
            canvas.drawBitmap(this.f2395f, (Rect) null, rect, e(colorFilter));
        }

        public Paint e(ColorFilter colorFilter) {
            if (f() || colorFilter != null) {
                if (this.f2401l == null) {
                    Paint paint = new Paint();
                    this.f2401l = paint;
                    paint.setFilterBitmap(true);
                }
                this.f2401l.setAlpha(this.f2391b.getRootAlpha());
                this.f2401l.setColorFilter(colorFilter);
                return this.f2401l;
            }
            return null;
        }

        public boolean f() {
            return this.f2391b.getRootAlpha() < 255;
        }

        public boolean g() {
            return this.f2391b.f();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f2390a;
        }

        public boolean h(int[] iArr) {
            boolean g10 = this.f2391b.g(iArr);
            this.f2400k |= g10;
            return g10;
        }

        public void i() {
            this.f2396g = this.f2392c;
            this.f2397h = this.f2393d;
            this.f2398i = this.f2391b.getRootAlpha();
            this.f2399j = this.f2394e;
            this.f2400k = false;
        }

        public void j(int i10, int i11) {
            this.f2395f.eraseColor(0);
            this.f2391b.b(new Canvas(this.f2395f), i10, i11, null);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new h(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new h(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class i extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        private final Drawable.ConstantState f2402a;

        public i(Drawable.ConstantState constantState) {
            this.f2402a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f2402a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f2402a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            h hVar = new h();
            hVar.f2333n = (VectorDrawable) this.f2402a.newDrawable();
            return hVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            h hVar = new h();
            hVar.f2333n = (VectorDrawable) this.f2402a.newDrawable(resources);
            return hVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            h hVar = new h();
            hVar.f2333n = (VectorDrawable) this.f2402a.newDrawable(resources, theme);
            return hVar;
        }
    }

    h() {
        this.f2339s = true;
        this.f2341u = new float[9];
        this.f2342v = new Matrix();
        this.f2343w = new Rect();
        this.f2335o = new C0046h();
    }

    h(C0046h c0046h) {
        this.f2339s = true;
        this.f2341u = new float[9];
        this.f2342v = new Matrix();
        this.f2343w = new Rect();
        this.f2335o = c0046h;
        this.f2336p = j(this.f2336p, c0046h.f2392c, c0046h.f2393d);
    }

    static int a(int i10, float f10) {
        return (i10 & 16777215) | (((int) (Color.alpha(i10) * f10)) << 24);
    }

    public static h b(Resources resources, int i10, Resources.Theme theme) {
        int next;
        if (Build.VERSION.SDK_INT >= 24) {
            h hVar = new h();
            hVar.f2333n = androidx.core.content.res.h.d(resources, i10, theme);
            hVar.f2340t = new i(hVar.f2333n.getConstantState());
            return hVar;
        }
        try {
            XmlResourceParser xml = resources.getXml(i10);
            AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
            while (true) {
                next = xml.next();
                if (next == 2 || next == 1) {
                    break;
                }
            }
            if (next == 2) {
                return c(resources, xml, asAttributeSet, theme);
            }
            throw new XmlPullParserException("No start tag found");
        } catch (IOException | XmlPullParserException e10) {
            Log.e("VectorDrawableCompat", "parser error", e10);
            return null;
        }
    }

    public static h c(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        h hVar = new h();
        hVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return hVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void e(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int i10;
        int i11;
        b bVar;
        C0046h c0046h = this.f2335o;
        g gVar = c0046h.f2391b;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(gVar.f2381h);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z10 = true;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                d dVar = (d) arrayDeque.peek();
                if ("path".equals(name)) {
                    c cVar = new c();
                    cVar.g(resources, attributeSet, theme, xmlPullParser);
                    dVar.f2357b.add(cVar);
                    if (cVar.getPathName() != null) {
                        gVar.f2389p.put(cVar.getPathName(), cVar);
                    }
                    z10 = false;
                    bVar = cVar;
                } else if ("clip-path".equals(name)) {
                    b bVar2 = new b();
                    bVar2.e(resources, attributeSet, theme, xmlPullParser);
                    dVar.f2357b.add(bVar2);
                    String pathName = bVar2.getPathName();
                    bVar = bVar2;
                    if (pathName != null) {
                        gVar.f2389p.put(bVar2.getPathName(), bVar2);
                        bVar = bVar2;
                    }
                } else if ("group".equals(name)) {
                    d dVar2 = new d();
                    dVar2.c(resources, attributeSet, theme, xmlPullParser);
                    dVar.f2357b.add(dVar2);
                    arrayDeque.push(dVar2);
                    if (dVar2.getGroupName() != null) {
                        gVar.f2389p.put(dVar2.getGroupName(), dVar2);
                    }
                    i10 = c0046h.f2390a;
                    i11 = dVar2.f2366k;
                    c0046h.f2390a = i11 | i10;
                }
                i10 = c0046h.f2390a;
                i11 = bVar.f2372d;
                c0046h.f2390a = i11 | i10;
            } else if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                arrayDeque.pop();
            }
            eventType = xmlPullParser.next();
        }
        if (z10) {
            throw new XmlPullParserException("no path defined");
        }
    }

    private boolean f() {
        return Build.VERSION.SDK_INT >= 17 && isAutoMirrored() && androidx.core.graphics.drawable.a.e(this) == 1;
    }

    private static PorterDuff.Mode g(int i10, PorterDuff.Mode mode) {
        if (i10 != 3) {
            if (i10 != 5) {
                if (i10 != 9) {
                    switch (i10) {
                        case 14:
                            return PorterDuff.Mode.MULTIPLY;
                        case 15:
                            return PorterDuff.Mode.SCREEN;
                        case 16:
                            return PorterDuff.Mode.ADD;
                        default:
                            return mode;
                    }
                }
                return PorterDuff.Mode.SRC_ATOP;
            }
            return PorterDuff.Mode.SRC_IN;
        }
        return PorterDuff.Mode.SRC_OVER;
    }

    private void i(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
        C0046h c0046h = this.f2335o;
        g gVar = c0046h.f2391b;
        c0046h.f2393d = g(k.g(typedArray, xmlPullParser, "tintMode", 6, -1), PorterDuff.Mode.SRC_IN);
        ColorStateList c10 = k.c(typedArray, xmlPullParser, theme, "tint", 1);
        if (c10 != null) {
            c0046h.f2392c = c10;
        }
        c0046h.f2394e = k.a(typedArray, xmlPullParser, "autoMirrored", 5, c0046h.f2394e);
        gVar.f2384k = k.f(typedArray, xmlPullParser, "viewportWidth", 7, gVar.f2384k);
        float f10 = k.f(typedArray, xmlPullParser, "viewportHeight", 8, gVar.f2385l);
        gVar.f2385l = f10;
        if (gVar.f2384k <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        } else if (f10 <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        } else {
            gVar.f2382i = typedArray.getDimension(3, gVar.f2382i);
            float dimension = typedArray.getDimension(2, gVar.f2383j);
            gVar.f2383j = dimension;
            if (gVar.f2382i <= 0.0f) {
                throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires width > 0");
            } else if (dimension <= 0.0f) {
                throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires height > 0");
            } else {
                gVar.setAlpha(k.f(typedArray, xmlPullParser, "alpha", 4, gVar.getAlpha()));
                String string = typedArray.getString(0);
                if (string != null) {
                    gVar.f2387n = string;
                    gVar.f2389p.put(string, gVar);
                }
            }
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f2333n;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.b(drawable);
            return false;
        }
        return false;
    }

    @Override // androidx.vectordrawable.graphics.drawable.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Object d(String str) {
        return this.f2335o.f2391b.f2389p.get(str);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f2333n;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        copyBounds(this.f2343w);
        if (this.f2343w.width() <= 0 || this.f2343w.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f2337q;
        if (colorFilter == null) {
            colorFilter = this.f2336p;
        }
        canvas.getMatrix(this.f2342v);
        this.f2342v.getValues(this.f2341u);
        float abs = Math.abs(this.f2341u[0]);
        float abs2 = Math.abs(this.f2341u[4]);
        float abs3 = Math.abs(this.f2341u[1]);
        float abs4 = Math.abs(this.f2341u[3]);
        if (abs3 != 0.0f || abs4 != 0.0f) {
            abs = 1.0f;
            abs2 = 1.0f;
        }
        int min = Math.min(2048, (int) (this.f2343w.width() * abs));
        int min2 = Math.min(2048, (int) (this.f2343w.height() * abs2));
        if (min <= 0 || min2 <= 0) {
            return;
        }
        int save = canvas.save();
        Rect rect = this.f2343w;
        canvas.translate(rect.left, rect.top);
        if (f()) {
            canvas.translate(this.f2343w.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        this.f2343w.offsetTo(0, 0);
        this.f2335o.c(min, min2);
        if (!this.f2339s) {
            this.f2335o.j(min, min2);
        } else if (!this.f2335o.b()) {
            this.f2335o.j(min, min2);
            this.f2335o.i();
        }
        this.f2335o.d(canvas, colorFilter, this.f2343w);
        canvas.restoreToCount(save);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f2333n;
        return drawable != null ? androidx.core.graphics.drawable.a.c(drawable) : this.f2335o.f2391b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f2333n;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f2335o.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.f2333n;
        return drawable != null ? androidx.core.graphics.drawable.a.d(drawable) : this.f2337q;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f2333n == null || Build.VERSION.SDK_INT < 24) {
            this.f2335o.f2390a = getChangingConfigurations();
            return this.f2335o;
        }
        return new i(this.f2333n.getConstantState());
    }

    @Override // androidx.vectordrawable.graphics.drawable.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f2333n;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f2335o.f2391b.f2383j;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f2333n;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f2335o.f2391b.f2382i;
    }

    @Override // androidx.vectordrawable.graphics.drawable.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // androidx.vectordrawable.graphics.drawable.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f2333n;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // androidx.vectordrawable.graphics.drawable.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    @Override // androidx.vectordrawable.graphics.drawable.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    @Override // androidx.vectordrawable.graphics.drawable.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h(boolean z10) {
        this.f2339s = z10;
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = this.f2333n;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        Drawable drawable = this.f2333n;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.f(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        C0046h c0046h = this.f2335o;
        c0046h.f2391b = new g();
        TypedArray k10 = k.k(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f2304a);
        i(k10, xmlPullParser, theme);
        k10.recycle();
        c0046h.f2390a = getChangingConfigurations();
        c0046h.f2400k = true;
        e(resources, xmlPullParser, attributeSet, theme);
        this.f2336p = j(this.f2336p, c0046h.f2392c, c0046h.f2393d);
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        Drawable drawable = this.f2333n;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f2333n;
        return drawable != null ? androidx.core.graphics.drawable.a.g(drawable) : this.f2335o.f2394e;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        C0046h c0046h;
        ColorStateList colorStateList;
        Drawable drawable = this.f2333n;
        return drawable != null ? drawable.isStateful() : super.isStateful() || ((c0046h = this.f2335o) != null && (c0046h.g() || ((colorStateList = this.f2335o.f2392c) != null && colorStateList.isStateful())));
    }

    PorterDuffColorFilter j(PorterDuffColorFilter porterDuffColorFilter, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // androidx.vectordrawable.graphics.drawable.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f2333n;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f2338r && super.mutate() == this) {
            this.f2335o = new C0046h(this.f2335o);
            this.f2338r = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f2333n;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        Drawable drawable = this.f2333n;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        boolean z10 = false;
        C0046h c0046h = this.f2335o;
        ColorStateList colorStateList = c0046h.f2392c;
        if (colorStateList != null && (mode = c0046h.f2393d) != null) {
            this.f2336p = j(this.f2336p, colorStateList, mode);
            invalidateSelf();
            z10 = true;
        }
        if (c0046h.g() && c0046h.h(iArr)) {
            invalidateSelf();
            return true;
        }
        return z10;
    }

    @Override // android.graphics.drawable.Drawable
    public void scheduleSelf(Runnable runnable, long j10) {
        Drawable drawable = this.f2333n;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j10);
        } else {
            super.scheduleSelf(runnable, j10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        Drawable drawable = this.f2333n;
        if (drawable != null) {
            drawable.setAlpha(i10);
        } else if (this.f2335o.f2391b.getRootAlpha() != i10) {
            this.f2335o.f2391b.setRootAlpha(i10);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z10) {
        Drawable drawable = this.f2333n;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.i(drawable, z10);
        } else {
            this.f2335o.f2394e = z10;
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i10) {
        super.setChangingConfigurations(i10);
    }

    @Override // androidx.vectordrawable.graphics.drawable.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(int i10, PorterDuff.Mode mode) {
        super.setColorFilter(i10, mode);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f2333n;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
            return;
        }
        this.f2337q = colorFilter;
        invalidateSelf();
    }

    @Override // androidx.vectordrawable.graphics.drawable.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z10) {
        super.setFilterBitmap(z10);
    }

    @Override // androidx.vectordrawable.graphics.drawable.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f10, float f11) {
        super.setHotspot(f10, f11);
    }

    @Override // androidx.vectordrawable.graphics.drawable.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i10, int i11, int i12, int i13) {
        super.setHotspotBounds(i10, i11, i12, i13);
    }

    @Override // androidx.vectordrawable.graphics.drawable.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.b
    public void setTint(int i10) {
        Drawable drawable = this.f2333n;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.m(drawable, i10);
        } else {
            setTintList(ColorStateList.valueOf(i10));
        }
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.b
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f2333n;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.n(drawable, colorStateList);
            return;
        }
        C0046h c0046h = this.f2335o;
        if (c0046h.f2392c != colorStateList) {
            c0046h.f2392c = colorStateList;
            this.f2336p = j(this.f2336p, colorStateList, c0046h.f2393d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.b
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f2333n;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.o(drawable, mode);
            return;
        }
        C0046h c0046h = this.f2335o;
        if (c0046h.f2393d != mode) {
            c0046h.f2393d = mode;
            this.f2336p = j(this.f2336p, c0046h.f2392c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        Drawable drawable = this.f2333n;
        return drawable != null ? drawable.setVisible(z10, z11) : super.setVisible(z10, z11);
    }

    @Override // android.graphics.drawable.Drawable
    public void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f2333n;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }
}
