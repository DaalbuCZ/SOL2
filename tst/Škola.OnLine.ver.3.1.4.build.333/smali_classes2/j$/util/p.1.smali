.class public final synthetic Lj$/util/p;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/util/PrimitiveIterator$OfDouble;


# instance fields
.field final synthetic a:Lj$/util/q;


# direct methods
.method private synthetic constructor <init>(Lj$/util/q;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj$/util/p;->a:Lj$/util/q;

    return-void
.end method

.method public static synthetic a(Lj$/util/q;)Ljava/util/PrimitiveIterator$OfDouble;
    .locals 1

    new-instance v0, Lj$/util/p;

    invoke-direct {v0, p0}, Lj$/util/p;-><init>(Lj$/util/q;)V

    return-object v0
.end method


# virtual methods
.method public synthetic forEachRemaining(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lj$/util/p;->a:Lj$/util/q;

    check-cast v0, Lj$/util/L;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1
    check-cast p1, Lj$/util/function/h;

    invoke-virtual {v0, p1}, Lj$/util/L;->a(Lj$/util/function/h;)V

    return-void
.end method

.method public synthetic forEachRemaining(Ljava/util/function/Consumer;)V
    .locals 1

    iget-object v0, p0, Lj$/util/p;->a:Lj$/util/q;

    invoke-static {p1}, Lj$/util/function/Consumer$VivifiedWrapper;->convert(Ljava/util/function/Consumer;)Lj$/util/function/Consumer;

    move-result-object p1

    check-cast v0, Lj$/util/L;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    invoke-static {v0, p1}, Lj$/util/a;->b(Lj$/util/q;Lj$/util/function/Consumer;)V

    return-void
.end method

.method public synthetic forEachRemaining(Ljava/util/function/DoubleConsumer;)V
    .locals 1

    iget-object v0, p0, Lj$/util/p;->a:Lj$/util/q;

    invoke-static {p1}, Lj$/util/function/g;->a(Ljava/util/function/DoubleConsumer;)Lj$/util/function/h;

    move-result-object p1

    check-cast v0, Lj$/util/L;

    invoke-virtual {v0, p1}, Lj$/util/L;->a(Lj$/util/function/h;)V

    return-void
.end method

.method public synthetic hasNext()Z
    .locals 1

    iget-object v0, p0, Lj$/util/p;->a:Lj$/util/q;

    check-cast v0, Lj$/util/L;

    invoke-virtual {v0}, Lj$/util/L;->hasNext()Z

    move-result v0

    return v0
.end method

.method public synthetic next()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lj$/util/p;->a:Lj$/util/q;

    check-cast v0, Lj$/util/L;

    invoke-virtual {v0}, Lj$/util/L;->next()Ljava/lang/Double;

    move-result-object v0

    return-object v0
.end method

.method public synthetic next()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lj$/util/p;->a:Lj$/util/q;

    check-cast v0, Lj$/util/L;

    invoke-virtual {v0}, Lj$/util/L;->next()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public synthetic nextDouble()D
    .locals 2

    iget-object v0, p0, Lj$/util/p;->a:Lj$/util/q;

    check-cast v0, Lj$/util/L;

    invoke-virtual {v0}, Lj$/util/L;->nextDouble()D

    move-result-wide v0

    return-wide v0
.end method

.method public synthetic remove()V
    .locals 1

    iget-object v0, p0, Lj$/util/p;->a:Lj$/util/q;

    check-cast v0, Lj$/util/L;

    invoke-virtual {v0}, Lj$/util/L;->remove()V

    return-void
.end method
