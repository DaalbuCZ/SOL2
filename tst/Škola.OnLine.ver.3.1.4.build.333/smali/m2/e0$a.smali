.class final Lm2/e0$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lc2/a$f;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lm2/e0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# instance fields
.field private final a:Lu3/j0;

.field private final b:Lu3/a0;

.field private final c:I

.field private final d:I


# direct methods
.method public constructor <init>(ILu3/j0;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lm2/e0$a;->c:I

    iput-object p2, p0, Lm2/e0$a;->a:Lu3/j0;

    iput p3, p0, Lm2/e0$a;->d:I

    new-instance p1, Lu3/a0;

    invoke-direct {p1}, Lu3/a0;-><init>()V

    iput-object p1, p0, Lm2/e0$a;->b:Lu3/a0;

    return-void
.end method

.method private c(Lu3/a0;JJ)Lc2/a$e;
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-wide/from16 v2, p4

    invoke-virtual/range {p1 .. p1}, Lu3/a0;->g()I

    move-result v4

    const-wide/16 v5, -0x1

    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    move-wide v9, v5

    move-wide v11, v7

    :goto_0
    invoke-virtual/range {p1 .. p1}, Lu3/a0;->a()I

    move-result v13

    const/16 v14, 0xbc

    if-lt v13, v14, :cond_5

    invoke-virtual/range {p1 .. p1}, Lu3/a0;->e()[B

    move-result-object v13

    invoke-virtual/range {p1 .. p1}, Lu3/a0;->f()I

    move-result v14

    invoke-static {v13, v14, v4}, Lm2/j0;->a([BII)I

    move-result v13

    add-int/lit16 v14, v13, 0xbc

    if-le v14, v4, :cond_0

    goto :goto_1

    :cond_0
    iget v5, v0, Lm2/e0$a;->c:I

    invoke-static {v1, v13, v5}, Lm2/j0;->c(Lu3/a0;II)J

    move-result-wide v5

    cmp-long v15, v5, v7

    if-eqz v15, :cond_4

    iget-object v15, v0, Lm2/e0$a;->a:Lu3/j0;

    invoke-virtual {v15, v5, v6}, Lu3/j0;->b(J)J

    move-result-wide v5

    cmp-long v15, v5, p2

    if-lez v15, :cond_2

    cmp-long v1, v11, v7

    if-nez v1, :cond_1

    invoke-static {v5, v6, v2, v3}, Lc2/a$e;->d(JJ)Lc2/a$e;

    move-result-object v1

    return-object v1

    :cond_1
    add-long v1, v2, v9

    invoke-static {v1, v2}, Lc2/a$e;->e(J)Lc2/a$e;

    move-result-object v1

    return-object v1

    :cond_2
    const-wide/32 v9, 0x186a0

    add-long/2addr v9, v5

    cmp-long v9, v9, p2

    if-lez v9, :cond_3

    int-to-long v4, v13

    add-long v1, v2, v4

    invoke-static {v1, v2}, Lc2/a$e;->e(J)Lc2/a$e;

    move-result-object v1

    return-object v1

    :cond_3
    int-to-long v9, v13

    move-wide v11, v5

    :cond_4
    invoke-virtual {v1, v14}, Lu3/a0;->R(I)V

    int-to-long v5, v14

    goto :goto_0

    :cond_5
    :goto_1
    cmp-long v1, v11, v7

    if-eqz v1, :cond_6

    add-long v1, v2, v5

    invoke-static {v11, v12, v1, v2}, Lc2/a$e;->f(JJ)Lc2/a$e;

    move-result-object v1

    return-object v1

    :cond_6
    sget-object v1, Lc2/a$e;->d:Lc2/a$e;

    return-object v1
.end method


# virtual methods
.method public a()V
    .locals 2

    iget-object v0, p0, Lm2/e0$a;->b:Lu3/a0;

    sget-object v1, Lu3/n0;->f:[B

    invoke-virtual {v0, v1}, Lu3/a0;->O([B)V

    return-void
.end method

.method public b(Lc2/m;J)Lc2/a$e;
    .locals 6

    invoke-interface {p1}, Lc2/m;->q()J

    move-result-wide v4

    iget v0, p0, Lm2/e0$a;->d:I

    int-to-long v0, v0

    invoke-interface {p1}, Lc2/m;->a()J

    move-result-wide v2

    sub-long/2addr v2, v4

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    long-to-int v0, v0

    iget-object v1, p0, Lm2/e0$a;->b:Lu3/a0;

    invoke-virtual {v1, v0}, Lu3/a0;->N(I)V

    iget-object v1, p0, Lm2/e0$a;->b:Lu3/a0;

    invoke-virtual {v1}, Lu3/a0;->e()[B

    move-result-object v1

    const/4 v2, 0x0

    invoke-interface {p1, v1, v2, v0}, Lc2/m;->o([BII)V

    iget-object v1, p0, Lm2/e0$a;->b:Lu3/a0;

    move-object v0, p0

    move-wide v2, p2

    invoke-direct/range {v0 .. v5}, Lm2/e0$a;->c(Lu3/a0;JJ)Lc2/a$e;

    move-result-object p1

    return-object p1
.end method
