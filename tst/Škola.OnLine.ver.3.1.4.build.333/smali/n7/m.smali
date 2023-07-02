.class final Ln7/m;
.super Lk7/w;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lk7/w<",
        "TT;>;"
    }
.end annotation


# instance fields
.field private final a:Lk7/e;

.field private final b:Lk7/w;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lk7/w<",
            "TT;>;"
        }
    .end annotation
.end field

.field private final c:Ljava/lang/reflect/Type;


# direct methods
.method constructor <init>(Lk7/e;Lk7/w;Ljava/lang/reflect/Type;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lk7/e;",
            "Lk7/w<",
            "TT;>;",
            "Ljava/lang/reflect/Type;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Lk7/w;-><init>()V

    iput-object p1, p0, Ln7/m;->a:Lk7/e;

    iput-object p2, p0, Ln7/m;->b:Lk7/w;

    iput-object p3, p0, Ln7/m;->c:Ljava/lang/reflect/Type;

    return-void
.end method

.method private f(Ljava/lang/reflect/Type;Ljava/lang/Object;)Ljava/lang/reflect/Type;
    .locals 1

    if-eqz p2, :cond_1

    const-class v0, Ljava/lang/Object;

    if-eq p1, v0, :cond_0

    instance-of v0, p1, Ljava/lang/reflect/TypeVariable;

    if-nez v0, :cond_0

    instance-of v0, p1, Ljava/lang/Class;

    if-eqz v0, :cond_1

    :cond_0
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    :cond_1
    return-object p1
.end method


# virtual methods
.method public c(Ls7/a;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ls7/a;",
            ")TT;"
        }
    .end annotation

    iget-object v0, p0, Ln7/m;->b:Lk7/w;

    invoke-virtual {v0, p1}, Lk7/w;->c(Ls7/a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public e(Ls7/c;Ljava/lang/Object;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ls7/c;",
            "TT;)V"
        }
    .end annotation

    iget-object v0, p0, Ln7/m;->b:Lk7/w;

    iget-object v1, p0, Ln7/m;->c:Ljava/lang/reflect/Type;

    invoke-direct {p0, v1, p2}, Ln7/m;->f(Ljava/lang/reflect/Type;Ljava/lang/Object;)Ljava/lang/reflect/Type;

    move-result-object v1

    iget-object v2, p0, Ln7/m;->c:Ljava/lang/reflect/Type;

    if-eq v1, v2, :cond_1

    iget-object v0, p0, Ln7/m;->a:Lk7/e;

    invoke-static {v1}, Lr7/a;->b(Ljava/lang/reflect/Type;)Lr7/a;

    move-result-object v1

    invoke-virtual {v0, v1}, Lk7/e;->k(Lr7/a;)Lk7/w;

    move-result-object v0

    instance-of v1, v0, Ln7/k$b;

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Ln7/m;->b:Lk7/w;

    instance-of v2, v1, Ln7/k$b;

    if-nez v2, :cond_1

    move-object v0, v1

    :cond_1
    :goto_0
    invoke-virtual {v0, p1, p2}, Lk7/w;->e(Ls7/c;Ljava/lang/Object;)V

    return-void
.end method
