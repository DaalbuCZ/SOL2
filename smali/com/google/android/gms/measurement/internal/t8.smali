.class final Lcom/google/android/gms/measurement/internal/t8;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/measurement/internal/h3;


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lcom/google/android/gms/measurement/internal/a9;


# direct methods
.method constructor <init>(Lcom/google/android/gms/measurement/internal/a9;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/t8;->b:Lcom/google/android/gms/measurement/internal/a9;

    iput-object p2, p0, Lcom/google/android/gms/measurement/internal/t8;->a:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;ILjava/lang/Throwable;[BLjava/util/Map;)V
    .locals 0

    iget-object p1, p0, Lcom/google/android/gms/measurement/internal/t8;->b:Lcom/google/android/gms/measurement/internal/a9;

    iget-object p5, p0, Lcom/google/android/gms/measurement/internal/t8;->a:Ljava/lang/String;

    invoke-virtual {p1, p2, p3, p4, p5}, Lcom/google/android/gms/measurement/internal/a9;->p(ILjava/lang/Throwable;[BLjava/lang/String;)V

    return-void
.end method
