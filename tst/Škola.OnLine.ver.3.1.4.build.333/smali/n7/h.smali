.class public final Ln7/h;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lk7/x;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ln7/h$a;
    }
.end annotation


# instance fields
.field private final n:Lm7/c;

.field final o:Z


# direct methods
.method public constructor <init>(Lm7/c;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln7/h;->n:Lm7/c;

    iput-boolean p2, p0, Ln7/h;->o:Z

    return-void
.end method

.method private a(Lk7/e;Ljava/lang/reflect/Type;)Lk7/w;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lk7/e;",
            "Ljava/lang/reflect/Type;",
            ")",
            "Lk7/w<",
            "*>;"
        }
    .end annotation

    sget-object v0, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    if-eq p2, v0, :cond_1

    const-class v0, Ljava/lang/Boolean;

    if-ne p2, v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p2}, Lr7/a;->b(Ljava/lang/reflect/Type;)Lr7/a;

    move-result-object p2

    invoke-virtual {p1, p2}, Lk7/e;->k(Lr7/a;)Lk7/w;

    move-result-object p1

    goto :goto_1

    :cond_1
    :goto_0
    sget-object p1, Ln7/n;->f:Lk7/w;

    :goto_1
    return-object p1
.end method


# virtual methods
.method public create(Lk7/e;Lr7/a;)Lk7/w;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lk7/e;",
            "Lr7/a<",
            "TT;>;)",
            "Lk7/w<",
            "TT;>;"
        }
    .end annotation

    invoke-virtual {p2}, Lr7/a;->e()Ljava/lang/reflect/Type;

    move-result-object v0

    invoke-virtual {p2}, Lr7/a;->c()Ljava/lang/Class;

    move-result-object v1

    const-class v2, Ljava/util/Map;

    invoke-virtual {v2, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v1

    if-nez v1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-static {v0}, Lm7/b;->k(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object v1

    invoke-static {v0, v1}, Lm7/b;->j(Ljava/lang/reflect/Type;Ljava/lang/Class;)[Ljava/lang/reflect/Type;

    move-result-object v0

    const/4 v1, 0x0

    aget-object v2, v0, v1

    invoke-direct {p0, p1, v2}, Ln7/h;->a(Lk7/e;Ljava/lang/reflect/Type;)Lk7/w;

    move-result-object v7

    const/4 v2, 0x1

    aget-object v3, v0, v2

    invoke-static {v3}, Lr7/a;->b(Ljava/lang/reflect/Type;)Lr7/a;

    move-result-object v3

    invoke-virtual {p1, v3}, Lk7/e;->k(Lr7/a;)Lk7/w;

    move-result-object v9

    iget-object v3, p0, Ln7/h;->n:Lm7/c;

    invoke-virtual {v3, p2}, Lm7/c;->a(Lr7/a;)Lm7/i;

    move-result-object v10

    new-instance p2, Ln7/h$a;

    aget-object v6, v0, v1

    aget-object v8, v0, v2

    move-object v3, p2

    move-object v4, p0

    move-object v5, p1

    invoke-direct/range {v3 .. v10}, Ln7/h$a;-><init>(Ln7/h;Lk7/e;Ljava/lang/reflect/Type;Lk7/w;Ljava/lang/reflect/Type;Lk7/w;Lm7/i;)V

    return-object p2
.end method
