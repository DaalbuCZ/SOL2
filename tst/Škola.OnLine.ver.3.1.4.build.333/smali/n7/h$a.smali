.class final Ln7/h$a;
.super Lk7/w;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ln7/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Lk7/w<",
        "Ljava/util/Map<",
        "TK;TV;>;>;"
    }
.end annotation


# instance fields
.field private final a:Lk7/w;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lk7/w<",
            "TK;>;"
        }
    .end annotation
.end field

.field private final b:Lk7/w;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lk7/w<",
            "TV;>;"
        }
    .end annotation
.end field

.field private final c:Lm7/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lm7/i<",
            "+",
            "Ljava/util/Map<",
            "TK;TV;>;>;"
        }
    .end annotation
.end field

.field final synthetic d:Ln7/h;


# direct methods
.method public constructor <init>(Ln7/h;Lk7/e;Ljava/lang/reflect/Type;Lk7/w;Ljava/lang/reflect/Type;Lk7/w;Lm7/i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lk7/e;",
            "Ljava/lang/reflect/Type;",
            "Lk7/w<",
            "TK;>;",
            "Ljava/lang/reflect/Type;",
            "Lk7/w<",
            "TV;>;",
            "Lm7/i<",
            "+",
            "Ljava/util/Map<",
            "TK;TV;>;>;)V"
        }
    .end annotation

    iput-object p1, p0, Ln7/h$a;->d:Ln7/h;

    invoke-direct {p0}, Lk7/w;-><init>()V

    new-instance p1, Ln7/m;

    invoke-direct {p1, p2, p4, p3}, Ln7/m;-><init>(Lk7/e;Lk7/w;Ljava/lang/reflect/Type;)V

    iput-object p1, p0, Ln7/h$a;->a:Lk7/w;

    new-instance p1, Ln7/m;

    invoke-direct {p1, p2, p6, p5}, Ln7/m;-><init>(Lk7/e;Lk7/w;Ljava/lang/reflect/Type;)V

    iput-object p1, p0, Ln7/h$a;->b:Lk7/w;

    iput-object p7, p0, Ln7/h$a;->c:Lm7/i;

    return-void
.end method

.method private f(Lk7/k;)Ljava/lang/String;
    .locals 1

    invoke-virtual {p1}, Lk7/k;->x()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p1}, Lk7/k;->h()Lk7/p;

    move-result-object p1

    invoke-virtual {p1}, Lk7/p;->J()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lk7/p;->G()Ljava/lang/Number;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {p1}, Lk7/p;->H()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lk7/p;->C()Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->toString(Z)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_1
    invoke-virtual {p1}, Lk7/p;->K()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Lk7/p;->k()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_2
    new-instance p1, Ljava/lang/AssertionError;

    invoke-direct {p1}, Ljava/lang/AssertionError;-><init>()V

    throw p1

    :cond_3
    invoke-virtual {p1}, Lk7/k;->s()Z

    move-result p1

    if-eqz p1, :cond_4

    const-string p1, "null"

    return-object p1

    :cond_4
    new-instance p1, Ljava/lang/AssertionError;

    invoke-direct {p1}, Ljava/lang/AssertionError;-><init>()V

    throw p1
.end method


# virtual methods
.method public bridge synthetic c(Ls7/a;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Ln7/h$a;->g(Ls7/a;)Ljava/util/Map;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic e(Ls7/c;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Ljava/util/Map;

    invoke-virtual {p0, p1, p2}, Ln7/h$a;->h(Ls7/c;Ljava/util/Map;)V

    return-void
.end method

.method public g(Ls7/a;)Ljava/util/Map;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ls7/a;",
            ")",
            "Ljava/util/Map<",
            "TK;TV;>;"
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
    iget-object v1, p0, Ln7/h$a;->c:Lm7/i;

    invoke-interface {v1}, Lm7/i;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map;

    sget-object v2, Ls7/b;->n:Ls7/b;

    const-string v3, "duplicate key: "

    if-ne v0, v2, :cond_3

    invoke-virtual {p1}, Ls7/a;->a()V

    :goto_0
    invoke-virtual {p1}, Ls7/a;->v()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Ls7/a;->a()V

    iget-object v0, p0, Ln7/h$a;->a:Lk7/w;

    invoke-virtual {v0, p1}, Lk7/w;->c(Ls7/a;)Ljava/lang/Object;

    move-result-object v0

    iget-object v2, p0, Ln7/h$a;->b:Lk7/w;

    invoke-virtual {v2, p1}, Lk7/w;->c(Ls7/a;)Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_1

    invoke-virtual {p1}, Ls7/a;->l()V

    goto :goto_0

    :cond_1
    new-instance p1, Lk7/s;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Lk7/s;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-virtual {p1}, Ls7/a;->l()V

    goto :goto_2

    :cond_3
    invoke-virtual {p1}, Ls7/a;->b()V

    :goto_1
    invoke-virtual {p1}, Ls7/a;->v()Z

    move-result v0

    if-eqz v0, :cond_5

    sget-object v0, Lm7/f;->a:Lm7/f;

    invoke-virtual {v0, p1}, Lm7/f;->a(Ls7/a;)V

    iget-object v0, p0, Ln7/h$a;->a:Lk7/w;

    invoke-virtual {v0, p1}, Lk7/w;->c(Ls7/a;)Ljava/lang/Object;

    move-result-object v0

    iget-object v2, p0, Ln7/h$a;->b:Lk7/w;

    invoke-virtual {v2, p1}, Lk7/w;->c(Ls7/a;)Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_4

    goto :goto_1

    :cond_4
    new-instance p1, Lk7/s;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Lk7/s;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    invoke-virtual {p1}, Ls7/a;->n()V

    :goto_2
    return-object v1
.end method

.method public h(Ls7/c;Ljava/util/Map;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ls7/c;",
            "Ljava/util/Map<",
            "TK;TV;>;)V"
        }
    .end annotation

    if-nez p2, :cond_0

    invoke-virtual {p1}, Ls7/c;->F()Ls7/c;

    return-void

    :cond_0
    iget-object v0, p0, Ln7/h$a;->d:Ln7/h;

    iget-boolean v0, v0, Ln7/h;->o:Z

    if-nez v0, :cond_2

    invoke-virtual {p1}, Ls7/c;->e()Ls7/c;

    invoke-interface {p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ls7/c;->x(Ljava/lang/String;)Ls7/c;

    iget-object v1, p0, Ln7/h$a;->b:Lk7/w;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v1, p1, v0}, Lk7/w;->e(Ls7/c;Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Ls7/c;->n()Ls7/c;

    return-void

    :cond_2
    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p2}, Ljava/util/Map;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    new-instance v1, Ljava/util/ArrayList;

    invoke-interface {p2}, Ljava/util/Map;->size()I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p2

    const/4 v2, 0x0

    move v3, v2

    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Map$Entry;

    iget-object v5, p0, Ln7/h$a;->a:Lk7/w;

    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {v5, v6}, Lk7/w;->d(Ljava/lang/Object;)Lk7/k;

    move-result-object v5

    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    invoke-interface {v1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {v5}, Lk7/k;->l()Z

    move-result v4

    if-nez v4, :cond_4

    invoke-virtual {v5}, Lk7/k;->v()Z

    move-result v4

    if-eqz v4, :cond_3

    goto :goto_2

    :cond_3
    move v4, v2

    goto :goto_3

    :cond_4
    :goto_2
    const/4 v4, 0x1

    :goto_3
    or-int/2addr v3, v4

    goto :goto_1

    :cond_5
    if-eqz v3, :cond_7

    invoke-virtual {p1}, Ls7/c;->c()Ls7/c;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result p2

    :goto_4
    if-ge v2, p2, :cond_6

    invoke-virtual {p1}, Ls7/c;->c()Ls7/c;

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lk7/k;

    invoke-static {v3, p1}, Lm7/l;->b(Lk7/k;Ls7/c;)V

    iget-object v3, p0, Ln7/h$a;->b:Lk7/w;

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v3, p1, v4}, Lk7/w;->e(Ls7/c;Ljava/lang/Object;)V

    invoke-virtual {p1}, Ls7/c;->l()Ls7/c;

    add-int/lit8 v2, v2, 0x1

    goto :goto_4

    :cond_6
    invoke-virtual {p1}, Ls7/c;->l()Ls7/c;

    goto :goto_6

    :cond_7
    invoke-virtual {p1}, Ls7/c;->e()Ls7/c;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result p2

    :goto_5
    if-ge v2, p2, :cond_8

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lk7/k;

    invoke-direct {p0, v3}, Ln7/h$a;->f(Lk7/k;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v3}, Ls7/c;->x(Ljava/lang/String;)Ls7/c;

    iget-object v3, p0, Ln7/h$a;->b:Lk7/w;

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v3, p1, v4}, Lk7/w;->e(Ls7/c;Ljava/lang/Object;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_5

    :cond_8
    invoke-virtual {p1}, Ls7/c;->n()Ls7/c;

    :goto_6
    return-void
.end method
