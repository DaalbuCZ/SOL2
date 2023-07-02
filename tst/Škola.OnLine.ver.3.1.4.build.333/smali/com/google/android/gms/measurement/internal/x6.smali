.class final Lcom/google/android/gms/measurement/internal/x6;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic n:Lcom/google/android/gms/measurement/internal/n9;

.field final synthetic o:Z

.field final synthetic p:Lcom/google/android/gms/measurement/internal/d9;

.field final synthetic q:Lcom/google/android/gms/measurement/internal/v7;


# direct methods
.method constructor <init>(Lcom/google/android/gms/measurement/internal/v7;Lcom/google/android/gms/measurement/internal/n9;ZLcom/google/android/gms/measurement/internal/d9;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/x6;->q:Lcom/google/android/gms/measurement/internal/v7;

    iput-object p2, p0, Lcom/google/android/gms/measurement/internal/x6;->n:Lcom/google/android/gms/measurement/internal/n9;

    iput-boolean p3, p0, Lcom/google/android/gms/measurement/internal/x6;->o:Z

    iput-object p4, p0, Lcom/google/android/gms/measurement/internal/x6;->p:Lcom/google/android/gms/measurement/internal/d9;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/x6;->q:Lcom/google/android/gms/measurement/internal/v7;

    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/v7;->H(Lcom/google/android/gms/measurement/internal/v7;)Lu4/f;

    move-result-object v1

    if-nez v1, :cond_0

    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/c5;->a:Lcom/google/android/gms/measurement/internal/j4;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/j4;->d()Lcom/google/android/gms/measurement/internal/f3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/f3;->r()Lcom/google/android/gms/measurement/internal/d3;

    move-result-object v0

    const-string v1, "Discarding data. Failed to set user property"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/d3;->a(Ljava/lang/String;)V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/x6;->n:Lcom/google/android/gms/measurement/internal/n9;

    invoke-static {v0}, Le4/o;->i(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/x6;->q:Lcom/google/android/gms/measurement/internal/v7;

    iget-boolean v2, p0, Lcom/google/android/gms/measurement/internal/x6;->o:Z

    if-eqz v2, :cond_1

    const/4 v2, 0x0

    goto :goto_0

    :cond_1
    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/x6;->p:Lcom/google/android/gms/measurement/internal/d9;

    :goto_0
    iget-object v3, p0, Lcom/google/android/gms/measurement/internal/x6;->n:Lcom/google/android/gms/measurement/internal/n9;

    invoke-virtual {v0, v1, v2, v3}, Lcom/google/android/gms/measurement/internal/v7;->r(Lu4/f;Lf4/a;Lcom/google/android/gms/measurement/internal/n9;)V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/x6;->q:Lcom/google/android/gms/measurement/internal/v7;

    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/v7;->N(Lcom/google/android/gms/measurement/internal/v7;)V

    return-void
.end method
