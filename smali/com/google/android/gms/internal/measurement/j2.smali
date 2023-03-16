.class final Lcom/google/android/gms/internal/measurement/j2;
.super Lcom/google/android/gms/internal/measurement/s2;
.source ""


# instance fields
.field final synthetic r:Ljava/lang/String;

.field final synthetic s:Ljava/lang/Object;

.field final synthetic t:Lcom/google/android/gms/internal/measurement/d3;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/measurement/d3;ZILjava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/j2;->t:Lcom/google/android/gms/internal/measurement/d3;

    iput-object p4, p0, Lcom/google/android/gms/internal/measurement/j2;->r:Ljava/lang/String;

    iput-object p5, p0, Lcom/google/android/gms/internal/measurement/j2;->s:Ljava/lang/Object;

    const/4 p2, 0x0

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/measurement/s2;-><init>(Lcom/google/android/gms/internal/measurement/d3;Z)V

    return-void
.end method


# virtual methods
.method final a()V
    .locals 7

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/j2;->t:Lcom/google/android/gms/internal/measurement/d3;

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/d3;->w(Lcom/google/android/gms/internal/measurement/d3;)Lcom/google/android/gms/internal/measurement/f1;

    move-result-object v0

    invoke-static {v0}, Lz3/o;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/google/android/gms/internal/measurement/f1;

    iget-object v3, p0, Lcom/google/android/gms/internal/measurement/j2;->r:Ljava/lang/String;

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/j2;->s:Ljava/lang/Object;

    invoke-static {v0}, Lg4/b;->m0(Ljava/lang/Object;)Lg4/a;

    move-result-object v4

    const/4 v0, 0x0

    invoke-static {v0}, Lg4/b;->m0(Ljava/lang/Object;)Lg4/a;

    move-result-object v5

    invoke-static {v0}, Lg4/b;->m0(Ljava/lang/Object;)Lg4/a;

    move-result-object v6

    const/4 v2, 0x5

    invoke-interface/range {v1 .. v6}, Lcom/google/android/gms/internal/measurement/f1;->logHealthData(ILjava/lang/String;Lg4/a;Lg4/a;Lg4/a;)V

    return-void
.end method
