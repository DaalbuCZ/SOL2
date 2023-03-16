package y0;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import java.io.RandomAccessFile;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* loaded from: classes.dex */
public class z {

    /* renamed from: a  reason: collision with root package name */
    private a f16785a;

    /* loaded from: classes.dex */
    public interface a {
        long a();

        long c();

        long d();
    }

    /* loaded from: classes.dex */
    public static abstract class b implements a {

        /* renamed from: a  reason: collision with root package name */
        protected final ActivityManager f16786a;

        /* renamed from: b  reason: collision with root package name */
        protected long f16787b;

        /* renamed from: c  reason: collision with root package name */
        protected long f16788c;

        /* renamed from: d  reason: collision with root package name */
        protected Context f16789d;

        public b(Context context) {
            this.f16786a = (ActivityManager) context.getSystemService("activity");
            this.f16789d = context;
        }

        @Override // y0.z.a
        public long a() {
            return this.f16788c;
        }

        protected Double b() {
            new DecimalFormat("#.##");
            try {
                RandomAccessFile randomAccessFile = new RandomAccessFile("/proc/meminfo", "r");
                Matcher matcher = Pattern.compile("(\\d+)").matcher(randomAccessFile.readLine());
                String str = "";
                while (matcher.find()) {
                    str = matcher.group(1);
                }
                randomAccessFile.close();
                return Double.valueOf(Double.parseDouble(str));
            } catch (Exception unused) {
                return Double.valueOf(-1.0d);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class c extends b {
        public c(Context context) {
            super(context);
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            ((ActivityManager) this.f16789d.getSystemService("activity")).getMemoryInfo(memoryInfo);
            this.f16788c = memoryInfo.availMem;
            this.f16787b = memoryInfo.totalMem;
        }

        @Override // y0.z.a
        public long c() {
            return this.f16787b - this.f16788c;
        }

        @Override // y0.z.a
        public long d() {
            return this.f16787b;
        }
    }

    /* loaded from: classes.dex */
    public static class d extends b {
        public d(Context context) {
            super(context);
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = this.f16786a.getRunningAppProcesses();
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses == null ? Collections.emptyList() : runningAppProcesses) {
                if (runningAppProcessInfo.uid > 1000) {
                    this.f16787b += this.f16786a.getProcessMemoryInfo(new int[]{runningAppProcessInfo.pid})[0].getTotalPss();
                }
            }
        }

        @Override // y0.z.a
        public long c() {
            return this.f16787b;
        }

        @Override // y0.z.a
        public long d() {
            return Math.round(b().doubleValue());
        }
    }

    public z(Context context) {
        this.f16785a = Build.VERSION.SDK_INT >= 21 ? new c(context) : new d(context);
    }

    public long a() {
        return this.f16785a.a();
    }

    public long b() {
        return this.f16785a.d();
    }

    public long c() {
        return this.f16785a.c();
    }
}
