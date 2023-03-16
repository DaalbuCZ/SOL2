.class final Lv8/p;
.super Ljava/lang/Object;
.source ""


# instance fields
.field private a:Ls1/r;

.field private b:Landroid/view/Surface;

.field private final c:Lio/flutter/view/d$c;

.field private d:Lv8/o;

.field private final e:Ll8/d;

.field f:Z

.field private final g:Lv8/q;


# direct methods
.method constructor <init>(Landroid/content/Context;Ll8/d;Lio/flutter/view/d$c;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lv8/q;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ll8/d;",
            "Lio/flutter/view/d$c;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Lv8/q;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lv8/p;->f:Z

    iput-object p2, p0, Lv8/p;->e:Ll8/d;

    iput-object p3, p0, Lv8/p;->c:Lio/flutter/view/d$c;

    iput-object p7, p0, Lv8/p;->g:Lv8/q;

    new-instance p2, Ls1/r$b;

    invoke-direct {p2, p1}, Ls1/r$b;-><init>(Landroid/content/Context;)V

    invoke-virtual {p2}, Ls1/r$b;->e()Ls1/r;

    move-result-object p2

    invoke-static {p4}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p3

    invoke-static {p3}, Lv8/p;->d(Landroid/net/Uri;)Z

    move-result p4

    if-eqz p4, :cond_0

    new-instance p4, Lo3/u$b;

    invoke-direct {p4}, Lo3/u$b;-><init>()V

    const-string p7, "ExoPlayer"

    invoke-virtual {p4, p7}, Lo3/u$b;->e(Ljava/lang/String;)Lo3/u$b;

    move-result-object p4

    const/4 p7, 0x1

    invoke-virtual {p4, p7}, Lo3/u$b;->c(Z)Lo3/u$b;

    move-result-object p4

    if-eqz p6, :cond_1

    invoke-interface {p6}, Ljava/util/Map;->isEmpty()Z

    move-result p7

    if-nez p7, :cond_1

    invoke-virtual {p4, p6}, Lo3/u$b;->d(Ljava/util/Map;)Lo3/u$b;

    goto :goto_0

    :cond_0
    new-instance p4, Lo3/t$a;

    invoke-direct {p4, p1}, Lo3/t$a;-><init>(Landroid/content/Context;)V

    :cond_1
    :goto_0
    invoke-direct {p0, p3, p4, p5, p1}, Lv8/p;->a(Landroid/net/Uri;Lo3/l$a;Ljava/lang/String;Landroid/content/Context;)Lu2/u;

    move-result-object p1

    invoke-interface {p2, p1}, Ls1/r;->z(Lu2/u;)V

    invoke-interface {p2}, Ls1/p2;->b()V

    new-instance p1, Lv8/o;

    invoke-direct {p1}, Lv8/o;-><init>()V

    invoke-direct {p0, p2, p1}, Lv8/p;->m(Ls1/r;Lv8/o;)V

    return-void
.end method

.method private a(Landroid/net/Uri;Lo3/l$a;Ljava/lang/String;Landroid/content/Context;)Lu2/u;
    .locals 6

    const/4 v0, 0x4

    const/4 v1, 0x0

    const/4 v2, -0x1

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-nez p3, :cond_0

    invoke-static {p1}, Lp3/m0;->m0(Landroid/net/Uri;)I

    move-result v1

    goto :goto_2

    :cond_0
    invoke-virtual {p3}, Ljava/lang/String;->hashCode()I

    move-result v5

    sparse-switch v5, :sswitch_data_0

    :goto_0
    move p3, v2

    goto :goto_1

    :sswitch_0
    const-string v5, "other"

    invoke-virtual {p3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-nez p3, :cond_1

    goto :goto_0

    :cond_1
    const/4 p3, 0x3

    goto :goto_1

    :sswitch_1
    const-string v5, "dash"

    invoke-virtual {p3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-nez p3, :cond_2

    goto :goto_0

    :cond_2
    move p3, v3

    goto :goto_1

    :sswitch_2
    const-string v5, "hls"

    invoke-virtual {p3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-nez p3, :cond_3

    goto :goto_0

    :cond_3
    move p3, v4

    goto :goto_1

    :sswitch_3
    const-string v5, "ss"

    invoke-virtual {p3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-nez p3, :cond_4

    goto :goto_0

    :cond_4
    move p3, v1

    :goto_1
    packed-switch p3, :pswitch_data_0

    move v1, v2

    goto :goto_2

    :pswitch_0
    move v1, v0

    goto :goto_2

    :pswitch_1
    move v1, v3

    goto :goto_2

    :pswitch_2
    move v1, v4

    :goto_2
    :pswitch_3
    if-eqz v1, :cond_8

    if-eq v1, v4, :cond_7

    if-eq v1, v3, :cond_6

    if-ne v1, v0, :cond_5

    new-instance p3, Lu2/i0$b;

    invoke-direct {p3, p2}, Lu2/i0$b;-><init>(Lo3/l$a;)V

    invoke-static {p1}, Ls1/u1;->d(Landroid/net/Uri;)Ls1/u1;

    move-result-object p1

    invoke-virtual {p3, p1}, Lu2/i0$b;->b(Ls1/u1;)Lu2/i0;

    move-result-object p1

    return-object p1

    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "Unsupported type: "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    new-instance p3, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource$Factory;

    invoke-direct {p3, p2}, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource$Factory;-><init>(Lo3/l$a;)V

    invoke-static {p1}, Ls1/u1;->d(Landroid/net/Uri;)Ls1/u1;

    move-result-object p1

    invoke-virtual {p3, p1}, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource$Factory;->a(Ls1/u1;)Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;

    move-result-object p1

    return-object p1

    :cond_7
    new-instance p3, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource$Factory;

    new-instance v0, Lcom/google/android/exoplayer2/source/smoothstreaming/a$a;

    invoke-direct {v0, p2}, Lcom/google/android/exoplayer2/source/smoothstreaming/a$a;-><init>(Lo3/l$a;)V

    new-instance v1, Lo3/t$a;

    invoke-direct {v1, p4, p2}, Lo3/t$a;-><init>(Landroid/content/Context;Lo3/l$a;)V

    invoke-direct {p3, v0, v1}, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource$Factory;-><init>(Lcom/google/android/exoplayer2/source/smoothstreaming/b$a;Lo3/l$a;)V

    invoke-static {p1}, Ls1/u1;->d(Landroid/net/Uri;)Ls1/u1;

    move-result-object p1

    invoke-virtual {p3, p1}, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource$Factory;->a(Ls1/u1;)Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;

    move-result-object p1

    return-object p1

    :cond_8
    new-instance p3, Lcom/google/android/exoplayer2/source/dash/DashMediaSource$Factory;

    new-instance v0, Lcom/google/android/exoplayer2/source/dash/c$a;

    invoke-direct {v0, p2}, Lcom/google/android/exoplayer2/source/dash/c$a;-><init>(Lo3/l$a;)V

    new-instance v1, Lo3/t$a;

    invoke-direct {v1, p4, p2}, Lo3/t$a;-><init>(Landroid/content/Context;Lo3/l$a;)V

    invoke-direct {p3, v0, v1}, Lcom/google/android/exoplayer2/source/dash/DashMediaSource$Factory;-><init>(Lcom/google/android/exoplayer2/source/dash/a$a;Lo3/l$a;)V

    invoke-static {p1}, Ls1/u1;->d(Landroid/net/Uri;)Ls1/u1;

    move-result-object p1

    invoke-virtual {p3, p1}, Lcom/google/android/exoplayer2/source/dash/DashMediaSource$Factory;->a(Ls1/u1;)Lcom/google/android/exoplayer2/source/dash/DashMediaSource;

    move-result-object p1

    return-object p1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe60 -> :sswitch_3
        0x193ef -> :sswitch_2
        0x2eef92 -> :sswitch_1
        0x6527f10 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_3
        :pswitch_0
    .end packed-switch
.end method

.method private static d(Landroid/net/Uri;)Z
    .locals 2

    const/4 v0, 0x0

    if-eqz p0, :cond_2

    invoke-virtual {p0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object p0

    const-string v1, "http"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    const-string v1, "https"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_2

    :cond_1
    const/4 v0, 0x1

    :cond_2
    :goto_0
    return v0
.end method

.method private static j(Ls1/r;Z)V
    .locals 2

    new-instance v0, Lu1/e$e;

    invoke-direct {v0}, Lu1/e$e;-><init>()V

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Lu1/e$e;->c(I)Lu1/e$e;

    move-result-object v0

    invoke-virtual {v0}, Lu1/e$e;->a()Lu1/e;

    move-result-object v0

    xor-int/lit8 p1, p1, 0x1

    invoke-interface {p0, v0, p1}, Ls1/r;->c(Lu1/e;Z)V

    return-void
.end method

.method private m(Ls1/r;Lv8/o;)V
    .locals 2

    iput-object p1, p0, Lv8/p;->a:Ls1/r;

    iput-object p2, p0, Lv8/p;->d:Lv8/o;

    iget-object v0, p0, Lv8/p;->e:Ll8/d;

    new-instance v1, Lv8/p$a;

    invoke-direct {v1, p0, p2}, Lv8/p$a;-><init>(Lv8/p;Lv8/o;)V

    invoke-virtual {v0, v1}, Ll8/d;->d(Ll8/d$d;)V

    new-instance v0, Landroid/view/Surface;

    iget-object v1, p0, Lv8/p;->c:Lio/flutter/view/d$c;

    invoke-interface {v1}, Lio/flutter/view/d$c;->d()Landroid/graphics/SurfaceTexture;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/view/Surface;-><init>(Landroid/graphics/SurfaceTexture;)V

    iput-object v0, p0, Lv8/p;->b:Landroid/view/Surface;

    invoke-interface {p1, v0}, Ls1/p2;->i(Landroid/view/Surface;)V

    iget-object v0, p0, Lv8/p;->g:Lv8/q;

    iget-boolean v0, v0, Lv8/q;->a:Z

    invoke-static {p1, v0}, Lv8/p;->j(Ls1/r;Z)V

    new-instance v0, Lv8/p$b;

    invoke-direct {v0, p0, p2}, Lv8/p$b;-><init>(Lv8/p;Lv8/o;)V

    invoke-interface {p1, v0}, Ls1/p2;->l(Ls1/p2$d;)V

    return-void
.end method


# virtual methods
.method b()V
    .locals 2

    iget-boolean v0, p0, Lv8/p;->f:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lv8/p;->a:Ls1/r;

    invoke-interface {v0}, Ls1/p2;->stop()V

    :cond_0
    iget-object v0, p0, Lv8/p;->c:Lio/flutter/view/d$c;

    invoke-interface {v0}, Lio/flutter/view/d$c;->a()V

    iget-object v0, p0, Lv8/p;->e:Ll8/d;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ll8/d;->d(Ll8/d$d;)V

    iget-object v0, p0, Lv8/p;->b:Landroid/view/Surface;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/view/Surface;->release()V

    :cond_1
    iget-object v0, p0, Lv8/p;->a:Ls1/r;

    if-eqz v0, :cond_2

    invoke-interface {v0}, Ls1/p2;->a()V

    :cond_2
    return-void
.end method

.method c()J
    .locals 2

    iget-object v0, p0, Lv8/p;->a:Ls1/r;

    invoke-interface {v0}, Ls1/p2;->I()J

    move-result-wide v0

    return-wide v0
.end method

.method e()V
    .locals 2

    iget-object v0, p0, Lv8/p;->a:Ls1/r;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ls1/p2;->h(Z)V

    return-void
.end method

.method f()V
    .locals 2

    iget-object v0, p0, Lv8/p;->a:Ls1/r;

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Ls1/p2;->h(Z)V

    return-void
.end method

.method g(I)V
    .locals 3

    iget-object v0, p0, Lv8/p;->a:Ls1/r;

    int-to-long v1, p1

    invoke-interface {v0, v1, v2}, Ls1/p2;->H(J)V

    return-void
.end method

.method h()V
    .locals 4

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "event"

    const-string v2, "bufferingUpdate"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Number;

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v1, v2

    iget-object v2, p0, Lv8/p;->a:Ls1/r;

    invoke-interface {v2}, Ls1/p2;->o()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    const-string v2, "values"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lv8/p;->d:Lv8/o;

    invoke-virtual {v1, v0}, Lv8/o;->a(Ljava/lang/Object;)V

    return-void
.end method

.method i()V
    .locals 5

    iget-boolean v0, p0, Lv8/p;->f:Z

    if-eqz v0, :cond_3

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "event"

    const-string v2, "initialized"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lv8/p;->a:Ls1/r;

    invoke-interface {v1}, Ls1/p2;->E()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const-string v2, "duration"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lv8/p;->a:Ls1/r;

    invoke-interface {v1}, Ls1/r;->e()Ls1/m1;

    move-result-object v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lv8/p;->a:Ls1/r;

    invoke-interface {v1}, Ls1/r;->e()Ls1/m1;

    move-result-object v1

    iget v2, v1, Ls1/m1;->D:I

    iget v3, v1, Ls1/m1;->E:I

    iget v1, v1, Ls1/m1;->G:I

    const/16 v4, 0x5a

    if-eq v1, v4, :cond_0

    const/16 v4, 0x10e

    if-ne v1, v4, :cond_1

    :cond_0
    iget-object v2, p0, Lv8/p;->a:Ls1/r;

    invoke-interface {v2}, Ls1/r;->e()Ls1/m1;

    move-result-object v2

    iget v2, v2, Ls1/m1;->E:I

    iget-object v3, p0, Lv8/p;->a:Ls1/r;

    invoke-interface {v3}, Ls1/r;->e()Ls1/m1;

    move-result-object v3

    iget v3, v3, Ls1/m1;->D:I

    :cond_1
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-string v4, "width"

    invoke-interface {v0, v4, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-string v3, "height"

    invoke-interface {v0, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v2, 0xb4

    if-ne v1, v2, :cond_2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "rotationCorrection"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    iget-object v1, p0, Lv8/p;->d:Lv8/o;

    invoke-virtual {v1, v0}, Lv8/o;->a(Ljava/lang/Object;)V

    :cond_3
    return-void
.end method

.method k(Z)V
    .locals 1

    iget-object v0, p0, Lv8/p;->a:Ls1/r;

    if-eqz p1, :cond_0

    const/4 p1, 0x2

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-interface {v0, p1}, Ls1/p2;->x(I)V

    return-void
.end method

.method l(D)V
    .locals 1

    new-instance v0, Ls1/o2;

    double-to-float p1, p1

    invoke-direct {v0, p1}, Ls1/o2;-><init>(F)V

    iget-object p1, p0, Lv8/p;->a:Ls1/r;

    invoke-interface {p1, v0}, Ls1/p2;->d(Ls1/o2;)V

    return-void
.end method

.method n(D)V
    .locals 2

    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    invoke-static {v0, v1, p1, p2}, Ljava/lang/Math;->min(DD)D

    move-result-wide p1

    const-wide/16 v0, 0x0

    invoke-static {v0, v1, p1, p2}, Ljava/lang/Math;->max(DD)D

    move-result-wide p1

    double-to-float p1, p1

    iget-object p2, p0, Lv8/p;->a:Ls1/r;

    invoke-interface {p2, p1}, Ls1/p2;->f(F)V

    return-void
.end method
