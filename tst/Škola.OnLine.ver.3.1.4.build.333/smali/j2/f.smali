.class public final Lj2/f;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lc2/l;


# static fields
.field public static final u:Lc2/r;

.field private static final v:Lu2/h$a;


# instance fields
.field private final a:I

.field private final b:J

.field private final c:Lu3/a0;

.field private final d:Lz1/h0$a;

.field private final e:Lc2/x;

.field private final f:Lc2/y;

.field private final g:Lc2/e0;

.field private h:Lc2/n;

.field private i:Lc2/e0;

.field private j:Lc2/e0;

.field private k:I

.field private l:Lp2/a;

.field private m:J

.field private n:J

.field private o:J

.field private p:I

.field private q:Lj2/g;

.field private r:Z

.field private s:Z

.field private t:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lj2/d;->b:Lj2/d;

    sput-object v0, Lj2/f;->u:Lc2/r;

    sget-object v0, Lj2/e;->a:Lj2/e;

    sput-object v0, Lj2/f;->v:Lu2/h$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lj2/f;-><init>(I)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 2

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    invoke-direct {p0, p1, v0, v1}, Lj2/f;-><init>(IJ)V

    return-void
.end method

.method public constructor <init>(IJ)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    and-int/lit8 v0, p1, 0x2

    if-eqz v0, :cond_0

    or-int/lit8 p1, p1, 0x1

    :cond_0
    iput p1, p0, Lj2/f;->a:I

    iput-wide p2, p0, Lj2/f;->b:J

    new-instance p1, Lu3/a0;

    const/16 p2, 0xa

    invoke-direct {p1, p2}, Lu3/a0;-><init>(I)V

    iput-object p1, p0, Lj2/f;->c:Lu3/a0;

    new-instance p1, Lz1/h0$a;

    invoke-direct {p1}, Lz1/h0$a;-><init>()V

    iput-object p1, p0, Lj2/f;->d:Lz1/h0$a;

    new-instance p1, Lc2/x;

    invoke-direct {p1}, Lc2/x;-><init>()V

    iput-object p1, p0, Lj2/f;->e:Lc2/x;

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide p1, p0, Lj2/f;->m:J

    new-instance p1, Lc2/y;

    invoke-direct {p1}, Lc2/y;-><init>()V

    iput-object p1, p0, Lj2/f;->f:Lc2/y;

    new-instance p1, Lc2/k;

    invoke-direct {p1}, Lc2/k;-><init>()V

    iput-object p1, p0, Lj2/f;->g:Lc2/e0;

    iput-object p1, p0, Lj2/f;->j:Lc2/e0;

    return-void
.end method

.method public static synthetic d()[Lc2/l;
    .locals 1

    invoke-static {}, Lj2/f;->p()[Lc2/l;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic e(IIIII)Z
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lj2/f;->q(IIIII)Z

    move-result p0

    return p0
.end method

.method private f()V
    .locals 1
    .annotation runtime Lorg/checkerframework/checker/nullness/qual/EnsuresNonNull;
        value = {
            "extractorOutput",
            "realTrackOutput"
        }
    .end annotation

    iget-object v0, p0, Lj2/f;->i:Lc2/e0;

    invoke-static {v0}, Lu3/a;->h(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lj2/f;->h:Lc2/n;

    invoke-static {v0}, Lu3/n0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private h(Lc2/m;)Lj2/g;
    .locals 11

    invoke-direct {p0, p1}, Lj2/f;->s(Lc2/m;)Lj2/g;

    move-result-object v0

    iget-object v1, p0, Lj2/f;->l:Lp2/a;

    invoke-interface {p1}, Lc2/m;->q()J

    move-result-wide v2

    invoke-static {v1, v2, v3}, Lj2/f;->r(Lp2/a;J)Lj2/c;

    move-result-object v1

    iget-boolean v2, p0, Lj2/f;->r:Z

    if-eqz v2, :cond_0

    new-instance p1, Lj2/g$a;

    invoke-direct {p1}, Lj2/g$a;-><init>()V

    return-object p1

    :cond_0
    const/4 v2, 0x0

    iget v3, p0, Lj2/f;->a:I

    and-int/lit8 v3, v3, 0x4

    if-eqz v3, :cond_3

    const-wide/16 v2, -0x1

    if-eqz v1, :cond_1

    invoke-interface {v1}, Lc2/b0;->i()J

    move-result-wide v2

    invoke-interface {v1}, Lj2/g;->e()J

    move-result-wide v0

    :goto_0
    move-wide v9, v0

    move-wide v5, v2

    goto :goto_1

    :cond_1
    if-eqz v0, :cond_2

    invoke-interface {v0}, Lc2/b0;->i()J

    move-result-wide v2

    invoke-interface {v0}, Lj2/g;->e()J

    move-result-wide v0

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lj2/f;->l:Lp2/a;

    invoke-static {v0}, Lj2/f;->m(Lp2/a;)J

    move-result-wide v0

    move-wide v5, v0

    move-wide v9, v2

    :goto_1
    new-instance v0, Lj2/b;

    invoke-interface {p1}, Lc2/m;->q()J

    move-result-wide v7

    move-object v4, v0

    invoke-direct/range {v4 .. v10}, Lj2/b;-><init>(JJJ)V

    goto :goto_2

    :cond_3
    if-eqz v1, :cond_4

    move-object v0, v1

    goto :goto_2

    :cond_4
    if-eqz v0, :cond_5

    goto :goto_2

    :cond_5
    move-object v0, v2

    :goto_2
    const/4 v1, 0x1

    if-eqz v0, :cond_6

    invoke-interface {v0}, Lc2/b0;->f()Z

    move-result v2

    if-nez v2, :cond_8

    iget v2, p0, Lj2/f;->a:I

    and-int/2addr v2, v1

    if-eqz v2, :cond_8

    :cond_6
    iget v0, p0, Lj2/f;->a:I

    and-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_7

    goto :goto_3

    :cond_7
    const/4 v1, 0x0

    :goto_3
    invoke-direct {p0, p1, v1}, Lj2/f;->l(Lc2/m;Z)Lj2/g;

    move-result-object v0

    :cond_8
    return-object v0
.end method

.method private i(J)J
    .locals 4

    iget-wide v0, p0, Lj2/f;->m:J

    const-wide/32 v2, 0xf4240

    mul-long/2addr p1, v2

    iget-object v2, p0, Lj2/f;->d:Lz1/h0$a;

    iget v2, v2, Lz1/h0$a;->d:I

    int-to-long v2, v2

    div-long/2addr p1, v2

    add-long/2addr v0, p1

    return-wide v0
.end method

.method private l(Lc2/m;Z)Lj2/g;
    .locals 9

    iget-object v0, p0, Lj2/f;->c:Lu3/a0;

    invoke-virtual {v0}, Lu3/a0;->e()[B

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x4

    invoke-interface {p1, v0, v1, v2}, Lc2/m;->o([BII)V

    iget-object v0, p0, Lj2/f;->c:Lu3/a0;

    invoke-virtual {v0, v1}, Lu3/a0;->R(I)V

    iget-object v0, p0, Lj2/f;->d:Lz1/h0$a;

    iget-object v1, p0, Lj2/f;->c:Lu3/a0;

    invoke-virtual {v1}, Lu3/a0;->n()I

    move-result v1

    invoke-virtual {v0, v1}, Lz1/h0$a;->a(I)Z

    new-instance v0, Lj2/a;

    invoke-interface {p1}, Lc2/m;->a()J

    move-result-wide v3

    invoke-interface {p1}, Lc2/m;->q()J

    move-result-wide v5

    iget-object v7, p0, Lj2/f;->d:Lz1/h0$a;

    move-object v2, v0

    move v8, p2

    invoke-direct/range {v2 .. v8}, Lj2/a;-><init>(JJLz1/h0$a;Z)V

    return-object v0
.end method

.method private static m(Lp2/a;)J
    .locals 6

    if-eqz p0, :cond_1

    invoke-virtual {p0}, Lp2/a;->e()I

    move-result v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_1

    invoke-virtual {p0, v2}, Lp2/a;->d(I)Lp2/a$b;

    move-result-object v3

    instance-of v4, v3, Lu2/m;

    if-eqz v4, :cond_0

    check-cast v3, Lu2/m;

    iget-object v4, v3, Lu2/i;->n:Ljava/lang/String;

    const-string v5, "TLEN"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    iget-object p0, v3, Lu2/m;->q:Lg5/q;

    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    invoke-static {p0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-static {v0, v1}, Lu3/n0;->B0(J)J

    move-result-wide v0

    return-wide v0

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    return-wide v0
.end method

.method private static n(Lu3/a0;I)I
    .locals 2

    invoke-virtual {p0}, Lu3/a0;->g()I

    move-result v0

    add-int/lit8 v1, p1, 0x4

    if-lt v0, v1, :cond_1

    invoke-virtual {p0, p1}, Lu3/a0;->R(I)V

    invoke-virtual {p0}, Lu3/a0;->n()I

    move-result p1

    const v0, 0x58696e67

    if-eq p1, v0, :cond_0

    const v0, 0x496e666f

    if-ne p1, v0, :cond_1

    :cond_0
    return p1

    :cond_1
    invoke-virtual {p0}, Lu3/a0;->g()I

    move-result p1

    const/16 v0, 0x28

    if-lt p1, v0, :cond_2

    const/16 p1, 0x24

    invoke-virtual {p0, p1}, Lu3/a0;->R(I)V

    invoke-virtual {p0}, Lu3/a0;->n()I

    move-result p0

    const p1, 0x56425249

    if-ne p0, p1, :cond_2

    return p1

    :cond_2
    const/4 p0, 0x0

    return p0
.end method

.method private static o(IJ)Z
    .locals 4

    const v0, -0x1f400

    and-int/2addr p0, v0

    int-to-long v0, p0

    const-wide/32 v2, -0x1f400

    and-long p0, p1, v2

    cmp-long p0, v0, p0

    if-nez p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private static synthetic p()[Lc2/l;
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Lc2/l;

    new-instance v1, Lj2/f;

    invoke-direct {v1}, Lj2/f;-><init>()V

    const/4 v2, 0x0

    aput-object v1, v0, v2

    return-object v0
.end method

.method private static synthetic q(IIIII)Z
    .locals 3

    const/4 v0, 0x2

    const/16 v1, 0x4d

    const/16 v2, 0x43

    if-ne p1, v2, :cond_0

    const/16 v2, 0x4f

    if-ne p2, v2, :cond_0

    if-ne p3, v1, :cond_0

    if-eq p4, v1, :cond_1

    if-eq p0, v0, :cond_1

    :cond_0
    if-ne p1, v1, :cond_2

    const/16 p1, 0x4c

    if-ne p2, p1, :cond_2

    if-ne p3, p1, :cond_2

    const/16 p1, 0x54

    if-eq p4, p1, :cond_1

    if-ne p0, v0, :cond_2

    :cond_1
    const/4 p0, 0x1

    goto :goto_0

    :cond_2
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private static r(Lp2/a;J)Lj2/c;
    .locals 4

    if-eqz p0, :cond_1

    invoke-virtual {p0}, Lp2/a;->e()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    invoke-virtual {p0, v1}, Lp2/a;->d(I)Lp2/a$b;

    move-result-object v2

    instance-of v3, v2, Lu2/k;

    if-eqz v3, :cond_0

    check-cast v2, Lu2/k;

    invoke-static {p0}, Lj2/f;->m(Lp2/a;)J

    move-result-wide v0

    invoke-static {p1, p2, v2, v0, v1}, Lj2/c;->a(JLu2/k;J)Lj2/c;

    move-result-object p0

    return-object p0

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method private s(Lc2/m;)Lj2/g;
    .locals 10

    new-instance v5, Lu3/a0;

    iget-object v0, p0, Lj2/f;->d:Lz1/h0$a;

    iget v0, v0, Lz1/h0$a;->c:I

    invoke-direct {v5, v0}, Lu3/a0;-><init>(I)V

    invoke-virtual {v5}, Lu3/a0;->e()[B

    move-result-object v0

    iget-object v1, p0, Lj2/f;->d:Lz1/h0$a;

    iget v1, v1, Lz1/h0$a;->c:I

    const/4 v6, 0x0

    invoke-interface {p1, v0, v6, v1}, Lc2/m;->o([BII)V

    iget-object v0, p0, Lj2/f;->d:Lz1/h0$a;

    iget v1, v0, Lz1/h0$a;->a:I

    const/4 v2, 0x1

    and-int/2addr v1, v2

    const/16 v3, 0x15

    iget v0, v0, Lz1/h0$a;->e:I

    if-eqz v1, :cond_0

    if-eq v0, v2, :cond_2

    const/16 v3, 0x24

    goto :goto_0

    :cond_0
    if-eq v0, v2, :cond_1

    goto :goto_0

    :cond_1
    const/16 v3, 0xd

    :cond_2
    :goto_0
    move v7, v3

    invoke-static {v5, v7}, Lj2/f;->n(Lu3/a0;I)I

    move-result v8

    const v0, 0x58696e67

    const v9, 0x496e666f

    if-eq v8, v0, :cond_5

    if-ne v8, v9, :cond_3

    goto :goto_1

    :cond_3
    const v0, 0x56425249

    if-ne v8, v0, :cond_4

    invoke-interface {p1}, Lc2/m;->a()J

    move-result-wide v0

    invoke-interface {p1}, Lc2/m;->q()J

    move-result-wide v2

    iget-object v4, p0, Lj2/f;->d:Lz1/h0$a;

    invoke-static/range {v0 .. v5}, Lj2/h;->a(JJLz1/h0$a;Lu3/a0;)Lj2/h;

    move-result-object v0

    iget-object v1, p0, Lj2/f;->d:Lz1/h0$a;

    iget v1, v1, Lz1/h0$a;->c:I

    invoke-interface {p1, v1}, Lc2/m;->j(I)V

    goto :goto_2

    :cond_4
    const/4 v0, 0x0

    invoke-interface {p1}, Lc2/m;->i()V

    goto :goto_2

    :cond_5
    :goto_1
    invoke-interface {p1}, Lc2/m;->a()J

    move-result-wide v0

    invoke-interface {p1}, Lc2/m;->q()J

    move-result-wide v2

    iget-object v4, p0, Lj2/f;->d:Lz1/h0$a;

    invoke-static/range {v0 .. v5}, Lj2/i;->a(JJLz1/h0$a;Lu3/a0;)Lj2/i;

    move-result-object v0

    if-eqz v0, :cond_6

    iget-object v1, p0, Lj2/f;->e:Lc2/x;

    invoke-virtual {v1}, Lc2/x;->a()Z

    move-result v1

    if-nez v1, :cond_6

    invoke-interface {p1}, Lc2/m;->i()V

    add-int/lit16 v7, v7, 0x8d

    invoke-interface {p1, v7}, Lc2/m;->p(I)V

    iget-object v1, p0, Lj2/f;->c:Lu3/a0;

    invoke-virtual {v1}, Lu3/a0;->e()[B

    move-result-object v1

    const/4 v2, 0x3

    invoke-interface {p1, v1, v6, v2}, Lc2/m;->o([BII)V

    iget-object v1, p0, Lj2/f;->c:Lu3/a0;

    invoke-virtual {v1, v6}, Lu3/a0;->R(I)V

    iget-object v1, p0, Lj2/f;->e:Lc2/x;

    iget-object v2, p0, Lj2/f;->c:Lu3/a0;

    invoke-virtual {v2}, Lu3/a0;->H()I

    move-result v2

    invoke-virtual {v1, v2}, Lc2/x;->d(I)Z

    :cond_6
    iget-object v1, p0, Lj2/f;->d:Lz1/h0$a;

    iget v1, v1, Lz1/h0$a;->c:I

    invoke-interface {p1, v1}, Lc2/m;->j(I)V

    if-eqz v0, :cond_7

    invoke-interface {v0}, Lc2/b0;->f()Z

    move-result v1

    if-nez v1, :cond_7

    if-ne v8, v9, :cond_7

    invoke-direct {p0, p1, v6}, Lj2/f;->l(Lc2/m;Z)Lj2/g;

    move-result-object p1

    return-object p1

    :cond_7
    :goto_2
    return-object v0
.end method

.method private t(Lc2/m;)Z
    .locals 8

    iget-object v0, p0, Lj2/f;->q:Lj2/g;

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lj2/g;->e()J

    move-result-wide v2

    const-wide/16 v4, -0x1

    cmp-long v0, v2, v4

    if-eqz v0, :cond_0

    invoke-interface {p1}, Lc2/m;->n()J

    move-result-wide v4

    const-wide/16 v6, 0x4

    sub-long/2addr v2, v6

    cmp-long v0, v4, v2

    if-lez v0, :cond_0

    return v1

    :cond_0
    :try_start_0
    iget-object v0, p0, Lj2/f;->c:Lu3/a0;

    invoke-virtual {v0}, Lu3/a0;->e()[B

    move-result-object v0

    const/4 v2, 0x0

    const/4 v3, 0x4

    invoke-interface {p1, v0, v2, v3, v1}, Lc2/m;->m([BIIZ)Z

    move-result p1
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    xor-int/2addr p1, v1

    return p1

    :catch_0
    return v1
.end method

.method private u(Lc2/m;)I
    .locals 5
    .annotation runtime Lorg/checkerframework/checker/nullness/qual/RequiresNonNull;
        value = {
            "extractorOutput",
            "realTrackOutput"
        }
    .end annotation

    iget v0, p0, Lj2/f;->k:I

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :try_start_0
    invoke-direct {p0, p1, v0}, Lj2/f;->w(Lc2/m;Z)Z
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 p1, -0x1

    return p1

    :cond_0
    :goto_0
    iget-object v0, p0, Lj2/f;->q:Lj2/g;

    if-nez v0, :cond_2

    invoke-direct {p0, p1}, Lj2/f;->h(Lc2/m;)Lj2/g;

    move-result-object v0

    iput-object v0, p0, Lj2/f;->q:Lj2/g;

    iget-object v1, p0, Lj2/f;->h:Lc2/n;

    invoke-interface {v1, v0}, Lc2/n;->p(Lc2/b0;)V

    iget-object v0, p0, Lj2/f;->j:Lc2/e0;

    new-instance v1, Lx1/n1$b;

    invoke-direct {v1}, Lx1/n1$b;-><init>()V

    iget-object v2, p0, Lj2/f;->d:Lz1/h0$a;

    iget-object v2, v2, Lz1/h0$a;->b:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lx1/n1$b;->g0(Ljava/lang/String;)Lx1/n1$b;

    move-result-object v1

    const/16 v2, 0x1000

    invoke-virtual {v1, v2}, Lx1/n1$b;->Y(I)Lx1/n1$b;

    move-result-object v1

    iget-object v2, p0, Lj2/f;->d:Lz1/h0$a;

    iget v2, v2, Lz1/h0$a;->e:I

    invoke-virtual {v1, v2}, Lx1/n1$b;->J(I)Lx1/n1$b;

    move-result-object v1

    iget-object v2, p0, Lj2/f;->d:Lz1/h0$a;

    iget v2, v2, Lz1/h0$a;->d:I

    invoke-virtual {v1, v2}, Lx1/n1$b;->h0(I)Lx1/n1$b;

    move-result-object v1

    iget-object v2, p0, Lj2/f;->e:Lc2/x;

    iget v2, v2, Lc2/x;->a:I

    invoke-virtual {v1, v2}, Lx1/n1$b;->P(I)Lx1/n1$b;

    move-result-object v1

    iget-object v2, p0, Lj2/f;->e:Lc2/x;

    iget v2, v2, Lc2/x;->b:I

    invoke-virtual {v1, v2}, Lx1/n1$b;->Q(I)Lx1/n1$b;

    move-result-object v1

    iget v2, p0, Lj2/f;->a:I

    and-int/lit8 v2, v2, 0x8

    if-eqz v2, :cond_1

    const/4 v2, 0x0

    goto :goto_1

    :cond_1
    iget-object v2, p0, Lj2/f;->l:Lp2/a;

    :goto_1
    invoke-virtual {v1, v2}, Lx1/n1$b;->Z(Lp2/a;)Lx1/n1$b;

    move-result-object v1

    invoke-virtual {v1}, Lx1/n1$b;->G()Lx1/n1;

    move-result-object v1

    invoke-interface {v0, v1}, Lc2/e0;->a(Lx1/n1;)V

    invoke-interface {p1}, Lc2/m;->q()J

    move-result-wide v0

    iput-wide v0, p0, Lj2/f;->o:J

    goto :goto_2

    :cond_2
    iget-wide v0, p0, Lj2/f;->o:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_3

    invoke-interface {p1}, Lc2/m;->q()J

    move-result-wide v0

    iget-wide v2, p0, Lj2/f;->o:J

    cmp-long v4, v0, v2

    if-gez v4, :cond_3

    sub-long/2addr v2, v0

    long-to-int v0, v2

    invoke-interface {p1, v0}, Lc2/m;->j(I)V

    :cond_3
    :goto_2
    invoke-direct {p0, p1}, Lj2/f;->v(Lc2/m;)I

    move-result p1

    return p1
.end method

.method private v(Lc2/m;)I
    .locals 11
    .annotation runtime Lorg/checkerframework/checker/nullness/qual/RequiresNonNull;
        value = {
            "realTrackOutput",
            "seeker"
        }
    .end annotation

    iget v0, p0, Lj2/f;->p:I

    const/4 v1, 0x1

    const/4 v2, -0x1

    const/4 v3, 0x0

    if-nez v0, :cond_4

    invoke-interface {p1}, Lc2/m;->i()V

    invoke-direct {p0, p1}, Lj2/f;->t(Lc2/m;)Z

    move-result v0

    if-eqz v0, :cond_0

    return v2

    :cond_0
    iget-object v0, p0, Lj2/f;->c:Lu3/a0;

    invoke-virtual {v0, v3}, Lu3/a0;->R(I)V

    iget-object v0, p0, Lj2/f;->c:Lu3/a0;

    invoke-virtual {v0}, Lu3/a0;->n()I

    move-result v0

    iget v4, p0, Lj2/f;->k:I

    int-to-long v4, v4

    invoke-static {v0, v4, v5}, Lj2/f;->o(IJ)Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-static {v0}, Lz1/h0;->j(I)I

    move-result v4

    if-ne v4, v2, :cond_1

    goto :goto_0

    :cond_1
    iget-object v4, p0, Lj2/f;->d:Lz1/h0$a;

    invoke-virtual {v4, v0}, Lz1/h0$a;->a(I)Z

    iget-wide v4, p0, Lj2/f;->m:J

    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v0, v4, v6

    if-nez v0, :cond_2

    iget-object v0, p0, Lj2/f;->q:Lj2/g;

    invoke-interface {p1}, Lc2/m;->q()J

    move-result-wide v4

    invoke-interface {v0, v4, v5}, Lj2/g;->d(J)J

    move-result-wide v4

    iput-wide v4, p0, Lj2/f;->m:J

    iget-wide v4, p0, Lj2/f;->b:J

    cmp-long v0, v4, v6

    if-eqz v0, :cond_2

    iget-object v0, p0, Lj2/f;->q:Lj2/g;

    const-wide/16 v4, 0x0

    invoke-interface {v0, v4, v5}, Lj2/g;->d(J)J

    move-result-wide v4

    iget-wide v6, p0, Lj2/f;->m:J

    iget-wide v8, p0, Lj2/f;->b:J

    sub-long/2addr v8, v4

    add-long/2addr v6, v8

    iput-wide v6, p0, Lj2/f;->m:J

    :cond_2
    iget-object v0, p0, Lj2/f;->d:Lz1/h0$a;

    iget v4, v0, Lz1/h0$a;->c:I

    iput v4, p0, Lj2/f;->p:I

    iget-object v4, p0, Lj2/f;->q:Lj2/g;

    instance-of v5, v4, Lj2/b;

    if-eqz v5, :cond_4

    check-cast v4, Lj2/b;

    iget-wide v5, p0, Lj2/f;->n:J

    iget v0, v0, Lz1/h0$a;->g:I

    int-to-long v7, v0

    add-long/2addr v5, v7

    invoke-direct {p0, v5, v6}, Lj2/f;->i(J)J

    move-result-wide v5

    invoke-interface {p1}, Lc2/m;->q()J

    move-result-wide v7

    iget-object v0, p0, Lj2/f;->d:Lz1/h0$a;

    iget v0, v0, Lz1/h0$a;->c:I

    int-to-long v9, v0

    add-long/2addr v7, v9

    invoke-virtual {v4, v5, v6, v7, v8}, Lj2/b;->b(JJ)V

    iget-boolean v0, p0, Lj2/f;->s:Z

    if-eqz v0, :cond_4

    iget-wide v5, p0, Lj2/f;->t:J

    invoke-virtual {v4, v5, v6}, Lj2/b;->a(J)Z

    move-result v0

    if-eqz v0, :cond_4

    iput-boolean v3, p0, Lj2/f;->s:Z

    iget-object v0, p0, Lj2/f;->i:Lc2/e0;

    iput-object v0, p0, Lj2/f;->j:Lc2/e0;

    goto :goto_1

    :cond_3
    :goto_0
    invoke-interface {p1, v1}, Lc2/m;->j(I)V

    iput v3, p0, Lj2/f;->k:I

    return v3

    :cond_4
    :goto_1
    iget-object v0, p0, Lj2/f;->j:Lc2/e0;

    iget v4, p0, Lj2/f;->p:I

    invoke-interface {v0, p1, v4, v1}, Lc2/e0;->d(Lt3/i;IZ)I

    move-result p1

    if-ne p1, v2, :cond_5

    return v2

    :cond_5
    iget v0, p0, Lj2/f;->p:I

    sub-int/2addr v0, p1

    iput v0, p0, Lj2/f;->p:I

    if-lez v0, :cond_6

    return v3

    :cond_6
    iget-object v4, p0, Lj2/f;->j:Lc2/e0;

    iget-wide v0, p0, Lj2/f;->n:J

    invoke-direct {p0, v0, v1}, Lj2/f;->i(J)J

    move-result-wide v5

    const/4 v7, 0x1

    iget-object p1, p0, Lj2/f;->d:Lz1/h0$a;

    iget v8, p1, Lz1/h0$a;->c:I

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-interface/range {v4 .. v10}, Lc2/e0;->e(JIIILc2/e0$a;)V

    iget-wide v0, p0, Lj2/f;->n:J

    iget-object p1, p0, Lj2/f;->d:Lz1/h0$a;

    iget p1, p1, Lz1/h0$a;->g:I

    int-to-long v4, p1

    add-long/2addr v0, v4

    iput-wide v0, p0, Lj2/f;->n:J

    iput v3, p0, Lj2/f;->p:I

    return v3
.end method

.method private w(Lc2/m;Z)Z
    .locals 11

    if-eqz p2, :cond_0

    const v0, 0x8000

    goto :goto_0

    :cond_0
    const/high16 v0, 0x20000

    :goto_0
    invoke-interface {p1}, Lc2/m;->i()V

    invoke-interface {p1}, Lc2/m;->q()J

    move-result-wide v1

    const-wide/16 v3, 0x0

    cmp-long v1, v1, v3

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-nez v1, :cond_5

    iget v1, p0, Lj2/f;->a:I

    and-int/lit8 v1, v1, 0x8

    if-nez v1, :cond_1

    move v1, v3

    goto :goto_1

    :cond_1
    move v1, v4

    :goto_1
    if-eqz v1, :cond_2

    move-object v1, v2

    goto :goto_2

    :cond_2
    sget-object v1, Lj2/f;->v:Lu2/h$a;

    :goto_2
    iget-object v5, p0, Lj2/f;->f:Lc2/y;

    invoke-virtual {v5, p1, v1}, Lc2/y;->a(Lc2/m;Lu2/h$a;)Lp2/a;

    move-result-object v1

    iput-object v1, p0, Lj2/f;->l:Lp2/a;

    if-eqz v1, :cond_3

    iget-object v5, p0, Lj2/f;->e:Lc2/x;

    invoke-virtual {v5, v1}, Lc2/x;->c(Lp2/a;)Z

    :cond_3
    invoke-interface {p1}, Lc2/m;->n()J

    move-result-wide v5

    long-to-int v1, v5

    if-nez p2, :cond_4

    invoke-interface {p1, v1}, Lc2/m;->j(I)V

    :cond_4
    move v5, v4

    goto :goto_3

    :cond_5
    move v1, v4

    move v5, v1

    :goto_3
    move v6, v5

    move v7, v6

    :goto_4
    invoke-direct {p0, p1}, Lj2/f;->t(Lc2/m;)Z

    move-result v8

    if-eqz v8, :cond_7

    if-lez v6, :cond_6

    goto :goto_6

    :cond_6
    new-instance p1, Ljava/io/EOFException;

    invoke-direct {p1}, Ljava/io/EOFException;-><init>()V

    throw p1

    :cond_7
    iget-object v8, p0, Lj2/f;->c:Lu3/a0;

    invoke-virtual {v8, v4}, Lu3/a0;->R(I)V

    iget-object v8, p0, Lj2/f;->c:Lu3/a0;

    invoke-virtual {v8}, Lu3/a0;->n()I

    move-result v8

    if-eqz v5, :cond_8

    int-to-long v9, v5

    invoke-static {v8, v9, v10}, Lj2/f;->o(IJ)Z

    move-result v9

    if-eqz v9, :cond_9

    :cond_8
    invoke-static {v8}, Lz1/h0;->j(I)I

    move-result v9

    const/4 v10, -0x1

    if-ne v9, v10, :cond_d

    :cond_9
    add-int/lit8 v5, v7, 0x1

    if-ne v7, v0, :cond_b

    if-eqz p2, :cond_a

    return v4

    :cond_a
    const-string p1, "Searched too many bytes."

    invoke-static {p1, v2}, Lx1/u2;->a(Ljava/lang/String;Ljava/lang/Throwable;)Lx1/u2;

    move-result-object p1

    throw p1

    :cond_b
    if-eqz p2, :cond_c

    invoke-interface {p1}, Lc2/m;->i()V

    add-int v6, v1, v5

    invoke-interface {p1, v6}, Lc2/m;->p(I)V

    goto :goto_5

    :cond_c
    invoke-interface {p1, v3}, Lc2/m;->j(I)V

    :goto_5
    move v6, v4

    move v7, v5

    move v5, v6

    goto :goto_4

    :cond_d
    add-int/lit8 v6, v6, 0x1

    if-ne v6, v3, :cond_e

    iget-object v5, p0, Lj2/f;->d:Lz1/h0$a;

    invoke-virtual {v5, v8}, Lz1/h0$a;->a(I)Z

    move v5, v8

    goto :goto_8

    :cond_e
    const/4 v8, 0x4

    if-ne v6, v8, :cond_10

    :goto_6
    if-eqz p2, :cond_f

    add-int/2addr v1, v7

    invoke-interface {p1, v1}, Lc2/m;->j(I)V

    goto :goto_7

    :cond_f
    invoke-interface {p1}, Lc2/m;->i()V

    :goto_7
    iput v5, p0, Lj2/f;->k:I

    return v3

    :cond_10
    :goto_8
    add-int/lit8 v9, v9, -0x4

    invoke-interface {p1, v9}, Lc2/m;->p(I)V

    goto :goto_4
.end method


# virtual methods
.method public a()V
    .locals 0

    return-void
.end method

.method public b(JJ)V
    .locals 2

    const/4 p1, 0x0

    iput p1, p0, Lj2/f;->k:I

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v0, p0, Lj2/f;->m:J

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lj2/f;->n:J

    iput p1, p0, Lj2/f;->p:I

    iput-wide p3, p0, Lj2/f;->t:J

    iget-object p1, p0, Lj2/f;->q:Lj2/g;

    instance-of p2, p1, Lj2/b;

    if-eqz p2, :cond_0

    check-cast p1, Lj2/b;

    invoke-virtual {p1, p3, p4}, Lj2/b;->a(J)Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    iput-boolean p1, p0, Lj2/f;->s:Z

    iget-object p1, p0, Lj2/f;->g:Lc2/e0;

    iput-object p1, p0, Lj2/f;->j:Lc2/e0;

    :cond_0
    return-void
.end method

.method public c(Lc2/n;)V
    .locals 2

    iput-object p1, p0, Lj2/f;->h:Lc2/n;

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-interface {p1, v0, v1}, Lc2/n;->d(II)Lc2/e0;

    move-result-object p1

    iput-object p1, p0, Lj2/f;->i:Lc2/e0;

    iput-object p1, p0, Lj2/f;->j:Lc2/e0;

    iget-object p1, p0, Lj2/f;->h:Lc2/n;

    invoke-interface {p1}, Lc2/n;->i()V

    return-void
.end method

.method public g(Lc2/m;Lc2/a0;)I
    .locals 4

    invoke-direct {p0}, Lj2/f;->f()V

    invoke-direct {p0, p1}, Lj2/f;->u(Lc2/m;)I

    move-result p1

    const/4 p2, -0x1

    if-ne p1, p2, :cond_0

    iget-object p2, p0, Lj2/f;->q:Lj2/g;

    instance-of p2, p2, Lj2/b;

    if-eqz p2, :cond_0

    iget-wide v0, p0, Lj2/f;->n:J

    invoke-direct {p0, v0, v1}, Lj2/f;->i(J)J

    move-result-wide v0

    iget-object p2, p0, Lj2/f;->q:Lj2/g;

    invoke-interface {p2}, Lc2/b0;->i()J

    move-result-wide v2

    cmp-long p2, v2, v0

    if-eqz p2, :cond_0

    iget-object p2, p0, Lj2/f;->q:Lj2/g;

    check-cast p2, Lj2/b;

    invoke-virtual {p2, v0, v1}, Lj2/b;->c(J)V

    iget-object p2, p0, Lj2/f;->h:Lc2/n;

    iget-object v0, p0, Lj2/f;->q:Lj2/g;

    invoke-interface {p2, v0}, Lc2/n;->p(Lc2/b0;)V

    :cond_0
    return p1
.end method

.method public j(Lc2/m;)Z
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, p1, v0}, Lj2/f;->w(Lc2/m;Z)Z

    move-result p1

    return p1
.end method

.method public k()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lj2/f;->r:Z

    return-void
.end method
