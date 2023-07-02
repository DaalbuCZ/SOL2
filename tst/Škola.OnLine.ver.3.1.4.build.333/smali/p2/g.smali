.class public final Lp2/g;
.super Lx1/f;
.source ""

# interfaces
.implements Landroid/os/Handler$Callback;


# instance fields
.field private final A:Lp2/d;

.field private final B:Lp2/f;

.field private final C:Landroid/os/Handler;

.field private final D:Lp2/e;

.field private final E:Z

.field private F:Lp2/c;

.field private G:Z

.field private H:Z

.field private I:J

.field private J:Lp2/a;

.field private K:J


# direct methods
.method public constructor <init>(Lp2/f;Landroid/os/Looper;)V
    .locals 1

    sget-object v0, Lp2/d;->a:Lp2/d;

    invoke-direct {p0, p1, p2, v0}, Lp2/g;-><init>(Lp2/f;Landroid/os/Looper;Lp2/d;)V

    return-void
.end method

.method public constructor <init>(Lp2/f;Landroid/os/Looper;Lp2/d;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, p3, v0}, Lp2/g;-><init>(Lp2/f;Landroid/os/Looper;Lp2/d;Z)V

    return-void
.end method

.method public constructor <init>(Lp2/f;Landroid/os/Looper;Lp2/d;Z)V
    .locals 1

    const/4 v0, 0x5

    invoke-direct {p0, v0}, Lx1/f;-><init>(I)V

    invoke-static {p1}, Lu3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lp2/f;

    iput-object p1, p0, Lp2/g;->B:Lp2/f;

    if-nez p2, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    invoke-static {p2, p0}, Lu3/n0;->v(Landroid/os/Looper;Landroid/os/Handler$Callback;)Landroid/os/Handler;

    move-result-object p1

    :goto_0
    iput-object p1, p0, Lp2/g;->C:Landroid/os/Handler;

    invoke-static {p3}, Lu3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lp2/d;

    iput-object p1, p0, Lp2/g;->A:Lp2/d;

    iput-boolean p4, p0, Lp2/g;->E:Z

    new-instance p1, Lp2/e;

    invoke-direct {p1}, Lp2/e;-><init>()V

    iput-object p1, p0, Lp2/g;->D:Lp2/e;

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide p1, p0, Lp2/g;->K:J

    return-void
.end method

.method private T(Lp2/a;Ljava/util/List;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp2/a;",
            "Ljava/util/List<",
            "Lp2/a$b;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p1}, Lp2/a;->e()I

    move-result v1

    if-ge v0, v1, :cond_2

    invoke-virtual {p1, v0}, Lp2/a;->d(I)Lp2/a$b;

    move-result-object v1

    invoke-interface {v1}, Lp2/a$b;->h()Lx1/n1;

    move-result-object v1

    if-eqz v1, :cond_0

    iget-object v2, p0, Lp2/g;->A:Lp2/d;

    invoke-interface {v2, v1}, Lp2/d;->a(Lx1/n1;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v2, p0, Lp2/g;->A:Lp2/d;

    invoke-interface {v2, v1}, Lp2/d;->b(Lx1/n1;)Lp2/c;

    move-result-object v1

    invoke-virtual {p1, v0}, Lp2/a;->d(I)Lp2/a$b;

    move-result-object v2

    invoke-interface {v2}, Lp2/a$b;->l()[B

    move-result-object v2

    invoke-static {v2}, Lu3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [B

    iget-object v3, p0, Lp2/g;->D:Lp2/e;

    invoke-virtual {v3}, La2/g;->n()V

    iget-object v3, p0, Lp2/g;->D:Lp2/e;

    array-length v4, v2

    invoke-virtual {v3, v4}, La2/g;->y(I)V

    iget-object v3, p0, Lp2/g;->D:Lp2/e;

    iget-object v3, v3, La2/g;->p:Ljava/nio/ByteBuffer;

    invoke-static {v3}, Lu3/n0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/nio/ByteBuffer;

    invoke-virtual {v3, v2}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    iget-object v2, p0, Lp2/g;->D:Lp2/e;

    invoke-virtual {v2}, La2/g;->z()V

    iget-object v2, p0, Lp2/g;->D:Lp2/e;

    invoke-interface {v1, v2}, Lp2/c;->a(Lp2/e;)Lp2/a;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-direct {p0, v1, p2}, Lp2/g;->T(Lp2/a;Ljava/util/List;)V

    goto :goto_1

    :cond_0
    invoke-virtual {p1, v0}, Lp2/a;->d(I)Lp2/a$b;

    move-result-object v1

    invoke-interface {p2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_1
    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method private U(J)J
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

    iget-wide v5, p0, Lp2/g;->K:J

    cmp-long v0, v5, v0

    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    move v3, v4

    :goto_1
    invoke-static {v3}, Lu3/a;->f(Z)V

    iget-wide v0, p0, Lp2/g;->K:J

    sub-long/2addr p1, v0

    return-wide p1
.end method

.method private V(Lp2/a;)V
    .locals 2

    iget-object v0, p0, Lp2/g;->C:Landroid/os/Handler;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    goto :goto_0

    :cond_0
    invoke-direct {p0, p1}, Lp2/g;->W(Lp2/a;)V

    :goto_0
    return-void
.end method

.method private W(Lp2/a;)V
    .locals 1

    iget-object v0, p0, Lp2/g;->B:Lp2/f;

    invoke-interface {v0, p1}, Lp2/f;->n(Lp2/a;)V

    return-void
.end method

.method private X(J)Z
    .locals 4

    iget-object v0, p0, Lp2/g;->J:Lp2/a;

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    iget-boolean v2, p0, Lp2/g;->E:Z

    if-nez v2, :cond_0

    iget-wide v2, v0, Lp2/a;->o:J

    invoke-direct {p0, p1, p2}, Lp2/g;->U(J)J

    move-result-wide p1

    cmp-long p1, v2, p1

    if-gtz p1, :cond_1

    :cond_0
    iget-object p1, p0, Lp2/g;->J:Lp2/a;

    invoke-direct {p0, p1}, Lp2/g;->V(Lp2/a;)V

    const/4 p1, 0x0

    iput-object p1, p0, Lp2/g;->J:Lp2/a;

    move p1, v1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    iget-boolean p2, p0, Lp2/g;->G:Z

    if-eqz p2, :cond_2

    iget-object p2, p0, Lp2/g;->J:Lp2/a;

    if-nez p2, :cond_2

    iput-boolean v1, p0, Lp2/g;->H:Z

    :cond_2
    return p1
.end method

.method private Y()V
    .locals 4

    iget-boolean v0, p0, Lp2/g;->G:Z

    if-nez v0, :cond_2

    iget-object v0, p0, Lp2/g;->J:Lp2/a;

    if-nez v0, :cond_2

    iget-object v0, p0, Lp2/g;->D:Lp2/e;

    invoke-virtual {v0}, La2/g;->n()V

    invoke-virtual {p0}, Lx1/f;->E()Lx1/o1;

    move-result-object v0

    iget-object v1, p0, Lp2/g;->D:Lp2/e;

    const/4 v2, 0x0

    invoke-virtual {p0, v0, v1, v2}, Lx1/f;->Q(Lx1/o1;La2/g;I)I

    move-result v1

    const/4 v2, -0x4

    if-ne v1, v2, :cond_1

    iget-object v0, p0, Lp2/g;->D:Lp2/e;

    invoke-virtual {v0}, La2/a;->t()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lp2/g;->G:Z

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lp2/g;->D:Lp2/e;

    iget-wide v1, p0, Lp2/g;->I:J

    iput-wide v1, v0, Lp2/e;->v:J

    invoke-virtual {v0}, La2/g;->z()V

    iget-object v0, p0, Lp2/g;->F:Lp2/c;

    invoke-static {v0}, Lu3/n0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lp2/c;

    iget-object v1, p0, Lp2/g;->D:Lp2/e;

    invoke-interface {v0, v1}, Lp2/c;->a(Lp2/e;)Lp2/a;

    move-result-object v0

    if-eqz v0, :cond_2

    new-instance v1, Ljava/util/ArrayList;

    invoke-virtual {v0}, Lp2/a;->e()I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-direct {p0, v0, v1}, Lp2/g;->T(Lp2/a;Ljava/util/List;)V

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    new-instance v0, Lp2/a;

    iget-object v2, p0, Lp2/g;->D:Lp2/e;

    iget-wide v2, v2, La2/g;->r:J

    invoke-direct {p0, v2, v3}, Lp2/g;->U(J)J

    move-result-wide v2

    invoke-direct {v0, v2, v3, v1}, Lp2/a;-><init>(JLjava/util/List;)V

    iput-object v0, p0, Lp2/g;->J:Lp2/a;

    goto :goto_0

    :cond_1
    const/4 v2, -0x5

    if-ne v1, v2, :cond_2

    iget-object v0, v0, Lx1/o1;->b:Lx1/n1;

    invoke-static {v0}, Lu3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lx1/n1;

    iget-wide v0, v0, Lx1/n1;->C:J

    iput-wide v0, p0, Lp2/g;->I:J

    :cond_2
    :goto_0
    return-void
.end method


# virtual methods
.method protected J()V
    .locals 2

    const/4 v0, 0x0

    iput-object v0, p0, Lp2/g;->J:Lp2/a;

    iput-object v0, p0, Lp2/g;->F:Lp2/c;

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v0, p0, Lp2/g;->K:J

    return-void
.end method

.method protected L(JZ)V
    .locals 0

    const/4 p1, 0x0

    iput-object p1, p0, Lp2/g;->J:Lp2/a;

    const/4 p1, 0x0

    iput-boolean p1, p0, Lp2/g;->G:Z

    iput-boolean p1, p0, Lp2/g;->H:Z

    return-void
.end method

.method protected P([Lx1/n1;JJ)V
    .locals 2

    iget-object p2, p0, Lp2/g;->A:Lp2/d;

    const/4 p3, 0x0

    aget-object p1, p1, p3

    invoke-interface {p2, p1}, Lp2/d;->b(Lx1/n1;)Lp2/c;

    move-result-object p1

    iput-object p1, p0, Lp2/g;->F:Lp2/c;

    iget-object p1, p0, Lp2/g;->J:Lp2/a;

    if-eqz p1, :cond_0

    iget-wide p2, p1, Lp2/a;->o:J

    iget-wide v0, p0, Lp2/g;->K:J

    add-long/2addr p2, v0

    sub-long/2addr p2, p4

    invoke-virtual {p1, p2, p3}, Lp2/a;->c(J)Lp2/a;

    move-result-object p1

    iput-object p1, p0, Lp2/g;->J:Lp2/a;

    :cond_0
    iput-wide p4, p0, Lp2/g;->K:J

    return-void
.end method

.method public a(Lx1/n1;)I
    .locals 1

    iget-object v0, p0, Lp2/g;->A:Lp2/d;

    invoke-interface {v0, p1}, Lp2/d;->a(Lx1/n1;)Z

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
    const/4 p1, 0x0

    invoke-static {p1}, Lx1/m3;->a(I)I

    move-result p1

    return p1
.end method

.method public d()Z
    .locals 1

    iget-boolean v0, p0, Lp2/g;->H:Z

    return v0
.end method

.method public e()Ljava/lang/String;
    .locals 1

    const-string v0, "MetadataRenderer"

    return-object v0
.end method

.method public handleMessage(Landroid/os/Message;)Z
    .locals 1

    iget v0, p1, Landroid/os/Message;->what:I

    if-nez v0, :cond_0

    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Lp2/a;

    invoke-direct {p0, p1}, Lp2/g;->W(Lp2/a;)V

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
    .locals 0

    const/4 p3, 0x1

    :goto_0
    if-eqz p3, :cond_0

    invoke-direct {p0}, Lp2/g;->Y()V

    invoke-direct {p0, p1, p2}, Lp2/g;->X(J)Z

    move-result p3

    goto :goto_0

    :cond_0
    return-void
.end method
