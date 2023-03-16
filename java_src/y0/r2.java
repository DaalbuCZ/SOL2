package y0;

import j$.util.DesugarTimeZone;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
/* loaded from: classes.dex */
class r2 {

    /* renamed from: a  reason: collision with root package name */
    private static final TimeZone f16695a = DesugarTimeZone.getTimeZone("GMT");

    private static int a(String str, int i10, int i11) {
        if (i10 < 0 || i11 > str.length() || i10 > i11) {
            throw new NumberFormatException(str);
        }
        int i12 = 0;
        if (i10 < i11) {
            int i13 = i10 + 1;
            int digit = Character.digit(str.charAt(i10), 10);
            if (digit < 0) {
                throw new NumberFormatException("Invalid number: " + str);
            }
            i12 = -digit;
            i10 = i13;
        }
        while (i10 < i11) {
            int i14 = i10 + 1;
            int digit2 = Character.digit(str.charAt(i10), 10);
            if (digit2 < 0) {
                throw new NumberFormatException("Invalid number: " + str);
            }
            i12 = (i12 * 10) - digit2;
            i10 = i14;
        }
        return -i12;
    }

    public static String b(Date date, boolean z10) {
        return c(date, z10, f16695a);
    }

    public static String c(Date date, boolean z10, TimeZone timeZone) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(timeZone, Locale.US);
        gregorianCalendar.setTime(date);
        StringBuilder sb = new StringBuilder((z10 ? 4 : 0) + 19 + (timeZone.getRawOffset() == 0 ? 1 : 6));
        f(sb, gregorianCalendar.get(1), 4);
        sb.append('-');
        f(sb, gregorianCalendar.get(2) + 1, 2);
        sb.append('-');
        f(sb, gregorianCalendar.get(5), 2);
        sb.append('T');
        f(sb, gregorianCalendar.get(11), 2);
        sb.append(':');
        f(sb, gregorianCalendar.get(12), 2);
        sb.append(':');
        f(sb, gregorianCalendar.get(13), 2);
        if (z10) {
            sb.append('.');
            f(sb, gregorianCalendar.get(14), 3);
        }
        int offset = timeZone.getOffset(gregorianCalendar.getTimeInMillis());
        if (offset != 0) {
            int i10 = offset / 60000;
            int abs = Math.abs(i10 / 60);
            int abs2 = Math.abs(i10 % 60);
            sb.append(offset >= 0 ? '+' : '-');
            f(sb, abs, 2);
            sb.append(':');
            f(sb, abs2, 2);
        } else {
            sb.append('Z');
        }
        return sb.toString();
    }

    public static Date d(String str) {
        int i10;
        try {
            int a10 = a(str, 0, 4);
            e(str, 4, '-');
            int a11 = a(str, 5, 7);
            e(str, 7, '-');
            int a12 = a(str, 8, 10);
            e(str, 10, 'T');
            int a13 = a(str, 11, 13);
            e(str, 13, ':');
            int a14 = a(str, 14, 16);
            e(str, 16, ':');
            int i11 = 19;
            int a15 = a(str, 17, 19);
            if (str.charAt(19) == '.') {
                e(str, 19, '.');
                i11 = 23;
                i10 = a(str, 20, 23);
            } else {
                i10 = 0;
            }
            char charAt = str.charAt(i11);
            String str2 = "GMT";
            if (charAt == '+' || charAt == '-') {
                str2 = "GMT" + str.substring(i11);
            } else if (charAt != 'Z') {
                throw new IndexOutOfBoundsException("Invalid time zone indicator " + charAt);
            }
            TimeZone timeZone = DesugarTimeZone.getTimeZone(str2);
            if (timeZone.getID().equals(str2)) {
                GregorianCalendar gregorianCalendar = new GregorianCalendar(timeZone);
                gregorianCalendar.setLenient(false);
                gregorianCalendar.set(1, a10);
                gregorianCalendar.set(2, a11 - 1);
                gregorianCalendar.set(5, a12);
                gregorianCalendar.set(11, a13);
                gregorianCalendar.set(12, a14);
                gregorianCalendar.set(13, a15);
                gregorianCalendar.set(14, i10);
                return gregorianCalendar.getTime();
            }
            throw new IndexOutOfBoundsException();
        } catch (IllegalArgumentException e10) {
            throw new IllegalArgumentException("Failed to parse date " + str, e10);
        } catch (IndexOutOfBoundsException e11) {
            throw new IllegalArgumentException("Failed to parse date " + str, e11);
        } catch (NumberFormatException e12) {
            throw new IllegalArgumentException("Failed to parse date " + str, e12);
        }
    }

    private static void e(String str, int i10, char c10) {
        char charAt = str.charAt(i10);
        if (charAt == c10) {
            return;
        }
        throw new IndexOutOfBoundsException("Expected '" + c10 + "' character but found '" + charAt + "'");
    }

    private static void f(StringBuilder sb, int i10, int i11) {
        String num = Integer.toString(i10);
        for (int length = i11 - num.length(); length > 0; length--) {
            sb.append('0');
        }
        sb.append(num);
    }
}
