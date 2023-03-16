package androidx.core.text;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
/* loaded from: classes.dex */
public class c implements Spannable {

    /* renamed from: q  reason: collision with root package name */
    private static final Object f1528q = new Object();

    /* renamed from: n  reason: collision with root package name */
    private final Spannable f1529n;

    /* renamed from: o  reason: collision with root package name */
    private final a f1530o;

    /* renamed from: p  reason: collision with root package name */
    private final PrecomputedText f1531p;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final TextPaint f1532a;

        /* renamed from: b  reason: collision with root package name */
        private final TextDirectionHeuristic f1533b;

        /* renamed from: c  reason: collision with root package name */
        private final int f1534c;

        /* renamed from: d  reason: collision with root package name */
        private final int f1535d;

        /* renamed from: e  reason: collision with root package name */
        final PrecomputedText.Params f1536e;

        /* renamed from: androidx.core.text.c$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0030a {

            /* renamed from: a  reason: collision with root package name */
            private final TextPaint f1537a;

            /* renamed from: b  reason: collision with root package name */
            private TextDirectionHeuristic f1538b;

            /* renamed from: c  reason: collision with root package name */
            private int f1539c;

            /* renamed from: d  reason: collision with root package name */
            private int f1540d;

            public C0030a(TextPaint textPaint) {
                this.f1537a = textPaint;
                int i10 = Build.VERSION.SDK_INT;
                if (i10 >= 23) {
                    this.f1539c = 1;
                    this.f1540d = 1;
                } else {
                    this.f1540d = 0;
                    this.f1539c = 0;
                }
                this.f1538b = i10 >= 18 ? TextDirectionHeuristics.FIRSTSTRONG_LTR : null;
            }

            public a a() {
                return new a(this.f1537a, this.f1538b, this.f1539c, this.f1540d);
            }

            public C0030a b(int i10) {
                this.f1539c = i10;
                return this;
            }

            public C0030a c(int i10) {
                this.f1540d = i10;
                return this;
            }

            public C0030a d(TextDirectionHeuristic textDirectionHeuristic) {
                this.f1538b = textDirectionHeuristic;
                return this;
            }
        }

        public a(PrecomputedText.Params params) {
            this.f1532a = params.getTextPaint();
            this.f1533b = params.getTextDirection();
            this.f1534c = params.getBreakStrategy();
            this.f1535d = params.getHyphenationFrequency();
            this.f1536e = Build.VERSION.SDK_INT < 29 ? null : params;
        }

        a(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i10, int i11) {
            this.f1536e = Build.VERSION.SDK_INT >= 29 ? new PrecomputedText.Params.Builder(textPaint).setBreakStrategy(i10).setHyphenationFrequency(i11).setTextDirection(textDirectionHeuristic).build() : null;
            this.f1532a = textPaint;
            this.f1533b = textDirectionHeuristic;
            this.f1534c = i10;
            this.f1535d = i11;
        }

        public boolean a(a aVar) {
            int i10 = Build.VERSION.SDK_INT;
            if ((i10 < 23 || (this.f1534c == aVar.b() && this.f1535d == aVar.c())) && this.f1532a.getTextSize() == aVar.e().getTextSize() && this.f1532a.getTextScaleX() == aVar.e().getTextScaleX() && this.f1532a.getTextSkewX() == aVar.e().getTextSkewX()) {
                if ((i10 < 21 || (this.f1532a.getLetterSpacing() == aVar.e().getLetterSpacing() && TextUtils.equals(this.f1532a.getFontFeatureSettings(), aVar.e().getFontFeatureSettings()))) && this.f1532a.getFlags() == aVar.e().getFlags()) {
                    if (i10 >= 24) {
                        if (!this.f1532a.getTextLocales().equals(aVar.e().getTextLocales())) {
                            return false;
                        }
                    } else if (i10 >= 17 && !this.f1532a.getTextLocale().equals(aVar.e().getTextLocale())) {
                        return false;
                    }
                    return this.f1532a.getTypeface() == null ? aVar.e().getTypeface() == null : this.f1532a.getTypeface().equals(aVar.e().getTypeface());
                }
                return false;
            }
            return false;
        }

        public int b() {
            return this.f1534c;
        }

        public int c() {
            return this.f1535d;
        }

        public TextDirectionHeuristic d() {
            return this.f1533b;
        }

        public TextPaint e() {
            return this.f1532a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (a(aVar)) {
                    return Build.VERSION.SDK_INT < 18 || this.f1533b == aVar.d();
                }
                return false;
            }
            return false;
        }

        public int hashCode() {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 24) {
                return androidx.core.util.d.b(Float.valueOf(this.f1532a.getTextSize()), Float.valueOf(this.f1532a.getTextScaleX()), Float.valueOf(this.f1532a.getTextSkewX()), Float.valueOf(this.f1532a.getLetterSpacing()), Integer.valueOf(this.f1532a.getFlags()), this.f1532a.getTextLocales(), this.f1532a.getTypeface(), Boolean.valueOf(this.f1532a.isElegantTextHeight()), this.f1533b, Integer.valueOf(this.f1534c), Integer.valueOf(this.f1535d));
            }
            if (i10 >= 21) {
                return androidx.core.util.d.b(Float.valueOf(this.f1532a.getTextSize()), Float.valueOf(this.f1532a.getTextScaleX()), Float.valueOf(this.f1532a.getTextSkewX()), Float.valueOf(this.f1532a.getLetterSpacing()), Integer.valueOf(this.f1532a.getFlags()), this.f1532a.getTextLocale(), this.f1532a.getTypeface(), Boolean.valueOf(this.f1532a.isElegantTextHeight()), this.f1533b, Integer.valueOf(this.f1534c), Integer.valueOf(this.f1535d));
            }
            if (i10 < 18 && i10 < 17) {
                return androidx.core.util.d.b(Float.valueOf(this.f1532a.getTextSize()), Float.valueOf(this.f1532a.getTextScaleX()), Float.valueOf(this.f1532a.getTextSkewX()), Integer.valueOf(this.f1532a.getFlags()), this.f1532a.getTypeface(), this.f1533b, Integer.valueOf(this.f1534c), Integer.valueOf(this.f1535d));
            }
            return androidx.core.util.d.b(Float.valueOf(this.f1532a.getTextSize()), Float.valueOf(this.f1532a.getTextScaleX()), Float.valueOf(this.f1532a.getTextSkewX()), Integer.valueOf(this.f1532a.getFlags()), this.f1532a.getTextLocale(), this.f1532a.getTypeface(), this.f1533b, Integer.valueOf(this.f1534c), Integer.valueOf(this.f1535d));
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x00df  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.String toString() {
            /*
                Method dump skipped, instructions count: 325
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.text.c.a.toString():java.lang.String");
        }
    }

    public a a() {
        return this.f1530o;
    }

    public PrecomputedText b() {
        Spannable spannable = this.f1529n;
        if (spannable instanceof PrecomputedText) {
            return (PrecomputedText) spannable;
        }
        return null;
    }

    @Override // java.lang.CharSequence
    public char charAt(int i10) {
        return this.f1529n.charAt(i10);
    }

    @Override // android.text.Spanned
    public int getSpanEnd(Object obj) {
        return this.f1529n.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public int getSpanFlags(Object obj) {
        return this.f1529n.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public int getSpanStart(Object obj) {
        return this.f1529n.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public <T> T[] getSpans(int i10, int i11, Class<T> cls) {
        return Build.VERSION.SDK_INT >= 29 ? (T[]) this.f1531p.getSpans(i10, i11, cls) : (T[]) this.f1529n.getSpans(i10, i11, cls);
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.f1529n.length();
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int i10, int i11, Class cls) {
        return this.f1529n.nextSpanTransition(i10, i11, cls);
    }

    @Override // android.text.Spannable
    public void removeSpan(Object obj) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
        }
        if (Build.VERSION.SDK_INT >= 29) {
            this.f1531p.removeSpan(obj);
        } else {
            this.f1529n.removeSpan(obj);
        }
    }

    @Override // android.text.Spannable
    public void setSpan(Object obj, int i10, int i11, int i12) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
        }
        if (Build.VERSION.SDK_INT >= 29) {
            this.f1531p.setSpan(obj, i10, i11, i12);
        } else {
            this.f1529n.setSpan(obj, i10, i11, i12);
        }
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i10, int i11) {
        return this.f1529n.subSequence(i10, i11);
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return this.f1529n.toString();
    }
}
