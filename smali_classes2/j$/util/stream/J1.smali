.class Lj$/util/stream/J1;
.super Lj$/util/stream/a2;


# instance fields
.field public final synthetic b:I

.field final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;I)V
    .locals 0

    .line 1
    iput p3, p0, Lj$/util/stream/J1;->b:I

    iput-object p2, p0, Lj$/util/stream/J1;->c:Ljava/lang/Object;

    invoke-direct {p0, p1}, Lj$/util/stream/a2;-><init>(I)V

    return-void
.end method


# virtual methods
.method public b()Lj$/util/stream/Y1;
    .locals 2

    iget v0, p0, Lj$/util/stream/J1;->b:I

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 1
    :pswitch_0
    new-instance v0, Lj$/util/stream/T1;

    iget-object v1, p0, Lj$/util/stream/J1;->c:Ljava/lang/Object;

    check-cast v1, Lj$/util/function/k;

    invoke-direct {v0, v1}, Lj$/util/stream/T1;-><init>(Lj$/util/function/k;)V

    return-object v0

    .line 2
    :pswitch_1
    new-instance v0, Lj$/util/stream/N1;

    iget-object v1, p0, Lj$/util/stream/J1;->c:Ljava/lang/Object;

    check-cast v1, Lj$/util/function/c;

    invoke-direct {v0, v1}, Lj$/util/stream/N1;-><init>(Lj$/util/function/c;)V

    return-object v0

    .line 3
    :pswitch_2
    new-instance v0, Lj$/util/stream/K1;

    iget-object v1, p0, Lj$/util/stream/J1;->c:Ljava/lang/Object;

    check-cast v1, Lj$/util/function/f;

    invoke-direct {v0, v1}, Lj$/util/stream/K1;-><init>(Lj$/util/function/f;)V

    return-object v0

    .line 4
    :goto_0
    new-instance v0, Lj$/util/stream/X1;

    iget-object v1, p0, Lj$/util/stream/J1;->c:Ljava/lang/Object;

    check-cast v1, Lj$/util/function/p;

    invoke-direct {v0, v1}, Lj$/util/stream/X1;-><init>(Lj$/util/function/p;)V

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
