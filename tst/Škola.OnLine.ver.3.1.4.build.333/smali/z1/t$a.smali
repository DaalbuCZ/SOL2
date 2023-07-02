.class public final Lz1/t$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lz1/t;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private final a:Landroid/os/Handler;

.field private final b:Lz1/t;


# direct methods
.method public constructor <init>(Landroid/os/Handler;Lz1/t;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p2, :cond_0

    invoke-static {p1}, Lu3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/os/Handler;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-object p1, p0, Lz1/t$a;->a:Landroid/os/Handler;

    iput-object p2, p0, Lz1/t$a;->b:Lz1/t;

    return-void
.end method

.method private synthetic A(IJJ)V
    .locals 7

    iget-object v0, p0, Lz1/t$a;->b:Lz1/t;

    invoke-static {v0}, Lu3/n0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lz1/t;

    move v2, p1

    move-wide v3, p2

    move-wide v5, p4

    invoke-interface/range {v1 .. v6}, Lz1/t;->w(IJJ)V

    return-void
.end method

.method public static synthetic a(Lz1/t$a;Z)V
    .locals 0

    invoke-direct {p0, p1}, Lz1/t$a;->z(Z)V

    return-void
.end method

.method public static synthetic b(Lz1/t$a;La2/e;)V
    .locals 0

    invoke-direct {p0, p1}, Lz1/t$a;->v(La2/e;)V

    return-void
.end method

.method public static synthetic c(Lz1/t$a;Ljava/lang/Exception;)V
    .locals 0

    invoke-direct {p0, p1}, Lz1/t$a;->r(Ljava/lang/Exception;)V

    return-void
.end method

.method public static synthetic d(Lz1/t$a;Ljava/lang/Exception;)V
    .locals 0

    invoke-direct {p0, p1}, Lz1/t$a;->s(Ljava/lang/Exception;)V

    return-void
.end method

.method public static synthetic e(Lz1/t$a;Lx1/n1;La2/i;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lz1/t$a;->x(Lx1/n1;La2/i;)V

    return-void
.end method

.method public static synthetic f(Lz1/t$a;Ljava/lang/String;JJ)V
    .locals 0

    invoke-direct/range {p0 .. p5}, Lz1/t$a;->t(Ljava/lang/String;JJ)V

    return-void
.end method

.method public static synthetic g(Lz1/t$a;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lz1/t$a;->u(Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic h(Lz1/t$a;J)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lz1/t$a;->y(J)V

    return-void
.end method

.method public static synthetic i(Lz1/t$a;IJJ)V
    .locals 0

    invoke-direct/range {p0 .. p5}, Lz1/t$a;->A(IJJ)V

    return-void
.end method

.method public static synthetic j(Lz1/t$a;La2/e;)V
    .locals 0

    invoke-direct {p0, p1}, Lz1/t$a;->w(La2/e;)V

    return-void
.end method

.method private synthetic r(Ljava/lang/Exception;)V
    .locals 1

    iget-object v0, p0, Lz1/t$a;->b:Lz1/t;

    invoke-static {v0}, Lu3/n0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lz1/t;

    invoke-interface {v0, p1}, Lz1/t;->o(Ljava/lang/Exception;)V

    return-void
.end method

.method private synthetic s(Ljava/lang/Exception;)V
    .locals 1

    iget-object v0, p0, Lz1/t$a;->b:Lz1/t;

    invoke-static {v0}, Lu3/n0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lz1/t;

    invoke-interface {v0, p1}, Lz1/t;->c(Ljava/lang/Exception;)V

    return-void
.end method

.method private synthetic t(Ljava/lang/String;JJ)V
    .locals 7

    iget-object v0, p0, Lz1/t$a;->b:Lz1/t;

    invoke-static {v0}, Lu3/n0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lz1/t;

    move-object v2, p1

    move-wide v3, p2

    move-wide v5, p4

    invoke-interface/range {v1 .. v6}, Lz1/t;->t(Ljava/lang/String;JJ)V

    return-void
.end method

.method private synthetic u(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lz1/t$a;->b:Lz1/t;

    invoke-static {v0}, Lu3/n0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lz1/t;

    invoke-interface {v0, p1}, Lz1/t;->s(Ljava/lang/String;)V

    return-void
.end method

.method private synthetic v(La2/e;)V
    .locals 1

    invoke-virtual {p1}, La2/e;->c()V

    iget-object v0, p0, Lz1/t$a;->b:Lz1/t;

    invoke-static {v0}, Lu3/n0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lz1/t;

    invoke-interface {v0, p1}, Lz1/t;->u(La2/e;)V

    return-void
.end method

.method private synthetic w(La2/e;)V
    .locals 1

    iget-object v0, p0, Lz1/t$a;->b:Lz1/t;

    invoke-static {v0}, Lu3/n0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lz1/t;

    invoke-interface {v0, p1}, Lz1/t;->v(La2/e;)V

    return-void
.end method

.method private synthetic x(Lx1/n1;La2/i;)V
    .locals 1

    iget-object v0, p0, Lz1/t$a;->b:Lz1/t;

    invoke-static {v0}, Lu3/n0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lz1/t;

    invoke-interface {v0, p1}, Lz1/t;->E(Lx1/n1;)V

    iget-object v0, p0, Lz1/t$a;->b:Lz1/t;

    invoke-static {v0}, Lu3/n0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lz1/t;

    invoke-interface {v0, p1, p2}, Lz1/t;->y(Lx1/n1;La2/i;)V

    return-void
.end method

.method private synthetic y(J)V
    .locals 1

    iget-object v0, p0, Lz1/t$a;->b:Lz1/t;

    invoke-static {v0}, Lu3/n0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lz1/t;

    invoke-interface {v0, p1, p2}, Lz1/t;->l(J)V

    return-void
.end method

.method private synthetic z(Z)V
    .locals 1

    iget-object v0, p0, Lz1/t$a;->b:Lz1/t;

    invoke-static {v0}, Lu3/n0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lz1/t;

    invoke-interface {v0, p1}, Lz1/t;->b(Z)V

    return-void
.end method


# virtual methods
.method public B(J)V
    .locals 2

    iget-object v0, p0, Lz1/t$a;->a:Landroid/os/Handler;

    if-eqz v0, :cond_0

    new-instance v1, Lz1/k;

    invoke-direct {v1, p0, p1, p2}, Lz1/k;-><init>(Lz1/t$a;J)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public C(Z)V
    .locals 2

    iget-object v0, p0, Lz1/t$a;->a:Landroid/os/Handler;

    if-eqz v0, :cond_0

    new-instance v1, Lz1/s;

    invoke-direct {v1, p0, p1}, Lz1/s;-><init>(Lz1/t$a;Z)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public D(IJJ)V
    .locals 9

    iget-object v0, p0, Lz1/t$a;->a:Landroid/os/Handler;

    if-eqz v0, :cond_0

    new-instance v8, Lz1/j;

    move-object v1, v8

    move-object v2, p0

    move v3, p1

    move-wide v4, p2

    move-wide v6, p4

    invoke-direct/range {v1 .. v7}, Lz1/j;-><init>(Lz1/t$a;IJJ)V

    invoke-virtual {v0, v8}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public k(Ljava/lang/Exception;)V
    .locals 2

    iget-object v0, p0, Lz1/t$a;->a:Landroid/os/Handler;

    if-eqz v0, :cond_0

    new-instance v1, Lz1/n;

    invoke-direct {v1, p0, p1}, Lz1/n;-><init>(Lz1/t$a;Ljava/lang/Exception;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public l(Ljava/lang/Exception;)V
    .locals 2

    iget-object v0, p0, Lz1/t$a;->a:Landroid/os/Handler;

    if-eqz v0, :cond_0

    new-instance v1, Lz1/o;

    invoke-direct {v1, p0, p1}, Lz1/o;-><init>(Lz1/t$a;Ljava/lang/Exception;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public m(Ljava/lang/String;JJ)V
    .locals 9

    iget-object v0, p0, Lz1/t$a;->a:Landroid/os/Handler;

    if-eqz v0, :cond_0

    new-instance v8, Lz1/q;

    move-object v1, v8

    move-object v2, p0

    move-object v3, p1

    move-wide v4, p2

    move-wide v6, p4

    invoke-direct/range {v1 .. v7}, Lz1/q;-><init>(Lz1/t$a;Ljava/lang/String;JJ)V

    invoke-virtual {v0, v8}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public n(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lz1/t$a;->a:Landroid/os/Handler;

    if-eqz v0, :cond_0

    new-instance v1, Lz1/p;

    invoke-direct {v1, p0, p1}, Lz1/p;-><init>(Lz1/t$a;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public o(La2/e;)V
    .locals 2

    invoke-virtual {p1}, La2/e;->c()V

    iget-object v0, p0, Lz1/t$a;->a:Landroid/os/Handler;

    if-eqz v0, :cond_0

    new-instance v1, Lz1/l;

    invoke-direct {v1, p0, p1}, Lz1/l;-><init>(Lz1/t$a;La2/e;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public p(La2/e;)V
    .locals 2

    iget-object v0, p0, Lz1/t$a;->a:Landroid/os/Handler;

    if-eqz v0, :cond_0

    new-instance v1, Lz1/m;

    invoke-direct {v1, p0, p1}, Lz1/m;-><init>(Lz1/t$a;La2/e;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public q(Lx1/n1;La2/i;)V
    .locals 2

    iget-object v0, p0, Lz1/t$a;->a:Landroid/os/Handler;

    if-eqz v0, :cond_0

    new-instance v1, Lz1/r;

    invoke-direct {v1, p0, p1, p2}, Lz1/r;-><init>(Lz1/t$a;Lx1/n1;La2/i;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method
