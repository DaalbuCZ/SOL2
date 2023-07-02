.class Lj$/util/stream/e2;
.super Lj$/util/stream/h2;


# instance fields
.field public final synthetic u:I

.field final synthetic v:Lj$/util/function/Function;


# direct methods
.method public synthetic constructor <init>(Lj$/util/stream/i2;Lj$/util/stream/c;IILj$/util/function/Function;I)V
    .locals 0

    .line 1
    iput p6, p0, Lj$/util/stream/e2;->u:I

    iput-object p5, p0, Lj$/util/stream/e2;->v:Lj$/util/function/Function;

    invoke-direct {p0, p2, p3, p4}, Lj$/util/stream/h2;-><init>(Lj$/util/stream/c;II)V

    return-void
.end method


# virtual methods
.method V0(ILj$/util/stream/q2;)Lj$/util/stream/q2;
    .locals 1

    iget p1, p0, Lj$/util/stream/e2;->u:I

    packed-switch p1, :pswitch_data_0

    goto :goto_0

    .line 1
    :pswitch_0
    new-instance p1, Lj$/util/stream/c2;

    const/4 v0, 0x2

    invoke-direct {p1, p0, p2, v0}, Lj$/util/stream/c2;-><init>(Lj$/util/stream/c;Lj$/util/stream/q2;I)V

    return-object p1

    .line 2
    :goto_0
    new-instance p1, Lj$/util/stream/c2;

    const/4 v0, 0x6

    invoke-direct {p1, p0, p2, v0}, Lj$/util/stream/c2;-><init>(Lj$/util/stream/c;Lj$/util/stream/q2;I)V

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
