.class final Lu4/l;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lu4/b;


# instance fields
.field private final a:Lu4/w;

.field private final b:Lu4/i;

.field private final c:Landroid/content/Context;

.field private final d:Landroid/os/Handler;


# direct methods
.method constructor <init>(Lu4/w;Lu4/i;Landroid/content/Context;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lu4/l;->d:Landroid/os/Handler;

    iput-object p1, p0, Lu4/l;->a:Lu4/w;

    iput-object p2, p0, Lu4/l;->b:Lu4/i;

    iput-object p3, p0, Lu4/l;->c:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final a(Lu4/a;ILandroid/app/Activity;I)Z
    .locals 1

    invoke-static {p2}, Lu4/d;->c(I)Lu4/d;

    move-result-object p2

    if-nez p3, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    new-instance v0, Lu4/k;

    invoke-direct {v0, p0, p3}, Lu4/k;-><init>(Lu4/l;Landroid/app/Activity;)V

    invoke-virtual {p0, p1, v0, p2, p4}, Lu4/l;->e(Lu4/a;Lw4/a;Lu4/d;I)Z

    move-result p1

    return p1
.end method

.method public final b()Lt4/i;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lt4/i<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lu4/l;->a:Lu4/w;

    iget-object v1, p0, Lu4/l;->c:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lu4/w;->d(Ljava/lang/String;)Lt4/i;

    move-result-object v0

    return-object v0
.end method

.method public final c()Lt4/i;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lt4/i<",
            "Lu4/a;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lu4/l;->a:Lu4/w;

    iget-object v1, p0, Lu4/l;->c:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lu4/w;->e(Ljava/lang/String;)Lt4/i;

    move-result-object v0

    return-object v0
.end method

.method public final declared-synchronized d(Lx4/b;)V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lu4/l;->b:Lu4/i;

    invoke-virtual {v0, p1}, Lv4/r;->b(Lz4/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final e(Lu4/a;Lw4/a;Lu4/d;I)Z
    .locals 8

    if-eqz p1, :cond_1

    if-eqz p2, :cond_1

    if-eqz p3, :cond_1

    invoke-virtual {p1, p3}, Lu4/a;->e(Lu4/d;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lu4/a;->l()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lu4/a;->k()V

    invoke-virtual {p1, p3}, Lu4/a;->i(Lu4/d;)Landroid/app/PendingIntent;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/PendingIntent;->getIntentSender()Landroid/content/IntentSender;

    move-result-object v1

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v0, p2

    move v2, p4

    invoke-interface/range {v0 .. v7}, Lw4/a;->a(Landroid/content/IntentSender;ILandroid/content/Intent;IIILandroid/os/Bundle;)V

    const/4 p1, 0x1

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return p1
.end method
