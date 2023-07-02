.class final Lj$/util/stream/b2;
.super Lj$/util/stream/f;


# instance fields
.field private final h:Lj$/util/stream/a2;


# direct methods
.method constructor <init>(Lj$/util/stream/a2;Lj$/util/stream/D0;Lj$/util/H;)V
    .locals 0

    invoke-direct {p0, p2, p3}, Lj$/util/stream/f;-><init>(Lj$/util/stream/D0;Lj$/util/H;)V

    iput-object p1, p0, Lj$/util/stream/b2;->h:Lj$/util/stream/a2;

    return-void
.end method

.method constructor <init>(Lj$/util/stream/b2;Lj$/util/H;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lj$/util/stream/f;-><init>(Lj$/util/stream/f;Lj$/util/H;)V

    iget-object p1, p1, Lj$/util/stream/b2;->h:Lj$/util/stream/a2;

    iput-object p1, p0, Lj$/util/stream/b2;->h:Lj$/util/stream/a2;

    return-void
.end method


# virtual methods
.method protected a()Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lj$/util/stream/f;->a:Lj$/util/stream/D0;

    iget-object v1, p0, Lj$/util/stream/b2;->h:Lj$/util/stream/a2;

    invoke-virtual {v1}, Lj$/util/stream/a2;->b()Lj$/util/stream/Y1;

    move-result-object v1

    iget-object v2, p0, Lj$/util/stream/f;->b:Lj$/util/H;

    invoke-virtual {v0, v1, v2}, Lj$/util/stream/D0;->I0(Lj$/util/stream/q2;Lj$/util/H;)Lj$/util/stream/q2;

    return-object v1
.end method

.method protected f(Lj$/util/H;)Lj$/util/stream/f;
    .locals 1

    .line 1
    new-instance v0, Lj$/util/stream/b2;

    invoke-direct {v0, p0, p1}, Lj$/util/stream/b2;-><init>(Lj$/util/stream/b2;Lj$/util/H;)V

    return-object v0
.end method

.method public onCompletion(Ljava/util/concurrent/CountedCompleter;)V
    .locals 1

    invoke-virtual {p0}, Lj$/util/stream/f;->d()Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lj$/util/stream/f;->d:Lj$/util/stream/f;

    check-cast p1, Lj$/util/stream/b2;

    invoke-virtual {p1}, Lj$/util/stream/f;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lj$/util/stream/Y1;

    iget-object v0, p0, Lj$/util/stream/f;->e:Lj$/util/stream/f;

    check-cast v0, Lj$/util/stream/b2;

    invoke-virtual {v0}, Lj$/util/stream/f;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj$/util/stream/Y1;

    invoke-interface {p1, v0}, Lj$/util/stream/Y1;->q(Lj$/util/stream/Y1;)V

    invoke-virtual {p0, p1}, Lj$/util/stream/f;->g(Ljava/lang/Object;)V

    :cond_0
    const/4 p1, 0x0

    .line 1
    iput-object p1, p0, Lj$/util/stream/f;->b:Lj$/util/H;

    iput-object p1, p0, Lj$/util/stream/f;->e:Lj$/util/stream/f;

    iput-object p1, p0, Lj$/util/stream/f;->d:Lj$/util/stream/f;

    return-void
.end method
