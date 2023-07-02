.class public Lc2/w;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lc2/m;


# instance fields
.field private final a:Lc2/m;


# direct methods
.method public constructor <init>(Lc2/m;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc2/w;->a:Lc2/m;

    return-void
.end method


# virtual methods
.method public a()J
    .locals 2

    iget-object v0, p0, Lc2/w;->a:Lc2/m;

    invoke-interface {v0}, Lc2/m;->a()J

    move-result-wide v0

    return-wide v0
.end method

.method public b([BII)I
    .locals 1

    iget-object v0, p0, Lc2/w;->a:Lc2/m;

    invoke-interface {v0, p1, p2, p3}, Lc2/m;->b([BII)I

    move-result p1

    return p1
.end method

.method public d(I)I
    .locals 1

    iget-object v0, p0, Lc2/w;->a:Lc2/m;

    invoke-interface {v0, p1}, Lc2/m;->d(I)I

    move-result p1

    return p1
.end method

.method public e([BIIZ)Z
    .locals 1

    iget-object v0, p0, Lc2/w;->a:Lc2/m;

    invoke-interface {v0, p1, p2, p3, p4}, Lc2/m;->e([BIIZ)Z

    move-result p1

    return p1
.end method

.method public g([BII)I
    .locals 1

    iget-object v0, p0, Lc2/w;->a:Lc2/m;

    invoke-interface {v0, p1, p2, p3}, Lc2/m;->g([BII)I

    move-result p1

    return p1
.end method

.method public i()V
    .locals 1

    iget-object v0, p0, Lc2/w;->a:Lc2/m;

    invoke-interface {v0}, Lc2/m;->i()V

    return-void
.end method

.method public j(I)V
    .locals 1

    iget-object v0, p0, Lc2/w;->a:Lc2/m;

    invoke-interface {v0, p1}, Lc2/m;->j(I)V

    return-void
.end method

.method public k(IZ)Z
    .locals 1

    iget-object v0, p0, Lc2/w;->a:Lc2/m;

    invoke-interface {v0, p1, p2}, Lc2/m;->k(IZ)Z

    move-result p1

    return p1
.end method

.method public m([BIIZ)Z
    .locals 1

    iget-object v0, p0, Lc2/w;->a:Lc2/m;

    invoke-interface {v0, p1, p2, p3, p4}, Lc2/m;->m([BIIZ)Z

    move-result p1

    return p1
.end method

.method public n()J
    .locals 2

    iget-object v0, p0, Lc2/w;->a:Lc2/m;

    invoke-interface {v0}, Lc2/m;->n()J

    move-result-wide v0

    return-wide v0
.end method

.method public o([BII)V
    .locals 1

    iget-object v0, p0, Lc2/w;->a:Lc2/m;

    invoke-interface {v0, p1, p2, p3}, Lc2/m;->o([BII)V

    return-void
.end method

.method public p(I)V
    .locals 1

    iget-object v0, p0, Lc2/w;->a:Lc2/m;

    invoke-interface {v0, p1}, Lc2/m;->p(I)V

    return-void
.end method

.method public q()J
    .locals 2

    iget-object v0, p0, Lc2/w;->a:Lc2/m;

    invoke-interface {v0}, Lc2/m;->q()J

    move-result-wide v0

    return-wide v0
.end method

.method public readFully([BII)V
    .locals 1

    iget-object v0, p0, Lc2/w;->a:Lc2/m;

    invoke-interface {v0, p1, p2, p3}, Lc2/m;->readFully([BII)V

    return-void
.end method
