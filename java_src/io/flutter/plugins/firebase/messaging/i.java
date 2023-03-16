package io.flutter.plugins.firebase.messaging;

import android.app.Service;
import android.app.job.JobInfo;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobServiceEngine;
import android.app.job.JobWorkItem;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Build;
import android.os.IBinder;
import android.os.PowerManager;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class i extends Service {

    /* renamed from: u  reason: collision with root package name */
    static final Object f8981u = new Object();

    /* renamed from: v  reason: collision with root package name */
    static final HashMap<e, AbstractC0135i> f8982v = new HashMap<>();

    /* renamed from: n  reason: collision with root package name */
    b f8983n;

    /* renamed from: o  reason: collision with root package name */
    AbstractC0135i f8984o;

    /* renamed from: p  reason: collision with root package name */
    a f8985p;

    /* renamed from: q  reason: collision with root package name */
    boolean f8986q = false;

    /* renamed from: r  reason: collision with root package name */
    boolean f8987r = false;

    /* renamed from: s  reason: collision with root package name */
    boolean f8988s = false;

    /* renamed from: t  reason: collision with root package name */
    final ArrayList<d> f8989t = new ArrayList<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public final class a extends AsyncTask<Void, Void, Void> {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: a */
        public Void doInBackground(Void... voidArr) {
            while (true) {
                f a10 = i.this.a();
                if (a10 == null) {
                    return null;
                }
                i.this.g(a10.getIntent());
                a10.a();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: b */
        public void onCancelled(Void r12) {
            i.this.i();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: c */
        public void onPostExecute(Void r12) {
            i.this.i();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface b {
        f a();

        IBinder b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class c extends AbstractC0135i {

        /* renamed from: d  reason: collision with root package name */
        private final Context f8991d;

        /* renamed from: e  reason: collision with root package name */
        private final PowerManager.WakeLock f8992e;

        /* renamed from: f  reason: collision with root package name */
        private final PowerManager.WakeLock f8993f;

        /* renamed from: g  reason: collision with root package name */
        boolean f8994g;

        /* renamed from: h  reason: collision with root package name */
        boolean f8995h;

        c(Context context, ComponentName componentName) {
            super(componentName);
            this.f8991d = context.getApplicationContext();
            PowerManager powerManager = (PowerManager) context.getSystemService("power");
            PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, componentName.getClassName() + ":launch");
            this.f8992e = newWakeLock;
            newWakeLock.setReferenceCounted(false);
            PowerManager.WakeLock newWakeLock2 = powerManager.newWakeLock(1, componentName.getClassName() + ":run");
            this.f8993f = newWakeLock2;
            newWakeLock2.setReferenceCounted(false);
        }

        @Override // io.flutter.plugins.firebase.messaging.i.AbstractC0135i
        void a(Intent intent) {
            Intent intent2 = new Intent(intent);
            intent2.setComponent(this.f9008a);
            if (this.f8991d.startService(intent2) != null) {
                synchronized (this) {
                    if (!this.f8994g) {
                        this.f8994g = true;
                        if (!this.f8995h) {
                            this.f8992e.acquire(60000L);
                        }
                    }
                }
            }
        }

        @Override // io.flutter.plugins.firebase.messaging.i.AbstractC0135i
        public void c() {
            synchronized (this) {
                if (this.f8995h) {
                    if (this.f8994g) {
                        this.f8992e.acquire(60000L);
                    }
                    this.f8995h = false;
                    this.f8993f.release();
                }
            }
        }

        @Override // io.flutter.plugins.firebase.messaging.i.AbstractC0135i
        public void d() {
            synchronized (this) {
                if (!this.f8995h) {
                    this.f8995h = true;
                    this.f8993f.acquire(600000L);
                    this.f8992e.release();
                }
            }
        }

        @Override // io.flutter.plugins.firebase.messaging.i.AbstractC0135i
        public void e() {
            synchronized (this) {
                this.f8994g = false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public final class d implements f {

        /* renamed from: a  reason: collision with root package name */
        final Intent f8996a;

        /* renamed from: b  reason: collision with root package name */
        final int f8997b;

        d(Intent intent, int i10) {
            this.f8996a = intent;
            this.f8997b = i10;
        }

        @Override // io.flutter.plugins.firebase.messaging.i.f
        public void a() {
            i.this.stopSelf(this.f8997b);
        }

        @Override // io.flutter.plugins.firebase.messaging.i.f
        public Intent getIntent() {
            return this.f8996a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class e {

        /* renamed from: a  reason: collision with root package name */
        private ComponentName f8999a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f9000b;

        e(ComponentName componentName, boolean z10) {
            this.f8999a = componentName;
            this.f9000b = z10;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface f {
        void a();

        Intent getIntent();
    }

    /* loaded from: classes.dex */
    static final class g extends JobServiceEngine implements b {

        /* renamed from: a  reason: collision with root package name */
        final i f9001a;

        /* renamed from: b  reason: collision with root package name */
        final Object f9002b;

        /* renamed from: c  reason: collision with root package name */
        JobParameters f9003c;

        /* loaded from: classes.dex */
        final class a implements f {

            /* renamed from: a  reason: collision with root package name */
            final JobWorkItem f9004a;

            a(JobWorkItem jobWorkItem) {
                this.f9004a = jobWorkItem;
            }

            @Override // io.flutter.plugins.firebase.messaging.i.f
            public void a() {
                String str;
                String str2;
                synchronized (g.this.f9002b) {
                    JobParameters jobParameters = g.this.f9003c;
                    if (jobParameters != null) {
                        try {
                            jobParameters.completeWork(this.f9004a);
                        } catch (IllegalArgumentException e10) {
                            e = e10;
                            str = "JobServiceEngineImpl";
                            str2 = "IllegalArgumentException: Failed to run mParams.completeWork(mJobWork)!";
                            Log.e(str, str2, e);
                        } catch (SecurityException e11) {
                            e = e11;
                            str = "JobServiceEngineImpl";
                            str2 = "SecurityException: Failed to run mParams.completeWork(mJobWork)!";
                            Log.e(str, str2, e);
                        }
                    }
                }
            }

            @Override // io.flutter.plugins.firebase.messaging.i.f
            public Intent getIntent() {
                return this.f9004a.getIntent();
            }
        }

        g(i iVar) {
            super(iVar);
            this.f9002b = new Object();
            this.f9001a = iVar;
        }

        @Override // io.flutter.plugins.firebase.messaging.i.b
        public f a() {
            synchronized (this.f9002b) {
                JobParameters jobParameters = this.f9003c;
                if (jobParameters == null) {
                    return null;
                }
                try {
                    JobWorkItem dequeueWork = jobParameters.dequeueWork();
                    if (dequeueWork != null) {
                        dequeueWork.getIntent().setExtrasClassLoader(this.f9001a.getClassLoader());
                        return new a(dequeueWork);
                    }
                    return null;
                } catch (SecurityException e10) {
                    Log.e("JobServiceEngineImpl", "Failed to run mParams.dequeueWork()!", e10);
                    return null;
                }
            }
        }

        @Override // io.flutter.plugins.firebase.messaging.i.b
        public IBinder b() {
            return getBinder();
        }

        @Override // android.app.job.JobServiceEngine
        public boolean onStartJob(JobParameters jobParameters) {
            this.f9003c = jobParameters;
            this.f9001a.e(false);
            return true;
        }

        @Override // android.app.job.JobServiceEngine
        public boolean onStopJob(JobParameters jobParameters) {
            boolean b10 = this.f9001a.b();
            synchronized (this.f9002b) {
                this.f9003c = null;
            }
            return b10;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class h extends AbstractC0135i {

        /* renamed from: d  reason: collision with root package name */
        private final JobInfo f9006d;

        /* renamed from: e  reason: collision with root package name */
        private final JobScheduler f9007e;

        h(Context context, ComponentName componentName, int i10) {
            super(componentName);
            b(i10);
            this.f9006d = new JobInfo.Builder(i10, this.f9008a).setOverrideDeadline(0L).build();
            this.f9007e = (JobScheduler) context.getApplicationContext().getSystemService("jobscheduler");
        }

        @Override // io.flutter.plugins.firebase.messaging.i.AbstractC0135i
        void a(Intent intent) {
            this.f9007e.enqueue(this.f9006d, new JobWorkItem(intent));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: io.flutter.plugins.firebase.messaging.i$i  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0135i {

        /* renamed from: a  reason: collision with root package name */
        final ComponentName f9008a;

        /* renamed from: b  reason: collision with root package name */
        boolean f9009b;

        /* renamed from: c  reason: collision with root package name */
        int f9010c;

        AbstractC0135i(ComponentName componentName) {
            this.f9008a = componentName;
        }

        abstract void a(Intent intent);

        void b(int i10) {
            if (!this.f9009b) {
                this.f9009b = true;
                this.f9010c = i10;
            } else if (this.f9010c == i10) {
            } else {
                throw new IllegalArgumentException("Given job ID " + i10 + " is different than previous " + this.f9010c);
            }
        }

        public void c() {
        }

        public void d() {
        }

        public void e() {
        }
    }

    public static void c(Context context, ComponentName componentName, int i10, Intent intent, boolean z10) {
        if (intent == null) {
            throw new IllegalArgumentException("work must not be null");
        }
        synchronized (f8981u) {
            AbstractC0135i f10 = f(context, componentName, true, i10, z10);
            f10.b(i10);
            try {
                f10.a(intent);
            } catch (IllegalStateException e10) {
                if (!z10) {
                    throw e10;
                }
                f(context, componentName, true, i10, false).a(intent);
            }
        }
    }

    public static void d(Context context, Class cls, int i10, Intent intent, boolean z10) {
        c(context, new ComponentName(context, cls), i10, intent, z10);
    }

    static AbstractC0135i f(Context context, ComponentName componentName, boolean z10, int i10, boolean z11) {
        AbstractC0135i cVar;
        e eVar = new e(componentName, z11);
        HashMap<e, AbstractC0135i> hashMap = f8982v;
        AbstractC0135i abstractC0135i = hashMap.get(eVar);
        if (abstractC0135i == null) {
            if (Build.VERSION.SDK_INT < 26 || z11) {
                cVar = new c(context, componentName);
            } else if (!z10) {
                throw new IllegalArgumentException("Can't be here without a job id");
            } else {
                cVar = new h(context, componentName, i10);
            }
            AbstractC0135i abstractC0135i2 = cVar;
            hashMap.put(eVar, abstractC0135i2);
            return abstractC0135i2;
        }
        return abstractC0135i;
    }

    f a() {
        f a10;
        b bVar = this.f8983n;
        if (bVar == null || (a10 = bVar.a()) == null) {
            synchronized (this.f8989t) {
                if (this.f8989t.size() > 0) {
                    return this.f8989t.remove(0);
                }
                return null;
            }
        }
        return a10;
    }

    boolean b() {
        a aVar = this.f8985p;
        if (aVar != null) {
            aVar.cancel(this.f8986q);
        }
        this.f8987r = true;
        return h();
    }

    void e(boolean z10) {
        if (this.f8985p == null) {
            this.f8985p = new a();
            AbstractC0135i abstractC0135i = this.f8984o;
            if (abstractC0135i != null && z10) {
                abstractC0135i.d();
            }
            this.f8985p.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    protected abstract void g(Intent intent);

    public boolean h() {
        return true;
    }

    void i() {
        ArrayList<d> arrayList = this.f8989t;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.f8985p = null;
                ArrayList<d> arrayList2 = this.f8989t;
                if (arrayList2 != null && arrayList2.size() > 0) {
                    e(false);
                } else if (!this.f8988s) {
                    this.f8984o.c();
                }
            }
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        b bVar = this.f8983n;
        if (bVar != null) {
            return bVar.b();
        }
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        if (Build.VERSION.SDK_INT >= 26) {
            this.f8983n = new g(this);
            this.f8984o = null;
        }
        this.f8984o = f(this, new ComponentName(this, getClass()), false, 0, true);
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        b();
        synchronized (this.f8989t) {
            this.f8988s = true;
            this.f8984o.c();
        }
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        this.f8984o.e();
        synchronized (this.f8989t) {
            ArrayList<d> arrayList = this.f8989t;
            if (intent == null) {
                intent = new Intent();
            }
            arrayList.add(new d(intent, i11));
            e(true);
        }
        return 3;
    }
}
