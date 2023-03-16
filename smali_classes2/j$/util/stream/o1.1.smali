.class final Lj$/util/stream/o1;
.super Lj$/util/stream/q1;

# interfaces
.implements Lj$/util/B;


# direct methods
.method constructor <init>(Lj$/util/stream/L0;)V
    .locals 0

    invoke-direct {p0, p1}, Lj$/util/stream/q1;-><init>(Lj$/util/stream/O0;)V

    return-void
.end method


# virtual methods
.method public synthetic a(Lj$/util/function/Consumer;)Z
    .locals 0

    invoke-static {p0, p1}, Lj$/util/a;->r(Lj$/util/B;Lj$/util/function/Consumer;)Z

    move-result p1

    return p1
.end method

.method public synthetic forEachRemaining(Lj$/util/function/Consumer;)V
    .locals 0

    invoke-static {p0, p1}, Lj$/util/a;->d(Lj$/util/B;Lj$/util/function/Consumer;)V

    return-void
.end method
