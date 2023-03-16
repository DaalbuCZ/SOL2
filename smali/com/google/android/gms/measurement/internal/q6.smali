.class final Lcom/google/android/gms/measurement/internal/q6;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic n:Lcom/google/android/gms/measurement/internal/o6;

.field final synthetic o:Lcom/google/android/gms/measurement/internal/o6;

.field final synthetic p:J

.field final synthetic q:Z

.field final synthetic r:Lcom/google/android/gms/measurement/internal/v6;


# direct methods
.method constructor <init>(Lcom/google/android/gms/measurement/internal/v6;Lcom/google/android/gms/measurement/internal/o6;Lcom/google/android/gms/measurement/internal/o6;JZ)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/q6;->r:Lcom/google/android/gms/measurement/internal/v6;

    iput-object p2, p0, Lcom/google/android/gms/measurement/internal/q6;->n:Lcom/google/android/gms/measurement/internal/o6;

    iput-object p3, p0, Lcom/google/android/gms/measurement/internal/q6;->o:Lcom/google/android/gms/measurement/internal/o6;

    iput-wide p4, p0, Lcom/google/android/gms/measurement/internal/q6;->p:J

    iput-boolean p6, p0, Lcom/google/android/gms/measurement/internal/q6;->q:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/q6;->r:Lcom/google/android/gms/measurement/internal/v6;

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/q6;->n:Lcom/google/android/gms/measurement/internal/o6;

    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/q6;->o:Lcom/google/android/gms/measurement/internal/o6;

    iget-wide v3, p0, Lcom/google/android/gms/measurement/internal/q6;->p:J

    iget-boolean v5, p0, Lcom/google/android/gms/measurement/internal/q6;->q:Z

    const/4 v6, 0x0

    invoke-static/range {v0 .. v6}, Lcom/google/android/gms/measurement/internal/v6;->v(Lcom/google/android/gms/measurement/internal/v6;Lcom/google/android/gms/measurement/internal/o6;Lcom/google/android/gms/measurement/internal/o6;JZLandroid/os/Bundle;)V

    return-void
.end method
