.class Lj$/util/stream/T1;
.super Ljava/lang/Object;

# interfaces
.implements Lj$/util/stream/Y1;
.implements Lj$/util/stream/o2;


# instance fields
.field private a:Z

.field private b:I

.field final synthetic c:Lj$/util/function/k;


# direct methods
.method constructor <init>(Lj$/util/function/k;)V
    .locals 0

    iput-object p1, p0, Lj$/util/stream/T1;->c:Lj$/util/function/k;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Ljava/lang/Integer;)V
    .locals 0

    invoke-static {p0, p1}, Lj$/util/stream/D0;->C(Lj$/util/stream/o2;Ljava/lang/Integer;)V

    return-void
.end method

.method public bridge synthetic accept(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p0, p1}, Lj$/util/stream/T1;->a(Ljava/lang/Integer;)V

    return-void
.end method

.method public synthetic andThen(Lj$/util/function/Consumer;)Lj$/util/function/Consumer;
    .locals 0

    invoke-static {p0, p1}, Lj$/util/function/Consumer$-CC;->$default$andThen(Lj$/util/function/Consumer;Lj$/util/function/Consumer;)Lj$/util/function/Consumer;

    move-result-object p1

    return-object p1
.end method

.method public synthetic c(D)V
    .locals 0

    invoke-static {}, Lj$/util/stream/D0;->A()V

    const/4 p1, 0x0

    throw p1
.end method

.method public d(I)V
    .locals 2

    iget-boolean v0, p0, Lj$/util/stream/T1;->a:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    iput-boolean v0, p0, Lj$/util/stream/T1;->a:Z

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lj$/util/stream/T1;->c:Lj$/util/function/k;

    iget v1, p0, Lj$/util/stream/T1;->b:I

    invoke-interface {v0, v1, p1}, Lj$/util/function/k;->i(II)I

    move-result p1

    :goto_0
    iput p1, p0, Lj$/util/stream/T1;->b:I

    return-void
.end method

.method public synthetic e(J)V
    .locals 0

    invoke-static {}, Lj$/util/stream/D0;->F()V

    const/4 p1, 0x0

    throw p1
.end method

.method public get()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-boolean v0, p0, Lj$/util/stream/T1;->a:Z

    if-eqz v0, :cond_0

    invoke-static {}, Lj$/util/m;->a()Lj$/util/m;

    move-result-object v0

    goto :goto_0

    :cond_0
    iget v0, p0, Lj$/util/stream/T1;->b:I

    invoke-static {v0}, Lj$/util/m;->d(I)Lj$/util/m;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method public synthetic h()V
    .locals 0

    return-void
.end method

.method public j(J)V
    .locals 0

    const/4 p1, 0x1

    iput-boolean p1, p0, Lj$/util/stream/T1;->a:Z

    const/4 p1, 0x0

    iput p1, p0, Lj$/util/stream/T1;->b:I

    return-void
.end method

.method public q(Lj$/util/stream/Y1;)V
    .locals 1

    check-cast p1, Lj$/util/stream/T1;

    .line 1
    iget-boolean v0, p1, Lj$/util/stream/T1;->a:Z

    if-nez v0, :cond_0

    iget p1, p1, Lj$/util/stream/T1;->b:I

    invoke-virtual {p0, p1}, Lj$/util/stream/T1;->d(I)V

    :cond_0
    return-void
.end method

.method public synthetic r()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
