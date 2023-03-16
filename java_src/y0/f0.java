package y0;

import android.text.TextUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* loaded from: classes.dex */
public class f0 {

    /* renamed from: d  reason: collision with root package name */
    private static final Pattern f16519d = Pattern.compile("(.)/(.*?)\\s*\\(([\\d\\s]+)\\):\\s(.*)");

    /* renamed from: a  reason: collision with root package name */
    private final k0 f16520a;

    /* renamed from: b  reason: collision with root package name */
    private final String f16521b;

    /* renamed from: c  reason: collision with root package name */
    private final String f16522c;

    public f0(k0 k0Var, String str, String str2) {
        this.f16520a = k0Var;
        this.f16521b = str;
        this.f16522c = str2;
    }

    public static f0 a(String str, int i10) {
        Matcher matcher = f16519d.matcher(str);
        if (matcher.find()) {
            if (matcher.groupCount() >= 4) {
                String group = matcher.group(1);
                String group2 = matcher.group(2);
                String group3 = matcher.group(3);
                String group4 = matcher.group(4);
                try {
                    if (Integer.valueOf(!TextUtils.isEmpty(group3) ? group3.trim() : "").intValue() == i10) {
                        return new f0(k0.e(group.charAt(0)), group2, group4);
                    }
                    throw new u2("The trace is not valid");
                } catch (NumberFormatException unused) {
                    throw new u2("The trace is not valid");
                }
            }
            throw new u2("The trace is not valid");
        }
        throw new u2("The trace is not valid");
    }

    public k0 b() {
        return this.f16520a;
    }

    public String c() {
        return this.f16522c;
    }

    public String d() {
        return this.f16521b;
    }
}
