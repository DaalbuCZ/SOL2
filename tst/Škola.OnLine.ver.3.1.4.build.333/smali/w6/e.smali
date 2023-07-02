.class public Lw6/e;
.super Ljava/lang/Object;
.source ""


# static fields
.field private static final i:Lz6/a;


# instance fields
.field private final a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Lcom/google/firebase/perf/config/a;

.field private final c:Lf7/f;

.field private d:Ljava/lang/Boolean;

.field private final e:Lk5/e;

.field private final f:Ln6/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ln6/b<",
            "Lcom/google/firebase/remoteconfig/c;",
            ">;"
        }
    .end annotation
.end field

.field private final g:Lo6/e;

.field private final h:Ln6/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ln6/b<",
            "Lj1/g;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    invoke-static {}, Lz6/a;->e()Lz6/a;

    move-result-object v0

    sput-object v0, Lw6/e;->i:Lz6/a;

    return-void
.end method

.method constructor <init>(Lk5/e;Ln6/b;Lo6/e;Ln6/b;Lcom/google/firebase/perf/config/RemoteConfigManager;Lcom/google/firebase/perf/config/a;Lcom/google/firebase/perf/session/SessionManager;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lk5/e;",
            "Ln6/b<",
            "Lcom/google/firebase/remoteconfig/c;",
            ">;",
            "Lo6/e;",
            "Ln6/b<",
            "Lj1/g;",
            ">;",
            "Lcom/google/firebase/perf/config/RemoteConfigManager;",
            "Lcom/google/firebase/perf/config/a;",
            "Lcom/google/firebase/perf/session/SessionManager;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lj$/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Lj$/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lw6/e;->a:Ljava/util/Map;

    const/4 v0, 0x0

    iput-object v0, p0, Lw6/e;->d:Ljava/lang/Boolean;

    iput-object p1, p0, Lw6/e;->e:Lk5/e;

    iput-object p2, p0, Lw6/e;->f:Ln6/b;

    iput-object p3, p0, Lw6/e;->g:Lo6/e;

    iput-object p4, p0, Lw6/e;->h:Ln6/b;

    if-nez p1, :cond_0

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object p1, p0, Lw6/e;->d:Ljava/lang/Boolean;

    iput-object p6, p0, Lw6/e;->b:Lcom/google/firebase/perf/config/a;

    new-instance p1, Lf7/f;

    new-instance p2, Landroid/os/Bundle;

    invoke-direct {p2}, Landroid/os/Bundle;-><init>()V

    invoke-direct {p1, p2}, Lf7/f;-><init>(Landroid/os/Bundle;)V

    iput-object p1, p0, Lw6/e;->c:Lf7/f;

    return-void

    :cond_0
    invoke-static {}, Le7/k;->k()Le7/k;

    move-result-object v0

    invoke-virtual {v0, p1, p3, p4}, Le7/k;->r(Lk5/e;Lo6/e;Ln6/b;)V

    invoke-virtual {p1}, Lk5/e;->l()Landroid/content/Context;

    move-result-object p3

    invoke-static {p3}, Lw6/e;->a(Landroid/content/Context;)Lf7/f;

    move-result-object p4

    iput-object p4, p0, Lw6/e;->c:Lf7/f;

    invoke-virtual {p5, p2}, Lcom/google/firebase/perf/config/RemoteConfigManager;->setFirebaseRemoteConfigProvider(Ln6/b;)V

    iput-object p6, p0, Lw6/e;->b:Lcom/google/firebase/perf/config/a;

    invoke-virtual {p6, p4}, Lcom/google/firebase/perf/config/a;->Q(Lf7/f;)V

    invoke-virtual {p6, p3}, Lcom/google/firebase/perf/config/a;->O(Landroid/content/Context;)V

    invoke-virtual {p7, p3}, Lcom/google/firebase/perf/session/SessionManager;->setApplicationContext(Landroid/content/Context;)V

    invoke-virtual {p6}, Lcom/google/firebase/perf/config/a;->j()Ljava/lang/Boolean;

    move-result-object p2

    iput-object p2, p0, Lw6/e;->d:Ljava/lang/Boolean;

    sget-object p2, Lw6/e;->i:Lz6/a;

    invoke-virtual {p2}, Lz6/a;->h()Z

    move-result p4

    if-eqz p4, :cond_1

    invoke-virtual {p0}, Lw6/e;->d()Z

    move-result p4

    if-eqz p4, :cond_1

    const/4 p4, 0x1

    new-array p4, p4, [Ljava/lang/Object;

    const/4 p5, 0x0

    invoke-virtual {p1}, Lk5/e;->q()Lk5/l;

    move-result-object p1

    invoke-virtual {p1}, Lk5/l;->g()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p3

    invoke-static {p1, p3}, Lz6/b;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    aput-object p1, p4, p5

    const-string p1, "Firebase Performance Monitoring is successfully initialized! In a minute, visit the Firebase console to view your data: %s"

    invoke-static {p1, p4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Lz6/a;->f(Ljava/lang/String;)V

    :cond_1
    return-void
.end method

.method private static a(Landroid/content/Context;)Lf7/f;
    .locals 2

    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p0

    const/16 v1, 0x80

    invoke-virtual {v0, p0, v1}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    move-result-object p0

    iget-object p0, p0, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p0

    goto :goto_0

    :catch_1
    move-exception p0

    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "No perf enable meta data found "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string v0, "isEnabled"

    invoke-static {v0, p0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    const/4 p0, 0x0

    :goto_1
    new-instance v0, Lf7/f;

    if-eqz p0, :cond_0

    invoke-direct {v0, p0}, Lf7/f;-><init>(Landroid/os/Bundle;)V

    goto :goto_2

    :cond_0
    invoke-direct {v0}, Lf7/f;-><init>()V

    :goto_2
    return-object v0
.end method

.method public static c()Lw6/e;
    .locals 2

    invoke-static {}, Lk5/e;->n()Lk5/e;

    move-result-object v0

    const-class v1, Lw6/e;

    invoke-virtual {v0, v1}, Lk5/e;->j(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lw6/e;

    return-object v0
.end method


# virtual methods
.method public b()Ljava/util/Map;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashMap;

    iget-object v1, p0, Lw6/e;->a:Ljava/util/Map;

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    return-object v0
.end method

.method public d()Z
    .locals 1

    iget-object v0, p0, Lw6/e;->d:Ljava/lang/Boolean;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    goto :goto_0

    :cond_0
    invoke-static {}, Lk5/e;->n()Lk5/e;

    move-result-object v0

    invoke-virtual {v0}, Lk5/e;->w()Z

    move-result v0

    :goto_0
    return v0
.end method

.method public e(Ljava/lang/String;Ljava/lang/String;)La7/g;
    .locals 3

    new-instance v0, La7/g;

    invoke-static {}, Le7/k;->k()Le7/k;

    move-result-object v1

    new-instance v2, Lf7/l;

    invoke-direct {v2}, Lf7/l;-><init>()V

    invoke-direct {v0, p1, p2, v1, v2}, La7/g;-><init>(Ljava/lang/String;Ljava/lang/String;Le7/k;Lf7/l;)V

    return-object v0
.end method

.method public f(Ljava/lang/String;)Lcom/google/firebase/perf/metrics/Trace;
    .locals 0

    invoke-static {p1}, Lcom/google/firebase/perf/metrics/Trace;->c(Ljava/lang/String;)Lcom/google/firebase/perf/metrics/Trace;

    move-result-object p1

    return-object p1
.end method

.method public declared-synchronized g(Ljava/lang/Boolean;)V
    .locals 1

    monitor-enter p0

    :try_start_0
    invoke-static {}, Lk5/e;->n()Lk5/e;
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    iget-object v0, p0, Lw6/e;->b:Lcom/google/firebase/perf/config/a;

    invoke-virtual {v0}, Lcom/google/firebase/perf/config/a;->i()Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p1, Lw6/e;->i:Lz6/a;

    const-string v0, "Firebase Performance is permanently disabled"

    invoke-virtual {p1, v0}, Lz6/a;->f(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void

    :cond_0
    :try_start_2
    iget-object v0, p0, Lw6/e;->b:Lcom/google/firebase/perf/config/a;

    invoke-virtual {v0, p1}, Lcom/google/firebase/perf/config/a;->P(Ljava/lang/Boolean;)V

    if-eqz p1, :cond_1

    :goto_0
    iput-object p1, p0, Lw6/e;->d:Ljava/lang/Boolean;

    goto :goto_1

    :cond_1
    iget-object p1, p0, Lw6/e;->b:Lcom/google/firebase/perf/config/a;

    invoke-virtual {p1}, Lcom/google/firebase/perf/config/a;->j()Ljava/lang/Boolean;

    move-result-object p1

    goto :goto_0

    :goto_1
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iget-object v0, p0, Lw6/e;->d:Ljava/lang/Boolean;

    invoke-virtual {p1, v0}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    sget-object p1, Lw6/e;->i:Lz6/a;

    const-string v0, "Firebase Performance is Enabled"

    :goto_2
    invoke-virtual {p1, v0}, Lz6/a;->f(Ljava/lang/String;)V

    goto :goto_3

    :cond_2
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iget-object v0, p0, Lw6/e;->d:Ljava/lang/Boolean;

    invoke-virtual {p1, v0}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    sget-object p1, Lw6/e;->i:Lz6/a;

    const-string v0, "Firebase Performance is Disabled"
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_2

    :cond_3
    :goto_3
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1

    :catch_0
    monitor-exit p0

    return-void
.end method
