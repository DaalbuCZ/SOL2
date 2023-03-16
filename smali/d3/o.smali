.class public final Ld3/o;
.super Ls1/f;
.source ""

# interfaces
.implements Landroid/os/Handler$Callback;


# instance fields
.field private final A:Landroid/os/Handler;

.field private final B:Ld3/n;

.field private final C:Ld3/k;

.field private final D:Ls1/n1;

.field private E:Z

.field private F:Z

.field private G:Z

.field private H:I

.field private I:Ls1/m1;

.field private J:Ld3/i;

.field private K:Ld3/l;

.field private L:Ld3/m;

.field private M:Ld3/m;

.field private N:I

.field private O:J


# direct methods
.method public constructor <init>(Ld3/n;Landroid/os/Looper;)V
    .locals 1

    sget-object v0, Ld3/k;->a:Ld3/k;

    invoke-direct {p0, p1, p2, v0}, Ld3/o;-><init>(Ld3/n;Landroid/os/Looper;Ld3/k;)V

    return-void
.end method

.method public constructor <init>(Ld3/n;Landroid/os/Looper;Ld3/k;)V
    .locals 1

    const/4 v0, 0x3

    invoke-direct {p0, v0}, Ls1/f;-><init>(I)V

    invoke-static {p1}, Lp3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ld3/n;

    iput-object p1, p0, Ld3/o;->B:Ld3/n;

    if-nez p2, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    invoke-static {p2, p0}, Lp3/m0;->v(Landroid/os/Looper;Landroid/os/Handler$Callback;)Landroid/os/Handler;

    move-result-object p1

    :goto_0
    iput-object p1, p0, Ld3/o;->A:Landroid/os/Handler;

    iput-object p3, p0, Ld3/o;->C:Ld3/k;

    new-instance p1, Ls1/n1;

    invoke-direct {p1}, Ls1/n1;-><init>()V

    iput-object p1, p0, Ld3/o;->D:Ls1/n1;

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide p1, p0, Ld3/o;->O:J

    return-void
.end method

.method private T()V
    .locals 1

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    invoke-direct {p0, v0}, Ld3/o;->c0(Ljava/util/List;)V

    return-void
.end method

.method private U()J
    .locals 4

    iget v0, p0, Ld3/o;->N:I

    const-wide v1, 0x7fffffffffffffffL

    const/4 v3, -0x1

    if-ne v0, v3, :cond_0

    return-wide v1

    :cond_0
    iget-object v0, p0, Ld3/o;->L:Ld3/m;

    invoke-static {v0}, Lp3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    iget v0, p0, Ld3/o;->N:I

    iget-object v3, p0, Ld3/o;->L:Ld3/m;

    invoke-virtual {v3}, Ld3/m;->j()I

    move-result v3

    if-lt v0, v3, :cond_1

    goto :goto_0

    :cond_1
    iget-object v0, p0, Ld3/o;->L:Ld3/m;

    iget v1, p0, Ld3/o;->N:I

    invoke-virtual {v0, v1}, Ld3/m;->g(I)J

    move-result-wide v1

    :goto_0
    return-wide v1
.end method

.method private V(Ld3/j;)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Subtitle decoding failed. streamFormat="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ld3/o;->I:Ls1/m1;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "TextRenderer"

    invoke-static {v1, v0, p1}, Lp3/r;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-direct {p0}, Ld3/o;->T()V

    invoke-direct {p0}, Ld3/o;->a0()V

    return-void
.end method

.method private W()V
    .locals 2

    const/4 v0, 0x1

    iput-boolean v0, p0, Ld3/o;->G:Z

    iget-object v0, p0, Ld3/o;->C:Ld3/k;

    iget-object v1, p0, Ld3/o;->I:Ls1/m1;

    invoke-static {v1}, Lp3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ls1/m1;

    invoke-interface {v0, v1}, Ld3/k;->b(Ls1/m1;)Ld3/i;

    move-result-object v0

    iput-object v0, p0, Ld3/o;->J:Ld3/i;

    return-void
.end method

.method private X(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ld3/b;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Ld3/o;->B:Ld3/n;

    invoke-interface {v0, p1}, Ld3/n;->j(Ljava/util/List;)V

    iget-object v0, p0, Ld3/o;->B:Ld3/n;

    new-instance v1, Ld3/e;

    invoke-direct {v1, p1}, Ld3/e;-><init>(Ljava/util/List;)V

    invoke-interface {v0, v1}, Ld3/n;->d(Ld3/e;)V

    return-void
.end method

.method private Y()V
    .locals 2

    const/4 v0, 0x0

    iput-object v0, p0, Ld3/o;->K:Ld3/l;

    const/4 v1, -0x1

    iput v1, p0, Ld3/o;->N:I

    iget-object v1, p0, Ld3/o;->L:Ld3/m;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lv1/h;->x()V

    iput-object v0, p0, Ld3/o;->L:Ld3/m;

    :cond_0
    iget-object v1, p0, Ld3/o;->M:Ld3/m;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lv1/h;->x()V

    iput-object v0, p0, Ld3/o;->M:Ld3/m;

    :cond_1
    return-void
.end method

.method private Z()V
    .locals 1

    invoke-direct {p0}, Ld3/o;->Y()V

    iget-object v0, p0, Ld3/o;->J:Ld3/i;

    invoke-static {v0}, Lp3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ld3/i;

    invoke-interface {v0}, Lv1/d;->a()V

    const/4 v0, 0x0

    iput-object v0, p0, Ld3/o;->J:Ld3/i;

    const/4 v0, 0x0

    iput v0, p0, Ld3/o;->H:I

    return-void
.end method

.method private a0()V
    .locals 0

    invoke-direct {p0}, Ld3/o;->Z()V

    invoke-direct {p0}, Ld3/o;->W()V

    return-void
.end method

.method private c0(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ld3/b;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Ld3/o;->A:Landroid/os/Handler;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    goto :goto_0

    :cond_0
    invoke-direct {p0, p1}, Ld3/o;->X(Ljava/util/List;)V

    :goto_0
    return-void
.end method


# virtual methods
.method protected J()V
    .locals 2

    const/4 v0, 0x0

    iput-object v0, p0, Ld3/o;->I:Ls1/m1;

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v0, p0, Ld3/o;->O:J

    invoke-direct {p0}, Ld3/o;->T()V

    invoke-direct {p0}, Ld3/o;->Z()V

    return-void
.end method

.method protected L(JZ)V
    .locals 0

    invoke-direct {p0}, Ld3/o;->T()V

    const/4 p1, 0x0

    iput-boolean p1, p0, Ld3/o;->E:Z

    iput-boolean p1, p0, Ld3/o;->F:Z

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide p1, p0, Ld3/o;->O:J

    iget p1, p0, Ld3/o;->H:I

    if-eqz p1, :cond_0

    invoke-direct {p0}, Ld3/o;->a0()V

    goto :goto_0

    :cond_0
    invoke-direct {p0}, Ld3/o;->Y()V

    iget-object p1, p0, Ld3/o;->J:Ld3/i;

    invoke-static {p1}, Lp3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ld3/i;

    invoke-interface {p1}, Lv1/d;->flush()V

    :goto_0
    return-void
.end method

.method protected P([Ls1/m1;JJ)V
    .locals 0

    const/4 p2, 0x0

    aget-object p1, p1, p2

    iput-object p1, p0, Ld3/o;->I:Ls1/m1;

    iget-object p1, p0, Ld3/o;->J:Ld3/i;

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    iput p1, p0, Ld3/o;->H:I

    goto :goto_0

    :cond_0
    invoke-direct {p0}, Ld3/o;->W()V

    :goto_0
    return-void
.end method

.method public a(Ls1/m1;)I
    .locals 1

    iget-object v0, p0, Ld3/o;->C:Ld3/k;

    invoke-interface {v0, p1}, Ld3/k;->a(Ls1/m1;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget p1, p1, Ls1/m1;->R:I

    if-nez p1, :cond_0

    const/4 p1, 0x4

    goto :goto_0

    :cond_0
    const/4 p1, 0x2

    :goto_0
    invoke-static {p1}, Ls1/z2;->a(I)I

    move-result p1

    return p1

    :cond_1
    iget-object p1, p1, Ls1/m1;->y:Ljava/lang/String;

    invoke-static {p1}, Lp3/v;->r(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_2

    const/4 p1, 0x1

    :goto_1
    invoke-static {p1}, Ls1/z2;->a(I)I

    move-result p1

    return p1

    :cond_2
    const/4 p1, 0x0

    goto :goto_1
.end method

.method public b()Z
    .locals 1

    iget-boolean v0, p0, Ld3/o;->F:Z

    return v0
.end method

.method public b0(J)V
    .locals 1

    invoke-virtual {p0}, Ls1/f;->v()Z

    move-result v0

    invoke-static {v0}, Lp3/a;->f(Z)V

    iput-wide p1, p0, Ld3/o;->O:J

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

    check-cast p1, Ljava/util/List;

    invoke-direct {p0, p1}, Ld3/o;->X(Ljava/util/List;)V

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

.method public o(JJ)V
    .locals 8

    invoke-virtual {p0}, Ls1/f;->v()Z

    move-result p3

    const/4 p4, 0x1

    if-eqz p3, :cond_0

    iget-wide v0, p0, Ld3/o;->O:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long p3, v0, v2

    if-eqz p3, :cond_0

    cmp-long p3, p1, v0

    if-ltz p3, :cond_0

    invoke-direct {p0}, Ld3/o;->Y()V

    iput-boolean p4, p0, Ld3/o;->F:Z

    :cond_0
    iget-boolean p3, p0, Ld3/o;->F:Z

    if-eqz p3, :cond_1

    return-void

    :cond_1
    iget-object p3, p0, Ld3/o;->M:Ld3/m;

    if-nez p3, :cond_2

    iget-object p3, p0, Ld3/o;->J:Ld3/i;

    invoke-static {p3}, Lp3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ld3/i;

    invoke-interface {p3, p1, p2}, Ld3/i;->b(J)V

    :try_start_0
    iget-object p3, p0, Ld3/o;->J:Ld3/i;

    invoke-static {p3}, Lp3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ld3/i;

    invoke-interface {p3}, Lv1/d;->d()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ld3/m;

    iput-object p3, p0, Ld3/o;->M:Ld3/m;
    :try_end_0
    .catch Ld3/j; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    invoke-direct {p0, p1}, Ld3/o;->V(Ld3/j;)V

    return-void

    :cond_2
    :goto_0
    invoke-virtual {p0}, Ls1/f;->f()I

    move-result p3

    const/4 v0, 0x2

    if-eq p3, v0, :cond_3

    return-void

    :cond_3
    iget-object p3, p0, Ld3/o;->L:Ld3/m;

    const/4 v1, 0x0

    if-eqz p3, :cond_4

    invoke-direct {p0}, Ld3/o;->U()J

    move-result-wide v2

    move p3, v1

    :goto_1
    cmp-long v2, v2, p1

    if-gtz v2, :cond_5

    iget p3, p0, Ld3/o;->N:I

    add-int/2addr p3, p4

    iput p3, p0, Ld3/o;->N:I

    invoke-direct {p0}, Ld3/o;->U()J

    move-result-wide v2

    move p3, p4

    goto :goto_1

    :cond_4
    move p3, v1

    :cond_5
    iget-object v2, p0, Ld3/o;->M:Ld3/m;

    const/4 v3, 0x0

    if-eqz v2, :cond_9

    invoke-virtual {v2}, Lv1/a;->t()Z

    move-result v4

    if-eqz v4, :cond_7

    if-nez p3, :cond_9

    invoke-direct {p0}, Ld3/o;->U()J

    move-result-wide v4

    const-wide v6, 0x7fffffffffffffffL

    cmp-long v2, v4, v6

    if-nez v2, :cond_9

    iget v2, p0, Ld3/o;->H:I

    if-ne v2, v0, :cond_6

    invoke-direct {p0}, Ld3/o;->a0()V

    goto :goto_2

    :cond_6
    invoke-direct {p0}, Ld3/o;->Y()V

    iput-boolean p4, p0, Ld3/o;->F:Z

    goto :goto_2

    :cond_7
    iget-wide v4, v2, Lv1/h;->o:J

    cmp-long v4, v4, p1

    if-gtz v4, :cond_9

    iget-object p3, p0, Ld3/o;->L:Ld3/m;

    if-eqz p3, :cond_8

    invoke-virtual {p3}, Lv1/h;->x()V

    :cond_8
    invoke-virtual {v2, p1, p2}, Ld3/m;->e(J)I

    move-result p3

    iput p3, p0, Ld3/o;->N:I

    iput-object v2, p0, Ld3/o;->L:Ld3/m;

    iput-object v3, p0, Ld3/o;->M:Ld3/m;

    move p3, p4

    :cond_9
    :goto_2
    if-eqz p3, :cond_a

    iget-object p3, p0, Ld3/o;->L:Ld3/m;

    invoke-static {p3}, Lp3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p3, p0, Ld3/o;->L:Ld3/m;

    invoke-virtual {p3, p1, p2}, Ld3/m;->h(J)Ljava/util/List;

    move-result-object p1

    invoke-direct {p0, p1}, Ld3/o;->c0(Ljava/util/List;)V

    :cond_a
    iget p1, p0, Ld3/o;->H:I

    if-ne p1, v0, :cond_b

    return-void

    :cond_b
    :goto_3
    :try_start_1
    iget-boolean p1, p0, Ld3/o;->E:Z

    if-nez p1, :cond_13

    iget-object p1, p0, Ld3/o;->K:Ld3/l;

    if-nez p1, :cond_d

    iget-object p1, p0, Ld3/o;->J:Ld3/i;

    invoke-static {p1}, Lp3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ld3/i;

    invoke-interface {p1}, Lv1/d;->e()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ld3/l;

    if-nez p1, :cond_c

    return-void

    :cond_c
    iput-object p1, p0, Ld3/o;->K:Ld3/l;

    :cond_d
    iget p2, p0, Ld3/o;->H:I

    if-ne p2, p4, :cond_e

    const/4 p2, 0x4

    invoke-virtual {p1, p2}, Lv1/a;->w(I)V

    iget-object p2, p0, Ld3/o;->J:Ld3/i;

    invoke-static {p2}, Lp3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ld3/i;

    invoke-interface {p2, p1}, Lv1/d;->c(Ljava/lang/Object;)V

    iput-object v3, p0, Ld3/o;->K:Ld3/l;

    iput v0, p0, Ld3/o;->H:I

    return-void

    :cond_e
    iget-object p2, p0, Ld3/o;->D:Ls1/n1;

    invoke-virtual {p0, p2, p1, v1}, Ls1/f;->Q(Ls1/n1;Lv1/g;I)I

    move-result p2

    const/4 p3, -0x4

    if-ne p2, p3, :cond_12

    invoke-virtual {p1}, Lv1/a;->t()Z

    move-result p2

    if-eqz p2, :cond_f

    iput-boolean p4, p0, Ld3/o;->E:Z

    iput-boolean v1, p0, Ld3/o;->G:Z

    goto :goto_5

    :cond_f
    iget-object p2, p0, Ld3/o;->D:Ls1/n1;

    iget-object p2, p2, Ls1/n1;->b:Ls1/m1;

    if-nez p2, :cond_10

    return-void

    :cond_10
    iget-wide p2, p2, Ls1/m1;->C:J

    iput-wide p2, p1, Ld3/l;->v:J

    invoke-virtual {p1}, Lv1/g;->z()V

    iget-boolean p2, p0, Ld3/o;->G:Z

    invoke-virtual {p1}, Lv1/a;->v()Z

    move-result p3

    if-nez p3, :cond_11

    move p3, p4

    goto :goto_4

    :cond_11
    move p3, v1

    :goto_4
    and-int/2addr p2, p3

    iput-boolean p2, p0, Ld3/o;->G:Z

    :goto_5
    iget-boolean p2, p0, Ld3/o;->G:Z

    if-nez p2, :cond_b

    iget-object p2, p0, Ld3/o;->J:Ld3/i;

    invoke-static {p2}, Lp3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ld3/i;

    invoke-interface {p2, p1}, Lv1/d;->c(Ljava/lang/Object;)V

    iput-object v3, p0, Ld3/o;->K:Ld3/l;
    :try_end_1
    .catch Ld3/j; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_3

    :cond_12
    const/4 p1, -0x3

    if-ne p2, p1, :cond_b

    return-void

    :catch_1
    move-exception p1

    invoke-direct {p0, p1}, Ld3/o;->V(Ld3/j;)V

    :cond_13
    return-void
.end method
