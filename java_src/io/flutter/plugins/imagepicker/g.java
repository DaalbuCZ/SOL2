package io.flutter.plugins.imagepicker;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
/* loaded from: classes.dex */
class g {

    /* renamed from: a  reason: collision with root package name */
    private final File f9054a;

    /* renamed from: b  reason: collision with root package name */
    private final b f9055b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(File file, b bVar) {
        this.f9054a = file;
        this.f9055b = bVar;
    }

    private void a(String str, String str2) {
        this.f9055b.a(str, str2);
    }

    private File b(File file, String str) {
        File file2 = new File(file, str);
        if (!file2.getParentFile().exists()) {
            file2.getParentFile().mkdirs();
        }
        return file2;
    }

    private File c(String str, Bitmap bitmap, int i10) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        boolean hasAlpha = bitmap.hasAlpha();
        if (hasAlpha) {
            Log.d("ImageResizer", "image_picker: compressing is not supported for type PNG. Returning the image with original quality");
        }
        bitmap.compress(hasAlpha ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG, i10, byteArrayOutputStream);
        File b10 = b(this.f9054a, str);
        FileOutputStream d10 = d(b10);
        d10.write(byteArrayOutputStream.toByteArray());
        d10.close();
        return b10;
    }

    private FileOutputStream d(File file) {
        return new FileOutputStream(file);
    }

    private Bitmap e(Bitmap bitmap, int i10, int i11, boolean z10) {
        return Bitmap.createScaledBitmap(bitmap, i10, i11, z10);
    }

    private Bitmap f(String str) {
        return BitmapFactory.decodeFile(str);
    }

    private boolean g(Integer num) {
        return num != null && num.intValue() > 0 && num.intValue() < 100;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0084, code lost:
        if (r8 == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x008b, code lost:
        r11 = java.lang.Double.valueOf(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x009c, code lost:
        if (r9 == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a6, code lost:
        if (r5 < r1) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.io.File i(android.graphics.Bitmap r21, java.lang.Double r22, java.lang.Double r23, java.lang.Integer r24, java.lang.String r25) {
        /*
            r20 = this;
            r0 = r20
            int r1 = r21.getWidth()
            double r1 = (double) r1
            r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r1 = r1 * r3
            int r5 = r21.getHeight()
            double r5 = (double) r5
            double r5 = r5 * r3
            r3 = r24
            boolean r4 = r0.g(r3)
            if (r4 != 0) goto L1e
            r3 = 100
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
        L1e:
            r4 = 1
            r7 = 0
            if (r22 == 0) goto L24
            r8 = r4
            goto L25
        L24:
            r8 = r7
        L25:
            if (r23 == 0) goto L29
            r9 = r4
            goto L2a
        L29:
            r9 = r7
        L2a:
            if (r8 == 0) goto L35
            double r10 = r22.doubleValue()
            double r10 = java.lang.Math.min(r1, r10)
            goto L36
        L35:
            r10 = r1
        L36:
            java.lang.Double r10 = java.lang.Double.valueOf(r10)
            if (r9 == 0) goto L45
            double r11 = r23.doubleValue()
            double r11 = java.lang.Math.min(r5, r11)
            goto L46
        L45:
            r11 = r5
        L46:
            java.lang.Double r11 = java.lang.Double.valueOf(r11)
            if (r8 == 0) goto L56
            double r12 = r22.doubleValue()
            int r12 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r12 >= 0) goto L56
            r12 = r4
            goto L57
        L56:
            r12 = r7
        L57:
            if (r9 == 0) goto L63
            double r13 = r23.doubleValue()
            int r13 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r13 >= 0) goto L63
            r13 = r4
            goto L64
        L63:
            r13 = r7
        L64:
            if (r12 != 0) goto L6a
            if (r13 == 0) goto L69
            goto L6a
        L69:
            r4 = r7
        L6a:
            if (r4 == 0) goto La9
            double r12 = r11.doubleValue()
            double r12 = r12 / r5
            double r12 = r12 * r1
            double r14 = r10.doubleValue()
            double r14 = r14 / r1
            double r14 = r14 * r5
            double r16 = r10.doubleValue()
            double r18 = r11.doubleValue()
            int r4 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r4 >= 0) goto L90
            if (r8 != 0) goto L8b
        L86:
            java.lang.Double r10 = java.lang.Double.valueOf(r12)
            goto La9
        L8b:
            java.lang.Double r11 = java.lang.Double.valueOf(r14)
            goto La9
        L90:
            double r16 = r11.doubleValue()
            double r18 = r10.doubleValue()
            int r4 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r4 >= 0) goto L9f
            if (r9 != 0) goto L86
            goto L8b
        L9f:
            int r4 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r4 >= 0) goto La4
            goto L86
        La4:
            int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r1 >= 0) goto La9
            goto L8b
        La9:
            int r1 = r10.intValue()
            int r2 = r11.intValue()
            r4 = r21
            android.graphics.Bitmap r1 = r0.e(r4, r1, r2, r7)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "/scaled_"
            r2.append(r4)
            r4 = r25
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            int r3 = r3.intValue()
            java.io.File r1 = r0.c(r2, r1, r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugins.imagepicker.g.i(android.graphics.Bitmap, java.lang.Double, java.lang.Double, java.lang.Integer, java.lang.String):java.io.File");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String h(String str, Double d10, Double d11, Integer num) {
        Bitmap f10 = f(str);
        if (f10 == null) {
            return null;
        }
        if ((d10 == null && d11 == null && !g(num)) ? false : true) {
            try {
                String[] split = str.split("/");
                File i10 = i(f10, d10, d11, num, split[split.length - 1]);
                a(str, i10.getPath());
                return i10.getPath();
            } catch (IOException e10) {
                throw new RuntimeException(e10);
            }
        }
        return str;
    }
}
