.class public Lio/flutter/plugins/webviewflutter/o3;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lc8/a;
.implements Ld8/a;


# instance fields
.field private n:Lio/flutter/plugins/webviewflutter/i2;

.field private o:Lc8/a$b;

.field private p:Lio/flutter/plugins/webviewflutter/q3;

.field private q:Lio/flutter/plugins/webviewflutter/o2;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(J)V
    .locals 0

    invoke-static {p0, p1}, Lio/flutter/plugins/webviewflutter/o3;->b(J)V

    return-void
.end method

.method private static synthetic b(J)V
    .locals 0

    return-void
.end method

.method private c(Ll8/c;Lio/flutter/plugin/platform/h;Landroid/content/Context;Landroid/view/View;Lio/flutter/plugins/webviewflutter/h;)V
    .locals 3

    sget-object v0, Lio/flutter/plugins/webviewflutter/n3;->a:Lio/flutter/plugins/webviewflutter/n3;

    invoke-static {v0}, Lio/flutter/plugins/webviewflutter/i2;->i(Lio/flutter/plugins/webviewflutter/i2$a;)Lio/flutter/plugins/webviewflutter/i2;

    move-result-object v0

    iput-object v0, p0, Lio/flutter/plugins/webviewflutter/o3;->n:Lio/flutter/plugins/webviewflutter/i2;

    new-instance v1, Lio/flutter/plugins/webviewflutter/j;

    invoke-direct {v1, v0}, Lio/flutter/plugins/webviewflutter/j;-><init>(Lio/flutter/plugins/webviewflutter/i2;)V

    const-string v0, "plugins.flutter.io/webview"

    invoke-interface {p2, v0, v1}, Lio/flutter/plugin/platform/h;->a(Ljava/lang/String;Lio/flutter/plugin/platform/g;)Z

    new-instance p2, Lio/flutter/plugins/webviewflutter/q3;

    iget-object v0, p0, Lio/flutter/plugins/webviewflutter/o3;->n:Lio/flutter/plugins/webviewflutter/i2;

    new-instance v1, Lio/flutter/plugins/webviewflutter/q3$d;

    invoke-direct {v1}, Lio/flutter/plugins/webviewflutter/q3$d;-><init>()V

    invoke-direct {p2, v0, v1, p3, p4}, Lio/flutter/plugins/webviewflutter/q3;-><init>(Lio/flutter/plugins/webviewflutter/i2;Lio/flutter/plugins/webviewflutter/q3$d;Landroid/content/Context;Landroid/view/View;)V

    iput-object p2, p0, Lio/flutter/plugins/webviewflutter/o3;->p:Lio/flutter/plugins/webviewflutter/q3;

    new-instance p2, Lio/flutter/plugins/webviewflutter/o2;

    iget-object p4, p0, Lio/flutter/plugins/webviewflutter/o3;->n:Lio/flutter/plugins/webviewflutter/i2;

    new-instance v0, Lio/flutter/plugins/webviewflutter/o2$a;

    invoke-direct {v0}, Lio/flutter/plugins/webviewflutter/o2$a;-><init>()V

    new-instance v1, Lio/flutter/plugins/webviewflutter/n2;

    iget-object v2, p0, Lio/flutter/plugins/webviewflutter/o3;->n:Lio/flutter/plugins/webviewflutter/i2;

    invoke-direct {v1, p1, v2}, Lio/flutter/plugins/webviewflutter/n2;-><init>(Ll8/c;Lio/flutter/plugins/webviewflutter/i2;)V

    new-instance v2, Landroid/os/Handler;

    invoke-virtual {p3}, Landroid/content/Context;->getMainLooper()Landroid/os/Looper;

    move-result-object p3

    invoke-direct {v2, p3}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    invoke-direct {p2, p4, v0, v1, v2}, Lio/flutter/plugins/webviewflutter/o2;-><init>(Lio/flutter/plugins/webviewflutter/i2;Lio/flutter/plugins/webviewflutter/o2$a;Lio/flutter/plugins/webviewflutter/n2;Landroid/os/Handler;)V

    iput-object p2, p0, Lio/flutter/plugins/webviewflutter/o3;->q:Lio/flutter/plugins/webviewflutter/o2;

    iget-object p2, p0, Lio/flutter/plugins/webviewflutter/o3;->p:Lio/flutter/plugins/webviewflutter/q3;

    invoke-static {p1, p2}, Lio/flutter/plugins/webviewflutter/f2;->d0(Ll8/c;Lio/flutter/plugins/webviewflutter/k$c0;)V

    iget-object p2, p0, Lio/flutter/plugins/webviewflutter/o3;->q:Lio/flutter/plugins/webviewflutter/o2;

    invoke-static {p1, p2}, Lio/flutter/plugins/webviewflutter/y;->d(Ll8/c;Lio/flutter/plugins/webviewflutter/k$l;)V

    new-instance p2, Lio/flutter/plugins/webviewflutter/y2;

    iget-object p3, p0, Lio/flutter/plugins/webviewflutter/o3;->n:Lio/flutter/plugins/webviewflutter/i2;

    new-instance p4, Lio/flutter/plugins/webviewflutter/y2$c;

    invoke-direct {p4}, Lio/flutter/plugins/webviewflutter/y2$c;-><init>()V

    new-instance v0, Lio/flutter/plugins/webviewflutter/x2;

    iget-object v1, p0, Lio/flutter/plugins/webviewflutter/o3;->n:Lio/flutter/plugins/webviewflutter/i2;

    invoke-direct {v0, p1, v1}, Lio/flutter/plugins/webviewflutter/x2;-><init>(Ll8/c;Lio/flutter/plugins/webviewflutter/i2;)V

    invoke-direct {p2, p3, p4, v0}, Lio/flutter/plugins/webviewflutter/y2;-><init>(Lio/flutter/plugins/webviewflutter/i2;Lio/flutter/plugins/webviewflutter/y2$c;Lio/flutter/plugins/webviewflutter/x2;)V

    invoke-static {p1, p2}, Lio/flutter/plugins/webviewflutter/d1;->d(Ll8/c;Lio/flutter/plugins/webviewflutter/k$a0;)V

    new-instance p2, Lio/flutter/plugins/webviewflutter/s2;

    iget-object p3, p0, Lio/flutter/plugins/webviewflutter/o3;->n:Lio/flutter/plugins/webviewflutter/i2;

    new-instance p4, Lio/flutter/plugins/webviewflutter/s2$a;

    invoke-direct {p4}, Lio/flutter/plugins/webviewflutter/s2$a;-><init>()V

    new-instance v0, Lio/flutter/plugins/webviewflutter/r2;

    iget-object v1, p0, Lio/flutter/plugins/webviewflutter/o3;->n:Lio/flutter/plugins/webviewflutter/i2;

    invoke-direct {v0, p1, v1}, Lio/flutter/plugins/webviewflutter/r2;-><init>(Ll8/c;Lio/flutter/plugins/webviewflutter/i2;)V

    invoke-direct {p2, p3, p4, v0}, Lio/flutter/plugins/webviewflutter/s2;-><init>(Lio/flutter/plugins/webviewflutter/i2;Lio/flutter/plugins/webviewflutter/s2$a;Lio/flutter/plugins/webviewflutter/r2;)V

    invoke-static {p1, p2}, Lio/flutter/plugins/webviewflutter/c0;->d(Ll8/c;Lio/flutter/plugins/webviewflutter/k$q;)V

    new-instance p2, Lio/flutter/plugins/webviewflutter/e;

    iget-object p3, p0, Lio/flutter/plugins/webviewflutter/o3;->n:Lio/flutter/plugins/webviewflutter/i2;

    new-instance p4, Lio/flutter/plugins/webviewflutter/e$a;

    invoke-direct {p4}, Lio/flutter/plugins/webviewflutter/e$a;-><init>()V

    new-instance v0, Lio/flutter/plugins/webviewflutter/d;

    iget-object v1, p0, Lio/flutter/plugins/webviewflutter/o3;->n:Lio/flutter/plugins/webviewflutter/i2;

    invoke-direct {v0, p1, v1}, Lio/flutter/plugins/webviewflutter/d;-><init>(Ll8/c;Lio/flutter/plugins/webviewflutter/i2;)V

    invoke-direct {p2, p3, p4, v0}, Lio/flutter/plugins/webviewflutter/e;-><init>(Lio/flutter/plugins/webviewflutter/i2;Lio/flutter/plugins/webviewflutter/e$a;Lio/flutter/plugins/webviewflutter/d;)V

    invoke-static {p1, p2}, Lio/flutter/plugins/webviewflutter/r;->d(Ll8/c;Lio/flutter/plugins/webviewflutter/k$f;)V

    new-instance p2, Lio/flutter/plugins/webviewflutter/v2;

    iget-object p3, p0, Lio/flutter/plugins/webviewflutter/o3;->n:Lio/flutter/plugins/webviewflutter/i2;

    new-instance p4, Lio/flutter/plugins/webviewflutter/v2$a;

    invoke-direct {p4}, Lio/flutter/plugins/webviewflutter/v2$a;-><init>()V

    invoke-direct {p2, p3, p4}, Lio/flutter/plugins/webviewflutter/v2;-><init>(Lio/flutter/plugins/webviewflutter/i2;Lio/flutter/plugins/webviewflutter/v2$a;)V

    invoke-static {p1, p2}, Lio/flutter/plugins/webviewflutter/r0;->D(Ll8/c;Lio/flutter/plugins/webviewflutter/k$u;)V

    new-instance p2, Lio/flutter/plugins/webviewflutter/i;

    invoke-direct {p2, p5}, Lio/flutter/plugins/webviewflutter/i;-><init>(Lio/flutter/plugins/webviewflutter/h;)V

    invoke-static {p1, p2}, Lio/flutter/plugins/webviewflutter/u;->f(Ll8/c;Lio/flutter/plugins/webviewflutter/k$h;)V

    new-instance p2, Lio/flutter/plugins/webviewflutter/b;

    invoke-direct {p2}, Lio/flutter/plugins/webviewflutter/b;-><init>()V

    invoke-static {p1, p2}, Lio/flutter/plugins/webviewflutter/n;->f(Ll8/c;Lio/flutter/plugins/webviewflutter/k$b;)V

    new-instance p2, Lio/flutter/plugins/webviewflutter/w2;

    iget-object p3, p0, Lio/flutter/plugins/webviewflutter/o3;->n:Lio/flutter/plugins/webviewflutter/i2;

    new-instance p4, Lio/flutter/plugins/webviewflutter/w2$a;

    invoke-direct {p4}, Lio/flutter/plugins/webviewflutter/w2$a;-><init>()V

    invoke-direct {p2, p3, p4}, Lio/flutter/plugins/webviewflutter/w2;-><init>(Lio/flutter/plugins/webviewflutter/i2;Lio/flutter/plugins/webviewflutter/w2$a;)V

    invoke-static {p1, p2}, Lio/flutter/plugins/webviewflutter/u0;->f(Ll8/c;Lio/flutter/plugins/webviewflutter/k$w;)V

    return-void
.end method

.method private d(Landroid/content/Context;)V
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/webviewflutter/o3;->p:Lio/flutter/plugins/webviewflutter/q3;

    invoke-virtual {v0, p1}, Lio/flutter/plugins/webviewflutter/q3;->B(Landroid/content/Context;)V

    iget-object v0, p0, Lio/flutter/plugins/webviewflutter/o3;->q:Lio/flutter/plugins/webviewflutter/o2;

    new-instance v1, Landroid/os/Handler;

    invoke-virtual {p1}, Landroid/content/Context;->getMainLooper()Landroid/os/Looper;

    move-result-object p1

    invoke-direct {v1, p1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    invoke-virtual {v0, v1}, Lio/flutter/plugins/webviewflutter/o2;->b(Landroid/os/Handler;)V

    return-void
.end method


# virtual methods
.method public onAttachedToActivity(Ld8/c;)V
    .locals 0

    invoke-interface {p1}, Ld8/c;->e()Landroid/app/Activity;

    move-result-object p1

    invoke-direct {p0, p1}, Lio/flutter/plugins/webviewflutter/o3;->d(Landroid/content/Context;)V

    return-void
.end method

.method public onAttachedToEngine(Lc8/a$b;)V
    .locals 6

    iput-object p1, p0, Lio/flutter/plugins/webviewflutter/o3;->o:Lc8/a$b;

    invoke-virtual {p1}, Lc8/a$b;->b()Ll8/c;

    move-result-object v1

    invoke-virtual {p1}, Lc8/a$b;->d()Lio/flutter/plugin/platform/h;

    move-result-object v2

    invoke-virtual {p1}, Lc8/a$b;->a()Landroid/content/Context;

    move-result-object v3

    new-instance v5, Lio/flutter/plugins/webviewflutter/h$a;

    invoke-virtual {p1}, Lc8/a$b;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v0

    invoke-virtual {p1}, Lc8/a$b;->c()Lc8/a$a;

    move-result-object p1

    invoke-direct {v5, v0, p1}, Lio/flutter/plugins/webviewflutter/h$a;-><init>(Landroid/content/res/AssetManager;Lc8/a$a;)V

    const/4 v4, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lio/flutter/plugins/webviewflutter/o3;->c(Ll8/c;Lio/flutter/plugin/platform/h;Landroid/content/Context;Landroid/view/View;Lio/flutter/plugins/webviewflutter/h;)V

    return-void
.end method

.method public onDetachedFromActivity()V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/webviewflutter/o3;->o:Lc8/a$b;

    invoke-virtual {v0}, Lc8/a$b;->a()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p0, v0}, Lio/flutter/plugins/webviewflutter/o3;->d(Landroid/content/Context;)V

    return-void
.end method

.method public onDetachedFromActivityForConfigChanges()V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/webviewflutter/o3;->o:Lc8/a$b;

    invoke-virtual {v0}, Lc8/a$b;->a()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p0, v0}, Lio/flutter/plugins/webviewflutter/o3;->d(Landroid/content/Context;)V

    return-void
.end method

.method public onDetachedFromEngine(Lc8/a$b;)V
    .locals 0

    iget-object p1, p0, Lio/flutter/plugins/webviewflutter/o3;->n:Lio/flutter/plugins/webviewflutter/i2;

    invoke-virtual {p1}, Lio/flutter/plugins/webviewflutter/i2;->e()V

    return-void
.end method

.method public onReattachedToActivityForConfigChanges(Ld8/c;)V
    .locals 0

    invoke-interface {p1}, Ld8/c;->e()Landroid/app/Activity;

    move-result-object p1

    invoke-direct {p0, p1}, Lio/flutter/plugins/webviewflutter/o3;->d(Landroid/content/Context;)V

    return-void
.end method
