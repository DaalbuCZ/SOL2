.class public final Lb2/l;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lb2/b0;


# instance fields
.field private final a:Ljava/lang/Object;

.field private b:Lx1/v1$f;

.field private c:Lb2/y;

.field private d:Lt3/l$a;

.field private e:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lb2/l;->a:Ljava/lang/Object;

    return-void
.end method

.method private b(Lx1/v1$f;)Lb2/y;
    .locals 4

    iget-object v0, p0, Lb2/l;->d:Lt3/l$a;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Lt3/u$b;

    invoke-direct {v0}, Lt3/u$b;-><init>()V

    iget-object v1, p0, Lb2/l;->e:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lt3/u$b;->e(Ljava/lang/String;)Lt3/u$b;

    move-result-object v0

    :goto_0
    new-instance v1, Lb2/l0;

    iget-object v2, p1, Lx1/v1$f;->c:Landroid/net/Uri;

    if-nez v2, :cond_1

    const/4 v2, 0x0

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v2

    :goto_1
    iget-boolean v3, p1, Lx1/v1$f;->h:Z

    invoke-direct {v1, v2, v3, v0}, Lb2/l0;-><init>(Ljava/lang/String;ZLt3/l$a;)V

    iget-object v0, p1, Lx1/v1$f;->e:Lg5/r;

    invoke-virtual {v0}, Lg5/r;->g()Lg5/s;

    move-result-object v0

    invoke-virtual {v0}, Lg5/s;->v()Lg5/s0;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v1, v3, v2}, Lb2/l0;->e(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    :cond_2
    new-instance v0, Lb2/h$b;

    invoke-direct {v0}, Lb2/h$b;-><init>()V

    iget-object v2, p1, Lx1/v1$f;->a:Ljava/util/UUID;

    sget-object v3, Lb2/k0;->d:Lb2/g0$c;

    invoke-virtual {v0, v2, v3}, Lb2/h$b;->e(Ljava/util/UUID;Lb2/g0$c;)Lb2/h$b;

    move-result-object v0

    iget-boolean v2, p1, Lx1/v1$f;->f:Z

    invoke-virtual {v0, v2}, Lb2/h$b;->b(Z)Lb2/h$b;

    move-result-object v0

    iget-boolean v2, p1, Lx1/v1$f;->g:Z

    invoke-virtual {v0, v2}, Lb2/h$b;->c(Z)Lb2/h$b;

    move-result-object v0

    iget-object v2, p1, Lx1/v1$f;->j:Lg5/q;

    invoke-static {v2}, Li5/e;->k(Ljava/util/Collection;)[I

    move-result-object v2

    invoke-virtual {v0, v2}, Lb2/h$b;->d([I)Lb2/h$b;

    move-result-object v0

    invoke-virtual {v0, v1}, Lb2/h$b;->a(Lb2/n0;)Lb2/h;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p1}, Lx1/v1$f;->c()[B

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Lb2/h;->G(I[B)V

    return-object v0
.end method


# virtual methods
.method public a(Lx1/v1;)Lb2/y;
    .locals 2

    iget-object v0, p1, Lx1/v1;->o:Lx1/v1$h;

    invoke-static {v0}, Lu3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p1, Lx1/v1;->o:Lx1/v1$h;

    iget-object p1, p1, Lx1/v1$h;->c:Lx1/v1$f;

    if-eqz p1, :cond_2

    sget v0, Lu3/n0;->a:I

    const/16 v1, 0x12

    if-ge v0, v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lb2/l;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lb2/l;->b:Lx1/v1$f;

    invoke-static {p1, v1}, Lu3/n0;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    iput-object p1, p0, Lb2/l;->b:Lx1/v1$f;

    invoke-direct {p0, p1}, Lb2/l;->b(Lx1/v1$f;)Lb2/y;

    move-result-object p1

    iput-object p1, p0, Lb2/l;->c:Lb2/y;

    :cond_1
    iget-object p1, p0, Lb2/l;->c:Lb2/y;

    invoke-static {p1}, Lu3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lb2/y;

    monitor-exit v0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_2
    :goto_0
    sget-object p1, Lb2/y;->a:Lb2/y;

    return-object p1
.end method
