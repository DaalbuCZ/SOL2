.class final Lu9/f;
.super Lu9/a;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lu9/a<",
        "TT;>;"
    }
.end annotation


# instance fields
.field private final a:Lj9/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lj9/p<",
            "Lu9/c<",
            "-TT;>;",
            "Lb9/d<",
            "-",
            "Ly8/s;",
            ">;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lj9/p;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj9/p<",
            "-",
            "Lu9/c<",
            "-TT;>;-",
            "Lb9/d<",
            "-",
            "Ly8/s;",
            ">;+",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Lu9/a;-><init>()V

    iput-object p1, p0, Lu9/f;->a:Lj9/p;

    return-void
.end method


# virtual methods
.method public b(Lu9/c;Lb9/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lu9/c<",
            "-TT;>;",
            "Lb9/d<",
            "-",
            "Ly8/s;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lu9/f;->a:Lj9/p;

    invoke-interface {v0, p1, p2}, Lj9/p;->k(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lc9/b;->c()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ly8/s;->a:Ly8/s;

    return-object p1
.end method
