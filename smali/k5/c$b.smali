.class public Lk5/c$b;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lk5/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field private a:Ljava/lang/String;

.field private final b:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lk5/f0<",
            "-TT;>;>;"
        }
    .end annotation
.end field

.field private final c:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lk5/r;",
            ">;"
        }
    .end annotation
.end field

.field private d:I

.field private e:I

.field private f:Lk5/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lk5/h<",
            "TT;>;"
        }
    .end annotation
.end field

.field private final g:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/Class<",
            "*>;>;"
        }
    .end annotation
.end field


# direct methods
.method private varargs constructor <init>(Ljava/lang/Class;[Ljava/lang/Class;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "TT;>;[",
            "Ljava/lang/Class<",
            "-TT;>;)V"
        }
    .end annotation

    .annotation runtime Ljava/lang/SafeVarargs;
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lk5/c$b;->a:Ljava/lang/String;

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lk5/c$b;->b:Ljava/util/Set;

    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    iput-object v1, p0, Lk5/c$b;->c:Ljava/util/Set;

    const/4 v1, 0x0

    iput v1, p0, Lk5/c$b;->d:I

    iput v1, p0, Lk5/c$b;->e:I

    new-instance v2, Ljava/util/HashSet;

    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    iput-object v2, p0, Lk5/c$b;->g:Ljava/util/Set;

    const-string v2, "Null interface"

    invoke-static {p1, v2}, Lk5/e0;->c(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    invoke-static {p1}, Lk5/f0;->b(Ljava/lang/Class;)Lk5/f0;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    array-length p1, p2

    :goto_0
    if-ge v1, p1, :cond_0

    aget-object v0, p2, v1

    invoke-static {v0, v2}, Lk5/e0;->c(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iget-object v3, p0, Lk5/c$b;->b:Ljava/util/Set;

    invoke-static {v0}, Lk5/f0;->b(Ljava/lang/Class;)Lk5/f0;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/Class;[Ljava/lang/Class;Lk5/c$a;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lk5/c$b;-><init>(Ljava/lang/Class;[Ljava/lang/Class;)V

    return-void
.end method

.method private varargs constructor <init>(Lk5/f0;[Lk5/f0;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lk5/f0<",
            "TT;>;[",
            "Lk5/f0<",
            "-TT;>;)V"
        }
    .end annotation

    .annotation runtime Ljava/lang/SafeVarargs;
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lk5/c$b;->a:Ljava/lang/String;

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lk5/c$b;->b:Ljava/util/Set;

    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    iput-object v1, p0, Lk5/c$b;->c:Ljava/util/Set;

    const/4 v1, 0x0

    iput v1, p0, Lk5/c$b;->d:I

    iput v1, p0, Lk5/c$b;->e:I

    new-instance v2, Ljava/util/HashSet;

    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    iput-object v2, p0, Lk5/c$b;->g:Ljava/util/Set;

    const-string v2, "Null interface"

    invoke-static {p1, v2}, Lk5/e0;->c(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    array-length p1, p2

    :goto_0
    if-ge v1, p1, :cond_0

    aget-object v0, p2, v1

    invoke-static {v0, v2}, Lk5/e0;->c(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lk5/c$b;->b:Ljava/util/Set;

    invoke-static {p1, p2}, Ljava/util/Collections;->addAll(Ljava/util/Collection;[Ljava/lang/Object;)Z

    return-void
.end method

.method synthetic constructor <init>(Lk5/f0;[Lk5/f0;Lk5/c$a;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lk5/c$b;-><init>(Lk5/f0;[Lk5/f0;)V

    return-void
.end method

.method static synthetic a(Lk5/c$b;)Lk5/c$b;
    .locals 0

    invoke-direct {p0}, Lk5/c$b;->g()Lk5/c$b;

    move-result-object p0

    return-object p0
.end method

.method private g()Lk5/c$b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lk5/c$b<",
            "TT;>;"
        }
    .end annotation

    const/4 v0, 0x1

    iput v0, p0, Lk5/c$b;->e:I

    return-object p0
.end method

.method private i(I)Lk5/c$b;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Lk5/c$b<",
            "TT;>;"
        }
    .end annotation

    iget v0, p0, Lk5/c$b;->d:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v1, "Instantiation type has already been set."

    invoke-static {v0, v1}, Lk5/e0;->d(ZLjava/lang/String;)V

    iput p1, p0, Lk5/c$b;->d:I

    return-object p0
.end method

.method private j(Lk5/f0;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lk5/f0<",
            "*>;)V"
        }
    .end annotation

    iget-object v0, p0, Lk5/c$b;->b:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    const-string v0, "Components are not allowed to depend on interfaces they themselves provide."

    invoke-static {p1, v0}, Lk5/e0;->a(ZLjava/lang/String;)V

    return-void
.end method


# virtual methods
.method public b(Lk5/r;)Lk5/c$b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lk5/r;",
            ")",
            "Lk5/c$b<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "Null dependency"

    invoke-static {p1, v0}, Lk5/e0;->c(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    invoke-virtual {p1}, Lk5/r;->c()Lk5/f0;

    move-result-object v0

    invoke-direct {p0, v0}, Lk5/c$b;->j(Lk5/f0;)V

    iget-object v0, p0, Lk5/c$b;->c:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public c()Lk5/c$b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lk5/c$b<",
            "TT;>;"
        }
    .end annotation

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lk5/c$b;->i(I)Lk5/c$b;

    move-result-object v0

    return-object v0
.end method

.method public d()Lk5/c;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lk5/c<",
            "TT;>;"
        }
    .end annotation

    iget-object v0, p0, Lk5/c$b;->f:Lk5/h;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v1, "Missing required property: factory."

    invoke-static {v0, v1}, Lk5/e0;->d(ZLjava/lang/String;)V

    new-instance v0, Lk5/c;

    iget-object v3, p0, Lk5/c$b;->a:Ljava/lang/String;

    new-instance v4, Ljava/util/HashSet;

    iget-object v1, p0, Lk5/c$b;->b:Ljava/util/Set;

    invoke-direct {v4, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    new-instance v5, Ljava/util/HashSet;

    iget-object v1, p0, Lk5/c$b;->c:Ljava/util/Set;

    invoke-direct {v5, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    iget v6, p0, Lk5/c$b;->d:I

    iget v7, p0, Lk5/c$b;->e:I

    iget-object v8, p0, Lk5/c$b;->f:Lk5/h;

    iget-object v9, p0, Lk5/c$b;->g:Ljava/util/Set;

    const/4 v10, 0x0

    move-object v2, v0

    invoke-direct/range {v2 .. v10}, Lk5/c;-><init>(Ljava/lang/String;Ljava/util/Set;Ljava/util/Set;IILk5/h;Ljava/util/Set;Lk5/c$a;)V

    return-object v0
.end method

.method public e()Lk5/c$b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lk5/c$b<",
            "TT;>;"
        }
    .end annotation

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lk5/c$b;->i(I)Lk5/c$b;

    move-result-object v0

    return-object v0
.end method

.method public f(Lk5/h;)Lk5/c$b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lk5/h<",
            "TT;>;)",
            "Lk5/c$b<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "Null factory"

    invoke-static {p1, v0}, Lk5/e0;->c(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lk5/h;

    iput-object p1, p0, Lk5/c$b;->f:Lk5/h;

    return-object p0
.end method

.method public h(Ljava/lang/String;)Lk5/c$b;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lk5/c$b<",
            "TT;>;"
        }
    .end annotation

    iput-object p1, p0, Lk5/c$b;->a:Ljava/lang/String;

    return-object p0
.end method