.class final Lcom/google/android/gms/internal/measurement/tb;
.super Lcom/google/android/gms/internal/measurement/rb;
.source ""


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/rb;-><init>()V

    return-void
.end method


# virtual methods
.method final synthetic a(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lcom/google/android/gms/internal/measurement/sb;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/sb;->a()I

    move-result p1

    return p1
.end method

.method final synthetic b(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lcom/google/android/gms/internal/measurement/sb;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/sb;->b()I

    move-result p1

    return p1
.end method

.method final bridge synthetic c(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Lcom/google/android/gms/internal/measurement/i9;

    iget-object v0, p1, Lcom/google/android/gms/internal/measurement/i9;->zzc:Lcom/google/android/gms/internal/measurement/sb;

    invoke-static {}, Lcom/google/android/gms/internal/measurement/sb;->c()Lcom/google/android/gms/internal/measurement/sb;

    move-result-object v1

    if-ne v0, v1, :cond_0

    invoke-static {}, Lcom/google/android/gms/internal/measurement/sb;->f()Lcom/google/android/gms/internal/measurement/sb;

    move-result-object v0

    iput-object v0, p1, Lcom/google/android/gms/internal/measurement/i9;->zzc:Lcom/google/android/gms/internal/measurement/sb;

    :cond_0
    return-object v0
.end method

.method final synthetic d(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/google/android/gms/internal/measurement/i9;

    iget-object p1, p1, Lcom/google/android/gms/internal/measurement/i9;->zzc:Lcom/google/android/gms/internal/measurement/sb;

    return-object p1
.end method

.method final bridge synthetic e(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/measurement/sb;->c()Lcom/google/android/gms/internal/measurement/sb;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/measurement/sb;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {}, Lcom/google/android/gms/internal/measurement/sb;->c()Lcom/google/android/gms/internal/measurement/sb;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/measurement/sb;->equals(Ljava/lang/Object;)Z

    move-result v0

    check-cast p2, Lcom/google/android/gms/internal/measurement/sb;

    if-eqz v0, :cond_1

    check-cast p1, Lcom/google/android/gms/internal/measurement/sb;

    invoke-static {p1, p2}, Lcom/google/android/gms/internal/measurement/sb;->e(Lcom/google/android/gms/internal/measurement/sb;Lcom/google/android/gms/internal/measurement/sb;)Lcom/google/android/gms/internal/measurement/sb;

    move-result-object p1

    goto :goto_0

    :cond_1
    move-object v0, p1

    check-cast v0, Lcom/google/android/gms/internal/measurement/sb;

    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/measurement/sb;->d(Lcom/google/android/gms/internal/measurement/sb;)Lcom/google/android/gms/internal/measurement/sb;

    :goto_0
    return-object p1
.end method

.method final bridge synthetic f(Ljava/lang/Object;IJ)V
    .locals 0

    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p3

    check-cast p1, Lcom/google/android/gms/internal/measurement/sb;

    shl-int/lit8 p2, p2, 0x3

    invoke-virtual {p1, p2, p3}, Lcom/google/android/gms/internal/measurement/sb;->j(ILjava/lang/Object;)V

    return-void
.end method

.method final g(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/internal/measurement/i9;

    iget-object p1, p1, Lcom/google/android/gms/internal/measurement/i9;->zzc:Lcom/google/android/gms/internal/measurement/sb;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/sb;->h()V

    return-void
.end method

.method final synthetic h(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/internal/measurement/i9;

    check-cast p2, Lcom/google/android/gms/internal/measurement/sb;

    iput-object p2, p1, Lcom/google/android/gms/internal/measurement/i9;->zzc:Lcom/google/android/gms/internal/measurement/sb;

    return-void
.end method

.method final synthetic i(Ljava/lang/Object;Lcom/google/android/gms/internal/measurement/kc;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/internal/measurement/sb;

    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/measurement/sb;->k(Lcom/google/android/gms/internal/measurement/kc;)V

    return-void
.end method
