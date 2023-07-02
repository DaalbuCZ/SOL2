.class public Ld9/t;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lk8/a;
.implements Ld9/b$b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ld9/t$a;,
        Ld9/t$b;,
        Ld9/t$c;
    }
.end annotation


# instance fields
.field private final n:Landroid/util/LongSparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/LongSparseArray<",
            "Ld9/p;",
            ">;"
        }
    .end annotation
.end field

.field private o:Ld9/t$a;

.field private p:Ld9/q;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroid/util/LongSparseArray;

    invoke-direct {v0}, Landroid/util/LongSparseArray;-><init>()V

    iput-object v0, p0, Ld9/t;->n:Landroid/util/LongSparseArray;

    new-instance v0, Ld9/q;

    invoke-direct {v0}, Ld9/q;-><init>()V

    iput-object v0, p0, Ld9/t;->p:Ld9/q;

    return-void
.end method

.method private l()V
    .locals 2

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Ld9/t;->n:Landroid/util/LongSparseArray;

    invoke-virtual {v1}, Landroid/util/LongSparseArray;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    iget-object v1, p0, Ld9/t;->n:Landroid/util/LongSparseArray;

    invoke-virtual {v1, v0}, Landroid/util/LongSparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ld9/p;

    invoke-virtual {v1}, Ld9/p;->c()V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Ld9/t;->n:Landroid/util/LongSparseArray;

    invoke-virtual {v0}, Landroid/util/LongSparseArray;->clear()V

    return-void
.end method


# virtual methods
.method public a(Ld9/b$d;)Ld9/b$i;
    .locals 10

    iget-object v0, p0, Ld9/t;->o:Ld9/t$a;

    invoke-static {v0}, Ld9/t$a;->a(Ld9/t$a;)Lio/flutter/view/d;

    move-result-object v0

    invoke-interface {v0}, Lio/flutter/view/d;->a()Lio/flutter/view/d$c;

    move-result-object v0

    new-instance v3, Lt8/d;

    iget-object v1, p0, Ld9/t;->o:Ld9/t$a;

    invoke-static {v1}, Ld9/t$a;->b(Ld9/t$a;)Lt8/c;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "flutter.io/videoPlayer/videoEvents"

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v0}, Lio/flutter/view/d$c;->e()J

    move-result-wide v4

    invoke-virtual {v2, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v3, v1, v2}, Lt8/d;-><init>(Lt8/c;Ljava/lang/String;)V

    invoke-virtual {p1}, Ld9/b$d;->b()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {p1}, Ld9/b$d;->e()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Ld9/t;->o:Ld9/t$a;

    invoke-static {v1}, Ld9/t$a;->c(Ld9/t$a;)Ld9/t$b;

    move-result-object v1

    invoke-virtual {p1}, Ld9/b$d;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Ld9/b$d;->e()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v1, v2, p1}, Ld9/t$b;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    iget-object v1, p0, Ld9/t;->o:Ld9/t$a;

    invoke-static {v1}, Ld9/t$a;->d(Ld9/t$a;)Ld9/t$c;

    move-result-object v1

    invoke-virtual {p1}, Ld9/b$d;->b()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v1, p1}, Ld9/t$c;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    :goto_0
    new-instance v9, Ld9/p;

    iget-object v1, p0, Ld9/t;->o:Ld9/t$a;

    invoke-static {v1}, Ld9/t$a;->e(Ld9/t$a;)Landroid/content/Context;

    move-result-object v2

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "asset:///"

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    new-instance v7, Ljava/util/HashMap;

    invoke-direct {v7}, Ljava/util/HashMap;-><init>()V

    iget-object v8, p0, Ld9/t;->p:Ld9/q;

    move-object v1, v9

    move-object v4, v0

    invoke-direct/range {v1 .. v8}, Ld9/p;-><init>(Landroid/content/Context;Lt8/d;Lio/flutter/view/d$c;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ld9/q;)V

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, Ld9/b$d;->d()Ljava/util/Map;

    move-result-object v7

    new-instance v9, Ld9/p;

    iget-object v1, p0, Ld9/t;->o:Ld9/t$a;

    invoke-static {v1}, Ld9/t$a;->e(Ld9/t$a;)Landroid/content/Context;

    move-result-object v2

    invoke-virtual {p1}, Ld9/b$d;->f()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1}, Ld9/b$d;->c()Ljava/lang/String;

    move-result-object v6

    iget-object v8, p0, Ld9/t;->p:Ld9/q;

    move-object v1, v9

    move-object v4, v0

    invoke-direct/range {v1 .. v8}, Ld9/p;-><init>(Landroid/content/Context;Lt8/d;Lio/flutter/view/d$c;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ld9/q;)V

    :goto_1
    iget-object p1, p0, Ld9/t;->n:Landroid/util/LongSparseArray;

    invoke-interface {v0}, Lio/flutter/view/d$c;->e()J

    move-result-wide v1

    invoke-virtual {p1, v1, v2, v9}, Landroid/util/LongSparseArray;->put(JLjava/lang/Object;)V

    new-instance p1, Ld9/b$i$a;

    invoke-direct {p1}, Ld9/b$i$a;-><init>()V

    invoke-interface {v0}, Lio/flutter/view/d$c;->e()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {p1, v0}, Ld9/b$i$a;->b(Ljava/lang/Long;)Ld9/b$i$a;

    move-result-object p1

    invoke-virtual {p1}, Ld9/b$i$a;->a()Ld9/b$i;

    move-result-object p1

    return-object p1
.end method

.method public b()V
    .locals 0

    invoke-direct {p0}, Ld9/t;->l()V

    return-void
.end method

.method public c(Ld9/b$i;)V
    .locals 3

    iget-object v0, p0, Ld9/t;->n:Landroid/util/LongSparseArray;

    invoke-virtual {p1}, Ld9/b$i;->b()Ljava/lang/Long;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Landroid/util/LongSparseArray;->get(J)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ld9/p;

    invoke-virtual {p1}, Ld9/p;->e()V

    return-void
.end method

.method public d(Ld9/b$f;)V
    .locals 1

    iget-object v0, p0, Ld9/t;->p:Ld9/q;

    invoke-virtual {p1}, Ld9/b$f;->b()Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iput-boolean p1, v0, Ld9/q;->a:Z

    return-void
.end method

.method public e(Ld9/b$e;)V
    .locals 3

    iget-object v0, p0, Ld9/t;->n:Landroid/util/LongSparseArray;

    invoke-virtual {p1}, Ld9/b$e;->c()Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Landroid/util/LongSparseArray;->get(J)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ld9/p;

    invoke-virtual {p1}, Ld9/b$e;->b()Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-virtual {v0, p1}, Ld9/p;->k(Z)V

    return-void
.end method

.method public f(Ld9/b$g;)V
    .locals 3

    iget-object v0, p0, Ld9/t;->n:Landroid/util/LongSparseArray;

    invoke-virtual {p1}, Ld9/b$g;->c()Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Landroid/util/LongSparseArray;->get(J)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ld9/p;

    invoke-virtual {p1}, Ld9/b$g;->b()Ljava/lang/Double;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ld9/p;->l(D)V

    return-void
.end method

.method public g(Ld9/b$i;)V
    .locals 3

    iget-object v0, p0, Ld9/t;->n:Landroid/util/LongSparseArray;

    invoke-virtual {p1}, Ld9/b$i;->b()Ljava/lang/Long;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Landroid/util/LongSparseArray;->get(J)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ld9/p;

    invoke-virtual {p1}, Ld9/p;->f()V

    return-void
.end method

.method public h(Ld9/b$h;)V
    .locals 3

    iget-object v0, p0, Ld9/t;->n:Landroid/util/LongSparseArray;

    invoke-virtual {p1}, Ld9/b$h;->c()Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Landroid/util/LongSparseArray;->get(J)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ld9/p;

    invoke-virtual {p1}, Ld9/b$h;->b()Ljava/lang/Long;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Long;->intValue()I

    move-result p1

    invoke-virtual {v0, p1}, Ld9/p;->g(I)V

    return-void
.end method

.method public i(Ld9/b$j;)V
    .locals 3

    iget-object v0, p0, Ld9/t;->n:Landroid/util/LongSparseArray;

    invoke-virtual {p1}, Ld9/b$j;->b()Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Landroid/util/LongSparseArray;->get(J)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ld9/p;

    invoke-virtual {p1}, Ld9/b$j;->c()Ljava/lang/Double;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ld9/p;->n(D)V

    return-void
.end method

.method public j(Ld9/b$i;)V
    .locals 3

    iget-object v0, p0, Ld9/t;->n:Landroid/util/LongSparseArray;

    invoke-virtual {p1}, Ld9/b$i;->b()Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Landroid/util/LongSparseArray;->get(J)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ld9/p;

    invoke-virtual {v0}, Ld9/p;->c()V

    iget-object v0, p0, Ld9/t;->n:Landroid/util/LongSparseArray;

    invoke-virtual {p1}, Ld9/b$i;->b()Ljava/lang/Long;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Landroid/util/LongSparseArray;->remove(J)V

    return-void
.end method

.method public k(Ld9/b$i;)Ld9/b$h;
    .locals 4

    iget-object v0, p0, Ld9/t;->n:Landroid/util/LongSparseArray;

    invoke-virtual {p1}, Ld9/b$i;->b()Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Landroid/util/LongSparseArray;->get(J)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ld9/p;

    new-instance v1, Ld9/b$h$a;

    invoke-direct {v1}, Ld9/b$h$a;-><init>()V

    invoke-virtual {v0}, Ld9/p;->d()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v1, v2}, Ld9/b$h$a;->b(Ljava/lang/Long;)Ld9/b$h$a;

    move-result-object v1

    invoke-virtual {p1}, Ld9/b$i;->b()Ljava/lang/Long;

    move-result-object p1

    invoke-virtual {v1, p1}, Ld9/b$h$a;->c(Ljava/lang/Long;)Ld9/b$h$a;

    move-result-object p1

    invoke-virtual {p1}, Ld9/b$h$a;->a()Ld9/b$h;

    move-result-object p1

    invoke-virtual {v0}, Ld9/p;->h()V

    return-object p1
.end method

.method public onAttachedToEngine(Lk8/a$b;)V
    .locals 8

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-ge v0, v1, :cond_0

    :try_start_0
    new-instance v0, Ld9/a;

    invoke-direct {v0}, Ld9/a;-><init>()V

    invoke-static {v0}, Ljavax/net/ssl/HttpsURLConnection;->setDefaultSSLSocketFactory(Ljavax/net/ssl/SSLSocketFactory;)V
    :try_end_0
    .catch Ljava/security/KeyManagementException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    goto :goto_0

    :catch_1
    move-exception v0

    :goto_0
    const-string v1, "VideoPlayerPlugin"

    const-string v2, "Failed to enable TLSv1.1 and TLSv1.2 Protocols for API level 19 and below.\nFor more information about Socket Security, please consult the following link:\nhttps://developer.android.com/reference/javax/net/ssl/SSLSocket"

    invoke-static {v1, v2, v0}, Lf8/b;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    :goto_1
    invoke-static {}, Lf8/a;->e()Lf8/a;

    move-result-object v0

    new-instance v7, Ld9/t$a;

    invoke-virtual {p1}, Lk8/a$b;->a()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {p1}, Lk8/a$b;->b()Lt8/c;

    move-result-object v3

    invoke-virtual {v0}, Lf8/a;->c()Li8/f;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v4, Ld9/s;

    invoke-direct {v4, v1}, Ld9/s;-><init>(Li8/f;)V

    invoke-virtual {v0}, Lf8/a;->c()Li8/f;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v5, Ld9/r;

    invoke-direct {v5, v0}, Ld9/r;-><init>(Li8/f;)V

    invoke-virtual {p1}, Lk8/a$b;->e()Lio/flutter/view/d;

    move-result-object v6

    move-object v1, v7

    invoke-direct/range {v1 .. v6}, Ld9/t$a;-><init>(Landroid/content/Context;Lt8/c;Ld9/t$c;Ld9/t$b;Lio/flutter/view/d;)V

    iput-object v7, p0, Ld9/t;->o:Ld9/t$a;

    invoke-virtual {p1}, Lk8/a$b;->b()Lt8/c;

    move-result-object p1

    invoke-virtual {v7, p0, p1}, Ld9/t$a;->f(Ld9/t;Lt8/c;)V

    return-void
.end method

.method public onDetachedFromEngine(Lk8/a$b;)V
    .locals 2

    iget-object v0, p0, Ld9/t;->o:Ld9/t$a;

    if-nez v0, :cond_0

    const-string v0, "VideoPlayerPlugin"

    const-string v1, "Detached from the engine before registering to it."

    invoke-static {v0, v1}, Lf8/b;->i(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    iget-object v0, p0, Ld9/t;->o:Ld9/t$a;

    invoke-virtual {p1}, Lk8/a$b;->b()Lt8/c;

    move-result-object p1

    invoke-virtual {v0, p1}, Ld9/t$a;->g(Lt8/c;)V

    const/4 p1, 0x0

    iput-object p1, p0, Ld9/t;->o:Ld9/t$a;

    invoke-virtual {p0}, Ld9/t;->b()V

    return-void
.end method
