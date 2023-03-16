package com.google.android.gms.internal.measurement;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class qa {

    /* renamed from: a  reason: collision with root package name */
    private static final char[] f4100a;

    static {
        char[] cArr = new char[80];
        f4100a = cArr;
        Arrays.fill(cArr, ' ');
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String a(oa oaVar, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        d(oaVar, sb, 0);
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(StringBuilder sb, int i10, String str, Object obj) {
        if (obj instanceof List) {
            for (Object obj2 : (List) obj) {
                b(sb, i10, str, obj2);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                b(sb, i10, str, entry);
            }
        } else {
            sb.append('\n');
            c(i10, sb);
            if (!str.isEmpty()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(Character.toLowerCase(str.charAt(0)));
                for (int i11 = 1; i11 < str.length(); i11++) {
                    char charAt = str.charAt(i11);
                    if (Character.isUpperCase(charAt)) {
                        sb2.append("_");
                    }
                    sb2.append(Character.toLowerCase(charAt));
                }
                str = sb2.toString();
            }
            sb.append(str);
            if (obj instanceof String) {
                sb.append(": \"");
                sb.append(pb.a(h8.F((String) obj)));
                sb.append('\"');
            } else if (obj instanceof h8) {
                sb.append(": \"");
                sb.append(pb.a((h8) obj));
                sb.append('\"');
            } else if (obj instanceof i9) {
                sb.append(" {");
                d((i9) obj, sb, i10 + 2);
                sb.append("\n");
                c(i10, sb);
                sb.append("}");
            } else if (!(obj instanceof Map.Entry)) {
                sb.append(": ");
                sb.append(obj);
            } else {
                sb.append(" {");
                Map.Entry entry2 = (Map.Entry) obj;
                int i12 = i10 + 2;
                b(sb, i12, "key", entry2.getKey());
                b(sb, i12, "value", entry2.getValue());
                sb.append("\n");
                c(i10, sb);
                sb.append("}");
            }
        }
    }

    private static void c(int i10, StringBuilder sb) {
        while (i10 > 0) {
            int i11 = 80;
            if (i10 <= 80) {
                i11 = i10;
            }
            sb.append(f4100a, 0, i11);
            i10 -= i11;
        }
    }

    private static void d(oa oaVar, StringBuilder sb, int i10) {
        int i11;
        Object obj;
        Method method;
        String substring;
        Object r10;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = oaVar.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i12 = 0;
        while (true) {
            i11 = 3;
            if (i12 >= length) {
                break;
            }
            Method method3 = declaredMethods[i12];
            if (!Modifier.isStatic(method3.getModifiers()) && method3.getName().length() >= 3) {
                if (method3.getName().startsWith("set")) {
                    hashSet.add(method3.getName());
                } else if (Modifier.isPublic(method3.getModifiers()) && method3.getParameterTypes().length == 0) {
                    if (method3.getName().startsWith("has")) {
                        hashMap.put(method3.getName(), method3);
                    } else if (method3.getName().startsWith("get")) {
                        treeMap.put(method3.getName(), method3);
                    }
                }
            }
            i12++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String substring2 = ((String) entry.getKey()).substring(i11);
            if (substring2.endsWith("List") && !substring2.endsWith("OrBuilderList") && !substring2.equals("List") && (method2 = (Method) entry.getValue()) != null && method2.getReturnType().equals(List.class)) {
                substring = substring2.substring(0, substring2.length() - 4);
                r10 = i9.r(method2, oaVar, new Object[0]);
            } else if (!substring2.endsWith("Map") || substring2.equals("Map") || (method = (Method) entry.getValue()) == null || !method.getReturnType().equals(Map.class) || method.isAnnotationPresent(Deprecated.class) || !Modifier.isPublic(method.getModifiers())) {
                if (hashSet.contains("set".concat(substring2)) && (!substring2.endsWith("Bytes") || !treeMap.containsKey("get".concat(String.valueOf(substring2.substring(0, substring2.length() - 5)))))) {
                    Method method4 = (Method) entry.getValue();
                    Method method5 = (Method) hashMap.get("has".concat(substring2));
                    if (method4 != null) {
                        Object r11 = i9.r(method4, oaVar, new Object[0]);
                        if (method5 != null) {
                            if (!((Boolean) i9.r(method5, oaVar, new Object[0])).booleanValue()) {
                            }
                            b(sb, i10, substring2, r11);
                        } else if (r11 instanceof Boolean) {
                            if (!((Boolean) r11).booleanValue()) {
                            }
                            b(sb, i10, substring2, r11);
                        } else if (r11 instanceof Integer) {
                            if (((Integer) r11).intValue() == 0) {
                            }
                            b(sb, i10, substring2, r11);
                        } else if (r11 instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) r11).floatValue()) == 0) {
                            }
                            b(sb, i10, substring2, r11);
                        } else if (r11 instanceof Double) {
                            if (Double.doubleToRawLongBits(((Double) r11).doubleValue()) == 0) {
                            }
                            b(sb, i10, substring2, r11);
                        } else {
                            if (r11 instanceof String) {
                                obj = "";
                            } else if (r11 instanceof h8) {
                                obj = h8.f3880o;
                            } else if (r11 instanceof oa) {
                                if (r11 == ((oa) r11).g()) {
                                }
                                b(sb, i10, substring2, r11);
                            } else {
                                if ((r11 instanceof Enum) && ((Enum) r11).ordinal() == 0) {
                                }
                                b(sb, i10, substring2, r11);
                            }
                            if (r11.equals(obj)) {
                            }
                            b(sb, i10, substring2, r11);
                        }
                    }
                }
                i11 = 3;
            } else {
                substring = substring2.substring(0, substring2.length() - 3);
                r10 = i9.r(method, oaVar, new Object[0]);
            }
            b(sb, i10, substring, r10);
            i11 = 3;
        }
        if (oaVar instanceof g9) {
            g9 g9Var = (g9) oaVar;
            throw null;
        }
        sb sbVar = ((i9) oaVar).zzc;
        if (sbVar != null) {
            sbVar.i(sb, i10);
        }
    }
}
