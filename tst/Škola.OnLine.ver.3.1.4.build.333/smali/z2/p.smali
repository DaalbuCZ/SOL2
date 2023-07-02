.class public final Lz2/p;
.super Lz2/x0;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lz2/p$b;,
        Lz2/p$a;
    }
.end annotation


# instance fields
.field private final A:Lx1/y3$d;

.field private final B:Lx1/y3$b;

.field private C:Lz2/p$a;

.field private D:Lz2/o;

.field private E:Z

.field private F:Z

.field private G:Z

.field private final z:Z


# direct methods
.method public constructor <init>(Lz2/u;Z)V
    .locals 1

    invoke-direct {p0, p1}, Lz2/x0;-><init>(Lz2/u;)V

    const/4 v0, 0x1

    if-eqz p2, :cond_0

    invoke-interface {p1}, Lz2/u;->d()Z

    move-result p2

    if-eqz p2, :cond_0

    move p2, v0

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    iput-boolean p2, p0, Lz2/p;->z:Z

    new-instance p2, Lx1/y3$d;

    invoke-direct {p2}, Lx1/y3$d;-><init>()V

    iput-object p2, p0, Lz2/p;->A:Lx1/y3$d;

    new-instance p2, Lx1/y3$b;

    invoke-direct {p2}, Lx1/y3$b;-><init>()V

    iput-object p2, p0, Lz2/p;->B:Lx1/y3$b;

    invoke-interface {p1}, Lz2/u;->e()Lx1/y3;

    move-result-object p2

    if-eqz p2, :cond_1

    const/4 p1, 0x0

    invoke-static {p2, p1, p1}, Lz2/p$a;->z(Lx1/y3;Ljava/lang/Object;Ljava/lang/Object;)Lz2/p$a;

    move-result-object p1

    iput-object p1, p0, Lz2/p;->C:Lz2/p$a;

    iput-boolean v0, p0, Lz2/p;->G:Z

    goto :goto_1

    :cond_1
    invoke-interface {p1}, Lz2/u;->a()Lx1/v1;

    move-result-object p1

    invoke-static {p1}, Lz2/p$a;->y(Lx1/v1;)Lz2/p$a;

    move-result-object p1

    iput-object p1, p0, Lz2/p;->C:Lz2/p$a;

    :goto_1
    return-void
.end method

.method private X(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lz2/p;->C:Lz2/p$a;

    invoke-static {v0}, Lz2/p$a;->w(Lz2/p$a;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lz2/p;->C:Lz2/p$a;

    invoke-static {v0}, Lz2/p$a;->w(Lz2/p$a;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p1, Lz2/p$a;->v:Ljava/lang/Object;

    :cond_0
    return-object p1
.end method

.method private Y(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lz2/p;->C:Lz2/p$a;

    invoke-static {v0}, Lz2/p$a;->w(Lz2/p$a;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    sget-object v0, Lz2/p$a;->v:Ljava/lang/Object;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p0, Lz2/p;->C:Lz2/p$a;

    invoke-static {p1}, Lz2/p$a;->w(Lz2/p$a;)Ljava/lang/Object;

    move-result-object p1

    :cond_0
    return-object p1
.end method

.method private a0(J)V
    .locals 5
    .annotation runtime Lorg/checkerframework/checker/nullness/qual/RequiresNonNull;
        value = {
            "unpreparedMaskingMediaPeriod"
        }
    .end annotation

    iget-object v0, p0, Lz2/p;->D:Lz2/o;

    iget-object v1, p0, Lz2/p;->C:Lz2/p$a;

    iget-object v2, v0, Lz2/o;->n:Lz2/u$b;

    iget-object v2, v2, Lz2/s;->a:Ljava/lang/Object;

    invoke-virtual {v1, v2}, Lz2/p$a;->f(Ljava/lang/Object;)I

    move-result v1

    const/4 v2, -0x1

    if-ne v1, v2, :cond_0

    return-void

    :cond_0
    iget-object v2, p0, Lz2/p;->C:Lz2/p$a;

    iget-object v3, p0, Lz2/p;->B:Lx1/y3$b;

    invoke-virtual {v2, v1, v3}, Lx1/y3;->j(ILx1/y3$b;)Lx1/y3$b;

    move-result-object v1

    iget-wide v1, v1, Lx1/y3$b;->q:J

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v3, v1, v3

    if-eqz v3, :cond_1

    cmp-long v3, p1, v1

    if-ltz v3, :cond_1

    const-wide/16 p1, 0x0

    const-wide/16 v3, 0x1

    sub-long/2addr v1, v3

    invoke-static {p1, p2, v1, v2}, Ljava/lang/Math;->max(JJ)J

    move-result-wide p1

    :cond_1
    invoke-virtual {v0, p1, p2}, Lz2/o;->w(J)V

    return-void
.end method


# virtual methods
.method public E()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lz2/p;->F:Z

    iput-boolean v0, p0, Lz2/p;->E:Z

    invoke-super {p0}, Lz2/f;->E()V

    return-void
.end method

.method protected N(Lz2/u$b;)Lz2/u$b;
    .locals 1

    iget-object v0, p1, Lz2/s;->a:Ljava/lang/Object;

    invoke-direct {p0, v0}, Lz2/p;->X(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p1, v0}, Lz2/u$b;->c(Ljava/lang/Object;)Lz2/u$b;

    move-result-object p1

    return-object p1
.end method

.method protected T(Lx1/y3;)V
    .locals 14

    iget-boolean v0, p0, Lz2/p;->F:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lz2/p;->C:Lz2/p$a;

    invoke-virtual {v0, p1}, Lz2/p$a;->x(Lx1/y3;)Lz2/p$a;

    move-result-object p1

    iput-object p1, p0, Lz2/p;->C:Lz2/p$a;

    iget-object p1, p0, Lz2/p;->D:Lz2/o;

    if-eqz p1, :cond_5

    invoke-virtual {p1}, Lz2/o;->p()J

    move-result-wide v0

    invoke-direct {p0, v0, v1}, Lz2/p;->a0(J)V

    goto/16 :goto_3

    :cond_0
    invoke-virtual {p1}, Lx1/y3;->u()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-boolean v0, p0, Lz2/p;->G:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lz2/p;->C:Lz2/p$a;

    invoke-virtual {v0, p1}, Lz2/p$a;->x(Lx1/y3;)Lz2/p$a;

    move-result-object p1

    goto :goto_0

    :cond_1
    sget-object v0, Lx1/y3$d;->E:Ljava/lang/Object;

    sget-object v1, Lz2/p$a;->v:Ljava/lang/Object;

    invoke-static {p1, v0, v1}, Lz2/p$a;->z(Lx1/y3;Ljava/lang/Object;Ljava/lang/Object;)Lz2/p$a;

    move-result-object p1

    :goto_0
    iput-object p1, p0, Lz2/p;->C:Lz2/p$a;

    goto/16 :goto_3

    :cond_2
    iget-object v0, p0, Lz2/p;->A:Lx1/y3$d;

    const/4 v1, 0x0

    invoke-virtual {p1, v1, v0}, Lx1/y3;->r(ILx1/y3$d;)Lx1/y3$d;

    iget-object v0, p0, Lz2/p;->A:Lx1/y3$d;

    invoke-virtual {v0}, Lx1/y3$d;->e()J

    move-result-wide v2

    iget-object v0, p0, Lz2/p;->A:Lx1/y3$d;

    iget-object v0, v0, Lx1/y3$d;->n:Ljava/lang/Object;

    iget-object v4, p0, Lz2/p;->D:Lz2/o;

    if-eqz v4, :cond_3

    invoke-virtual {v4}, Lz2/o;->s()J

    move-result-wide v4

    iget-object v6, p0, Lz2/p;->C:Lz2/p$a;

    iget-object v7, p0, Lz2/p;->D:Lz2/o;

    iget-object v7, v7, Lz2/o;->n:Lz2/u$b;

    iget-object v7, v7, Lz2/s;->a:Ljava/lang/Object;

    iget-object v8, p0, Lz2/p;->B:Lx1/y3$b;

    invoke-virtual {v6, v7, v8}, Lx1/y3;->l(Ljava/lang/Object;Lx1/y3$b;)Lx1/y3$b;

    iget-object v6, p0, Lz2/p;->B:Lx1/y3$b;

    invoke-virtual {v6}, Lx1/y3$b;->q()J

    move-result-wide v6

    add-long/2addr v6, v4

    iget-object v4, p0, Lz2/p;->C:Lz2/p$a;

    iget-object v5, p0, Lz2/p;->A:Lx1/y3$d;

    invoke-virtual {v4, v1, v5}, Lx1/y3;->r(ILx1/y3$d;)Lx1/y3$d;

    move-result-object v1

    invoke-virtual {v1}, Lx1/y3$d;->e()J

    move-result-wide v4

    cmp-long v1, v6, v4

    if-eqz v1, :cond_3

    move-wide v12, v6

    goto :goto_1

    :cond_3
    move-wide v12, v2

    :goto_1
    iget-object v9, p0, Lz2/p;->A:Lx1/y3$d;

    iget-object v10, p0, Lz2/p;->B:Lx1/y3$b;

    const/4 v11, 0x0

    move-object v8, p1

    invoke-virtual/range {v8 .. v13}, Lx1/y3;->n(Lx1/y3$d;Lx1/y3$b;IJ)Landroid/util/Pair;

    move-result-object v1

    iget-object v2, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    iget-object v1, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    iget-boolean v1, p0, Lz2/p;->G:Z

    if-eqz v1, :cond_4

    iget-object v0, p0, Lz2/p;->C:Lz2/p$a;

    invoke-virtual {v0, p1}, Lz2/p$a;->x(Lx1/y3;)Lz2/p$a;

    move-result-object p1

    goto :goto_2

    :cond_4
    invoke-static {p1, v0, v2}, Lz2/p$a;->z(Lx1/y3;Ljava/lang/Object;Ljava/lang/Object;)Lz2/p$a;

    move-result-object p1

    :goto_2
    iput-object p1, p0, Lz2/p;->C:Lz2/p$a;

    iget-object p1, p0, Lz2/p;->D:Lz2/o;

    if-eqz p1, :cond_5

    invoke-direct {p0, v3, v4}, Lz2/p;->a0(J)V

    iget-object p1, p1, Lz2/o;->n:Lz2/u$b;

    iget-object v0, p1, Lz2/s;->a:Ljava/lang/Object;

    invoke-direct {p0, v0}, Lz2/p;->Y(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p1, v0}, Lz2/u$b;->c(Ljava/lang/Object;)Lz2/u$b;

    move-result-object p1

    goto :goto_4

    :cond_5
    :goto_3
    const/4 p1, 0x0

    :goto_4
    const/4 v0, 0x1

    iput-boolean v0, p0, Lz2/p;->G:Z

    iput-boolean v0, p0, Lz2/p;->F:Z

    iget-object v0, p0, Lz2/p;->C:Lz2/p$a;

    invoke-virtual {p0, v0}, Lz2/a;->D(Lx1/y3;)V

    if-eqz p1, :cond_6

    iget-object v0, p0, Lz2/p;->D:Lz2/o;

    invoke-static {v0}, Lu3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lz2/o;

    invoke-virtual {v0, p1}, Lz2/o;->i(Lz2/u$b;)V

    :cond_6
    return-void
.end method

.method public V()V
    .locals 1

    iget-boolean v0, p0, Lz2/p;->z:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lz2/p;->E:Z

    invoke-virtual {p0}, Lz2/x0;->U()V

    :cond_0
    return-void
.end method

.method public W(Lz2/u$b;Lt3/b;J)Lz2/o;
    .locals 1

    new-instance v0, Lz2/o;

    invoke-direct {v0, p1, p2, p3, p4}, Lz2/o;-><init>(Lz2/u$b;Lt3/b;J)V

    iget-object p2, p0, Lz2/x0;->x:Lz2/u;

    invoke-virtual {v0, p2}, Lz2/o;->y(Lz2/u;)V

    iget-boolean p2, p0, Lz2/p;->F:Z

    if-eqz p2, :cond_0

    iget-object p2, p1, Lz2/s;->a:Ljava/lang/Object;

    invoke-direct {p0, p2}, Lz2/p;->Y(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {p1, p2}, Lz2/u$b;->c(Ljava/lang/Object;)Lz2/u$b;

    move-result-object p1

    invoke-virtual {v0, p1}, Lz2/o;->i(Lz2/u$b;)V

    goto :goto_0

    :cond_0
    iput-object v0, p0, Lz2/p;->D:Lz2/o;

    iget-boolean p1, p0, Lz2/p;->E:Z

    if-nez p1, :cond_1

    const/4 p1, 0x1

    iput-boolean p1, p0, Lz2/p;->E:Z

    invoke-virtual {p0}, Lz2/x0;->U()V

    :cond_1
    :goto_0
    return-object v0
.end method

.method public Z()Lx1/y3;
    .locals 1

    iget-object v0, p0, Lz2/p;->C:Lz2/p$a;

    return-object v0
.end method

.method public b(Lz2/r;)V
    .locals 1

    move-object v0, p1

    check-cast v0, Lz2/o;

    invoke-virtual {v0}, Lz2/o;->x()V

    iget-object v0, p0, Lz2/p;->D:Lz2/o;

    if-ne p1, v0, :cond_0

    const/4 p1, 0x0

    iput-object p1, p0, Lz2/p;->D:Lz2/o;

    :cond_0
    return-void
.end method

.method public c()V
    .locals 0

    return-void
.end method

.method public bridge synthetic j(Lz2/u$b;Lt3/b;J)Lz2/r;
    .locals 0

    invoke-virtual {p0, p1, p2, p3, p4}, Lz2/p;->W(Lz2/u$b;Lt3/b;J)Lz2/o;

    move-result-object p1

    return-object p1
.end method
