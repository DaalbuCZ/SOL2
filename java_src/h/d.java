package h;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.view.LayoutInflater;
/* loaded from: classes.dex */
public class d extends ContextWrapper {

    /* renamed from: a  reason: collision with root package name */
    private int f7576a;

    /* renamed from: b  reason: collision with root package name */
    private Resources.Theme f7577b;

    /* renamed from: c  reason: collision with root package name */
    private LayoutInflater f7578c;

    /* renamed from: d  reason: collision with root package name */
    private Configuration f7579d;

    /* renamed from: e  reason: collision with root package name */
    private Resources f7580e;

    public d() {
        super(null);
    }

    public d(Context context, int i10) {
        super(context);
        this.f7576a = i10;
    }

    public d(Context context, Resources.Theme theme) {
        super(context);
        this.f7577b = theme;
    }

    private Resources b() {
        Resources resources;
        if (this.f7580e == null) {
            Configuration configuration = this.f7579d;
            if (configuration == null) {
                resources = super.getResources();
            } else if (Build.VERSION.SDK_INT >= 17) {
                resources = createConfigurationContext(configuration).getResources();
            } else {
                Resources resources2 = super.getResources();
                Configuration configuration2 = new Configuration(resources2.getConfiguration());
                configuration2.updateFrom(this.f7579d);
                this.f7580e = new Resources(resources2.getAssets(), resources2.getDisplayMetrics(), configuration2);
            }
            this.f7580e = resources;
        }
        return this.f7580e;
    }

    private void d() {
        boolean z10 = this.f7577b == null;
        if (z10) {
            this.f7577b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f7577b.setTo(theme);
            }
        }
        e(this.f7577b, this.f7576a, z10);
    }

    public void a(Configuration configuration) {
        if (this.f7580e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        }
        if (this.f7579d != null) {
            throw new IllegalStateException("Override configuration has already been set");
        }
        this.f7579d = new Configuration(configuration);
    }

    @Override // android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public int c() {
        return this.f7576a;
    }

    protected void e(Resources.Theme theme, int i10, boolean z10) {
        theme.applyStyle(i10, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return b();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String str) {
        if ("layout_inflater".equals(str)) {
            if (this.f7578c == null) {
                this.f7578c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
            }
            return this.f7578c;
        }
        return getBaseContext().getSystemService(str);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f7577b;
        if (theme != null) {
            return theme;
        }
        if (this.f7576a == 0) {
            this.f7576a = c.i.Theme_AppCompat_Light;
        }
        d();
        return this.f7577b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i10) {
        if (this.f7576a != i10) {
            this.f7576a = i10;
            d();
        }
    }
}
