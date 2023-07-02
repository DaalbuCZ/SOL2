.class Ln7/i$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lk7/x;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ln7/i;->g(Lk7/v;)Lk7/x;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic n:Ln7/i;


# direct methods
.method constructor <init>(Ln7/i;)V
    .locals 0

    iput-object p1, p0, Ln7/i$a;->n:Ln7/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public create(Lk7/e;Lr7/a;)Lk7/w;
    .locals 0
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

    move-result-object p1

    const-class p2, Ljava/lang/Number;

    if-ne p1, p2, :cond_0

    iget-object p1, p0, Ln7/i$a;->n:Ln7/i;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method
