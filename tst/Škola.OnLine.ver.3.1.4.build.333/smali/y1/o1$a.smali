.class final Ly1/o1$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ly1/o1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# instance fields
.field private final a:Lx1/y3$b;

.field private b:Lg5/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lg5/q<",
            "Lz2/u$b;",
            ">;"
        }
    .end annotation
.end field

.field private c:Lg5/r;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lg5/r<",
            "Lz2/u$b;",
            "Lx1/y3;",
            ">;"
        }
    .end annotation
.end field

.field private d:Lz2/u$b;

.field private e:Lz2/u$b;

.field private f:Lz2/u$b;


# direct methods
.method public constructor <init>(Lx1/y3$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly1/o1$a;->a:Lx1/y3$b;

    invoke-static {}, Lg5/q;->J()Lg5/q;

    move-result-object p1

    iput-object p1, p0, Ly1/o1$a;->b:Lg5/q;

    invoke-static {}, Lg5/r;->j()Lg5/r;

    move-result-object p1

    iput-object p1, p0, Ly1/o1$a;->c:Lg5/r;

    return-void
.end method

.method static synthetic a(Ly1/o1$a;)Lg5/q;
    .locals 0

    iget-object p0, p0, Ly1/o1$a;->b:Lg5/q;

    return-object p0
.end method

.method private b(Lg5/r$a;Lz2/u$b;Lx1/y3;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lg5/r$a<",
            "Lz2/u$b;",
            "Lx1/y3;",
            ">;",
            "Lz2/u$b;",
            "Lx1/y3;",
            ")V"
        }
    .end annotation

    if-nez p2, :cond_0

    return-void

    :cond_0
    iget-object v0, p2, Lz2/s;->a:Ljava/lang/Object;

    invoke-virtual {p3, v0}, Lx1/y3;->f(Ljava/lang/Object;)I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_1

    :goto_0
    invoke-virtual {p1, p2, p3}, Lg5/r$a;->d(Ljava/lang/Object;Ljava/lang/Object;)Lg5/r$a;

    goto :goto_1

    :cond_1
    iget-object p3, p0, Ly1/o1$a;->c:Lg5/r;

    invoke-virtual {p3, p2}, Lg5/r;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lx1/y3;

    if-eqz p3, :cond_2

    goto :goto_0

    :cond_2
    :goto_1
    return-void
.end method

.method private static c(Lx1/c3;Lg5/q;Lz2/u$b;Lx1/y3$b;)Lz2/u$b;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx1/c3;",
            "Lg5/q<",
            "Lz2/u$b;",
            ">;",
            "Lz2/u$b;",
            "Lx1/y3$b;",
            ")",
            "Lz2/u$b;"
        }
    .end annotation

    invoke-interface {p0}, Lx1/c3;->D()Lx1/y3;

    move-result-object v0

    invoke-interface {p0}, Lx1/c3;->s()I

    move-result v1

    invoke-virtual {v0}, Lx1/y3;->u()Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    move-object v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v0, v1}, Lx1/y3;->q(I)Ljava/lang/Object;

    move-result-object v2

    :goto_0
    invoke-interface {p0}, Lx1/c3;->j()Z

    move-result v4

    if-nez v4, :cond_2

    invoke-virtual {v0}, Lx1/y3;->u()Z

    move-result v4

    if-eqz v4, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v0, v1, p3}, Lx1/y3;->j(ILx1/y3$b;)Lx1/y3$b;

    move-result-object v0

    invoke-interface {p0}, Lx1/c3;->H()J

    move-result-wide v4

    invoke-static {v4, v5}, Lu3/n0;->B0(J)J

    move-result-wide v4

    invoke-virtual {p3}, Lx1/y3$b;->q()J

    move-result-wide v6

    sub-long/2addr v4, v6

    invoke-virtual {v0, v4, v5}, Lx1/y3$b;->g(J)I

    move-result p3

    goto :goto_2

    :cond_2
    :goto_1
    const/4 p3, -0x1

    :goto_2
    const/4 v0, 0x0

    :goto_3
    invoke-virtual {p1}, Ljava/util/AbstractCollection;->size()I

    move-result v1

    if-ge v0, v1, :cond_4

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lz2/u$b;

    invoke-interface {p0}, Lx1/c3;->j()Z

    move-result v6

    invoke-interface {p0}, Lx1/c3;->t()I

    move-result v7

    invoke-interface {p0}, Lx1/c3;->x()I

    move-result v8

    move-object v4, v1

    move-object v5, v2

    move v9, p3

    invoke-static/range {v4 .. v9}, Ly1/o1$a;->i(Lz2/u$b;Ljava/lang/Object;ZIII)Z

    move-result v4

    if-eqz v4, :cond_3

    return-object v1

    :cond_3
    add-int/lit8 v0, v0, 0x1

    goto :goto_3

    :cond_4
    invoke-virtual {p1}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_5

    if-eqz p2, :cond_5

    invoke-interface {p0}, Lx1/c3;->j()Z

    move-result v6

    invoke-interface {p0}, Lx1/c3;->t()I

    move-result v7

    invoke-interface {p0}, Lx1/c3;->x()I

    move-result v8

    move-object v4, p2

    move-object v5, v2

    move v9, p3

    invoke-static/range {v4 .. v9}, Ly1/o1$a;->i(Lz2/u$b;Ljava/lang/Object;ZIII)Z

    move-result p0

    if-eqz p0, :cond_5

    return-object p2

    :cond_5
    return-object v3
.end method

.method private static i(Lz2/u$b;Ljava/lang/Object;ZIII)Z
    .locals 1

    iget-object v0, p0, Lz2/s;->a:Ljava/lang/Object;

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    :cond_0
    if-eqz p2, :cond_1

    iget p1, p0, Lz2/s;->b:I

    if-ne p1, p3, :cond_1

    iget p1, p0, Lz2/s;->c:I

    if-eq p1, p4, :cond_2

    :cond_1
    if-nez p2, :cond_3

    iget p1, p0, Lz2/s;->b:I

    const/4 p2, -0x1

    if-ne p1, p2, :cond_3

    iget p0, p0, Lz2/s;->e:I

    if-ne p0, p5, :cond_3

    :cond_2
    const/4 v0, 0x1

    :cond_3
    return v0
.end method

.method private m(Lx1/y3;)V
    .locals 3

    invoke-static {}, Lg5/r;->a()Lg5/r$a;

    move-result-object v0

    iget-object v1, p0, Ly1/o1$a;->b:Lg5/q;

    invoke-virtual {v1}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Ly1/o1$a;->e:Lz2/u$b;

    invoke-direct {p0, v0, v1, p1}, Ly1/o1$a;->b(Lg5/r$a;Lz2/u$b;Lx1/y3;)V

    iget-object v1, p0, Ly1/o1$a;->f:Lz2/u$b;

    iget-object v2, p0, Ly1/o1$a;->e:Lz2/u$b;

    invoke-static {v1, v2}, Lf5/j;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Ly1/o1$a;->f:Lz2/u$b;

    invoke-direct {p0, v0, v1, p1}, Ly1/o1$a;->b(Lg5/r$a;Lz2/u$b;Lx1/y3;)V

    :cond_0
    iget-object v1, p0, Ly1/o1$a;->d:Lz2/u$b;

    iget-object v2, p0, Ly1/o1$a;->e:Lz2/u$b;

    invoke-static {v1, v2}, Lf5/j;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    iget-object v1, p0, Ly1/o1$a;->d:Lz2/u$b;

    iget-object v2, p0, Ly1/o1$a;->f:Lz2/u$b;

    invoke-static {v1, v2}, Lf5/j;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_0
    iget-object v2, p0, Ly1/o1$a;->b:Lg5/q;

    invoke-virtual {v2}, Ljava/util/AbstractCollection;->size()I

    move-result v2

    if-ge v1, v2, :cond_2

    iget-object v2, p0, Ly1/o1$a;->b:Lg5/q;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lz2/u$b;

    invoke-direct {p0, v0, v2, p1}, Ly1/o1$a;->b(Lg5/r$a;Lz2/u$b;Lx1/y3;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    iget-object v1, p0, Ly1/o1$a;->b:Lg5/q;

    iget-object v2, p0, Ly1/o1$a;->d:Lz2/u$b;

    invoke-virtual {v1, v2}, Lg5/q;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    :goto_1
    iget-object v1, p0, Ly1/o1$a;->d:Lz2/u$b;

    invoke-direct {p0, v0, v1, p1}, Ly1/o1$a;->b(Lg5/r$a;Lz2/u$b;Lx1/y3;)V

    :cond_3
    invoke-virtual {v0}, Lg5/r$a;->b()Lg5/r;

    move-result-object p1

    iput-object p1, p0, Ly1/o1$a;->c:Lg5/r;

    return-void
.end method


# virtual methods
.method public d()Lz2/u$b;
    .locals 1

    iget-object v0, p0, Ly1/o1$a;->d:Lz2/u$b;

    return-object v0
.end method

.method public e()Lz2/u$b;
    .locals 1

    iget-object v0, p0, Ly1/o1$a;->b:Lg5/q;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Ly1/o1$a;->b:Lg5/q;

    invoke-static {v0}, Lg5/t;->c(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lz2/u$b;

    :goto_0
    return-object v0
.end method

.method public f(Lz2/u$b;)Lx1/y3;
    .locals 1

    iget-object v0, p0, Ly1/o1$a;->c:Lg5/r;

    invoke-virtual {v0, p1}, Lg5/r;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lx1/y3;

    return-object p1
.end method

.method public g()Lz2/u$b;
    .locals 1

    iget-object v0, p0, Ly1/o1$a;->e:Lz2/u$b;

    return-object v0
.end method

.method public h()Lz2/u$b;
    .locals 1

    iget-object v0, p0, Ly1/o1$a;->f:Lz2/u$b;

    return-object v0
.end method

.method public j(Lx1/c3;)V
    .locals 3

    iget-object v0, p0, Ly1/o1$a;->b:Lg5/q;

    iget-object v1, p0, Ly1/o1$a;->e:Lz2/u$b;

    iget-object v2, p0, Ly1/o1$a;->a:Lx1/y3$b;

    invoke-static {p1, v0, v1, v2}, Ly1/o1$a;->c(Lx1/c3;Lg5/q;Lz2/u$b;Lx1/y3$b;)Lz2/u$b;

    move-result-object p1

    iput-object p1, p0, Ly1/o1$a;->d:Lz2/u$b;

    return-void
.end method

.method public k(Ljava/util/List;Lz2/u$b;Lx1/c3;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lz2/u$b;",
            ">;",
            "Lz2/u$b;",
            "Lx1/c3;",
            ")V"
        }
    .end annotation

    invoke-static {p1}, Lg5/q;->F(Ljava/util/Collection;)Lg5/q;

    move-result-object v0

    iput-object v0, p0, Ly1/o1$a;->b:Lg5/q;

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lz2/u$b;

    iput-object p1, p0, Ly1/o1$a;->e:Lz2/u$b;

    invoke-static {p2}, Lu3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lz2/u$b;

    iput-object p1, p0, Ly1/o1$a;->f:Lz2/u$b;

    :cond_0
    iget-object p1, p0, Ly1/o1$a;->d:Lz2/u$b;

    if-nez p1, :cond_1

    iget-object p1, p0, Ly1/o1$a;->b:Lg5/q;

    iget-object p2, p0, Ly1/o1$a;->e:Lz2/u$b;

    iget-object v0, p0, Ly1/o1$a;->a:Lx1/y3$b;

    invoke-static {p3, p1, p2, v0}, Ly1/o1$a;->c(Lx1/c3;Lg5/q;Lz2/u$b;Lx1/y3$b;)Lz2/u$b;

    move-result-object p1

    iput-object p1, p0, Ly1/o1$a;->d:Lz2/u$b;

    :cond_1
    invoke-interface {p3}, Lx1/c3;->D()Lx1/y3;

    move-result-object p1

    invoke-direct {p0, p1}, Ly1/o1$a;->m(Lx1/y3;)V

    return-void
.end method

.method public l(Lx1/c3;)V
    .locals 3

    iget-object v0, p0, Ly1/o1$a;->b:Lg5/q;

    iget-object v1, p0, Ly1/o1$a;->e:Lz2/u$b;

    iget-object v2, p0, Ly1/o1$a;->a:Lx1/y3$b;

    invoke-static {p1, v0, v1, v2}, Ly1/o1$a;->c(Lx1/c3;Lg5/q;Lz2/u$b;Lx1/y3$b;)Lz2/u$b;

    move-result-object v0

    iput-object v0, p0, Ly1/o1$a;->d:Lz2/u$b;

    invoke-interface {p1}, Lx1/c3;->D()Lx1/y3;

    move-result-object p1

    invoke-direct {p0, p1}, Ly1/o1$a;->m(Lx1/y3;)V

    return-void
.end method
