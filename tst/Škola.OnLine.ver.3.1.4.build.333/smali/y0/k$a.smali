.class Ly0/k$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ly0/k;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic n:Landroidx/work/impl/utils/futures/c;

.field final synthetic o:Ly0/k;


# direct methods
.method constructor <init>(Ly0/k;Landroidx/work/impl/utils/futures/c;)V
    .locals 0

    iput-object p1, p0, Ly0/k$a;->o:Ly0/k;

    iput-object p2, p0, Ly0/k$a;->n:Landroidx/work/impl/utils/futures/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Ly0/k$a;->n:Landroidx/work/impl/utils/futures/c;

    iget-object v1, p0, Ly0/k$a;->o:Ly0/k;

    iget-object v1, v1, Ly0/k;->q:Landroidx/work/ListenableWorker;

    invoke-virtual {v1}, Landroidx/work/ListenableWorker;->d()Lj5/a;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/work/impl/utils/futures/c;->r(Lj5/a;)Z

    return-void
.end method
