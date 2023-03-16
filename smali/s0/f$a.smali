.class Ls0/f$a;
.super Ly/a;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ls0/f;-><init>(Landroidx/room/h;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ly/a<",
        "Ls0/d;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic d:Ls0/f;


# direct methods
.method constructor <init>(Ls0/f;Landroidx/room/h;)V
    .locals 0

    iput-object p1, p0, Ls0/f$a;->d:Ls0/f;

    invoke-direct {p0, p2}, Ly/a;-><init>(Landroidx/room/h;)V

    return-void
.end method


# virtual methods
.method public d()Ljava/lang/String;
    .locals 1

    const-string v0, "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)"

    return-object v0
.end method

.method public bridge synthetic g(Lb0/f;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Ls0/d;

    invoke-virtual {p0, p1, p2}, Ls0/f$a;->i(Lb0/f;Ls0/d;)V

    return-void
.end method

.method public i(Lb0/f;Ls0/d;)V
    .locals 3

    iget-object v0, p2, Ls0/d;->a:Ljava/lang/String;

    const/4 v1, 0x1

    if-nez v0, :cond_0

    invoke-interface {p1, v1}, Lb0/d;->u(I)V

    goto :goto_0

    :cond_0
    invoke-interface {p1, v1, v0}, Lb0/d;->n(ILjava/lang/String;)V

    :goto_0
    iget-object p2, p2, Ls0/d;->b:Ljava/lang/Long;

    const/4 v0, 0x2

    if-nez p2, :cond_1

    invoke-interface {p1, v0}, Lb0/d;->u(I)V

    goto :goto_1

    :cond_1
    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-interface {p1, v0, v1, v2}, Lb0/d;->H(IJ)V

    :goto_1
    return-void
.end method
