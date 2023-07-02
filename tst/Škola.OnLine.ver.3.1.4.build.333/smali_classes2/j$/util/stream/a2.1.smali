.class abstract Lj$/util/stream/a2;
.super Ljava/lang/Object;

# interfaces
.implements Lj$/util/stream/L3;


# instance fields
.field private final a:I


# direct methods
.method constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lj$/util/stream/a2;->a:I

    return-void
.end method


# virtual methods
.method public synthetic a()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public abstract b()Lj$/util/stream/Y1;
.end method

.method public f(Lj$/util/stream/D0;Lj$/util/H;)Ljava/lang/Object;
    .locals 1

    new-instance v0, Lj$/util/stream/b2;

    invoke-direct {v0, p0, p1, p2}, Lj$/util/stream/b2;-><init>(Lj$/util/stream/a2;Lj$/util/stream/D0;Lj$/util/H;)V

    invoke-virtual {v0}, Ljava/util/concurrent/CountedCompleter;->invoke()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lj$/util/stream/Y1;

    invoke-interface {p1}, Lj$/util/function/A;->get()Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public g(Lj$/util/stream/D0;Lj$/util/H;)Ljava/lang/Object;
    .locals 2

    invoke-virtual {p0}, Lj$/util/stream/a2;->b()Lj$/util/stream/Y1;

    move-result-object v0

    check-cast p1, Lj$/util/stream/c;

    .line 1
    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    invoke-virtual {p1, v0}, Lj$/util/stream/c;->J0(Lj$/util/stream/q2;)Lj$/util/stream/q2;

    move-result-object v1

    invoke-virtual {p1, v1, p2}, Lj$/util/stream/c;->e0(Lj$/util/stream/q2;Lj$/util/H;)V

    .line 3
    invoke-interface {v0}, Lj$/util/function/A;->get()Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
