.class public final Lt1/q1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lt1/s1;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lt1/q1$a;
    }
.end annotation


# static fields
.field public static final h:La5/o;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "La5/o<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static final i:Ljava/util/Random;


# instance fields
.field private final a:Ls1/l3$d;

.field private final b:Ls1/l3$b;

.field private final c:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Lt1/q1$a;",
            ">;"
        }
    .end annotation
.end field

.field private final d:La5/o;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "La5/o<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private e:Lt1/s1$a;

.field private f:Ls1/l3;

.field private g:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lt1/p1;->n:Lt1/p1;

    sput-object v0, Lt1/q1;->h:La5/o;

    new-instance v0, Ljava/util/Random;

    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    sput-object v0, Lt1/q1;->i:Ljava/util/Random;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    sget-object v0, Lt1/q1;->h:La5/o;

    invoke-direct {p0, v0}, Lt1/q1;-><init>(La5/o;)V

    return-void
.end method

.method public constructor <init>(La5/o;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "La5/o<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt1/q1;->d:La5/o;

    new-instance p1, Ls1/l3$d;

    invoke-direct {p1}, Ls1/l3$d;-><init>()V

    iput-object p1, p0, Lt1/q1;->a:Ls1/l3$d;

    new-instance p1, Ls1/l3$b;

    invoke-direct {p1}, Ls1/l3$b;-><init>()V

    iput-object p1, p0, Lt1/q1;->b:Ls1/l3$b;

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lt1/q1;->c:Ljava/util/HashMap;

    sget-object p1, Ls1/l3;->n:Ls1/l3;

    iput-object p1, p0, Lt1/q1;->f:Ls1/l3;

    return-void
.end method

.method public static synthetic h()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lt1/q1;->k()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static synthetic i(Lt1/q1;)Ls1/l3$d;
    .locals 0

    iget-object p0, p0, Lt1/q1;->a:Ls1/l3$d;

    return-object p0
.end method

.method static synthetic j(Lt1/q1;)Ls1/l3$b;
    .locals 0

    iget-object p0, p0, Lt1/q1;->b:Ls1/l3$b;

    return-object p0
.end method

.method private static k()Ljava/lang/String;
    .locals 2

    const/16 v0, 0xc

    new-array v0, v0, [B

    sget-object v1, Lt1/q1;->i:Ljava/util/Random;

    invoke-virtual {v1, v0}, Ljava/util/Random;->nextBytes([B)V

    const/16 v1, 0xa

    invoke-static {v0, v1}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private l(ILu2/u$b;)Lt1/q1$a;
    .locals 9

    iget-object v0, p0, Lt1/q1;->c:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    const-wide v2, 0x7fffffffffffffffL

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lt1/q1$a;

    invoke-virtual {v4, p1, p2}, Lt1/q1$a;->k(ILu2/u$b;)V

    invoke-virtual {v4, p1, p2}, Lt1/q1$a;->i(ILu2/u$b;)Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-static {v4}, Lt1/q1$a;->b(Lt1/q1$a;)J

    move-result-wide v5

    const-wide/16 v7, -0x1

    cmp-long v7, v5, v7

    if-eqz v7, :cond_2

    cmp-long v7, v5, v2

    if-gez v7, :cond_1

    goto :goto_1

    :cond_1
    if-nez v7, :cond_0

    invoke-static {v1}, Lp3/m0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lt1/q1$a;

    invoke-static {v5}, Lt1/q1$a;->h(Lt1/q1$a;)Lu2/u$b;

    move-result-object v5

    if-eqz v5, :cond_0

    invoke-static {v4}, Lt1/q1$a;->h(Lt1/q1$a;)Lu2/u$b;

    move-result-object v5

    if-eqz v5, :cond_0

    move-object v1, v4

    goto :goto_0

    :cond_2
    :goto_1
    move-object v1, v4

    move-wide v2, v5

    goto :goto_0

    :cond_3
    if-nez v1, :cond_4

    iget-object v0, p0, Lt1/q1;->d:La5/o;

    invoke-interface {v0}, La5/o;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    new-instance v1, Lt1/q1$a;

    invoke-direct {v1, p0, v0, p1, p2}, Lt1/q1$a;-><init>(Lt1/q1;Ljava/lang/String;ILu2/u$b;)V

    iget-object p1, p0, Lt1/q1;->c:Ljava/util/HashMap;

    invoke-virtual {p1, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_4
    return-object v1
.end method

.method private m(Lt1/c$a;)V
    .locals 6
    .annotation runtime Lorg/checkerframework/checker/nullness/qual/RequiresNonNull;
        value = {
            "listener"
        }
    .end annotation

    iget-object v0, p1, Lt1/c$a;->b:Ls1/l3;

    invoke-virtual {v0}, Ls1/l3;->u()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    iput-object p1, p0, Lt1/q1;->g:Ljava/lang/String;

    return-void

    :cond_0
    iget-object v0, p0, Lt1/q1;->c:Ljava/util/HashMap;

    iget-object v1, p0, Lt1/q1;->g:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lt1/q1$a;

    iget v1, p1, Lt1/c$a;->c:I

    iget-object v2, p1, Lt1/c$a;->d:Lu2/u$b;

    invoke-direct {p0, v1, v2}, Lt1/q1;->l(ILu2/u$b;)Lt1/q1$a;

    move-result-object v1

    invoke-static {v1}, Lt1/q1$a;->a(Lt1/q1$a;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lt1/q1;->g:Ljava/lang/String;

    invoke-virtual {p0, p1}, Lt1/q1;->e(Lt1/c$a;)V

    iget-object v2, p1, Lt1/c$a;->d:Lu2/u$b;

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Lu2/s;->b()Z

    move-result v2

    if-eqz v2, :cond_2

    if-eqz v0, :cond_1

    invoke-static {v0}, Lt1/q1$a;->b(Lt1/q1$a;)J

    move-result-wide v2

    iget-object v4, p1, Lt1/c$a;->d:Lu2/u$b;

    iget-wide v4, v4, Lu2/s;->d:J

    cmp-long v2, v2, v4

    if-nez v2, :cond_1

    invoke-static {v0}, Lt1/q1$a;->h(Lt1/q1$a;)Lu2/u$b;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-static {v0}, Lt1/q1$a;->h(Lt1/q1$a;)Lu2/u$b;

    move-result-object v2

    iget v2, v2, Lu2/s;->b:I

    iget-object v3, p1, Lt1/c$a;->d:Lu2/u$b;

    iget v3, v3, Lu2/s;->b:I

    if-ne v2, v3, :cond_1

    invoke-static {v0}, Lt1/q1$a;->h(Lt1/q1$a;)Lu2/u$b;

    move-result-object v0

    iget v0, v0, Lu2/s;->c:I

    iget-object v2, p1, Lt1/c$a;->d:Lu2/u$b;

    iget v2, v2, Lu2/s;->c:I

    if-eq v0, v2, :cond_2

    :cond_1
    new-instance v0, Lu2/u$b;

    iget-object v2, p1, Lt1/c$a;->d:Lu2/u$b;

    iget-object v3, v2, Lu2/s;->a:Ljava/lang/Object;

    iget-wide v4, v2, Lu2/s;->d:J

    invoke-direct {v0, v3, v4, v5}, Lu2/u$b;-><init>(Ljava/lang/Object;J)V

    iget v2, p1, Lt1/c$a;->c:I

    invoke-direct {p0, v2, v0}, Lt1/q1;->l(ILu2/u$b;)Lt1/q1$a;

    move-result-object v0

    iget-object v2, p0, Lt1/q1;->e:Lt1/s1$a;

    invoke-static {v0}, Lt1/q1$a;->a(Lt1/q1$a;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v1}, Lt1/q1$a;->a(Lt1/q1$a;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v2, p1, v0, v1}, Lt1/s1$a;->P(Lt1/c$a;Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    return-void
.end method


# virtual methods
.method public declared-synchronized a(Lt1/c$a;)V
    .locals 5

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lt1/q1;->e:Lt1/s1$a;

    invoke-static {v0}, Lp3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lt1/q1;->f:Ls1/l3;

    iget-object v1, p1, Lt1/c$a;->b:Ls1/l3;

    iput-object v1, p0, Lt1/q1;->f:Ls1/l3;

    iget-object v1, p0, Lt1/q1;->c:Ljava/util/HashMap;

    invoke-virtual {v1}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lt1/q1$a;

    iget-object v3, p0, Lt1/q1;->f:Ls1/l3;

    invoke-virtual {v2, v0, v3}, Lt1/q1$a;->m(Ls1/l3;Ls1/l3;)Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-virtual {v2, p1}, Lt1/q1$a;->j(Lt1/c$a;)Z

    move-result v3

    if-eqz v3, :cond_0

    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->remove()V

    invoke-static {v2}, Lt1/q1$a;->d(Lt1/q1$a;)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-static {v2}, Lt1/q1$a;->a(Lt1/q1$a;)Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Lt1/q1;->g:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    const/4 v3, 0x0

    iput-object v3, p0, Lt1/q1;->g:Ljava/lang/String;

    :cond_2
    iget-object v3, p0, Lt1/q1;->e:Lt1/s1$a;

    invoke-static {v2}, Lt1/q1$a;->a(Lt1/q1$a;)Ljava/lang/String;

    move-result-object v2

    const/4 v4, 0x0

    invoke-interface {v3, p1, v2, v4}, Lt1/s1$a;->R(Lt1/c$a;Ljava/lang/String;Z)V

    goto :goto_0

    :cond_3
    invoke-direct {p0, p1}, Lt1/q1;->m(Lt1/c$a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized b(Lt1/c$a;I)V
    .locals 6

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lt1/q1;->e:Lt1/s1$a;

    invoke-static {v0}, Lp3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-nez p2, :cond_0

    move p2, v0

    goto :goto_0

    :cond_0
    move p2, v1

    :goto_0
    iget-object v2, p0, Lt1/q1;->c:Ljava/util/HashMap;

    invoke-virtual {v2}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lt1/q1$a;

    invoke-virtual {v3, p1}, Lt1/q1$a;->j(Lt1/c$a;)Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->remove()V

    invoke-static {v3}, Lt1/q1$a;->d(Lt1/q1$a;)Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-static {v3}, Lt1/q1$a;->a(Lt1/q1$a;)Ljava/lang/String;

    move-result-object v4

    iget-object v5, p0, Lt1/q1;->g:Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz p2, :cond_2

    if-eqz v4, :cond_2

    invoke-static {v3}, Lt1/q1$a;->f(Lt1/q1$a;)Z

    move-result v5

    if-eqz v5, :cond_2

    move v5, v0

    goto :goto_2

    :cond_2
    move v5, v1

    :goto_2
    if-eqz v4, :cond_3

    const/4 v4, 0x0

    iput-object v4, p0, Lt1/q1;->g:Ljava/lang/String;

    :cond_3
    iget-object v4, p0, Lt1/q1;->e:Lt1/s1$a;

    invoke-static {v3}, Lt1/q1$a;->a(Lt1/q1$a;)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v4, p1, v3, v5}, Lt1/s1$a;->R(Lt1/c$a;Ljava/lang/String;Z)V

    goto :goto_1

    :cond_4
    invoke-direct {p0, p1}, Lt1/q1;->m(Lt1/c$a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized c()Ljava/lang/String;
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lt1/q1;->g:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized d(Ls1/l3;Lu2/u$b;)Ljava/lang/String;
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-object v0, p2, Lu2/s;->a:Ljava/lang/Object;

    iget-object v1, p0, Lt1/q1;->b:Ls1/l3$b;

    invoke-virtual {p1, v0, v1}, Ls1/l3;->l(Ljava/lang/Object;Ls1/l3$b;)Ls1/l3$b;

    move-result-object p1

    iget p1, p1, Ls1/l3$b;->p:I

    invoke-direct {p0, p1, p2}, Lt1/q1;->l(ILu2/u$b;)Lt1/q1$a;

    move-result-object p1

    invoke-static {p1}, Lt1/q1$a;->a(Lt1/q1$a;)Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized e(Lt1/c$a;)V
    .locals 24

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    monitor-enter p0

    :try_start_0
    iget-object v2, v1, Lt1/q1;->e:Lt1/s1$a;

    invoke-static {v2}, Lp3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v2, v0, Lt1/c$a;->b:Ls1/l3;

    invoke-virtual {v2}, Ls1/l3;->u()Z

    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v2, :cond_0

    monitor-exit p0

    return-void

    :cond_0
    :try_start_1
    iget-object v2, v1, Lt1/q1;->c:Ljava/util/HashMap;

    iget-object v3, v1, Lt1/q1;->g:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lt1/q1$a;

    iget-object v3, v0, Lt1/c$a;->d:Lu2/u$b;

    const/4 v4, 0x1

    if-eqz v3, :cond_3

    if-eqz v2, :cond_3

    invoke-static {v2}, Lt1/q1$a;->b(Lt1/q1$a;)J

    move-result-wide v5

    const-wide/16 v7, -0x1

    cmp-long v3, v5, v7

    const/4 v5, 0x0

    if-nez v3, :cond_1

    invoke-static {v2}, Lt1/q1$a;->c(Lt1/q1$a;)I

    move-result v2

    iget v3, v0, Lt1/c$a;->c:I

    if-eq v2, v3, :cond_2

    :goto_0
    move v5, v4

    goto :goto_1

    :cond_1
    iget-object v3, v0, Lt1/c$a;->d:Lu2/u$b;

    iget-wide v6, v3, Lu2/s;->d:J

    invoke-static {v2}, Lt1/q1$a;->b(Lt1/q1$a;)J

    move-result-wide v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    cmp-long v2, v6, v2

    if-gez v2, :cond_2

    goto :goto_0

    :cond_2
    :goto_1
    if-eqz v5, :cond_3

    monitor-exit p0

    return-void

    :cond_3
    :try_start_2
    iget v2, v0, Lt1/c$a;->c:I

    iget-object v3, v0, Lt1/c$a;->d:Lu2/u$b;

    invoke-direct {v1, v2, v3}, Lt1/q1;->l(ILu2/u$b;)Lt1/q1$a;

    move-result-object v2

    iget-object v3, v1, Lt1/q1;->g:Ljava/lang/String;

    if-nez v3, :cond_4

    invoke-static {v2}, Lt1/q1$a;->a(Lt1/q1$a;)Ljava/lang/String;

    move-result-object v3

    iput-object v3, v1, Lt1/q1;->g:Ljava/lang/String;

    :cond_4
    iget-object v3, v0, Lt1/c$a;->d:Lu2/u$b;

    if-eqz v3, :cond_5

    invoke-virtual {v3}, Lu2/s;->b()Z

    move-result v3

    if-eqz v3, :cond_5

    new-instance v10, Lu2/u$b;

    iget-object v3, v0, Lt1/c$a;->d:Lu2/u$b;

    iget-object v5, v3, Lu2/s;->a:Ljava/lang/Object;

    iget-wide v6, v3, Lu2/s;->d:J

    iget v3, v3, Lu2/s;->b:I

    invoke-direct {v10, v5, v6, v7, v3}, Lu2/u$b;-><init>(Ljava/lang/Object;JI)V

    iget v3, v0, Lt1/c$a;->c:I

    invoke-direct {v1, v3, v10}, Lt1/q1;->l(ILu2/u$b;)Lt1/q1$a;

    move-result-object v3

    invoke-static {v3}, Lt1/q1$a;->d(Lt1/q1$a;)Z

    move-result v5

    if-nez v5, :cond_5

    invoke-static {v3, v4}, Lt1/q1$a;->e(Lt1/q1$a;Z)Z

    iget-object v5, v0, Lt1/c$a;->b:Ls1/l3;

    iget-object v6, v0, Lt1/c$a;->d:Lu2/u$b;

    iget-object v6, v6, Lu2/s;->a:Ljava/lang/Object;

    iget-object v7, v1, Lt1/q1;->b:Ls1/l3$b;

    invoke-virtual {v5, v6, v7}, Ls1/l3;->l(Ljava/lang/Object;Ls1/l3$b;)Ls1/l3$b;

    iget-object v5, v1, Lt1/q1;->b:Ls1/l3$b;

    iget-object v6, v0, Lt1/c$a;->d:Lu2/u$b;

    iget v6, v6, Lu2/s;->b:I

    invoke-virtual {v5, v6}, Ls1/l3$b;->i(I)J

    move-result-wide v5

    invoke-static {v5, v6}, Lp3/m0;->X0(J)J

    move-result-wide v5

    iget-object v7, v1, Lt1/q1;->b:Ls1/l3$b;

    invoke-virtual {v7}, Ls1/l3$b;->p()J

    move-result-wide v7

    add-long/2addr v5, v7

    const-wide/16 v7, 0x0

    invoke-static {v7, v8, v5, v6}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v11

    new-instance v15, Lt1/c$a;

    iget-wide v6, v0, Lt1/c$a;->a:J

    iget-object v8, v0, Lt1/c$a;->b:Ls1/l3;

    iget v9, v0, Lt1/c$a;->c:I

    iget-object v13, v0, Lt1/c$a;->f:Ls1/l3;

    iget v14, v0, Lt1/c$a;->g:I

    iget-object v5, v0, Lt1/c$a;->h:Lu2/u$b;

    move-object/from16 v16, v5

    iget-wide v4, v0, Lt1/c$a;->i:J

    move-object/from16 v20, v2

    move-object/from16 v21, v3

    iget-wide v2, v0, Lt1/c$a;->j:J

    move-wide/from16 v22, v4

    move-object/from16 v4, v16

    move-wide/from16 v16, v22

    move-object v5, v15

    move-object v0, v15

    move-object v15, v4

    move-wide/from16 v18, v2

    invoke-direct/range {v5 .. v19}, Lt1/c$a;-><init>(JLs1/l3;ILu2/u$b;JLs1/l3;ILu2/u$b;JJ)V

    iget-object v2, v1, Lt1/q1;->e:Lt1/s1$a;

    invoke-static/range {v21 .. v21}, Lt1/q1$a;->a(Lt1/q1$a;)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v0, v3}, Lt1/s1$a;->S(Lt1/c$a;Ljava/lang/String;)V

    goto :goto_2

    :cond_5
    move-object/from16 v20, v2

    :goto_2
    invoke-static/range {v20 .. v20}, Lt1/q1$a;->d(Lt1/q1$a;)Z

    move-result v0

    if-nez v0, :cond_6

    move-object/from16 v0, v20

    const/4 v2, 0x1

    invoke-static {v0, v2}, Lt1/q1$a;->e(Lt1/q1$a;Z)Z

    iget-object v2, v1, Lt1/q1;->e:Lt1/s1$a;

    invoke-static {v0}, Lt1/q1$a;->a(Lt1/q1$a;)Ljava/lang/String;

    move-result-object v3

    move-object/from16 v4, p1

    invoke-interface {v2, v4, v3}, Lt1/s1$a;->S(Lt1/c$a;Ljava/lang/String;)V

    goto :goto_3

    :cond_6
    move-object/from16 v4, p1

    move-object/from16 v0, v20

    :goto_3
    invoke-static {v0}, Lt1/q1$a;->a(Lt1/q1$a;)Ljava/lang/String;

    move-result-object v2

    iget-object v3, v1, Lt1/q1;->g:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_7

    invoke-static {v0}, Lt1/q1$a;->f(Lt1/q1$a;)Z

    move-result v2

    if-nez v2, :cond_7

    const/4 v2, 0x1

    invoke-static {v0, v2}, Lt1/q1$a;->g(Lt1/q1$a;Z)Z

    iget-object v2, v1, Lt1/q1;->e:Lt1/s1$a;

    invoke-static {v0}, Lt1/q1$a;->a(Lt1/q1$a;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v2, v4, v0}, Lt1/s1$a;->Q(Lt1/c$a;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :cond_7
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized f(Lt1/c$a;)V
    .locals 4

    monitor-enter p0

    const/4 v0, 0x0

    :try_start_0
    iput-object v0, p0, Lt1/q1;->g:Ljava/lang/String;

    iget-object v0, p0, Lt1/q1;->c:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lt1/q1$a;

    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    invoke-static {v1}, Lt1/q1$a;->d(Lt1/q1$a;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v2, p0, Lt1/q1;->e:Lt1/s1$a;

    if-eqz v2, :cond_0

    invoke-static {v1}, Lt1/q1$a;->a(Lt1/q1$a;)Ljava/lang/String;

    move-result-object v1

    const/4 v3, 0x0

    invoke-interface {v2, p1, v1, v3}, Lt1/s1$a;->R(Lt1/c$a;Ljava/lang/String;Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :cond_1
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public g(Lt1/s1$a;)V
    .locals 0

    iput-object p1, p0, Lt1/q1;->e:Lt1/s1$a;

    return-void
.end method
