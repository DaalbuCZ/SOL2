.class final Lcom/google/android/gms/measurement/internal/e6;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic n:Lp4/b;

.field final synthetic o:I

.field final synthetic p:J

.field final synthetic q:Z

.field final synthetic r:Lp4/b;

.field final synthetic s:Lcom/google/android/gms/measurement/internal/i6;


# direct methods
.method constructor <init>(Lcom/google/android/gms/measurement/internal/i6;Lp4/b;IJZLp4/b;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/e6;->s:Lcom/google/android/gms/measurement/internal/i6;

    iput-object p2, p0, Lcom/google/android/gms/measurement/internal/e6;->n:Lp4/b;

    iput p3, p0, Lcom/google/android/gms/measurement/internal/e6;->o:I

    iput-wide p4, p0, Lcom/google/android/gms/measurement/internal/e6;->p:J

    iput-boolean p6, p0, Lcom/google/android/gms/measurement/internal/e6;->q:Z

    iput-object p7, p0, Lcom/google/android/gms/measurement/internal/e6;->r:Lp4/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 9

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/e6;->s:Lcom/google/android/gms/measurement/internal/i6;

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/e6;->n:Lp4/b;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/i6;->J(Lp4/b;)V

    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/e6;->s:Lcom/google/android/gms/measurement/internal/i6;

    iget-object v3, p0, Lcom/google/android/gms/measurement/internal/e6;->n:Lp4/b;

    iget v4, p0, Lcom/google/android/gms/measurement/internal/e6;->o:I

    iget-wide v5, p0, Lcom/google/android/gms/measurement/internal/e6;->p:J

    iget-boolean v8, p0, Lcom/google/android/gms/measurement/internal/e6;->q:Z

    const/4 v7, 0x0

    invoke-static/range {v2 .. v8}, Lcom/google/android/gms/measurement/internal/i6;->c0(Lcom/google/android/gms/measurement/internal/i6;Lp4/b;IJZZ)V

    invoke-static {}, Lcom/google/android/gms/internal/measurement/je;->c()Z

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/e6;->s:Lcom/google/android/gms/measurement/internal/i6;

    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/c5;->a:Lcom/google/android/gms/measurement/internal/j4;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/j4;->z()Lcom/google/android/gms/measurement/internal/h;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/measurement/internal/u2;->o0:Lcom/google/android/gms/measurement/internal/t2;

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Lcom/google/android/gms/measurement/internal/h;->B(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/t2;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/e6;->s:Lcom/google/android/gms/measurement/internal/i6;

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/e6;->n:Lp4/b;

    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/e6;->r:Lp4/b;

    invoke-static {v0, v1, v2}, Lcom/google/android/gms/measurement/internal/i6;->b0(Lcom/google/android/gms/measurement/internal/i6;Lp4/b;Lp4/b;)V

    :cond_0
    return-void
.end method
