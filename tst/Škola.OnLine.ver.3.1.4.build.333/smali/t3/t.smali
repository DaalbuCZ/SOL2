.class public final Lt3/t;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lt3/l;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lt3/t$a;
    }
.end annotation


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lt3/p0;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Lt3/l;

.field private d:Lt3/l;

.field private e:Lt3/l;

.field private f:Lt3/l;

.field private g:Lt3/l;

.field private h:Lt3/l;

.field private i:Lt3/l;

.field private j:Lt3/l;

.field private k:Lt3/l;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lt3/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lt3/t;->a:Landroid/content/Context;

    invoke-static {p2}, Lu3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lt3/l;

    iput-object p1, p0, Lt3/t;->c:Lt3/l;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lt3/t;->b:Ljava/util/List;

    return-void
.end method

.method private r(Lt3/l;)V
    .locals 2

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lt3/t;->b:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    iget-object v1, p0, Lt3/t;->b:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lt3/p0;

    invoke-interface {p1, v1}, Lt3/l;->c(Lt3/p0;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method private s()Lt3/l;
    .locals 2

    iget-object v0, p0, Lt3/t;->e:Lt3/l;

    if-nez v0, :cond_0

    new-instance v0, Lt3/c;

    iget-object v1, p0, Lt3/t;->a:Landroid/content/Context;

    invoke-direct {v0, v1}, Lt3/c;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lt3/t;->e:Lt3/l;

    invoke-direct {p0, v0}, Lt3/t;->r(Lt3/l;)V

    :cond_0
    iget-object v0, p0, Lt3/t;->e:Lt3/l;

    return-object v0
.end method

.method private t()Lt3/l;
    .locals 2

    iget-object v0, p0, Lt3/t;->f:Lt3/l;

    if-nez v0, :cond_0

    new-instance v0, Lt3/h;

    iget-object v1, p0, Lt3/t;->a:Landroid/content/Context;

    invoke-direct {v0, v1}, Lt3/h;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lt3/t;->f:Lt3/l;

    invoke-direct {p0, v0}, Lt3/t;->r(Lt3/l;)V

    :cond_0
    iget-object v0, p0, Lt3/t;->f:Lt3/l;

    return-object v0
.end method

.method private u()Lt3/l;
    .locals 1

    iget-object v0, p0, Lt3/t;->i:Lt3/l;

    if-nez v0, :cond_0

    new-instance v0, Lt3/j;

    invoke-direct {v0}, Lt3/j;-><init>()V

    iput-object v0, p0, Lt3/t;->i:Lt3/l;

    invoke-direct {p0, v0}, Lt3/t;->r(Lt3/l;)V

    :cond_0
    iget-object v0, p0, Lt3/t;->i:Lt3/l;

    return-object v0
.end method

.method private v()Lt3/l;
    .locals 1

    iget-object v0, p0, Lt3/t;->d:Lt3/l;

    if-nez v0, :cond_0

    new-instance v0, Lt3/y;

    invoke-direct {v0}, Lt3/y;-><init>()V

    iput-object v0, p0, Lt3/t;->d:Lt3/l;

    invoke-direct {p0, v0}, Lt3/t;->r(Lt3/l;)V

    :cond_0
    iget-object v0, p0, Lt3/t;->d:Lt3/l;

    return-object v0
.end method

.method private w()Lt3/l;
    .locals 2

    iget-object v0, p0, Lt3/t;->j:Lt3/l;

    if-nez v0, :cond_0

    new-instance v0, Lt3/k0;

    iget-object v1, p0, Lt3/t;->a:Landroid/content/Context;

    invoke-direct {v0, v1}, Lt3/k0;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lt3/t;->j:Lt3/l;

    invoke-direct {p0, v0}, Lt3/t;->r(Lt3/l;)V

    :cond_0
    iget-object v0, p0, Lt3/t;->j:Lt3/l;

    return-object v0
.end method

.method private x()Lt3/l;
    .locals 3

    iget-object v0, p0, Lt3/t;->g:Lt3/l;

    if-nez v0, :cond_0

    :try_start_0
    const-string v0, "com.google.android.exoplayer2.ext.rtmp.RtmpDataSource"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/Class;

    invoke-virtual {v0, v2}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lt3/l;

    iput-object v0, p0, Lt3/t;->g:Lt3/l;

    invoke-direct {p0, v0}, Lt3/t;->r(Lt3/l;)V
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/RuntimeException;

    const-string v2, "Error instantiating RTMP extension"

    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :catch_1
    const-string v0, "DefaultDataSource"

    const-string v1, "Attempting to play RTMP stream without depending on the RTMP extension"

    invoke-static {v0, v1}, Lu3/r;->i(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    iget-object v0, p0, Lt3/t;->g:Lt3/l;

    if-nez v0, :cond_0

    iget-object v0, p0, Lt3/t;->c:Lt3/l;

    iput-object v0, p0, Lt3/t;->g:Lt3/l;

    :cond_0
    iget-object v0, p0, Lt3/t;->g:Lt3/l;

    return-object v0
.end method

.method private y()Lt3/l;
    .locals 1

    iget-object v0, p0, Lt3/t;->h:Lt3/l;

    if-nez v0, :cond_0

    new-instance v0, Lt3/q0;

    invoke-direct {v0}, Lt3/q0;-><init>()V

    iput-object v0, p0, Lt3/t;->h:Lt3/l;

    invoke-direct {p0, v0}, Lt3/t;->r(Lt3/l;)V

    :cond_0
    iget-object v0, p0, Lt3/t;->h:Lt3/l;

    return-object v0
.end method

.method private z(Lt3/l;Lt3/p0;)V
    .locals 0

    if-eqz p1, :cond_0

    invoke-interface {p1, p2}, Lt3/l;->c(Lt3/p0;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public b([BII)I
    .locals 1

    iget-object v0, p0, Lt3/t;->k:Lt3/l;

    invoke-static {v0}, Lu3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lt3/l;

    invoke-interface {v0, p1, p2, p3}, Lt3/i;->b([BII)I

    move-result p1

    return p1
.end method

.method public c(Lt3/p0;)V
    .locals 1

    invoke-static {p1}, Lu3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lt3/t;->c:Lt3/l;

    invoke-interface {v0, p1}, Lt3/l;->c(Lt3/p0;)V

    iget-object v0, p0, Lt3/t;->b:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lt3/t;->d:Lt3/l;

    invoke-direct {p0, v0, p1}, Lt3/t;->z(Lt3/l;Lt3/p0;)V

    iget-object v0, p0, Lt3/t;->e:Lt3/l;

    invoke-direct {p0, v0, p1}, Lt3/t;->z(Lt3/l;Lt3/p0;)V

    iget-object v0, p0, Lt3/t;->f:Lt3/l;

    invoke-direct {p0, v0, p1}, Lt3/t;->z(Lt3/l;Lt3/p0;)V

    iget-object v0, p0, Lt3/t;->g:Lt3/l;

    invoke-direct {p0, v0, p1}, Lt3/t;->z(Lt3/l;Lt3/p0;)V

    iget-object v0, p0, Lt3/t;->h:Lt3/l;

    invoke-direct {p0, v0, p1}, Lt3/t;->z(Lt3/l;Lt3/p0;)V

    iget-object v0, p0, Lt3/t;->i:Lt3/l;

    invoke-direct {p0, v0, p1}, Lt3/t;->z(Lt3/l;Lt3/p0;)V

    iget-object v0, p0, Lt3/t;->j:Lt3/l;

    invoke-direct {p0, v0, p1}, Lt3/t;->z(Lt3/l;Lt3/p0;)V

    return-void
.end method

.method public close()V
    .locals 2

    iget-object v0, p0, Lt3/t;->k:Lt3/l;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    :try_start_0
    invoke-interface {v0}, Lt3/l;->close()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iput-object v1, p0, Lt3/t;->k:Lt3/l;

    goto :goto_0

    :catchall_0
    move-exception v0

    iput-object v1, p0, Lt3/t;->k:Lt3/l;

    throw v0

    :cond_0
    :goto_0
    return-void
.end method

.method public f(Lt3/p;)J
    .locals 2

    iget-object v0, p0, Lt3/t;->k:Lt3/l;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lu3/a;->f(Z)V

    iget-object v0, p1, Lt3/p;->a:Landroid/net/Uri;

    invoke-virtual {v0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p1, Lt3/p;->a:Landroid/net/Uri;

    invoke-static {v1}, Lu3/n0;->v0(Landroid/net/Uri;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v0, p1, Lt3/p;->a:Landroid/net/Uri;

    invoke-virtual {v0}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    const-string v1, "/android_asset/"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-direct {p0}, Lt3/t;->v()Lt3/l;

    move-result-object v0

    goto :goto_2

    :cond_2
    const-string v1, "asset"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    :goto_1
    invoke-direct {p0}, Lt3/t;->s()Lt3/l;

    move-result-object v0

    :goto_2
    iput-object v0, p0, Lt3/t;->k:Lt3/l;

    goto :goto_4

    :cond_3
    const-string v1, "content"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-direct {p0}, Lt3/t;->t()Lt3/l;

    move-result-object v0

    goto :goto_2

    :cond_4
    const-string v1, "rtmp"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-direct {p0}, Lt3/t;->x()Lt3/l;

    move-result-object v0

    goto :goto_2

    :cond_5
    const-string v1, "udp"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-direct {p0}, Lt3/t;->y()Lt3/l;

    move-result-object v0

    goto :goto_2

    :cond_6
    const-string v1, "data"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-direct {p0}, Lt3/t;->u()Lt3/l;

    move-result-object v0

    goto :goto_2

    :cond_7
    const-string v1, "rawresource"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    const-string v1, "android.resource"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    goto :goto_3

    :cond_8
    iget-object v0, p0, Lt3/t;->c:Lt3/l;

    goto :goto_2

    :cond_9
    :goto_3
    invoke-direct {p0}, Lt3/t;->w()Lt3/l;

    move-result-object v0

    goto :goto_2

    :goto_4
    iget-object v0, p0, Lt3/t;->k:Lt3/l;

    invoke-interface {v0, p1}, Lt3/l;->f(Lt3/p;)J

    move-result-wide v0

    return-wide v0
.end method

.method public h()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Lt3/t;->k:Lt3/l;

    if-nez v0, :cond_0

    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object v0

    goto :goto_0

    :cond_0
    invoke-interface {v0}, Lt3/l;->h()Ljava/util/Map;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method public l()Landroid/net/Uri;
    .locals 1

    iget-object v0, p0, Lt3/t;->k:Lt3/l;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-interface {v0}, Lt3/l;->l()Landroid/net/Uri;

    move-result-object v0

    :goto_0
    return-object v0
.end method
