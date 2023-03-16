.class public final synthetic Lcom/google/android/gms/internal/measurement/e6;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/measurement/k6;


# instance fields
.field public final synthetic a:Lcom/google/android/gms/internal/measurement/g6;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/measurement/g6;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/e6;->a:Lcom/google/android/gms/internal/measurement/g6;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/e6;->a:Lcom/google/android/gms/internal/measurement/g6;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/g6;->d()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method
