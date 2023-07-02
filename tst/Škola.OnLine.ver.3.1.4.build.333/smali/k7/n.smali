.class public final Lk7/n;
.super Lk7/k;
.source ""


# instance fields
.field private final a:Lm7/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lm7/h<",
            "Ljava/lang/String;",
            "Lk7/k;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lk7/k;-><init>()V

    new-instance v0, Lm7/h;

    invoke-direct {v0}, Lm7/h;-><init>()V

    iput-object v0, p0, Lk7/n;->a:Lm7/h;

    return-void
.end method


# virtual methods
.method public C(Ljava/lang/String;Lk7/k;)V
    .locals 1

    iget-object v0, p0, Lk7/n;->a:Lm7/h;

    if-nez p2, :cond_0

    sget-object p2, Lk7/m;->a:Lk7/m;

    :cond_0
    invoke-virtual {v0, p1, p2}, Lm7/h;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public D()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/util/Map$Entry<",
            "Ljava/lang/String;",
            "Lk7/k;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Lk7/n;->a:Lm7/h;

    invoke-virtual {v0}, Lm7/h;->entrySet()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public E(Ljava/lang/String;)Z
    .locals 1

    iget-object v0, p0, Lk7/n;->a:Lm7/h;

    invoke-virtual {v0, p1}, Lm7/h;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public F(Ljava/lang/String;)Lk7/k;
    .locals 1

    iget-object v0, p0, Lk7/n;->a:Lm7/h;

    invoke-virtual {v0, p1}, Lm7/h;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lk7/k;

    return-object p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    if-eq p1, p0, :cond_1

    instance-of v0, p1, Lk7/n;

    if-eqz v0, :cond_0

    check-cast p1, Lk7/n;

    iget-object p1, p1, Lk7/n;->a:Lm7/h;

    iget-object v0, p0, Lk7/n;->a:Lm7/h;

    invoke-virtual {p1, v0}, Ljava/util/AbstractMap;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lk7/n;->a:Lm7/h;

    invoke-virtual {v0}, Ljava/util/AbstractMap;->hashCode()I

    move-result v0

    return v0
.end method
