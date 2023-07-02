.class public final Lc8/a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lk8/a;


# instance fields
.field private n:Lt8/k;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final a(Lt8/c;Landroid/content/Context;)V
    .locals 2

    new-instance v0, Lt8/k;

    const-string v1, "dev.fluttercommunity.plus/device_info"

    invoke-direct {v0, p1, v1}, Lt8/k;-><init>(Lt8/c;Ljava/lang/String;)V

    iput-object v0, p0, Lc8/a;->n:Lt8/k;

    invoke-virtual {p2}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p1

    const-string v0, "context.packageManager"

    invoke-static {p1, v0}, Ls9/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "window"

    invoke-virtual {p2, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p2

    const-string v0, "null cannot be cast to non-null type android.view.WindowManager"

    invoke-static {p2, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    check-cast p2, Landroid/view/WindowManager;

    new-instance v0, Lc8/b;

    invoke-direct {v0, p1, p2}, Lc8/b;-><init>(Landroid/content/pm/PackageManager;Landroid/view/WindowManager;)V

    iget-object p1, p0, Lc8/a;->n:Lt8/k;

    if-nez p1, :cond_0

    const-string p1, "methodChannel"

    invoke-static {p1}, Ls9/k;->o(Ljava/lang/String;)V

    const/4 p1, 0x0

    :cond_0
    invoke-virtual {p1, v0}, Lt8/k;->e(Lt8/k$c;)V

    return-void
.end method


# virtual methods
.method public onAttachedToEngine(Lk8/a$b;)V
    .locals 2

    const-string v0, "binding"

    invoke-static {p1, v0}, Ls9/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lk8/a$b;->b()Lt8/c;

    move-result-object v0

    const-string v1, "binding.binaryMessenger"

    invoke-static {v0, v1}, Ls9/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lk8/a$b;->a()Landroid/content/Context;

    move-result-object p1

    const-string v1, "binding.applicationContext"

    invoke-static {p1, v1}, Ls9/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, v0, p1}, Lc8/a;->a(Lt8/c;Landroid/content/Context;)V

    return-void
.end method

.method public onDetachedFromEngine(Lk8/a$b;)V
    .locals 1

    const-string v0, "binding"

    invoke-static {p1, v0}, Ls9/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lc8/a;->n:Lt8/k;

    const/4 v0, 0x0

    if-nez p1, :cond_0

    const-string p1, "methodChannel"

    invoke-static {p1}, Ls9/k;->o(Ljava/lang/String;)V

    move-object p1, v0

    :cond_0
    invoke-virtual {p1, v0}, Lt8/k;->e(Lt8/k$c;)V

    return-void
.end method
