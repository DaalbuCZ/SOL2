.class public final Lf3/e;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lf3/k;


# instance fields
.field private final a:Lf3/k;

.field private final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ly2/c;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lf3/k;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lf3/k;",
            "Ljava/util/List<",
            "Ly2/c;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf3/e;->a:Lf3/k;

    iput-object p2, p0, Lf3/e;->b:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public a(Lf3/h;Lf3/g;)Lt3/j0$a;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lf3/h;",
            "Lf3/g;",
            ")",
            "Lt3/j0$a<",
            "Lf3/i;",
            ">;"
        }
    .end annotation

    new-instance v0, Ly2/b;

    iget-object v1, p0, Lf3/e;->a:Lf3/k;

    invoke-interface {v1, p1, p2}, Lf3/k;->a(Lf3/h;Lf3/g;)Lt3/j0$a;

    move-result-object p1

    iget-object p2, p0, Lf3/e;->b:Ljava/util/List;

    invoke-direct {v0, p1, p2}, Ly2/b;-><init>(Lt3/j0$a;Ljava/util/List;)V

    return-object v0
.end method

.method public b()Lt3/j0$a;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lt3/j0$a<",
            "Lf3/i;",
            ">;"
        }
    .end annotation

    new-instance v0, Ly2/b;

    iget-object v1, p0, Lf3/e;->a:Lf3/k;

    invoke-interface {v1}, Lf3/k;->b()Lt3/j0$a;

    move-result-object v1

    iget-object v2, p0, Lf3/e;->b:Ljava/util/List;

    invoke-direct {v0, v1, v2}, Ly2/b;-><init>(Lt3/j0$a;Ljava/util/List;)V

    return-object v0
.end method
