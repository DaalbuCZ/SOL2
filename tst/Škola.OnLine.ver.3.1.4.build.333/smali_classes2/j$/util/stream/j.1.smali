.class public final synthetic Lj$/util/stream/j;
.super Ljava/lang/Object;


# instance fields
.field final synthetic a:Ljava/util/stream/Collector;


# direct methods
.method private synthetic constructor <init>(Ljava/util/stream/Collector;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj$/util/stream/j;->a:Ljava/util/stream/Collector;

    return-void
.end method

.method public static synthetic b(Ljava/util/stream/Collector;)Lj$/util/stream/j;
    .locals 1

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    new-instance v0, Lj$/util/stream/j;

    invoke-direct {v0, p0}, Lj$/util/stream/j;-><init>(Ljava/util/stream/Collector;)V

    return-object v0
.end method


# virtual methods
.method public a()Ljava/util/Set;
    .locals 1

    iget-object v0, p0, Lj$/util/stream/j;->a:Ljava/util/stream/Collector;

    invoke-interface {v0}, Ljava/util/stream/Collector;->characteristics()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method
