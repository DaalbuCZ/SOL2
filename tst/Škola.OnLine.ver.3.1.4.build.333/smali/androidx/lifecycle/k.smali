.class public Landroidx/lifecycle/k;
.super Landroidx/lifecycle/f;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/lifecycle/k$a;
    }
.end annotation


# instance fields
.field private b:Lm/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lm/a<",
            "Landroidx/lifecycle/i;",
            "Landroidx/lifecycle/k$a;",
            ">;"
        }
    .end annotation
.end field

.field private c:Landroidx/lifecycle/f$c;

.field private final d:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroidx/lifecycle/j;",
            ">;"
        }
    .end annotation
.end field

.field private e:I

.field private f:Z

.field private g:Z

.field private h:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroidx/lifecycle/f$c;",
            ">;"
        }
    .end annotation
.end field

.field private final i:Z


# direct methods
.method public constructor <init>(Landroidx/lifecycle/j;)V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, p1, v0}, Landroidx/lifecycle/k;-><init>(Landroidx/lifecycle/j;Z)V

    return-void
.end method

.method private constructor <init>(Landroidx/lifecycle/j;Z)V
    .locals 1

    invoke-direct {p0}, Landroidx/lifecycle/f;-><init>()V

    new-instance v0, Lm/a;

    invoke-direct {v0}, Lm/a;-><init>()V

    iput-object v0, p0, Landroidx/lifecycle/k;->b:Lm/a;

    const/4 v0, 0x0

    iput v0, p0, Landroidx/lifecycle/k;->e:I

    iput-boolean v0, p0, Landroidx/lifecycle/k;->f:Z

    iput-boolean v0, p0, Landroidx/lifecycle/k;->g:Z

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroidx/lifecycle/k;->h:Ljava/util/ArrayList;

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Landroidx/lifecycle/k;->d:Ljava/lang/ref/WeakReference;

    sget-object p1, Landroidx/lifecycle/f$c;->o:Landroidx/lifecycle/f$c;

    iput-object p1, p0, Landroidx/lifecycle/k;->c:Landroidx/lifecycle/f$c;

    iput-boolean p2, p0, Landroidx/lifecycle/k;->i:Z

    return-void
.end method

.method private d(Landroidx/lifecycle/j;)V
    .locals 5

    iget-object v0, p0, Landroidx/lifecycle/k;->b:Lm/a;

    invoke-virtual {v0}, Lm/b;->descendingIterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    iget-boolean v1, p0, Landroidx/lifecycle/k;->g:Z

    if-nez v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/lifecycle/k$a;

    :goto_0
    iget-object v3, v2, Landroidx/lifecycle/k$a;->a:Landroidx/lifecycle/f$c;

    iget-object v4, p0, Landroidx/lifecycle/k;->c:Landroidx/lifecycle/f$c;

    invoke-virtual {v3, v4}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v3

    if-lez v3, :cond_0

    iget-boolean v3, p0, Landroidx/lifecycle/k;->g:Z

    if-nez v3, :cond_0

    iget-object v3, p0, Landroidx/lifecycle/k;->b:Lm/a;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroidx/lifecycle/i;

    invoke-virtual {v3, v4}, Lm/a;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    iget-object v3, v2, Landroidx/lifecycle/k$a;->a:Landroidx/lifecycle/f$c;

    invoke-static {v3}, Landroidx/lifecycle/f$b;->e(Landroidx/lifecycle/f$c;)Landroidx/lifecycle/f$b;

    move-result-object v3

    if-eqz v3, :cond_1

    invoke-virtual {v3}, Landroidx/lifecycle/f$b;->g()Landroidx/lifecycle/f$c;

    move-result-object v4

    invoke-direct {p0, v4}, Landroidx/lifecycle/k;->n(Landroidx/lifecycle/f$c;)V

    invoke-virtual {v2, p1, v3}, Landroidx/lifecycle/k$a;->a(Landroidx/lifecycle/j;Landroidx/lifecycle/f$b;)V

    invoke-direct {p0}, Landroidx/lifecycle/k;->m()V

    goto :goto_0

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "no event down from "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, v2, Landroidx/lifecycle/k$a;->a:Landroidx/lifecycle/f$c;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    return-void
.end method

.method private e(Landroidx/lifecycle/i;)Landroidx/lifecycle/f$c;
    .locals 2

    iget-object v0, p0, Landroidx/lifecycle/k;->b:Lm/a;

    invoke-virtual {v0, p1}, Lm/a;->x(Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object p1

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/lifecycle/k$a;

    iget-object p1, p1, Landroidx/lifecycle/k$a;->a:Landroidx/lifecycle/f$c;

    goto :goto_0

    :cond_0
    move-object p1, v0

    :goto_0
    iget-object v1, p0, Landroidx/lifecycle/k;->h:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1

    iget-object v0, p0, Landroidx/lifecycle/k;->h:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/lifecycle/f$c;

    :cond_1
    iget-object v1, p0, Landroidx/lifecycle/k;->c:Landroidx/lifecycle/f$c;

    invoke-static {v1, p1}, Landroidx/lifecycle/k;->k(Landroidx/lifecycle/f$c;Landroidx/lifecycle/f$c;)Landroidx/lifecycle/f$c;

    move-result-object p1

    invoke-static {p1, v0}, Landroidx/lifecycle/k;->k(Landroidx/lifecycle/f$c;Landroidx/lifecycle/f$c;)Landroidx/lifecycle/f$c;

    move-result-object p1

    return-object p1
.end method

.method private f(Ljava/lang/String;)V
    .locals 3
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "RestrictedApi"
        }
    .end annotation

    iget-boolean v0, p0, Landroidx/lifecycle/k;->i:Z

    if-eqz v0, :cond_1

    invoke-static {}, Ll/a;->e()Ll/a;

    move-result-object v0

    invoke-virtual {v0}, Ll/a;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Method "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " must be called on the main thread"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    return-void
.end method

.method private g(Landroidx/lifecycle/j;)V
    .locals 5

    iget-object v0, p0, Landroidx/lifecycle/k;->b:Lm/a;

    invoke-virtual {v0}, Lm/b;->h()Lm/b$d;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    iget-boolean v1, p0, Landroidx/lifecycle/k;->g:Z

    if-nez v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/lifecycle/k$a;

    :goto_0
    iget-object v3, v2, Landroidx/lifecycle/k$a;->a:Landroidx/lifecycle/f$c;

    iget-object v4, p0, Landroidx/lifecycle/k;->c:Landroidx/lifecycle/f$c;

    invoke-virtual {v3, v4}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v3

    if-gez v3, :cond_0

    iget-boolean v3, p0, Landroidx/lifecycle/k;->g:Z

    if-nez v3, :cond_0

    iget-object v3, p0, Landroidx/lifecycle/k;->b:Lm/a;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroidx/lifecycle/i;

    invoke-virtual {v3, v4}, Lm/a;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    iget-object v3, v2, Landroidx/lifecycle/k$a;->a:Landroidx/lifecycle/f$c;

    invoke-direct {p0, v3}, Landroidx/lifecycle/k;->n(Landroidx/lifecycle/f$c;)V

    iget-object v3, v2, Landroidx/lifecycle/k$a;->a:Landroidx/lifecycle/f$c;

    invoke-static {v3}, Landroidx/lifecycle/f$b;->h(Landroidx/lifecycle/f$c;)Landroidx/lifecycle/f$b;

    move-result-object v3

    if-eqz v3, :cond_1

    invoke-virtual {v2, p1, v3}, Landroidx/lifecycle/k$a;->a(Landroidx/lifecycle/j;Landroidx/lifecycle/f$b;)V

    invoke-direct {p0}, Landroidx/lifecycle/k;->m()V

    goto :goto_0

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "no event up from "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, v2, Landroidx/lifecycle/k$a;->a:Landroidx/lifecycle/f$c;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    return-void
.end method

.method private i()Z
    .locals 3

    iget-object v0, p0, Landroidx/lifecycle/k;->b:Lm/a;

    invoke-virtual {v0}, Lm/b;->size()I

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, Landroidx/lifecycle/k;->b:Lm/a;

    invoke-virtual {v0}, Lm/b;->d()Ljava/util/Map$Entry;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/lifecycle/k$a;

    iget-object v0, v0, Landroidx/lifecycle/k$a;->a:Landroidx/lifecycle/f$c;

    iget-object v2, p0, Landroidx/lifecycle/k;->b:Lm/a;

    invoke-virtual {v2}, Lm/b;->k()Ljava/util/Map$Entry;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/lifecycle/k$a;

    iget-object v2, v2, Landroidx/lifecycle/k$a;->a:Landroidx/lifecycle/f$c;

    if-ne v0, v2, :cond_1

    iget-object v0, p0, Landroidx/lifecycle/k;->c:Landroidx/lifecycle/f$c;

    if-ne v0, v2, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method static k(Landroidx/lifecycle/f$c;Landroidx/lifecycle/f$c;)Landroidx/lifecycle/f$c;
    .locals 1

    if-eqz p1, :cond_0

    invoke-virtual {p1, p0}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v0

    if-gez v0, :cond_0

    move-object p0, p1

    :cond_0
    return-object p0
.end method

.method private l(Landroidx/lifecycle/f$c;)V
    .locals 2

    iget-object v0, p0, Landroidx/lifecycle/k;->c:Landroidx/lifecycle/f$c;

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    sget-object v1, Landroidx/lifecycle/f$c;->o:Landroidx/lifecycle/f$c;

    if-ne v0, v1, :cond_2

    sget-object v0, Landroidx/lifecycle/f$c;->n:Landroidx/lifecycle/f$c;

    if-eq p1, v0, :cond_1

    goto :goto_0

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "no event down from "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/lifecycle/k;->c:Landroidx/lifecycle/f$c;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    :goto_0
    iput-object p1, p0, Landroidx/lifecycle/k;->c:Landroidx/lifecycle/f$c;

    iget-boolean p1, p0, Landroidx/lifecycle/k;->f:Z

    const/4 v0, 0x1

    if-nez p1, :cond_5

    iget p1, p0, Landroidx/lifecycle/k;->e:I

    if-eqz p1, :cond_3

    goto :goto_1

    :cond_3
    iput-boolean v0, p0, Landroidx/lifecycle/k;->f:Z

    invoke-direct {p0}, Landroidx/lifecycle/k;->p()V

    const/4 p1, 0x0

    iput-boolean p1, p0, Landroidx/lifecycle/k;->f:Z

    iget-object p1, p0, Landroidx/lifecycle/k;->c:Landroidx/lifecycle/f$c;

    sget-object v0, Landroidx/lifecycle/f$c;->n:Landroidx/lifecycle/f$c;

    if-ne p1, v0, :cond_4

    new-instance p1, Lm/a;

    invoke-direct {p1}, Lm/a;-><init>()V

    iput-object p1, p0, Landroidx/lifecycle/k;->b:Lm/a;

    :cond_4
    return-void

    :cond_5
    :goto_1
    iput-boolean v0, p0, Landroidx/lifecycle/k;->g:Z

    return-void
.end method

.method private m()V
    .locals 2

    iget-object v0, p0, Landroidx/lifecycle/k;->h:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    return-void
.end method

.method private n(Landroidx/lifecycle/f$c;)V
    .locals 1

    iget-object v0, p0, Landroidx/lifecycle/k;->h:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method private p()V
    .locals 3

    iget-object v0, p0, Landroidx/lifecycle/k;->d:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/lifecycle/j;

    if-eqz v0, :cond_3

    :cond_0
    :goto_0
    invoke-direct {p0}, Landroidx/lifecycle/k;->i()Z

    move-result v1

    const/4 v2, 0x0

    iput-boolean v2, p0, Landroidx/lifecycle/k;->g:Z

    if-nez v1, :cond_2

    iget-object v1, p0, Landroidx/lifecycle/k;->c:Landroidx/lifecycle/f$c;

    iget-object v2, p0, Landroidx/lifecycle/k;->b:Lm/a;

    invoke-virtual {v2}, Lm/b;->d()Ljava/util/Map$Entry;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/lifecycle/k$a;

    iget-object v2, v2, Landroidx/lifecycle/k$a;->a:Landroidx/lifecycle/f$c;

    invoke-virtual {v1, v2}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v1

    if-gez v1, :cond_1

    invoke-direct {p0, v0}, Landroidx/lifecycle/k;->d(Landroidx/lifecycle/j;)V

    :cond_1
    iget-object v1, p0, Landroidx/lifecycle/k;->b:Lm/a;

    invoke-virtual {v1}, Lm/b;->k()Ljava/util/Map$Entry;

    move-result-object v1

    iget-boolean v2, p0, Landroidx/lifecycle/k;->g:Z

    if-nez v2, :cond_0

    if-eqz v1, :cond_0

    iget-object v2, p0, Landroidx/lifecycle/k;->c:Landroidx/lifecycle/f$c;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/lifecycle/k$a;

    iget-object v1, v1, Landroidx/lifecycle/k$a;->a:Landroidx/lifecycle/f$c;

    invoke-virtual {v2, v1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v1

    if-lez v1, :cond_0

    invoke-direct {p0, v0}, Landroidx/lifecycle/k;->g(Landroidx/lifecycle/j;)V

    goto :goto_0

    :cond_2
    return-void

    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "LifecycleOwner of this LifecycleRegistry is alreadygarbage collected. It is too late to change lifecycle state."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public a(Landroidx/lifecycle/i;)V
    .locals 6

    const-string v0, "addObserver"

    invoke-direct {p0, v0}, Landroidx/lifecycle/k;->f(Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/lifecycle/k;->c:Landroidx/lifecycle/f$c;

    sget-object v1, Landroidx/lifecycle/f$c;->n:Landroidx/lifecycle/f$c;

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    sget-object v1, Landroidx/lifecycle/f$c;->o:Landroidx/lifecycle/f$c;

    :goto_0
    new-instance v0, Landroidx/lifecycle/k$a;

    invoke-direct {v0, p1, v1}, Landroidx/lifecycle/k$a;-><init>(Landroidx/lifecycle/i;Landroidx/lifecycle/f$c;)V

    iget-object v1, p0, Landroidx/lifecycle/k;->b:Lm/a;

    invoke-virtual {v1, p1, v0}, Lm/a;->s(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/lifecycle/k$a;

    if-eqz v1, :cond_1

    return-void

    :cond_1
    iget-object v1, p0, Landroidx/lifecycle/k;->d:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/lifecycle/j;

    if-nez v1, :cond_2

    return-void

    :cond_2
    iget v2, p0, Landroidx/lifecycle/k;->e:I

    const/4 v3, 0x1

    if-nez v2, :cond_4

    iget-boolean v2, p0, Landroidx/lifecycle/k;->f:Z

    if-eqz v2, :cond_3

    goto :goto_1

    :cond_3
    const/4 v2, 0x0

    goto :goto_2

    :cond_4
    :goto_1
    move v2, v3

    :goto_2
    invoke-direct {p0, p1}, Landroidx/lifecycle/k;->e(Landroidx/lifecycle/i;)Landroidx/lifecycle/f$c;

    move-result-object v4

    iget v5, p0, Landroidx/lifecycle/k;->e:I

    add-int/2addr v5, v3

    iput v5, p0, Landroidx/lifecycle/k;->e:I

    :goto_3
    iget-object v5, v0, Landroidx/lifecycle/k$a;->a:Landroidx/lifecycle/f$c;

    invoke-virtual {v5, v4}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v4

    if-gez v4, :cond_6

    iget-object v4, p0, Landroidx/lifecycle/k;->b:Lm/a;

    invoke-virtual {v4, p1}, Lm/a;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_6

    iget-object v4, v0, Landroidx/lifecycle/k$a;->a:Landroidx/lifecycle/f$c;

    invoke-direct {p0, v4}, Landroidx/lifecycle/k;->n(Landroidx/lifecycle/f$c;)V

    iget-object v4, v0, Landroidx/lifecycle/k$a;->a:Landroidx/lifecycle/f$c;

    invoke-static {v4}, Landroidx/lifecycle/f$b;->h(Landroidx/lifecycle/f$c;)Landroidx/lifecycle/f$b;

    move-result-object v4

    if-eqz v4, :cond_5

    invoke-virtual {v0, v1, v4}, Landroidx/lifecycle/k$a;->a(Landroidx/lifecycle/j;Landroidx/lifecycle/f$b;)V

    invoke-direct {p0}, Landroidx/lifecycle/k;->m()V

    invoke-direct {p0, p1}, Landroidx/lifecycle/k;->e(Landroidx/lifecycle/i;)Landroidx/lifecycle/f$c;

    move-result-object v4

    goto :goto_3

    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "no event up from "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, v0, Landroidx/lifecycle/k$a;->a:Landroidx/lifecycle/f$c;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    if-nez v2, :cond_7

    invoke-direct {p0}, Landroidx/lifecycle/k;->p()V

    :cond_7
    iget p1, p0, Landroidx/lifecycle/k;->e:I

    sub-int/2addr p1, v3

    iput p1, p0, Landroidx/lifecycle/k;->e:I

    return-void
.end method

.method public b()Landroidx/lifecycle/f$c;
    .locals 1

    iget-object v0, p0, Landroidx/lifecycle/k;->c:Landroidx/lifecycle/f$c;

    return-object v0
.end method

.method public c(Landroidx/lifecycle/i;)V
    .locals 1

    const-string v0, "removeObserver"

    invoke-direct {p0, v0}, Landroidx/lifecycle/k;->f(Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/lifecycle/k;->b:Lm/a;

    invoke-virtual {v0, p1}, Lm/a;->v(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public h(Landroidx/lifecycle/f$b;)V
    .locals 1

    const-string v0, "handleLifecycleEvent"

    invoke-direct {p0, v0}, Landroidx/lifecycle/k;->f(Ljava/lang/String;)V

    invoke-virtual {p1}, Landroidx/lifecycle/f$b;->g()Landroidx/lifecycle/f$c;

    move-result-object p1

    invoke-direct {p0, p1}, Landroidx/lifecycle/k;->l(Landroidx/lifecycle/f$c;)V

    return-void
.end method

.method public j(Landroidx/lifecycle/f$c;)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "markState"

    invoke-direct {p0, v0}, Landroidx/lifecycle/k;->f(Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Landroidx/lifecycle/k;->o(Landroidx/lifecycle/f$c;)V

    return-void
.end method

.method public o(Landroidx/lifecycle/f$c;)V
    .locals 1

    const-string v0, "setCurrentState"

    invoke-direct {p0, v0}, Landroidx/lifecycle/k;->f(Ljava/lang/String;)V

    invoke-direct {p0, p1}, Landroidx/lifecycle/k;->l(Landroidx/lifecycle/f$c;)V

    return-void
.end method
