.class public abstract Lv4/r;
.super Ljava/lang/Object;
.source ""


# instance fields
.field protected final a:Lv4/s;

.field private final b:Landroid/content/IntentFilter;

.field private final c:Landroid/content/Context;

.field protected final d:Ljava/util/Set;

.field private e:Lv4/q;

.field private volatile f:Z


# direct methods
.method protected constructor <init>(Lv4/s;Landroid/content/IntentFilter;Landroid/content/Context;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lv4/r;->d:Ljava/util/Set;

    const/4 v0, 0x0

    iput-object v0, p0, Lv4/r;->e:Lv4/q;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lv4/r;->f:Z

    iput-object p1, p0, Lv4/r;->a:Lv4/s;

    iput-object p2, p0, Lv4/r;->b:Landroid/content/IntentFilter;

    invoke-static {p3}, Lv4/f0;->a(Landroid/content/Context;)Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lv4/r;->c:Landroid/content/Context;

    return-void
.end method

.method private final d()V
    .locals 5

    iget-object v0, p0, Lv4/r;->d:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_1

    iget-object v0, p0, Lv4/r;->e:Lv4/q;

    if-nez v0, :cond_1

    new-instance v0, Lv4/q;

    invoke-direct {v0, p0, v1}, Lv4/q;-><init>(Lv4/r;Lv4/p;)V

    iput-object v0, p0, Lv4/r;->e:Lv4/q;

    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x21

    if-lt v2, v3, :cond_0

    iget-object v2, p0, Lv4/r;->c:Landroid/content/Context;

    iget-object v3, p0, Lv4/r;->b:Landroid/content/IntentFilter;

    const/4 v4, 0x2

    invoke-virtual {v2, v0, v3, v4}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;I)Landroid/content/Intent;

    :cond_0
    iget-object v0, p0, Lv4/r;->c:Landroid/content/Context;

    iget-object v2, p0, Lv4/r;->e:Lv4/q;

    iget-object v3, p0, Lv4/r;->b:Landroid/content/IntentFilter;

    invoke-virtual {v0, v2, v3}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    :cond_1
    iget-object v0, p0, Lv4/r;->d:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lv4/r;->e:Lv4/q;

    if-eqz v0, :cond_2

    iget-object v2, p0, Lv4/r;->c:Landroid/content/Context;

    invoke-virtual {v2, v0}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    iput-object v1, p0, Lv4/r;->e:Lv4/q;

    :cond_2
    return-void
.end method


# virtual methods
.method protected abstract a(Landroid/content/Context;Landroid/content/Intent;)V
.end method

.method public final declared-synchronized b(Lz4/a;)V
    .locals 3

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lv4/r;->a:Lv4/s;

    const-string v1, "registerListener"

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2}, Lv4/s;->d(Ljava/lang/String;[Ljava/lang/Object;)I

    const-string v0, "Registered Play Core listener should not be null."

    invoke-static {p1, v0}, Lv4/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lv4/r;->d:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    invoke-direct {p0}, Lv4/r;->d()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final declared-synchronized c(Ljava/lang/Object;)V
    .locals 2

    monitor-enter p0

    :try_start_0
    new-instance v0, Ljava/util/HashSet;

    iget-object v1, p0, Lv4/r;->d:Ljava/util/Set;

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lz4/a;

    invoke-interface {v1, p1}, Lz4/a;->a(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method
