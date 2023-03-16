package io.flutter.embedding.android;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorSpace;
import android.graphics.Paint;
import android.hardware.HardwareBuffer;
import android.media.Image;
import android.media.ImageReader;
import android.os.Build;
import android.view.Surface;
import android.view.View;
import java.nio.ByteBuffer;
import java.util.Locale;
@TargetApi(19)
/* loaded from: classes.dex */
public class g extends View implements j8.c {

    /* renamed from: n  reason: collision with root package name */
    private ImageReader f8497n;

    /* renamed from: o  reason: collision with root package name */
    private Image f8498o;

    /* renamed from: p  reason: collision with root package name */
    private Bitmap f8499p;

    /* renamed from: q  reason: collision with root package name */
    private j8.a f8500q;

    /* renamed from: r  reason: collision with root package name */
    private b f8501r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f8502s;

    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f8503a;

        static {
            int[] iArr = new int[b.values().length];
            f8503a = iArr;
            try {
                iArr[b.background.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8503a[b.overlay.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* loaded from: classes.dex */
    public enum b {
        background,
        overlay
    }

    public g(Context context, int i10, int i11, b bVar) {
        this(context, d(i10, i11), bVar);
    }

    g(Context context, ImageReader imageReader, b bVar) {
        super(context, null);
        this.f8502s = false;
        this.f8497n = imageReader;
        this.f8501r = bVar;
        h();
    }

    private void b() {
        Image image = this.f8498o;
        if (image != null) {
            image.close();
            this.f8498o = null;
        }
    }

    @SuppressLint({"WrongConstant"})
    @TargetApi(19)
    private static ImageReader d(int i10, int i11) {
        int i12;
        int i13;
        if (i10 <= 0) {
            i("ImageReader width must be greater than 0, but given width=%d, set width=1", Integer.valueOf(i10));
            i12 = 1;
        } else {
            i12 = i10;
        }
        if (i11 <= 0) {
            i("ImageReader height must be greater than 0, but given height=%d, set height=1", Integer.valueOf(i11));
            i13 = 1;
        } else {
            i13 = i11;
        }
        return Build.VERSION.SDK_INT >= 29 ? ImageReader.newInstance(i12, i13, 1, 3, 768L) : ImageReader.newInstance(i12, i13, 1, 3);
    }

    private void h() {
        setAlpha(0.0f);
    }

    private static void i(String str, Object... objArr) {
        x7.b.g("FlutterImageView", String.format(Locale.US, str, objArr));
    }

    @TargetApi(c.j.f3101z3)
    private void k() {
        if (Build.VERSION.SDK_INT >= 29) {
            HardwareBuffer hardwareBuffer = this.f8498o.getHardwareBuffer();
            this.f8499p = Bitmap.wrapHardwareBuffer(hardwareBuffer, ColorSpace.get(ColorSpace.Named.SRGB));
            hardwareBuffer.close();
            return;
        }
        Image.Plane[] planes = this.f8498o.getPlanes();
        if (planes.length != 1) {
            return;
        }
        Image.Plane plane = planes[0];
        int rowStride = plane.getRowStride() / plane.getPixelStride();
        int height = this.f8498o.getHeight();
        Bitmap bitmap = this.f8499p;
        if (bitmap == null || bitmap.getWidth() != rowStride || this.f8499p.getHeight() != height) {
            this.f8499p = Bitmap.createBitmap(rowStride, height, Bitmap.Config.ARGB_8888);
        }
        ByteBuffer buffer = plane.getBuffer();
        buffer.rewind();
        this.f8499p.copyPixelsFromBuffer(buffer);
    }

    @TargetApi(19)
    public boolean a() {
        if (this.f8502s) {
            Image acquireLatestImage = this.f8497n.acquireLatestImage();
            if (acquireLatestImage != null) {
                b();
                this.f8498o = acquireLatestImage;
                invalidate();
            }
            return acquireLatestImage != null;
        }
        return false;
    }

    public void c() {
        this.f8497n.close();
    }

    @Override // j8.c
    public void e() {
    }

    @Override // j8.c
    public void f(j8.a aVar) {
        if (a.f8503a[this.f8501r.ordinal()] == 1) {
            aVar.x(this.f8497n.getSurface());
        }
        setAlpha(1.0f);
        this.f8500q = aVar;
        this.f8502s = true;
    }

    @Override // j8.c
    public void g() {
        if (this.f8502s) {
            setAlpha(0.0f);
            a();
            this.f8499p = null;
            b();
            invalidate();
            this.f8502s = false;
        }
    }

    @Override // j8.c
    public j8.a getAttachedRenderer() {
        return this.f8500q;
    }

    public ImageReader getImageReader() {
        return this.f8497n;
    }

    public Surface getSurface() {
        return this.f8497n.getSurface();
    }

    public void j(int i10, int i11) {
        if (this.f8500q == null) {
            return;
        }
        if (i10 == this.f8497n.getWidth() && i11 == this.f8497n.getHeight()) {
            return;
        }
        b();
        c();
        this.f8497n = d(i10, i11);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f8498o != null) {
            k();
        }
        Bitmap bitmap = this.f8499p;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        if (!(i10 == this.f8497n.getWidth() && i11 == this.f8497n.getHeight()) && this.f8501r == b.background && this.f8502s) {
            j(i10, i11);
            this.f8500q.x(this.f8497n.getSurface());
        }
    }
}
