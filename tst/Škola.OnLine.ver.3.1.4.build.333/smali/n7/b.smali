.class public final Ln7/b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lk7/x;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ln7/b$a;
    }
.end annotation


# instance fields
.field private final n:Lm7/c;


# direct methods
.method public constructor <init>(Lm7/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln7/b;->n:Lm7/c;

    return-void
.end method


# virtual methods
.method public create(Lk7/e;Lr7/a;)Lk7/w;
    .locals 3
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

    const-class v2, Ljava/util/Collection;

    invoke-virtual {v2, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v2

    if-nez v2, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-static {v0, v1}, Lm7/b;->h(Ljava/lang/reflect/Type;Ljava/lang/Class;)Ljava/lang/reflect/Type;

    move-result-object v0

    invoke-static {v0}, Lr7/a;->b(Ljava/lang/reflect/Type;)Lr7/a;

    move-result-object v1

    invoke-virtual {p1, v1}, Lk7/e;->k(Lr7/a;)Lk7/w;

    move-result-object v1

    iget-object v2, p0, Ln7/b;->n:Lm7/c;

    invoke-virtual {v2, p2}, Lm7/c;->a(Lr7/a;)Lm7/i;

    move-result-object p2

    new-instance v2, Ln7/b$a;

    invoke-direct {v2, p1, v0, v1, p2}, Ln7/b$a;-><init>(Lk7/e;Ljava/lang/reflect/Type;Lk7/w;Lm7/i;)V

    return-object v2
.end method
