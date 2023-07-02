.class final Ln7/b$a;
.super Lk7/w;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ln7/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Lk7/w<",
        "Ljava/util/Collection<",
        "TE;>;>;"
    }
.end annotation


# instance fields
.field private final a:Lk7/w;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lk7/w<",
            "TE;>;"
        }
    .end annotation
.end field

.field private final b:Lm7/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lm7/i<",
            "+",
            "Ljava/util/Collection<",
            "TE;>;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lk7/e;Ljava/lang/reflect/Type;Lk7/w;Lm7/i;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lk7/e;",
            "Ljava/lang/reflect/Type;",
            "Lk7/w<",
            "TE;>;",
            "Lm7/i<",
            "+",
            "Ljava/util/Collection<",
            "TE;>;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Lk7/w;-><init>()V

    new-instance v0, Ln7/m;

    invoke-direct {v0, p1, p3, p2}, Ln7/m;-><init>(Lk7/e;Lk7/w;Ljava/lang/reflect/Type;)V

    iput-object v0, p0, Ln7/b$a;->a:Lk7/w;

    iput-object p4, p0, Ln7/b$a;->b:Lm7/i;

    return-void
.end method


# virtual methods
.method public bridge synthetic c(Ls7/a;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Ln7/b$a;->f(Ls7/a;)Ljava/util/Collection;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic e(Ls7/c;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Ljava/util/Collection;

    invoke-virtual {p0, p1, p2}, Ln7/b$a;->g(Ls7/c;Ljava/util/Collection;)V

    return-void
.end method

.method public f(Ls7/a;)Ljava/util/Collection;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ls7/a;",
            ")",
            "Ljava/util/Collection<",
            "TE;>;"
        }
    .end annotation

    invoke-virtual {p1}, Ls7/a;->Z()Ls7/b;

    move-result-object v0

    sget-object v1, Ls7/b;->v:Ls7/b;

    if-ne v0, v1, :cond_0

    invoke-virtual {p1}, Ls7/a;->V()V

    const/4 p1, 0x0

    return-object p1

    :cond_0
    iget-object v0, p0, Ln7/b$a;->b:Lm7/i;

    invoke-interface {v0}, Lm7/i;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    invoke-virtual {p1}, Ls7/a;->a()V

    :goto_0
    invoke-virtual {p1}, Ls7/a;->v()Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Ln7/b$a;->a:Lk7/w;

    invoke-virtual {v1, p1}, Lk7/w;->c(Ls7/a;)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Ls7/a;->l()V

    return-object v0
.end method

.method public g(Ls7/c;Ljava/util/Collection;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ls7/c;",
            "Ljava/util/Collection<",
            "TE;>;)V"
        }
    .end annotation

    if-nez p2, :cond_0

    invoke-virtual {p1}, Ls7/c;->F()Ls7/c;

    return-void

    :cond_0
    invoke-virtual {p1}, Ls7/c;->c()Ls7/c;

    invoke-interface {p2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, Ln7/b$a;->a:Lk7/w;

    invoke-virtual {v1, p1, v0}, Lk7/w;->e(Ls7/c;Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Ls7/c;->l()Ls7/c;

    return-void
.end method
