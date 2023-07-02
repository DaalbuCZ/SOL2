.class public final Lz4/h;
.super Ljava/lang/Object;
.source ""


# static fields
.field private static a:Lz4/e;


# direct methods
.method static declared-synchronized a(Landroid/content/Context;)Lz4/e;
    .locals 3

    const-class v0, Lz4/h;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lz4/h;->a:Lz4/e;

    if-nez v1, :cond_0

    new-instance v1, Lz4/g;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lz4/g;-><init>(Lz4/f;)V

    new-instance v2, Lz4/n;

    invoke-static {p0}, La5/f0;->a(Landroid/content/Context;)Landroid/content/Context;

    move-result-object p0

    invoke-direct {v2, p0}, Lz4/n;-><init>(Landroid/content/Context;)V

    invoke-virtual {v1, v2}, Lz4/g;->b(Lz4/n;)Lz4/g;

    invoke-virtual {v1}, Lz4/g;->a()Lz4/e;

    move-result-object p0

    sput-object p0, Lz4/h;->a:Lz4/e;

    :cond_0
    sget-object p0, Lz4/h;->a:Lz4/e;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method
