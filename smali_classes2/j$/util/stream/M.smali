.class final Lj$/util/stream/M;
.super Ljava/lang/Object;

# interfaces
.implements Lj$/util/stream/L3;


# instance fields
.field private final a:I

.field final b:Z

.field final c:Ljava/lang/Object;

.field final d:Lj$/util/function/Predicate;

.field final e:Lj$/util/function/A;


# direct methods
.method constructor <init>(ZILjava/lang/Object;Lj$/util/function/Predicate;Lj$/util/function/A;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lj$/util/stream/M;->b:Z

    iput p2, p0, Lj$/util/stream/M;->a:I

    iput-object p3, p0, Lj$/util/stream/M;->c:Ljava/lang/Object;

    iput-object p4, p0, Lj$/util/stream/M;->d:Lj$/util/function/Predicate;

    iput-object p5, p0, Lj$/util/stream/M;->e:Lj$/util/function/A;

    return-void
.end method


# virtual methods
.method public a()I
    .locals 2

    sget v0, Lj$/util/stream/e3;->u:I

    iget-boolean v1, p0, Lj$/util/stream/M;->b:Z

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    sget v1, Lj$/util/stream/e3;->r:I

    :goto_0
    or-int/2addr v0, v1

    return v0
.end method

.method public f(Lj$/util/stream/D0;Lj$/util/H;)Ljava/lang/Object;
    .locals 1

    new-instance v0, Lj$/util/stream/T;

    invoke-direct {v0, p0, p1, p2}, Lj$/util/stream/T;-><init>(Lj$/util/stream/M;Lj$/util/stream/D0;Lj$/util/H;)V

    invoke-virtual {v0}, Ljava/util/concurrent/CountedCompleter;->invoke()Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public g(Lj$/util/stream/D0;Lj$/util/H;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lj$/util/stream/M;->e:Lj$/util/function/A;

    invoke-interface {v0}, Lj$/util/function/A;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj$/util/stream/M3;

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

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lj$/util/stream/M;->c:Ljava/lang/Object;

    :goto_0
    return-object p1
.end method
