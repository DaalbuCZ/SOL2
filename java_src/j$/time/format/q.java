package j$.time.format;

import j$.time.ZoneId;
import j$.time.ZoneOffset;
import java.text.ParsePosition;
import java.util.AbstractMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class q implements g {

    /* renamed from: a  reason: collision with root package name */
    private static volatile Map.Entry f9482a;

    /* renamed from: b  reason: collision with root package name */
    private static volatile Map.Entry f9483b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public q(j$.time.temporal.w wVar, String str) {
    }

    private int c(s sVar, CharSequence charSequence, int i10, int i11, k kVar) {
        String upperCase = charSequence.toString().substring(i10, i11).toUpperCase();
        if (i11 >= charSequence.length() || charSequence.charAt(i11) == '0' || sVar.a(charSequence.charAt(i11), 'Z')) {
            sVar.m(ZoneId.of(upperCase));
            return i11;
        }
        s c10 = sVar.c();
        int b10 = kVar.b(c10, charSequence, i11);
        try {
            if (b10 >= 0) {
                sVar.m(ZoneId.q(upperCase, ZoneOffset.v((int) c10.i(j$.time.temporal.a.OFFSET_SECONDS).longValue())));
                return b10;
            } else if (kVar == k.f9467d) {
                return ~i10;
            } else {
                sVar.m(ZoneId.of(upperCase));
                return i11;
            }
        } catch (j$.time.d unused) {
            return ~i10;
        }
    }

    @Override // j$.time.format.g
    public boolean a(v vVar, StringBuilder sb) {
        ZoneId zoneId = (ZoneId) vVar.f(C0249a.f9448a);
        if (zoneId == null) {
            return false;
        }
        sb.append(zoneId.o());
        return true;
    }

    @Override // j$.time.format.g
    public int b(s sVar, CharSequence charSequence, int i10) {
        int i11;
        int length = charSequence.length();
        if (i10 <= length) {
            if (i10 == length) {
                return ~i10;
            }
            char charAt = charSequence.charAt(i10);
            if (charAt != '+' && charAt != '-') {
                int i12 = i10 + 2;
                if (length >= i12) {
                    char charAt2 = charSequence.charAt(i10 + 1);
                    if (sVar.a(charAt, 'U') && sVar.a(charAt2, 'T')) {
                        int i13 = i10 + 3;
                        return (length < i13 || !sVar.a(charSequence.charAt(i12), 'C')) ? c(sVar, charSequence, i10, i12, k.f9468e) : c(sVar, charSequence, i10, i13, k.f9468e);
                    } else if (sVar.a(charAt, 'G') && length >= (i11 = i10 + 3) && sVar.a(charAt2, 'M') && sVar.a(charSequence.charAt(i12), 'T')) {
                        return c(sVar, charSequence, i10, i11, k.f9468e);
                    }
                }
                Set a10 = j$.time.zone.g.a();
                int size = ((HashSet) a10).size();
                Map.Entry entry = sVar.j() ? f9482a : f9483b;
                if (entry == null || ((Integer) entry.getKey()).intValue() != size) {
                    synchronized (this) {
                        entry = sVar.j() ? f9482a : f9483b;
                        if (entry == null || ((Integer) entry.getKey()).intValue() != size) {
                            entry = new AbstractMap.SimpleImmutableEntry(Integer.valueOf(size), m.e(a10, sVar));
                            if (sVar.j()) {
                                f9482a = entry;
                            } else {
                                f9483b = entry;
                            }
                        }
                    }
                }
                ParsePosition parsePosition = new ParsePosition(i10);
                String c10 = ((m) entry.getValue()).c(charSequence, parsePosition);
                if (c10 != null) {
                    sVar.m(ZoneId.of(c10));
                    return parsePosition.getIndex();
                } else if (sVar.a(charAt, 'Z')) {
                    sVar.m(ZoneOffset.UTC);
                    return i10 + 1;
                } else {
                    return ~i10;
                }
            }
            return c(sVar, charSequence, i10, i10, k.f9467d);
        }
        throw new IndexOutOfBoundsException();
    }

    public String toString() {
        return "ZoneRegionId()";
    }
}
