package y0;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.FieldPosition;
import java.text.NumberFormat;
import java.text.ParsePosition;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
/* loaded from: classes.dex */
public class u extends DateFormat {

    /* renamed from: n  reason: collision with root package name */
    private static Calendar f16716n = new GregorianCalendar();

    /* renamed from: o  reason: collision with root package name */
    private static NumberFormat f16717o = new DecimalFormat();

    /* renamed from: p  reason: collision with root package name */
    private static u f16718p;

    private u() {
        ((DateFormat) this).numberFormat = f16717o;
        ((DateFormat) this).calendar = f16716n;
    }

    public static u c() {
        if (f16718p == null) {
            synchronized (u.class) {
                if (f16718p == null) {
                    f16718p = new u();
                }
            }
        }
        return f16718p;
    }

    @Override // java.text.DateFormat
    public StringBuffer format(Date date, StringBuffer stringBuffer, FieldPosition fieldPosition) {
        stringBuffer.append(r2.b(date, true));
        return stringBuffer;
    }

    @Override // java.text.DateFormat
    public Date parse(String str, ParsePosition parsePosition) {
        parsePosition.setIndex(str.length());
        return r2.d(str);
    }
}
