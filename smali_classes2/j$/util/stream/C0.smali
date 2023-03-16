.class final Lj$/util/stream/C0;
.super Lj$/util/stream/d;


# instance fields
.field private final j:Lj$/util/stream/B0;


# direct methods
.method constructor <init>(Lj$/util/stream/B0;Lj$/util/stream/D0;Lj$/util/H;)V
    .locals 0

    invoke-direct {p0, p2, p3}, Lj$/util/stream/d;-><init>(Lj$/util/stream/D0;Lj$/util/H;)V

    iput-object p1, p0, Lj$/util/stream/C0;->j:Lj$/util/stream/B0;

    return-void
.end method

.method constructor <init>(Lj$/util/stream/C0;Lj$/util/H;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lj$/util/stream/d;-><init>(Lj$/util/stream/d;Lj$/util/H;)V

    iget-object p1, p1, Lj$/util/stream/C0;->j:Lj$/util/stream/B0;

    iput-object p1, p0, Lj$/util/stream/C0;->j:Lj$/util/stream/B0;

    return-void
.end method


# virtual methods
.method protected a()Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lj$/util/stream/f;->a:Lj$/util/stream/D0;

    iget-object v1, p0, Lj$/util/stream/C0;->j:Lj$/util/stream/B0;

    iget-object v1, v1, Lj$/util/stream/B0;->c:Lj$/util/function/A;

    invoke-interface {v1}, Lj$/util/function/A;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lj$/util/stream/z0;

    iget-object v2, p0, Lj$/util/stream/f;->b:Lj$/util/H;

    invoke-virtual {v0, v1, v2}, Lj$/util/stream/D0;->I0(Lj$/util/stream/q2;Lj$/util/H;)Lj$/util/stream/q2;

    .line 2
    iget-boolean v0, v1, Lj$/util/stream/z0;->b:Z

    .line 3
    iget-object v1, p0, Lj$/util/stream/C0;->j:Lj$/util/stream/B0;

    iget-object v1, v1, Lj$/util/stream/B0;->b:Lj$/util/stream/A0;

    invoke-static {v1}, Lj$/util/stream/A0;->b(Lj$/util/stream/A0;)Z

    move-result v1

    if-ne v0, v1, :cond_0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {p0, v0}, Lj$/util/stream/d;->l(Ljava/lang/Object;)V

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method protected f(Lj$/util/H;)Lj$/util/stream/f;
    .locals 1

    .line 1
    new-instance v0, Lj$/util/stream/C0;

    invoke-direct {v0, p0, p1}, Lj$/util/stream/C0;-><init>(Lj$/util/stream/C0;Lj$/util/H;)V

    return-object v0
.end method

.method protected k()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lj$/util/stream/C0;->j:Lj$/util/stream/B0;

    iget-object v0, v0, Lj$/util/stream/B0;->b:Lj$/util/stream/A0;

    invoke-static {v0}, Lj$/util/stream/A0;->b(Lj$/util/stream/A0;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
