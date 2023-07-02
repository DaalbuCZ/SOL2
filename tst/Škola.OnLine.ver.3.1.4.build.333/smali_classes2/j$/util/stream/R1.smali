.class Lj$/util/stream/R1;
.super Lj$/util/stream/a2;


# instance fields
.field final synthetic b:Lj$/util/function/k;

.field final synthetic c:I


# direct methods
.method constructor <init>(ILj$/util/function/k;I)V
    .locals 0

    iput-object p2, p0, Lj$/util/stream/R1;->b:Lj$/util/function/k;

    iput p3, p0, Lj$/util/stream/R1;->c:I

    invoke-direct {p0, p1}, Lj$/util/stream/a2;-><init>(I)V

    return-void
.end method


# virtual methods
.method public b()Lj$/util/stream/Y1;
    .locals 3

    .line 1
    new-instance v0, Lj$/util/stream/S1;

    iget v1, p0, Lj$/util/stream/R1;->c:I

    iget-object v2, p0, Lj$/util/stream/R1;->b:Lj$/util/function/k;

    invoke-direct {v0, v1, v2}, Lj$/util/stream/S1;-><init>(ILj$/util/function/k;)V

    return-object v0
.end method
