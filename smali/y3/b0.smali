.class public final Ly3/b0;
.super Ljava/lang/Object;
.source ""


# instance fields
.field private final a:Lm/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lm/a<",
            "Ly3/b<",
            "*>;",
            "Lw3/b;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Lm/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lm/a<",
            "Ly3/b<",
            "*>;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Lt4/j;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lt4/j<",
            "Ljava/util/Map<",
            "Ly3/b<",
            "*>;",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end field

.field private d:I

.field private e:Z


# virtual methods
.method public final a()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ly3/b<",
            "*>;>;"
        }
    .end annotation

    iget-object v0, p0, Ly3/b0;->a:Lm/a;

    invoke-virtual {v0}, Lm/a;->keySet()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public final b(Ly3/b;Lw3/b;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ly3/b<",
            "*>;",
            "Lw3/b;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    iget-object v0, p0, Ly3/b0;->a:Lm/a;

    invoke-virtual {v0, p1, p2}, Lm/g;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Ly3/b0;->b:Lm/a;

    invoke-virtual {v0, p1, p3}, Lm/g;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget p1, p0, Ly3/b0;->d:I

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, Ly3/b0;->d:I

    invoke-virtual {p2}, Lw3/b;->C()Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    iput-boolean p1, p0, Ly3/b0;->e:Z

    :cond_0
    iget p1, p0, Ly3/b0;->d:I

    if-nez p1, :cond_2

    iget-boolean p1, p0, Ly3/b0;->e:Z

    if-eqz p1, :cond_1

    new-instance p1, Lx3/c;

    iget-object p2, p0, Ly3/b0;->a:Lm/a;

    invoke-direct {p1, p2}, Lx3/c;-><init>(Lm/a;)V

    iget-object p2, p0, Ly3/b0;->c:Lt4/j;

    invoke-virtual {p2, p1}, Lt4/j;->b(Ljava/lang/Exception;)V

    return-void

    :cond_1
    iget-object p1, p0, Ly3/b0;->c:Lt4/j;

    iget-object p2, p0, Ly3/b0;->b:Lm/a;

    invoke-virtual {p1, p2}, Lt4/j;->c(Ljava/lang/Object;)V

    :cond_2
    return-void
.end method
