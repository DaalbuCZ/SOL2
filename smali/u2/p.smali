.class public final Lu2/p;
.super Lu2/f;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lu2/p$b;,
        Lu2/p$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lu2/f<",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field private final A:Ls1/l3$b;

.field private B:Lu2/p$a;

.field private C:Lu2/o;

.field private D:Z

.field private E:Z

.field private F:Z

.field private final x:Lu2/u;

.field private final y:Z

.field private final z:Ls1/l3$d;


# direct methods
.method public constructor <init>(Lu2/u;Z)V
    .locals 1

    invoke-direct {p0}, Lu2/f;-><init>()V

    iput-object p1, p0, Lu2/p;->x:Lu2/u;

    const/4 v0, 0x1

    if-eqz p2, :cond_0

    invoke-interface {p1}, Lu2/u;->g()Z

    move-result p2

    if-eqz p2, :cond_0

    move p2, v0

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    iput-boolean p2, p0, Lu2/p;->y:Z

    new-instance p2, Ls1/l3$d;

    invoke-direct {p2}, Ls1/l3$d;-><init>()V

    iput-object p2, p0, Lu2/p;->z:Ls1/l3$d;

    new-instance p2, Ls1/l3$b;

    invoke-direct {p2}, Ls1/l3$b;-><init>()V

    iput-object p2, p0, Lu2/p;->A:Ls1/l3$b;

    invoke-interface {p1}, Lu2/u;->i()Ls1/l3;

    move-result-object p2

    if-eqz p2, :cond_1

    const/4 p1, 0x0

    invoke-static {p2, p1, p1}, Lu2/p$a;->A(Ls1/l3;Ljava/lang/Object;Ljava/lang/Object;)Lu2/p$a;

    move-result-object p1

    iput-object p1, p0, Lu2/p;->B:Lu2/p$a;

    iput-boolean v0, p0, Lu2/p;->F:Z

    goto :goto_1

    :cond_1
    invoke-interface {p1}, Lu2/u;->a()Ls1/u1;

    move-result-object p1

    invoke-static {p1}, Lu2/p$a;->z(Ls1/u1;)Lu2/p$a;

    move-result-object p1

    iput-object p1, p0, Lu2/p;->B:Lu2/p$a;

    :goto_1
    return-void
.end method

.method private N(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lu2/p;->B:Lu2/p$a;

    invoke-static {v0}, Lu2/p$a;->x(Lu2/p$a;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lu2/p;->B:Lu2/p$a;

    invoke-static {v0}, Lu2/p$a;->x(Lu2/p$a;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p1, Lu2/p$a;->s:Ljava/lang/Object;

    :cond_0
    return-object p1
.end method

.method private O(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lu2/p;->B:Lu2/p$a;

    invoke-static {v0}, Lu2/p$a;->x(Lu2/p$a;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    sget-object v0, Lu2/p$a;->s:Ljava/lang/Object;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p0, Lu2/p;->B:Lu2/p$a;

    invoke-static {p1}, Lu2/p$a;->x(Lu2/p$a;)Ljava/lang/Object;

    move-result-object p1

    :cond_0
    return-object p1
.end method

.method private S(J)V
    .locals 5
    .annotation runtime Lorg/checkerframework/checker/nullness/qual/RequiresNonNull;
        value = {
            "unpreparedMaskingMediaPeriod"
        }
    .end annotation

    iget-object v0, p0, Lu2/p;->C:Lu2/o;

    iget-object v1, p0, Lu2/p;->B:Lu2/p$a;

    iget-object v2, v0, Lu2/o;->n:Lu2/u$b;

    iget-object v2, v2, Lu2/s;->a:Ljava/lang/Object;

    invoke-virtual {v1, v2}, Lu2/p$a;->f(Ljava/lang/Object;)I

    move-result v1

    const/4 v2, -0x1

    if-ne v1, v2, :cond_0

    return-void

    :cond_0
    iget-object v2, p0, Lu2/p;->B:Lu2/p$a;

    iget-object v3, p0, Lu2/p;->A:Ls1/l3$b;

    invoke-virtual {v2, v1, v3}, Ls1/l3;->j(ILs1/l3$b;)Ls1/l3$b;

    move-result-object v1

    iget-wide v1, v1, Ls1/l3$b;->q:J

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
    invoke-virtual {v0, p1, p2}, Lu2/o;->w(J)V

    return-void
.end method


# virtual methods
.method public C(Lo3/p0;)V
    .locals 1

    invoke-super {p0, p1}, Lu2/f;->C(Lo3/p0;)V

    iget-boolean p1, p0, Lu2/p;->y:Z

    if-nez p1, :cond_0

    const/4 p1, 0x1

    iput-boolean p1, p0, Lu2/p;->D:Z

    const/4 p1, 0x0

    iget-object v0, p0, Lu2/p;->x:Lu2/u;

    invoke-virtual {p0, p1, v0}, Lu2/f;->L(Ljava/lang/Object;Lu2/u;)V

    :cond_0
    return-void
.end method

.method public E()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lu2/p;->E:Z

    iput-boolean v0, p0, Lu2/p;->D:Z

    invoke-super {p0}, Lu2/f;->E()V

    return-void
.end method

.method protected bridge synthetic G(Ljava/lang/Object;Lu2/u$b;)Lu2/u$b;
    .locals 0

    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p1, p2}, Lu2/p;->P(Ljava/lang/Void;Lu2/u$b;)Lu2/u$b;

    move-result-object p1

    return-object p1
.end method

.method protected bridge synthetic K(Ljava/lang/Object;Lu2/u;Ls1/l3;)V
    .locals 0

    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p1, p2, p3}, Lu2/p;->R(Ljava/lang/Void;Lu2/u;Ls1/l3;)V

    return-void
.end method

.method public M(Lu2/u$b;Lo3/b;J)Lu2/o;
    .locals 1

    new-instance v0, Lu2/o;

    invoke-direct {v0, p1, p2, p3, p4}, Lu2/o;-><init>(Lu2/u$b;Lo3/b;J)V

    iget-object p2, p0, Lu2/p;->x:Lu2/u;

    invoke-virtual {v0, p2}, Lu2/o;->y(Lu2/u;)V

    iget-boolean p2, p0, Lu2/p;->E:Z

    if-eqz p2, :cond_0

    iget-object p2, p1, Lu2/s;->a:Ljava/lang/Object;

    invoke-direct {p0, p2}, Lu2/p;->O(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {p1, p2}, Lu2/u$b;->c(Ljava/lang/Object;)Lu2/u$b;

    move-result-object p1

    invoke-virtual {v0, p1}, Lu2/o;->e(Lu2/u$b;)V

    goto :goto_0

    :cond_0
    iput-object v0, p0, Lu2/p;->C:Lu2/o;

    iget-boolean p1, p0, Lu2/p;->D:Z

    if-nez p1, :cond_1

    const/4 p1, 0x1

    iput-boolean p1, p0, Lu2/p;->D:Z

    const/4 p1, 0x0

    iget-object p2, p0, Lu2/p;->x:Lu2/u;

    invoke-virtual {p0, p1, p2}, Lu2/f;->L(Ljava/lang/Object;Lu2/u;)V

    :cond_1
    :goto_0
    return-object v0
.end method

.method protected P(Ljava/lang/Void;Lu2/u$b;)Lu2/u$b;
    .locals 0

    iget-object p1, p2, Lu2/s;->a:Ljava/lang/Object;

    invoke-direct {p0, p1}, Lu2/p;->N(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p2, p1}, Lu2/u$b;->c(Ljava/lang/Object;)Lu2/u$b;

    move-result-object p1

    return-object p1
.end method

.method public Q()Ls1/l3;
    .locals 1

    iget-object v0, p0, Lu2/p;->B:Lu2/p$a;

    return-object v0
.end method

.method protected R(Ljava/lang/Void;Lu2/u;Ls1/l3;)V
    .locals 12

    iget-boolean p1, p0, Lu2/p;->E:Z

    if-eqz p1, :cond_0

    iget-object p1, p0, Lu2/p;->B:Lu2/p$a;

    invoke-virtual {p1, p3}, Lu2/p$a;->y(Ls1/l3;)Lu2/p$a;

    move-result-object p1

    iput-object p1, p0, Lu2/p;->B:Lu2/p$a;

    iget-object p1, p0, Lu2/p;->C:Lu2/o;

    if-eqz p1, :cond_5

    invoke-virtual {p1}, Lu2/o;->i()J

    move-result-wide p1

    invoke-direct {p0, p1, p2}, Lu2/p;->S(J)V

    goto/16 :goto_3

    :cond_0
    invoke-virtual {p3}, Ls1/l3;->u()Z

    move-result p1

    if-eqz p1, :cond_2

    iget-boolean p1, p0, Lu2/p;->F:Z

    if-eqz p1, :cond_1

    iget-object p1, p0, Lu2/p;->B:Lu2/p$a;

    invoke-virtual {p1, p3}, Lu2/p$a;->y(Ls1/l3;)Lu2/p$a;

    move-result-object p1

    goto :goto_0

    :cond_1
    sget-object p1, Ls1/l3$d;->E:Ljava/lang/Object;

    sget-object p2, Lu2/p$a;->s:Ljava/lang/Object;

    invoke-static {p3, p1, p2}, Lu2/p$a;->A(Ls1/l3;Ljava/lang/Object;Ljava/lang/Object;)Lu2/p$a;

    move-result-object p1

    :goto_0
    iput-object p1, p0, Lu2/p;->B:Lu2/p$a;

    goto/16 :goto_3

    :cond_2
    iget-object p1, p0, Lu2/p;->z:Ls1/l3$d;

    const/4 p2, 0x0

    invoke-virtual {p3, p2, p1}, Ls1/l3;->r(ILs1/l3$d;)Ls1/l3$d;

    iget-object p1, p0, Lu2/p;->z:Ls1/l3$d;

    invoke-virtual {p1}, Ls1/l3$d;->e()J

    move-result-wide v0

    iget-object p1, p0, Lu2/p;->z:Ls1/l3$d;

    iget-object p1, p1, Ls1/l3$d;->n:Ljava/lang/Object;

    iget-object v2, p0, Lu2/p;->C:Lu2/o;

    if-eqz v2, :cond_3

    invoke-virtual {v2}, Lu2/o;->t()J

    move-result-wide v2

    iget-object v4, p0, Lu2/p;->B:Lu2/p$a;

    iget-object v5, p0, Lu2/p;->C:Lu2/o;

    iget-object v5, v5, Lu2/o;->n:Lu2/u$b;

    iget-object v5, v5, Lu2/s;->a:Ljava/lang/Object;

    iget-object v6, p0, Lu2/p;->A:Ls1/l3$b;

    invoke-virtual {v4, v5, v6}, Ls1/l3;->l(Ljava/lang/Object;Ls1/l3$b;)Ls1/l3$b;

    iget-object v4, p0, Lu2/p;->A:Ls1/l3$b;

    invoke-virtual {v4}, Ls1/l3$b;->q()J

    move-result-wide v4

    add-long/2addr v4, v2

    iget-object v2, p0, Lu2/p;->B:Lu2/p$a;

    iget-object v3, p0, Lu2/p;->z:Ls1/l3$d;

    invoke-virtual {v2, p2, v3}, Ls1/l3;->r(ILs1/l3$d;)Ls1/l3$d;

    move-result-object p2

    invoke-virtual {p2}, Ls1/l3$d;->e()J

    move-result-wide v2

    cmp-long p2, v4, v2

    if-eqz p2, :cond_3

    move-wide v10, v4

    goto :goto_1

    :cond_3
    move-wide v10, v0

    :goto_1
    iget-object v7, p0, Lu2/p;->z:Ls1/l3$d;

    iget-object v8, p0, Lu2/p;->A:Ls1/l3$b;

    const/4 v9, 0x0

    move-object v6, p3

    invoke-virtual/range {v6 .. v11}, Ls1/l3;->n(Ls1/l3$d;Ls1/l3$b;IJ)Landroid/util/Pair;

    move-result-object p2

    iget-object v0, p2, Landroid/util/Pair;->first:Ljava/lang/Object;

    iget-object p2, p2, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast p2, Ljava/lang/Long;

    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    iget-boolean p2, p0, Lu2/p;->F:Z

    if-eqz p2, :cond_4

    iget-object p1, p0, Lu2/p;->B:Lu2/p$a;

    invoke-virtual {p1, p3}, Lu2/p$a;->y(Ls1/l3;)Lu2/p$a;

    move-result-object p1

    goto :goto_2

    :cond_4
    invoke-static {p3, p1, v0}, Lu2/p$a;->A(Ls1/l3;Ljava/lang/Object;Ljava/lang/Object;)Lu2/p$a;

    move-result-object p1

    :goto_2
    iput-object p1, p0, Lu2/p;->B:Lu2/p$a;

    iget-object p1, p0, Lu2/p;->C:Lu2/o;

    if-eqz p1, :cond_5

    invoke-direct {p0, v1, v2}, Lu2/p;->S(J)V

    iget-object p1, p1, Lu2/o;->n:Lu2/u$b;

    iget-object p2, p1, Lu2/s;->a:Ljava/lang/Object;

    invoke-direct {p0, p2}, Lu2/p;->O(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {p1, p2}, Lu2/u$b;->c(Ljava/lang/Object;)Lu2/u$b;

    move-result-object p1

    goto :goto_4

    :cond_5
    :goto_3
    const/4 p1, 0x0

    :goto_4
    const/4 p2, 0x1

    iput-boolean p2, p0, Lu2/p;->F:Z

    iput-boolean p2, p0, Lu2/p;->E:Z

    iget-object p2, p0, Lu2/p;->B:Lu2/p$a;

    invoke-virtual {p0, p2}, Lu2/a;->D(Ls1/l3;)V

    if-eqz p1, :cond_6

    iget-object p2, p0, Lu2/p;->C:Lu2/o;

    invoke-static {p2}, Lp3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lu2/o;

    invoke-virtual {p2, p1}, Lu2/o;->e(Lu2/u$b;)V

    :cond_6
    return-void
.end method

.method public a()Ls1/u1;
    .locals 1

    iget-object v0, p0, Lu2/p;->x:Lu2/u;

    invoke-interface {v0}, Lu2/u;->a()Ls1/u1;

    move-result-object v0

    return-object v0
.end method

.method public b(Lu2/r;)V
    .locals 1

    move-object v0, p1

    check-cast v0, Lu2/o;

    invoke-virtual {v0}, Lu2/o;->x()V

    iget-object v0, p0, Lu2/p;->C:Lu2/o;

    if-ne p1, v0, :cond_0

    const/4 p1, 0x0

    iput-object p1, p0, Lu2/p;->C:Lu2/o;

    :cond_0
    return-void
.end method

.method public f()V
    .locals 0

    return-void
.end method

.method public bridge synthetic n(Lu2/u$b;Lo3/b;J)Lu2/r;
    .locals 0

    invoke-virtual {p0, p1, p2, p3, p4}, Lu2/p;->M(Lu2/u$b;Lo3/b;J)Lu2/o;

    move-result-object p1

    return-object p1
.end method
