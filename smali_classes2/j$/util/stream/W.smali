.class final Lj$/util/stream/W;
.super Lj$/util/stream/Y;

# interfaces
.implements Lj$/util/stream/p2;


# instance fields
.field final b:Lj$/util/function/r;


# direct methods
.method constructor <init>(Lj$/util/function/r;Z)V
    .locals 0

    invoke-direct {p0, p2}, Lj$/util/stream/Y;-><init>(Z)V

    iput-object p1, p0, Lj$/util/stream/W;->b:Lj$/util/function/r;

    return-void
.end method


# virtual methods
.method public bridge synthetic accept(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p0, p1}, Lj$/util/stream/W;->i(Ljava/lang/Long;)V

    return-void
.end method

.method public e(J)V
    .locals 1

    iget-object v0, p0, Lj$/util/stream/W;->b:Lj$/util/function/r;

    invoke-interface {v0, p1, p2}, Lj$/util/function/r;->e(J)V

    return-void
.end method

.method public synthetic i(Ljava/lang/Long;)V
    .locals 0

    invoke-static {p0, p1}, Lj$/util/stream/D0;->D(Lj$/util/stream/p2;Ljava/lang/Long;)V

    return-void
.end method
