.class final Lcom/google/android/gms/internal/measurement/y1;
.super Lcom/google/android/gms/internal/measurement/s2;
.source ""


# instance fields
.field final synthetic r:J

.field final synthetic s:Lcom/google/android/gms/internal/measurement/d3;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/measurement/d3;J)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/y1;->s:Lcom/google/android/gms/internal/measurement/d3;

    iput-wide p2, p0, Lcom/google/android/gms/internal/measurement/y1;->r:J

    const/4 p2, 0x1

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/measurement/s2;-><init>(Lcom/google/android/gms/internal/measurement/d3;Z)V

    return-void
.end method


# virtual methods
.method final a()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/y1;->s:Lcom/google/android/gms/internal/measurement/d3;

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/d3;->w(Lcom/google/android/gms/internal/measurement/d3;)Lcom/google/android/gms/internal/measurement/f1;

    move-result-object v0

    invoke-static {v0}, Le4/o;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/f1;

    iget-wide v1, p0, Lcom/google/android/gms/internal/measurement/y1;->r:J

    invoke-interface {v0, v1, v2}, Lcom/google/android/gms/internal/measurement/f1;->setSessionTimeoutDuration(J)V

    return-void
.end method
