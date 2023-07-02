.class public Lb2/w$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb2/w;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lb2/w$a$a;
    }
.end annotation


# instance fields
.field public final a:I

.field public final b:Lz2/u$b;

.field private final c:Ljava/util/concurrent/CopyOnWriteArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/CopyOnWriteArrayList<",
            "Lb2/w$a$a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 3

    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {p0, v0, v1, v2}, Lb2/w$a;-><init>(Ljava/util/concurrent/CopyOnWriteArrayList;ILz2/u$b;)V

    return-void
.end method

.method private constructor <init>(Ljava/util/concurrent/CopyOnWriteArrayList;ILz2/u$b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/CopyOnWriteArrayList<",
            "Lb2/w$a$a;",
            ">;I",
            "Lz2/u$b;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb2/w$a;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    iput p2, p0, Lb2/w$a;->a:I

    iput-object p3, p0, Lb2/w$a;->b:Lz2/u$b;

    return-void
.end method

.method public static synthetic a(Lb2/w$a;Lb2/w;)V
    .locals 0

    invoke-direct {p0, p1}, Lb2/w$a;->s(Lb2/w;)V

    return-void
.end method

.method public static synthetic b(Lb2/w$a;Lb2/w;)V
    .locals 0

    invoke-direct {p0, p1}, Lb2/w$a;->o(Lb2/w;)V

    return-void
.end method

.method public static synthetic c(Lb2/w$a;Lb2/w;)V
    .locals 0

    invoke-direct {p0, p1}, Lb2/w$a;->n(Lb2/w;)V

    return-void
.end method

.method public static synthetic d(Lb2/w$a;Lb2/w;)V
    .locals 0

    invoke-direct {p0, p1}, Lb2/w$a;->p(Lb2/w;)V

    return-void
.end method

.method public static synthetic e(Lb2/w$a;Lb2/w;Ljava/lang/Exception;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lb2/w$a;->r(Lb2/w;Ljava/lang/Exception;)V

    return-void
.end method

.method public static synthetic f(Lb2/w$a;Lb2/w;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lb2/w$a;->q(Lb2/w;I)V

    return-void
.end method

.method private synthetic n(Lb2/w;)V
    .locals 2

    iget v0, p0, Lb2/w$a;->a:I

    iget-object v1, p0, Lb2/w$a;->b:Lz2/u$b;

    invoke-interface {p1, v0, v1}, Lb2/w;->C(ILz2/u$b;)V

    return-void
.end method

.method private synthetic o(Lb2/w;)V
    .locals 2

    iget v0, p0, Lb2/w$a;->a:I

    iget-object v1, p0, Lb2/w$a;->b:Lz2/u$b;

    invoke-interface {p1, v0, v1}, Lb2/w;->n0(ILz2/u$b;)V

    return-void
.end method

.method private synthetic p(Lb2/w;)V
    .locals 2

    iget v0, p0, Lb2/w$a;->a:I

    iget-object v1, p0, Lb2/w$a;->b:Lz2/u$b;

    invoke-interface {p1, v0, v1}, Lb2/w;->U(ILz2/u$b;)V

    return-void
.end method

.method private synthetic q(Lb2/w;I)V
    .locals 2

    iget v0, p0, Lb2/w$a;->a:I

    iget-object v1, p0, Lb2/w$a;->b:Lz2/u$b;

    invoke-interface {p1, v0, v1}, Lb2/w;->j0(ILz2/u$b;)V

    iget v0, p0, Lb2/w$a;->a:I

    iget-object v1, p0, Lb2/w$a;->b:Lz2/u$b;

    invoke-interface {p1, v0, v1, p2}, Lb2/w;->E(ILz2/u$b;I)V

    return-void
.end method

.method private synthetic r(Lb2/w;Ljava/lang/Exception;)V
    .locals 2

    iget v0, p0, Lb2/w$a;->a:I

    iget-object v1, p0, Lb2/w$a;->b:Lz2/u$b;

    invoke-interface {p1, v0, v1, p2}, Lb2/w;->l0(ILz2/u$b;Ljava/lang/Exception;)V

    return-void
.end method

.method private synthetic s(Lb2/w;)V
    .locals 2

    iget v0, p0, Lb2/w$a;->a:I

    iget-object v1, p0, Lb2/w$a;->b:Lz2/u$b;

    invoke-interface {p1, v0, v1}, Lb2/w;->e0(ILz2/u$b;)V

    return-void
.end method


# virtual methods
.method public g(Landroid/os/Handler;Lb2/w;)V
    .locals 2

    invoke-static {p1}, Lu3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, Lu3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lb2/w$a;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    new-instance v1, Lb2/w$a$a;

    invoke-direct {v1, p1, p2}, Lb2/w$a$a;-><init>(Landroid/os/Handler;Lb2/w;)V

    invoke-virtual {v0, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public h()V
    .locals 4

    iget-object v0, p0, Lb2/w$a;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lb2/w$a$a;

    iget-object v2, v1, Lb2/w$a$a;->b:Lb2/w;

    iget-object v1, v1, Lb2/w$a$a;->a:Landroid/os/Handler;

    new-instance v3, Lb2/s;

    invoke-direct {v3, p0, v2}, Lb2/s;-><init>(Lb2/w$a;Lb2/w;)V

    invoke-static {v1, v3}, Lu3/n0;->K0(Landroid/os/Handler;Ljava/lang/Runnable;)Z

    goto :goto_0

    :cond_0
    return-void
.end method

.method public i()V
    .locals 4

    iget-object v0, p0, Lb2/w$a;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lb2/w$a$a;

    iget-object v2, v1, Lb2/w$a$a;->b:Lb2/w;

    iget-object v1, v1, Lb2/w$a$a;->a:Landroid/os/Handler;

    new-instance v3, Lb2/r;

    invoke-direct {v3, p0, v2}, Lb2/r;-><init>(Lb2/w$a;Lb2/w;)V

    invoke-static {v1, v3}, Lu3/n0;->K0(Landroid/os/Handler;Ljava/lang/Runnable;)Z

    goto :goto_0

    :cond_0
    return-void
.end method

.method public j()V
    .locals 4

    iget-object v0, p0, Lb2/w$a;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lb2/w$a$a;

    iget-object v2, v1, Lb2/w$a$a;->b:Lb2/w;

    iget-object v1, v1, Lb2/w$a$a;->a:Landroid/os/Handler;

    new-instance v3, Lb2/t;

    invoke-direct {v3, p0, v2}, Lb2/t;-><init>(Lb2/w$a;Lb2/w;)V

    invoke-static {v1, v3}, Lu3/n0;->K0(Landroid/os/Handler;Ljava/lang/Runnable;)Z

    goto :goto_0

    :cond_0
    return-void
.end method

.method public k(I)V
    .locals 4

    iget-object v0, p0, Lb2/w$a;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lb2/w$a$a;

    iget-object v2, v1, Lb2/w$a$a;->b:Lb2/w;

    iget-object v1, v1, Lb2/w$a$a;->a:Landroid/os/Handler;

    new-instance v3, Lb2/u;

    invoke-direct {v3, p0, v2, p1}, Lb2/u;-><init>(Lb2/w$a;Lb2/w;I)V

    invoke-static {v1, v3}, Lu3/n0;->K0(Landroid/os/Handler;Ljava/lang/Runnable;)Z

    goto :goto_0

    :cond_0
    return-void
.end method

.method public l(Ljava/lang/Exception;)V
    .locals 4

    iget-object v0, p0, Lb2/w$a;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lb2/w$a$a;

    iget-object v2, v1, Lb2/w$a$a;->b:Lb2/w;

    iget-object v1, v1, Lb2/w$a$a;->a:Landroid/os/Handler;

    new-instance v3, Lb2/v;

    invoke-direct {v3, p0, v2, p1}, Lb2/v;-><init>(Lb2/w$a;Lb2/w;Ljava/lang/Exception;)V

    invoke-static {v1, v3}, Lu3/n0;->K0(Landroid/os/Handler;Ljava/lang/Runnable;)Z

    goto :goto_0

    :cond_0
    return-void
.end method

.method public m()V
    .locals 4

    iget-object v0, p0, Lb2/w$a;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lb2/w$a$a;

    iget-object v2, v1, Lb2/w$a$a;->b:Lb2/w;

    iget-object v1, v1, Lb2/w$a$a;->a:Landroid/os/Handler;

    new-instance v3, Lb2/q;

    invoke-direct {v3, p0, v2}, Lb2/q;-><init>(Lb2/w$a;Lb2/w;)V

    invoke-static {v1, v3}, Lu3/n0;->K0(Landroid/os/Handler;Ljava/lang/Runnable;)Z

    goto :goto_0

    :cond_0
    return-void
.end method

.method public t(Lb2/w;)V
    .locals 3

    iget-object v0, p0, Lb2/w$a;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lb2/w$a$a;

    iget-object v2, v1, Lb2/w$a$a;->b:Lb2/w;

    if-ne v2, p1, :cond_0

    iget-object v2, p0, Lb2/w$a;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v2, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-void
.end method

.method public u(ILz2/u$b;)Lb2/w$a;
    .locals 2

    new-instance v0, Lb2/w$a;

    iget-object v1, p0, Lb2/w$a;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0, v1, p1, p2}, Lb2/w$a;-><init>(Ljava/util/concurrent/CopyOnWriteArrayList;ILz2/u$b;)V

    return-object v0
.end method
