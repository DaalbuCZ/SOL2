.class public final Li7/b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lf7/x;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Li7/b$a;
    }
.end annotation


# instance fields
.field private final n:Lh7/c;


# direct methods
.method public constructor <init>(Lh7/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li7/b;->n:Lh7/c;

    return-void
.end method


# virtual methods
.method public create(Lf7/e;Lm7/a;)Lf7/w;
    .locals 3
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

    const-class v2, Ljava/util/Collection;

    invoke-virtual {v2, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v2

    if-nez v2, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-static {v0, v1}, Lh7/b;->h(Ljava/lang/reflect/Type;Ljava/lang/Class;)Ljava/lang/reflect/Type;

    move-result-object v0

    invoke-static {v0}, Lm7/a;->b(Ljava/lang/reflect/Type;)Lm7/a;

    move-result-object v1

    invoke-virtual {p1, v1}, Lf7/e;->k(Lm7/a;)Lf7/w;

    move-result-object v1

    iget-object v2, p0, Li7/b;->n:Lh7/c;

    invoke-virtual {v2, p2}, Lh7/c;->a(Lm7/a;)Lh7/i;

    move-result-object p2

    new-instance v2, Li7/b$a;

    invoke-direct {v2, p1, v0, v1, p2}, Li7/b$a;-><init>(Lf7/e;Ljava/lang/reflect/Type;Lf7/w;Lh7/i;)V

    return-object v2
.end method
