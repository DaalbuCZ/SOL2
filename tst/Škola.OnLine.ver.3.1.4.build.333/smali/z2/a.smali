.class public abstract Lz2/a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lz2/u;


# instance fields
.field private final n:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lz2/u$c;",
            ">;"
        }
    .end annotation
.end field

.field private final o:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet<",
            "Lz2/u$c;",
            ">;"
        }
    .end annotation
.end field

.field private final p:Lz2/b0$a;

.field private final q:Lb2/w$a;

.field private r:Landroid/os/Looper;

.field private s:Lx1/y3;

.field private t:Ly1/t1;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Lz2/a;->n:Ljava/util/ArrayList;

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(I)V

    iput-object v0, p0, Lz2/a;->o:Ljava/util/HashSet;

    new-instance v0, Lz2/b0$a;

    invoke-direct {v0}, Lz2/b0$a;-><init>()V

    iput-object v0, p0, Lz2/a;->p:Lz2/b0$a;

    new-instance v0, Lb2/w$a;

    invoke-direct {v0}, Lb2/w$a;-><init>()V

    iput-object v0, p0, Lz2/a;->q:Lb2/w$a;

    return-void
.end method


# virtual methods
.method protected final A()Ly1/t1;
    .locals 1

    iget-object v0, p0, Lz2/a;->t:Ly1/t1;

    invoke-static {v0}, Lu3/a;->h(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ly1/t1;

    return-object v0
.end method

.method protected final B()Z
    .locals 1

    iget-object v0, p0, Lz2/a;->o:Ljava/util/HashSet;

    invoke-virtual {v0}, Ljava/util/HashSet;->isEmpty()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method protected abstract C(Lt3/p0;)V
.end method

.method protected final D(Lx1/y3;)V
    .locals 2

    iput-object p1, p0, Lz2/a;->s:Lx1/y3;

    iget-object v0, p0, Lz2/a;->n:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lz2/u$c;

    invoke-interface {v1, p0, p1}, Lz2/u$c;->a(Lz2/u;Lx1/y3;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method protected abstract E()V
.end method

.method public synthetic d()Z
    .locals 1

    invoke-static {p0}, Lz2/t;->b(Lz2/u;)Z

    move-result v0

    return v0
.end method

.method public synthetic e()Lx1/y3;
    .locals 1

    invoke-static {p0}, Lz2/t;->a(Lz2/u;)Lx1/y3;

    move-result-object v0

    return-object v0
.end method

.method public final f(Lb2/w;)V
    .locals 1

    iget-object v0, p0, Lz2/a;->q:Lb2/w$a;

    invoke-virtual {v0, p1}, Lb2/w$a;->t(Lb2/w;)V

    return-void
.end method

.method public final g(Lz2/u$c;Lt3/p0;Ly1/t1;)V
    .locals 2

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    iget-object v1, p0, Lz2/a;->r:Landroid/os/Looper;

    if-eqz v1, :cond_1

    if-ne v1, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v1, 0x1

    :goto_1
    invoke-static {v1}, Lu3/a;->a(Z)V

    iput-object p3, p0, Lz2/a;->t:Ly1/t1;

    iget-object p3, p0, Lz2/a;->s:Lx1/y3;

    iget-object v1, p0, Lz2/a;->n:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v1, p0, Lz2/a;->r:Landroid/os/Looper;

    if-nez v1, :cond_2

    iput-object v0, p0, Lz2/a;->r:Landroid/os/Looper;

    iget-object p3, p0, Lz2/a;->o:Ljava/util/HashSet;

    invoke-virtual {p3, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    invoke-virtual {p0, p2}, Lz2/a;->C(Lt3/p0;)V

    goto :goto_2

    :cond_2
    if-eqz p3, :cond_3

    invoke-virtual {p0, p1}, Lz2/a;->i(Lz2/u$c;)V

    invoke-interface {p1, p0, p3}, Lz2/u$c;->a(Lz2/u;Lx1/y3;)V

    :cond_3
    :goto_2
    return-void
.end method

.method public final h(Lz2/u$c;)V
    .locals 2

    iget-object v0, p0, Lz2/a;->o:Ljava/util/HashSet;

    invoke-virtual {v0}, Ljava/util/HashSet;->isEmpty()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    iget-object v1, p0, Lz2/a;->o:Ljava/util/HashSet;

    invoke-virtual {v1, p1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    if-eqz v0, :cond_0

    iget-object p1, p0, Lz2/a;->o:Ljava/util/HashSet;

    invoke-virtual {p1}, Ljava/util/HashSet;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lz2/a;->y()V

    :cond_0
    return-void
.end method

.method public final i(Lz2/u$c;)V
    .locals 2

    iget-object v0, p0, Lz2/a;->r:Landroid/os/Looper;

    invoke-static {v0}, Lu3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lz2/a;->o:Ljava/util/HashSet;

    invoke-virtual {v0}, Ljava/util/HashSet;->isEmpty()Z

    move-result v0

    iget-object v1, p0, Lz2/a;->o:Ljava/util/HashSet;

    invoke-virtual {v1, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lz2/a;->z()V

    :cond_0
    return-void
.end method

.method public final k(Landroid/os/Handler;Lz2/b0;)V
    .locals 1

    invoke-static {p1}, Lu3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, Lu3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lz2/a;->p:Lz2/b0$a;

    invoke-virtual {v0, p1, p2}, Lz2/b0$a;->g(Landroid/os/Handler;Lz2/b0;)V

    return-void
.end method

.method public final l(Lz2/b0;)V
    .locals 1

    iget-object v0, p0, Lz2/a;->p:Lz2/b0$a;

    invoke-virtual {v0, p1}, Lz2/b0$a;->C(Lz2/b0;)V

    return-void
.end method

.method public final p(Landroid/os/Handler;Lb2/w;)V
    .locals 1

    invoke-static {p1}, Lu3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, Lu3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lz2/a;->q:Lb2/w$a;

    invoke-virtual {v0, p1, p2}, Lb2/w$a;->g(Landroid/os/Handler;Lb2/w;)V

    return-void
.end method

.method public final q(Lz2/u$c;)V
    .locals 1

    iget-object v0, p0, Lz2/a;->n:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    iget-object v0, p0, Lz2/a;->n:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    iput-object p1, p0, Lz2/a;->r:Landroid/os/Looper;

    iput-object p1, p0, Lz2/a;->s:Lx1/y3;

    iput-object p1, p0, Lz2/a;->t:Ly1/t1;

    iget-object p1, p0, Lz2/a;->o:Ljava/util/HashSet;

    invoke-virtual {p1}, Ljava/util/HashSet;->clear()V

    invoke-virtual {p0}, Lz2/a;->E()V

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1}, Lz2/a;->h(Lz2/u$c;)V

    :goto_0
    return-void
.end method

.method protected final r(ILz2/u$b;)Lb2/w$a;
    .locals 1

    iget-object v0, p0, Lz2/a;->q:Lb2/w$a;

    invoke-virtual {v0, p1, p2}, Lb2/w$a;->u(ILz2/u$b;)Lb2/w$a;

    move-result-object p1

    return-object p1
.end method

.method protected final t(Lz2/u$b;)Lb2/w$a;
    .locals 2

    iget-object v0, p0, Lz2/a;->q:Lb2/w$a;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1}, Lb2/w$a;->u(ILz2/u$b;)Lb2/w$a;

    move-result-object p1

    return-object p1
.end method

.method protected final v(ILz2/u$b;J)Lz2/b0$a;
    .locals 1

    iget-object v0, p0, Lz2/a;->p:Lz2/b0$a;

    invoke-virtual {v0, p1, p2, p3, p4}, Lz2/b0$a;->F(ILz2/u$b;J)Lz2/b0$a;

    move-result-object p1

    return-object p1
.end method

.method protected final w(Lz2/u$b;)Lz2/b0$a;
    .locals 4

    iget-object v0, p0, Lz2/a;->p:Lz2/b0$a;

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    invoke-virtual {v0, v1, p1, v2, v3}, Lz2/b0$a;->F(ILz2/u$b;J)Lz2/b0$a;

    move-result-object p1

    return-object p1
.end method

.method protected final x(Lz2/u$b;J)Lz2/b0$a;
    .locals 2

    invoke-static {p1}, Lu3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lz2/a;->p:Lz2/b0$a;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1, p2, p3}, Lz2/b0$a;->F(ILz2/u$b;J)Lz2/b0$a;

    move-result-object p1

    return-object p1
.end method

.method protected y()V
    .locals 0

    return-void
.end method

.method protected z()V
    .locals 0

    return-void
.end method
