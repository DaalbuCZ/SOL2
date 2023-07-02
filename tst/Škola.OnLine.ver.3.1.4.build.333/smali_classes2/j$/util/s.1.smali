.class public final synthetic Lj$/util/s;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/util/PrimitiveIterator$OfInt;


# instance fields
.field final synthetic a:Lj$/util/t;


# direct methods
.method private synthetic constructor <init>(Lj$/util/t;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj$/util/s;->a:Lj$/util/t;

    return-void
.end method

.method public static synthetic a(Lj$/util/t;)Ljava/util/PrimitiveIterator$OfInt;
    .locals 1

    new-instance v0, Lj$/util/s;

    invoke-direct {v0, p0}, Lj$/util/s;-><init>(Lj$/util/t;)V

    return-object v0
.end method


# virtual methods
.method public synthetic forEachRemaining(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lj$/util/s;->a:Lj$/util/t;

    check-cast v0, Lj$/util/J;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1
    check-cast p1, Lj$/util/function/m;

    invoke-virtual {v0, p1}, Lj$/util/J;->a(Lj$/util/function/m;)V

    return-void
.end method

.method public synthetic forEachRemaining(Ljava/util/function/Consumer;)V
    .locals 1

    iget-object v0, p0, Lj$/util/s;->a:Lj$/util/t;

    invoke-static {p1}, Lj$/util/function/Consumer$VivifiedWrapper;->convert(Ljava/util/function/Consumer;)Lj$/util/function/Consumer;

    move-result-object p1

    check-cast v0, Lj$/util/J;

    invoke-virtual {v0, p1}, Lj$/util/J;->forEachRemaining(Lj$/util/function/Consumer;)V

    return-void
.end method

.method public synthetic forEachRemaining(Ljava/util/function/IntConsumer;)V
    .locals 1

    iget-object v0, p0, Lj$/util/s;->a:Lj$/util/t;

    invoke-static {p1}, Lj$/util/function/l;->a(Ljava/util/function/IntConsumer;)Lj$/util/function/m;

    move-result-object p1

    check-cast v0, Lj$/util/J;

    invoke-virtual {v0, p1}, Lj$/util/J;->a(Lj$/util/function/m;)V

    return-void
.end method

.method public synthetic hasNext()Z
    .locals 1

    iget-object v0, p0, Lj$/util/s;->a:Lj$/util/t;

    check-cast v0, Lj$/util/J;

    invoke-virtual {v0}, Lj$/util/J;->hasNext()Z

    move-result v0

    return v0
.end method

.method public synthetic next()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lj$/util/s;->a:Lj$/util/t;

    check-cast v0, Lj$/util/J;

    invoke-virtual {v0}, Lj$/util/J;->next()Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public synthetic next()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lj$/util/s;->a:Lj$/util/t;

    check-cast v0, Lj$/util/J;

    invoke-virtual {v0}, Lj$/util/J;->next()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public synthetic nextInt()I
    .locals 1

    iget-object v0, p0, Lj$/util/s;->a:Lj$/util/t;

    check-cast v0, Lj$/util/J;

    invoke-virtual {v0}, Lj$/util/J;->nextInt()I

    move-result v0

    return v0
.end method

.method public synthetic remove()V
    .locals 1

    iget-object v0, p0, Lj$/util/s;->a:Lj$/util/t;

    check-cast v0, Lj$/util/J;

    invoke-virtual {v0}, Lj$/util/J;->remove()V

    return-void
.end method
