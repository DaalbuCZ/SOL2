.class final Lj$/util/stream/B0;
.super Ljava/lang/Object;

# interfaces
.implements Lj$/util/stream/L3;


# instance fields
.field private final a:I

.field final b:Lj$/util/stream/A0;

.field final c:Lj$/util/function/A;


# direct methods
.method constructor <init>(ILj$/util/stream/A0;Lj$/util/function/A;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lj$/util/stream/B0;->a:I

    iput-object p2, p0, Lj$/util/stream/B0;->b:Lj$/util/stream/A0;

    iput-object p3, p0, Lj$/util/stream/B0;->c:Lj$/util/function/A;

    return-void
.end method


# virtual methods
.method public a()I
    .locals 2

    sget v0, Lj$/util/stream/e3;->u:I

    sget v1, Lj$/util/stream/e3;->r:I

    or-int/2addr v0, v1

    return v0
.end method

.method public f(Lj$/util/stream/D0;Lj$/util/H;)Ljava/lang/Object;
    .locals 1

    .line 1
    new-instance v0, Lj$/util/stream/C0;

    invoke-direct {v0, p0, p1, p2}, Lj$/util/stream/C0;-><init>(Lj$/util/stream/B0;Lj$/util/stream/D0;Lj$/util/H;)V

    invoke-virtual {v0}, Ljava/util/concurrent/CountedCompleter;->invoke()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    return-object p1
.end method

.method public g(Lj$/util/stream/D0;Lj$/util/H;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lj$/util/stream/B0;->c:Lj$/util/function/A;

    invoke-interface {v0}, Lj$/util/function/A;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj$/util/stream/z0;

    check-cast p1, Lj$/util/stream/c;

    .line 2
    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 3
    invoke-virtual {p1, v0}, Lj$/util/stream/c;->J0(Lj$/util/stream/q2;)Lj$/util/stream/q2;

    move-result-object v1

    invoke-virtual {p1, v1, p2}, Lj$/util/stream/c;->e0(Lj$/util/stream/q2;Lj$/util/H;)V

    .line 4
    iget-boolean p1, v0, Lj$/util/stream/z0;->b:Z

    .line 5
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
