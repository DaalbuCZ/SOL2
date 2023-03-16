.class Lq5/k$f;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lq5/k;->X(Ljava/lang/Thread;Ljava/lang/Throwable;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic n:J

.field final synthetic o:Ljava/lang/Throwable;

.field final synthetic p:Ljava/lang/Thread;

.field final synthetic q:Lq5/k;


# direct methods
.method constructor <init>(Lq5/k;JLjava/lang/Throwable;Ljava/lang/Thread;)V
    .locals 0

    iput-object p1, p0, Lq5/k$f;->q:Lq5/k;

    iput-wide p2, p0, Lq5/k$f;->n:J

    iput-object p4, p0, Lq5/k$f;->o:Ljava/lang/Throwable;

    iput-object p5, p0, Lq5/k$f;->p:Ljava/lang/Thread;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 8

    iget-object v0, p0, Lq5/k$f;->q:Lq5/k;

    invoke-virtual {v0}, Lq5/k;->J()Z

    move-result v0

    if-nez v0, :cond_1

    iget-wide v0, p0, Lq5/k$f;->n:J

    invoke-static {v0, v1}, Lq5/k;->b(J)J

    move-result-wide v6

    iget-object v0, p0, Lq5/k$f;->q:Lq5/k;

    invoke-static {v0}, Lq5/k;->c(Lq5/k;)Ljava/lang/String;

    move-result-object v5

    if-nez v5, :cond_0

    invoke-static {}, Ln5/f;->f()Ln5/f;

    move-result-object v0

    const-string v1, "Tried to write a non-fatal exception while no session was open."

    invoke-virtual {v0, v1}, Ln5/f;->k(Ljava/lang/String;)V

    return-void

    :cond_0
    iget-object v0, p0, Lq5/k$f;->q:Lq5/k;

    invoke-static {v0}, Lq5/k;->h(Lq5/k;)Lq5/e0;

    move-result-object v2

    iget-object v3, p0, Lq5/k$f;->o:Ljava/lang/Throwable;

    iget-object v4, p0, Lq5/k$f;->p:Ljava/lang/Thread;

    invoke-virtual/range {v2 .. v7}, Lq5/e0;->s(Ljava/lang/Throwable;Ljava/lang/Thread;Ljava/lang/String;J)V

    :cond_1
    return-void
.end method
