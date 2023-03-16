.class public final Li7/h;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lf7/x;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Li7/h$a;
    }
.end annotation


# instance fields
.field private final n:Lh7/c;

.field final o:Z


# direct methods
.method public constructor <init>(Lh7/c;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li7/h;->n:Lh7/c;

    iput-boolean p2, p0, Li7/h;->o:Z

    return-void
.end method

.method private a(Lf7/e;Ljava/lang/reflect/Type;)Lf7/w;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lf7/e;",
            "Ljava/lang/reflect/Type;",
            ")",
            "Lf7/w<",
            "*>;"
        }
    .end annotation

    sget-object v0, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    if-eq p2, v0, :cond_1

    const-class v0, Ljava/lang/Boolean;

    if-ne p2, v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p2}, Lm7/a;->b(Ljava/lang/reflect/Type;)Lm7/a;

    move-result-object p2

    invoke-virtual {p1, p2}, Lf7/e;->k(Lm7/a;)Lf7/w;

    move-result-object p1

    goto :goto_1

    :cond_1
    :goto_0
    sget-object p1, Li7/n;->f:Lf7/w;

    :goto_1
    return-object p1
.end method


# virtual methods
.method public create(Lf7/e;Lm7/a;)Lf7/w;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lf7/e;",
            "Lm7/a<",
            "TT;>;)",
            "Lf7/w<",
            "TT;>;"
        }
    .end annotation

    invoke-virtual {p2}, Lm7/a;->e()Ljava/lang/reflect/Type;

    move-result-object v0

    invoke-virtual {p2}, Lm7/a;->c()Ljava/lang/Class;

    move-result-object v1

    const-class v2, Ljava/util/Map;

    invoke-virtual {v2, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v1

    if-nez v1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-static {v0}, Lh7/b;->k(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object v1

    invoke-static {v0, v1}, Lh7/b;->j(Ljava/lang/reflect/Type;Ljava/lang/Class;)[Ljava/lang/reflect/Type;

    move-result-object v0

    const/4 v1, 0x0

    aget-object v2, v0, v1

    invoke-direct {p0, p1, v2}, Li7/h;->a(Lf7/e;Ljava/lang/reflect/Type;)Lf7/w;

    move-result-object v7

    const/4 v2, 0x1

    aget-object v3, v0, v2

    invoke-static {v3}, Lm7/a;->b(Ljava/lang/reflect/Type;)Lm7/a;

    move-result-object v3

    invoke-virtual {p1, v3}, Lf7/e;->k(Lm7/a;)Lf7/w;

    move-result-object v9

    iget-object v3, p0, Li7/h;->n:Lh7/c;

    invoke-virtual {v3, p2}, Lh7/c;->a(Lm7/a;)Lh7/i;

    move-result-object v10

    new-instance p2, Li7/h$a;

    aget-object v6, v0, v1

    aget-object v8, v0, v2

    move-object v3, p2

    move-object v4, p0

    move-object v5, p1

    invoke-direct/range {v3 .. v10}, Li7/h$a;-><init>(Li7/h;Lf7/e;Ljava/lang/reflect/Type;Lf7/w;Ljava/lang/reflect/Type;Lf7/w;Lh7/i;)V

    return-object p2
.end method
