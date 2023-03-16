.class final Ls7/e$b;
.super Lk9/l;
.source ""

# interfaces
.implements Lj9/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ls7/e;->o(Ll8/k$d;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lk9/l;",
        "Lj9/a<",
        "Ly8/s;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic o:Ls7/e;


# direct methods
.method constructor <init>(Ls7/e;)V
    .locals 0

    iput-object p1, p0, Ls7/e$b;->o:Ls7/e;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lk9/l;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    iget-object v0, p0, Ls7/e$b;->o:Ls7/e;

    invoke-static {v0}, Ls7/e;->g(Ls7/e;)Lu4/b;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {v0}, Lu4/b;->b()Lt4/i;

    :goto_0
    return-void
.end method

.method public bridge synthetic d()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Ls7/e$b;->a()V

    sget-object v0, Ly8/s;->a:Ly8/s;

    return-object v0
.end method
