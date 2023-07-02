.class Lv5/i$c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ly4/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lv5/i;->f(Ljava/util/concurrent/Callable;)Ly4/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ly4/a<",
        "Ljava/lang/Void;",
        "TT;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Ljava/util/concurrent/Callable;

.field final synthetic b:Lv5/i;


# direct methods
.method constructor <init>(Lv5/i;Ljava/util/concurrent/Callable;)V
    .locals 0

    iput-object p1, p0, Lv5/i$c;->b:Lv5/i;

    iput-object p2, p0, Lv5/i$c;->a:Ljava/util/concurrent/Callable;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ly4/i;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ly4/i<",
            "Ljava/lang/Void;",
            ">;)TT;"
        }
    .end annotation

    iget-object p1, p0, Lv5/i$c;->a:Ljava/util/concurrent/Callable;

    invoke-interface {p1}, Ljava/util/concurrent/Callable;->call()Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
