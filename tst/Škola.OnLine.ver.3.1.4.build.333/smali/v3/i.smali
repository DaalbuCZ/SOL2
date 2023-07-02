.class public final Lv3/i;
.super Landroid/view/Surface;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lv3/i$b;
    }
.end annotation


# static fields
.field private static q:I

.field private static r:Z


# instance fields
.field public final n:Z

.field private final o:Lv3/i$b;

.field private p:Z


# direct methods
.method private constructor <init>(Lv3/i$b;Landroid/graphics/SurfaceTexture;Z)V
    .locals 0

    invoke-direct {p0, p2}, Landroid/view/Surface;-><init>(Landroid/graphics/SurfaceTexture;)V

    iput-object p1, p0, Lv3/i;->o:Lv3/i$b;

    iput-boolean p3, p0, Lv3/i;->n:Z

    return-void
.end method

.method synthetic constructor <init>(Lv3/i$b;Landroid/graphics/SurfaceTexture;ZLv3/i$a;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lv3/i;-><init>(Lv3/i$b;Landroid/graphics/SurfaceTexture;Z)V

    return-void
.end method

.method private static a(Landroid/content/Context;)I
    .locals 0

    invoke-static {p0}, Lu3/m;->c(Landroid/content/Context;)Z

    move-result p0

    if-eqz p0, :cond_1

    invoke-static {}, Lu3/m;->d()Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x2

    return p0

    :cond_1
    const/4 p0, 0x0

    return p0
.end method

.method public static declared-synchronized b(Landroid/content/Context;)Z
    .locals 3

    const-class v0, Lv3/i;

    monitor-enter v0

    :try_start_0
    sget-boolean v1, Lv3/i;->r:Z

    const/4 v2, 0x1

    if-nez v1, :cond_0

    invoke-static {p0}, Lv3/i;->a(Landroid/content/Context;)I

    move-result p0

    sput p0, Lv3/i;->q:I

    sput-boolean v2, Lv3/i;->r:Z

    :cond_0
    sget p0, Lv3/i;->q:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    :goto_0
    monitor-exit v0

    return v2

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method public static c(Landroid/content/Context;Z)Lv3/i;
    .locals 1

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    invoke-static {p0}, Lv3/i;->b(Landroid/content/Context;)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    move p0, v0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x1

    :goto_1
    invoke-static {p0}, Lu3/a;->f(Z)V

    new-instance p0, Lv3/i$b;

    invoke-direct {p0}, Lv3/i$b;-><init>()V

    if-eqz p1, :cond_2

    sget v0, Lv3/i;->q:I

    :cond_2
    invoke-virtual {p0, v0}, Lv3/i$b;->a(I)Lv3/i;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public release()V
    .locals 2

    invoke-super {p0}, Landroid/view/Surface;->release()V

    iget-object v0, p0, Lv3/i;->o:Lv3/i$b;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Lv3/i;->p:Z

    if-nez v1, :cond_0

    iget-object v1, p0, Lv3/i;->o:Lv3/i$b;

    invoke-virtual {v1}, Lv3/i$b;->c()V

    const/4 v1, 0x1

    iput-boolean v1, p0, Lv3/i;->p:Z

    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
