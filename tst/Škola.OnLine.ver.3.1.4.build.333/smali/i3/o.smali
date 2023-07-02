.class public final Li3/o;
.super Lx1/f;
.source ""

# interfaces
.implements Landroid/os/Handler$Callback;


# instance fields
.field private final A:Landroid/os/Handler;

.field private final B:Li3/n;

.field private final C:Li3/k;

.field private final D:Lx1/o1;

.field private E:Z

.field private F:Z

.field private G:Z

.field private H:I

.field private I:Lx1/n1;

.field private J:Li3/i;

.field private K:Li3/l;

.field private L:Li3/m;

.field private M:Li3/m;

.field private N:I

.field private O:J

.field private P:J

.field private Q:J


# direct methods
.method public constructor <init>(Li3/n;Landroid/os/Looper;)V
    .locals 1

    sget-object v0, Li3/k;->a:Li3/k;

    invoke-direct {p0, p1, p2, v0}, Li3/o;-><init>(Li3/n;Landroid/os/Looper;Li3/k;)V

    return-void
.end method

.method public constructor <init>(Li3/n;Landroid/os/Looper;Li3/k;)V
    .locals 1

    const/4 v0, 0x3

    invoke-direct {p0, v0}, Lx1/f;-><init>(I)V

    invoke-static {p1}, Lu3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Li3/n;

    iput-object p1, p0, Li3/o;->B:Li3/n;

    if-nez p2, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    invoke-static {p2, p0}, Lu3/n0;->v(Landroid/os/Looper;Landroid/os/Handler$Callback;)Landroid/os/Handler;

    move-result-object p1

    :goto_0
    iput-object p1, p0, Li3/o;->A:Landroid/os/Handler;

    iput-object p3, p0, Li3/o;->C:Li3/k;

    new-instance p1, Lx1/o1;

    invoke-direct {p1}, Lx1/o1;-><init>()V

    iput-object p1, p0, Li3/o;->D:Lx1/o1;

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide p1, p0, Li3/o;->O:J

    iput-wide p1, p0, Li3/o;->P:J

    iput-wide p1, p0, Li3/o;->Q:J

    return-void
.end method

.method private T()V
    .locals 4

    new-instance v0, Li3/e;

    invoke-static {}, Lg5/q;->J()Lg5/q;

    move-result-object v1

    iget-wide v2, p0, Li3/o;->Q:J

    invoke-direct {p0, v2, v3}, Li3/o;->W(J)J

    move-result-wide v2

    invoke-direct {v0, v1, v2, v3}, Li3/e;-><init>(Ljava/util/List;J)V

    invoke-direct {p0, v0}, Li3/o;->e0(Li3/e;)V

    return-void
.end method

.method private U(J)J
    .locals 1
    .annotation runtime Lorg/checkerframework/checker/nullness/qual/RequiresNonNull;
        value = {
            "subtitle"
        }
    .end annotation

    .annotation runtime Lorg/checkerframework/dataflow/qual/SideEffectFree;
    .end annotation

    iget-object v0, p0, Li3/o;->L:Li3/m;

    invoke-virtual {v0, p1, p2}, Li3/m;->e(J)I

    move-result p1

    if-eqz p1, :cond_2

    iget-object p2, p0, Li3/o;->L:Li3/m;

    invoke-virtual {p2}, Li3/m;->j()I

    move-result p2

    if-nez p2, :cond_0

    goto :goto_1

    :cond_0
    const/4 p2, -0x1

    if-ne p1, p2, :cond_1

    iget-object p1, p0, Li3/o;->L:Li3/m;

    invoke-virtual {p1}, Li3/m;->j()I

    move-result p2

    add-int/lit8 p2, p2, -0x1

    invoke-virtual {p1, p2}, Li3/m;->g(I)J

    move-result-wide p1

    goto :goto_0

    :cond_1
    iget-object p2, p0, Li3/o;->L:Li3/m;

    add-int/lit8 p1, p1, -0x1

    invoke-virtual {p2, p1}, Li3/m;->g(I)J

    move-result-wide p1

    :goto_0
    return-wide p1

    :cond_2
    :goto_1
    iget-object p1, p0, Li3/o;->L:Li3/m;

    iget-wide p1, p1, La2/h;->o:J

    return-wide p1
.end method

.method private V()J
    .locals 4

    iget v0, p0, Li3/o;->N:I

    const-wide v1, 0x7fffffffffffffffL

    const/4 v3, -0x1

    if-ne v0, v3, :cond_0

    return-wide v1

    :cond_0
    iget-object v0, p0, Li3/o;->L:Li3/m;

    invoke-static {v0}, Lu3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    iget v0, p0, Li3/o;->N:I

    iget-object v3, p0, Li3/o;->L:Li3/m;

    invoke-virtual {v3}, Li3/m;->j()I

    move-result v3

    if-lt v0, v3, :cond_1

    goto :goto_0

    :cond_1
    iget-object v0, p0, Li3/o;->L:Li3/m;

    iget v1, p0, Li3/o;->N:I

    invoke-virtual {v0, v1}, Li3/m;->g(I)J

    move-result-wide v1

    :goto_0
    return-wide v1
.end method

.method private W(J)J
    .locals 7
    .annotation runtime Lorg/checkerframework/dataflow/qual/SideEffectFree;
    .end annotation

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v2, p1, v0

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    move v2, v4

    :goto_0
    invoke-static {v2}, Lu3/a;->f(Z)V

    iget-wide v5, p0, Li3/o;->P:J

    cmp-long v0, v5, v0

    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    move v3, v4

    :goto_1
    invoke-static {v3}, Lu3/a;->f(Z)V

    iget-wide v0, p0, Li3/o;->P:J

    sub-long/2addr p1, v0

    return-wide p1
.end method

.method private X(Li3/j;)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Subtitle decoding failed. streamFormat="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Li3/o;->I:Lx1/n1;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "TextRenderer"

    invoke-static {v1, v0, p1}, Lu3/r;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-direct {p0}, Li3/o;->T()V

    invoke-direct {p0}, Li3/o;->c0()V

    return-void
.end method

.method private Y()V
    .locals 2

    const/4 v0, 0x1

    iput-boolean v0, p0, Li3/o;->G:Z

    iget-object v0, p0, Li3/o;->C:Li3/k;

    iget-object v1, p0, Li3/o;->I:Lx1/n1;

    invoke-static {v1}, Lu3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lx1/n1;

    invoke-interface {v0, v1}, Li3/k;->b(Lx1/n1;)Li3/i;

    move-result-object v0

    iput-object v0, p0, Li3/o;->J:Li3/i;

    return-void
.end method

.method private Z(Li3/e;)V
    .locals 2

    iget-object v0, p0, Li3/o;->B:Li3/n;

    iget-object v1, p1, Li3/e;->n:Lg5/q;

    invoke-interface {v0, v1}, Li3/n;->k(Ljava/util/List;)V

    iget-object v0, p0, Li3/o;->B:Li3/n;

    invoke-interface {v0, p1}, Li3/n;->q(Li3/e;)V

    return-void
.end method

.method private a0()V
    .locals 2

    const/4 v0, 0x0

    iput-object v0, p0, Li3/o;->K:Li3/l;

    const/4 v1, -0x1

    iput v1, p0, Li3/o;->N:I

    iget-object v1, p0, Li3/o;->L:Li3/m;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, La2/h;->x()V

    iput-object v0, p0, Li3/o;->L:Li3/m;

    :cond_0
    iget-object v1, p0, Li3/o;->M:Li3/m;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, La2/h;->x()V

    iput-object v0, p0, Li3/o;->M:Li3/m;

    :cond_1
    return-void
.end method

.method private b0()V
    .locals 1

    invoke-direct {p0}, Li3/o;->a0()V

    iget-object v0, p0, Li3/o;->J:Li3/i;

    invoke-static {v0}, Lu3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Li3/i;

    invoke-interface {v0}, La2/d;->a()V

    const/4 v0, 0x0

    iput-object v0, p0, Li3/o;->J:Li3/i;

    const/4 v0, 0x0

    iput v0, p0, Li3/o;->H:I

    return-void
.end method

.method private c0()V
    .locals 0

    invoke-direct {p0}, Li3/o;->b0()V

    invoke-direct {p0}, Li3/o;->Y()V

    return-void
.end method

.method private e0(Li3/e;)V
    .locals 2

    iget-object v0, p0, Li3/o;->A:Landroid/os/Handler;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    goto :goto_0

    :cond_0
    invoke-direct {p0, p1}, Li3/o;->Z(Li3/e;)V

    :goto_0
    return-void
.end method


# virtual methods
.method protected J()V
    .locals 2

    const/4 v0, 0x0

    iput-object v0, p0, Li3/o;->I:Lx1/n1;

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v0, p0, Li3/o;->O:J

    invoke-direct {p0}, Li3/o;->T()V

    iput-wide v0, p0, Li3/o;->P:J

    iput-wide v0, p0, Li3/o;->Q:J

    invoke-direct {p0}, Li3/o;->b0()V

    return-void
.end method

.method protected L(JZ)V
    .locals 0

    iput-wide p1, p0, Li3/o;->Q:J

    invoke-direct {p0}, Li3/o;->T()V

    const/4 p1, 0x0

    iput-boolean p1, p0, Li3/o;->E:Z

    iput-boolean p1, p0, Li3/o;->F:Z

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide p1, p0, Li3/o;->O:J

    iget p1, p0, Li3/o;->H:I

    if-eqz p1, :cond_0

    invoke-direct {p0}, Li3/o;->c0()V

    goto :goto_0

    :cond_0
    invoke-direct {p0}, Li3/o;->a0()V

    iget-object p1, p0, Li3/o;->J:Li3/i;

    invoke-static {p1}, Lu3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Li3/i;

    invoke-interface {p1}, La2/d;->flush()V

    :goto_0
    return-void
.end method

.method protected P([Lx1/n1;JJ)V
    .locals 0

    iput-wide p4, p0, Li3/o;->P:J

    const/4 p2, 0x0

    aget-object p1, p1, p2

    iput-object p1, p0, Li3/o;->I:Lx1/n1;

    iget-object p1, p0, Li3/o;->J:Li3/i;

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    iput p1, p0, Li3/o;->H:I

    goto :goto_0

    :cond_0
    invoke-direct {p0}, Li3/o;->Y()V

    :goto_0
    return-void
.end method

.method public a(Lx1/n1;)I
    .locals 1

    iget-object v0, p0, Li3/o;->C:Li3/k;

    invoke-interface {v0, p1}, Li3/k;->a(Lx1/n1;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget p1, p1, Lx1/n1;->T:I

    if-nez p1, :cond_0

    const/4 p1, 0x4

    goto :goto_0

    :cond_0
    const/4 p1, 0x2

    :goto_0
    invoke-static {p1}, Lx1/m3;->a(I)I

    move-result p1

    return p1

    :cond_1
    iget-object p1, p1, Lx1/n1;->y:Ljava/lang/String;

    invoke-static {p1}, Lu3/v;->r(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_2

    const/4 p1, 0x1

    :goto_1
    invoke-static {p1}, Lx1/m3;->a(I)I

    move-result p1

    return p1

    :cond_2
    const/4 p1, 0x0

    goto :goto_1
.end method

.method public d()Z
    .locals 1

    iget-boolean v0, p0, Li3/o;->F:Z

    return v0
.end method

.method public d0(J)V
    .locals 1

    invoke-virtual {p0}, Lx1/f;->v()Z

    move-result v0

    invoke-static {v0}, Lu3/a;->f(Z)V

    iput-wide p1, p0, Li3/o;->O:J

    return-void
.end method

.method public e()Ljava/lang/String;
    .locals 1

    const-string v0, "TextRenderer"

    return-object v0
.end method

.method public handleMessage(Landroid/os/Message;)Z
    .locals 1

    iget v0, p1, Landroid/os/Message;->what:I

    if-nez v0, :cond_0

    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Li3/e;

    invoke-direct {p0, p1}, Li3/o;->Z(Li3/e;)V

    const/4 p1, 0x1

    return p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1
.end method

.method public i()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public n(JJ)V
    .locals 8

    iput-wide p1, p0, Li3/o;->Q:J

    invoke-virtual {p0}, Lx1/f;->v()Z

    move-result p3

    const/4 p4, 0x1

    if-eqz p3, :cond_0

    iget-wide v0, p0, Li3/o;->O:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long p3, v0, v2

    if-eqz p3, :cond_0

    cmp-long p3, p1, v0

    if-ltz p3, :cond_0

    invoke-direct {p0}, Li3/o;->a0()V

    iput-boolean p4, p0, Li3/o;->F:Z

    :cond_0
    iget-boolean p3, p0, Li3/o;->F:Z

    if-eqz p3, :cond_1

    return-void

    :cond_1
    iget-object p3, p0, Li3/o;->M:Li3/m;

    if-nez p3, :cond_2

    iget-object p3, p0, Li3/o;->J:Li3/i;

    invoke-static {p3}, Lu3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Li3/i;

    invoke-interface {p3, p1, p2}, Li3/i;->b(J)V

    :try_start_0
    iget-object p3, p0, Li3/o;->J:Li3/i;

    invoke-static {p3}, Lu3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Li3/i;

    invoke-interface {p3}, La2/d;->d()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Li3/m;

    iput-object p3, p0, Li3/o;->M:Li3/m;
    :try_end_0
    .catch Li3/j; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    invoke-direct {p0, p1}, Li3/o;->X(Li3/j;)V

    return-void

    :cond_2
    :goto_0
    invoke-virtual {p0}, Lx1/f;->f()I

    move-result p3

    const/4 v0, 0x2

    if-eq p3, v0, :cond_3

    return-void

    :cond_3
    iget-object p3, p0, Li3/o;->L:Li3/m;

    const/4 v1, 0x0

    if-eqz p3, :cond_4

    invoke-direct {p0}, Li3/o;->V()J

    move-result-wide v2

    move p3, v1

    :goto_1
    cmp-long v2, v2, p1

    if-gtz v2, :cond_5

    iget p3, p0, Li3/o;->N:I

    add-int/2addr p3, p4

    iput p3, p0, Li3/o;->N:I

    invoke-direct {p0}, Li3/o;->V()J

    move-result-wide v2

    move p3, p4

    goto :goto_1

    :cond_4
    move p3, v1

    :cond_5
    iget-object v2, p0, Li3/o;->M:Li3/m;

    const/4 v3, 0x0

    if-eqz v2, :cond_9

    invoke-virtual {v2}, La2/a;->t()Z

    move-result v4

    if-eqz v4, :cond_7

    if-nez p3, :cond_9

    invoke-direct {p0}, Li3/o;->V()J

    move-result-wide v4

    const-wide v6, 0x7fffffffffffffffL

    cmp-long v2, v4, v6

    if-nez v2, :cond_9

    iget v2, p0, Li3/o;->H:I

    if-ne v2, v0, :cond_6

    invoke-direct {p0}, Li3/o;->c0()V

    goto :goto_2

    :cond_6
    invoke-direct {p0}, Li3/o;->a0()V

    iput-boolean p4, p0, Li3/o;->F:Z

    goto :goto_2

    :cond_7
    iget-wide v4, v2, La2/h;->o:J

    cmp-long v4, v4, p1

    if-gtz v4, :cond_9

    iget-object p3, p0, Li3/o;->L:Li3/m;

    if-eqz p3, :cond_8

    invoke-virtual {p3}, La2/h;->x()V

    :cond_8
    invoke-virtual {v2, p1, p2}, Li3/m;->e(J)I

    move-result p3

    iput p3, p0, Li3/o;->N:I

    iput-object v2, p0, Li3/o;->L:Li3/m;

    iput-object v3, p0, Li3/o;->M:Li3/m;

    move p3, p4

    :cond_9
    :goto_2
    if-eqz p3, :cond_a

    iget-object p3, p0, Li3/o;->L:Li3/m;

    invoke-static {p3}, Lu3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-direct {p0, p1, p2}, Li3/o;->U(J)J

    move-result-wide v4

    invoke-direct {p0, v4, v5}, Li3/o;->W(J)J

    move-result-wide v4

    new-instance p3, Li3/e;

    iget-object v2, p0, Li3/o;->L:Li3/m;

    invoke-virtual {v2, p1, p2}, Li3/m;->h(J)Ljava/util/List;

    move-result-object p1

    invoke-direct {p3, p1, v4, v5}, Li3/e;-><init>(Ljava/util/List;J)V

    invoke-direct {p0, p3}, Li3/o;->e0(Li3/e;)V

    :cond_a
    iget p1, p0, Li3/o;->H:I

    if-ne p1, v0, :cond_b

    return-void

    :cond_b
    :goto_3
    :try_start_1
    iget-boolean p1, p0, Li3/o;->E:Z

    if-nez p1, :cond_13

    iget-object p1, p0, Li3/o;->K:Li3/l;

    if-nez p1, :cond_d

    iget-object p1, p0, Li3/o;->J:Li3/i;

    invoke-static {p1}, Lu3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Li3/i;

    invoke-interface {p1}, La2/d;->e()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Li3/l;

    if-nez p1, :cond_c

    return-void

    :cond_c
    iput-object p1, p0, Li3/o;->K:Li3/l;

    :cond_d
    iget p2, p0, Li3/o;->H:I

    if-ne p2, p4, :cond_e

    const/4 p2, 0x4

    invoke-virtual {p1, p2}, La2/a;->w(I)V

    iget-object p2, p0, Li3/o;->J:Li3/i;

    invoke-static {p2}, Lu3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Li3/i;

    invoke-interface {p2, p1}, La2/d;->c(Ljava/lang/Object;)V

    iput-object v3, p0, Li3/o;->K:Li3/l;

    iput v0, p0, Li3/o;->H:I

    return-void

    :cond_e
    iget-object p2, p0, Li3/o;->D:Lx1/o1;

    invoke-virtual {p0, p2, p1, v1}, Lx1/f;->Q(Lx1/o1;La2/g;I)I

    move-result p2

    const/4 p3, -0x4

    if-ne p2, p3, :cond_12

    invoke-virtual {p1}, La2/a;->t()Z

    move-result p2

    if-eqz p2, :cond_f

    iput-boolean p4, p0, Li3/o;->E:Z

    iput-boolean v1, p0, Li3/o;->G:Z

    goto :goto_5

    :cond_f
    iget-object p2, p0, Li3/o;->D:Lx1/o1;

    iget-object p2, p2, Lx1/o1;->b:Lx1/n1;

    if-nez p2, :cond_10

    return-void

    :cond_10
    iget-wide p2, p2, Lx1/n1;->C:J

    iput-wide p2, p1, Li3/l;->v:J

    invoke-virtual {p1}, La2/g;->z()V

    iget-boolean p2, p0, Li3/o;->G:Z

    invoke-virtual {p1}, La2/a;->v()Z

    move-result p3

    if-nez p3, :cond_11

    move p3, p4

    goto :goto_4

    :cond_11
    move p3, v1

    :goto_4
    and-int/2addr p2, p3

    iput-boolean p2, p0, Li3/o;->G:Z

    :goto_5
    iget-boolean p2, p0, Li3/o;->G:Z

    if-nez p2, :cond_b

    iget-object p2, p0, Li3/o;->J:Li3/i;

    invoke-static {p2}, Lu3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Li3/i;

    invoke-interface {p2, p1}, La2/d;->c(Ljava/lang/Object;)V

    iput-object v3, p0, Li3/o;->K:Li3/l;
    :try_end_1
    .catch Li3/j; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_3

    :cond_12
    const/4 p1, -0x3

    if-ne p2, p1, :cond_b

    return-void

    :catch_1
    move-exception p1

    invoke-direct {p0, p1}, Li3/o;->X(Li3/j;)V

    :cond_13
    return-void
.end method
