.class final Lj$/util/stream/i3;
.super Lj$/util/stream/j3;

# interfaces
.implements Lj$/util/function/r;


# instance fields
.field final c:[J


# direct methods
.method constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Lj$/util/stream/j3;-><init>()V

    new-array p1, p1, [J

    iput-object p1, p0, Lj$/util/stream/i3;->c:[J

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;J)V
    .locals 4

    check-cast p1, Lj$/util/function/r;

    const/4 v0, 0x0

    :goto_0
    int-to-long v1, v0

    cmp-long v1, v1, p2

    if-gez v1, :cond_0

    .line 1
    iget-object v1, p0, Lj$/util/stream/i3;->c:[J

    aget-wide v2, v1, v0

    invoke-interface {p1, v2, v3}, Lj$/util/function/r;->e(J)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public e(J)V
    .locals 3

    iget-object v0, p0, Lj$/util/stream/i3;->c:[J

    iget v1, p0, Lj$/util/stream/j3;->b:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lj$/util/stream/j3;->b:I

    aput-wide p1, v0, v1

    return-void
.end method
