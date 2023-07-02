.class Ld1/q1$c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ld1/q1;->B()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic n:Ld1/q1;


# direct methods
.method constructor <init>(Ld1/q1;)V
    .locals 0

    iput-object p1, p0, Ld1/q1$c;->n:Ld1/q1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Ld1/q1$c;->n:Ld1/q1;

    invoke-static {v0}, Ld1/q1;->h0(Ld1/q1;)Ld1/p2;

    move-result-object v0

    if-nez v0, :cond_0

    iget-object v0, p0, Ld1/q1$c;->n:Ld1/q1;

    invoke-static {v0}, Ld1/q1;->k0(Ld1/q1;)Ld1/s2;

    move-result-object v0

    invoke-interface {v0}, Ld1/s2;->g()Ld1/z2;

    move-result-object v0

    iget-object v1, p0, Ld1/q1$c;->n:Ld1/q1;

    invoke-static {v0}, Ld1/p2;->b(Ld1/z2;)Ld1/p2;

    move-result-object v0

    invoke-static {v1, v0}, Ld1/q1;->c(Ld1/q1;Ld1/p2;)Ld1/p2;

    :cond_0
    return-void
.end method
