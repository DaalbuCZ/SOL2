.class public final Ly/b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroidx/lifecycle/b0$b;


# instance fields
.field private final b:[Ly/f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Ly/f<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method public varargs constructor <init>([Ly/f;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ly/f<",
            "*>;)V"
        }
    .end annotation

    const-string v0, "initializers"

    invoke-static {p1, v0}, Ls9/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly/b;->b:[Ly/f;

    return-void
.end method


# virtual methods
.method public synthetic a(Ljava/lang/Class;)Landroidx/lifecycle/a0;
    .locals 0

    invoke-static {p0, p1}, Landroidx/lifecycle/c0;->a(Landroidx/lifecycle/b0$b;Ljava/lang/Class;)Landroidx/lifecycle/a0;

    move-result-object p1

    return-object p1
.end method

.method public b(Ljava/lang/Class;Ly/a;)Landroidx/lifecycle/a0;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Landroidx/lifecycle/a0;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;",
            "Ly/a;",
            ")TT;"
        }
    .end annotation

    const-string v0, "modelClass"

    invoke-static {p1, v0}, Ls9/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "extras"

    invoke-static {p2, v0}, Ls9/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ly/b;->b:[Ly/f;

    array-length v1, v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v4, v2

    :goto_0
    if-ge v3, v1, :cond_2

    aget-object v5, v0, v3

    invoke-virtual {v5}, Ly/f;->a()Ljava/lang/Class;

    move-result-object v6

    invoke-static {v6, p1}, Ls9/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    invoke-virtual {v5}, Ly/f;->b()Lr9/l;

    move-result-object v4

    invoke-interface {v4, p2}, Lr9/l;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    instance-of v5, v4, Landroidx/lifecycle/a0;

    if-eqz v5, :cond_0

    check-cast v4, Landroidx/lifecycle/a0;

    goto :goto_1

    :cond_0
    move-object v4, v2

    :cond_1
    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    if-eqz v4, :cond_3

    return-object v4

    :cond_3
    new-instance p2, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "No initializer set for given class "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method
