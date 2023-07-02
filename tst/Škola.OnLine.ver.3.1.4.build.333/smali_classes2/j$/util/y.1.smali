.class public final synthetic Lj$/util/y;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/util/Spliterator$OfDouble;


# instance fields
.field final synthetic a:Lj$/util/z;


# direct methods
.method private synthetic constructor <init>(Lj$/util/z;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj$/util/y;->a:Lj$/util/z;

    return-void
.end method

.method public static synthetic a(Lj$/util/z;)Ljava/util/Spliterator$OfDouble;
    .locals 1

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    new-instance v0, Lj$/util/y;

    invoke-direct {v0, p0}, Lj$/util/y;-><init>(Lj$/util/z;)V

    return-object v0
.end method


# virtual methods
.method public synthetic characteristics()I
    .locals 1

    iget-object v0, p0, Lj$/util/y;->a:Lj$/util/z;

    invoke-interface {v0}, Lj$/util/H;->characteristics()I

    move-result v0

    return v0
.end method

.method public synthetic estimateSize()J
    .locals 2

    iget-object v0, p0, Lj$/util/y;->a:Lj$/util/z;

    invoke-interface {v0}, Lj$/util/H;->estimateSize()J

    move-result-wide v0

    return-wide v0
.end method

.method public synthetic forEachRemaining(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lj$/util/y;->a:Lj$/util/z;

    invoke-interface {v0, p1}, Lj$/util/F;->forEachRemaining(Ljava/lang/Object;)V

    return-void
.end method

.method public synthetic forEachRemaining(Ljava/util/function/Consumer;)V
    .locals 1

    iget-object v0, p0, Lj$/util/y;->a:Lj$/util/z;

    invoke-static {p1}, Lj$/util/function/Consumer$VivifiedWrapper;->convert(Ljava/util/function/Consumer;)Lj$/util/function/Consumer;

    move-result-object p1

    invoke-interface {v0, p1}, Lj$/util/z;->forEachRemaining(Lj$/util/function/Consumer;)V

    return-void
.end method

.method public synthetic forEachRemaining(Ljava/util/function/DoubleConsumer;)V
    .locals 1

    iget-object v0, p0, Lj$/util/y;->a:Lj$/util/z;

    invoke-static {p1}, Lj$/util/function/g;->a(Ljava/util/function/DoubleConsumer;)Lj$/util/function/h;

    move-result-object p1

    invoke-interface {v0, p1}, Lj$/util/z;->l(Lj$/util/function/h;)V

    return-void
.end method

.method public synthetic getComparator()Ljava/util/Comparator;
    .locals 1

    iget-object v0, p0, Lj$/util/y;->a:Lj$/util/z;

    invoke-interface {v0}, Lj$/util/H;->getComparator()Ljava/util/Comparator;

    move-result-object v0

    return-object v0
.end method

.method public synthetic getExactSizeIfKnown()J
    .locals 2

    iget-object v0, p0, Lj$/util/y;->a:Lj$/util/z;

    invoke-interface {v0}, Lj$/util/H;->getExactSizeIfKnown()J

    move-result-wide v0

    return-wide v0
.end method

.method public synthetic hasCharacteristics(I)Z
    .locals 1

    iget-object v0, p0, Lj$/util/y;->a:Lj$/util/z;

    invoke-interface {v0, p1}, Lj$/util/H;->hasCharacteristics(I)Z

    move-result p1

    return p1
.end method

.method public synthetic tryAdvance(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, Lj$/util/y;->a:Lj$/util/z;

    invoke-interface {v0, p1}, Lj$/util/F;->tryAdvance(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public synthetic tryAdvance(Ljava/util/function/Consumer;)Z
    .locals 1

    iget-object v0, p0, Lj$/util/y;->a:Lj$/util/z;

    invoke-static {p1}, Lj$/util/function/Consumer$VivifiedWrapper;->convert(Ljava/util/function/Consumer;)Lj$/util/function/Consumer;

    move-result-object p1

    invoke-interface {v0, p1}, Lj$/util/z;->a(Lj$/util/function/Consumer;)Z

    move-result p1

    return p1
.end method

.method public synthetic tryAdvance(Ljava/util/function/DoubleConsumer;)Z
    .locals 1

    iget-object v0, p0, Lj$/util/y;->a:Lj$/util/z;

    invoke-static {p1}, Lj$/util/function/g;->a(Ljava/util/function/DoubleConsumer;)Lj$/util/function/h;

    move-result-object p1

    invoke-interface {v0, p1}, Lj$/util/z;->k(Lj$/util/function/h;)Z

    move-result p1

    return p1
.end method

.method public synthetic trySplit()Ljava/util/Spliterator$OfDouble;
    .locals 2

    iget-object v0, p0, Lj$/util/y;->a:Lj$/util/z;

    invoke-interface {v0}, Lj$/util/z;->trySplit()Lj$/util/z;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    .line 1
    :cond_0
    new-instance v1, Lj$/util/y;

    invoke-direct {v1, v0}, Lj$/util/y;-><init>(Lj$/util/z;)V

    move-object v0, v1

    :goto_0
    return-object v0
.end method

.method public synthetic trySplit()Ljava/util/Spliterator$OfPrimitive;
    .locals 1

    iget-object v0, p0, Lj$/util/y;->a:Lj$/util/z;

    invoke-interface {v0}, Lj$/util/F;->trySplit()Lj$/util/F;

    move-result-object v0

    invoke-static {v0}, Lj$/util/E;->a(Lj$/util/F;)Ljava/util/Spliterator$OfPrimitive;

    move-result-object v0

    return-object v0
.end method

.method public synthetic trySplit()Ljava/util/Spliterator;
    .locals 1

    iget-object v0, p0, Lj$/util/y;->a:Lj$/util/z;

    invoke-interface {v0}, Lj$/util/H;->trySplit()Lj$/util/H;

    move-result-object v0

    invoke-static {v0}, Lj$/util/G;->a(Lj$/util/H;)Ljava/util/Spliterator;

    move-result-object v0

    return-object v0
.end method
