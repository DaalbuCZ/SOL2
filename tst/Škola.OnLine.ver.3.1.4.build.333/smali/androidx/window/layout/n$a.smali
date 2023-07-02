.class public final Landroidx/window/layout/n$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/window/layout/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ls9/g;)V
    .locals 0

    invoke-direct {p0}, Landroidx/window/layout/n$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;)Landroidx/window/layout/n;
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Ls9/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Landroidx/window/layout/n;->c()Landroidx/window/layout/n;

    move-result-object v0

    if-nez v0, :cond_1

    invoke-static {}, Landroidx/window/layout/n;->d()Ljava/util/concurrent/locks/ReentrantLock;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    :try_start_0
    invoke-static {}, Landroidx/window/layout/n;->c()Landroidx/window/layout/n;

    move-result-object v1

    if-nez v1, :cond_0

    sget-object v1, Landroidx/window/layout/n;->c:Landroidx/window/layout/n$a;

    invoke-virtual {v1, p1}, Landroidx/window/layout/n$a;->b(Landroid/content/Context;)Landroidx/window/layout/g;

    move-result-object p1

    new-instance v1, Landroidx/window/layout/n;

    invoke-direct {v1, p1}, Landroidx/window/layout/n;-><init>(Landroidx/window/layout/g;)V

    invoke-static {v1}, Landroidx/window/layout/n;->e(Landroidx/window/layout/n;)V

    :cond_0
    sget-object p1, Lg9/s;->a:Lg9/s;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    goto :goto_0

    :catchall_0
    move-exception p1

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw p1

    :cond_1
    :goto_0
    invoke-static {}, Landroidx/window/layout/n;->c()Landroidx/window/layout/n;

    move-result-object p1

    invoke-static {p1}, Ls9/k;->b(Ljava/lang/Object;)V

    return-object p1
.end method

.method public final b(Landroid/content/Context;)Landroidx/window/layout/g;
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Ls9/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    :try_start_0
    sget-object v1, Landroidx/window/layout/SidecarCompat;->f:Landroidx/window/layout/SidecarCompat$a;

    invoke-virtual {v1}, Landroidx/window/layout/SidecarCompat$a;->c()Ln0/h;

    move-result-object v1

    invoke-virtual {p0, v1}, Landroidx/window/layout/n$a;->c(Ln0/h;)Z

    move-result v1

    if-eqz v1, :cond_1

    new-instance v1, Landroidx/window/layout/SidecarCompat;

    invoke-direct {v1, p1}, Landroidx/window/layout/SidecarCompat;-><init>(Landroid/content/Context;)V

    invoke-virtual {v1}, Landroidx/window/layout/SidecarCompat;->l()Z

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :catchall_0
    :cond_1
    :goto_0
    return-object v0
.end method

.method public final c(Ln0/h;)Z
    .locals 2

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    :cond_0
    sget-object v1, Ln0/h;->s:Ln0/h$a;

    invoke-virtual {v1}, Ln0/h$a;->a()Ln0/h;

    move-result-object v1

    invoke-virtual {p1, v1}, Ln0/h;->g(Ln0/h;)I

    move-result p1

    if-ltz p1, :cond_1

    const/4 v0, 0x1

    :cond_1
    return v0
.end method
