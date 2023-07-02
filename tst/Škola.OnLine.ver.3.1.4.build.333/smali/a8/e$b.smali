.class final La8/e$b;
.super Ls9/l;
.source ""

# interfaces
.implements Lr9/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = La8/e;->o(Lt8/k$d;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls9/l;",
        "Lr9/a<",
        "Lg9/s;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic o:La8/e;


# direct methods
.method constructor <init>(La8/e;)V
    .locals 0

    iput-object p1, p0, La8/e$b;->o:La8/e;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ls9/l;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    iget-object v0, p0, La8/e$b;->o:La8/e;

    invoke-static {v0}, La8/e;->g(La8/e;)Lz4/b;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {v0}, Lz4/b;->b()Ly4/i;

    :goto_0
    return-void
.end method

.method public bridge synthetic f()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, La8/e$b;->a()V

    sget-object v0, Lg9/s;->a:Lg9/s;

    return-object v0
.end method
