.class Lq5/m$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lq5/m;->j(Lx5/i;)Lt4/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable<",
        "Lt4/i<",
        "Ljava/lang/Void;",
        ">;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lx5/i;

.field final synthetic b:Lq5/m;


# direct methods
.method constructor <init>(Lq5/m;Lx5/i;)V
    .locals 0

    iput-object p1, p0, Lq5/m$a;->b:Lq5/m;

    iput-object p2, p0, Lq5/m$a;->a:Lx5/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lt4/i;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lt4/i<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lq5/m$a;->b:Lq5/m;

    iget-object v1, p0, Lq5/m$a;->a:Lx5/i;

    invoke-static {v0, v1}, Lq5/m;->a(Lq5/m;Lx5/i;)Lt4/i;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic call()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lq5/m$a;->a()Lt4/i;

    move-result-object v0

    return-object v0
.end method
