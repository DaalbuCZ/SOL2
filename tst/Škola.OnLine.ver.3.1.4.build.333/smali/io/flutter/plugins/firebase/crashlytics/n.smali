.class public Lio/flutter/plugins/firebase/crashlytics/n;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lio/flutter/plugins/firebase/core/FlutterFirebasePlugin;
.implements Lk8/a;
.implements Lt8/k$c;


# instance fields
.field private n:Lt8/k;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static synthetic A(Ly4/j;)V
    .locals 1

    const/4 v0, 0x0

    :try_start_0
    invoke-virtual {p0, v0}, Ly4/j;->c(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-virtual {p0, v0}, Ly4/j;->b(Ljava/lang/Exception;)V

    :goto_0
    return-void
.end method

.method private synthetic B(Ly4/j;Lk5/e;)V
    .locals 1

    :try_start_0
    new-instance v0, Lio/flutter/plugins/firebase/crashlytics/n$d;

    invoke-direct {v0, p0, p2}, Lio/flutter/plugins/firebase/crashlytics/n$d;-><init>(Lio/flutter/plugins/firebase/crashlytics/n;Lk5/e;)V

    invoke-virtual {p1, v0}, Ly4/j;->c(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p2

    invoke-virtual {p1, p2}, Ly4/j;->b(Ljava/lang/Exception;)V

    :goto_0
    return-void
.end method

.method private static synthetic C(Ljava/util/Map;Ly4/j;)V
    .locals 1

    :try_start_0
    const-string v0, "message"

    invoke-interface {p0, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast p0, Ljava/lang/String;

    invoke-static {}, Lcom/google/firebase/crashlytics/a;->d()Lcom/google/firebase/crashlytics/a;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/google/firebase/crashlytics/a;->f(Ljava/lang/String;)V

    const/4 p0, 0x0

    invoke-virtual {p1, p0}, Ly4/j;->c(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p0

    invoke-virtual {p1, p0}, Ly4/j;->b(Ljava/lang/Exception;)V

    :goto_0
    return-void
.end method

.method private static synthetic D(Lt8/k$d;Ly4/i;)V
    .locals 2

    invoke-virtual {p1}, Ly4/i;->p()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Ly4/i;->l()Ljava/lang/Object;

    move-result-object p1

    invoke-interface {p0, p1}, Lt8/k$d;->a(Ljava/lang/Object;)V

    goto :goto_1

    :cond_0
    invoke-virtual {p1}, Ly4/i;->k()Ljava/lang/Exception;

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

    invoke-interface {p0, v1, p1, v0}, Lt8/k$d;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    :goto_1
    return-void
.end method

.method private synthetic E(Ljava/util/Map;Ly4/j;)V
    .locals 8

    :try_start_0
    invoke-static {}, Lcom/google/firebase/crashlytics/a;->d()Lcom/google/firebase/crashlytics/a;

    move-result-object v0

    const-string v1, "exception"

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    const-string v2, "reason"

    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    const-string v3, "information"

    invoke-interface {p1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v3, Ljava/lang/String;

    const-string v4, "fatal"

    invoke-interface {p1, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    invoke-static {v4}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v4, Ljava/lang/Boolean;

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    const-string v5, "buildId"

    invoke-interface {p1, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    invoke-static {v5}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v5, Ljava/lang/String;

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v6

    if-lez v6, :cond_0

    invoke-static {v5}, Lcom/google/firebase/crashlytics/b;->b(Ljava/lang/String;)V

    :cond_0
    if-eqz v2, :cond_1

    const-string v5, "flutter_error_reason"

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "thrown "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0, v5, v6}, Lcom/google/firebase/crashlytics/a;->k(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v5, Lio/flutter/plugins/firebase/crashlytics/FlutterError;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v7, ". Error thrown "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "."

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v5, v2}, Lio/flutter/plugins/firebase/crashlytics/FlutterError;-><init>(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    new-instance v5, Lio/flutter/plugins/firebase/crashlytics/FlutterError;

    invoke-direct {v5, v1}, Lio/flutter/plugins/firebase/crashlytics/FlutterError;-><init>(Ljava/lang/String;)V

    :goto_0
    const-string v2, "flutter_error_exception"

    invoke-virtual {v0, v2, v1}, Lcom/google/firebase/crashlytics/a;->k(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    const-string v2, "stackTraceElements"

    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast p1, Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_2
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map;

    invoke-direct {p0, v2}, Lio/flutter/plugins/firebase/crashlytics/n;->s(Ljava/util/Map;)Ljava/lang/StackTraceElement;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_3
    const/4 p1, 0x0

    new-array p1, p1, [Ljava/lang/StackTraceElement;

    invoke-interface {v1, p1}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ljava/lang/StackTraceElement;

    invoke-virtual {v5, p1}, Ljava/lang/Exception;->setStackTrace([Ljava/lang/StackTraceElement;)V

    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_4

    invoke-virtual {v0, v3}, Lcom/google/firebase/crashlytics/a;->f(Ljava/lang/String;)V

    :cond_4
    if-eqz v4, :cond_5

    invoke-static {v5}, Lcom/google/firebase/crashlytics/b;->a(Ljava/lang/Throwable;)V

    goto :goto_2

    :cond_5
    invoke-virtual {v0, v5}, Lcom/google/firebase/crashlytics/a;->g(Ljava/lang/Throwable;)V

    :goto_2
    const/4 p1, 0x0

    invoke-virtual {p2, p1}, Ly4/j;->c(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3

    :catch_0
    move-exception p1

    invoke-virtual {p2, p1}, Ly4/j;->b(Ljava/lang/Exception;)V

    :goto_3
    return-void
.end method

.method private static synthetic F(Ly4/j;)V
    .locals 1

    :try_start_0
    invoke-static {}, Lcom/google/firebase/crashlytics/a;->d()Lcom/google/firebase/crashlytics/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/firebase/crashlytics/a;->h()V

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Ly4/j;->c(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-virtual {p0, v0}, Ly4/j;->b(Ljava/lang/Exception;)V

    :goto_0
    return-void
.end method

.method private synthetic G(Ljava/util/Map;Ly4/j;)V
    .locals 1

    :try_start_0
    const-string v0, "enabled"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast p1, Ljava/lang/Boolean;

    invoke-static {}, Lcom/google/firebase/crashlytics/a;->d()Lcom/google/firebase/crashlytics/a;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/firebase/crashlytics/a;->i(Ljava/lang/Boolean;)V

    new-instance p1, Lio/flutter/plugins/firebase/crashlytics/n$c;

    invoke-direct {p1, p0}, Lio/flutter/plugins/firebase/crashlytics/n$c;-><init>(Lio/flutter/plugins/firebase/crashlytics/n;)V

    invoke-virtual {p2, p1}, Ly4/j;->c(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    invoke-virtual {p2, p1}, Ly4/j;->b(Ljava/lang/Exception;)V

    :goto_0
    return-void
.end method

.method private static synthetic H(Ljava/util/Map;Ly4/j;)V
    .locals 2

    :try_start_0
    const-string v0, "key"

    invoke-interface {p0, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    const-string v1, "value"

    invoke-interface {p0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast p0, Ljava/lang/String;

    invoke-static {}, Lcom/google/firebase/crashlytics/a;->d()Lcom/google/firebase/crashlytics/a;

    move-result-object v1

    invoke-virtual {v1, v0, p0}, Lcom/google/firebase/crashlytics/a;->k(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p0, 0x0

    invoke-virtual {p1, p0}, Ly4/j;->c(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p0

    invoke-virtual {p1, p0}, Ly4/j;->b(Ljava/lang/Exception;)V

    :goto_0
    return-void
.end method

.method private static synthetic I(Ljava/util/Map;Ly4/j;)V
    .locals 1

    :try_start_0
    const-string v0, "identifier"

    invoke-interface {p0, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast p0, Ljava/lang/String;

    invoke-static {}, Lcom/google/firebase/crashlytics/a;->d()Lcom/google/firebase/crashlytics/a;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/google/firebase/crashlytics/a;->l(Ljava/lang/String;)V

    const/4 p0, 0x0

    invoke-virtual {p1, p0}, Ly4/j;->c(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p0

    invoke-virtual {p1, p0}, Ly4/j;->b(Ljava/lang/Exception;)V

    :goto_0
    return-void
.end method

.method private J(Ljava/util/Map;)Ly4/i;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Ly4/i<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    new-instance v0, Ly4/j;

    invoke-direct {v0}, Ly4/j;-><init>()V

    sget-object v1, Lio/flutter/plugins/firebase/core/FlutterFirebasePlugin;->cachedThreadPool:Ljava/util/concurrent/ExecutorService;

    new-instance v2, Lio/flutter/plugins/firebase/crashlytics/j;

    invoke-direct {v2, p1, v0}, Lio/flutter/plugins/firebase/crashlytics/j;-><init>(Ljava/util/Map;Ly4/j;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Ly4/j;->a()Ly4/i;

    move-result-object p1

    return-object p1
.end method

.method private K(Ljava/util/Map;)Ly4/i;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Ly4/i<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    new-instance v0, Ly4/j;

    invoke-direct {v0}, Ly4/j;-><init>()V

    sget-object v1, Lio/flutter/plugins/firebase/core/FlutterFirebasePlugin;->cachedThreadPool:Ljava/util/concurrent/ExecutorService;

    new-instance v2, Lio/flutter/plugins/firebase/crashlytics/a;

    invoke-direct {v2, p0, p1, v0}, Lio/flutter/plugins/firebase/crashlytics/a;-><init>(Lio/flutter/plugins/firebase/crashlytics/n;Ljava/util/Map;Ly4/j;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Ly4/j;->a()Ly4/i;

    move-result-object p1

    return-object p1
.end method

.method private L()Ly4/i;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ly4/i<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    new-instance v0, Ly4/j;

    invoke-direct {v0}, Ly4/j;-><init>()V

    sget-object v1, Lio/flutter/plugins/firebase/core/FlutterFirebasePlugin;->cachedThreadPool:Ljava/util/concurrent/ExecutorService;

    new-instance v2, Lio/flutter/plugins/firebase/crashlytics/m;

    invoke-direct {v2, v0}, Lio/flutter/plugins/firebase/crashlytics/m;-><init>(Ly4/j;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Ly4/j;->a()Ly4/i;

    move-result-object v0

    return-object v0
.end method

.method private M(Ljava/util/Map;)Ly4/i;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Ly4/i<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation

    new-instance v0, Ly4/j;

    invoke-direct {v0}, Ly4/j;-><init>()V

    sget-object v1, Lio/flutter/plugins/firebase/core/FlutterFirebasePlugin;->cachedThreadPool:Ljava/util/concurrent/ExecutorService;

    new-instance v2, Lio/flutter/plugins/firebase/crashlytics/e;

    invoke-direct {v2, p0, p1, v0}, Lio/flutter/plugins/firebase/crashlytics/e;-><init>(Lio/flutter/plugins/firebase/crashlytics/n;Ljava/util/Map;Ly4/j;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Ly4/j;->a()Ly4/i;

    move-result-object p1

    return-object p1
.end method

.method private N(Ljava/util/Map;)Ly4/i;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Ly4/i<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    new-instance v0, Ly4/j;

    invoke-direct {v0}, Ly4/j;-><init>()V

    sget-object v1, Lio/flutter/plugins/firebase/core/FlutterFirebasePlugin;->cachedThreadPool:Ljava/util/concurrent/ExecutorService;

    new-instance v2, Lio/flutter/plugins/firebase/crashlytics/k;

    invoke-direct {v2, p1, v0}, Lio/flutter/plugins/firebase/crashlytics/k;-><init>(Ljava/util/Map;Ly4/j;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Ly4/j;->a()Ly4/i;

    move-result-object p1

    return-object p1
.end method

.method private O(Ljava/util/Map;)Ly4/i;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Ly4/i<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    new-instance v0, Ly4/j;

    invoke-direct {v0}, Ly4/j;-><init>()V

    sget-object v1, Lio/flutter/plugins/firebase/core/FlutterFirebasePlugin;->cachedThreadPool:Ljava/util/concurrent/ExecutorService;

    new-instance v2, Lio/flutter/plugins/firebase/crashlytics/i;

    invoke-direct {v2, p1, v0}, Lio/flutter/plugins/firebase/crashlytics/i;-><init>(Ljava/util/Map;Ly4/j;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Ly4/j;->a()Ly4/i;

    move-result-object p1

    return-object p1
.end method

.method public static synthetic a(Ly4/j;)V
    .locals 0

    invoke-static {p0}, Lio/flutter/plugins/firebase/crashlytics/n;->A(Ly4/j;)V

    return-void
.end method

.method public static synthetic b(Ljava/util/Map;Ly4/j;)V
    .locals 0

    invoke-static {p0, p1}, Lio/flutter/plugins/firebase/crashlytics/n;->I(Ljava/util/Map;Ly4/j;)V

    return-void
.end method

.method public static synthetic c(Lt8/k$d;Ly4/i;)V
    .locals 0

    invoke-static {p0, p1}, Lio/flutter/plugins/firebase/crashlytics/n;->D(Lt8/k$d;Ly4/i;)V

    return-void
.end method

.method public static synthetic d(Ljava/util/Map;Ly4/j;)V
    .locals 0

    invoke-static {p0, p1}, Lio/flutter/plugins/firebase/crashlytics/n;->C(Ljava/util/Map;Ly4/j;)V

    return-void
.end method

.method public static synthetic e(Ljava/util/Map;Ly4/j;)V
    .locals 0

    invoke-static {p0, p1}, Lio/flutter/plugins/firebase/crashlytics/n;->H(Ljava/util/Map;Ly4/j;)V

    return-void
.end method

.method public static synthetic f()V
    .locals 0

    invoke-static {}, Lio/flutter/plugins/firebase/crashlytics/n;->x()V

    return-void
.end method

.method public static synthetic g(Lio/flutter/plugins/firebase/crashlytics/n;Ly4/j;)V
    .locals 0

    invoke-direct {p0, p1}, Lio/flutter/plugins/firebase/crashlytics/n;->z(Ly4/j;)V

    return-void
.end method

.method public static synthetic h(Lio/flutter/plugins/firebase/crashlytics/n;Ljava/util/Map;Ly4/j;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lio/flutter/plugins/firebase/crashlytics/n;->E(Ljava/util/Map;Ly4/j;)V

    return-void
.end method

.method public static synthetic i(Lio/flutter/plugins/firebase/crashlytics/n;Ly4/j;)V
    .locals 0

    invoke-direct {p0, p1}, Lio/flutter/plugins/firebase/crashlytics/n;->w(Ly4/j;)V

    return-void
.end method

.method public static synthetic j(Lio/flutter/plugins/firebase/crashlytics/n;Ljava/util/Map;Ly4/j;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lio/flutter/plugins/firebase/crashlytics/n;->G(Ljava/util/Map;Ly4/j;)V

    return-void
.end method

.method public static synthetic k(Ly4/j;)V
    .locals 0

    invoke-static {p0}, Lio/flutter/plugins/firebase/crashlytics/n;->F(Ly4/j;)V

    return-void
.end method

.method public static synthetic l(Lio/flutter/plugins/firebase/crashlytics/n;Ly4/j;Lk5/e;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lio/flutter/plugins/firebase/crashlytics/n;->B(Ly4/j;Lk5/e;)V

    return-void
.end method

.method public static synthetic m(Ly4/j;)V
    .locals 0

    invoke-static {p0}, Lio/flutter/plugins/firebase/crashlytics/n;->y(Ly4/j;)V

    return-void
.end method

.method static synthetic n(Lio/flutter/plugins/firebase/crashlytics/n;Lk5/e;)Z
    .locals 0

    invoke-direct {p0, p1}, Lio/flutter/plugins/firebase/crashlytics/n;->v(Lk5/e;)Z

    move-result p0

    return p0
.end method

.method private o()Ly4/i;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ly4/i<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation

    new-instance v0, Ly4/j;

    invoke-direct {v0}, Ly4/j;-><init>()V

    sget-object v1, Lio/flutter/plugins/firebase/core/FlutterFirebasePlugin;->cachedThreadPool:Ljava/util/concurrent/ExecutorService;

    new-instance v2, Lio/flutter/plugins/firebase/crashlytics/g;

    invoke-direct {v2, p0, v0}, Lio/flutter/plugins/firebase/crashlytics/g;-><init>(Lio/flutter/plugins/firebase/crashlytics/n;Ly4/j;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Ly4/j;->a()Ly4/i;

    move-result-object v0

    return-object v0
.end method

.method private p()V
    .locals 4

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    sget-object v1, Lio/flutter/plugins/firebase/crashlytics/c;->n:Lio/flutter/plugins/firebase/crashlytics/c;

    const-wide/16 v2, 0x32

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method private q()Ly4/i;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ly4/i<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    new-instance v0, Ly4/j;

    invoke-direct {v0}, Ly4/j;-><init>()V

    sget-object v1, Lio/flutter/plugins/firebase/core/FlutterFirebasePlugin;->cachedThreadPool:Ljava/util/concurrent/ExecutorService;

    new-instance v2, Lio/flutter/plugins/firebase/crashlytics/b;

    invoke-direct {v2, v0}, Lio/flutter/plugins/firebase/crashlytics/b;-><init>(Ly4/j;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Ly4/j;->a()Ly4/i;

    move-result-object v0

    return-object v0
.end method

.method private r()Ly4/i;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ly4/i<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation

    new-instance v0, Ly4/j;

    invoke-direct {v0}, Ly4/j;-><init>()V

    sget-object v1, Lio/flutter/plugins/firebase/core/FlutterFirebasePlugin;->cachedThreadPool:Ljava/util/concurrent/ExecutorService;

    new-instance v2, Lio/flutter/plugins/firebase/crashlytics/f;

    invoke-direct {v2, p0, v0}, Lio/flutter/plugins/firebase/crashlytics/f;-><init>(Lio/flutter/plugins/firebase/crashlytics/n;Ly4/j;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Ly4/j;->a()Ly4/i;

    move-result-object v0

    return-object v0
.end method

.method private s(Ljava/util/Map;)Ljava/lang/StackTraceElement;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/StackTraceElement;"
        }
    .end annotation

    :try_start_0
    const-string v0, "file"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const-string v1, "line"

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    const-string v2, "class"

    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    const-string v3, "method"

    invoke-interface {p1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    new-instance v3, Ljava/lang/StackTraceElement;

    if-nez v2, :cond_0

    const-string v2, ""

    :cond_0
    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    invoke-direct {v3, v2, p1, v0, v1}, Ljava/lang/StackTraceElement;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v3

    :catch_0
    const-string p1, "FLTFirebaseCrashlytics"

    const-string v0, "Unable to generate stack trace element from Dart error."

    invoke-static {p1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    const/4 p1, 0x0

    return-object p1
.end method

.method private t(Landroid/content/Context;)Landroid/content/SharedPreferences;
    .locals 2

    const-string v0, "com.google.firebase.crashlytics"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p1

    return-object p1
.end method

.method private u(Lt8/c;)V
    .locals 2

    new-instance v0, Lt8/k;

    const-string v1, "plugins.flutter.io/firebase_crashlytics"

    invoke-direct {v0, p1, v1}, Lt8/k;-><init>(Lt8/c;Ljava/lang/String;)V

    iput-object v0, p0, Lio/flutter/plugins/firebase/crashlytics/n;->n:Lt8/k;

    invoke-virtual {v0, p0}, Lt8/k;->e(Lt8/k$c;)V

    invoke-static {v1, p0}, Lio/flutter/plugins/firebase/core/FlutterFirebasePluginRegistry;->registerPlugin(Ljava/lang/String;Lio/flutter/plugins/firebase/core/FlutterFirebasePlugin;)V

    return-void
.end method

.method private v(Lk5/e;)Z
    .locals 4

    invoke-virtual {p1}, Lk5/e;->l()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p0, v0}, Lio/flutter/plugins/firebase/crashlytics/n;->t(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v1, "firebase_crashlytics_collection_enabled"

    invoke-interface {v0, v1}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    move-result v2

    const/4 v3, 0x1

    if-eqz v2, :cond_0

    invoke-interface {v0, v1, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v3

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lk5/e;->w()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-static {}, Lcom/google/firebase/crashlytics/a;->d()Lcom/google/firebase/crashlytics/a;

    move-result-object p1

    invoke-virtual {p1, v3}, Lcom/google/firebase/crashlytics/a;->j(Z)V

    goto :goto_0

    :cond_1
    const/4 v3, 0x0

    :goto_0
    return v3
.end method

.method private synthetic w(Ly4/j;)V
    .locals 2

    :try_start_0
    invoke-static {}, Lcom/google/firebase/crashlytics/a;->d()Lcom/google/firebase/crashlytics/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/firebase/crashlytics/a;->a()Ly4/i;

    move-result-object v0

    invoke-static {v0}, Ly4/l;->a(Ly4/i;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    new-instance v1, Lio/flutter/plugins/firebase/crashlytics/n$a;

    invoke-direct {v1, p0, v0}, Lio/flutter/plugins/firebase/crashlytics/n$a;-><init>(Lio/flutter/plugins/firebase/crashlytics/n;Z)V

    invoke-virtual {p1, v1}, Ly4/j;->c(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-virtual {p1, v0}, Ly4/j;->b(Ljava/lang/Exception;)V

    :goto_0
    return-void
.end method

.method private static synthetic x()V
    .locals 1

    new-instance v0, Lio/flutter/plugins/firebase/crashlytics/FirebaseCrashlyticsTestCrash;

    invoke-direct {v0}, Lio/flutter/plugins/firebase/crashlytics/FirebaseCrashlyticsTestCrash;-><init>()V

    throw v0
.end method

.method private static synthetic y(Ly4/j;)V
    .locals 1

    :try_start_0
    invoke-static {}, Lcom/google/firebase/crashlytics/a;->d()Lcom/google/firebase/crashlytics/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/firebase/crashlytics/a;->b()V

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Ly4/j;->c(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-virtual {p0, v0}, Ly4/j;->b(Ljava/lang/Exception;)V

    :goto_0
    return-void
.end method

.method private synthetic z(Ly4/j;)V
    .locals 2

    :try_start_0
    invoke-static {}, Lcom/google/firebase/crashlytics/a;->d()Lcom/google/firebase/crashlytics/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/firebase/crashlytics/a;->c()Z

    move-result v0

    new-instance v1, Lio/flutter/plugins/firebase/crashlytics/n$b;

    invoke-direct {v1, p0, v0}, Lio/flutter/plugins/firebase/crashlytics/n$b;-><init>(Lio/flutter/plugins/firebase/crashlytics/n;Z)V

    invoke-virtual {p1, v1}, Ly4/j;->c(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-virtual {p1, v0}, Ly4/j;->b(Ljava/lang/Exception;)V

    :goto_0
    return-void
.end method


# virtual methods
.method public didReinitializeFirebaseCore()Ly4/i;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ly4/i<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    new-instance v0, Ly4/j;

    invoke-direct {v0}, Ly4/j;-><init>()V

    sget-object v1, Lio/flutter/plugins/firebase/core/FlutterFirebasePlugin;->cachedThreadPool:Ljava/util/concurrent/ExecutorService;

    new-instance v2, Lio/flutter/plugins/firebase/crashlytics/l;

    invoke-direct {v2, v0}, Lio/flutter/plugins/firebase/crashlytics/l;-><init>(Ly4/j;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Ly4/j;->a()Ly4/i;

    move-result-object v0

    return-object v0
.end method

.method public getPluginConstantsForFirebaseApp(Lk5/e;)Ly4/i;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lk5/e;",
            ")",
            "Ly4/i<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation

    new-instance v0, Ly4/j;

    invoke-direct {v0}, Ly4/j;-><init>()V

    sget-object v1, Lio/flutter/plugins/firebase/core/FlutterFirebasePlugin;->cachedThreadPool:Ljava/util/concurrent/ExecutorService;

    new-instance v2, Lio/flutter/plugins/firebase/crashlytics/h;

    invoke-direct {v2, p0, v0, p1}, Lio/flutter/plugins/firebase/crashlytics/h;-><init>(Lio/flutter/plugins/firebase/crashlytics/n;Ly4/j;Lk5/e;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Ly4/j;->a()Ly4/i;

    move-result-object p1

    return-object p1
.end method

.method public onAttachedToEngine(Lk8/a$b;)V
    .locals 0

    invoke-virtual {p1}, Lk8/a$b;->b()Lt8/c;

    move-result-object p1

    invoke-direct {p0, p1}, Lio/flutter/plugins/firebase/crashlytics/n;->u(Lt8/c;)V

    return-void
.end method

.method public onDetachedFromEngine(Lk8/a$b;)V
    .locals 1

    iget-object p1, p0, Lio/flutter/plugins/firebase/crashlytics/n;->n:Lt8/k;

    if-eqz p1, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lt8/k;->e(Lt8/k$c;)V

    iput-object v0, p0, Lio/flutter/plugins/firebase/crashlytics/n;->n:Lt8/k;

    :cond_0
    return-void
.end method

.method public onMethodCall(Lt8/j;Lt8/k$d;)V
    .locals 3

    iget-object v0, p1, Lt8/j;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1

    const/4 v2, -0x1

    sparse-switch v1, :sswitch_data_0

    goto/16 :goto_0

    :sswitch_0
    const-string v1, "Crashlytics#crash"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_0

    :cond_0
    const/16 v2, 0x9

    goto/16 :goto_0

    :sswitch_1
    const-string v1, "Crashlytics#setUserIdentifier"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto/16 :goto_0

    :cond_1
    const/16 v2, 0x8

    goto/16 :goto_0

    :sswitch_2
    const-string v1, "Crashlytics#deleteUnsentReports"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    const/4 v2, 0x7

    goto :goto_0

    :sswitch_3
    const-string v1, "Crashlytics#setCustomKey"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_0

    :cond_3
    const/4 v2, 0x6

    goto :goto_0

    :sswitch_4
    const-string v1, "Crashlytics#log"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    goto :goto_0

    :cond_4
    const/4 v2, 0x5

    goto :goto_0

    :sswitch_5
    const-string v1, "Crashlytics#setCrashlyticsCollectionEnabled"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    goto :goto_0

    :cond_5
    const/4 v2, 0x4

    goto :goto_0

    :sswitch_6
    const-string v1, "Crashlytics#sendUnsentReports"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    goto :goto_0

    :cond_6
    const/4 v2, 0x3

    goto :goto_0

    :sswitch_7
    const-string v1, "Crashlytics#checkForUnsentReports"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7

    goto :goto_0

    :cond_7
    const/4 v2, 0x2

    goto :goto_0

    :sswitch_8
    const-string v1, "Crashlytics#recordError"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_8

    goto :goto_0

    :cond_8
    const/4 v2, 0x1

    goto :goto_0

    :sswitch_9
    const-string v1, "Crashlytics#didCrashOnPreviousExecution"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_9

    goto :goto_0

    :cond_9
    const/4 v2, 0x0

    :goto_0
    packed-switch v2, :pswitch_data_0

    invoke-interface {p2}, Lt8/k$d;->c()V

    return-void

    :pswitch_0
    invoke-direct {p0}, Lio/flutter/plugins/firebase/crashlytics/n;->p()V

    return-void

    :pswitch_1
    invoke-virtual {p1}, Lt8/j;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map;

    invoke-direct {p0, p1}, Lio/flutter/plugins/firebase/crashlytics/n;->O(Ljava/util/Map;)Ly4/i;

    move-result-object p1

    goto :goto_1

    :pswitch_2
    invoke-direct {p0}, Lio/flutter/plugins/firebase/crashlytics/n;->q()Ly4/i;

    move-result-object p1

    goto :goto_1

    :pswitch_3
    invoke-virtual {p1}, Lt8/j;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map;

    invoke-direct {p0, p1}, Lio/flutter/plugins/firebase/crashlytics/n;->N(Ljava/util/Map;)Ly4/i;

    move-result-object p1

    goto :goto_1

    :pswitch_4
    invoke-virtual {p1}, Lt8/j;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map;

    invoke-direct {p0, p1}, Lio/flutter/plugins/firebase/crashlytics/n;->J(Ljava/util/Map;)Ly4/i;

    move-result-object p1

    goto :goto_1

    :pswitch_5
    invoke-virtual {p1}, Lt8/j;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map;

    invoke-direct {p0, p1}, Lio/flutter/plugins/firebase/crashlytics/n;->M(Ljava/util/Map;)Ly4/i;

    move-result-object p1

    goto :goto_1

    :pswitch_6
    invoke-direct {p0}, Lio/flutter/plugins/firebase/crashlytics/n;->L()Ly4/i;

    move-result-object p1

    goto :goto_1

    :pswitch_7
    invoke-direct {p0}, Lio/flutter/plugins/firebase/crashlytics/n;->o()Ly4/i;

    move-result-object p1

    goto :goto_1

    :pswitch_8
    invoke-virtual {p1}, Lt8/j;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map;

    invoke-direct {p0, p1}, Lio/flutter/plugins/firebase/crashlytics/n;->K(Ljava/util/Map;)Ly4/i;

    move-result-object p1

    goto :goto_1

    :pswitch_9
    invoke-direct {p0}, Lio/flutter/plugins/firebase/crashlytics/n;->r()Ly4/i;

    move-result-object p1

    :goto_1
    new-instance v0, Lio/flutter/plugins/firebase/crashlytics/d;

    invoke-direct {v0, p2}, Lio/flutter/plugins/firebase/crashlytics/d;-><init>(Lt8/k$d;)V

    invoke-virtual {p1, v0}, Ly4/i;->c(Ly4/d;)Ly4/i;

    return-void

    :sswitch_data_0
    .sparse-switch
        -0x7cdea050 -> :sswitch_9
        -0x55a94e53 -> :sswitch_8
        -0x3d1a385d -> :sswitch_7
        -0x19517ae4 -> :sswitch_6
        -0x6725b5e -> :sswitch_5
        0x1acaaba -> :sswitch_4
        0x6764836 -> :sswitch_3
        0xcbbba59 -> :sswitch_2
        0x288568cc -> :sswitch_1
        0x48af659d -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_9
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
