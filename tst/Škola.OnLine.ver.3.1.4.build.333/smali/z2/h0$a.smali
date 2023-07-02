.class final Lz2/h0$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lt3/h0$e;
.implements Lz2/m$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lz2/h0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "a"
.end annotation


# instance fields
.field private final a:J

.field private final b:Landroid/net/Uri;

.field private final c:Lt3/o0;

.field private final d:Lz2/c0;

.field private final e:Lc2/n;

.field private final f:Lu3/g;

.field private final g:Lc2/a0;

.field private volatile h:Z

.field private i:Z

.field private j:J

.field private k:Lt3/p;

.field private l:Lc2/e0;

.field private m:Z

.field final synthetic n:Lz2/h0;


# direct methods
.method public constructor <init>(Lz2/h0;Landroid/net/Uri;Lt3/l;Lz2/c0;Lc2/n;Lu3/g;)V
    .locals 0

    iput-object p1, p0, Lz2/h0$a;->n:Lz2/h0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lz2/h0$a;->b:Landroid/net/Uri;

    new-instance p1, Lt3/o0;

    invoke-direct {p1, p3}, Lt3/o0;-><init>(Lt3/l;)V

    iput-object p1, p0, Lz2/h0$a;->c:Lt3/o0;

    iput-object p4, p0, Lz2/h0$a;->d:Lz2/c0;

    iput-object p5, p0, Lz2/h0$a;->e:Lc2/n;

    iput-object p6, p0, Lz2/h0$a;->f:Lu3/g;

    new-instance p1, Lc2/a0;

    invoke-direct {p1}, Lc2/a0;-><init>()V

    iput-object p1, p0, Lz2/h0$a;->g:Lc2/a0;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lz2/h0$a;->i:Z

    invoke-static {}, Lz2/n;->a()J

    move-result-wide p1

    iput-wide p1, p0, Lz2/h0$a;->a:J

    const-wide/16 p1, 0x0

    invoke-direct {p0, p1, p2}, Lz2/h0$a;->i(J)Lt3/p;

    move-result-object p1

    iput-object p1, p0, Lz2/h0$a;->k:Lt3/p;

    return-void
.end method

.method static synthetic d(Lz2/h0$a;)Lt3/o0;
    .locals 0

    iget-object p0, p0, Lz2/h0$a;->c:Lt3/o0;

    return-object p0
.end method

.method static synthetic e(Lz2/h0$a;)J
    .locals 2

    iget-wide v0, p0, Lz2/h0$a;->a:J

    return-wide v0
.end method

.method static synthetic f(Lz2/h0$a;)Lt3/p;
    .locals 0

    iget-object p0, p0, Lz2/h0$a;->k:Lt3/p;

    return-object p0
.end method

.method static synthetic g(Lz2/h0$a;)J
    .locals 2

    iget-wide v0, p0, Lz2/h0$a;->j:J

    return-wide v0
.end method

.method static synthetic h(Lz2/h0$a;JJ)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lz2/h0$a;->j(JJ)V

    return-void
.end method

.method private i(J)Lt3/p;
    .locals 2

    new-instance v0, Lt3/p$b;

    invoke-direct {v0}, Lt3/p$b;-><init>()V

    iget-object v1, p0, Lz2/h0$a;->b:Landroid/net/Uri;

    invoke-virtual {v0, v1}, Lt3/p$b;->i(Landroid/net/Uri;)Lt3/p$b;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lt3/p$b;->h(J)Lt3/p$b;

    move-result-object p1

    iget-object p2, p0, Lz2/h0$a;->n:Lz2/h0;

    invoke-static {p2}, Lz2/h0;->D(Lz2/h0;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lt3/p$b;->f(Ljava/lang/String;)Lt3/p$b;

    move-result-object p1

    const/4 p2, 0x6

    invoke-virtual {p1, p2}, Lt3/p$b;->b(I)Lt3/p$b;

    move-result-object p1

    invoke-static {}, Lz2/h0;->C()Ljava/util/Map;

    move-result-object p2

    invoke-virtual {p1, p2}, Lt3/p$b;->e(Ljava/util/Map;)Lt3/p$b;

    move-result-object p1

    invoke-virtual {p1}, Lt3/p$b;->a()Lt3/p;

    move-result-object p1

    return-object p1
.end method

.method private j(JJ)V
    .locals 1

    iget-object v0, p0, Lz2/h0$a;->g:Lc2/a0;

    iput-wide p1, v0, Lc2/a0;->a:J

    iput-wide p3, p0, Lz2/h0$a;->j:J

    const/4 p1, 0x1

    iput-boolean p1, p0, Lz2/h0$a;->i:Z

    const/4 p1, 0x0

    iput-boolean p1, p0, Lz2/h0$a;->m:Z

    return-void
.end method


# virtual methods
.method public a()V
    .locals 17

    move-object/from16 v1, p0

    const/4 v0, 0x0

    move v2, v0

    :goto_0
    if-nez v2, :cond_9

    iget-boolean v3, v1, Lz2/h0$a;->h:Z

    if-nez v3, :cond_9

    const/4 v3, 0x1

    const-wide/16 v4, -0x1

    :try_start_0
    iget-object v6, v1, Lz2/h0$a;->g:Lc2/a0;

    iget-wide v13, v6, Lc2/a0;->a:J

    invoke-direct {v1, v13, v14}, Lz2/h0$a;->i(J)Lt3/p;

    move-result-object v6

    iput-object v6, v1, Lz2/h0$a;->k:Lt3/p;

    iget-object v7, v1, Lz2/h0$a;->c:Lt3/o0;

    invoke-virtual {v7, v6}, Lt3/o0;->f(Lt3/p;)J

    move-result-wide v6

    cmp-long v8, v6, v4

    if-eqz v8, :cond_0

    add-long/2addr v6, v13

    iget-object v8, v1, Lz2/h0$a;->n:Lz2/h0;

    invoke-static {v8}, Lz2/h0;->E(Lz2/h0;)V

    :cond_0
    move-wide v15, v6

    iget-object v6, v1, Lz2/h0$a;->n:Lz2/h0;

    iget-object v7, v1, Lz2/h0$a;->c:Lt3/o0;

    invoke-virtual {v7}, Lt3/o0;->h()Ljava/util/Map;

    move-result-object v7

    invoke-static {v7}, Lt2/b;->a(Ljava/util/Map;)Lt2/b;

    move-result-object v7

    invoke-static {v6, v7}, Lz2/h0;->G(Lz2/h0;Lt2/b;)Lt2/b;

    iget-object v6, v1, Lz2/h0$a;->c:Lt3/o0;

    iget-object v7, v1, Lz2/h0$a;->n:Lz2/h0;

    invoke-static {v7}, Lz2/h0;->F(Lz2/h0;)Lt2/b;

    move-result-object v7

    if-eqz v7, :cond_1

    iget-object v7, v1, Lz2/h0$a;->n:Lz2/h0;

    invoke-static {v7}, Lz2/h0;->F(Lz2/h0;)Lt2/b;

    move-result-object v7

    iget v7, v7, Lt2/b;->s:I

    const/4 v8, -0x1

    if-eq v7, v8, :cond_1

    new-instance v6, Lz2/m;

    iget-object v7, v1, Lz2/h0$a;->c:Lt3/o0;

    iget-object v8, v1, Lz2/h0$a;->n:Lz2/h0;

    invoke-static {v8}, Lz2/h0;->F(Lz2/h0;)Lt2/b;

    move-result-object v8

    iget v8, v8, Lt2/b;->s:I

    invoke-direct {v6, v7, v8, v1}, Lz2/m;-><init>(Lt3/l;ILz2/m$a;)V

    iget-object v7, v1, Lz2/h0$a;->n:Lz2/h0;

    invoke-virtual {v7}, Lz2/h0;->O()Lc2/e0;

    move-result-object v7

    iput-object v7, v1, Lz2/h0$a;->l:Lc2/e0;

    invoke-static {}, Lz2/h0;->H()Lx1/n1;

    move-result-object v8

    invoke-interface {v7, v8}, Lc2/e0;->a(Lx1/n1;)V

    :cond_1
    move-object v8, v6

    iget-object v7, v1, Lz2/h0$a;->d:Lz2/c0;

    iget-object v9, v1, Lz2/h0$a;->b:Landroid/net/Uri;

    iget-object v6, v1, Lz2/h0$a;->c:Lt3/o0;

    invoke-virtual {v6}, Lt3/o0;->h()Ljava/util/Map;

    move-result-object v10

    iget-object v6, v1, Lz2/h0$a;->e:Lc2/n;

    move-wide v11, v13

    move-wide v4, v13

    move-wide v13, v15

    move-object v15, v6

    invoke-interface/range {v7 .. v15}, Lz2/c0;->f(Lt3/i;Landroid/net/Uri;Ljava/util/Map;JJLc2/n;)V

    iget-object v6, v1, Lz2/h0$a;->n:Lz2/h0;

    invoke-static {v6}, Lz2/h0;->F(Lz2/h0;)Lt2/b;

    move-result-object v6

    if-eqz v6, :cond_2

    iget-object v6, v1, Lz2/h0$a;->d:Lz2/c0;

    invoke-interface {v6}, Lz2/c0;->e()V

    :cond_2
    iget-boolean v6, v1, Lz2/h0$a;->i:Z

    if-eqz v6, :cond_3

    iget-object v6, v1, Lz2/h0$a;->d:Lz2/c0;

    iget-wide v7, v1, Lz2/h0$a;->j:J

    invoke-interface {v6, v4, v5, v7, v8}, Lz2/c0;->b(JJ)V

    iput-boolean v0, v1, Lz2/h0$a;->i:Z

    :cond_3
    :goto_1
    move-wide v13, v4

    :cond_4
    if-nez v2, :cond_5

    iget-boolean v4, v1, Lz2/h0$a;->h:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v4, :cond_5

    :try_start_1
    iget-object v4, v1, Lz2/h0$a;->f:Lu3/g;

    invoke-virtual {v4}, Lu3/g;->a()V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    iget-object v4, v1, Lz2/h0$a;->d:Lz2/c0;

    iget-object v5, v1, Lz2/h0$a;->g:Lc2/a0;

    invoke-interface {v4, v5}, Lz2/c0;->c(Lc2/a0;)I

    move-result v2

    iget-object v4, v1, Lz2/h0$a;->d:Lz2/c0;

    invoke-interface {v4}, Lz2/c0;->d()J

    move-result-wide v4

    iget-object v6, v1, Lz2/h0$a;->n:Lz2/h0;

    invoke-static {v6}, Lz2/h0;->I(Lz2/h0;)J

    move-result-wide v6

    add-long/2addr v6, v13

    cmp-long v6, v4, v6

    if-lez v6, :cond_4

    iget-object v6, v1, Lz2/h0$a;->f:Lu3/g;

    invoke-virtual {v6}, Lu3/g;->c()Z

    iget-object v6, v1, Lz2/h0$a;->n:Lz2/h0;

    invoke-static {v6}, Lz2/h0;->A(Lz2/h0;)Landroid/os/Handler;

    move-result-object v6

    iget-object v7, v1, Lz2/h0$a;->n:Lz2/h0;

    invoke-static {v7}, Lz2/h0;->z(Lz2/h0;)Ljava/lang/Runnable;

    move-result-object v7

    invoke-virtual {v6, v7}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_1

    :catch_0
    new-instance v0, Ljava/io/InterruptedIOException;

    invoke-direct {v0}, Ljava/io/InterruptedIOException;-><init>()V

    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :cond_5
    if-ne v2, v3, :cond_6

    move v2, v0

    goto :goto_2

    :cond_6
    iget-object v3, v1, Lz2/h0$a;->d:Lz2/c0;

    invoke-interface {v3}, Lz2/c0;->d()J

    move-result-wide v3

    const-wide/16 v5, -0x1

    cmp-long v3, v3, v5

    if-eqz v3, :cond_7

    iget-object v3, v1, Lz2/h0$a;->g:Lc2/a0;

    iget-object v4, v1, Lz2/h0$a;->d:Lz2/c0;

    invoke-interface {v4}, Lz2/c0;->d()J

    move-result-wide v4

    iput-wide v4, v3, Lc2/a0;->a:J

    :cond_7
    :goto_2
    iget-object v3, v1, Lz2/h0$a;->c:Lt3/o0;

    invoke-static {v3}, Lt3/o;->a(Lt3/l;)V

    goto/16 :goto_0

    :catchall_0
    move-exception v0

    if-eq v2, v3, :cond_8

    iget-object v2, v1, Lz2/h0$a;->d:Lz2/c0;

    invoke-interface {v2}, Lz2/c0;->d()J

    move-result-wide v2

    const-wide/16 v4, -0x1

    cmp-long v2, v2, v4

    if-eqz v2, :cond_8

    iget-object v2, v1, Lz2/h0$a;->g:Lc2/a0;

    iget-object v3, v1, Lz2/h0$a;->d:Lz2/c0;

    invoke-interface {v3}, Lz2/c0;->d()J

    move-result-wide v3

    iput-wide v3, v2, Lc2/a0;->a:J

    :cond_8
    iget-object v2, v1, Lz2/h0$a;->c:Lt3/o0;

    invoke-static {v2}, Lt3/o;->a(Lt3/l;)V

    throw v0

    :cond_9
    return-void
.end method

.method public b()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lz2/h0$a;->h:Z

    return-void
.end method

.method public c(Lu3/a0;)V
    .locals 11

    iget-boolean v0, p0, Lz2/h0$a;->m:Z

    const/4 v1, 0x1

    if-nez v0, :cond_0

    iget-wide v2, p0, Lz2/h0$a;->j:J

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lz2/h0$a;->n:Lz2/h0;

    invoke-static {v0, v1}, Lz2/h0;->B(Lz2/h0;Z)J

    move-result-wide v2

    iget-wide v4, p0, Lz2/h0$a;->j:J

    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v2

    :goto_0
    move-wide v5, v2

    invoke-virtual {p1}, Lu3/a0;->a()I

    move-result v8

    iget-object v0, p0, Lz2/h0$a;->l:Lc2/e0;

    invoke-static {v0}, Lu3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lc2/e0;

    invoke-interface {v4, p1, v8}, Lc2/e0;->b(Lu3/a0;I)V

    const/4 v7, 0x1

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-interface/range {v4 .. v10}, Lc2/e0;->e(JIIILc2/e0$a;)V

    iput-boolean v1, p0, Lz2/h0$a;->m:Z

    return-void
.end method
