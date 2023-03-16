package j$.time.format;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.Objects;
/* loaded from: classes2.dex */
public final class x {

    /* renamed from: a  reason: collision with root package name */
    public static final x f9503a = new x('0', '+', '-', '.');

    static {
        new ConcurrentHashMap(16, 0.75f, 2);
    }

    private x(char c10, char c11, char c12, char c13) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String a(String str) {
        return str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int b(char c10) {
        int i10 = c10 - '0';
        if (i10 < 0 || i10 > 9) {
            return -1;
        }
        return i10;
    }

    public char c() {
        return '.';
    }

    public char d() {
        return '0';
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof x) {
            Objects.requireNonNull((x) obj);
            return true;
        }
        return false;
    }

    public int hashCode() {
        return 182;
    }

    public String toString() {
        return "DecimalStyle[0+-.]";
    }
}
