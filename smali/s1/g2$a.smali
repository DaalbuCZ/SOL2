.class final Ls1/g2$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lu2/b0;
.implements Lw1/w;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ls1/g2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "a"
.end annotation


# instance fields
.field private final a:Ls1/g2$c;

.field private b:Lu2/b0$a;

.field private c:Lw1/w$a;

.field final synthetic d:Ls1/g2;


# direct methods
.method public constructor <init>(Ls1/g2;Ls1/g2$c;)V
    .locals 1

    iput-object p1, p0, Ls1/g2$a;->d:Ls1/g2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Ls1/g2;->b(Ls1/g2;)Lu2/b0$a;

    move-result-object v0

    iput-object v0, p0, Ls1/g2$a;->b:Lu2/b0$a;

    invoke-static {p1}, Ls1/g2;->c(Ls1/g2;)Lw1/w$a;

    move-result-object p1

    iput-object p1, p0, Ls1/g2$a;->c:Lw1/w$a;

    iput-object p2, p0, Ls1/g2$a;->a:Ls1/g2$c;

    return-void
.end method

.method private b(ILu2/u$b;)Z
    .locals 3

    if-eqz p2, :cond_0

    iget-object v0, p0, Ls1/g2$a;->a:Ls1/g2$c;

    invoke-static {v0, p2}, Ls1/g2;->d(Ls1/g2$c;Lu2/u$b;)Lu2/u$b;

    move-result-object p2

    if-nez p2, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_0
    const/4 p2, 0x0

    :cond_1
    iget-object v0, p0, Ls1/g2$a;->a:Ls1/g2$c;

    invoke-static {v0, p1}, Ls1/g2;->e(Ls1/g2$c;I)I

    move-result p1

    iget-object v0, p0, Ls1/g2$a;->b:Lu2/b0$a;

    iget v1, v0, Lu2/b0$a;->a:I

    if-ne v1, p1, :cond_2

    iget-object v0, v0, Lu2/b0$a;->b:Lu2/u$b;

    invoke-static {v0, p2}, Lp3/m0;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    :cond_2
    iget-object v0, p0, Ls1/g2$a;->d:Ls1/g2;

    invoke-static {v0}, Ls1/g2;->b(Ls1/g2;)Lu2/b0$a;

    move-result-object v0

    const-wide/16 v1, 0x0

    invoke-virtual {v0, p1, p2, v1, v2}, Lu2/b0$a;->F(ILu2/u$b;J)Lu2/b0$a;

    move-result-object v0

    iput-object v0, p0, Ls1/g2$a;->b:Lu2/b0$a;

    :cond_3
    iget-object v0, p0, Ls1/g2$a;->c:Lw1/w$a;

    iget v1, v0, Lw1/w$a;->a:I

    if-ne v1, p1, :cond_4

    iget-object v0, v0, Lw1/w$a;->b:Lu2/u$b;

    invoke-static {v0, p2}, Lp3/m0;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    :cond_4
    iget-object v0, p0, Ls1/g2$a;->d:Ls1/g2;

    invoke-static {v0}, Ls1/g2;->c(Ls1/g2;)Lw1/w$a;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lw1/w$a;->u(ILu2/u$b;)Lw1/w$a;

    move-result-object p1

    iput-object p1, p0, Ls1/g2$a;->c:Lw1/w$a;

    :cond_5
    const/4 p1, 0x1

    return p1
.end method


# virtual methods
.method public C(ILu2/u$b;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ls1/g2$a;->b(ILu2/u$b;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Ls1/g2$a;->c:Lw1/w$a;

    invoke-virtual {p1, p3}, Lw1/w$a;->k(I)V

    :cond_0
    return-void
.end method

.method public G(ILu2/u$b;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ls1/g2$a;->b(ILu2/u$b;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Ls1/g2$a;->c:Lw1/w$a;

    invoke-virtual {p1}, Lw1/w$a;->m()V

    :cond_0
    return-void
.end method

.method public I(ILu2/u$b;Ljava/lang/Exception;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ls1/g2$a;->b(ILu2/u$b;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Ls1/g2$a;->c:Lw1/w$a;

    invoke-virtual {p1, p3}, Lw1/w$a;->l(Ljava/lang/Exception;)V

    :cond_0
    return-void
.end method

.method public P(ILu2/u$b;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ls1/g2$a;->b(ILu2/u$b;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Ls1/g2$a;->c:Lw1/w$a;

    invoke-virtual {p1}, Lw1/w$a;->j()V

    :cond_0
    return-void
.end method

.method public Q(ILu2/u$b;Lu2/q;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ls1/g2$a;->b(ILu2/u$b;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Ls1/g2$a;->b:Lu2/b0$a;

    invoke-virtual {p1, p3}, Lu2/b0$a;->E(Lu2/q;)V

    :cond_0
    return-void
.end method

.method public T(ILu2/u$b;Lu2/q;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ls1/g2$a;->b(ILu2/u$b;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Ls1/g2$a;->b:Lu2/b0$a;

    invoke-virtual {p1, p3}, Lu2/b0$a;->j(Lu2/q;)V

    :cond_0
    return-void
.end method

.method public U(ILu2/u$b;Lu2/n;Lu2/q;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ls1/g2$a;->b(ILu2/u$b;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Ls1/g2$a;->b:Lu2/b0$a;

    invoke-virtual {p1, p3, p4}, Lu2/b0$a;->B(Lu2/n;Lu2/q;)V

    :cond_0
    return-void
.end method

.method public V(ILu2/u$b;Lu2/n;Lu2/q;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ls1/g2$a;->b(ILu2/u$b;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Ls1/g2$a;->b:Lu2/b0$a;

    invoke-virtual {p1, p3, p4}, Lu2/b0$a;->v(Lu2/n;Lu2/q;)V

    :cond_0
    return-void
.end method

.method public Y(ILu2/u$b;Lu2/n;Lu2/q;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ls1/g2$a;->b(ILu2/u$b;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Ls1/g2$a;->b:Lu2/b0$a;

    invoke-virtual {p1, p3, p4}, Lu2/b0$a;->s(Lu2/n;Lu2/q;)V

    :cond_0
    return-void
.end method

.method public a0(ILu2/u$b;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ls1/g2$a;->b(ILu2/u$b;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Ls1/g2$a;->c:Lw1/w$a;

    invoke-virtual {p1}, Lw1/w$a;->h()V

    :cond_0
    return-void
.end method

.method public f0(ILu2/u$b;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ls1/g2$a;->b(ILu2/u$b;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Ls1/g2$a;->c:Lw1/w$a;

    invoke-virtual {p1}, Lw1/w$a;->i()V

    :cond_0
    return-void
.end method

.method public synthetic k0(ILu2/u$b;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lw1/p;->a(Lw1/w;ILu2/u$b;)V

    return-void
.end method

.method public m0(ILu2/u$b;Lu2/n;Lu2/q;Ljava/io/IOException;Z)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ls1/g2$a;->b(ILu2/u$b;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Ls1/g2$a;->b:Lu2/b0$a;

    invoke-virtual {p1, p3, p4, p5, p6}, Lu2/b0$a;->y(Lu2/n;Lu2/q;Ljava/io/IOException;Z)V

    :cond_0
    return-void
.end method
