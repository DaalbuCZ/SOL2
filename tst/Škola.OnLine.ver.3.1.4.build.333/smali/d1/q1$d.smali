.class Ld1/q1$d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ld1/h2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ld1/q1;->h()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ld1/h2<",
        "Ld1/k3;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Ld1/q1;


# direct methods
.method constructor <init>(Ld1/q1;)V
    .locals 0

    iput-object p1, p0, Ld1/q1$d;->a:Ld1/q1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ld1/k3;

    invoke-virtual {p0, p1}, Ld1/q1$d;->c(Ld1/k3;)V

    return-void
.end method

.method public b(Ljava/lang/Throwable;)V
    .locals 1

    instance-of p1, p1, Ld1/q0;

    if-eqz p1, :cond_0

    iget-object p1, p0, Ld1/q1$d;->a:Ld1/q1;

    invoke-static {p1}, Ld1/q1;->q0(Ld1/q1;)V

    return-void

    :cond_0
    iget-object p1, p0, Ld1/q1$d;->a:Ld1/q1;

    invoke-static {p1}, Ld1/q1;->n0(Ld1/q1;)Ld1/k3;

    move-result-object p1

    if-nez p1, :cond_1

    iget-object p1, p0, Ld1/q1$d;->a:Ld1/q1;

    sget-object v0, Ld1/k3;->d:Ld1/k3;

    invoke-static {p1, v0}, Ld1/q1;->M(Ld1/q1;Ld1/k3;)Ld1/k3;

    :cond_1
    return-void
.end method

.method public c(Ld1/k3;)V
    .locals 2

    iget-object v0, p0, Ld1/q1$d;->a:Ld1/q1;

    new-instance v1, Ld1/k3$b;

    invoke-direct {v1, p1}, Ld1/k3$b;-><init>(Ld1/k3;)V

    invoke-virtual {v1}, Ld1/k3$b;->c()Ld1/k3;

    move-result-object p1

    invoke-static {v0, p1}, Ld1/q1;->M(Ld1/q1;Ld1/k3;)Ld1/k3;

    return-void
.end method
