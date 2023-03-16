.class Ly0/q1$g;
.super Ly0/a0$b;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ly0/q1;->U(Ly0/k3;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic q:Ly0/k3;

.field final synthetic r:Ly0/q1;


# direct methods
.method constructor <init>(Ly0/q1;Ly0/k3;)V
    .locals 0

    iput-object p1, p0, Ly0/q1$g;->r:Ly0/q1;

    iput-object p2, p0, Ly0/q1$g;->q:Ly0/k3;

    invoke-direct {p0}, Ly0/a0$b;-><init>()V

    return-void
.end method

.method private h(Ly0/n2;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ly0/n2<",
            "*>;)V"
        }
    .end annotation

    invoke-virtual {p1}, Ly0/n2;->b()Ljava/lang/Throwable;

    move-result-object v0

    instance-of v0, v0, Ly0/f1;

    if-eqz v0, :cond_0

    iget-object p1, p0, Ly0/q1$g;->r:Ly0/q1;

    sget-object v0, Ly0/k3;->d:Ly0/k3;

    invoke-static {p1, v0}, Ly0/q1;->N(Ly0/q1;Ly0/k3;)Ly0/k3;

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Ly0/n2;->b()Ljava/lang/Throwable;

    move-result-object p1

    instance-of p1, p1, Ly0/k1;

    if-nez p1, :cond_1

    :goto_0
    return-void

    :cond_1
    new-instance p1, Ly0/j2;

    invoke-direct {p1}, Ly0/j2;-><init>()V

    throw p1
.end method


# virtual methods
.method protected d(J)V
    .locals 2

    iget-object v0, p0, Ly0/q1$g;->r:Ly0/q1;

    invoke-static {v0}, Ly0/q1;->d0(Ly0/q1;)Ly0/a0;

    move-result-object v0

    invoke-virtual {v0}, Ly0/a0;->a()V

    iget-object v0, p0, Ly0/q1$g;->r:Ly0/q1;

    invoke-static {v0}, Ly0/q1;->d0(Ly0/q1;)Ly0/a0;

    move-result-object v0

    new-instance v1, Ly0/a0$a;

    invoke-direct {v1, p0}, Ly0/a0$a;-><init>(Ly0/a0$c;)V

    invoke-virtual {v0, p1, p2, v1}, Ly0/a0;->b(JLy0/a0$c;)V

    return-void
.end method

.method public e()V
    .locals 5

    iget-object v0, p0, Ly0/q1$g;->r:Ly0/q1;

    invoke-static {v0}, Ly0/q1;->n0(Ly0/q1;)Ly0/k3;

    move-result-object v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ly0/q1$g;->r:Ly0/q1;

    invoke-static {v0}, Ly0/q1;->n0(Ly0/q1;)Ly0/k3;

    move-result-object v0

    invoke-virtual {v0}, Ly0/k3;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    iget-object v3, p0, Ly0/q1$g;->r:Ly0/q1;

    invoke-static {v3}, Ly0/q1;->z(Ly0/q1;)Ly0/e0;

    move-result-object v3

    invoke-interface {v3}, Ly0/e0;->a()Z

    move-result v3

    if-eqz v3, :cond_1

    if-nez v0, :cond_2

    :cond_1
    if-eqz v3, :cond_3

    iget-object v0, p0, Ly0/q1$g;->r:Ly0/q1;

    invoke-static {v0}, Ly0/q1;->J(Ly0/q1;)Z

    move-result v0

    if-eqz v0, :cond_3

    :cond_2
    iget-object v0, p0, Ly0/q1$g;->r:Ly0/q1;

    invoke-static {v0}, Ly0/q1;->M(Ly0/q1;)Ljava/util/concurrent/Future;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ly0/n2;

    invoke-direct {p0, v0}, Ly0/q1$g;->h(Ly0/n2;)V

    iget-object v0, p0, Ly0/q1$g;->r:Ly0/q1;

    invoke-static {v0}, Ly0/q1;->n0(Ly0/q1;)Ly0/k3;

    move-result-object v4

    invoke-static {v0, v4}, Ly0/q1;->w(Ly0/q1;Ly0/k3;)Ljava/util/concurrent/Future;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ly0/n2;

    invoke-direct {p0, v0}, Ly0/q1$g;->h(Ly0/n2;)V

    :cond_3
    iget-object v0, p0, Ly0/q1$g;->q:Ly0/k3;

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Ly0/k3;->c()Z

    move-result v0

    if-eqz v0, :cond_4

    goto :goto_1

    :cond_4
    move v1, v2

    :goto_1
    if-eqz v3, :cond_8

    iget-object v0, p0, Ly0/q1$g;->r:Ly0/q1;

    invoke-static {v0}, Ly0/q1;->n0(Ly0/q1;)Ly0/k3;

    move-result-object v0

    if-nez v0, :cond_5

    if-eqz v1, :cond_8

    :cond_5
    iget-object v0, p0, Ly0/q1$g;->r:Ly0/q1;

    invoke-static {v0}, Ly0/q1;->R(Ly0/q1;)Ljava/util/concurrent/Future;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ly0/n2;

    invoke-direct {p0, v0}, Ly0/q1$g;->h(Ly0/n2;)V

    iget-object v0, p0, Ly0/q1$g;->r:Ly0/q1;

    invoke-static {v0}, Ly0/q1;->n0(Ly0/q1;)Ly0/k3;

    move-result-object v0

    if-eqz v0, :cond_6

    iget-object v0, p0, Ly0/q1$g;->r:Ly0/q1;

    invoke-static {v0}, Ly0/q1;->n0(Ly0/q1;)Ly0/k3;

    move-result-object v0

    goto :goto_2

    :cond_6
    iget-object v0, p0, Ly0/q1$g;->q:Ly0/k3;

    :goto_2
    if-eqz v0, :cond_7

    iget-object v1, p0, Ly0/q1$g;->r:Ly0/q1;

    invoke-static {v1, v0}, Ly0/q1;->G(Ly0/q1;Ly0/k3;)Ljava/util/concurrent/Future;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ly0/n2;

    invoke-direct {p0, v0}, Ly0/q1$g;->h(Ly0/n2;)V

    :cond_7
    iget-object v0, p0, Ly0/q1$g;->r:Ly0/q1;

    invoke-static {v0}, Ly0/q1;->W(Ly0/q1;)Ljava/util/concurrent/Future;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ly0/n2;

    invoke-direct {p0, v0}, Ly0/q1$g;->h(Ly0/n2;)V

    :cond_8
    return-void
.end method
