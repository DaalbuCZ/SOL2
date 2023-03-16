.class public final Lcom/google/android/gms/internal/measurement/f3;
.super Lcom/google/android/gms/internal/measurement/f9;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/measurement/pa;


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/measurement/g3;->H()Lcom/google/android/gms/internal/measurement/g3;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/measurement/f9;-><init>(Lcom/google/android/gms/internal/measurement/i9;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/internal/measurement/e3;)V
    .locals 0

    invoke-static {}, Lcom/google/android/gms/internal/measurement/g3;->H()Lcom/google/android/gms/internal/measurement/g3;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/measurement/f9;-><init>(Lcom/google/android/gms/internal/measurement/i9;)V

    return-void
.end method


# virtual methods
.method public final A(ILcom/google/android/gms/internal/measurement/q3;)Lcom/google/android/gms/internal/measurement/f3;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/f9;->t()V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/f9;->o:Lcom/google/android/gms/internal/measurement/i9;

    check-cast v0, Lcom/google/android/gms/internal/measurement/g3;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/f9;->q()Lcom/google/android/gms/internal/measurement/i9;

    move-result-object p2

    check-cast p2, Lcom/google/android/gms/internal/measurement/r3;

    invoke-static {v0, p1, p2}, Lcom/google/android/gms/internal/measurement/g3;->M(Lcom/google/android/gms/internal/measurement/g3;ILcom/google/android/gms/internal/measurement/r3;)V

    return-object p0
.end method

.method public final C(I)Lcom/google/android/gms/internal/measurement/i3;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/f9;->o:Lcom/google/android/gms/internal/measurement/i9;

    check-cast v0, Lcom/google/android/gms/internal/measurement/g3;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/measurement/g3;->I(I)Lcom/google/android/gms/internal/measurement/i3;

    move-result-object p1

    return-object p1
.end method

.method public final D(I)Lcom/google/android/gms/internal/measurement/r3;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/f9;->o:Lcom/google/android/gms/internal/measurement/i9;

    check-cast v0, Lcom/google/android/gms/internal/measurement/g3;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/measurement/g3;->J(I)Lcom/google/android/gms/internal/measurement/r3;

    move-result-object p1

    return-object p1
.end method

.method public final w()I
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/f9;->o:Lcom/google/android/gms/internal/measurement/i9;

    check-cast v0, Lcom/google/android/gms/internal/measurement/g3;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/g3;->F()I

    move-result v0

    return v0
.end method

.method public final x()I
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/f9;->o:Lcom/google/android/gms/internal/measurement/i9;

    check-cast v0, Lcom/google/android/gms/internal/measurement/g3;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/g3;->G()I

    move-result v0

    return v0
.end method

.method public final z(ILcom/google/android/gms/internal/measurement/h3;)Lcom/google/android/gms/internal/measurement/f3;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/f9;->t()V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/f9;->o:Lcom/google/android/gms/internal/measurement/i9;

    check-cast v0, Lcom/google/android/gms/internal/measurement/g3;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/f9;->q()Lcom/google/android/gms/internal/measurement/i9;

    move-result-object p2

    check-cast p2, Lcom/google/android/gms/internal/measurement/i3;

    invoke-static {v0, p1, p2}, Lcom/google/android/gms/internal/measurement/g3;->N(Lcom/google/android/gms/internal/measurement/g3;ILcom/google/android/gms/internal/measurement/i3;)V

    return-object p0
.end method
