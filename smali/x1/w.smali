.class public Lx1/w;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lx1/m;


# instance fields
.field private final a:Lx1/m;


# direct methods
.method public constructor <init>(Lx1/m;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx1/w;->a:Lx1/m;

    return-void
.end method


# virtual methods
.method public a()J
    .locals 2

    iget-object v0, p0, Lx1/w;->a:Lx1/m;

    invoke-interface {v0}, Lx1/m;->a()J

    move-result-wide v0

    return-wide v0
.end method

.method public b([BII)I
    .locals 1

    iget-object v0, p0, Lx1/w;->a:Lx1/m;

    invoke-interface {v0, p1, p2, p3}, Lx1/m;->b([BII)I

    move-result p1

    return p1
.end method

.method public c(I)I
    .locals 1

    iget-object v0, p0, Lx1/w;->a:Lx1/m;

    invoke-interface {v0, p1}, Lx1/m;->c(I)I

    move-result p1

    return p1
.end method

.method public d([BIIZ)Z
    .locals 1

    iget-object v0, p0, Lx1/w;->a:Lx1/m;

    invoke-interface {v0, p1, p2, p3, p4}, Lx1/m;->d([BIIZ)Z

    move-result p1

    return p1
.end method

.method public e([BII)I
    .locals 1

    iget-object v0, p0, Lx1/w;->a:Lx1/m;

    invoke-interface {v0, p1, p2, p3}, Lx1/m;->e([BII)I

    move-result p1

    return p1
.end method

.method public g()V
    .locals 1

    iget-object v0, p0, Lx1/w;->a:Lx1/m;

    invoke-interface {v0}, Lx1/m;->g()V

    return-void
.end method

.method public h(I)V
    .locals 1

    iget-object v0, p0, Lx1/w;->a:Lx1/m;

    invoke-interface {v0, p1}, Lx1/m;->h(I)V

    return-void
.end method

.method public j(IZ)Z
    .locals 1

    iget-object v0, p0, Lx1/w;->a:Lx1/m;

    invoke-interface {v0, p1, p2}, Lx1/m;->j(IZ)Z

    move-result p1

    return p1
.end method

.method public l([BIIZ)Z
    .locals 1

    iget-object v0, p0, Lx1/w;->a:Lx1/m;

    invoke-interface {v0, p1, p2, p3, p4}, Lx1/m;->l([BIIZ)Z

    move-result p1

    return p1
.end method

.method public m()J
    .locals 2

    iget-object v0, p0, Lx1/w;->a:Lx1/m;

    invoke-interface {v0}, Lx1/m;->m()J

    move-result-wide v0

    return-wide v0
.end method

.method public o([BII)V
    .locals 1

    iget-object v0, p0, Lx1/w;->a:Lx1/m;

    invoke-interface {v0, p1, p2, p3}, Lx1/m;->o([BII)V

    return-void
.end method

.method public p(I)V
    .locals 1

    iget-object v0, p0, Lx1/w;->a:Lx1/m;

    invoke-interface {v0, p1}, Lx1/m;->p(I)V

    return-void
.end method

.method public q()J
    .locals 2

    iget-object v0, p0, Lx1/w;->a:Lx1/m;

    invoke-interface {v0}, Lx1/m;->q()J

    move-result-wide v0

    return-wide v0
.end method

.method public readFully([BII)V
    .locals 1

    iget-object v0, p0, Lx1/w;->a:Lx1/m;

    invoke-interface {v0, p1, p2, p3}, Lx1/m;->readFully([BII)V

    return-void
.end method
