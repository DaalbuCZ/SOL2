.class public final Lcom/google/android/gms/internal/measurement/h3;
.super Lcom/google/android/gms/internal/measurement/f9;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/measurement/pa;


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/measurement/i3;->H()Lcom/google/android/gms/internal/measurement/i3;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/measurement/f9;-><init>(Lcom/google/android/gms/internal/measurement/i9;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/internal/measurement/e3;)V
    .locals 0

    invoke-static {}, Lcom/google/android/gms/internal/measurement/i3;->H()Lcom/google/android/gms/internal/measurement/i3;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/measurement/f9;-><init>(Lcom/google/android/gms/internal/measurement/i9;)V

    return-void
.end method


# virtual methods
.method public final A(ILcom/google/android/gms/internal/measurement/k3;)Lcom/google/android/gms/internal/measurement/h3;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/f9;->s()V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/f9;->o:Lcom/google/android/gms/internal/measurement/i9;

    check-cast v0, Lcom/google/android/gms/internal/measurement/i3;

    invoke-static {v0, p1, p2}, Lcom/google/android/gms/internal/measurement/i3;->N(Lcom/google/android/gms/internal/measurement/i3;ILcom/google/android/gms/internal/measurement/k3;)V

    return-object p0
.end method

.method public final B(I)Lcom/google/android/gms/internal/measurement/k3;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/f9;->o:Lcom/google/android/gms/internal/measurement/i9;

    check-cast v0, Lcom/google/android/gms/internal/measurement/i3;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/measurement/i3;->I(I)Lcom/google/android/gms/internal/measurement/k3;

    move-result-object p1

    return-object p1
.end method

.method public final C()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/f9;->o:Lcom/google/android/gms/internal/measurement/i9;

    check-cast v0, Lcom/google/android/gms/internal/measurement/i3;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/i3;->K()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final y()I
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/f9;->o:Lcom/google/android/gms/internal/measurement/i9;

    check-cast v0, Lcom/google/android/gms/internal/measurement/i3;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/i3;->E()I

    move-result v0

    return v0
.end method

.method public final z(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/h3;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/f9;->s()V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/f9;->o:Lcom/google/android/gms/internal/measurement/i9;

    check-cast v0, Lcom/google/android/gms/internal/measurement/i3;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/measurement/i3;->M(Lcom/google/android/gms/internal/measurement/i3;Ljava/lang/String;)V

    return-object p0
.end method
