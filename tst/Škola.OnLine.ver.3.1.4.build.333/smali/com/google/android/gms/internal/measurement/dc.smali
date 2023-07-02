.class public final Lcom/google/android/gms/internal/measurement/dc;
.super Lcom/google/android/gms/internal/measurement/j;
.source ""


# instance fields
.field private final p:Lcom/google/android/gms/internal/measurement/ed;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/ed;)V
    .locals 2

    const-string p1, "internal.remoteConfig"

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/measurement/j;-><init>(Ljava/lang/String;)V

    iput-object p2, p0, Lcom/google/android/gms/internal/measurement/dc;->p:Lcom/google/android/gms/internal/measurement/ed;

    iget-object p1, p0, Lcom/google/android/gms/internal/measurement/j;->o:Ljava/util/Map;

    new-instance v0, Lcom/google/android/gms/internal/measurement/cb;

    const-string v1, "getValue"

    invoke-direct {v0, p0, v1, p2}, Lcom/google/android/gms/internal/measurement/cb;-><init>(Lcom/google/android/gms/internal/measurement/dc;Ljava/lang/String;Lcom/google/android/gms/internal/measurement/ed;)V

    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/internal/measurement/z4;Ljava/util/List;)Lcom/google/android/gms/internal/measurement/q;
    .locals 0

    sget-object p1, Lcom/google/android/gms/internal/measurement/q;->c:Lcom/google/android/gms/internal/measurement/q;

    return-object p1
.end method
