.class Lz6/d$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lz6/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# static fields
.field private static final k:Lu6/a;

.field private static final l:J


# instance fields
.field private final a:La7/a;

.field private final b:Z

.field private c:La7/l;

.field private d:La7/i;

.field private e:J

.field private f:D

.field private g:La7/i;

.field private h:La7/i;

.field private i:J

.field private j:J


# direct methods
.method static constructor <clinit>()V
    .locals 3

    invoke-static {}, Lu6/a;->e()Lu6/a;

    move-result-object v0

    sput-object v0, Lz6/d$a;->k:Lu6/a;

    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMicros(J)J

    move-result-wide v0

    sput-wide v0, Lz6/d$a;->l:J

    return-void
.end method

.method constructor <init>(La7/i;JLa7/a;Lcom/google/firebase/perf/config/a;Ljava/lang/String;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p4, p0, Lz6/d$a;->a:La7/a;

    iput-wide p2, p0, Lz6/d$a;->e:J

    iput-object p1, p0, Lz6/d$a;->d:La7/i;

    long-to-double p1, p2

    iput-wide p1, p0, Lz6/d$a;->f:D

    invoke-virtual {p4}, La7/a;->a()La7/l;

    move-result-object p1

    iput-object p1, p0, Lz6/d$a;->c:La7/l;

    invoke-direct {p0, p5, p6, p7}, Lz6/d$a;->g(Lcom/google/firebase/perf/config/a;Ljava/lang/String;Z)V

    iput-boolean p7, p0, Lz6/d$a;->b:Z

    return-void
.end method

.method private static c(Lcom/google/firebase/perf/config/a;Ljava/lang/String;)J
    .locals 1

    const-string v0, "Trace"

    if-ne p1, v0, :cond_0

    invoke-virtual {p0}, Lcom/google/firebase/perf/config/a;->E()J

    move-result-wide p0

    return-wide p0

    :cond_0
    invoke-virtual {p0}, Lcom/google/firebase/perf/config/a;->q()J

    move-result-wide p0

    return-wide p0
.end method

.method private static d(Lcom/google/firebase/perf/config/a;Ljava/lang/String;)J
    .locals 1

    const-string v0, "Trace"

    if-ne p1, v0, :cond_0

    invoke-virtual {p0}, Lcom/google/firebase/perf/config/a;->t()J

    move-result-wide p0

    return-wide p0

    :cond_0
    invoke-virtual {p0}, Lcom/google/firebase/perf/config/a;->t()J

    move-result-wide p0

    return-wide p0
.end method

.method private static e(Lcom/google/firebase/perf/config/a;Ljava/lang/String;)J
    .locals 1

    const-string v0, "Trace"

    if-ne p1, v0, :cond_0

    invoke-virtual {p0}, Lcom/google/firebase/perf/config/a;->F()J

    move-result-wide p0

    return-wide p0

    :cond_0
    invoke-virtual {p0}, Lcom/google/firebase/perf/config/a;->r()J

    move-result-wide p0

    return-wide p0
.end method

.method private static f(Lcom/google/firebase/perf/config/a;Ljava/lang/String;)J
    .locals 1

    const-string v0, "Trace"

    if-ne p1, v0, :cond_0

    invoke-virtual {p0}, Lcom/google/firebase/perf/config/a;->t()J

    move-result-wide p0

    return-wide p0

    :cond_0
    invoke-virtual {p0}, Lcom/google/firebase/perf/config/a;->t()J

    move-result-wide p0

    return-wide p0
.end method

.method private g(Lcom/google/firebase/perf/config/a;Ljava/lang/String;Z)V
    .locals 16

    move-object/from16 v0, p0

    invoke-static/range {p1 .. p2}, Lz6/d$a;->f(Lcom/google/firebase/perf/config/a;Ljava/lang/String;)J

    move-result-wide v4

    invoke-static/range {p1 .. p2}, Lz6/d$a;->e(Lcom/google/firebase/perf/config/a;Ljava/lang/String;)J

    move-result-wide v7

    new-instance v9, La7/i;

    sget-object v15, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    move-object v1, v9

    move-wide v2, v7

    move-object v6, v15

    invoke-direct/range {v1 .. v6}, La7/i;-><init>(JJLjava/util/concurrent/TimeUnit;)V

    iput-object v9, v0, Lz6/d$a;->g:La7/i;

    iput-wide v7, v0, Lz6/d$a;->i:J

    const/4 v1, 0x2

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x3

    if-eqz p3, :cond_0

    sget-object v5, Lz6/d$a;->k:Lu6/a;

    new-array v6, v4, [Ljava/lang/Object;

    aput-object p2, v6, v3

    aput-object v9, v6, v2

    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    aput-object v7, v6, v1

    const-string v7, "Foreground %s logging rate:%f, burst capacity:%d"

    invoke-virtual {v5, v7, v6}, Lu6/a;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    invoke-static/range {p1 .. p2}, Lz6/d$a;->d(Lcom/google/firebase/perf/config/a;Ljava/lang/String;)J

    move-result-wide v13

    invoke-static/range {p1 .. p2}, Lz6/d$a;->c(Lcom/google/firebase/perf/config/a;Ljava/lang/String;)J

    move-result-wide v5

    new-instance v7, La7/i;

    move-object v10, v7

    move-wide v11, v5

    invoke-direct/range {v10 .. v15}, La7/i;-><init>(JJLjava/util/concurrent/TimeUnit;)V

    iput-object v7, v0, Lz6/d$a;->h:La7/i;

    iput-wide v5, v0, Lz6/d$a;->j:J

    if-eqz p3, :cond_1

    sget-object v8, Lz6/d$a;->k:Lu6/a;

    new-array v4, v4, [Ljava/lang/Object;

    aput-object p2, v4, v3

    aput-object v7, v4, v2

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    aput-object v2, v4, v1

    const-string v1, "Background %s logging rate:%f, capacity:%d"

    invoke-virtual {v8, v1, v4}, Lu6/a;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_1
    return-void
.end method


# virtual methods
.method declared-synchronized a(Z)V
    .locals 2

    monitor-enter p0

    if-eqz p1, :cond_0

    :try_start_0
    iget-object v0, p0, Lz6/d$a;->g:La7/i;

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lz6/d$a;->h:La7/i;

    :goto_0
    iput-object v0, p0, Lz6/d$a;->d:La7/i;

    if-eqz p1, :cond_1

    iget-wide v0, p0, Lz6/d$a;->i:J

    goto :goto_1

    :cond_1
    iget-wide v0, p0, Lz6/d$a;->j:J

    :goto_1
    iput-wide v0, p0, Lz6/d$a;->e:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method declared-synchronized b(Lb7/i;)Z
    .locals 4

    monitor-enter p0

    :try_start_0
    iget-object p1, p0, Lz6/d$a;->a:La7/a;

    invoke-virtual {p1}, La7/a;->a()La7/l;

    move-result-object p1

    iget-object v0, p0, Lz6/d$a;->c:La7/l;

    invoke-virtual {v0, p1}, La7/l;->d(La7/l;)J

    move-result-wide v0

    long-to-double v0, v0

    iget-object v2, p0, Lz6/d$a;->d:La7/i;

    invoke-virtual {v2}, La7/i;->a()D

    move-result-wide v2

    mul-double/2addr v0, v2

    sget-wide v2, Lz6/d$a;->l:J

    long-to-double v2, v2

    div-double/2addr v0, v2

    const-wide/16 v2, 0x0

    cmpl-double v2, v0, v2

    if-lez v2, :cond_0

    iget-wide v2, p0, Lz6/d$a;->f:D

    add-double/2addr v2, v0

    iget-wide v0, p0, Lz6/d$a;->e:J

    long-to-double v0, v0

    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->min(DD)D

    move-result-wide v0

    iput-wide v0, p0, Lz6/d$a;->f:D

    iput-object p1, p0, Lz6/d$a;->c:La7/l;

    :cond_0
    iget-wide v0, p0, Lz6/d$a;->f:D

    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    cmpl-double p1, v0, v2

    if-ltz p1, :cond_1

    sub-double/2addr v0, v2

    iput-wide v0, p0, Lz6/d$a;->f:D
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 p1, 0x1

    :goto_0
    monitor-exit p0

    return p1

    :cond_1
    :try_start_1
    iget-boolean p1, p0, Lz6/d$a;->b:Z

    if-eqz p1, :cond_2

    sget-object p1, Lz6/d$a;->k:Lu6/a;

    const-string v0, "Exceeded log rate limit, dropping the log."

    invoke-virtual {p1, v0}, Lu6/a;->j(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_2
    const/4 p1, 0x0

    goto :goto_0

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method
