.class final Lcom/google/android/gms/measurement/internal/u4;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic n:Lcom/google/android/gms/measurement/internal/v;

.field final synthetic o:Lcom/google/android/gms/measurement/internal/n9;

.field final synthetic p:Lcom/google/android/gms/measurement/internal/b5;


# direct methods
.method constructor <init>(Lcom/google/android/gms/measurement/internal/b5;Lcom/google/android/gms/measurement/internal/v;Lcom/google/android/gms/measurement/internal/n9;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/u4;->p:Lcom/google/android/gms/measurement/internal/b5;

    iput-object p2, p0, Lcom/google/android/gms/measurement/internal/u4;->n:Lcom/google/android/gms/measurement/internal/v;

    iput-object p3, p0, Lcom/google/android/gms/measurement/internal/u4;->o:Lcom/google/android/gms/measurement/internal/n9;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/u4;->p:Lcom/google/android/gms/measurement/internal/b5;

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/u4;->n:Lcom/google/android/gms/measurement/internal/v;

    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/u4;->o:Lcom/google/android/gms/measurement/internal/n9;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/measurement/internal/b5;->f(Lcom/google/android/gms/measurement/internal/v;Lcom/google/android/gms/measurement/internal/n9;)Lcom/google/android/gms/measurement/internal/v;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/u4;->p:Lcom/google/android/gms/measurement/internal/b5;

    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/u4;->o:Lcom/google/android/gms/measurement/internal/n9;

    invoke-virtual {v1, v0, v2}, Lcom/google/android/gms/measurement/internal/b5;->n0(Lcom/google/android/gms/measurement/internal/v;Lcom/google/android/gms/measurement/internal/n9;)V

    return-void
.end method
