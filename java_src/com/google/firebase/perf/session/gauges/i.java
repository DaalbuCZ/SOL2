package com.google.firebase.perf.session.gauges;

import a7.o;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* loaded from: classes.dex */
class i {

    /* renamed from: e  reason: collision with root package name */
    private static final u6.a f5781e = u6.a.e();

    /* renamed from: a  reason: collision with root package name */
    private final Runtime f5782a;

    /* renamed from: b  reason: collision with root package name */
    private final ActivityManager f5783b;

    /* renamed from: c  reason: collision with root package name */
    private final ActivityManager.MemoryInfo f5784c;

    /* renamed from: d  reason: collision with root package name */
    private final Context f5785d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public i(Context context) {
        this(Runtime.getRuntime(), context);
    }

    i(Runtime runtime, Context context) {
        this.f5782a = runtime;
        this.f5785d = context;
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        this.f5783b = activityManager;
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        this.f5784c = memoryInfo;
        activityManager.getMemoryInfo(memoryInfo);
    }

    public int a() {
        return Build.VERSION.SDK_INT >= 16 ? o.c(a7.k.f254s.e(this.f5784c.totalMem)) : d("/proc/meminfo");
    }

    public int b() {
        return o.c(a7.k.f254s.e(this.f5782a.maxMemory()));
    }

    public int c() {
        return o.c(a7.k.f252q.e(this.f5783b.getMemoryClass()));
    }

    int d(String str) {
        u6.a aVar;
        StringBuilder sb;
        String message;
        BufferedReader bufferedReader;
        String readLine;
        try {
            bufferedReader = new BufferedReader(new FileReader(str));
        } catch (IOException e10) {
            aVar = f5781e;
            sb = new StringBuilder();
            sb.append("Unable to read '");
            sb.append(str);
            sb.append("' file: ");
            message = e10.getMessage();
            sb.append(message);
            aVar.j(sb.toString());
            return 0;
        } catch (NumberFormatException e11) {
            aVar = f5781e;
            sb = new StringBuilder();
            sb.append("Unable to parse '");
            sb.append(str);
            sb.append("' file: ");
            message = e11.getMessage();
            sb.append(message);
            aVar.j(sb.toString());
            return 0;
        }
        do {
            readLine = bufferedReader.readLine();
            if (readLine == null) {
                bufferedReader.close();
                return 0;
            }
        } while (!readLine.startsWith("MemTotal"));
        Matcher matcher = Pattern.compile("\\d+").matcher(readLine);
        int parseInt = matcher.find() ? Integer.parseInt(matcher.group()) : 0;
        bufferedReader.close();
        return parseInt;
    }
}
