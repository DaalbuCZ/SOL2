.class public final synthetic Lj$/util/v;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/util/PrimitiveIterator$OfLong;


# instance fields
.field final synthetic a:Lj$/util/w;


# direct methods
.method private synthetic constructor <init>(Lj$/util/w;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj$/util/v;->a:Lj$/util/w;

    return-void
.end method

.method public static synthetic a(Lj$/util/w;)Ljava/util/PrimitiveIterator$OfLong;
    .locals 1

    new-instance v0, Lj$/util/v;

    invoke-direct {v0, p0}, Lj$/util/v;-><init>(Lj$/util/w;)V

    return-object v0
.end method


# virtual methods
.method public synthetic forEachRemaining(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lj$/util/v;->a:Lj$/util/w;

    check-cast v0, Lj$/util/K;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1
    check-cast p1, Lj$/util/function/r;

    invoke-virtual {v0, p1}, Lj$/util/K;->a(Lj$/util/function/r;)V

    return-void
.end method

.method public synthetic forEachRemaining(Ljava/util/function/Consumer;)V
    .locals 1

    iget-object v0, p0, Lj$/util/v;->a:Lj$/util/w;

    invoke-static {p1}, Lj$/util/function/Consumer$VivifiedWrapper;->convert(Ljava/util/function/Consumer;)Lj$/util/function/Consumer;

    move-result-object p1

    check-cast v0, Lj$/util/K;

    invoke-virtual {v0, p1}, Lj$/util/K;->forEachRemaining(Lj$/util/function/Consumer;)V

    return-void
.end method

.method public synthetic forEachRemaining(Ljava/util/function/LongConsumer;)V
    .locals 1

    iget-object v0, p0, Lj$/util/v;->a:Lj$/util/w;

    invoke-static {p1}, Lj$/util/function/q;->a(Ljava/util/function/LongConsumer;)Lj$/util/function/r;

    move-result-object p1

    check-cast v0, Lj$/util/K;

    invoke-virtual {v0, p1}, Lj$/util/K;->a(Lj$/util/function/r;)V

    return-void
.end method

.method public synthetic hasNext()Z
    .locals 1

    iget-object v0, p0, Lj$/util/v;->a:Lj$/util/w;

    check-cast v0, Lj$/util/K;

    invoke-virtual {v0}, Lj$/util/K;->hasNext()Z

    move-result v0

    return v0
.end method

.method public synthetic next()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Lj$/util/v;->a:Lj$/util/w;

    check-cast v0, Lj$/util/K;

    invoke-virtual {v0}, Lj$/util/K;->next()Ljava/lang/Long;

    move-result-object v0

    return-object v0
.end method

.method public synthetic next()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lj$/util/v;->a:Lj$/util/w;

    check-cast v0, Lj$/util/K;

    invoke-virtual {v0}, Lj$/util/K;->next()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public synthetic nextLong()J
    .locals 2

    iget-object v0, p0, Lj$/util/v;->a:Lj$/util/w;

    check-cast v0, Lj$/util/K;

    invoke-virtual {v0}, Lj$/util/K;->nextLong()J

    move-result-wide v0

    return-wide v0
.end method

.method public synthetic remove()V
    .locals 1

    iget-object v0, p0, Lj$/util/v;->a:Lj$/util/w;

    check-cast v0, Lj$/util/K;

    invoke-virtual {v0}, Lj$/util/K;->remove()V

    return-void
.end method
