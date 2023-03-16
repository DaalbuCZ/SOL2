.class final Ly3/w;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic n:Ly3/z;


# direct methods
.method constructor <init>(Ly3/z;)V
    .locals 0

    iput-object p1, p0, Ly3/w;->n:Ly3/z;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Ly3/w;->n:Ly3/z;

    invoke-static {v0}, Ly3/z;->n0(Ly3/z;)Ly3/y;

    move-result-object v0

    new-instance v1, Lw3/b;

    const/4 v2, 0x4

    invoke-direct {v1, v2}, Lw3/b;-><init>(I)V

    invoke-interface {v0, v1}, Ly3/y;->b(Lw3/b;)V

    return-void
.end method
