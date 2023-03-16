.class public final Lk2/g;
.super Ls1/f;
.source ""

# interfaces
.implements Landroid/os/Handler$Callback;


# instance fields
.field private final A:Lk2/d;

.field private final B:Lk2/f;

.field private final C:Landroid/os/Handler;

.field private final D:Lk2/e;

.field private E:Lk2/c;

.field private F:Z

.field private G:Z

.field private H:J

.field private I:J

.field private J:Lk2/a;


# direct methods
.method public constructor <init>(Lk2/f;Landroid/os/Looper;)V
    .locals 1

    sget-object v0, Lk2/d;->a:Lk2/d;

    invoke-direct {p0, p1, p2, v0}, Lk2/g;-><init>(Lk2/f;Landroid/os/Looper;Lk2/d;)V

    return-void
.end method

.method public constructor <init>(Lk2/f;Landroid/os/Looper;Lk2/d;)V
    .locals 1

    const/4 v0, 0x5

    invoke-direct {p0, v0}, Ls1/f;-><init>(I)V

    invoke-static {p1}, Lp3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lk2/f;

    iput-object p1, p0, Lk2/g;->B:Lk2/f;

    if-nez p2, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    invoke-static {p2, p0}, Lp3/m0;->v(Landroid/os/Looper;Landroid/os/Handler$Callback;)Landroid/os/Handler;

    move-result-object p1

    :goto_0
    iput-object p1, p0, Lk2/g;->C:Landroid/os/Handler;

    invoke-static {p3}, Lp3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lk2/d;

    iput-object p1, p0, Lk2/g;->A:Lk2/d;

    new-instance p1, Lk2/e;

    invoke-direct {p1}, Lk2/e;-><init>()V

    iput-object p1, p0, Lk2/g;->D:Lk2/e;

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide p1, p0, Lk2/g;->I:J

    return-void
.end method

.method private T(Lk2/a;Ljava/util/List;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lk2/a;",
            "Ljava/util/List<",
            "Lk2/a$b;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p1}, Lk2/a;->d()I

    move-result v1

    if-ge v0, v1, :cond_2

    invoke-virtual {p1, v0}, Lk2/a;->c(I)Lk2/a$b;

    move-result-object v1

    invoke-interface {v1}, Lk2/a$b;->g()Ls1/m1;

    move-result-object v1

    if-eqz v1, :cond_0

    iget-object v2, p0, Lk2/g;->A:Lk2/d;

    invoke-interface {v2, v1}, Lk2/d;->a(Ls1/m1;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v2, p0, Lk2/g;->A:Lk2/d;

    invoke-interface {v2, v1}, Lk2/d;->b(Ls1/m1;)Lk2/c;

    move-result-object v1

    invoke-virtual {p1, v0}, Lk2/a;->c(I)Lk2/a$b;

    move-result-object v2

    invoke-interface {v2}, Lk2/a$b;->l()[B

    move-result-object v2

    invoke-static {v2}, Lp3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [B

    iget-object v3, p0, Lk2/g;->D:Lk2/e;

    invoke-virtual {v3}, Lv1/g;->m()V

    iget-object v3, p0, Lk2/g;->D:Lk2/e;

    array-length v4, v2

    invoke-virtual {v3, v4}, Lv1/g;->y(I)V

    iget-object v3, p0, Lk2/g;->D:Lk2/e;

    iget-object v3, v3, Lv1/g;->p:Ljava/nio/ByteBuffer;

    invoke-static {v3}, Lp3/m0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/nio/ByteBuffer;

    invoke-virtual {v3, v2}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    iget-object v2, p0, Lk2/g;->D:Lk2/e;

    invoke-virtual {v2}, Lv1/g;->z()V

    iget-object v2, p0, Lk2/g;->D:Lk2/e;

    invoke-interface {v1, v2}, Lk2/c;->a(Lk2/e;)Lk2/a;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-direct {p0, v1, p2}, Lk2/g;->T(Lk2/a;Ljava/util/List;)V

    goto :goto_1

    :cond_0
    invoke-virtual {p1, v0}, Lk2/a;->c(I)Lk2/a$b;

    move-result-object v1

    invoke-interface {p2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_1
    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method private U(Lk2/a;)V
    .locals 2

    iget-object v0, p0, Lk2/g;->C:Landroid/os/Handler;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    goto :goto_0

    :cond_0
    invoke-direct {p0, p1}, Lk2/g;->V(Lk2/a;)V

    :goto_0
    return-void
.end method

.method private V(Lk2/a;)V
    .locals 1

    iget-object v0, p0, Lk2/g;->B:Lk2/f;

    invoke-interface {v0, p1}, Lk2/f;->x(Lk2/a;)V

    return-void
.end method

.method private W(J)Z
    .locals 4

    iget-object v0, p0, Lk2/g;->J:Lk2/a;

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    iget-wide v2, p0, Lk2/g;->I:J

    cmp-long p1, v2, p1

    if-gtz p1, :cond_0

    invoke-direct {p0, v0}, Lk2/g;->U(Lk2/a;)V

    const/4 p1, 0x0

    iput-object p1, p0, Lk2/g;->J:Lk2/a;

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide p1, p0, Lk2/g;->I:J

    move p1, v1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iget-boolean p2, p0, Lk2/g;->F:Z

    if-eqz p2, :cond_1

    iget-object p2, p0, Lk2/g;->J:Lk2/a;

    if-nez p2, :cond_1

    iput-boolean v1, p0, Lk2/g;->G:Z

    :cond_1
    return p1
.end method

.method private X()V
    .locals 3

    iget-boolean v0, p0, Lk2/g;->F:Z

    if-nez v0, :cond_2

    iget-object v0, p0, Lk2/g;->J:Lk2/a;

    if-nez v0, :cond_2

    iget-object v0, p0, Lk2/g;->D:Lk2/e;

    invoke-virtual {v0}, Lv1/g;->m()V

    invoke-virtual {p0}, Ls1/f;->E()Ls1/n1;

    move-result-object v0

    iget-object v1, p0, Lk2/g;->D:Lk2/e;

    const/4 v2, 0x0

    invoke-virtual {p0, v0, v1, v2}, Ls1/f;->Q(Ls1/n1;Lv1/g;I)I

    move-result v1

    const/4 v2, -0x4

    if-ne v1, v2, :cond_1

    iget-object v0, p0, Lk2/g;->D:Lk2/e;

    invoke-virtual {v0}, Lv1/a;->t()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lk2/g;->F:Z

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lk2/g;->D:Lk2/e;

    iget-wide v1, p0, Lk2/g;->H:J

    iput-wide v1, v0, Lk2/e;->v:J

    invoke-virtual {v0}, Lv1/g;->z()V

    iget-object v0, p0, Lk2/g;->E:Lk2/c;

    invoke-static {v0}, Lp3/m0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lk2/c;

    iget-object v1, p0, Lk2/g;->D:Lk2/e;

    invoke-interface {v0, v1}, Lk2/c;->a(Lk2/e;)Lk2/a;

    move-result-object v0

    if-eqz v0, :cond_2

    new-instance v1, Ljava/util/ArrayList;

    invoke-virtual {v0}, Lk2/a;->d()I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-direct {p0, v0, v1}, Lk2/g;->T(Lk2/a;Ljava/util/List;)V

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    new-instance v0, Lk2/a;

    invoke-direct {v0, v1}, Lk2/a;-><init>(Ljava/util/List;)V

    iput-object v0, p0, Lk2/g;->J:Lk2/a;

    iget-object v0, p0, Lk2/g;->D:Lk2/e;

    iget-wide v0, v0, Lv1/g;->r:J

    iput-wide v0, p0, Lk2/g;->I:J

    goto :goto_0

    :cond_1
    const/4 v2, -0x5

    if-ne v1, v2, :cond_2

    iget-object v0, v0, Ls1/n1;->b:Ls1/m1;

    invoke-static {v0}, Lp3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ls1/m1;

    iget-wide v0, v0, Ls1/m1;->C:J

    iput-wide v0, p0, Lk2/g;->H:J

    :cond_2
    :goto_0
    return-void
.end method


# virtual methods
.method protected J()V
    .locals 3

    const/4 v0, 0x0

    iput-object v0, p0, Lk2/g;->J:Lk2/a;

    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v1, p0, Lk2/g;->I:J

    iput-object v0, p0, Lk2/g;->E:Lk2/c;

    return-void
.end method

.method protected L(JZ)V
    .locals 0

    const/4 p1, 0x0

    iput-object p1, p0, Lk2/g;->J:Lk2/a;

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide p1, p0, Lk2/g;->I:J

    const/4 p1, 0x0

    iput-boolean p1, p0, Lk2/g;->F:Z

    iput-boolean p1, p0, Lk2/g;->G:Z

    return-void
.end method

.method protected P([Ls1/m1;JJ)V
    .locals 0

    iget-object p2, p0, Lk2/g;->A:Lk2/d;

    const/4 p3, 0x0

    aget-object p1, p1, p3

    invoke-interface {p2, p1}, Lk2/d;->b(Ls1/m1;)Lk2/c;

    move-result-object p1

    iput-object p1, p0, Lk2/g;->E:Lk2/c;

    return-void
.end method

.method public a(Ls1/m1;)I
    .locals 1

    iget-object v0, p0, Lk2/g;->A:Lk2/d;

    invoke-interface {v0, p1}, Lk2/d;->a(Ls1/m1;)Z

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
    const/4 p1, 0x0

    invoke-static {p1}, Ls1/z2;->a(I)I

    move-result p1

    return p1
.end method

.method public b()Z
    .locals 1

    iget-boolean v0, p0, Lk2/g;->G:Z

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

    check-cast p1, Lk2/a;

    invoke-direct {p0, p1}, Lk2/g;->V(Lk2/a;)V

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
    .locals 0

    const/4 p3, 0x1

    :goto_0
    if-eqz p3, :cond_0

    invoke-direct {p0}, Lk2/g;->X()V

    invoke-direct {p0, p1, p2}, Lk2/g;->W(J)Z

    move-result p3

    goto :goto_0

    :cond_0
    return-void
.end method
