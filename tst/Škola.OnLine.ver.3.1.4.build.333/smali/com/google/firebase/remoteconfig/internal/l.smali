.class public Lcom/google/firebase/remoteconfig/internal/l;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final e:Ljava/nio/charset/Charset;

.field static final f:Ljava/util/regex/Pattern;

.field static final g:Ljava/util/regex/Pattern;


# instance fields
.field private final a:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Li4/d<",
            "Ljava/lang/String;",
            "Lcom/google/firebase/remoteconfig/internal/e;",
            ">;>;"
        }
    .end annotation
.end field

.field private final b:Ljava/util/concurrent/Executor;

.field private final c:Lcom/google/firebase/remoteconfig/internal/d;

.field private final d:Lcom/google/firebase/remoteconfig/internal/d;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-string v0, "UTF-8"

    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v0

    sput-object v0, Lcom/google/firebase/remoteconfig/internal/l;->e:Ljava/nio/charset/Charset;

    const-string v0, "^(1|true|t|yes|y|on)$"

    const/4 v1, 0x2

    invoke-static {v0, v1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lcom/google/firebase/remoteconfig/internal/l;->f:Ljava/util/regex/Pattern;

    const-string v0, "^(0|false|f|no|n|off|)$"

    invoke-static {v0, v1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lcom/google/firebase/remoteconfig/internal/l;->g:Ljava/util/regex/Pattern;

    return-void
.end method

.method public constructor <init>(Ljava/util/concurrent/Executor;Lcom/google/firebase/remoteconfig/internal/d;Lcom/google/firebase/remoteconfig/internal/d;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/google/firebase/remoteconfig/internal/l;->a:Ljava/util/Set;

    iput-object p1, p0, Lcom/google/firebase/remoteconfig/internal/l;->b:Ljava/util/concurrent/Executor;

    iput-object p2, p0, Lcom/google/firebase/remoteconfig/internal/l;->c:Lcom/google/firebase/remoteconfig/internal/d;

    iput-object p3, p0, Lcom/google/firebase/remoteconfig/internal/l;->d:Lcom/google/firebase/remoteconfig/internal/d;

    return-void
.end method

.method public static synthetic a(Li4/d;Ljava/lang/String;Lcom/google/firebase/remoteconfig/internal/e;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/firebase/remoteconfig/internal/l;->i(Li4/d;Ljava/lang/String;Lcom/google/firebase/remoteconfig/internal/e;)V

    return-void
.end method

.method private c(Ljava/lang/String;Lcom/google/firebase/remoteconfig/internal/e;)V
    .locals 5

    if-nez p2, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/firebase/remoteconfig/internal/l;->a:Ljava/util/Set;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/google/firebase/remoteconfig/internal/l;->a:Ljava/util/Set;

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li4/d;

    iget-object v3, p0, Lcom/google/firebase/remoteconfig/internal/l;->b:Ljava/util/concurrent/Executor;

    new-instance v4, Lcom/google/firebase/remoteconfig/internal/k;

    invoke-direct {v4, v2, p1, p2}, Lcom/google/firebase/remoteconfig/internal/k;-><init>(Li4/d;Ljava/lang/String;Lcom/google/firebase/remoteconfig/internal/e;)V

    invoke-interface {v3, v4}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    goto :goto_0

    :cond_1
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method private static e(Lcom/google/firebase/remoteconfig/internal/d;)Lcom/google/firebase/remoteconfig/internal/e;
    .locals 0

    invoke-virtual {p0}, Lcom/google/firebase/remoteconfig/internal/d;->f()Lcom/google/firebase/remoteconfig/internal/e;

    move-result-object p0

    return-object p0
.end method

.method private static f(Lcom/google/firebase/remoteconfig/internal/d;)Ljava/util/Set;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/firebase/remoteconfig/internal/d;",
            ")",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    invoke-static {p0}, Lcom/google/firebase/remoteconfig/internal/l;->e(Lcom/google/firebase/remoteconfig/internal/d;)Lcom/google/firebase/remoteconfig/internal/e;

    move-result-object p0

    if-nez p0, :cond_0

    return-object v0

    :cond_0
    invoke-virtual {p0}, Lcom/google/firebase/remoteconfig/internal/e;->d()Lorg/json/JSONObject;

    move-result-object p0

    invoke-virtual {p0}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method private static g(Lcom/google/firebase/remoteconfig/internal/d;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    invoke-static {p0}, Lcom/google/firebase/remoteconfig/internal/l;->e(Lcom/google/firebase/remoteconfig/internal/d;)Lcom/google/firebase/remoteconfig/internal/e;

    move-result-object p0

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return-object v0

    :cond_0
    :try_start_0
    invoke-virtual {p0}, Lcom/google/firebase/remoteconfig/internal/e;->d()Lorg/json/JSONObject;

    move-result-object p0

    invoke-virtual {p0, p1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    return-object v0
.end method

.method private static synthetic i(Li4/d;Ljava/lang/String;Lcom/google/firebase/remoteconfig/internal/e;)V
    .locals 0

    invoke-interface {p0, p1, p2}, Li4/d;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method private static j(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    const/4 p1, 0x1

    aput-object p0, v0, p1

    const-string p0, "No value of type \'%s\' exists for parameter key \'%s\'."

    invoke-static {p0, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    const-string p1, "FirebaseRemoteConfig"

    invoke-static {p1, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method


# virtual methods
.method public b(Li4/d;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Li4/d<",
            "Ljava/lang/String;",
            "Lcom/google/firebase/remoteconfig/internal/e;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/firebase/remoteconfig/internal/l;->a:Ljava/util/Set;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/google/firebase/remoteconfig/internal/l;->a:Ljava/util/Set;

    invoke-interface {v1, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public d()Ljava/util/Map;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Li7/k;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iget-object v1, p0, Lcom/google/firebase/remoteconfig/internal/l;->c:Lcom/google/firebase/remoteconfig/internal/d;

    invoke-static {v1}, Lcom/google/firebase/remoteconfig/internal/l;->f(Lcom/google/firebase/remoteconfig/internal/d;)Ljava/util/Set;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    iget-object v1, p0, Lcom/google/firebase/remoteconfig/internal/l;->d:Lcom/google/firebase/remoteconfig/internal/d;

    invoke-static {v1}, Lcom/google/firebase/remoteconfig/internal/l;->f(Lcom/google/firebase/remoteconfig/internal/d;)Ljava/util/Set;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {p0, v2}, Lcom/google/firebase/remoteconfig/internal/l;->h(Ljava/lang/String;)Li7/k;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    return-object v1
.end method

.method public h(Ljava/lang/String;)Li7/k;
    .locals 2

    iget-object v0, p0, Lcom/google/firebase/remoteconfig/internal/l;->c:Lcom/google/firebase/remoteconfig/internal/d;

    invoke-static {v0, p1}, Lcom/google/firebase/remoteconfig/internal/l;->g(Lcom/google/firebase/remoteconfig/internal/d;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/google/firebase/remoteconfig/internal/l;->c:Lcom/google/firebase/remoteconfig/internal/d;

    invoke-static {v1}, Lcom/google/firebase/remoteconfig/internal/l;->e(Lcom/google/firebase/remoteconfig/internal/d;)Lcom/google/firebase/remoteconfig/internal/e;

    move-result-object v1

    invoke-direct {p0, p1, v1}, Lcom/google/firebase/remoteconfig/internal/l;->c(Ljava/lang/String;Lcom/google/firebase/remoteconfig/internal/e;)V

    new-instance p1, Lcom/google/firebase/remoteconfig/internal/p;

    const/4 v1, 0x2

    invoke-direct {p1, v0, v1}, Lcom/google/firebase/remoteconfig/internal/p;-><init>(Ljava/lang/String;I)V

    return-object p1

    :cond_0
    iget-object v0, p0, Lcom/google/firebase/remoteconfig/internal/l;->d:Lcom/google/firebase/remoteconfig/internal/d;

    invoke-static {v0, p1}, Lcom/google/firebase/remoteconfig/internal/l;->g(Lcom/google/firebase/remoteconfig/internal/d;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    new-instance p1, Lcom/google/firebase/remoteconfig/internal/p;

    const/4 v1, 0x1

    invoke-direct {p1, v0, v1}, Lcom/google/firebase/remoteconfig/internal/p;-><init>(Ljava/lang/String;I)V

    return-object p1

    :cond_1
    const-string v0, "FirebaseRemoteConfigValue"

    invoke-static {p1, v0}, Lcom/google/firebase/remoteconfig/internal/l;->j(Ljava/lang/String;Ljava/lang/String;)V

    new-instance p1, Lcom/google/firebase/remoteconfig/internal/p;

    const/4 v0, 0x0

    const-string v1, ""

    invoke-direct {p1, v1, v0}, Lcom/google/firebase/remoteconfig/internal/p;-><init>(Ljava/lang/String;I)V

    return-object p1
.end method
