.class public Lq8/j;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lio/flutter/plugins/firebase/core/FlutterFirebasePlugin;
.implements Lc8/a;
.implements Ll8/k$c;


# static fields
.field static final o:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/Integer;",
            "Lv6/g;",
            ">;"
        }
    .end annotation
.end field

.field static final p:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/Integer;",
            "Lcom/google/firebase/perf/metrics/Trace;",
            ">;"
        }
    .end annotation
.end field

.field static q:I

.field static r:I


# instance fields
.field private n:Ll8/k;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lq8/j;->o:Ljava/util/HashMap;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lq8/j;->p:Ljava/util/HashMap;

    const/4 v0, 0x0

    sput v0, Lq8/j;->q:I

    sput v0, Lq8/j;->r:I

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lt4/j;)V
    .locals 0

    invoke-static {p0}, Lq8/j;->r(Lt4/j;)V

    return-void
.end method

.method public static synthetic b(Lt4/j;)V
    .locals 0

    invoke-static {p0}, Lq8/j;->n(Lt4/j;)V

    return-void
.end method

.method public static synthetic c(Ll8/j;Lt4/j;)V
    .locals 0

    invoke-static {p0, p1}, Lq8/j;->q(Ll8/j;Lt4/j;)V

    return-void
.end method

.method public static synthetic d(Ll8/j;Lt4/j;)V
    .locals 0

    invoke-static {p0, p1}, Lq8/j;->t(Ll8/j;Lt4/j;)V

    return-void
.end method

.method public static synthetic e(Ll8/j;Lt4/j;)V
    .locals 0

    invoke-static {p0, p1}, Lq8/j;->p(Ll8/j;Lt4/j;)V

    return-void
.end method

.method public static synthetic f(Ll8/j;Lt4/j;)V
    .locals 0

    invoke-static {p0, p1}, Lq8/j;->u(Ll8/j;Lt4/j;)V

    return-void
.end method

.method public static synthetic g(Ll8/k$d;Lt4/i;)V
    .locals 0

    invoke-static {p0, p1}, Lq8/j;->s(Ll8/k$d;Lt4/i;)V

    return-void
.end method

.method public static synthetic h(Lq8/j;Lt4/j;)V
    .locals 0

    invoke-direct {p0, p1}, Lq8/j;->o(Lt4/j;)V

    return-void
.end method

.method public static synthetic i(Ll8/j;Lt4/j;)V
    .locals 0

    invoke-static {p0, p1}, Lq8/j;->v(Ll8/j;Lt4/j;)V

    return-void
.end method

.method private j(Ll8/j;)Lt4/i;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ll8/j;",
            ")",
            "Lt4/i<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    new-instance v0, Lt4/j;

    invoke-direct {v0}, Lt4/j;-><init>()V

    sget-object v1, Lio/flutter/plugins/firebase/core/FlutterFirebasePlugin;->cachedThreadPool:Ljava/util/concurrent/ExecutorService;

    new-instance v2, Lq8/c;

    invoke-direct {v2, p1, v0}, Lq8/c;-><init>(Ll8/j;Lt4/j;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Lt4/j;->a()Lt4/i;

    move-result-object p1

    return-object p1
.end method

.method private k(Ll8/j;)Lt4/i;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ll8/j;",
            ")",
            "Lt4/i<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    new-instance v0, Lt4/j;

    invoke-direct {v0}, Lt4/j;-><init>()V

    sget-object v1, Lio/flutter/plugins/firebase/core/FlutterFirebasePlugin;->cachedThreadPool:Ljava/util/concurrent/ExecutorService;

    new-instance v2, Lq8/a;

    invoke-direct {v2, p1, v0}, Lq8/a;-><init>(Ll8/j;Lt4/j;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Lt4/j;->a()Lt4/i;

    move-result-object p1

    return-object p1
.end method

.method private l(Ll8/c;)V
    .locals 2

    const-string v0, "plugins.flutter.io/firebase_performance"

    invoke-static {v0, p0}, Lio/flutter/plugins/firebase/core/FlutterFirebasePluginRegistry;->registerPlugin(Ljava/lang/String;Lio/flutter/plugins/firebase/core/FlutterFirebasePlugin;)V

    new-instance v1, Ll8/k;

    invoke-direct {v1, p1, v0}, Ll8/k;-><init>(Ll8/c;Ljava/lang/String;)V

    iput-object v1, p0, Lq8/j;->n:Ll8/k;

    invoke-virtual {v1, p0}, Ll8/k;->e(Ll8/k$c;)V

    return-void
.end method

.method private m()Lt4/i;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lt4/i<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    new-instance v0, Lt4/j;

    invoke-direct {v0}, Lt4/j;-><init>()V

    sget-object v1, Lio/flutter/plugins/firebase/core/FlutterFirebasePlugin;->cachedThreadPool:Ljava/util/concurrent/ExecutorService;

    new-instance v2, Lq8/g;

    invoke-direct {v2, v0}, Lq8/g;-><init>(Lt4/j;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Lt4/j;->a()Lt4/i;

    move-result-object v0

    return-object v0
.end method

.method private static synthetic n(Lt4/j;)V
    .locals 2

    :try_start_0
    sget-object v0, Lq8/j;->p:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/firebase/perf/metrics/Trace;

    invoke-virtual {v1}, Lcom/google/firebase/perf/metrics/Trace;->stop()V

    goto :goto_0

    :cond_0
    sget-object v0, Lq8/j;->p:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    sget-object v0, Lq8/j;->o:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lv6/g;

    invoke-virtual {v1}, Lv6/g;->h()V

    goto :goto_1

    :cond_1
    sget-object v0, Lq8/j;->o:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lt4/j;->c(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception v0

    invoke-virtual {p0, v0}, Lt4/j;->b(Ljava/lang/Exception;)V

    :goto_2
    return-void
.end method

.method private synthetic o(Lt4/j;)V
    .locals 1

    :try_start_0
    new-instance v0, Lq8/j$a;

    invoke-direct {v0, p0}, Lq8/j$a;-><init>(Lq8/j;)V

    invoke-virtual {p1, v0}, Lt4/j;->c(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-virtual {p1, v0}, Lt4/j;->b(Ljava/lang/Exception;)V

    :goto_0
    return-void
.end method

.method private static synthetic p(Ll8/j;Lt4/j;)V
    .locals 3

    :try_start_0
    const-string v0, "url"

    invoke-virtual {p0, v0}, Ll8/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "httpMethod"

    invoke-virtual {p0, v1}, Ll8/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    invoke-static {p0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lr6/e;->c()Lr6/e;

    move-result-object v1

    invoke-static {p0}, Lq8/j;->w(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, v0, p0}, Lr6/e;->e(Ljava/lang/String;Ljava/lang/String;)Lv6/g;

    move-result-object p0

    invoke-virtual {p0}, Lv6/g;->g()V

    sget v0, Lq8/j;->r:I

    add-int/lit8 v1, v0, 0x1

    sput v1, Lq8/j;->r:I

    sget-object v1, Lq8/j;->o:Ljava/util/HashMap;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-virtual {p1, p0}, Lt4/j;->c(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p0

    invoke-virtual {p1, p0}, Lt4/j;->b(Ljava/lang/Exception;)V

    :goto_0
    return-void
.end method

.method private static synthetic q(Ll8/j;Lt4/j;)V
    .locals 7

    :try_start_0
    const-string v0, "handle"

    invoke-virtual {p0, v0}, Ll8/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const-string v1, "attributes"

    invoke-virtual {p0, v1}, Ll8/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map;

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v1, Ljava/util/Map;

    const-string v2, "httpResponseCode"

    invoke-virtual {p0, v2}, Ll8/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    const-string v3, "requestPayloadSize"

    invoke-virtual {p0, v3}, Ll8/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    const-string v4, "responseContentType"

    invoke-virtual {p0, v4}, Ll8/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    const-string v5, "responsePayloadSize"

    invoke-virtual {p0, v5}, Ll8/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Integer;

    sget-object v5, Lq8/j;->o:Ljava/util/HashMap;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lv6/g;

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-virtual {v5, v2}, Lv6/g;->c(I)V

    :cond_0
    if-eqz v3, :cond_1

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v2

    int-to-long v2, v2

    invoke-virtual {v5, v2, v3}, Lv6/g;->d(J)V

    :cond_1
    if-eqz v4, :cond_2

    invoke-virtual {v5, v4}, Lv6/g;->e(Ljava/lang/String;)V

    :cond_2
    if-eqz p0, :cond_3

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    int-to-long v2, p0

    invoke-virtual {v5, v2, v3}, Lv6/g;->f(J)V

    :cond_3
    invoke-interface {v1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v5, v2, v3}, Lv6/g;->b(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_4
    invoke-virtual {v5}, Lv6/g;->h()V

    sget-object p0, Lq8/j;->o:Ljava/util/HashMap;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 p0, 0x0

    invoke-virtual {p1, p0}, Lt4/j;->c(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p0

    invoke-virtual {p1, p0}, Lt4/j;->b(Ljava/lang/Exception;)V

    :goto_1
    return-void
.end method

.method private static synthetic r(Lt4/j;)V
    .locals 1

    :try_start_0
    invoke-static {}, Lr6/e;->c()Lr6/e;

    move-result-object v0

    invoke-virtual {v0}, Lr6/e;->d()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {p0, v0}, Lt4/j;->c(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-virtual {p0, v0}, Lt4/j;->b(Ljava/lang/Exception;)V

    :goto_0
    return-void
.end method

.method private static synthetic s(Ll8/k$d;Lt4/i;)V
    .locals 2

    invoke-virtual {p1}, Lt4/i;->p()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lt4/i;->l()Ljava/lang/Object;

    move-result-object p1

    invoke-interface {p0, p1}, Ll8/k$d;->a(Ljava/lang/Object;)V

    goto :goto_1

    :cond_0
    invoke-virtual {p1}, Lt4/i;->k()Ljava/lang/Exception;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_1
    const-string p1, "An unknown error occurred"

    :goto_0
    const/4 v0, 0x0

    const-string v1, "firebase_crashlytics"

    invoke-interface {p0, v1, p1, v0}, Ll8/k$d;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    :goto_1
    return-void
.end method

.method private static synthetic t(Ll8/j;Lt4/j;)V
    .locals 1

    :try_start_0
    const-string v0, "enable"

    invoke-virtual {p0, v0}, Ll8/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-static {}, Lr6/e;->c()Lr6/e;

    move-result-object v0

    invoke-virtual {v0, p0}, Lr6/e;->g(Ljava/lang/Boolean;)V

    const/4 p0, 0x0

    invoke-virtual {p1, p0}, Lt4/j;->c(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p0

    invoke-virtual {p1, p0}, Lt4/j;->b(Ljava/lang/Exception;)V

    :goto_0
    return-void
.end method

.method private static synthetic u(Ll8/j;Lt4/j;)V
    .locals 3

    :try_start_0
    const-string v0, "name"

    invoke-virtual {p0, v0}, Ll8/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    invoke-static {}, Lr6/e;->c()Lr6/e;

    move-result-object v0

    invoke-virtual {v0, p0}, Lr6/e;->f(Ljava/lang/String;)Lcom/google/firebase/perf/metrics/Trace;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/firebase/perf/metrics/Trace;->start()V

    sget v0, Lq8/j;->q:I

    add-int/lit8 v1, v0, 0x1

    sput v1, Lq8/j;->q:I

    sget-object v1, Lq8/j;->p:Ljava/util/HashMap;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-virtual {p1, p0}, Lt4/j;->c(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p0

    invoke-virtual {p1, p0}, Lt4/j;->b(Ljava/lang/Exception;)V

    :goto_0
    return-void
.end method

.method private static synthetic v(Ll8/j;Lt4/j;)V
    .locals 6

    :try_start_0
    const-string v0, "handle"

    invoke-virtual {p0, v0}, Ll8/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const-string v1, "attributes"

    invoke-virtual {p0, v1}, Ll8/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map;

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v1, Ljava/util/Map;

    const-string v2, "metrics"

    invoke-virtual {p0, v2}, Ll8/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/Map;

    invoke-static {p0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast p0, Ljava/util/Map;

    sget-object v2, Lq8/j;->p:Ljava/util/HashMap;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/firebase/perf/metrics/Trace;

    invoke-interface {v1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-interface {v1, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-virtual {v2, v4, v5}, Lcom/google/firebase/perf/metrics/Trace;->putAttribute(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    invoke-interface {p0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-interface {p0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    int-to-long v4, v4

    invoke-virtual {v2, v3, v4, v5}, Lcom/google/firebase/perf/metrics/Trace;->putMetric(Ljava/lang/String;J)V

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Lcom/google/firebase/perf/metrics/Trace;->stop()V

    sget-object p0, Lq8/j;->p:Ljava/util/HashMap;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 p0, 0x0

    invoke-virtual {p1, p0}, Lt4/j;->c(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception p0

    invoke-virtual {p1, p0}, Lt4/j;->b(Ljava/lang/Exception;)V

    :goto_2
    return-void
.end method

.method private static w(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, -0x1

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    :sswitch_0
    const-string v0, "HttpMethod.Connect"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_0

    :cond_0
    const/16 v3, 0x8

    goto/16 :goto_0

    :sswitch_1
    const-string v0, "HttpMethod.Post"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v3, 0x7

    goto :goto_0

    :sswitch_2
    const-string v0, "HttpMethod.Head"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    const/4 v3, 0x6

    goto :goto_0

    :sswitch_3
    const-string v0, "HttpMethod.Options"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_0

    :cond_3
    const/4 v3, 0x5

    goto :goto_0

    :sswitch_4
    const-string v0, "HttpMethod.Trace"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    goto :goto_0

    :cond_4
    const/4 v3, 0x4

    goto :goto_0

    :sswitch_5
    const-string v0, "HttpMethod.Patch"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    goto :goto_0

    :cond_5
    const/4 v3, 0x3

    goto :goto_0

    :sswitch_6
    const-string v0, "HttpMethod.Delete"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    goto :goto_0

    :cond_6
    const/4 v3, 0x2

    goto :goto_0

    :sswitch_7
    const-string v0, "HttpMethod.Put"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7

    goto :goto_0

    :cond_7
    move v3, v1

    goto :goto_0

    :sswitch_8
    const-string v0, "HttpMethod.Get"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_8

    goto :goto_0

    :cond_8
    move v3, v2

    :goto_0
    packed-switch v3, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-array v1, v1, [Ljava/lang/Object;

    aput-object p0, v1, v2

    const-string p0, "No HttpMethod for: %s"

    invoke-static {p0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    const-string p0, "CONNECT"

    return-object p0

    :pswitch_1
    const-string p0, "POST"

    return-object p0

    :pswitch_2
    const-string p0, "HEAD"

    return-object p0

    :pswitch_3
    const-string p0, "OPTIONS"

    return-object p0

    :pswitch_4
    const-string p0, "TRACE"

    return-object p0

    :pswitch_5
    const-string p0, "PATCH"

    return-object p0

    :pswitch_6
    const-string p0, "DELETE"

    return-object p0

    :pswitch_7
    const-string p0, "PUT"

    return-object p0

    :pswitch_8
    const-string p0, "GET"

    return-object p0

    :sswitch_data_0
    .sparse-switch
        -0x7a0ae08f -> :sswitch_8
        -0x7a0abcd6 -> :sswitch_7
        -0x3ceac450 -> :sswitch_6
        -0x2257ea5d -> :sswitch_5
        -0x22181960 -> :sswitch_4
        -0x7516ec7 -> :sswitch_3
        0x38af4125 -> :sswitch_2
        0x38b30be5 -> :sswitch_1
        0x7bdc8385 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private x(Ll8/j;)Lt4/i;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ll8/j;",
            ")",
            "Lt4/i<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    new-instance v0, Lt4/j;

    invoke-direct {v0}, Lt4/j;-><init>()V

    sget-object v1, Lio/flutter/plugins/firebase/core/FlutterFirebasePlugin;->cachedThreadPool:Ljava/util/concurrent/ExecutorService;

    new-instance v2, Lq8/b;

    invoke-direct {v2, p1, v0}, Lq8/b;-><init>(Ll8/j;Lt4/j;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Lt4/j;->a()Lt4/i;

    move-result-object p1

    return-object p1
.end method

.method private y(Ll8/j;)Lt4/i;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ll8/j;",
            ")",
            "Lt4/i<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    new-instance v0, Lt4/j;

    invoke-direct {v0}, Lt4/j;-><init>()V

    sget-object v1, Lio/flutter/plugins/firebase/core/FlutterFirebasePlugin;->cachedThreadPool:Ljava/util/concurrent/ExecutorService;

    new-instance v2, Lq8/d;

    invoke-direct {v2, p1, v0}, Lq8/d;-><init>(Ll8/j;Lt4/j;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Lt4/j;->a()Lt4/i;

    move-result-object p1

    return-object p1
.end method

.method private z(Ll8/j;)Lt4/i;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ll8/j;",
            ")",
            "Lt4/i<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    new-instance v0, Lt4/j;

    invoke-direct {v0}, Lt4/j;-><init>()V

    sget-object v1, Lio/flutter/plugins/firebase/core/FlutterFirebasePlugin;->cachedThreadPool:Ljava/util/concurrent/ExecutorService;

    new-instance v2, Lq8/e;

    invoke-direct {v2, p1, v0}, Lq8/e;-><init>(Ll8/j;Lt4/j;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Lt4/j;->a()Lt4/i;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public didReinitializeFirebaseCore()Lt4/i;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lt4/i<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    new-instance v0, Lt4/j;

    invoke-direct {v0}, Lt4/j;-><init>()V

    sget-object v1, Lio/flutter/plugins/firebase/core/FlutterFirebasePlugin;->cachedThreadPool:Ljava/util/concurrent/ExecutorService;

    new-instance v2, Lq8/h;

    invoke-direct {v2, v0}, Lq8/h;-><init>(Lt4/j;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Lt4/j;->a()Lt4/i;

    move-result-object v0

    return-object v0
.end method

.method public getPluginConstantsForFirebaseApp(Lf5/e;)Lt4/i;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lf5/e;",
            ")",
            "Lt4/i<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation

    new-instance p1, Lt4/j;

    invoke-direct {p1}, Lt4/j;-><init>()V

    sget-object v0, Lio/flutter/plugins/firebase/core/FlutterFirebasePlugin;->cachedThreadPool:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lq8/f;

    invoke-direct {v1, p0, p1}, Lq8/f;-><init>(Lq8/j;Lt4/j;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    invoke-virtual {p1}, Lt4/j;->a()Lt4/i;

    move-result-object p1

    return-object p1
.end method

.method public onAttachedToEngine(Lc8/a$b;)V
    .locals 0

    invoke-virtual {p1}, Lc8/a$b;->b()Ll8/c;

    move-result-object p1

    invoke-direct {p0, p1}, Lq8/j;->l(Ll8/c;)V

    return-void
.end method

.method public onDetachedFromEngine(Lc8/a$b;)V
    .locals 1

    iget-object p1, p0, Lq8/j;->n:Ll8/k;

    if-eqz p1, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ll8/k;->e(Ll8/k$c;)V

    iput-object v0, p0, Lq8/j;->n:Ll8/k;

    :cond_0
    return-void
.end method

.method public onMethodCall(Ll8/j;Ll8/k$d;)V
    .locals 3

    iget-object v0, p1, Ll8/j;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1

    const/4 v2, -0x1

    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v1, "FirebasePerformance#httpMetricStart"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x5

    goto :goto_0

    :sswitch_1
    const-string v1, "FirebasePerformance#setPerformanceCollectionEnabled"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v2, 0x4

    goto :goto_0

    :sswitch_2
    const-string v1, "FirebasePerformance#isPerformanceCollectionEnabled"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    const/4 v2, 0x3

    goto :goto_0

    :sswitch_3
    const-string v1, "FirebasePerformance#traceStop"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_0

    :cond_3
    const/4 v2, 0x2

    goto :goto_0

    :sswitch_4
    const-string v1, "FirebasePerformance#httpMetricStop"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    goto :goto_0

    :cond_4
    const/4 v2, 0x1

    goto :goto_0

    :sswitch_5
    const-string v1, "FirebasePerformance#traceStart"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    goto :goto_0

    :cond_5
    const/4 v2, 0x0

    :goto_0
    packed-switch v2, :pswitch_data_0

    invoke-interface {p2}, Ll8/k$d;->c()V

    return-void

    :pswitch_0
    invoke-direct {p0, p1}, Lq8/j;->j(Ll8/j;)Lt4/i;

    move-result-object p1

    goto :goto_1

    :pswitch_1
    invoke-direct {p0, p1}, Lq8/j;->x(Ll8/j;)Lt4/i;

    move-result-object p1

    goto :goto_1

    :pswitch_2
    invoke-direct {p0}, Lq8/j;->m()Lt4/i;

    move-result-object p1

    goto :goto_1

    :pswitch_3
    invoke-direct {p0, p1}, Lq8/j;->z(Ll8/j;)Lt4/i;

    move-result-object p1

    goto :goto_1

    :pswitch_4
    invoke-direct {p0, p1}, Lq8/j;->k(Ll8/j;)Lt4/i;

    move-result-object p1

    goto :goto_1

    :pswitch_5
    invoke-direct {p0, p1}, Lq8/j;->y(Ll8/j;)Lt4/i;

    move-result-object p1

    :goto_1
    new-instance v0, Lq8/i;

    invoke-direct {v0, p2}, Lq8/i;-><init>(Ll8/k$d;)V

    invoke-virtual {p1, v0}, Lt4/i;->c(Lt4/d;)Lt4/i;

    return-void

    :sswitch_data_0
    .sparse-switch
        -0x7e63dca9 -> :sswitch_5
        -0x58e2fb4c -> :sswitch_4
        0x14b2766d -> :sswitch_3
        0x246576f7 -> :sswitch_2
        0x325370fb -> :sswitch_1
        0x3c835df0 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
