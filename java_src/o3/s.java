package o3;

import android.content.Context;
import android.os.Handler;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.util.HashMap;
import java.util.Map;
import o3.f;
import p3.y;
/* loaded from: classes.dex */
public final class s implements f, p0 {

    /* renamed from: p  reason: collision with root package name */
    public static final b5.q<Long> f12072p = b5.q.M(4800000L, 3100000L, 2100000L, 1500000L, 800000L);

    /* renamed from: q  reason: collision with root package name */
    public static final b5.q<Long> f12073q = b5.q.M(1500000L, 1000000L, 730000L, 440000L, 170000L);

    /* renamed from: r  reason: collision with root package name */
    public static final b5.q<Long> f12074r = b5.q.M(2200000L, 1400000L, 1100000L, 910000L, 620000L);

    /* renamed from: s  reason: collision with root package name */
    public static final b5.q<Long> f12075s = b5.q.M(3000000L, 1900000L, 1400000L, 1000000L, 660000L);

    /* renamed from: t  reason: collision with root package name */
    public static final b5.q<Long> f12076t = b5.q.M(6000000L, 4100000L, 3200000L, 1800000L, 1000000L);

    /* renamed from: u  reason: collision with root package name */
    public static final b5.q<Long> f12077u = b5.q.M(2800000L, 2400000L, 1600000L, 1100000L, 950000L);

    /* renamed from: v  reason: collision with root package name */
    private static s f12078v;

    /* renamed from: a  reason: collision with root package name */
    private final b5.r<Integer, Long> f12079a;

    /* renamed from: b  reason: collision with root package name */
    private final f.a.C0175a f12080b;

    /* renamed from: c  reason: collision with root package name */
    private final n0 f12081c;

    /* renamed from: d  reason: collision with root package name */
    private final p3.d f12082d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f12083e;

    /* renamed from: f  reason: collision with root package name */
    private int f12084f;

    /* renamed from: g  reason: collision with root package name */
    private long f12085g;

    /* renamed from: h  reason: collision with root package name */
    private long f12086h;

    /* renamed from: i  reason: collision with root package name */
    private int f12087i;

    /* renamed from: j  reason: collision with root package name */
    private long f12088j;

    /* renamed from: k  reason: collision with root package name */
    private long f12089k;

    /* renamed from: l  reason: collision with root package name */
    private long f12090l;

    /* renamed from: m  reason: collision with root package name */
    private long f12091m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f12092n;

    /* renamed from: o  reason: collision with root package name */
    private int f12093o;

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final Context f12094a;

        /* renamed from: b  reason: collision with root package name */
        private Map<Integer, Long> f12095b;

        /* renamed from: c  reason: collision with root package name */
        private int f12096c;

        /* renamed from: d  reason: collision with root package name */
        private p3.d f12097d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f12098e;

        public b(Context context) {
            this.f12094a = context == null ? null : context.getApplicationContext();
            this.f12095b = b(p3.m0.N(context));
            this.f12096c = 2000;
            this.f12097d = p3.d.f12253a;
            this.f12098e = true;
        }

        private static Map<Integer, Long> b(String str) {
            int[] l10 = s.l(str);
            HashMap hashMap = new HashMap(8);
            hashMap.put(0, 1000000L);
            b5.q<Long> qVar = s.f12072p;
            hashMap.put(2, qVar.get(l10[0]));
            hashMap.put(3, s.f12073q.get(l10[1]));
            hashMap.put(4, s.f12074r.get(l10[2]));
            hashMap.put(5, s.f12075s.get(l10[3]));
            hashMap.put(10, s.f12076t.get(l10[4]));
            hashMap.put(9, s.f12077u.get(l10[5]));
            hashMap.put(7, qVar.get(l10[0]));
            return hashMap;
        }

        public s a() {
            return new s(this.f12094a, this.f12095b, this.f12096c, this.f12097d, this.f12098e);
        }
    }

    private s(Context context, Map<Integer, Long> map, int i10, p3.d dVar, boolean z10) {
        this.f12079a = b5.r.c(map);
        this.f12080b = new f.a.C0175a();
        this.f12081c = new n0(i10);
        this.f12082d = dVar;
        this.f12083e = z10;
        if (context == null) {
            this.f12087i = 0;
            this.f12090l = m(0);
            return;
        }
        p3.y d10 = p3.y.d(context);
        int f10 = d10.f();
        this.f12087i = f10;
        this.f12090l = m(f10);
        d10.i(new y.c() { // from class: o3.r
            @Override // p3.y.c
            public final void a(int i11) {
                s.this.q(i11);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int[] l(String str) {
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case 2083:
                if (str.equals("AD")) {
                    c10 = 0;
                    break;
                }
                break;
            case 2084:
                if (str.equals("AE")) {
                    c10 = 1;
                    break;
                }
                break;
            case 2085:
                if (str.equals("AF")) {
                    c10 = 2;
                    break;
                }
                break;
            case 2086:
                if (str.equals("AG")) {
                    c10 = 3;
                    break;
                }
                break;
            case 2088:
                if (str.equals("AI")) {
                    c10 = 4;
                    break;
                }
                break;
            case 2091:
                if (str.equals("AL")) {
                    c10 = 5;
                    break;
                }
                break;
            case 2092:
                if (str.equals("AM")) {
                    c10 = 6;
                    break;
                }
                break;
            case 2094:
                if (str.equals("AO")) {
                    c10 = 7;
                    break;
                }
                break;
            case 2096:
                if (str.equals("AQ")) {
                    c10 = '\b';
                    break;
                }
                break;
            case 2097:
                if (str.equals("AR")) {
                    c10 = '\t';
                    break;
                }
                break;
            case 2098:
                if (str.equals("AS")) {
                    c10 = '\n';
                    break;
                }
                break;
            case 2099:
                if (str.equals("AT")) {
                    c10 = 11;
                    break;
                }
                break;
            case 2100:
                if (str.equals("AU")) {
                    c10 = '\f';
                    break;
                }
                break;
            case 2102:
                if (str.equals("AW")) {
                    c10 = '\r';
                    break;
                }
                break;
            case 2103:
                if (str.equals("AX")) {
                    c10 = 14;
                    break;
                }
                break;
            case 2105:
                if (str.equals("AZ")) {
                    c10 = 15;
                    break;
                }
                break;
            case 2111:
                if (str.equals("BA")) {
                    c10 = 16;
                    break;
                }
                break;
            case 2112:
                if (str.equals("BB")) {
                    c10 = 17;
                    break;
                }
                break;
            case 2114:
                if (str.equals("BD")) {
                    c10 = 18;
                    break;
                }
                break;
            case 2115:
                if (str.equals("BE")) {
                    c10 = 19;
                    break;
                }
                break;
            case 2116:
                if (str.equals("BF")) {
                    c10 = 20;
                    break;
                }
                break;
            case 2117:
                if (str.equals("BG")) {
                    c10 = 21;
                    break;
                }
                break;
            case 2118:
                if (str.equals("BH")) {
                    c10 = 22;
                    break;
                }
                break;
            case 2119:
                if (str.equals("BI")) {
                    c10 = 23;
                    break;
                }
                break;
            case 2120:
                if (str.equals("BJ")) {
                    c10 = 24;
                    break;
                }
                break;
            case 2122:
                if (str.equals("BL")) {
                    c10 = 25;
                    break;
                }
                break;
            case 2123:
                if (str.equals("BM")) {
                    c10 = 26;
                    break;
                }
                break;
            case 2124:
                if (str.equals("BN")) {
                    c10 = 27;
                    break;
                }
                break;
            case 2125:
                if (str.equals("BO")) {
                    c10 = 28;
                    break;
                }
                break;
            case 2127:
                if (str.equals("BQ")) {
                    c10 = 29;
                    break;
                }
                break;
            case 2129:
                if (str.equals("BS")) {
                    c10 = 30;
                    break;
                }
                break;
            case 2130:
                if (str.equals("BT")) {
                    c10 = 31;
                    break;
                }
                break;
            case 2133:
                if (str.equals("BW")) {
                    c10 = ' ';
                    break;
                }
                break;
            case 2135:
                if (str.equals("BY")) {
                    c10 = '!';
                    break;
                }
                break;
            case 2136:
                if (str.equals("BZ")) {
                    c10 = '\"';
                    break;
                }
                break;
            case 2142:
                if (str.equals("CA")) {
                    c10 = '#';
                    break;
                }
                break;
            case 2145:
                if (str.equals("CD")) {
                    c10 = '$';
                    break;
                }
                break;
            case 2147:
                if (str.equals("CF")) {
                    c10 = '%';
                    break;
                }
                break;
            case 2148:
                if (str.equals("CG")) {
                    c10 = '&';
                    break;
                }
                break;
            case 2149:
                if (str.equals("CH")) {
                    c10 = '\'';
                    break;
                }
                break;
            case 2150:
                if (str.equals("CI")) {
                    c10 = '(';
                    break;
                }
                break;
            case 2152:
                if (str.equals("CK")) {
                    c10 = ')';
                    break;
                }
                break;
            case 2153:
                if (str.equals("CL")) {
                    c10 = '*';
                    break;
                }
                break;
            case 2154:
                if (str.equals("CM")) {
                    c10 = '+';
                    break;
                }
                break;
            case 2155:
                if (str.equals("CN")) {
                    c10 = ',';
                    break;
                }
                break;
            case 2156:
                if (str.equals("CO")) {
                    c10 = '-';
                    break;
                }
                break;
            case 2159:
                if (str.equals("CR")) {
                    c10 = '.';
                    break;
                }
                break;
            case 2162:
                if (str.equals("CU")) {
                    c10 = '/';
                    break;
                }
                break;
            case 2163:
                if (str.equals("CV")) {
                    c10 = '0';
                    break;
                }
                break;
            case 2164:
                if (str.equals("CW")) {
                    c10 = '1';
                    break;
                }
                break;
            case 2165:
                if (str.equals("CX")) {
                    c10 = '2';
                    break;
                }
                break;
            case 2166:
                if (str.equals("CY")) {
                    c10 = '3';
                    break;
                }
                break;
            case 2167:
                if (str.equals("CZ")) {
                    c10 = '4';
                    break;
                }
                break;
            case 2177:
                if (str.equals("DE")) {
                    c10 = '5';
                    break;
                }
                break;
            case 2182:
                if (str.equals("DJ")) {
                    c10 = '6';
                    break;
                }
                break;
            case 2183:
                if (str.equals("DK")) {
                    c10 = '7';
                    break;
                }
                break;
            case 2185:
                if (str.equals("DM")) {
                    c10 = '8';
                    break;
                }
                break;
            case 2187:
                if (str.equals("DO")) {
                    c10 = '9';
                    break;
                }
                break;
            case 2198:
                if (str.equals("DZ")) {
                    c10 = ':';
                    break;
                }
                break;
            case 2206:
                if (str.equals("EC")) {
                    c10 = ';';
                    break;
                }
                break;
            case 2208:
                if (str.equals("EE")) {
                    c10 = '<';
                    break;
                }
                break;
            case 2210:
                if (str.equals("EG")) {
                    c10 = '=';
                    break;
                }
                break;
            case 2221:
                if (str.equals("ER")) {
                    c10 = '>';
                    break;
                }
                break;
            case 2222:
                if (str.equals("ES")) {
                    c10 = '?';
                    break;
                }
                break;
            case 2223:
                if (str.equals("ET")) {
                    c10 = '@';
                    break;
                }
                break;
            case 2243:
                if (str.equals("FI")) {
                    c10 = 'A';
                    break;
                }
                break;
            case 2244:
                if (str.equals("FJ")) {
                    c10 = 'B';
                    break;
                }
                break;
            case 2245:
                if (str.equals("FK")) {
                    c10 = 'C';
                    break;
                }
                break;
            case 2247:
                if (str.equals("FM")) {
                    c10 = 'D';
                    break;
                }
                break;
            case 2249:
                if (str.equals("FO")) {
                    c10 = 'E';
                    break;
                }
                break;
            case 2252:
                if (str.equals("FR")) {
                    c10 = 'F';
                    break;
                }
                break;
            case 2266:
                if (str.equals("GA")) {
                    c10 = 'G';
                    break;
                }
                break;
            case 2267:
                if (str.equals("GB")) {
                    c10 = 'H';
                    break;
                }
                break;
            case 2269:
                if (str.equals("GD")) {
                    c10 = 'I';
                    break;
                }
                break;
            case 2270:
                if (str.equals("GE")) {
                    c10 = 'J';
                    break;
                }
                break;
            case 2271:
                if (str.equals("GF")) {
                    c10 = 'K';
                    break;
                }
                break;
            case 2272:
                if (str.equals("GG")) {
                    c10 = 'L';
                    break;
                }
                break;
            case 2273:
                if (str.equals("GH")) {
                    c10 = 'M';
                    break;
                }
                break;
            case 2274:
                if (str.equals("GI")) {
                    c10 = 'N';
                    break;
                }
                break;
            case 2277:
                if (str.equals("GL")) {
                    c10 = 'O';
                    break;
                }
                break;
            case 2278:
                if (str.equals("GM")) {
                    c10 = 'P';
                    break;
                }
                break;
            case 2279:
                if (str.equals("GN")) {
                    c10 = 'Q';
                    break;
                }
                break;
            case 2281:
                if (str.equals("GP")) {
                    c10 = 'R';
                    break;
                }
                break;
            case 2282:
                if (str.equals("GQ")) {
                    c10 = 'S';
                    break;
                }
                break;
            case 2283:
                if (str.equals("GR")) {
                    c10 = 'T';
                    break;
                }
                break;
            case 2285:
                if (str.equals("GT")) {
                    c10 = 'U';
                    break;
                }
                break;
            case 2286:
                if (str.equals("GU")) {
                    c10 = 'V';
                    break;
                }
                break;
            case 2288:
                if (str.equals("GW")) {
                    c10 = 'W';
                    break;
                }
                break;
            case 2290:
                if (str.equals("GY")) {
                    c10 = 'X';
                    break;
                }
                break;
            case 2307:
                if (str.equals("HK")) {
                    c10 = 'Y';
                    break;
                }
                break;
            case 2314:
                if (str.equals("HR")) {
                    c10 = 'Z';
                    break;
                }
                break;
            case 2316:
                if (str.equals("HT")) {
                    c10 = '[';
                    break;
                }
                break;
            case 2317:
                if (str.equals("HU")) {
                    c10 = '\\';
                    break;
                }
                break;
            case 2331:
                if (str.equals("ID")) {
                    c10 = ']';
                    break;
                }
                break;
            case 2332:
                if (str.equals("IE")) {
                    c10 = '^';
                    break;
                }
                break;
            case 2339:
                if (str.equals("IL")) {
                    c10 = '_';
                    break;
                }
                break;
            case 2340:
                if (str.equals("IM")) {
                    c10 = '`';
                    break;
                }
                break;
            case 2341:
                if (str.equals("IN")) {
                    c10 = 'a';
                    break;
                }
                break;
            case 2342:
                if (str.equals("IO")) {
                    c10 = 'b';
                    break;
                }
                break;
            case 2344:
                if (str.equals("IQ")) {
                    c10 = 'c';
                    break;
                }
                break;
            case 2345:
                if (str.equals("IR")) {
                    c10 = 'd';
                    break;
                }
                break;
            case 2346:
                if (str.equals("IS")) {
                    c10 = 'e';
                    break;
                }
                break;
            case 2347:
                if (str.equals("IT")) {
                    c10 = 'f';
                    break;
                }
                break;
            case 2363:
                if (str.equals("JE")) {
                    c10 = 'g';
                    break;
                }
                break;
            case 2371:
                if (str.equals("JM")) {
                    c10 = 'h';
                    break;
                }
                break;
            case 2373:
                if (str.equals("JO")) {
                    c10 = 'i';
                    break;
                }
                break;
            case 2374:
                if (str.equals("JP")) {
                    c10 = 'j';
                    break;
                }
                break;
            case 2394:
                if (str.equals("KE")) {
                    c10 = 'k';
                    break;
                }
                break;
            case 2396:
                if (str.equals("KG")) {
                    c10 = 'l';
                    break;
                }
                break;
            case 2397:
                if (str.equals("KH")) {
                    c10 = 'm';
                    break;
                }
                break;
            case 2398:
                if (str.equals("KI")) {
                    c10 = 'n';
                    break;
                }
                break;
            case 2402:
                if (str.equals("KM")) {
                    c10 = 'o';
                    break;
                }
                break;
            case 2403:
                if (str.equals("KN")) {
                    c10 = 'p';
                    break;
                }
                break;
            case 2405:
                if (str.equals("KP")) {
                    c10 = 'q';
                    break;
                }
                break;
            case 2407:
                if (str.equals("KR")) {
                    c10 = 'r';
                    break;
                }
                break;
            case 2412:
                if (str.equals("KW")) {
                    c10 = 's';
                    break;
                }
                break;
            case 2414:
                if (str.equals("KY")) {
                    c10 = 't';
                    break;
                }
                break;
            case 2415:
                if (str.equals("KZ")) {
                    c10 = 'u';
                    break;
                }
                break;
            case 2421:
                if (str.equals("LA")) {
                    c10 = 'v';
                    break;
                }
                break;
            case 2422:
                if (str.equals("LB")) {
                    c10 = 'w';
                    break;
                }
                break;
            case 2423:
                if (str.equals("LC")) {
                    c10 = 'x';
                    break;
                }
                break;
            case 2429:
                if (str.equals("LI")) {
                    c10 = 'y';
                    break;
                }
                break;
            case 2431:
                if (str.equals("LK")) {
                    c10 = 'z';
                    break;
                }
                break;
            case 2438:
                if (str.equals("LR")) {
                    c10 = '{';
                    break;
                }
                break;
            case 2439:
                if (str.equals("LS")) {
                    c10 = '|';
                    break;
                }
                break;
            case 2440:
                if (str.equals("LT")) {
                    c10 = '}';
                    break;
                }
                break;
            case 2441:
                if (str.equals("LU")) {
                    c10 = '~';
                    break;
                }
                break;
            case 2442:
                if (str.equals("LV")) {
                    c10 = 127;
                    break;
                }
                break;
            case 2445:
                if (str.equals("LY")) {
                    c10 = 128;
                    break;
                }
                break;
            case 2452:
                if (str.equals("MA")) {
                    c10 = 129;
                    break;
                }
                break;
            case 2454:
                if (str.equals("MC")) {
                    c10 = 130;
                    break;
                }
                break;
            case 2455:
                if (str.equals("MD")) {
                    c10 = 131;
                    break;
                }
                break;
            case 2456:
                if (str.equals("ME")) {
                    c10 = 132;
                    break;
                }
                break;
            case 2457:
                if (str.equals("MF")) {
                    c10 = 133;
                    break;
                }
                break;
            case 2458:
                if (str.equals("MG")) {
                    c10 = 134;
                    break;
                }
                break;
            case 2459:
                if (str.equals("MH")) {
                    c10 = 135;
                    break;
                }
                break;
            case 2462:
                if (str.equals("MK")) {
                    c10 = 136;
                    break;
                }
                break;
            case 2463:
                if (str.equals("ML")) {
                    c10 = 137;
                    break;
                }
                break;
            case 2464:
                if (str.equals("MM")) {
                    c10 = 138;
                    break;
                }
                break;
            case 2465:
                if (str.equals("MN")) {
                    c10 = 139;
                    break;
                }
                break;
            case 2466:
                if (str.equals("MO")) {
                    c10 = 140;
                    break;
                }
                break;
            case 2467:
                if (str.equals("MP")) {
                    c10 = 141;
                    break;
                }
                break;
            case 2468:
                if (str.equals("MQ")) {
                    c10 = 142;
                    break;
                }
                break;
            case 2469:
                if (str.equals("MR")) {
                    c10 = 143;
                    break;
                }
                break;
            case 2470:
                if (str.equals("MS")) {
                    c10 = 144;
                    break;
                }
                break;
            case 2471:
                if (str.equals("MT")) {
                    c10 = 145;
                    break;
                }
                break;
            case 2472:
                if (str.equals("MU")) {
                    c10 = 146;
                    break;
                }
                break;
            case 2473:
                if (str.equals("MV")) {
                    c10 = 147;
                    break;
                }
                break;
            case 2474:
                if (str.equals("MW")) {
                    c10 = 148;
                    break;
                }
                break;
            case 2475:
                if (str.equals("MX")) {
                    c10 = 149;
                    break;
                }
                break;
            case 2476:
                if (str.equals("MY")) {
                    c10 = 150;
                    break;
                }
                break;
            case 2477:
                if (str.equals("MZ")) {
                    c10 = 151;
                    break;
                }
                break;
            case 2483:
                if (str.equals("NA")) {
                    c10 = 152;
                    break;
                }
                break;
            case 2485:
                if (str.equals("NC")) {
                    c10 = 153;
                    break;
                }
                break;
            case 2487:
                if (str.equals("NE")) {
                    c10 = 154;
                    break;
                }
                break;
            case 2489:
                if (str.equals("NG")) {
                    c10 = 155;
                    break;
                }
                break;
            case 2491:
                if (str.equals("NI")) {
                    c10 = 156;
                    break;
                }
                break;
            case 2494:
                if (str.equals("NL")) {
                    c10 = 157;
                    break;
                }
                break;
            case 2497:
                if (str.equals("NO")) {
                    c10 = 158;
                    break;
                }
                break;
            case 2498:
                if (str.equals("NP")) {
                    c10 = 159;
                    break;
                }
                break;
            case 2500:
                if (str.equals("NR")) {
                    c10 = 160;
                    break;
                }
                break;
            case 2503:
                if (str.equals("NU")) {
                    c10 = 161;
                    break;
                }
                break;
            case 2508:
                if (str.equals("NZ")) {
                    c10 = 162;
                    break;
                }
                break;
            case 2526:
                if (str.equals("OM")) {
                    c10 = 163;
                    break;
                }
                break;
            case 2545:
                if (str.equals("PA")) {
                    c10 = 164;
                    break;
                }
                break;
            case 2549:
                if (str.equals("PE")) {
                    c10 = 165;
                    break;
                }
                break;
            case 2550:
                if (str.equals("PF")) {
                    c10 = 166;
                    break;
                }
                break;
            case 2551:
                if (str.equals("PG")) {
                    c10 = 167;
                    break;
                }
                break;
            case 2552:
                if (str.equals("PH")) {
                    c10 = 168;
                    break;
                }
                break;
            case 2555:
                if (str.equals("PK")) {
                    c10 = 169;
                    break;
                }
                break;
            case 2556:
                if (str.equals("PL")) {
                    c10 = 170;
                    break;
                }
                break;
            case 2557:
                if (str.equals("PM")) {
                    c10 = 171;
                    break;
                }
                break;
            case 2562:
                if (str.equals("PR")) {
                    c10 = 172;
                    break;
                }
                break;
            case 2563:
                if (str.equals("PS")) {
                    c10 = 173;
                    break;
                }
                break;
            case 2564:
                if (str.equals("PT")) {
                    c10 = 174;
                    break;
                }
                break;
            case 2567:
                if (str.equals("PW")) {
                    c10 = 175;
                    break;
                }
                break;
            case 2576:
                if (str.equals("QA")) {
                    c10 = 176;
                    break;
                }
                break;
            case 2611:
                if (str.equals("RE")) {
                    c10 = 177;
                    break;
                }
                break;
            case 2621:
                if (str.equals("RO")) {
                    c10 = 178;
                    break;
                }
                break;
            case 2625:
                if (str.equals("RS")) {
                    c10 = 179;
                    break;
                }
                break;
            case 2627:
                if (str.equals("RU")) {
                    c10 = 180;
                    break;
                }
                break;
            case 2629:
                if (str.equals("RW")) {
                    c10 = 181;
                    break;
                }
                break;
            case 2638:
                if (str.equals("SA")) {
                    c10 = 182;
                    break;
                }
                break;
            case 2639:
                if (str.equals("SB")) {
                    c10 = 183;
                    break;
                }
                break;
            case 2640:
                if (str.equals("SC")) {
                    c10 = 184;
                    break;
                }
                break;
            case 2641:
                if (str.equals("SD")) {
                    c10 = 185;
                    break;
                }
                break;
            case 2642:
                if (str.equals("SE")) {
                    c10 = 186;
                    break;
                }
                break;
            case 2644:
                if (str.equals("SG")) {
                    c10 = 187;
                    break;
                }
                break;
            case 2645:
                if (str.equals("SH")) {
                    c10 = 188;
                    break;
                }
                break;
            case 2646:
                if (str.equals("SI")) {
                    c10 = 189;
                    break;
                }
                break;
            case 2648:
                if (str.equals("SK")) {
                    c10 = 190;
                    break;
                }
                break;
            case 2649:
                if (str.equals("SL")) {
                    c10 = 191;
                    break;
                }
                break;
            case 2650:
                if (str.equals("SM")) {
                    c10 = 192;
                    break;
                }
                break;
            case 2651:
                if (str.equals("SN")) {
                    c10 = 193;
                    break;
                }
                break;
            case 2652:
                if (str.equals("SO")) {
                    c10 = 194;
                    break;
                }
                break;
            case 2655:
                if (str.equals("SR")) {
                    c10 = 195;
                    break;
                }
                break;
            case 2656:
                if (str.equals("SS")) {
                    c10 = 196;
                    break;
                }
                break;
            case 2657:
                if (str.equals("ST")) {
                    c10 = 197;
                    break;
                }
                break;
            case 2659:
                if (str.equals("SV")) {
                    c10 = 198;
                    break;
                }
                break;
            case 2661:
                if (str.equals("SX")) {
                    c10 = 199;
                    break;
                }
                break;
            case 2662:
                if (str.equals("SY")) {
                    c10 = 200;
                    break;
                }
                break;
            case 2663:
                if (str.equals("SZ")) {
                    c10 = 201;
                    break;
                }
                break;
            case 2671:
                if (str.equals("TC")) {
                    c10 = 202;
                    break;
                }
                break;
            case 2672:
                if (str.equals("TD")) {
                    c10 = 203;
                    break;
                }
                break;
            case 2675:
                if (str.equals("TG")) {
                    c10 = 204;
                    break;
                }
                break;
            case 2676:
                if (str.equals("TH")) {
                    c10 = 205;
                    break;
                }
                break;
            case 2678:
                if (str.equals("TJ")) {
                    c10 = 206;
                    break;
                }
                break;
            case 2679:
                if (str.equals("TK")) {
                    c10 = 207;
                    break;
                }
                break;
            case 2680:
                if (str.equals("TL")) {
                    c10 = 208;
                    break;
                }
                break;
            case 2681:
                if (str.equals("TM")) {
                    c10 = 209;
                    break;
                }
                break;
            case 2682:
                if (str.equals("TN")) {
                    c10 = 210;
                    break;
                }
                break;
            case 2683:
                if (str.equals("TO")) {
                    c10 = 211;
                    break;
                }
                break;
            case 2686:
                if (str.equals("TR")) {
                    c10 = 212;
                    break;
                }
                break;
            case 2688:
                if (str.equals("TT")) {
                    c10 = 213;
                    break;
                }
                break;
            case 2690:
                if (str.equals("TV")) {
                    c10 = 214;
                    break;
                }
                break;
            case 2691:
                if (str.equals("TW")) {
                    c10 = 215;
                    break;
                }
                break;
            case 2694:
                if (str.equals("TZ")) {
                    c10 = 216;
                    break;
                }
                break;
            case 2700:
                if (str.equals("UA")) {
                    c10 = 217;
                    break;
                }
                break;
            case 2706:
                if (str.equals("UG")) {
                    c10 = 218;
                    break;
                }
                break;
            case 2718:
                if (str.equals("US")) {
                    c10 = 219;
                    break;
                }
                break;
            case 2724:
                if (str.equals("UY")) {
                    c10 = 220;
                    break;
                }
                break;
            case 2725:
                if (str.equals("UZ")) {
                    c10 = 221;
                    break;
                }
                break;
            case 2731:
                if (str.equals("VA")) {
                    c10 = 222;
                    break;
                }
                break;
            case 2733:
                if (str.equals("VC")) {
                    c10 = 223;
                    break;
                }
                break;
            case 2735:
                if (str.equals("VE")) {
                    c10 = 224;
                    break;
                }
                break;
            case 2737:
                if (str.equals("VG")) {
                    c10 = 225;
                    break;
                }
                break;
            case 2739:
                if (str.equals("VI")) {
                    c10 = 226;
                    break;
                }
                break;
            case 2744:
                if (str.equals("VN")) {
                    c10 = 227;
                    break;
                }
                break;
            case 2751:
                if (str.equals("VU")) {
                    c10 = 228;
                    break;
                }
                break;
            case 2767:
                if (str.equals("WF")) {
                    c10 = 229;
                    break;
                }
                break;
            case 2780:
                if (str.equals("WS")) {
                    c10 = 230;
                    break;
                }
                break;
            case 2803:
                if (str.equals("XK")) {
                    c10 = 231;
                    break;
                }
                break;
            case 2828:
                if (str.equals("YE")) {
                    c10 = 232;
                    break;
                }
                break;
            case 2843:
                if (str.equals("YT")) {
                    c10 = 233;
                    break;
                }
                break;
            case 2855:
                if (str.equals("ZA")) {
                    c10 = 234;
                    break;
                }
                break;
            case 2867:
                if (str.equals("ZM")) {
                    c10 = 235;
                    break;
                }
                break;
            case 2877:
                if (str.equals("ZW")) {
                    c10 = 236;
                    break;
                }
                break;
        }
        int[] iArr = {1, 2, 0, 0, 2, 2};
        switch (c10) {
            case 0:
            case 26:
            case c.j.f3101z3 /* 29 */:
            case 'I':
            case 'O':
            case 'p':
            case c.j.F0 /* 116 */:
            case c.j.J0 /* 120 */:
            case 223:
                return iArr;
            case 1:
                // fill-array-data instruction
                iArr[0] = 1;
                iArr[1] = 4;
                iArr[2] = 4;
                iArr[3] = 4;
                iArr[4] = 4;
                iArr[5] = 0;
                return iArr;
            case 2:
            case 'P':
                // fill-array-data instruction
                iArr[0] = 4;
                iArr[1] = 3;
                iArr[2] = 3;
                iArr[3] = 4;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 3:
                // fill-array-data instruction
                iArr[0] = 2;
                iArr[1] = 4;
                iArr[2] = 1;
                iArr[3] = 2;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 4:
                // fill-array-data instruction
                iArr[0] = 0;
                iArr[1] = 2;
                iArr[2] = 0;
                iArr[3] = 3;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 5:
            case 231:
                // fill-array-data instruction
                iArr[0] = 1;
                iArr[1] = 1;
                iArr[2] = 1;
                iArr[3] = 1;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 6:
                // fill-array-data instruction
                iArr[0] = 2;
                iArr[1] = 3;
                iArr[2] = 2;
                iArr[3] = 3;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 7:
                // fill-array-data instruction
                iArr[0] = 4;
                iArr[1] = 4;
                iArr[2] = 3;
                iArr[3] = 2;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case '\b':
            case '>':
            case 188:
                // fill-array-data instruction
                iArr[0] = 4;
                iArr[1] = 2;
                iArr[2] = 2;
                iArr[3] = 2;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case '\t':
            case 'l':
            case 210:
            case 220:
                // fill-array-data instruction
                iArr[0] = 2;
                iArr[1] = 1;
                iArr[2] = 1;
                iArr[3] = 1;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case '\n':
                // fill-array-data instruction
                iArr[0] = 2;
                iArr[1] = 2;
                iArr[2] = 3;
                iArr[3] = 3;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 11:
                // fill-array-data instruction
                iArr[0] = 1;
                iArr[1] = 0;
                iArr[2] = 1;
                iArr[3] = 1;
                iArr[4] = 0;
                iArr[5] = 0;
                return iArr;
            case '\f':
                // fill-array-data instruction
                iArr[0] = 0;
                iArr[1] = 1;
                iArr[2] = 1;
                iArr[3] = 1;
                iArr[4] = 2;
                iArr[5] = 0;
                return iArr;
            case '\r':
                // fill-array-data instruction
                iArr[0] = 1;
                iArr[1] = 3;
                iArr[2] = 4;
                iArr[3] = 4;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 14:
            case c.j.K0 /* 121 */:
            case 144:
            case 171:
            case 192:
                // fill-array-data instruction
                iArr[0] = 0;
                iArr[1] = 2;
                iArr[2] = 2;
                iArr[3] = 2;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 15:
            case 'K':
            case 128:
            case 169:
            case 194:
            case 211:
                // fill-array-data instruction
                iArr[0] = 3;
                iArr[1] = 2;
                iArr[2] = 3;
                iArr[3] = 3;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 16:
                // fill-array-data instruction
                iArr[0] = 1;
                iArr[1] = 2;
                iArr[2] = 1;
                iArr[3] = 1;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 17:
            case '8':
            case 'E':
            case 'N':
                // fill-array-data instruction
                iArr[0] = 0;
                iArr[1] = 2;
                iArr[2] = 0;
                iArr[3] = 0;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 18:
                // fill-array-data instruction
                iArr[0] = 2;
                iArr[1] = 1;
                iArr[2] = 3;
                iArr[3] = 3;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 19:
                // fill-array-data instruction
                iArr[0] = 0;
                iArr[1] = 1;
                iArr[2] = 4;
                iArr[3] = 4;
                iArr[4] = 3;
                iArr[5] = 2;
                return iArr;
            case 20:
                // fill-array-data instruction
                iArr[0] = 4;
                iArr[1] = 3;
                iArr[2] = 4;
                iArr[3] = 3;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 21:
            case 145:
            case 190:
                // fill-array-data instruction
                iArr[0] = 0;
                iArr[1] = 0;
                iArr[2] = 0;
                iArr[3] = 0;
                iArr[4] = 1;
                iArr[5] = 2;
                return iArr;
            case 22:
                // fill-array-data instruction
                iArr[0] = 1;
                iArr[1] = 2;
                iArr[2] = 1;
                iArr[3] = 3;
                iArr[4] = 4;
                iArr[5] = 2;
                return iArr;
            case c.j.f3071t3 /* 23 */:
            case '[':
            case 'o':
            case 134:
            case 154:
            case 185:
            case 203:
            case 224:
            case 232:
                // fill-array-data instruction
                iArr[0] = 4;
                iArr[1] = 4;
                iArr[2] = 4;
                iArr[3] = 4;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case c.j.f3076u3 /* 24 */:
                // fill-array-data instruction
                iArr[0] = 4;
                iArr[1] = 4;
                iArr[2] = 3;
                iArr[3] = 3;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 25:
            case '2':
            case 222:
                // fill-array-data instruction
                iArr[0] = 1;
                iArr[1] = 2;
                iArr[2] = 2;
                iArr[3] = 2;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 27:
            case '1':
                // fill-array-data instruction
                iArr[0] = 2;
                iArr[1] = 2;
                iArr[2] = 0;
                iArr[3] = 0;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 28:
                // fill-array-data instruction
                iArr[0] = 1;
                iArr[1] = 2;
                iArr[2] = 3;
                iArr[3] = 2;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 30:
                // fill-array-data instruction
                iArr[0] = 4;
                iArr[1] = 4;
                iArr[2] = 2;
                iArr[3] = 2;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 31:
                // fill-array-data instruction
                iArr[0] = 3;
                iArr[1] = 1;
                iArr[2] = 3;
                iArr[3] = 2;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case ' ':
                // fill-array-data instruction
                iArr[0] = 3;
                iArr[1] = 2;
                iArr[2] = 1;
                iArr[3] = 0;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case '!':
                // fill-array-data instruction
                iArr[0] = 0;
                iArr[1] = 1;
                iArr[2] = 2;
                iArr[3] = 3;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case '\"':
                // fill-array-data instruction
                iArr[0] = 2;
                iArr[1] = 4;
                iArr[2] = 2;
                iArr[3] = 1;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case '#':
                // fill-array-data instruction
                iArr[0] = 0;
                iArr[1] = 2;
                iArr[2] = 2;
                iArr[3] = 2;
                iArr[4] = 3;
                iArr[5] = 2;
                return iArr;
            case '$':
                // fill-array-data instruction
                iArr[0] = 4;
                iArr[1] = 2;
                iArr[2] = 3;
                iArr[3] = 2;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case '%':
            case 'n':
                // fill-array-data instruction
                iArr[0] = 4;
                iArr[1] = 2;
                iArr[2] = 4;
                iArr[3] = 2;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case '&':
            case '=':
            case 'W':
                // fill-array-data instruction
                iArr[0] = 3;
                iArr[1] = 4;
                iArr[2] = 3;
                iArr[3] = 3;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case '\'':
                // fill-array-data instruction
                iArr[0] = 0;
                iArr[1] = 0;
                iArr[2] = 0;
                iArr[3] = 1;
                iArr[4] = 0;
                iArr[5] = 2;
                return iArr;
            case '(':
            case ':':
            case c.j.M0 /* 123 */:
                // fill-array-data instruction
                iArr[0] = 3;
                iArr[1] = 4;
                iArr[2] = 4;
                iArr[3] = 4;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case ')':
            case 166:
                // fill-array-data instruction
                iArr[0] = 2;
                iArr[1] = 2;
                iArr[2] = 2;
                iArr[3] = 1;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case '*':
            case '_':
                // fill-array-data instruction
                iArr[0] = 1;
                iArr[1] = 2;
                iArr[2] = 2;
                iArr[3] = 2;
                iArr[4] = 3;
                iArr[5] = 2;
                return iArr;
            case '+':
                // fill-array-data instruction
                iArr[0] = 3;
                iArr[1] = 3;
                iArr[2] = 3;
                iArr[3] = 3;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case ',':
                // fill-array-data instruction
                iArr[0] = 2;
                iArr[1] = 0;
                iArr[2] = 1;
                iArr[3] = 1;
                iArr[4] = 3;
                iArr[5] = 2;
                return iArr;
            case '-':
                // fill-array-data instruction
                iArr[0] = 2;
                iArr[1] = 3;
                iArr[2] = 4;
                iArr[3] = 3;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case '.':
                // fill-array-data instruction
                iArr[0] = 2;
                iArr[1] = 3;
                iArr[2] = 4;
                iArr[3] = 4;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case '/':
            case '6':
            case 200:
            case 206:
            case 208:
                // fill-array-data instruction
                iArr[0] = 4;
                iArr[1] = 3;
                iArr[2] = 4;
                iArr[3] = 4;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case '0':
                // fill-array-data instruction
                iArr[0] = 2;
                iArr[1] = 1;
                iArr[2] = 0;
                iArr[3] = 0;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case '3':
            case c.j.E0 /* 115 */:
                // fill-array-data instruction
                iArr[0] = 1;
                iArr[1] = 0;
                iArr[2] = 0;
                iArr[3] = 0;
                iArr[4] = 0;
                iArr[5] = 2;
                return iArr;
            case '4':
            case 158:
                // fill-array-data instruction
                iArr[0] = 0;
                iArr[1] = 0;
                iArr[2] = 2;
                iArr[3] = 0;
                iArr[4] = 1;
                iArr[5] = 2;
                return iArr;
            case '5':
                // fill-array-data instruction
                iArr[0] = 0;
                iArr[1] = 1;
                iArr[2] = 2;
                iArr[3] = 2;
                iArr[4] = 2;
                iArr[5] = 3;
                return iArr;
            case '7':
                // fill-array-data instruction
                iArr[0] = 0;
                iArr[1] = 0;
                iArr[2] = 3;
                iArr[3] = 2;
                iArr[4] = 0;
                iArr[5] = 2;
                return iArr;
            case '9':
                // fill-array-data instruction
                iArr[0] = 3;
                iArr[1] = 4;
                iArr[2] = 4;
                iArr[3] = 4;
                iArr[4] = 4;
                iArr[5] = 2;
                return iArr;
            case ';':
                // fill-array-data instruction
                iArr[0] = 2;
                iArr[1] = 3;
                iArr[2] = 2;
                iArr[3] = 1;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case '<':
            case 'e':
            case 127:
            case 174:
            case 186:
            case 215:
                // fill-array-data instruction
                iArr[0] = 0;
                iArr[1] = 0;
                iArr[2] = 0;
                iArr[3] = 0;
                iArr[4] = 0;
                iArr[5] = 2;
                return iArr;
            case '?':
            case '^':
                // fill-array-data instruction
                iArr[0] = 0;
                iArr[1] = 1;
                iArr[2] = 1;
                iArr[3] = 1;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case '@':
                // fill-array-data instruction
                iArr[0] = 4;
                iArr[1] = 3;
                iArr[2] = 3;
                iArr[3] = 1;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 'A':
                // fill-array-data instruction
                iArr[0] = 0;
                iArr[1] = 0;
                iArr[2] = 0;
                iArr[3] = 3;
                iArr[4] = 0;
                iArr[5] = 2;
                return iArr;
            case 'B':
                // fill-array-data instruction
                iArr[0] = 3;
                iArr[1] = 1;
                iArr[2] = 2;
                iArr[3] = 2;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 'C':
            case 'k':
            case 'q':
                // fill-array-data instruction
                iArr[0] = 3;
                iArr[1] = 2;
                iArr[2] = 2;
                iArr[3] = 2;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 'D':
                // fill-array-data instruction
                iArr[0] = 4;
                iArr[1] = 2;
                iArr[2] = 4;
                iArr[3] = 1;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 'F':
                // fill-array-data instruction
                iArr[0] = 1;
                iArr[1] = 2;
                iArr[2] = 3;
                iArr[3] = 1;
                iArr[4] = 0;
                iArr[5] = 2;
                return iArr;
            case 'G':
            case 204:
                // fill-array-data instruction
                iArr[0] = 3;
                iArr[1] = 4;
                iArr[2] = 1;
                iArr[3] = 0;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 'H':
                // fill-array-data instruction
                iArr[0] = 0;
                iArr[1] = 0;
                iArr[2] = 1;
                iArr[3] = 1;
                iArr[4] = 1;
                iArr[5] = 1;
                return iArr;
            case 'J':
                // fill-array-data instruction
                iArr[0] = 1;
                iArr[1] = 1;
                iArr[2] = 1;
                iArr[3] = 2;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 'L':
            case 226:
                // fill-array-data instruction
                iArr[0] = 0;
                iArr[1] = 2;
                iArr[2] = 0;
                iArr[3] = 1;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 'M':
            case 152:
            case 228:
                // fill-array-data instruction
                iArr[0] = 3;
                iArr[1] = 3;
                iArr[2] = 3;
                iArr[3] = 2;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 'Q':
                // fill-array-data instruction
                iArr[0] = 4;
                iArr[1] = 3;
                iArr[2] = 4;
                iArr[3] = 2;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 'R':
            case 142:
                // fill-array-data instruction
                iArr[0] = 2;
                iArr[1] = 1;
                iArr[2] = 2;
                iArr[3] = 3;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 'S':
                // fill-array-data instruction
                iArr[0] = 4;
                iArr[1] = 2;
                iArr[2] = 1;
                iArr[3] = 4;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case c.j.C0 /* 84 */:
            case 'Z':
            case 189:
                // fill-array-data instruction
                iArr[0] = 1;
                iArr[1] = 0;
                iArr[2] = 0;
                iArr[3] = 0;
                iArr[4] = 1;
                iArr[5] = 2;
                return iArr;
            case 'U':
                // fill-array-data instruction
                iArr[0] = 2;
                iArr[1] = 3;
                iArr[2] = 2;
                iArr[3] = 2;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case ModuleDescriptor.MODULE_VERSION /* 86 */:
            case 165:
                // fill-array-data instruction
                iArr[0] = 1;
                iArr[1] = 2;
                iArr[2] = 4;
                iArr[3] = 4;
                iArr[4] = 4;
                iArr[5] = 2;
                return iArr;
            case 'X':
                // fill-array-data instruction
                iArr[0] = 3;
                iArr[1] = 2;
                iArr[2] = 2;
                iArr[3] = 1;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 'Y':
                // fill-array-data instruction
                iArr[0] = 0;
                iArr[1] = 1;
                iArr[2] = 2;
                iArr[3] = 3;
                iArr[4] = 2;
                iArr[5] = 0;
                return iArr;
            case '\\':
                // fill-array-data instruction
                iArr[0] = 0;
                iArr[1] = 0;
                iArr[2] = 0;
                iArr[3] = 1;
                iArr[4] = 3;
                iArr[5] = 2;
                return iArr;
            case ']':
                // fill-array-data instruction
                iArr[0] = 3;
                iArr[1] = 1;
                iArr[2] = 2;
                iArr[3] = 2;
                iArr[4] = 3;
                iArr[5] = 2;
                return iArr;
            case '`':
            case 217:
                // fill-array-data instruction
                iArr[0] = 0;
                iArr[1] = 2;
                iArr[2] = 1;
                iArr[3] = 1;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 'a':
                // fill-array-data instruction
                iArr[0] = 1;
                iArr[1] = 1;
                iArr[2] = 3;
                iArr[3] = 2;
                iArr[4] = 3;
                iArr[5] = 3;
                return iArr;
            case 'b':
            case 135:
            case 214:
            case 229:
                // fill-array-data instruction
                iArr[0] = 4;
                iArr[1] = 2;
                iArr[2] = 2;
                iArr[3] = 4;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 'c':
                // fill-array-data instruction
                iArr[0] = 3;
                iArr[1] = 2;
                iArr[2] = 2;
                iArr[3] = 3;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 'd':
                // fill-array-data instruction
                iArr[0] = 3;
                iArr[1] = 0;
                iArr[2] = 1;
                iArr[3] = 1;
                iArr[4] = 4;
                iArr[5] = 1;
                return iArr;
            case 'f':
                // fill-array-data instruction
                iArr[0] = 0;
                iArr[1] = 0;
                iArr[2] = 0;
                iArr[3] = 1;
                iArr[4] = 1;
                iArr[5] = 2;
                return iArr;
            case 'g':
            case 233:
                // fill-array-data instruction
                iArr[0] = 4;
                iArr[1] = 2;
                iArr[2] = 2;
                iArr[3] = 3;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 'h':
                // fill-array-data instruction
                iArr[0] = 2;
                iArr[1] = 4;
                iArr[2] = 3;
                iArr[3] = 2;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 'i':
                // fill-array-data instruction
                iArr[0] = 2;
                iArr[1] = 1;
                iArr[2] = 1;
                iArr[3] = 2;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 'j':
                // fill-array-data instruction
                iArr[0] = 0;
                iArr[1] = 1;
                iArr[2] = 1;
                iArr[3] = 2;
                iArr[4] = 2;
                iArr[5] = 4;
                return iArr;
            case 'm':
                // fill-array-data instruction
                iArr[0] = 2;
                iArr[1] = 1;
                iArr[2] = 4;
                iArr[3] = 2;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case c.j.D0 /* 114 */:
                // fill-array-data instruction
                iArr[0] = 0;
                iArr[1] = 1;
                iArr[2] = 1;
                iArr[3] = 3;
                iArr[4] = 4;
                iArr[5] = 4;
                return iArr;
            case c.j.G0 /* 117 */:
                // fill-array-data instruction
                iArr[0] = 2;
                iArr[1] = 1;
                iArr[2] = 2;
                iArr[3] = 2;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case c.j.H0 /* 118 */:
                // fill-array-data instruction
                iArr[0] = 1;
                iArr[1] = 2;
                iArr[2] = 1;
                iArr[3] = 3;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case c.j.I0 /* 119 */:
                // fill-array-data instruction
                iArr[0] = 3;
                iArr[1] = 3;
                iArr[2] = 2;
                iArr[3] = 4;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case c.j.L0 /* 122 */:
                // fill-array-data instruction
                iArr[0] = 3;
                iArr[1] = 1;
                iArr[2] = 3;
                iArr[3] = 3;
                iArr[4] = 4;
                iArr[5] = 2;
                return iArr;
            case c.j.N0 /* 124 */:
                // fill-array-data instruction
                iArr[0] = 3;
                iArr[1] = 3;
                iArr[2] = 2;
                iArr[3] = 2;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case '}':
                // fill-array-data instruction
                iArr[0] = 0;
                iArr[1] = 0;
                iArr[2] = 0;
                iArr[3] = 0;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case '~':
                // fill-array-data instruction
                iArr[0] = 1;
                iArr[1] = 0;
                iArr[2] = 3;
                iArr[3] = 2;
                iArr[4] = 1;
                iArr[5] = 4;
                return iArr;
            case 129:
                // fill-array-data instruction
                iArr[0] = 3;
                iArr[1] = 3;
                iArr[2] = 1;
                iArr[3] = 1;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 130:
                // fill-array-data instruction
                iArr[0] = 0;
                iArr[1] = 2;
                iArr[2] = 2;
                iArr[3] = 0;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 131:
            case 179:
                // fill-array-data instruction
                iArr[0] = 1;
                iArr[1] = 0;
                iArr[2] = 0;
                iArr[3] = 0;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 132:
                // fill-array-data instruction
                iArr[0] = 2;
                iArr[1] = 0;
                iArr[2] = 0;
                iArr[3] = 1;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 133:
            case 177:
                // fill-array-data instruction
                iArr[0] = 1;
                iArr[1] = 2;
                iArr[2] = 1;
                iArr[3] = 2;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 136:
                // fill-array-data instruction
                iArr[0] = 1;
                iArr[1] = 0;
                iArr[2] = 0;
                iArr[3] = 1;
                iArr[4] = 3;
                iArr[5] = 2;
                return iArr;
            case 137:
            case 167:
                // fill-array-data instruction
                iArr[0] = 4;
                iArr[1] = 3;
                iArr[2] = 3;
                iArr[3] = 2;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 138:
                // fill-array-data instruction
                iArr[0] = 2;
                iArr[1] = 4;
                iArr[2] = 2;
                iArr[3] = 3;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 139:
                // fill-array-data instruction
                iArr[0] = 2;
                iArr[1] = 0;
                iArr[2] = 1;
                iArr[3] = 2;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 140:
            case 141:
                // fill-array-data instruction
                iArr[0] = 0;
                iArr[1] = 2;
                iArr[2] = 4;
                iArr[3] = 4;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 143:
            case 236:
                // fill-array-data instruction
                iArr[0] = 4;
                iArr[1] = 2;
                iArr[2] = 4;
                iArr[3] = 4;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 146:
                // fill-array-data instruction
                iArr[0] = 3;
                iArr[1] = 1;
                iArr[2] = 1;
                iArr[3] = 2;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 147:
                // fill-array-data instruction
                iArr[0] = 3;
                iArr[1] = 4;
                iArr[2] = 1;
                iArr[3] = 4;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 148:
                // fill-array-data instruction
                iArr[0] = 4;
                iArr[1] = 2;
                iArr[2] = 3;
                iArr[3] = 3;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 149:
                // fill-array-data instruction
                iArr[0] = 2;
                iArr[1] = 4;
                iArr[2] = 3;
                iArr[3] = 4;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 150:
                // fill-array-data instruction
                iArr[0] = 1;
                iArr[1] = 0;
                iArr[2] = 3;
                iArr[3] = 1;
                iArr[4] = 3;
                iArr[5] = 2;
                return iArr;
            case 151:
                // fill-array-data instruction
                iArr[0] = 3;
                iArr[1] = 1;
                iArr[2] = 2;
                iArr[3] = 1;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 153:
                // fill-array-data instruction
                iArr[0] = 3;
                iArr[1] = 3;
                iArr[2] = 4;
                iArr[3] = 4;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 155:
                // fill-array-data instruction
                iArr[0] = 3;
                iArr[1] = 4;
                iArr[2] = 2;
                iArr[3] = 1;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 156:
            case 164:
            case 198:
                // fill-array-data instruction
                iArr[0] = 2;
                iArr[1] = 3;
                iArr[2] = 3;
                iArr[3] = 3;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 157:
                // fill-array-data instruction
                iArr[0] = 0;
                iArr[1] = 2;
                iArr[2] = 2;
                iArr[3] = 3;
                iArr[4] = 0;
                iArr[5] = 3;
                return iArr;
            case 159:
                // fill-array-data instruction
                iArr[0] = 2;
                iArr[1] = 2;
                iArr[2] = 4;
                iArr[3] = 3;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 160:
            case 161:
                // fill-array-data instruction
                iArr[0] = 4;
                iArr[1] = 2;
                iArr[2] = 2;
                iArr[3] = 1;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 162:
            case 170:
                // fill-array-data instruction
                iArr[0] = 1;
                iArr[1] = 1;
                iArr[2] = 2;
                iArr[3] = 2;
                iArr[4] = 4;
                iArr[5] = 2;
                return iArr;
            case 163:
                // fill-array-data instruction
                iArr[0] = 2;
                iArr[1] = 3;
                iArr[2] = 1;
                iArr[3] = 3;
                iArr[4] = 4;
                iArr[5] = 2;
                return iArr;
            case 168:
                // fill-array-data instruction
                iArr[0] = 2;
                iArr[1] = 1;
                iArr[2] = 3;
                iArr[3] = 3;
                iArr[4] = 3;
                iArr[5] = 0;
                return iArr;
            case 172:
                // fill-array-data instruction
                iArr[0] = 2;
                iArr[1] = 0;
                iArr[2] = 2;
                iArr[3] = 1;
                iArr[4] = 2;
                iArr[5] = 1;
                return iArr;
            case 173:
                // fill-array-data instruction
                iArr[0] = 3;
                iArr[1] = 4;
                iArr[2] = 1;
                iArr[3] = 2;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 175:
                // fill-array-data instruction
                iArr[0] = 2;
                iArr[1] = 2;
                iArr[2] = 4;
                iArr[3] = 1;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 176:
                // fill-array-data instruction
                iArr[0] = 2;
                iArr[1] = 4;
                iArr[2] = 4;
                iArr[3] = 4;
                iArr[4] = 4;
                iArr[5] = 2;
                return iArr;
            case 178:
                // fill-array-data instruction
                iArr[0] = 0;
                iArr[1] = 0;
                iArr[2] = 1;
                iArr[3] = 2;
                iArr[4] = 1;
                iArr[5] = 2;
                return iArr;
            case 180:
                // fill-array-data instruction
                iArr[0] = 1;
                iArr[1] = 0;
                iArr[2] = 0;
                iArr[3] = 0;
                iArr[4] = 4;
                iArr[5] = 3;
                return iArr;
            case 181:
                // fill-array-data instruction
                iArr[0] = 3;
                iArr[1] = 4;
                iArr[2] = 2;
                iArr[3] = 0;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 182:
                // fill-array-data instruction
                iArr[0] = 3;
                iArr[1] = 1;
                iArr[2] = 1;
                iArr[3] = 1;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 183:
                // fill-array-data instruction
                iArr[0] = 4;
                iArr[1] = 2;
                iArr[2] = 4;
                iArr[3] = 3;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 184:
            case 209:
                // fill-array-data instruction
                iArr[0] = 4;
                iArr[1] = 2;
                iArr[2] = 1;
                iArr[3] = 1;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 187:
                // fill-array-data instruction
                iArr[0] = 1;
                iArr[1] = 1;
                iArr[2] = 2;
                iArr[3] = 2;
                iArr[4] = 2;
                iArr[5] = 1;
                return iArr;
            case 191:
            case 218:
                // fill-array-data instruction
                iArr[0] = 3;
                iArr[1] = 3;
                iArr[2] = 4;
                iArr[3] = 3;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 193:
                // fill-array-data instruction
                iArr[0] = 4;
                iArr[1] = 4;
                iArr[2] = 4;
                iArr[3] = 3;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 195:
                // fill-array-data instruction
                iArr[0] = 2;
                iArr[1] = 4;
                iArr[2] = 3;
                iArr[3] = 0;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 196:
                // fill-array-data instruction
                iArr[0] = 4;
                iArr[1] = 3;
                iArr[2] = 2;
                iArr[3] = 3;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 197:
                // fill-array-data instruction
                iArr[0] = 2;
                iArr[1] = 2;
                iArr[2] = 1;
                iArr[3] = 2;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 199:
            case 202:
                // fill-array-data instruction
                iArr[0] = 1;
                iArr[1] = 2;
                iArr[2] = 1;
                iArr[3] = 0;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 201:
                // fill-array-data instruction
                iArr[0] = 3;
                iArr[1] = 3;
                iArr[2] = 3;
                iArr[3] = 4;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 205:
                // fill-array-data instruction
                iArr[0] = 0;
                iArr[1] = 2;
                iArr[2] = 2;
                iArr[3] = 3;
                iArr[4] = 3;
                iArr[5] = 4;
                return iArr;
            case 207:
                // fill-array-data instruction
                iArr[0] = 2;
                iArr[1] = 2;
                iArr[2] = 2;
                iArr[3] = 4;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 212:
                // fill-array-data instruction
                iArr[0] = 1;
                iArr[1] = 1;
                iArr[2] = 0;
                iArr[3] = 0;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 213:
                // fill-array-data instruction
                iArr[0] = 1;
                iArr[1] = 4;
                iArr[2] = 1;
                iArr[3] = 3;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 216:
                // fill-array-data instruction
                iArr[0] = 3;
                iArr[1] = 4;
                iArr[2] = 3;
                iArr[3] = 2;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 219:
                // fill-array-data instruction
                iArr[0] = 1;
                iArr[1] = 0;
                iArr[2] = 2;
                iArr[3] = 2;
                iArr[4] = 3;
                iArr[5] = 1;
                return iArr;
            case 221:
                // fill-array-data instruction
                iArr[0] = 2;
                iArr[1] = 2;
                iArr[2] = 3;
                iArr[3] = 4;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 225:
                // fill-array-data instruction
                iArr[0] = 2;
                iArr[1] = 2;
                iArr[2] = 1;
                iArr[3] = 1;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 227:
                // fill-array-data instruction
                iArr[0] = 0;
                iArr[1] = 3;
                iArr[2] = 3;
                iArr[3] = 4;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 230:
                // fill-array-data instruction
                iArr[0] = 3;
                iArr[1] = 1;
                iArr[2] = 3;
                iArr[3] = 1;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            case 234:
                // fill-array-data instruction
                iArr[0] = 3;
                iArr[1] = 2;
                iArr[2] = 2;
                iArr[3] = 1;
                iArr[4] = 1;
                iArr[5] = 2;
                return iArr;
            case 235:
                // fill-array-data instruction
                iArr[0] = 3;
                iArr[1] = 3;
                iArr[2] = 4;
                iArr[3] = 2;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
            default:
                // fill-array-data instruction
                iArr[0] = 2;
                iArr[1] = 2;
                iArr[2] = 2;
                iArr[3] = 2;
                iArr[4] = 2;
                iArr[5] = 2;
                return iArr;
        }
    }

    private long m(int i10) {
        Long l10 = this.f12079a.get(Integer.valueOf(i10));
        if (l10 == null) {
            l10 = this.f12079a.get(0);
        }
        if (l10 == null) {
            l10 = 1000000L;
        }
        return l10.longValue();
    }

    public static synchronized s n(Context context) {
        s sVar;
        synchronized (s.class) {
            if (f12078v == null) {
                f12078v = new b(context).a();
            }
            sVar = f12078v;
        }
        return sVar;
    }

    private static boolean o(p pVar, boolean z10) {
        return z10 && !pVar.d(8);
    }

    private void p(int i10, long j10, long j11) {
        if (i10 == 0 && j10 == 0 && j11 == this.f12091m) {
            return;
        }
        this.f12091m = j11;
        this.f12080b.c(i10, j10, j11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void q(int i10) {
        int i11 = this.f12087i;
        if (i11 == 0 || this.f12083e) {
            if (this.f12092n) {
                i10 = this.f12093o;
            }
            if (i11 == i10) {
                return;
            }
            this.f12087i = i10;
            if (i10 != 1 && i10 != 0 && i10 != 8) {
                this.f12090l = m(i10);
                long b10 = this.f12082d.b();
                p(this.f12084f > 0 ? (int) (b10 - this.f12085g) : 0, this.f12086h, this.f12090l);
                this.f12085g = b10;
                this.f12086h = 0L;
                this.f12089k = 0L;
                this.f12088j = 0L;
                this.f12081c.i();
            }
        }
    }

    @Override // o3.f
    public p0 a() {
        return this;
    }

    @Override // o3.p0
    public void b(l lVar, p pVar, boolean z10) {
    }

    @Override // o3.p0
    public synchronized void c(l lVar, p pVar, boolean z10) {
        if (o(pVar, z10)) {
            p3.a.f(this.f12084f > 0);
            long b10 = this.f12082d.b();
            int i10 = (int) (b10 - this.f12085g);
            this.f12088j += i10;
            long j10 = this.f12089k;
            long j11 = this.f12086h;
            this.f12089k = j10 + j11;
            if (i10 > 0) {
                this.f12081c.c((int) Math.sqrt(j11), (((float) j11) * 8000.0f) / i10);
                if (this.f12088j >= 2000 || this.f12089k >= 524288) {
                    this.f12090l = this.f12081c.f(0.5f);
                }
                p(i10, this.f12086h, this.f12090l);
                this.f12085g = b10;
                this.f12086h = 0L;
            }
            this.f12084f--;
        }
    }

    @Override // o3.f
    public void d(f.a aVar) {
        this.f12080b.e(aVar);
    }

    @Override // o3.p0
    public synchronized void e(l lVar, p pVar, boolean z10, int i10) {
        if (o(pVar, z10)) {
            this.f12086h += i10;
        }
    }

    @Override // o3.f
    public /* synthetic */ long f() {
        return d.a(this);
    }

    @Override // o3.f
    public synchronized long g() {
        return this.f12090l;
    }

    @Override // o3.p0
    public synchronized void h(l lVar, p pVar, boolean z10) {
        if (o(pVar, z10)) {
            if (this.f12084f == 0) {
                this.f12085g = this.f12082d.b();
            }
            this.f12084f++;
        }
    }

    @Override // o3.f
    public void i(Handler handler, f.a aVar) {
        p3.a.e(handler);
        p3.a.e(aVar);
        this.f12080b.b(handler, aVar);
    }
}
