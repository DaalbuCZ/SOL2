.class public Lh7/c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lh7/i;


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Lh7/d;


# direct methods
.method constructor <init>(Ljava/util/Set;Lh7/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Lh7/f;",
            ">;",
            "Lh7/d;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lh7/c;->e(Ljava/util/Set;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lh7/c;->a:Ljava/lang/String;

    iput-object p2, p0, Lh7/c;->b:Lh7/d;

    return-void
.end method

.method public static synthetic b(Lp5/e;)Lh7/i;
    .locals 0

    invoke-static {p0}, Lh7/c;->d(Lp5/e;)Lh7/i;

    move-result-object p0

    return-object p0
.end method

.method public static c()Lp5/c;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lp5/c<",
            "Lh7/i;",
            ">;"
        }
    .end annotation

    const-class v0, Lh7/i;

    invoke-static {v0}, Lp5/c;->c(Ljava/lang/Class;)Lp5/c$b;

    move-result-object v0

    const-class v1, Lh7/f;

    invoke-static {v1}, Lp5/r;->m(Ljava/lang/Class;)Lp5/r;

    move-result-object v1

    invoke-virtual {v0, v1}, Lp5/c$b;->b(Lp5/r;)Lp5/c$b;

    move-result-object v0

    sget-object v1, Lh7/b;->a:Lh7/b;

    invoke-virtual {v0, v1}, Lp5/c$b;->f(Lp5/h;)Lp5/c$b;

    move-result-object v0

    invoke-virtual {v0}, Lp5/c$b;->d()Lp5/c;

    move-result-object v0

    return-object v0
.end method

.method private static synthetic d(Lp5/e;)Lh7/i;
    .locals 2

    new-instance v0, Lh7/c;

    const-class v1, Lh7/f;

    invoke-interface {p0, v1}, Lp5/e;->e(Ljava/lang/Class;)Ljava/util/Set;

    move-result-object p0

    invoke-static {}, Lh7/d;->a()Lh7/d;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lh7/c;-><init>(Ljava/util/Set;Lh7/d;)V

    return-object v0
.end method

.method private static e(Ljava/util/Set;)Ljava/lang/String;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Lh7/f;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lh7/f;

    invoke-virtual {v1}, Lh7/f;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v2, 0x2f

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Lh7/f;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 v1, 0x20

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lh7/c;->b:Lh7/d;

    invoke-virtual {v0}, Lh7/d;->b()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lh7/c;->a:Ljava/lang/String;

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lh7/c;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x20

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lh7/c;->b:Lh7/d;

    invoke-virtual {v1}, Lh7/d;->b()Ljava/util/Set;

    move-result-object v1

    invoke-static {v1}, Lh7/c;->e(Ljava/util/Set;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
