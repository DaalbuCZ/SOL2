.class public abstract Lcom/google/android/gms/internal/measurement/i7;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/io/Serializable;


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static c()Lcom/google/android/gms/internal/measurement/i7;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/g7;->n:Lcom/google/android/gms/internal/measurement/g7;

    return-object v0
.end method

.method public static d(Ljava/lang/Object;)Lcom/google/android/gms/internal/measurement/i7;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/measurement/j7;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/measurement/j7;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method


# virtual methods
.method public abstract a()Ljava/lang/Object;
.end method

.method public abstract b()Z
.end method
