.class Ly0/q1$c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ly0/q1;->B()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic n:Ly0/q1;


# direct methods
.method constructor <init>(Ly0/q1;)V
    .locals 0

    iput-object p1, p0, Ly0/q1$c;->n:Ly0/q1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Ly0/q1$c;->n:Ly0/q1;

    invoke-static {v0}, Ly0/q1;->i0(Ly0/q1;)Ly0/p2;

    move-result-object v0

    if-nez v0, :cond_0

    iget-object v0, p0, Ly0/q1$c;->n:Ly0/q1;

    invoke-static {v0}, Ly0/q1;->k0(Ly0/q1;)Ly0/s2;

    move-result-object v0

    invoke-interface {v0}, Ly0/s2;->g()Ly0/z2;

    move-result-object v0

    iget-object v1, p0, Ly0/q1$c;->n:Ly0/q1;

    invoke-static {v0}, Ly0/p2;->b(Ly0/z2;)Ly0/p2;

    move-result-object v0

    invoke-static {v1, v0}, Ly0/q1;->g(Ly0/q1;Ly0/p2;)Ly0/p2;

    :cond_0
    return-void
.end method
