.class final Lcom/google/android/gms/measurement/internal/n6;
.super Lcom/google/android/gms/measurement/internal/q8;
.source ""


# direct methods
.method public constructor <init>(Lcom/google/android/gms/measurement/internal/a9;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/measurement/internal/q8;-><init>(Lcom/google/android/gms/measurement/internal/a9;)V

    return-void
.end method

.method static final a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    new-instance p0, Ljava/lang/SecurityException;

    const-string p1, "This implementation should not be used."

    invoke-direct {p0, p1}, Ljava/lang/SecurityException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method protected final l()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method