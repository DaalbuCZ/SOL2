.class final Lca/g;
.super Lca/a;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lca/a<",
        "TT;>;"
    }
.end annotation


# instance fields
.field private final n:Lr9/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lr9/p<",
            "Lca/c<",
            "-TT;>;",
            "Lj9/d<",
            "-",
            "Lg9/s;",
            ">;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lr9/p;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lr9/p<",
            "-",
            "Lca/c<",
            "-TT;>;-",
            "Lj9/d<",
            "-",
            "Lg9/s;",
            ">;+",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Lca/a;-><init>()V

    iput-object p1, p0, Lca/g;->n:Lr9/p;

    return-void
.end method


# virtual methods
.method public a(Lca/c;Lj9/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lca/c<",
            "-TT;>;",
            "Lj9/d<",
            "-",
            "Lg9/s;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lca/g;->n:Lr9/p;

    invoke-interface {v0, p1, p2}, Lr9/p;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lk9/b;->c()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Lg9/s;->a:Lg9/s;

    return-object p1
.end method
