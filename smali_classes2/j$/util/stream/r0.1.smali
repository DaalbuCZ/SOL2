.class abstract Lj$/util/stream/r0;
.super Lj$/util/stream/s0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lj$/util/stream/s0;

    return-void
.end method

.method constructor <init>(Lj$/util/stream/c;II)V
    .locals 0

    invoke-direct {p0, p1, p3}, Lj$/util/stream/s0;-><init>(Lj$/util/stream/c;I)V

    return-void
.end method


# virtual methods
.method final U0()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public bridge synthetic parallel()Lj$/util/stream/u0;
    .locals 1

    invoke-virtual {p0}, Lj$/util/stream/c;->parallel()Lj$/util/stream/h;

    move-object v0, p0

    check-cast v0, Lj$/util/stream/u0;

    return-object v0
.end method

.method public bridge synthetic sequential()Lj$/util/stream/u0;
    .locals 1

    invoke-virtual {p0}, Lj$/util/stream/c;->sequential()Lj$/util/stream/h;

    move-object v0, p0

    check-cast v0, Lj$/util/stream/u0;

    return-object v0
.end method
