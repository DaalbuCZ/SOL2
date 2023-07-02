.class Lv5/m$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lv5/m;->j(Lc6/i;)Ly4/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable<",
        "Ly4/i<",
        "Ljava/lang/Void;",
        ">;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lc6/i;

.field final synthetic b:Lv5/m;


# direct methods
.method constructor <init>(Lv5/m;Lc6/i;)V
    .locals 0

    iput-object p1, p0, Lv5/m$a;->b:Lv5/m;

    iput-object p2, p0, Lv5/m$a;->a:Lc6/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ly4/i;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ly4/i<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lv5/m$a;->b:Lv5/m;

    iget-object v1, p0, Lv5/m$a;->a:Lc6/i;

    invoke-static {v0, v1}, Lv5/m;->a(Lv5/m;Lc6/i;)Ly4/i;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic call()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lv5/m$a;->a()Ly4/i;

    move-result-object v0

    return-object v0
.end method
