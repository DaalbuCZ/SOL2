.class Li7/j$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lf7/x;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Li7/j;->g(Lf7/v;)Lf7/x;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic n:Lf7/v;


# direct methods
.method constructor <init>(Lf7/v;)V
    .locals 0

    iput-object p1, p0, Li7/j$a;->n:Lf7/v;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public create(Lf7/e;Lm7/a;)Lf7/w;
    .locals 2
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

    invoke-virtual {p2}, Lm7/a;->c()Ljava/lang/Class;

    move-result-object p2

    const-class v0, Ljava/lang/Object;

    const/4 v1, 0x0

    if-ne p2, v0, :cond_0

    new-instance p2, Li7/j;

    iget-object v0, p0, Li7/j$a;->n:Lf7/v;

    invoke-direct {p2, p1, v0, v1}, Li7/j;-><init>(Lf7/e;Lf7/v;Li7/j$a;)V

    return-object p2

    :cond_0
    return-object v1
.end method
