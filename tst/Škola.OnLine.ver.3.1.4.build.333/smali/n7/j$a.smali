.class Ln7/j$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lk7/x;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ln7/j;->g(Lk7/v;)Lk7/x;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic n:Lk7/v;


# direct methods
.method constructor <init>(Lk7/v;)V
    .locals 0

    iput-object p1, p0, Ln7/j$a;->n:Lk7/v;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public create(Lk7/e;Lr7/a;)Lk7/w;
    .locals 2
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

    invoke-virtual {p2}, Lr7/a;->c()Ljava/lang/Class;

    move-result-object p2

    const-class v0, Ljava/lang/Object;

    const/4 v1, 0x0

    if-ne p2, v0, :cond_0

    new-instance p2, Ln7/j;

    iget-object v0, p0, Ln7/j$a;->n:Lk7/v;

    invoke-direct {p2, p1, v0, v1}, Ln7/j;-><init>(Lk7/e;Lk7/v;Ln7/j$a;)V

    return-object p2

    :cond_0
    return-object v1
.end method
