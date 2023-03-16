.class public final Lb9/c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lb9/g;
.implements Ljava/io/Serializable;


# instance fields
.field private final n:Lb9/g;

.field private final o:Lb9/g$b;


# direct methods
.method public constructor <init>(Lb9/g;Lb9/g$b;)V
    .locals 1

    const-string v0, "left"

    invoke-static {p1, v0}, Lk9/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "element"

    invoke-static {p2, v0}, Lk9/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb9/c;->n:Lb9/g;

    iput-object p2, p0, Lb9/c;->o:Lb9/g$b;

    return-void
.end method

.method private final b(Lb9/g$b;)Z
    .locals 1

    invoke-interface {p1}, Lb9/g$b;->getKey()Lb9/g$c;

    move-result-object v0

    invoke-virtual {p0, v0}, Lb9/c;->c(Lb9/g$c;)Lb9/g$b;

    move-result-object v0

    invoke-static {v0, p1}, Lk9/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method private final d(Lb9/c;)Z
    .locals 1

    :goto_0
    iget-object v0, p1, Lb9/c;->o:Lb9/g$b;

    invoke-direct {p0, v0}, Lb9/c;->b(Lb9/g$b;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    iget-object p1, p1, Lb9/c;->n:Lb9/g;

    instance-of v0, p1, Lb9/c;

    if-eqz v0, :cond_1

    check-cast p1, Lb9/c;

    goto :goto_0

    :cond_1
    const-string v0, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element"

    invoke-static {p1, v0}, Lk9/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lb9/g$b;

    invoke-direct {p0, p1}, Lb9/c;->b(Lb9/g$b;)Z

    move-result p1

    return p1
.end method

.method private final e()I
    .locals 3

    const/4 v0, 0x2

    move-object v1, p0

    :goto_0
    iget-object v1, v1, Lb9/c;->n:Lb9/g;

    instance-of v2, v1, Lb9/c;

    if-eqz v2, :cond_0

    check-cast v1, Lb9/c;

    goto :goto_1

    :cond_0
    const/4 v1, 0x0

    :goto_1
    if-nez v1, :cond_1

    return v0

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method


# virtual methods
.method public B(Lb9/g$c;)Lb9/g;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb9/g$c<",
            "*>;)",
            "Lb9/g;"
        }
    .end annotation

    const-string v0, "key"

    invoke-static {p1, v0}, Lk9/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lb9/c;->o:Lb9/g$b;

    invoke-interface {v0, p1}, Lb9/g$b;->c(Lb9/g$c;)Lb9/g$b;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object p1, p0, Lb9/c;->n:Lb9/g;

    return-object p1

    :cond_0
    iget-object v0, p0, Lb9/c;->n:Lb9/g;

    invoke-interface {v0, p1}, Lb9/g;->B(Lb9/g$c;)Lb9/g;

    move-result-object p1

    iget-object v0, p0, Lb9/c;->n:Lb9/g;

    if-ne p1, v0, :cond_1

    move-object p1, p0

    goto :goto_0

    :cond_1
    sget-object v0, Lb9/h;->n:Lb9/h;

    if-ne p1, v0, :cond_2

    iget-object p1, p0, Lb9/c;->o:Lb9/g$b;

    goto :goto_0

    :cond_2
    new-instance v0, Lb9/c;

    iget-object v1, p0, Lb9/c;->o:Lb9/g$b;

    invoke-direct {v0, p1, v1}, Lb9/c;-><init>(Lb9/g;Lb9/g$b;)V

    move-object p1, v0

    :goto_0
    return-object p1
.end method

.method public S(Ljava/lang/Object;Lj9/p;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(TR;",
            "Lj9/p<",
            "-TR;-",
            "Lb9/g$b;",
            "+TR;>;)TR;"
        }
    .end annotation

    const-string v0, "operation"

    invoke-static {p2, v0}, Lk9/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lb9/c;->n:Lb9/g;

    invoke-interface {v0, p1, p2}, Lb9/g;->S(Ljava/lang/Object;Lj9/p;)Ljava/lang/Object;

    move-result-object p1

    iget-object v0, p0, Lb9/c;->o:Lb9/g$b;

    invoke-interface {p2, p1, v0}, Lj9/p;->k(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public c(Lb9/g$c;)Lb9/g$b;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E::",
            "Lb9/g$b;",
            ">(",
            "Lb9/g$c<",
            "TE;>;)TE;"
        }
    .end annotation

    const-string v0, "key"

    invoke-static {p1, v0}, Lk9/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, p0

    :goto_0
    iget-object v1, v0, Lb9/c;->o:Lb9/g$b;

    invoke-interface {v1, p1}, Lb9/g$b;->c(Lb9/g$c;)Lb9/g$b;

    move-result-object v1

    if-eqz v1, :cond_0

    return-object v1

    :cond_0
    iget-object v0, v0, Lb9/c;->n:Lb9/g;

    instance-of v1, v0, Lb9/c;

    if-eqz v1, :cond_1

    check-cast v0, Lb9/c;

    goto :goto_0

    :cond_1
    invoke-interface {v0, p1}, Lb9/g;->c(Lb9/g$c;)Lb9/g$b;

    move-result-object p1

    return-object p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2

    if-eq p0, p1, :cond_1

    instance-of v0, p1, Lb9/c;

    if-eqz v0, :cond_0

    check-cast p1, Lb9/c;

    invoke-direct {p1}, Lb9/c;->e()I

    move-result v0

    invoke-direct {p0}, Lb9/c;->e()I

    move-result v1

    if-ne v0, v1, :cond_0

    invoke-direct {p1, p0}, Lb9/c;->d(Lb9/c;)Z

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
    .locals 2

    iget-object v0, p0, Lb9/c;->n:Lb9/g;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    iget-object v1, p0, Lb9/c;->o:Lb9/g$b;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public j(Lb9/g;)Lb9/g;
    .locals 0

    invoke-static {p0, p1}, Lb9/g$a;->a(Lb9/g;Lb9/g;)Lb9/g;

    move-result-object p1

    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v1, 0x5b

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    sget-object v1, Lb9/c$a;->o:Lb9/c$a;

    const-string v2, ""

    invoke-virtual {p0, v2, v1}, Lb9/c;->S(Ljava/lang/Object;Lj9/p;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x5d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
