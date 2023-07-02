.class final Landroidx/lifecycle/x$a;
.super Ls9/l;
.source ""

# interfaces
.implements Lr9/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/lifecycle/x;-><init>(Lf0/c;Landroidx/lifecycle/f0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls9/l;",
        "Lr9/a<",
        "Landroidx/lifecycle/y;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic o:Landroidx/lifecycle/f0;


# direct methods
.method constructor <init>(Landroidx/lifecycle/f0;)V
    .locals 0

    iput-object p1, p0, Landroidx/lifecycle/x$a;->o:Landroidx/lifecycle/f0;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ls9/l;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Landroidx/lifecycle/y;
    .locals 1

    iget-object v0, p0, Landroidx/lifecycle/x$a;->o:Landroidx/lifecycle/f0;

    invoke-static {v0}, Landroidx/lifecycle/w;->b(Landroidx/lifecycle/f0;)Landroidx/lifecycle/y;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic f()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Landroidx/lifecycle/x$a;->a()Landroidx/lifecycle/y;

    move-result-object v0

    return-object v0
.end method
