package com.google.android.gms.internal.measurement;
/* loaded from: classes.dex */
final class pb {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static String a(h8 h8Var) {
        String str;
        StringBuilder sb = new StringBuilder(h8Var.h());
        for (int i10 = 0; i10 < h8Var.h(); i10++) {
            int d10 = h8Var.d(i10);
            if (d10 == 34) {
                str = "\\\"";
            } else if (d10 == 39) {
                str = "\\'";
            } else if (d10 != 92) {
                switch (d10) {
                    case 7:
                        str = "\\a";
                        break;
                    case 8:
                        str = "\\b";
                        break;
                    case 9:
                        str = "\\t";
                        break;
                    case 10:
                        str = "\\n";
                        break;
                    case 11:
                        str = "\\v";
                        break;
                    case 12:
                        str = "\\f";
                        break;
                    case 13:
                        str = "\\r";
                        break;
                    default:
                        if (d10 < 32 || d10 > 126) {
                            sb.append('\\');
                            sb.append((char) (((d10 >>> 6) & 3) + 48));
                            sb.append((char) (((d10 >>> 3) & 7) + 48));
                            d10 = (d10 & 7) + 48;
                        }
                        sb.append((char) d10);
                        continue;
                        break;
                }
            } else {
                str = "\\\\";
            }
            sb.append(str);
        }
        return sb.toString();
    }
}
