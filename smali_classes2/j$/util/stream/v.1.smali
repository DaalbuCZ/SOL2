.class public final synthetic Lj$/util/stream/v;
.super Ljava/lang/Object;

# interfaces
.implements Lj$/util/function/h;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Lj$/util/stream/v;->a:I

    iput-object p1, p0, Lj$/util/stream/v;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final c(D)V
    .locals 1

    iget v0, p0, Lj$/util/stream/v;->a:I

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 1
    :pswitch_0
    iget-object v0, p0, Lj$/util/stream/v;->b:Ljava/lang/Object;

    check-cast v0, Lj$/util/stream/q2;

    invoke-interface {v0, p1, p2}, Lj$/util/stream/q2;->c(D)V

    return-void

    .line 2
    :goto_0
    iget-object v0, p0, Lj$/util/stream/v;->b:Ljava/lang/Object;

    check-cast v0, Lj$/util/stream/w;

    .line 3
    iget-object v0, v0, Lj$/util/stream/j2;->a:Lj$/util/stream/q2;

    invoke-interface {v0, p1, p2}, Lj$/util/stream/q2;->c(D)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
