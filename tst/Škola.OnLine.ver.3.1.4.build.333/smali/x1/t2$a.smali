.class final Lx1/t2$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lz2/b0;
.implements Lb2/w;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx1/t2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "a"
.end annotation


# instance fields
.field private final a:Lx1/t2$c;

.field final synthetic b:Lx1/t2;


# direct methods
.method public constructor <init>(Lx1/t2;Lx1/t2$c;)V
    .locals 0

    iput-object p1, p0, Lx1/t2$a;->b:Lx1/t2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lx1/t2$a;->a:Lx1/t2$c;

    return-void
.end method

.method public static synthetic A(Lx1/t2$a;Landroid/util/Pair;Lz2/n;Lz2/q;Ljava/io/IOException;Z)V
    .locals 0

    invoke-direct/range {p0 .. p5}, Lx1/t2$a;->V(Landroid/util/Pair;Lz2/n;Lz2/q;Ljava/io/IOException;Z)V

    return-void
.end method

.method public static synthetic B(Lx1/t2$a;Landroid/util/Pair;)V
    .locals 0

    invoke-direct {p0, p1}, Lx1/t2$a;->M(Landroid/util/Pair;)V

    return-void
.end method

.method public static synthetic D(Lx1/t2$a;Landroid/util/Pair;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lx1/t2$a;->N(Landroid/util/Pair;I)V

    return-void
.end method

.method public static synthetic F(Lx1/t2$a;Landroid/util/Pair;Lz2/n;Lz2/q;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lx1/t2$a;->S(Landroid/util/Pair;Lz2/n;Lz2/q;)V

    return-void
.end method

.method public static synthetic G(Lx1/t2$a;Landroid/util/Pair;Ljava/lang/Exception;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lx1/t2$a;->O(Landroid/util/Pair;Ljava/lang/Exception;)V

    return-void
.end method

.method private H(ILz2/u$b;)Landroid/util/Pair;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lz2/u$b;",
            ")",
            "Landroid/util/Pair<",
            "Ljava/lang/Integer;",
            "Lz2/u$b;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    if-eqz p2, :cond_1

    iget-object v1, p0, Lx1/t2$a;->a:Lx1/t2$c;

    invoke-static {v1, p2}, Lx1/t2;->c(Lx1/t2$c;Lz2/u$b;)Lz2/u$b;

    move-result-object p2

    if-nez p2, :cond_0

    return-object v0

    :cond_0
    move-object v0, p2

    :cond_1
    iget-object p2, p0, Lx1/t2$a;->a:Lx1/t2$c;

    invoke-static {p2, p1}, Lx1/t2;->d(Lx1/t2$c;I)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {p1, v0}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object p1

    return-object p1
.end method

.method private synthetic J(Landroid/util/Pair;Lz2/q;)V
    .locals 2

    iget-object v0, p0, Lx1/t2$a;->b:Lx1/t2;

    invoke-static {v0}, Lx1/t2;->e(Lx1/t2;)Ly1/a;

    move-result-object v0

    iget-object v1, p1, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    iget-object p1, p1, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast p1, Lz2/u$b;

    invoke-interface {v0, v1, p1, p2}, Lz2/b0;->a0(ILz2/u$b;Lz2/q;)V

    return-void
.end method

.method private synthetic K(Landroid/util/Pair;)V
    .locals 2

    iget-object v0, p0, Lx1/t2$a;->b:Lx1/t2;

    invoke-static {v0}, Lx1/t2;->e(Lx1/t2;)Ly1/a;

    move-result-object v0

    iget-object v1, p1, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    iget-object p1, p1, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast p1, Lz2/u$b;

    invoke-interface {v0, v1, p1}, Lb2/w;->C(ILz2/u$b;)V

    return-void
.end method

.method private synthetic L(Landroid/util/Pair;)V
    .locals 2

    iget-object v0, p0, Lx1/t2$a;->b:Lx1/t2;

    invoke-static {v0}, Lx1/t2;->e(Lx1/t2;)Ly1/a;

    move-result-object v0

    iget-object v1, p1, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    iget-object p1, p1, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast p1, Lz2/u$b;

    invoke-interface {v0, v1, p1}, Lb2/w;->n0(ILz2/u$b;)V

    return-void
.end method

.method private synthetic M(Landroid/util/Pair;)V
    .locals 2

    iget-object v0, p0, Lx1/t2$a;->b:Lx1/t2;

    invoke-static {v0}, Lx1/t2;->e(Lx1/t2;)Ly1/a;

    move-result-object v0

    iget-object v1, p1, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    iget-object p1, p1, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast p1, Lz2/u$b;

    invoke-interface {v0, v1, p1}, Lb2/w;->U(ILz2/u$b;)V

    return-void
.end method

.method private synthetic N(Landroid/util/Pair;I)V
    .locals 2

    iget-object v0, p0, Lx1/t2$a;->b:Lx1/t2;

    invoke-static {v0}, Lx1/t2;->e(Lx1/t2;)Ly1/a;

    move-result-object v0

    iget-object v1, p1, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    iget-object p1, p1, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast p1, Lz2/u$b;

    invoke-interface {v0, v1, p1, p2}, Lb2/w;->E(ILz2/u$b;I)V

    return-void
.end method

.method private synthetic O(Landroid/util/Pair;Ljava/lang/Exception;)V
    .locals 2

    iget-object v0, p0, Lx1/t2$a;->b:Lx1/t2;

    invoke-static {v0}, Lx1/t2;->e(Lx1/t2;)Ly1/a;

    move-result-object v0

    iget-object v1, p1, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    iget-object p1, p1, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast p1, Lz2/u$b;

    invoke-interface {v0, v1, p1, p2}, Lb2/w;->l0(ILz2/u$b;Ljava/lang/Exception;)V

    return-void
.end method

.method private synthetic P(Landroid/util/Pair;)V
    .locals 2

    iget-object v0, p0, Lx1/t2$a;->b:Lx1/t2;

    invoke-static {v0}, Lx1/t2;->e(Lx1/t2;)Ly1/a;

    move-result-object v0

    iget-object v1, p1, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    iget-object p1, p1, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast p1, Lz2/u$b;

    invoke-interface {v0, v1, p1}, Lb2/w;->e0(ILz2/u$b;)V

    return-void
.end method

.method private synthetic S(Landroid/util/Pair;Lz2/n;Lz2/q;)V
    .locals 2

    iget-object v0, p0, Lx1/t2$a;->b:Lx1/t2;

    invoke-static {v0}, Lx1/t2;->e(Lx1/t2;)Ly1/a;

    move-result-object v0

    iget-object v1, p1, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    iget-object p1, p1, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast p1, Lz2/u$b;

    invoke-interface {v0, v1, p1, p2, p3}, Lz2/b0;->W(ILz2/u$b;Lz2/n;Lz2/q;)V

    return-void
.end method

.method private synthetic T(Landroid/util/Pair;Lz2/n;Lz2/q;)V
    .locals 2

    iget-object v0, p0, Lx1/t2$a;->b:Lx1/t2;

    invoke-static {v0}, Lx1/t2;->e(Lx1/t2;)Ly1/a;

    move-result-object v0

    iget-object v1, p1, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    iget-object p1, p1, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast p1, Lz2/u$b;

    invoke-interface {v0, v1, p1, p2, p3}, Lz2/b0;->m0(ILz2/u$b;Lz2/n;Lz2/q;)V

    return-void
.end method

.method private synthetic V(Landroid/util/Pair;Lz2/n;Lz2/q;Ljava/io/IOException;Z)V
    .locals 8

    iget-object v0, p0, Lx1/t2$a;->b:Lx1/t2;

    invoke-static {v0}, Lx1/t2;->e(Lx1/t2;)Ly1/a;

    move-result-object v1

    iget-object v0, p1, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v2

    iget-object p1, p1, Landroid/util/Pair;->second:Ljava/lang/Object;

    move-object v3, p1

    check-cast v3, Lz2/u$b;

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    move v7, p5

    invoke-interface/range {v1 .. v7}, Lz2/b0;->Q(ILz2/u$b;Lz2/n;Lz2/q;Ljava/io/IOException;Z)V

    return-void
.end method

.method private synthetic X(Landroid/util/Pair;Lz2/n;Lz2/q;)V
    .locals 2

    iget-object v0, p0, Lx1/t2$a;->b:Lx1/t2;

    invoke-static {v0}, Lx1/t2;->e(Lx1/t2;)Ly1/a;

    move-result-object v0

    iget-object v1, p1, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    iget-object p1, p1, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast p1, Lz2/u$b;

    invoke-interface {v0, v1, p1, p2, p3}, Lz2/b0;->k0(ILz2/u$b;Lz2/n;Lz2/q;)V

    return-void
.end method

.method private synthetic Y(Landroid/util/Pair;Lz2/q;)V
    .locals 2

    iget-object v0, p0, Lx1/t2$a;->b:Lx1/t2;

    invoke-static {v0}, Lx1/t2;->e(Lx1/t2;)Ly1/a;

    move-result-object v0

    iget-object v1, p1, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    iget-object p1, p1, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast p1, Lz2/u$b;

    invoke-static {p1}, Lu3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lz2/u$b;

    invoke-interface {v0, v1, p1, p2}, Lz2/b0;->Z(ILz2/u$b;Lz2/q;)V

    return-void
.end method

.method public static synthetic b(Lx1/t2$a;Landroid/util/Pair;Lz2/q;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lx1/t2$a;->J(Landroid/util/Pair;Lz2/q;)V

    return-void
.end method

.method public static synthetic d(Lx1/t2$a;Landroid/util/Pair;Lz2/n;Lz2/q;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lx1/t2$a;->X(Landroid/util/Pair;Lz2/n;Lz2/q;)V

    return-void
.end method

.method public static synthetic h(Lx1/t2$a;Landroid/util/Pair;)V
    .locals 0

    invoke-direct {p0, p1}, Lx1/t2$a;->P(Landroid/util/Pair;)V

    return-void
.end method

.method public static synthetic j(Lx1/t2$a;Landroid/util/Pair;Lz2/n;Lz2/q;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lx1/t2$a;->T(Landroid/util/Pair;Lz2/n;Lz2/q;)V

    return-void
.end method

.method public static synthetic k(Lx1/t2$a;Landroid/util/Pair;)V
    .locals 0

    invoke-direct {p0, p1}, Lx1/t2$a;->K(Landroid/util/Pair;)V

    return-void
.end method

.method public static synthetic n(Lx1/t2$a;Landroid/util/Pair;)V
    .locals 0

    invoke-direct {p0, p1}, Lx1/t2$a;->L(Landroid/util/Pair;)V

    return-void
.end method

.method public static synthetic q(Lx1/t2$a;Landroid/util/Pair;Lz2/q;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lx1/t2$a;->Y(Landroid/util/Pair;Lz2/q;)V

    return-void
.end method


# virtual methods
.method public C(ILz2/u$b;)V
    .locals 1

    invoke-direct {p0, p1, p2}, Lx1/t2$a;->H(ILz2/u$b;)Landroid/util/Pair;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p2, p0, Lx1/t2$a;->b:Lx1/t2;

    invoke-static {p2}, Lx1/t2;->b(Lx1/t2;)Lu3/n;

    move-result-object p2

    new-instance v0, Lx1/k2;

    invoke-direct {v0, p0, p1}, Lx1/k2;-><init>(Lx1/t2$a;Landroid/util/Pair;)V

    invoke-interface {p2, v0}, Lu3/n;->k(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public E(ILz2/u$b;I)V
    .locals 1

    invoke-direct {p0, p1, p2}, Lx1/t2$a;->H(ILz2/u$b;)Landroid/util/Pair;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p2, p0, Lx1/t2$a;->b:Lx1/t2;

    invoke-static {p2}, Lx1/t2;->b(Lx1/t2;)Lu3/n;

    move-result-object p2

    new-instance v0, Lx1/n2;

    invoke-direct {v0, p0, p1, p3}, Lx1/n2;-><init>(Lx1/t2$a;Landroid/util/Pair;I)V

    invoke-interface {p2, v0}, Lu3/n;->k(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public Q(ILz2/u$b;Lz2/n;Lz2/q;Ljava/io/IOException;Z)V
    .locals 7

    invoke-direct {p0, p1, p2}, Lx1/t2$a;->H(ILz2/u$b;)Landroid/util/Pair;

    move-result-object v2

    if-eqz v2, :cond_0

    iget-object p1, p0, Lx1/t2$a;->b:Lx1/t2;

    invoke-static {p1}, Lx1/t2;->b(Lx1/t2;)Lu3/n;

    move-result-object p1

    new-instance p2, Lx1/s2;

    move-object v0, p2

    move-object v1, p0

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move v6, p6

    invoke-direct/range {v0 .. v6}, Lx1/s2;-><init>(Lx1/t2$a;Landroid/util/Pair;Lz2/n;Lz2/q;Ljava/io/IOException;Z)V

    invoke-interface {p1, p2}, Lu3/n;->k(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public U(ILz2/u$b;)V
    .locals 1

    invoke-direct {p0, p1, p2}, Lx1/t2$a;->H(ILz2/u$b;)Landroid/util/Pair;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p2, p0, Lx1/t2$a;->b:Lx1/t2;

    invoke-static {p2}, Lx1/t2;->b(Lx1/t2;)Lu3/n;

    move-result-object p2

    new-instance v0, Lx1/m2;

    invoke-direct {v0, p0, p1}, Lx1/m2;-><init>(Lx1/t2$a;Landroid/util/Pair;)V

    invoke-interface {p2, v0}, Lu3/n;->k(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public W(ILz2/u$b;Lz2/n;Lz2/q;)V
    .locals 1

    invoke-direct {p0, p1, p2}, Lx1/t2$a;->H(ILz2/u$b;)Landroid/util/Pair;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p2, p0, Lx1/t2$a;->b:Lx1/t2;

    invoke-static {p2}, Lx1/t2;->b(Lx1/t2;)Lu3/n;

    move-result-object p2

    new-instance v0, Lx1/r2;

    invoke-direct {v0, p0, p1, p3, p4}, Lx1/r2;-><init>(Lx1/t2$a;Landroid/util/Pair;Lz2/n;Lz2/q;)V

    invoke-interface {p2, v0}, Lu3/n;->k(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public Z(ILz2/u$b;Lz2/q;)V
    .locals 1

    invoke-direct {p0, p1, p2}, Lx1/t2$a;->H(ILz2/u$b;)Landroid/util/Pair;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p2, p0, Lx1/t2$a;->b:Lx1/t2;

    invoke-static {p2}, Lx1/t2;->b(Lx1/t2;)Lu3/n;

    move-result-object p2

    new-instance v0, Lx1/j2;

    invoke-direct {v0, p0, p1, p3}, Lx1/j2;-><init>(Lx1/t2$a;Landroid/util/Pair;Lz2/q;)V

    invoke-interface {p2, v0}, Lu3/n;->k(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public a0(ILz2/u$b;Lz2/q;)V
    .locals 1

    invoke-direct {p0, p1, p2}, Lx1/t2$a;->H(ILz2/u$b;)Landroid/util/Pair;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p2, p0, Lx1/t2$a;->b:Lx1/t2;

    invoke-static {p2}, Lx1/t2;->b(Lx1/t2;)Lu3/n;

    move-result-object p2

    new-instance v0, Lx1/i2;

    invoke-direct {v0, p0, p1, p3}, Lx1/i2;-><init>(Lx1/t2$a;Landroid/util/Pair;Lz2/q;)V

    invoke-interface {p2, v0}, Lu3/n;->k(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public e0(ILz2/u$b;)V
    .locals 1

    invoke-direct {p0, p1, p2}, Lx1/t2$a;->H(ILz2/u$b;)Landroid/util/Pair;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p2, p0, Lx1/t2$a;->b:Lx1/t2;

    invoke-static {p2}, Lx1/t2;->b(Lx1/t2;)Lu3/n;

    move-result-object p2

    new-instance v0, Lx1/h2;

    invoke-direct {v0, p0, p1}, Lx1/h2;-><init>(Lx1/t2$a;Landroid/util/Pair;)V

    invoke-interface {p2, v0}, Lu3/n;->k(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public synthetic j0(ILz2/u$b;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lb2/p;->a(Lb2/w;ILz2/u$b;)V

    return-void
.end method

.method public k0(ILz2/u$b;Lz2/n;Lz2/q;)V
    .locals 1

    invoke-direct {p0, p1, p2}, Lx1/t2$a;->H(ILz2/u$b;)Landroid/util/Pair;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p2, p0, Lx1/t2$a;->b:Lx1/t2;

    invoke-static {p2}, Lx1/t2;->b(Lx1/t2;)Lu3/n;

    move-result-object p2

    new-instance v0, Lx1/p2;

    invoke-direct {v0, p0, p1, p3, p4}, Lx1/p2;-><init>(Lx1/t2$a;Landroid/util/Pair;Lz2/n;Lz2/q;)V

    invoke-interface {p2, v0}, Lu3/n;->k(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public l0(ILz2/u$b;Ljava/lang/Exception;)V
    .locals 1

    invoke-direct {p0, p1, p2}, Lx1/t2$a;->H(ILz2/u$b;)Landroid/util/Pair;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p2, p0, Lx1/t2$a;->b:Lx1/t2;

    invoke-static {p2}, Lx1/t2;->b(Lx1/t2;)Lu3/n;

    move-result-object p2

    new-instance v0, Lx1/o2;

    invoke-direct {v0, p0, p1, p3}, Lx1/o2;-><init>(Lx1/t2$a;Landroid/util/Pair;Ljava/lang/Exception;)V

    invoke-interface {p2, v0}, Lu3/n;->k(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public m0(ILz2/u$b;Lz2/n;Lz2/q;)V
    .locals 1

    invoke-direct {p0, p1, p2}, Lx1/t2$a;->H(ILz2/u$b;)Landroid/util/Pair;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p2, p0, Lx1/t2$a;->b:Lx1/t2;

    invoke-static {p2}, Lx1/t2;->b(Lx1/t2;)Lu3/n;

    move-result-object p2

    new-instance v0, Lx1/q2;

    invoke-direct {v0, p0, p1, p3, p4}, Lx1/q2;-><init>(Lx1/t2$a;Landroid/util/Pair;Lz2/n;Lz2/q;)V

    invoke-interface {p2, v0}, Lu3/n;->k(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public n0(ILz2/u$b;)V
    .locals 1

    invoke-direct {p0, p1, p2}, Lx1/t2$a;->H(ILz2/u$b;)Landroid/util/Pair;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p2, p0, Lx1/t2$a;->b:Lx1/t2;

    invoke-static {p2}, Lx1/t2;->b(Lx1/t2;)Lu3/n;

    move-result-object p2

    new-instance v0, Lx1/l2;

    invoke-direct {v0, p0, p1}, Lx1/l2;-><init>(Lx1/t2$a;Landroid/util/Pair;)V

    invoke-interface {p2, v0}, Lu3/n;->k(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method
