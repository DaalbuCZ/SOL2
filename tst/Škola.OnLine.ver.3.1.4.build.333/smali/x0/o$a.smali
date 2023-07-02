.class Lx0/o$a;
.super Lc0/a;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lx0/o;-><init>(Landroidx/room/h;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lc0/a<",
        "Lx0/m;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic d:Lx0/o;


# direct methods
.method constructor <init>(Lx0/o;Landroidx/room/h;)V
    .locals 0

    iput-object p1, p0, Lx0/o$a;->d:Lx0/o;

    invoke-direct {p0, p2}, Lc0/a;-><init>(Landroidx/room/h;)V

    return-void
.end method


# virtual methods
.method public d()Ljava/lang/String;
    .locals 1

    const-string v0, "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)"

    return-object v0
.end method

.method public bridge synthetic g(Lg0/f;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Lx0/m;

    invoke-virtual {p0, p1, p2}, Lx0/o$a;->i(Lg0/f;Lx0/m;)V

    return-void
.end method

.method public i(Lg0/f;Lx0/m;)V
    .locals 2

    iget-object v0, p2, Lx0/m;->a:Ljava/lang/String;

    const/4 v1, 0x1

    if-nez v0, :cond_0

    invoke-interface {p1, v1}, Lg0/d;->z(I)V

    goto :goto_0

    :cond_0
    invoke-interface {p1, v1, v0}, Lg0/d;->s(ILjava/lang/String;)V

    :goto_0
    iget-object p2, p2, Lx0/m;->b:Landroidx/work/b;

    invoke-static {p2}, Landroidx/work/b;->n(Landroidx/work/b;)[B

    move-result-object p2

    const/4 v0, 0x2

    if-nez p2, :cond_1

    invoke-interface {p1, v0}, Lg0/d;->z(I)V

    goto :goto_1

    :cond_1
    invoke-interface {p1, v0, p2}, Lg0/d;->N(I[B)V

    :goto_1
    return-void
.end method
