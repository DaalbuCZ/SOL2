.class final Lcom/google/android/gms/internal/measurement/s1;
.super Lcom/google/android/gms/internal/measurement/s2;
.source ""


# instance fields
.field final synthetic r:Ljava/lang/String;

.field final synthetic s:Ljava/lang/String;

.field final synthetic t:Lcom/google/android/gms/internal/measurement/b1;

.field final synthetic u:Lcom/google/android/gms/internal/measurement/d3;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/measurement/d3;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/measurement/b1;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/s1;->u:Lcom/google/android/gms/internal/measurement/d3;

    iput-object p2, p0, Lcom/google/android/gms/internal/measurement/s1;->r:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/internal/measurement/s1;->s:Ljava/lang/String;

    iput-object p4, p0, Lcom/google/android/gms/internal/measurement/s1;->t:Lcom/google/android/gms/internal/measurement/b1;

    const/4 p2, 0x1

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/measurement/s2;-><init>(Lcom/google/android/gms/internal/measurement/d3;Z)V

    return-void
.end method


# virtual methods
.method final a()V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/s1;->u:Lcom/google/android/gms/internal/measurement/d3;

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/d3;->w(Lcom/google/android/gms/internal/measurement/d3;)Lcom/google/android/gms/internal/measurement/f1;

    move-result-object v0

    invoke-static {v0}, Le4/o;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/f1;

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/s1;->r:Ljava/lang/String;

    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/s1;->s:Ljava/lang/String;

    iget-object v3, p0, Lcom/google/android/gms/internal/measurement/s1;->t:Lcom/google/android/gms/internal/measurement/b1;

    invoke-interface {v0, v1, v2, v3}, Lcom/google/android/gms/internal/measurement/f1;->getConditionalUserProperties(Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/measurement/i1;)V

    return-void
.end method

.method protected final b()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/s1;->t:Lcom/google/android/gms/internal/measurement/b1;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/measurement/b1;->S(Landroid/os/Bundle;)V

    return-void
.end method
