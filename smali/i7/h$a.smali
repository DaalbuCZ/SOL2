.class final Li7/h$a;
.super Lf7/w;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Li7/h;
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
        "Lf7/w<",
        "Ljava/util/Map<",
        "TK;TV;>;>;"
    }
.end annotation


# instance fields
.field private final a:Lf7/w;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lf7/w<",
            "TK;>;"
        }
    .end annotation
.end field

.field private final b:Lf7/w;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lf7/w<",
            "TV;>;"
        }
    .end annotation
.end field

.field private final c:Lh7/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lh7/i<",
            "+",
            "Ljava/util/Map<",
            "TK;TV;>;>;"
        }
    .end annotation
.end field

.field final synthetic d:Li7/h;


# direct methods
.method public constructor <init>(Li7/h;Lf7/e;Ljava/lang/reflect/Type;Lf7/w;Ljava/lang/reflect/Type;Lf7/w;Lh7/i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lf7/e;",
            "Ljava/lang/reflect/Type;",
            "Lf7/w<",
            "TK;>;",
            "Ljava/lang/reflect/Type;",
            "Lf7/w<",
            "TV;>;",
            "Lh7/i<",
            "+",
            "Ljava/util/Map<",
            "TK;TV;>;>;)V"
        }
    .end annotation

    iput-object p1, p0, Li7/h$a;->d:Li7/h;

    invoke-direct {p0}, Lf7/w;-><init>()V

    new-instance p1, Li7/m;

    invoke-direct {p1, p2, p4, p3}, Li7/m;-><init>(Lf7/e;Lf7/w;Ljava/lang/reflect/Type;)V

    iput-object p1, p0, Li7/h$a;->a:Lf7/w;

    new-instance p1, Li7/m;

    invoke-direct {p1, p2, p6, p5}, Li7/m;-><init>(Lf7/e;Lf7/w;Ljava/lang/reflect/Type;)V

    iput-object p1, p0, Li7/h$a;->b:Lf7/w;

    iput-object p7, p0, Li7/h$a;->c:Lh7/i;

    return-void
.end method

.method private f(Lf7/k;)Ljava/lang/String;
    .locals 1

    invoke-virtual {p1}, Lf7/k;->x()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p1}, Lf7/k;->h()Lf7/p;

    move-result-object p1

    invoke-virtual {p1}, Lf7/p;->J()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lf7/p;->G()Ljava/lang/Number;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {p1}, Lf7/p;->H()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lf7/p;->C()Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->toString(Z)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_1
    invoke-virtual {p1}, Lf7/p;->K()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Lf7/p;->k()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_2
    new-instance p1, Ljava/lang/AssertionError;

    invoke-direct {p1}, Ljava/lang/AssertionError;-><init>()V

    throw p1

    :cond_3
    invoke-virtual {p1}, Lf7/k;->s()Z

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
.method public bridge synthetic c(Ln7/a;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Li7/h$a;->g(Ln7/a;)Ljava/util/Map;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic e(Ln7/c;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Ljava/util/Map;

    invoke-virtual {p0, p1, p2}, Li7/h$a;->h(Ln7/c;Ljava/util/Map;)V

    return-void
.end method

.method public g(Ln7/a;)Ljava/util/Map;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln7/a;",
            ")",
            "Ljava/util/Map<",
            "TK;TV;>;"
        }
    .end annotation

    invoke-virtual {p1}, Ln7/a;->Z()Ln7/b;

    move-result-object v0

    sget-object v1, Ln7/b;->v:Ln7/b;

    if-ne v0, v1, :cond_0

    invoke-virtual {p1}, Ln7/a;->S()V

    const/4 p1, 0x0

    return-object p1

    :cond_0
    iget-object v1, p0, Li7/h$a;->c:Lh7/i;

    invoke-interface {v1}, Lh7/i;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map;

    sget-object v2, Ln7/b;->n:Ln7/b;

    const-string v3, "duplicate key: "

    if-ne v0, v2, :cond_3

    invoke-virtual {p1}, Ln7/a;->a()V

    :goto_0
    invoke-virtual {p1}, Ln7/a;->r()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Ln7/a;->a()V

    iget-object v0, p0, Li7/h$a;->a:Lf7/w;

    invoke-virtual {v0, p1}, Lf7/w;->c(Ln7/a;)Ljava/lang/Object;

    move-result-object v0

    iget-object v2, p0, Li7/h$a;->b:Lf7/w;

    invoke-virtual {v2, p1}, Lf7/w;->c(Ln7/a;)Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_1

    invoke-virtual {p1}, Ln7/a;->k()V

    goto :goto_0

    :cond_1
    new-instance p1, Lf7/s;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Lf7/s;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-virtual {p1}, Ln7/a;->k()V

    goto :goto_2

    :cond_3
    invoke-virtual {p1}, Ln7/a;->b()V

    :goto_1
    invoke-virtual {p1}, Ln7/a;->r()Z

    move-result v0

    if-eqz v0, :cond_5

    sget-object v0, Lh7/f;->a:Lh7/f;

    invoke-virtual {v0, p1}, Lh7/f;->a(Ln7/a;)V

    iget-object v0, p0, Li7/h$a;->a:Lf7/w;

    invoke-virtual {v0, p1}, Lf7/w;->c(Ln7/a;)Ljava/lang/Object;

    move-result-object v0

    iget-object v2, p0, Li7/h$a;->b:Lf7/w;

    invoke-virtual {v2, p1}, Lf7/w;->c(Ln7/a;)Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_4

    goto :goto_1

    :cond_4
    new-instance p1, Lf7/s;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Lf7/s;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    invoke-virtual {p1}, Ln7/a;->o()V

    :goto_2
    return-object v1
.end method

.method public h(Ln7/c;Ljava/util/Map;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln7/c;",
            "Ljava/util/Map<",
            "TK;TV;>;)V"
        }
    .end annotation

    if-nez p2, :cond_0

    invoke-virtual {p1}, Ln7/c;->D()Ln7/c;

    return-void

    :cond_0
    iget-object v0, p0, Li7/h$a;->d:Li7/h;

    iget-boolean v0, v0, Li7/h;->o:Z

    if-nez v0, :cond_2

    invoke-virtual {p1}, Ln7/c;->f()Ln7/c;

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

    invoke-virtual {p1, v1}, Ln7/c;->y(Ljava/lang/String;)Ln7/c;

    iget-object v1, p0, Li7/h$a;->b:Lf7/w;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v1, p1, v0}, Lf7/w;->e(Ln7/c;Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Ln7/c;->o()Ln7/c;

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

    iget-object v5, p0, Li7/h$a;->a:Lf7/w;

    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {v5, v6}, Lf7/w;->d(Ljava/lang/Object;)Lf7/k;

    move-result-object v5

    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    invoke-interface {v1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {v5}, Lf7/k;->l()Z

    move-result v4

    if-nez v4, :cond_4

    invoke-virtual {v5}, Lf7/k;->v()Z

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

    invoke-virtual {p1}, Ln7/c;->c()Ln7/c;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result p2

    :goto_4
    if-ge v2, p2, :cond_6

    invoke-virtual {p1}, Ln7/c;->c()Ln7/c;

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lf7/k;

    invoke-static {v3, p1}, Lh7/l;->b(Lf7/k;Ln7/c;)V

    iget-object v3, p0, Li7/h$a;->b:Lf7/w;

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v3, p1, v4}, Lf7/w;->e(Ln7/c;Ljava/lang/Object;)V

    invoke-virtual {p1}, Ln7/c;->k()Ln7/c;

    add-int/lit8 v2, v2, 0x1

    goto :goto_4

    :cond_6
    invoke-virtual {p1}, Ln7/c;->k()Ln7/c;

    goto :goto_6

    :cond_7
    invoke-virtual {p1}, Ln7/c;->f()Ln7/c;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result p2

    :goto_5
    if-ge v2, p2, :cond_8

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lf7/k;

    invoke-direct {p0, v3}, Li7/h$a;->f(Lf7/k;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v3}, Ln7/c;->y(Ljava/lang/String;)Ln7/c;

    iget-object v3, p0, Li7/h$a;->b:Lf7/w;

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v3, p1, v4}, Lf7/w;->e(Ln7/c;Ljava/lang/Object;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_5

    :cond_8
    invoke-virtual {p1}, Ln7/c;->o()Ln7/c;

    :goto_6
    return-void
.end method
