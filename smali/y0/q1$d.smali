.class Ly0/q1$d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ly0/h2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ly0/q1;->h()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ly0/h2<",
        "Ly0/k3;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Ly0/q1;


# direct methods
.method constructor <init>(Ly0/q1;)V
    .locals 0

    iput-object p1, p0, Ly0/q1$d;->a:Ly0/q1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ly0/k3;

    invoke-virtual {p0, p1}, Ly0/q1$d;->c(Ly0/k3;)V

    return-void
.end method

.method public b(Ljava/lang/Throwable;)V
    .locals 1

    instance-of p1, p1, Ly0/q0;

    if-eqz p1, :cond_0

    iget-object p1, p0, Ly0/q1$d;->a:Ly0/q1;

    invoke-static {p1}, Ly0/q1;->q0(Ly0/q1;)V

    return-void

    :cond_0
    iget-object p1, p0, Ly0/q1$d;->a:Ly0/q1;

    invoke-static {p1}, Ly0/q1;->n0(Ly0/q1;)Ly0/k3;

    move-result-object p1

    if-nez p1, :cond_1

    iget-object p1, p0, Ly0/q1$d;->a:Ly0/q1;

    sget-object v0, Ly0/k3;->d:Ly0/k3;

    invoke-static {p1, v0}, Ly0/q1;->N(Ly0/q1;Ly0/k3;)Ly0/k3;

    :cond_1
    return-void
.end method

.method public c(Ly0/k3;)V
    .locals 2

    iget-object v0, p0, Ly0/q1$d;->a:Ly0/q1;

    new-instance v1, Ly0/k3$b;

    invoke-direct {v1, p1}, Ly0/k3$b;-><init>(Ly0/k3;)V

    invoke-virtual {v1}, Ly0/k3$b;->c()Ly0/k3;

    move-result-object p1

    invoke-static {v0, p1}, Ly0/q1;->N(Ly0/q1;Ly0/k3;)Ly0/k3;

    return-void
.end method
