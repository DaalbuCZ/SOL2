.class public final Lcom/google/android/gms/internal/measurement/t4;
.super Lcom/google/android/gms/internal/measurement/f9;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/measurement/pa;


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/measurement/u4;->F()Lcom/google/android/gms/internal/measurement/u4;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/measurement/f9;-><init>(Lcom/google/android/gms/internal/measurement/i9;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/internal/measurement/j4;)V
    .locals 0

    invoke-static {}, Lcom/google/android/gms/internal/measurement/u4;->F()Lcom/google/android/gms/internal/measurement/u4;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/measurement/f9;-><init>(Lcom/google/android/gms/internal/measurement/i9;)V

    return-void
.end method


# virtual methods
.method public final y(J)Lcom/google/android/gms/internal/measurement/t4;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/f9;->s()V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/f9;->o:Lcom/google/android/gms/internal/measurement/i9;

    check-cast v0, Lcom/google/android/gms/internal/measurement/u4;

    invoke-static {v0, p1, p2}, Lcom/google/android/gms/internal/measurement/u4;->H(Lcom/google/android/gms/internal/measurement/u4;J)V

    return-object p0
.end method

.method public final z(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/t4;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/f9;->s()V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/f9;->o:Lcom/google/android/gms/internal/measurement/i9;

    check-cast v0, Lcom/google/android/gms/internal/measurement/u4;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/measurement/u4;->G(Lcom/google/android/gms/internal/measurement/u4;Ljava/lang/String;)V

    return-object p0
.end method
