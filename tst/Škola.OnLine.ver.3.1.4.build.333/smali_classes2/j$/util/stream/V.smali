.class final Lj$/util/stream/V;
.super Lj$/util/stream/Y;

# interfaces
.implements Lj$/util/stream/o2;


# instance fields
.field final b:Lj$/util/function/m;


# direct methods
.method constructor <init>(Lj$/util/function/m;Z)V
    .locals 0

    invoke-direct {p0, p2}, Lj$/util/stream/Y;-><init>(Z)V

    iput-object p1, p0, Lj$/util/stream/V;->b:Lj$/util/function/m;

    return-void
.end method


# virtual methods
.method public bridge synthetic accept(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p0, p1}, Lj$/util/stream/V;->i(Ljava/lang/Integer;)V

    return-void
.end method

.method public d(I)V
    .locals 1

    iget-object v0, p0, Lj$/util/stream/V;->b:Lj$/util/function/m;

    invoke-interface {v0, p1}, Lj$/util/function/m;->d(I)V

    return-void
.end method

.method public synthetic i(Ljava/lang/Integer;)V
    .locals 0

    invoke-static {p0, p1}, Lj$/util/stream/D0;->C(Lj$/util/stream/o2;Ljava/lang/Integer;)V

    return-void
.end method
