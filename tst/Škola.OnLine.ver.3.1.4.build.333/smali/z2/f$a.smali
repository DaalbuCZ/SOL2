.class final Lz2/f$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lz2/b0;
.implements Lb2/w;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lz2/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "a"
.end annotation


# instance fields
.field private final a:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field

.field private b:Lz2/b0$a;

.field private c:Lb2/w$a;

.field final synthetic d:Lz2/f;


# direct methods
.method public constructor <init>(Lz2/f;Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    iput-object p1, p0, Lz2/f$a;->d:Lz2/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lz2/a;->w(Lz2/u$b;)Lz2/b0$a;

    move-result-object v1

    iput-object v1, p0, Lz2/f$a;->b:Lz2/b0$a;

    invoke-virtual {p1, v0}, Lz2/a;->t(Lz2/u$b;)Lb2/w$a;

    move-result-object p1

    iput-object p1, p0, Lz2/f$a;->c:Lb2/w$a;

    iput-object p2, p0, Lz2/f$a;->a:Ljava/lang/Object;

    return-void
.end method

.method private b(ILz2/u$b;)Z
    .locals 3

    if-eqz p2, :cond_0

    iget-object v0, p0, Lz2/f$a;->d:Lz2/f;

    iget-object v1, p0, Lz2/f$a;->a:Ljava/lang/Object;

    invoke-virtual {v0, v1, p2}, Lz2/f;->G(Ljava/lang/Object;Lz2/u$b;)Lz2/u$b;

    move-result-object p2

    if-nez p2, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_0
    const/4 p2, 0x0

    :cond_1
    iget-object v0, p0, Lz2/f$a;->d:Lz2/f;

    iget-object v1, p0, Lz2/f$a;->a:Ljava/lang/Object;

    invoke-virtual {v0, v1, p1}, Lz2/f;->I(Ljava/lang/Object;I)I

    move-result p1

    iget-object v0, p0, Lz2/f$a;->b:Lz2/b0$a;

    iget v1, v0, Lz2/b0$a;->a:I

    if-ne v1, p1, :cond_2

    iget-object v0, v0, Lz2/b0$a;->b:Lz2/u$b;

    invoke-static {v0, p2}, Lu3/n0;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    :cond_2
    iget-object v0, p0, Lz2/f$a;->d:Lz2/f;

    const-wide/16 v1, 0x0

    invoke-virtual {v0, p1, p2, v1, v2}, Lz2/a;->v(ILz2/u$b;J)Lz2/b0$a;

    move-result-object v0

    iput-object v0, p0, Lz2/f$a;->b:Lz2/b0$a;

    :cond_3
    iget-object v0, p0, Lz2/f$a;->c:Lb2/w$a;

    iget v1, v0, Lb2/w$a;->a:I

    if-ne v1, p1, :cond_4

    iget-object v0, v0, Lb2/w$a;->b:Lz2/u$b;

    invoke-static {v0, p2}, Lu3/n0;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    :cond_4
    iget-object v0, p0, Lz2/f$a;->d:Lz2/f;

    invoke-virtual {v0, p1, p2}, Lz2/a;->r(ILz2/u$b;)Lb2/w$a;

    move-result-object p1

    iput-object p1, p0, Lz2/f$a;->c:Lb2/w$a;

    :cond_5
    const/4 p1, 0x1

    return p1
.end method

.method private d(Lz2/q;)Lz2/q;
    .locals 14

    iget-object v0, p0, Lz2/f$a;->d:Lz2/f;

    iget-object v1, p0, Lz2/f$a;->a:Ljava/lang/Object;

    iget-wide v2, p1, Lz2/q;->f:J

    invoke-virtual {v0, v1, v2, v3}, Lz2/f;->H(Ljava/lang/Object;J)J

    move-result-wide v10

    iget-object v0, p0, Lz2/f$a;->d:Lz2/f;

    iget-object v1, p0, Lz2/f$a;->a:Ljava/lang/Object;

    iget-wide v2, p1, Lz2/q;->g:J

    invoke-virtual {v0, v1, v2, v3}, Lz2/f;->H(Ljava/lang/Object;J)J

    move-result-wide v12

    iget-wide v0, p1, Lz2/q;->f:J

    cmp-long v0, v10, v0

    if-nez v0, :cond_0

    iget-wide v0, p1, Lz2/q;->g:J

    cmp-long v0, v12, v0

    if-nez v0, :cond_0

    return-object p1

    :cond_0
    new-instance v0, Lz2/q;

    iget v5, p1, Lz2/q;->a:I

    iget v6, p1, Lz2/q;->b:I

    iget-object v7, p1, Lz2/q;->c:Lx1/n1;

    iget v8, p1, Lz2/q;->d:I

    iget-object v9, p1, Lz2/q;->e:Ljava/lang/Object;

    move-object v4, v0

    invoke-direct/range {v4 .. v13}, Lz2/q;-><init>(IILx1/n1;ILjava/lang/Object;JJ)V

    return-object v0
.end method


# virtual methods
.method public C(ILz2/u$b;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lz2/f$a;->b(ILz2/u$b;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lz2/f$a;->c:Lb2/w$a;

    invoke-virtual {p1}, Lb2/w$a;->h()V

    :cond_0
    return-void
.end method

.method public E(ILz2/u$b;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lz2/f$a;->b(ILz2/u$b;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lz2/f$a;->c:Lb2/w$a;

    invoke-virtual {p1, p3}, Lb2/w$a;->k(I)V

    :cond_0
    return-void
.end method

.method public Q(ILz2/u$b;Lz2/n;Lz2/q;Ljava/io/IOException;Z)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lz2/f$a;->b(ILz2/u$b;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lz2/f$a;->b:Lz2/b0$a;

    invoke-direct {p0, p4}, Lz2/f$a;->d(Lz2/q;)Lz2/q;

    move-result-object p2

    invoke-virtual {p1, p3, p2, p5, p6}, Lz2/b0$a;->y(Lz2/n;Lz2/q;Ljava/io/IOException;Z)V

    :cond_0
    return-void
.end method

.method public U(ILz2/u$b;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lz2/f$a;->b(ILz2/u$b;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lz2/f$a;->c:Lb2/w$a;

    invoke-virtual {p1}, Lb2/w$a;->j()V

    :cond_0
    return-void
.end method

.method public W(ILz2/u$b;Lz2/n;Lz2/q;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lz2/f$a;->b(ILz2/u$b;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lz2/f$a;->b:Lz2/b0$a;

    invoke-direct {p0, p4}, Lz2/f$a;->d(Lz2/q;)Lz2/q;

    move-result-object p2

    invoke-virtual {p1, p3, p2}, Lz2/b0$a;->s(Lz2/n;Lz2/q;)V

    :cond_0
    return-void
.end method

.method public Z(ILz2/u$b;Lz2/q;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lz2/f$a;->b(ILz2/u$b;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lz2/f$a;->b:Lz2/b0$a;

    invoke-direct {p0, p3}, Lz2/f$a;->d(Lz2/q;)Lz2/q;

    move-result-object p2

    invoke-virtual {p1, p2}, Lz2/b0$a;->E(Lz2/q;)V

    :cond_0
    return-void
.end method

.method public a0(ILz2/u$b;Lz2/q;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lz2/f$a;->b(ILz2/u$b;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lz2/f$a;->b:Lz2/b0$a;

    invoke-direct {p0, p3}, Lz2/f$a;->d(Lz2/q;)Lz2/q;

    move-result-object p2

    invoke-virtual {p1, p2}, Lz2/b0$a;->j(Lz2/q;)V

    :cond_0
    return-void
.end method

.method public e0(ILz2/u$b;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lz2/f$a;->b(ILz2/u$b;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lz2/f$a;->c:Lb2/w$a;

    invoke-virtual {p1}, Lb2/w$a;->m()V

    :cond_0
    return-void
.end method

.method public synthetic j0(ILz2/u$b;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lb2/p;->a(Lb2/w;ILz2/u$b;)V

    return-void
.end method

.method public k0(ILz2/u$b;Lz2/n;Lz2/q;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lz2/f$a;->b(ILz2/u$b;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lz2/f$a;->b:Lz2/b0$a;

    invoke-direct {p0, p4}, Lz2/f$a;->d(Lz2/q;)Lz2/q;

    move-result-object p2

    invoke-virtual {p1, p3, p2}, Lz2/b0$a;->B(Lz2/n;Lz2/q;)V

    :cond_0
    return-void
.end method

.method public l0(ILz2/u$b;Ljava/lang/Exception;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lz2/f$a;->b(ILz2/u$b;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lz2/f$a;->c:Lb2/w$a;

    invoke-virtual {p1, p3}, Lb2/w$a;->l(Ljava/lang/Exception;)V

    :cond_0
    return-void
.end method

.method public m0(ILz2/u$b;Lz2/n;Lz2/q;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lz2/f$a;->b(ILz2/u$b;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lz2/f$a;->b:Lz2/b0$a;

    invoke-direct {p0, p4}, Lz2/f$a;->d(Lz2/q;)Lz2/q;

    move-result-object p2

    invoke-virtual {p1, p3, p2}, Lz2/b0$a;->v(Lz2/n;Lz2/q;)V

    :cond_0
    return-void
.end method

.method public n0(ILz2/u$b;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lz2/f$a;->b(ILz2/u$b;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lz2/f$a;->c:Lb2/w$a;

    invoke-virtual {p1}, Lb2/w$a;->i()V

    :cond_0
    return-void
.end method
