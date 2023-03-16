.class public final Lu4/h;
.super Ljava/lang/Object;
.source ""


# static fields
.field private static a:Lu4/e;


# direct methods
.method static declared-synchronized a(Landroid/content/Context;)Lu4/e;
    .locals 3

    const-class v0, Lu4/h;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lu4/h;->a:Lu4/e;

    if-nez v1, :cond_0

    new-instance v1, Lu4/g;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lu4/g;-><init>(Lu4/f;)V

    new-instance v2, Lu4/n;

    invoke-static {p0}, Lv4/f0;->a(Landroid/content/Context;)Landroid/content/Context;

    move-result-object p0

    invoke-direct {v2, p0}, Lu4/n;-><init>(Landroid/content/Context;)V

    invoke-virtual {v1, v2}, Lu4/g;->b(Lu4/n;)Lu4/g;

    invoke-virtual {v1}, Lu4/g;->a()Lu4/e;

    move-result-object p0

    sput-object p0, Lu4/h;->a:Lu4/e;

    :cond_0
    sget-object p0, Lu4/h;->a:Lu4/e;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method
