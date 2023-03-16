.class final Lj$/util/stream/U;
.super Lj$/util/stream/Y;

# interfaces
.implements Lj$/util/stream/n2;


# instance fields
.field final b:Lj$/util/function/h;


# direct methods
.method constructor <init>(Lj$/util/function/h;Z)V
    .locals 0

    invoke-direct {p0, p2}, Lj$/util/stream/Y;-><init>(Z)V

    iput-object p1, p0, Lj$/util/stream/U;->b:Lj$/util/function/h;

    return-void
.end method


# virtual methods
.method public bridge synthetic accept(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Double;

    invoke-virtual {p0, p1}, Lj$/util/stream/U;->i(Ljava/lang/Double;)V

    return-void
.end method

.method public c(D)V
    .locals 1

    iget-object v0, p0, Lj$/util/stream/U;->b:Lj$/util/function/h;

    invoke-interface {v0, p1, p2}, Lj$/util/function/h;->c(D)V

    return-void
.end method

.method public synthetic i(Ljava/lang/Double;)V
    .locals 0

    invoke-static {p0, p1}, Lj$/util/stream/D0;->B(Lj$/util/stream/n2;Ljava/lang/Double;)V

    return-void
.end method
