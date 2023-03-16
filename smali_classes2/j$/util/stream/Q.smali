.class final Lj$/util/stream/Q;
.super Lj$/util/stream/S;


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lj$/util/stream/S;-><init>()V

    return-void
.end method


# virtual methods
.method public get()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-boolean v0, p0, Lj$/util/stream/S;->a:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lj$/util/stream/S;->b:Ljava/lang/Object;

    invoke-static {v0}, Lj$/util/k;->d(Ljava/lang/Object;)Lj$/util/k;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method
