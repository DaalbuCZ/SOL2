.class Landroidx/lifecycle/r$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/lifecycle/r;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic n:Landroidx/lifecycle/r;


# direct methods
.method constructor <init>(Landroidx/lifecycle/r;)V
    .locals 0

    iput-object p1, p0, Landroidx/lifecycle/r$a;->n:Landroidx/lifecycle/r;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    iget-object v0, p0, Landroidx/lifecycle/r$a;->n:Landroidx/lifecycle/r;

    invoke-virtual {v0}, Landroidx/lifecycle/r;->g()V

    iget-object v0, p0, Landroidx/lifecycle/r$a;->n:Landroidx/lifecycle/r;

    invoke-virtual {v0}, Landroidx/lifecycle/r;->h()V

    return-void
.end method
